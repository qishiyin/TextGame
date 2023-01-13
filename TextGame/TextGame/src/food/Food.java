package food;

public class Food 
{
	public String name = "";
	public boolean isdrink = false;
	public boolean iseat = false;
	public int drinkget = 0;
	public int eatget = hashCode();
	public String title = "";
	
	public void looks()
	{
		System.out.println(title);
	}
	
	public void setTitle(String title)
	{
		this.title = title;
		
	}
	
	public String getTitle()
	{
		
		return title;
	}
}
