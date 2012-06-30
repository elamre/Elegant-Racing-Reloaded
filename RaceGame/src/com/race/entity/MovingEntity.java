package com.race.entity;

public abstract class MovingEntity extends BaseEntity {
	float speed;
	boolean moving = false;
	float acceleration = 0.1f;
	int maxspeed = 10;
	float friction = 0;

	protected MovingEntity(int x, int y, int health) {
		super(x, y, health);
	}

	public void changeDirection(float rotaton, float deltaT) {
		this.rotation += deltaT * rotation;
	}

	public void speedUp(float deltaT) {
		speed += deltaT * acceleration;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public abstract void update(float deltaT);

	public void updateAll(float deltaT) {
		x += speed * deltaT
				* java.lang.Math.sin(java.lang.Math.toRadians(rotation));
		y -= speed * deltaT
				* java.lang.Math.cos(java.lang.Math.toRadians(rotation));
		update(deltaT);
	}
}
