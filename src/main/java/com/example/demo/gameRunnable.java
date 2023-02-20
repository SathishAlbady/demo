package com.example.demo;

public class gameRunnable 
{
	gameconsole obj;
	   gameRunnable(gameconsole obj)
		{
		this.obj=obj;
		}
	   void runner() {
		obj.right();
		obj.left();
		obj.up();
		obj.down();
		}
	
		
	}


