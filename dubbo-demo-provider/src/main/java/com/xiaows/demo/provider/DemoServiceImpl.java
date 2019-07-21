package com.xiaows.demo.provider;

import com.xiaows.demo.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

@Slf4j
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		log.info("Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
		return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
	}

}
