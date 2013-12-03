package com.me.mygdxgame.Model;

import com.badlogic.gdx.math.Vector2;

public abstract class Enemy extends MoveableEntity {

	public Enemy(float speed, float rotation, float width, float height,
			Vector2 position) {
		super(speed, rotation, width, height, position);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void advance(float delta, Ship ship);
	
	
	
}
