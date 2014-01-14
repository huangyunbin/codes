package com.hyb.util.jmsHtml;

import java.util.concurrent.TimeUnit;

/**
 * @author bean
 * @date 2014-1-13
 */
public class HelloWorld implements HelloWorldMBean {

	private String greeting = null;

	public HelloWorld() {
		this.greeting = "Hello World! I am a Standard MBean";
	}

	public HelloWorld(String greeting) {
		this.greeting = greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getGreeting() {
		return greeting;
	}
	
	public void go() {
		while (true) {
			greeting=System.currentTimeMillis()+"";
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	public void printGreeting() {
		System.out.println(greeting);
	}
}
