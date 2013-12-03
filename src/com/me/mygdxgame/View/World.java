package com.me.mygdxgame.View;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.me.mygdxgame.MyGdxGame;
import com.me.mygdxgame.Model.Ship;

public class World {

	MyGdxGame game;
	Ship ship;
	
	public World(MyGdxGame game){
		this.game = game;
		ship = new Ship(5f,0,1,1,new Vector2(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2));
	}
	
	public Ship getShip(){
		return ship;
	}
}
