package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.example.demo.bean.DemoBean;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	DemoBean demoBean;
	
//	@Autowired
//	ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		demoBean.helloWorld();
	//	ctx.getBean("demoBean",DemoBean.class);
		
	}

}
