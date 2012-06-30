package com.race.entity;

import org.newdawn.slick.Graphics;

import com.race.main.ButtonHandler;

public class Player {
	int x = 200;
	int y = 200;
	Car selectedCar = null;

	public Player() {
		selectedCar = new BlueCar(x, y);
	}

	public void update(float deltaT) {
		if (selectedCar != null) {
			selectedCar.updateAll(deltaT);
			selectedCar
					.setMoving(ButtonHandler.getButtonHandler().getForward());
			if (ButtonHandler.getButtonHandler().getRight()) {
				selectedCar.changeDirection(0.2f, deltaT);
			}
			if (ButtonHandler.getButtonHandler().getLeft()) {
				selectedCar.changeDirection(-0.2f, deltaT);
			}
		}
	}

	public void setStartPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics g) {
		if (selectedCar != null) {
			selectedCar.draw(g);
		}
	}

}
