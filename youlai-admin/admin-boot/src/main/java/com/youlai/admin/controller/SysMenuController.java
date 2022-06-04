package com.youlai.admin.controller;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.youlai.admin.pojo.entity.SysMenu;
import com.youlai.admin.pojo.vo.menu.MenuOptionVO;
import com.youlai.admin.pojo.vo.menu.TableMenuVO;
import com.youlai.admin.pojo.vo.menu.RouteVO;
import com.youlai.admin.service.SysMenuService;
import com.youlai.admin.service.SysPermissionService;
import com.youlai.common.result.Result;
import com.youlai.common.web.domain.Option;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * 菜单控制器
 *
 * @author haoxr
 * @date 2020/11/06
 */
@Api(tags = "菜单接口")
@RestController
@RequestMapping("/api/v1/menus")
@RequiredArgsConstructor
@Slf4j
public class SysMenuController {

    private final SysMenuService menuService;
    private final SysPermissionService permissionService;

    @ApiOperation(value = "资源树形列表")
    @GetMapping("/resource_list")
    public Result<List<MenuOptionVO>> listResources( ) {
        List<MenuOptionVO> resources = menuService.listResources();
        return Result.success(resources);
    }

    @ApiOperation(value = "菜单表格树形列表")
    @GetMapping("/table")
    public Result listTableMenus(
            @ApiParam(value = "菜单名称", type = "query") String name
    ) {
        List<TableMenuVO> menuList = menuService.listTableMenus(name);
        return Result.success(menuList);
    }

    @ApiOperation(value = "菜单下拉树列表")
    @GetMapping("/select")
    public Result listSelectMenus() {
        List<Option> menus = menuService.listMenus();
        return Result.success(menus);
    }

    @ApiOperation(value = "菜单路由列表")
    @GetMapping("/route")
    public Result getRouteList() {
        List<RouteVO> routeList = menuService.listRoutes();
        return Result.success(routeList);
    }

    @ApiOperation(value = "菜单详情")
    @GetMapping("/{id}")
    public Result detail(
            @ApiParam(value = "菜单ID") @PathVariable Long id
    ) {
        SysMenu menu = menuService.getById(id);
        return Result.success(menu);
    }

    @ApiOperation(value = "新增菜单")
    @PostMapping
    @CacheEvict(cacheNames = "system", key = "'routes'")
    public Result addMenu(@RequestBody SysMenu menu) {
        boolean result = menuService.saveMenu(menu);
        return Result.judge(result);
    }

    @ApiOperation(value = "修改菜单")
    @PutMapping(value = "/{id}")
    @CacheEvict(cacheNames = "system", key = "'routes'")
    public Result updateMenu(
            @RequestBody SysMenu menu
    ) {
        boolean result = menuService.saveMenu(menu);
        return Result.judge(result);
    }

    @ApiOperation(value = "删除菜单")
    @DeleteMapping("/{ids}")
    @CacheEvict(cacheNames = "system", key = "'routes'")
    public Result delete(
            @ApiParam("菜单ID，多个以英文(,)分割") @PathVariable("ids") String ids) {
        boolean result = menuService.removeByIds(Arrays.asList(ids.split(",")));
        if (result) {
            permissionService.refreshPermRolesRules();
        }
        return Result.judge(result);
    }

    @ApiOperation(value = "选择性修改菜单")
    @PatchMapping(value = "/{id}")
    @CacheEvict(cacheNames = "system", key = "'routes'")
    public Result patch(@PathVariable Integer id, @RequestBody SysMenu menu) {
        LambdaUpdateWrapper<SysMenu> updateWrapper = new LambdaUpdateWrapper<SysMenu>().eq(SysMenu::getId, id);
        updateWrapper.set(menu.getVisible() != null, SysMenu::getVisible, menu.getVisible());
        boolean result = menuService.update(updateWrapper);
        if (result) {
            permissionService.refreshPermRolesRules();
        }
        return Result.judge(result);
    }
}
