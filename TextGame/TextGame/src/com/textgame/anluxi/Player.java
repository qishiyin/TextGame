package com.textgame.anluxi;

import com.textgame.anluxi.peopler.People;

public final class Player extends People
{
	
	public static Player myPlayer = new Player();
//	private String streat,strdrink,strdoing,strvoid;
	private String[] strthingStrings = new String[5];
	
	
	private Player()
	{
//		strvoid = "";
		strthingStrings[0] = "";
	}
	
	
	
	public static Player getPlayer()
	{
		
		return myPlayer;
	}



	@Override
	public void eat(String food) 
	{
		// TODO Auto-generated method stub
		strthingStrings[1] = String.format("你吃了%s", food);
		System.out.println(strthingStrings[1]);
		strthingStrings[1] = strthingStrings[0];
	}



	@Override
	public void drink(String food) 
	{
		// TODO Auto-generated method stub
		strthingStrings[2] = String.format("你喝了%s", food);
		System.out.println(strthingStrings[2]);
		strthingStrings[2] = strthingStrings[0];
	}



	@Override
	public void doing(String thing) 
	{
		// TODO Auto-generated method stub
		strthingStrings[3] = String.format("你做了%s", thing);
		System.out.println(strthingStrings[3]);
		strthingStrings[3] = strthingStrings[0];
	}



	@Override
	public void looking(String thing) 
	{
		// TODO Auto-generated method stub
		strthingStrings[4] = String.format("你看了%s", thing);
		System.out.println(strthingStrings[4]);
		strthingStrings[4] = strthingStrings[0];
	}

	public void getHelp()
	{
		System.out.println("啦啦啦，自己探索");
	}

	
	
	
}
