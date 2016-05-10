package com.BONC.test;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
public class App {
	public static void main(String[] args) {
		bossGoSomewhere();
	}
	
	static void bossGoSomewhere() {
		//TestSpringIoC boss = new TestSpringIoC();
		//boss.goSomewhere();
		SmartBoss boss = new SmartBoss();
		boss.goSomewhere();
	}
}
