package com.dan.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dan.learnspringframework.game.GameRunner;
import com.dan.learnspringframework.game.GamingConsole;
import com.dan.learnspringframework.game.Pacman;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		return new Pacman();
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
}
