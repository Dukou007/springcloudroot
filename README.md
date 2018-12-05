用于springcloud组件的理解与应用。
文件中有SQL文件，自己导入到Navicat中即可运行。
微服务实例介绍及功能演示

(一)	微服务搭建环境：
1.	开发软件要求：

名称	版本	备注
JDK	1.8	以上
Spring Cloud	Finchley.RELEASE	以上
Spring boot	2.0.3.RELEASE	以上
Spring	Spring Framework 5.x	以上
Eclipse	2018-09 (4.9.0)	推荐
DB	自选	
		


2.	开发硬件要求：
建议开发时使用的台式机或笔记本电脑至少具有8GB以上内存，如有16GB内存更佳。


(二)	根据微服务架构特点，多方面功能演示：
1.	实现微服务架构总览：
 
2.	微服务应用程序包介绍：
程序包	包名称	端口	说明	作用
springcloud-root	父工程	无	实现服务分组管理（选择性使用）	便于管理子服务，并且可以提取公共引用部分
eureka-server	Eureka服务端	8761	Eureka服务注册中心	监控各服务状态
eureka-gateway	网关控制器	8766	使用Zuul网关组件进行控制	用户访问入口，结合路由策略和安全机制
eureka-client-a	客户端A	8762	具体的服务提供者	服务提供者，需注册到Eureka服务中心
eureka-client-b-1	客户端B	8763	具体的服务提供者	服务提供者，需注册到Eureka服务中心
eureka-client-b-2	客户端B（备份）	8764	具体的服务提供者	服务提供者，需注册到Eureka服务中心
				

3.	服务注册中心：
□启动服务注册中心:  【eureka-server】
	□浏览器访问地址：     http://localhost:8761/

出现以下界面，说明Eureka服务注册中心顺利启动
 

注意默认情况下，如果Eureka Server在一定时间内（默认90秒）没有接收到某个微服务实例的心跳，Eureka Server将会移除该实例。但是当网络分区故障发生时，微服务与Eureka Server之间无法正常通信，而微服务本身是正常运行的，此时不应该移除这个微服务，所以引入了自我保护机制（以红色字体方式提示）。

启动服务提供者【eureka-client-a】，以下为服务注册页面：
 

4.	网关服务：
□启动服务注册中心:  【eureka-gateway】
□浏览器访问地址：     http://localhost:8761/

出现以下界面，说明网关服务顺利启动
 

再访问以下地址，即由统一网关入口访问【CLIENT-A】服务：
http://localhost:8766/client-a/service/get
 
http://localhost:8766/client-a/service/list
 


5.	负载均衡：
□启动服务注册中心:  【eureka-client-b-1】【eureka-client-b-2】
□浏览器访问地址：     http://localhost:8761/
出现以下界面，说明服务顺利启动
 

多次访问以下地址：
http://localhost:8766/client-b/get/info
 
 
在浏览器访问页面刷新时，会切换服务提供者，实现负载均衡功能。


6.	多服务间通信：
□以上所有服务已启动，测试场景为【CLIENT-A】调用【CLIENT-B】服务
□浏览器访问地址：    http://localhost:8766/client-a/service/getOtherServices

 
 
便于理解，请参考以下示图：
 

服务之间调用采用Http方式访问，代码实现方式例：
 




附：各服务访问地址一览表
名称	访问地址
注册中心	http://localhost:8761/
          CLIENT-A	http://localhost:8762/service/get
          http://localhost:8762/service/list
          http://localhost:8762/service/listxml
          http://localhost:8762/service/getOtherServices
          CLIENT-B	http://localhost:8763/get/info
          http://localhost:8764/get/info
网关	http://localhost:8766/get/info
      http://localhost:8766/client-a/service/get
      http://localhost:8766/client-a/service/list
      http://localhost:8766/client-a/service/getOtherServices
      http://localhost:8766/client-b/get/info
	


案例源码Git下载地址：http://10.30.30.132/springcloud-root/sourcecode.git

MYSQL数据库执行脚本：   在文件夹中

