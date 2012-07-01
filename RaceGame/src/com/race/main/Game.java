package com.race.main;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

import com.race.effects.SliptrackHandler;
import com.race.entity.Player;
import com.race.system.Camera;

public class Game extends BasicGame {
	Player player;
	private TiledMap map;

	public Game() {
		// Title
		super("Airplanes");
	}

	/**
	 * All the images sould be loaded in this function.
	 */
	public void init(GameContainer container) throws SlickException {
		player = new Player();
		map = new TiledMap("data/track1.tmx");
	}

	/**
	 * Everything should be rendered in here.
	 */
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		Camera.getCamera().setFocus(g);
		map.render(0, 0);
		SliptrackHandler.getSliptrackHandler().draw(g);
		player.draw(g);
		Camera.getCamera().releaseFocus(g);
	}

	/**
	 * Updates everything, all entities and the buttonhandler.
	 */
	public void update(GameContainer gc, int deltaT) throws SlickException {
		player.update(deltaT);
		SliptrackHandler.getSliptrackHandler().update(deltaT);
		ButtonHandler.getButtonHandler().update(gc);
	}

}
