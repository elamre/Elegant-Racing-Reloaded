package com.race.main;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import com.race.entity.Player;

public class Game extends BasicGame {
	Player player;

	public Game() {
		super("Airplanes");
	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		player.draw(g);
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		player = new Player();
	}

	@Override
	public void update(GameContainer gc, int deltaT) throws SlickException {
		player.update(deltaT);
		ButtonHandler.getButtonHandler().update(gc);
	}

}
