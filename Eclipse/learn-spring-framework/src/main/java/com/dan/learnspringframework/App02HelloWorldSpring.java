package com.dan.learnspringframework;

import com.dan.learnspringframework.game.GameRunner;
import com.dan.learnspringframework.game.MarioGame;
import com.dan.learnspringframework.game.Pacman;
import com.dan.learnspringframework.game.SuperContra;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
//		var game = new SuperContra();
		var game = new MarioGame();
//		var game = new Pacman();
		GameRunner gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
