package com.dan.learnspringframework.game;

public class Pacman implements GamingConsole {
	public void up() {
		System.out.println("PacmanUp...");
	}

	public void down() {
		System.out.println("Pacman Sit Down...");
	}

	public void left() {
		System.out.println("Pacman Slow Down...");
	}

	public void right() {
		System.out.println("Pacman Boost...");
	}
}