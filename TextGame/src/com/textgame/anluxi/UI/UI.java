package com.textgame.anluxi.UI;
import java.util.HashMap;
import java.util.Map;

public abstract class UI 
{


		//╔ ╗╝╚ ╬ ═ ╓ ╩ ┠ ┨┯ ┷┏ ┓┗ ┛┳⊥﹃﹄┌╭╮╯╰
		//╔═════╗
		//║show ║
		//║     ║
		//╚═════╝
		//
		//
	public StringBuilder stringbuilder ;
//	


	//左上
	public char lefttop = '╔';
	//右上
	public char righttop = '╗';
	//横杠
	public char hbar = '═';
	//竖杠
	public char vbar = '║';
	//左下
	public char leftdown = '╚';
	//右下
	public char rightdown = '╝';
	public char vbars = '+';
	public char hbars = '-';
	public char voidbars = ' ';
	//ui名字
	public String Uiname;
	//宽度，高度
	public int width=1;
	public int height=1;
	//坐标
	public int x,y;
	//可见性
	public boolean Visible;
	
	public Map<Integer,String> maparray;
	
	public String[] strings;
	
	
	public UI(int x,int y,int height,int width)
	{
		stringbuilder = new StringBuilder();
		maparray = new HashMap<Integer,String>();
		strings = new String[2];
		strings[0]="";
		strings[1]="";
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
//		0=非空1=空
		for(int j=0;j<width + 2;j++)
		{
			strings[0] = strings[0] + hbar;
			strings[1] = strings[1] + voidbars;
		}
		
	}
	
	public UI(int x,int y,int width)
	{
		stringbuilder = new StringBuilder();
		maparray = new HashMap<Integer,String>();
		strings = new String[2];
		strings[0]="";
		strings[1]="";
		this.x=x;
		this.y=y;
		this.width=width;
//		0=非空1=空
		for(int j=0;j<width + 2;j++)
		{
			strings[0] = strings[0] + vbars;
			strings[1] = strings[1] + voidbars;
		}
		
	}
	
	
	public String getUiname( ) 
	{
		return Uiname;
	}
	

	
	public abstract StringBuilder ui();

	public void show()
	{
		System.out.println(stringbuilder);
	}
	
	
	
	
	
	public int getHeight() 
	{
		return height;
	}
	public int getWidth() 
	{
		return width;
	}
	public float getX() 
	{
		return x;
	}
	public float getY() 
	{
		return y;
	}
}
