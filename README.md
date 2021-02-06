![](https://img.shields.io/badge/youlai--mall-1.0-blue)
[![](https://img.shields.io/github/stars/hxrui/youlai-mall.svg?style=social&label=Stars)](https://github.com/hxrui/youlai-mall/stargazers)
[![](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg)](https://github.com/hxrui/youlai-mall/blob/master/LICENSE)
![](https://img.shields.io/badge/SpringBoot-2.4.2-brightgreen.svg)
![](https://img.shields.io/badge/SpringCloud-2020-green.svg)
![](https://img.shields.io/badge/vue--element--admin-v4.4.0-orange)


## 项目介绍

`youlai-mall` 是基于Spring Boot 2.4、Spring Cloud 2020 & Alibaba、Vue、element-ui、uni-app快速构建的一套**全栈**开源商城平台，包括微服务应用、管理平台、微信小程序及APP应用

## 项目特色

- 项目使用都是最新主流的**开源**框架，无过渡的自定义封装逻辑，易理解上手和方便扩展

- 基于Spring Boot 2.4、Spring Cloud 2020 & Alibaba 一站式微服务解决方案快速开发分布式服务

- 实现Spring Cloud OAuth2、Spring Cloud Gateway、JWT分布式统一认证鉴权和`RBAC` 权限系统设计

- 使用vue-element-admin的后台前端解决方案，基于Vue和element-ui快速搭建**前后端分离**的商城管理平台

- 通过`uni-app`使用Vue开发实现跨所有前端的应用，包含微信小程序、APP应用

- 使用Docker快速构建项目环境和一键打包部署微服务项目

## **项目愿景**

项目从`0`到`1`的构建过程完整无保留的通过一篇篇博客文章进行公开说明，开源供大家交流学习不图任何利益。

项目慢慢成型的路上离不开支持还有默默点star的那些小伙伴，谢谢了~ 

## **项目地址**

### 1. 体验 
**商城管理平台访问地址:** [http://www.youlai.store](https://www.youlai.store/)
 
【有来小店】微信小程序体验码，扫描后申请体验即可，有问题加我微信：`haoxianrui`

![](https://raw.githubusercontent.com/hxrui/image/main/image/initpintu.jpg)

### 2. 源码
 项目名称 | Github | 码云
 ---|---|---
 微服务后台 |[youlai-mall](https://github.com/hxrui/youlai-mall) |[youlai-mall](https://gitee.com/youlaitech/youlai-mall) 
 管理前端 |  [youlai-mall-admin](https://github.com/hxrui/youlai-mall-admin)| [youlai-mall-admin](https://gitee.com/youlaitech/youlai-mall-admin)
 微信小程序 | [youlai-mall-weapp](https://github.com/hxrui/youlai-mall-weapp)| [youlai-mall-weapp](https://gitee.com/youlaitech/youlai-mall-weapp) 
 App应用 | [youlai-mall-app](https://github.com/hxrui/youlai-mall-app)| [youlai-mall-app](https://gitee.com/youlaitech/youlai-mall-app) 


 

## **项目预览**

### 1. 商城管理平台


### 2. 有来小店微信小程序

 
 
 
 
 
### 管理后台

![](https://i.loli.net/2021/01/02/7t9TlgCHSnam64E.png)

![](https://i.loli.net/2021/01/02/aUnWZp5o29lPJQb.png)

![](https://i.loli.net/2020/12/27/iLw3jEgVGQSf61F.png)


### 微信小程序

![](https://i.loli.net/2021/01/02/OugrUpPVl9d5w14.png)

![](https://i.loli.net/2021/01/02/vdeaIS78yRHUkBm.png)

![](https://i.loli.net/2021/01/02/QDU9okJbvuVrxwc.png)




## **项目结构**

``` lua
youlai-mall
├── document
    ├── DEFAULT_GROUP.zip -- Nacos配置包
    ├── youlai.sql      -- 数据库初始化脚本
    ├── youlai-mall.sql -- 数据库初始化脚本
├── mall-oms
    ├── oms-api -- 订单微服务的远程调用客户端
    ├── oms-biz -- 订单微服务
├── mall-pms
    ├── pms-api -- 商品微服务的远程调用客户端
    ├── pms-biz -- 商品微服务
    ├── pms-search -- 商品搜索微服务
├── mall-sms
    ├── sms-api -- 营销微服务的远程调用客户端
    ├── sms-biz -- 营销微服务
├── mall-ums
    ├── ums-api -- 会员微服务的远程调用客户端
    ├── ums-biz -- 会员微服务
├── youlai-admin 
    ├── admin-api -- 后台管理微服务的远程调用客户端
    ├── admin-biz -- 后台管理微服务
├── youlai-auth     -- 认证中心
├── youlai-common   -- 公共模块
└── youlai-gateway  -- Spring Cloud Gateway网关
└── youlai-registry -- Nacos注册中心 
```

## **技术栈**

| 后端技术 |  版本号                     
| -------------------- |  -------------------- |                             
| SpringBoot|2.4.2                    
| SpringCloud|2020.0.0
| SpringCloud Alibaba|  2.2.4.RELEASE
| Spring Security OAuth2| 2.2.4.RELEASE
| MyBatis Plus|3.4.0
| Druid| 1.1.23
| Lombok |1.18.12
| Knife4j | 2.0.4


| 管理前端技术 |  版本号
| -------------------- |  -------------------- |  
| Vue        | 2.6.10
| Element-UI | 2.13.2

| 微信小程序技术 |  版本号
| -------------------- |  -------------------- |  
| Vue| 2.6.10
| uni-app | 2.8.11

## **快速启动**

### 1. 启动后端微服务

1. 拉取并导入 [youlai-mall](https://github.com/hxrui/youlai-mall) 。
2. 启动nacos服务，进入Terminal命令终端切到youlai-registry/nacos/bin目录，执行命令 startup -m standalone。
3. 启动youlai-gateway、youlai-auth,youlai-admin项目基础服务。

备注：如果本地搭建请安装Redis、MySQL8、Nacos、MinIO环境，再修改对应的Nacos相关配置信息即可。线上生产部署请参考部署篇的文章。

重要说明：因为会有人无视公告修改公有环境配置，所以大家启动在使用公共环境会报错，作为开发者的我们心也累。
所以大家在启动报错的时候，麻烦在Nacos启动后在控制台删除原有配置重新导入项目下的document/DEFAULT_GROUP.zip配置尝试重新启动项目。

重要提示： 求大家别在云环境修改数据库和相关配置！自己这套环境开放出来供大家学习本来就冒着很大风险，精力也有限，望大家理解，谢谢了。

### 2. 启动管理前端

1. 本机安装Python和Node.js
1. 拉取并导入 [youlai-mall-admin](https://github.com/hxrui/youlai-mall-admin.git)
2. npm install  
3. npm run dev  
4. 浏览器打开 http://localhost:9527

### 3. 启动微信小程序

请参考 [vue+uniapp商城实战 | 第一篇：【有来小店】微信小程序快速开发接入Spring Cloud OAuth2认证中心完成授权登录](https://www.cnblogs.com/haoxianrui/p/13882310.html)

## 项目文档

> 微服务

1. [Spring Cloud实战 | 第一篇：Windows搭建Nacos服务 ](https://www.cnblogs.com/haoxianrui/p/13581881.html)
2. [Spring Cloud实战 | 第二篇：Spring Cloud整合Nacos实现注册中心](https://www.cnblogs.com/haoxianrui/p/13584204.html)
3. [Spring Cloud实战 | 第三篇：Spring Cloud整合Nacos实现配置中心](https://www.cnblogs.com/haoxianrui/p/13585125.html)
4. [Spring Cloud实战 | 第四篇：Spring Cloud整合Gateway实现API网关](https://www.cnblogs.com/haoxianrui/p/13608650.html)
5. [Spring Cloud实战 | 第五篇：Spring Cloud整合OpenFeign实现微服务之间的调用](https://www.cnblogs.com/haoxianrui/p/13615592.html)
6. [Spring Cloud实战 | 第六篇：Spring Cloud Gateway+Spring Security OAuth2+JWT实现微服务统一认证授权](https://www.cnblogs.com/haoxianrui/p/13719356.html)
7. [Spring Cloud实战 | 最七篇：Spring Cloud Gateway+Spring Security OAuth2集成统一认证授权平台下实现注销使JWT失效方案](https://www.cnblogs.com/haoxianrui/p/13740264.html)
8. [Spring Cloud实战 | 最八篇：Spring Cloud +Spring Security OAuth2+ Vue前后端分离模式下无感知刷新实现JWT续期](https://www.cnblogs.com/haoxianrui/p/14022632.html)
9. [Spring Cloud实战 | 最九篇：Spring Security OAuth2认证服务器统一认证自定义异常处理](https://www.cnblogs.com/haoxianrui/p/14022632.html)
10. [Spring Cloud实战 | 第十篇 ：Spring Cloud + Nacos整合Seata 1.4.1最新版本实现微服务架构中的分布式事务，进阶之路必须要迈过的槛](https://www.cnblogs.com/haoxianrui/p/14280184.html)

> 管理前端

1. [vue-element-admin实战 | 第一篇： 移除mock接入后台，搭建有来商城youlai-mall前后端分离管理平台](https://www.cnblogs.com/haoxianrui/p/13624548.html)
2. [vue-element-admin实战 | 第二篇： 最小改动接入后台实现根据权限动态加载菜单](https://www.cnblogs.com/haoxianrui/p/13676619.html)

> 微信小程序

1. [vue+uniapp商城实战 | 第一篇：【有来小店】微信小程序快速开发接入Spring Cloud OAuth2认证中心完成授权登录](https://www.cnblogs.com/haoxianrui/p/13882310.html)

> 部署篇

1. [Docker实战 | 第一篇：Linux 安装 Docker](https://www.cnblogs.com/haoxianrui/p/14067423.html)
2. [Docker实战 | 第二篇：Docker部署nacos-server:1.4.0](https://www.cnblogs.com/haoxianrui/p/14059009.html)
3. [Docker实战 | 第三篇：IDEA集成Docker插件实现一键自动打包部署微服务项目，一劳永逸的技术手段值得一试](https://www.cnblogs.com/haoxianrui/p/14088400.html)
4. [Docker实战 | 第四篇：Docker安装Nginx，实现基于vue-element-admin框架构建的项目线上部署](https://www.cnblogs.com/haoxianrui/p/14091762.html)
5. [Docker实战 | 第五篇：Docker启用TLS加密解决暴露2375端口引发的安全漏洞，被黑掉三台云主机的教训总结](https://www.cnblogs.com/haoxianrui/p/14095306.html)

## 问题

- 如果github拉取失败请移步至码云[https://gitee.com/haoxr](https://gitee.com/youlaiteam),代码是同步的。

- 项目在搭建的过程中如您遇到任何问题，可以联系我（微信号：haoxianrui），如果不能及时回复也可以在github提issue。

- 演示环境禁止修改、删除重要数据，请本地部署后测试




