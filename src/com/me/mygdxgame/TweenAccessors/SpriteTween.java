package com.me.mygdxgame.TweenAccessors;

import aurelienribon.tweenengine.TweenAccessor;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class SpriteTween implements TweenAccessor<Sprite>{

	@Override
	public int getValues(Sprite target, int tweenType, float[] returnValues) {
		if(tweenType == 1){
			returnValues[0] = target.getColor().a;
			return 1;
		}
		return 0;
	}

	@Override
	public void setValues(Sprite target, int tweenType, float[] newValues) {
		if(tweenType == 1)
			target.setColor(1,1,1,newValues[0]);
	}

}
