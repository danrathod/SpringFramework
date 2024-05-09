package com.dan.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dan.learnspringframework.game.GameRunner;
import com.dan.learnspringframework.game.GamingConsole;
import com.dan.learnspringframework.game.MarioGame;

public class App03GamingBasicJava {

	public static void main(String[] args) {
		/*
		 * var game = new MarioGame(); 
		 * GameRunner gameRunner = new GameRunner(game);
		 * gameRunner.run();
		 */
		
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
	}

}
