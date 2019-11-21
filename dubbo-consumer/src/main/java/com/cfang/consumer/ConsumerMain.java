package com.cfang.consumer;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cfang.api.DemoService;

public class ConsumerMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-consumer.xml");
		context.start();
		System.out.println("dubbo consumer started");
		DemoService service = context.getBean(DemoService.class);
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String line = scanner.nextLine();
			if("exit".equals(line)) {
				break;
			}else {
				System.out.println(service.sayHello(line));
			}
		}
		
	}
}
