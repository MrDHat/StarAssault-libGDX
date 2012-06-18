package com.starassault.model;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class World {
	
	Array <Block> blocks = new Array <Block>();
	
	Bob bob;
	
	//Getters (b'coz interfaces are different for models and default)
	public Array<Block> getBlocks(){
		return blocks;
	}
	public Bob getBob(){
		return bob;
	}
	//..
	
	public World(){
		createDemoWorld();
	}
	private void createDemoWorld() {
		bob = new Bob(new Vector2(7,2));
		blocks.add(new Block(new Vector2(9, 2)));
		blocks.add(new Block(new Vector2(9, 3)));
		blocks.add(new Block(new Vector2(9, 4)));
		blocks.add(new Block(new Vector2(9, 5)));
		
	}
}
