## 运行系统
* 导入到Idea，菜单 File -> open，然后选择项目，重载父模块pom文件
* 创建数据库ry并导入数据脚本ry.sql，修改配置文件中的数据库连接为本地
* 打开项目运行ruoyi-admin模块下com.ruoyi.RuoYiApplication.java
* 出现  (♥◠‿◠)ﾉﾞ  若依启动成功   ლ(´ڡ`ლ)ﾞ 表示启动成功。


### 系统需求

* JDK >= 1.8
* MySQL >= 8.0
* Maven >= 3.0

### 系统环境

* Java EE 8
* Servlet 3.0
* Apache Maven 3
### 主框架

* Spring Boot 2.2.x
* Spring Framework 5.2.x
* Apache Shiro 1.7
### 持久层

* Apache MyBatis 3.5.x
* Alibaba Druid 1.2.x
### 视图层

* Bootstrap 3.3.7
* Thymeleaf 3.0.x

### 简介

* 配置文件：ruoyi-admin模块下 resources文件下application.yml
* controller层：ruoyi-admin模块下 com.ruoyi.web.controller.SerllerController
* ruoyi-common子模块：通用工具模块，包括全局配置、自定义注解、核心控制、通用类处理等
* ruoyi-framework子模块：框架核心，包括系统配置、注解实现、拦截器、异步处理等
* ruoui-system子模块：实体类、封装类、service接口、service实现类、mapper接口，xml文件

