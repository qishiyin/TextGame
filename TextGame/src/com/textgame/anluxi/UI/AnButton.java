package com.textgame.anluxi.UI;

/**
 * 按钮
 *
*/

public class AnButton extends UI
{


	

//	private String title = "" ;
	private String titlevoid = "";
	private int titlesize = 0;
	private String titlestring = "";
	private int id = 0;
	
	
	public AnButton(String title,int id,int x,int y,int width)
	{
		super(x,y,width);
//		this.title=title;
		this.id=id;
		titlevoid="";
		ui(title,id);
	}
	
	
	
	public AnButton(int x,int y,int height,int width)
	{
		super(x,y,height,width);
		
		ui();
	}

	public StringBuilder ui(String title,int id) 
	{
		
		
		titlesize = title.length();
		int q = (width - titlesize)-1;
//		空集合的创建
//		0=非空1=空
//		只需要创建空集合
		if(titlesize<width)
		{
			for(int i=0;i<q;i++)
			{
				titlevoid += voidbars;
				
			}
		}
		
		titlestring = title + titlevoid;
		
		titlestring = titlestring + String.format("(%d)",id );

//		对集合的整合
		for(int i=0;i<(height + 2);i++)
		{
			if(i==0)
			{
				maparray.put(i, String.format("%s%s%s", lefttop,strings[0],righttop));
			}else if(i==(height + 1))
			{
				maparray.put(i, String.format("%s%s%s", leftdown,strings[0],rightdown));
			}else if(i==1)
			{
				maparray.put(i, String.format("%s%s%s", vbar,titlestring,vbar));
			}else 
			{
				maparray.put(i, String.format("%s%s%s", vbar,strings[1],vbar));
			}
		}
		
		for(int i=0;i<maparray.size();i++)
		{
			stringbuilder.append(String.format("%s\n", maparray.get(i)));
		}
		
		
		return stringbuilder;
	}
	
	
	@Override
	public StringBuilder ui() 
	{
		// TODO Auto-generated method stub
//		首行，尾行，空行的填充体
		
		
		for(int i=0;i<(height + 2);i++)
		{
			if(i==0)
			{
				maparray.put(i, String.format("%s%s%s", lefttop,strings[0],righttop));
			}else if(i==(height + 2) - 1)
			{
				maparray.put(i, String.format("%s%s%s", leftdown,strings[0],rightdown));
			}else 
			{
				maparray.put(i, String.format("%s%s%s", vbar,strings[1],vbar));
			}
		}
		
		for(int i=0;i<maparray.size();i++)
		{
			stringbuilder.append(String.format("%s\n", maparray.get(i)));
		}
		
		
		return stringbuilder;
	}
	
	
	
	
}
