package com.BONC.test;

public class App {
	public static void main(String[] args) {
		bossGoSomewhere();
	}
	
	static void bossGoSomewhere() {
		TestSpringIoC boss = new TestSpringIoC();
		boss.goSomewhere();
	}
}
