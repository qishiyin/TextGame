package food;


public class Food<T>
{
	
	public String name = "";
	public boolean isdrink = false;
	public boolean iseat = false;
	public int drinkget = 0;
	public int eatget = hashCode();
	public String description = "";
	
	public void outDescription()
	{
		System.out.println(description);
	}
	
	public void setTitle(String description)
	{
		this.description = description;
		
	}
	
	
}
