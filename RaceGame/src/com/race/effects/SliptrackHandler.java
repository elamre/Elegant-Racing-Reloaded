package com.race.effects;

import java.util.ArrayList;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import com.race.entity.Car;

public class SliptrackHandler {
	private ArrayList<Sliptrack> tracks = new ArrayList<Sliptrack>();
	private static SliptrackHandler SH;
	int timer = 0;
	boolean canAdd = false;
	Image image;

	SliptrackHandler() {

	}

	public static SliptrackHandler getSliptrackHandler() {
		if (SH == null) {
			SH = new SliptrackHandler();
		}
		return SH;
	}

	public void addTrack(Car car) {
		if (canAdd) {
			float xPosition = (float) (car.getX() + java.lang.Math
					.sin(java.lang.Math.toRadians(car.getRotation())));
			float yPosition = (float) (car.getImage().getHeight() + car.getY() + java.lang.Math
					.cos(java.lang.Math.toRadians(car.getRotation())));
			tracks.add(new Sliptrack(xPosition, yPosition, car.getRotation(), 0));
			canAdd = false;
			timer = 0;
		}
	}

	public void update(float deltaT) {
		if (timer > 5) {
			canAdd = true;
		}
		timer += deltaT;
		for (int i = 0; i < tracks.size(); i++) {
			if (tracks.get(i).isRemove()) {
				tracks.remove(i);
			} else {
				tracks.get(i).update(deltaT);
			}
		}
	}

	public void draw(Graphics g) {
		for (int i = 0; i < tracks.size(); i++) {
			tracks.get(i).draw(g);
		}
	}
}
