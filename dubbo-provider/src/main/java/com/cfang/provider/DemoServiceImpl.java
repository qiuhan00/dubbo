package com.cfang.provider;

import com.cfang.api.DemoService;

public class DemoServiceImpl implements DemoService{
	
	private String startMode;

	public String sayHello(String name) {
		return startMode + ",hello, " + name;
	}

	public String sayWorld(String name) {
		return "world, " + name;
	}

	public String getStartMode() {
		return startMode;
	}

	public void setStartMode(String startMode) {
		this.startMode = startMode;
	}

}
