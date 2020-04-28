# SpringCloud-rpc

第一天SpringCloud
	简单的rpc调用
	浏览器打开  http://localhost:8081/ConBook
	浏览器打开  http://localhost:8080/ProBook
	两次结果相同 证明SpringCloud架构的rpc调用成功




20200427-springcloud-rpc1
	包括：20200427-springcloud-rpc1-consumer（消费者）
		定义bean  
		web中注入springCloud提供的RestTemplate
	          20200427-springcloud-rpc1-management（管理）
		20200427-springcloud-rpc1-management-mapper（mapper）
		20200427-springcloud-rpc1-management-model（model）
		20200427-springcloud-rpc1-management-service（service）
	          20200427-springcloud-rpc1-provider（提供者）	