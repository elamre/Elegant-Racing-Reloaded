package com.race.entity;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class BlueCar extends Car {
	protected BlueCar(int x, int y) {
		super(x, y, 100, 0.01f, 1, 0.5f);
		try {
			image = new Image("/data/plane.png");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void draw(Graphics g) {
		image.draw(x, y, scale);
	}

	public void update(float deltaT) {
		image.rotate(rotation - image.getRotation());
	}

}
