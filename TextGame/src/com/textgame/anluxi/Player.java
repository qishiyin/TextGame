package com.textgame.anluxi;

import com.textgame.anluxi.peopler.People;

public final class Player extends People
{
	
	public static Player myPlayer = new Player();
	private String streat,strdrink,strdoing,strvoid;
	
	private Player()
	{
		strvoid = "";
	}
	
	
	
	public static Player getPlayer()
	{
		
		return myPlayer;
	}



	@Override
	public void eat(String food) 
	{
		// TODO Auto-generated method stub
		streat = String.format("你吃了%s", food);
		System.out.println(streat);
		streat = strvoid;
	}



	@Override
	public void drink(String food) 
	{
		// TODO Auto-generated method stub
		strdrink = String.format("你喝了%s", food);
		System.out.println(strdrink);
		strdrink = strvoid;
	}



	@Override
	public void doing(String thing) 
	{
		// TODO Auto-generated method stub
		strdoing = String.format("你做了%s", thing);
		System.out.println(strdoing);
		strdoing = strvoid;
	}



	@Override
	public void looking(String thing) {
		// TODO Auto-generated method stub
		
	}



	
	
	
}
