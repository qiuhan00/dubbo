package com.cfang.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderMain {

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-provider.xml");
			context.start();
			System.out.println("dubbo provier started...");
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
