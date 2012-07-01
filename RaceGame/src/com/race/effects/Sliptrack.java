package com.race.effects;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Sliptrack {
	Image image;
	boolean remove = false;
	float rotation;
	int timer;
	float x;
	float y;

	Sliptrack(float x, float y, float rotation, float scale) {
		try {
			image = new Image("/data/sliptrack.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
		this.x = x;
		this.y = y;
		this.rotation = rotation;
	}

	void update(float deltaT) {

		image.rotate(rotation - image.getRotation());
		if (timer > 800) {
			remove = true;
		}
		timer++;
	}

	public boolean isRemove() {
		return remove;
	}

	public float getRotation() {
		return rotation;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public void draw(Graphics g) {
		g.drawImage(image, x, y);
	}
}
