package com.textgame.anluxi.UI;



public class AnFrame extends UI
{
	public AnFrame(int x, int y, int height, int width) 
	{
		super(x, y, height, width);
		// TODO Auto-generated constructor stub
		ui();
	}






	//标题
	public String titleString = null;
	//显示窗口
	public String showframeString;
	
	
	
	
	
	
	public void setTitleString(String titleString) 
	{
		this.titleString = titleString;
	}






	@Override
	public StringBuilder ui() 
	{
		// TODO Auto-generated method stub
		String[] strings = new String[2];
		strings[0]="";
		strings[1]="";
		for(int j=0;j<width;j++)
		{
			strings[0] = strings[0] + vbars;
			strings[1] = strings[1] + voidbars;
		}
		for(int i=0;i<height;i++)
		{
			
			
			if(i==0)
			{
				maparray.put(i, String.format("%s%s%s", lefttop,strings[0],righttop));
			}else if(i==height - 1)
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
