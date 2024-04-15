package com.dan.learnspringframework.game;

public class MarioGame implements GamingConsole {

	public void up() {
		System.out.println("Jump...");
	}

	public void down() {
		System.out.println("Down...");
	}

	public void left() {
		System.out.println("Come back...");
	}

	public void right() {
		System.out.println("Accelerate...");
	}

}
