package com.race.main;

import org.newdawn.slick.GameContainer;

import com.race.data.Configuration;

public class ButtonHandler {
	private static ButtonHandler handler = null;
	private boolean forward = false;
	private boolean backward = false;
	private boolean left = false;
	private boolean right = false;
	private boolean stop = false;

	public void update(GameContainer gc) {
		forward = false;
		backward = false;
		left = false;
		stop = false;
		right = false;
		if (gc.getInput().isKeyDown(Configuration.FORWARD)) {
			forward = true;
		}
		if (gc.getInput().isKeyDown(Configuration.BACKWARDS)) {
			backward = true;
		}
		if (gc.getInput().isKeyDown(Configuration.LEFT)) {
			left = true;
		}
		if (gc.getInput().isKeyDown(Configuration.RIGHT)) {
			right = true;
		}
		if (gc.getInput().isKeyDown(Configuration.BREAK)) {
			stop = true;
		}
	}

	public boolean getForward() {
		return forward;
	}

	public boolean getBackward() {
		return backward;
	}

	public boolean getLeft() {
		return left;
	}

	public boolean getRight() {
		return right;
	}

	public static ButtonHandler getButtonHandler() {
		if (handler == null) {
			handler = new ButtonHandler();
		}
		return handler;
	}

	public boolean getStop() {
		return stop;
	}
}
