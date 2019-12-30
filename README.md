## nacos 示例项目

### nacos server搭建
[Nacos官方中文文档](https://nacos.io/zh-cn/docs/what-is-nacos.html)

[官网代码示例项目地址](https://github.com/nacos-group/nacos-examples)
- 1.centos7 系统
- 2.java
   - rpm安装(推荐):
   免去环境变量配置.默认环境变量搜索是会包括/usr/bin ,rpm方式安装完成,java,javac等基本命令的软连接都是
   增加到/usr/bin
   - tar xxx.gz 解压缩后配置环境变量方式,需要注意java的执行权限.
   并且如果使用[自启服务脚本,即/lib/systemd/system/下创建的xxx.service]
   ,由于脚本与profile加载时机没有先后顺序,服务启动时会找不到java,所以需要在中设置好JAVA_HOME路径
   
 ### 示例项目结构说明
 <pre>
 ├─consumer 订阅者
 │  ├─src
 │  │  ├─main
 │  │  │  ├─java
 │  │  │  │  └─com
 │  │  │  │      └─learn
 │  │  │  │          └─nacos
 │  │  │  │              └─consumer
 │  │  │  └─resources
 └─product 发布者
     ├─src
     │  ├─main
     │  │  ├─java
     │  │  │  └─com
     │  │  │      └─learn
     │  │  │          └─nacos
     │  │  │              └─product
     │  │  └─resources
 </pre>