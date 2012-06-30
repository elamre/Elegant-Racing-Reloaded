package com.race.main;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import com.race.entity.Player;
import com.race.system.Camera;

public class Game extends BasicGame {
	Player player;
	Image background;

	public Game() {
		// Title
		super("Airplanes");
	}

	/**
	 * All the images sould be loaded in this function.
	 */
	public void init(GameContainer container) throws SlickException {
		player = new Player();
		background = new Image("/data/land.jpeg");
	}

	/**
	 * Everything should be rendered in here.
	 */
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		Camera.getCamera().setFocus(g);
		background.draw(0, 0);
		player.draw(g);
		Camera.getCamera().releaseFocus(g);
	}

	/**
	 * Updates everything, all entities and the buttonhandler.
	 */
	public void update(GameContainer gc, int deltaT) throws SlickException {
		player.update(deltaT);
		ButtonHandler.getButtonHandler().update(gc);
	}

}
