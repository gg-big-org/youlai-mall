package com.youlai.admin.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.youlai.admin.pojo.entity.SysRole;
import com.youlai.admin.pojo.form.RoleForm;
import com.youlai.admin.pojo.query.RolePageQuery;
import com.youlai.admin.pojo.vo.role.RolePageVO;
import com.youlai.common.web.domain.Option;

import java.util.List;

/**
 * 角色业务接口层
 *
 * @author haoxr
 * @date 2022/6/3
 */
public interface SysRoleService extends IService<SysRole> {

    /**
     * 角色分页列表
     *
     * @param queryParams
     * @return
     */
    Page<RolePageVO> listPageRoles(RolePageQuery queryParams);



    /**
     * 角色下拉列表
     *
     * @return
     */
    List<Option> listSelectRoles();

    /**
     *
     * @param roleForm
     * @return
     */
    boolean saveRole(RoleForm roleForm);

    /**
     * 修改角色状态
     *
     * @param roleId
     * @param status
     * @return
     */
    boolean updateRoleStatus(Long roleId, Integer status);

    /**
     * 批量删除角色
     *
     * @param ids
     * @return
     */
    boolean deleteRoles(String ids);


    /**
     * 获取角色的资源ID集合,资源包括菜单(m_id)和权限(p_id)
     *
     * @param roleId
     * @return
     */
    List<String> listRoleResourceIds(Long roleId);
}
