package com.textgame.anluxi.peopler;

public abstract class People 
{

	
	public String name;
	public int eat =0;
	public int maxeat = 100;
	public int mineat = 0;
	public int drink =0;
	public int maxdrink = 100;
	public int mindrink = 0;
	public int hp = 100;
	public int mp = 100;
	public int dk = 10;
	public int mdk = 10;
	public int tak = 10;
	public int mtak = 10;
	
	public abstract void eat(String food);
	public abstract void drink(String food);
	public abstract void doing(String thing);
	public abstract void looking(String thing);
}
