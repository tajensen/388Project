package com.me.mygdxgame.Model;

import com.badlogic.gdx.math.Vector2;

public abstract class MoveableEntity extends Entity {
	
	protected Vector2 velocity;
	protected float speed;
	protected float rotation;
	
	public MoveableEntity(float speed, float rotation, float width, float height, Vector2 position){
		super(position, width, height);
		this.rotation = rotation;
		this.speed = speed;
		
	}
	
	public Vector2 getVelocity(){
		return velocity;
	}
	
	public void setVelocity(Vector2 velocity){
		this.velocity = velocity;
	}
	
	public float getRotation(){
		return rotation;
	}
	
	public void setRotation(float rotation){
		this.rotation = rotation;
	}
}
