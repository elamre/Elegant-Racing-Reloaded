package com.race.system;

import org.newdawn.slick.Graphics;

import com.race.entity.Car;

public class Camera {
	private static Camera camera;
	/** The x and y position of the camera */
	float x = 0;
	float y = 0;

	/** Simple singleton */
	public static Camera getCamera() {
		if (camera == null) {
			camera = new Camera();
		}
		return camera;
	}

	/** Sets the camera accordingly so that the car gets centered */
	public void updateCam(Car car) {
		this.x = car.getX() - 320;
		this.y = car.getY() - 240;
	}

	/** Makes sure that all the object are relative to the camera */
	public void setFocus(Graphics g) {
		g.translate(-x, -y);
	}

	/** resets the focus again, so now you can draw GUI */
	public void releaseFocus(Graphics g) {
		g.translate(x, y);
	}
}
