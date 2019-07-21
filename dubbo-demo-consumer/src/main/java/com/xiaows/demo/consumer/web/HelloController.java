package com.xiaows.demo.consumer.web;

import com.xiaows.demo.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * des:
 *
 * @author: XIAO_WS
 * @email: xiaows08@163.com
 * @create: 2019-07-21 13:26
 * @version: v1.0
 */
@RestController
public class HelloController {

	// @Autowired
	// @Reference

	@Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
	private DemoService demoService;

	@GetMapping("/hello")
	public String hello(String name) {
		return demoService.sayHello(name);
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
