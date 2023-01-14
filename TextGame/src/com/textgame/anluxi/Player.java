package com.textgame.anluxi;

import java.util.HashMap;
import java.util.Map;

import com.textgame.anluxi.peopler.People;

public final class Player extends People
{
	
	public static Player myPlayer = new Player();

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
//		strthingStrings[3] = strthingStrings[0];
	}



	@Override
	public void looking(String thing) 
	{
		// TODO Auto-generated method stub
		strthingStrings[4] = String.format("你看了%s", thing);
		System.out.println(strthingStrings[4]);
//		strthingStrings[4] = strthingStrings[0];
	}

	public void getHelp()
	{
		System.out.println("啦啦啦，自己探索");
		final Map<String,String> ming = new HashMap<String,String>();
		ming.put("exit","退出程序");
		ming.put("eat","吃点东西吧");
		ming.put("drink","是喝的指令哦");
		ming.put("look","看看周围吧");
		ming.put("do","该做点什么事咯");
		for(String s : ming.keySet())
		{
			System.out.print("\t");
			System.out.println(String.format("%s->%s", s,ming.get(s)));
		}
	}

	public void lookYouSelf()
	{
		System.out.println(String.format("属性:\n\thp->%d \n\tmp->%d \n\ttak->%d \n\tmtak->%d \n\tdk->%d \n\tmdk->%d \n\teat->%d \n\tdrink->%d",
				hp,mp,tak,mtak,dk,mdk,eat,drink));
		
		
	}
	
	
}
