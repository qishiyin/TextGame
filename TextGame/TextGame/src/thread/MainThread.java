package thread;

import java.util.ArrayList;
import java.util.Scanner;

import com.textgame.anluxi.Player;
import com.textgame.anluxi.UI.AnButton;

public final class MainThread extends Thread
{
	public MainThread() 
	{
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		super.run();
		System.out.println("主线程启动");
		(new AnButton("hello",1,0, 0, 20)).show();
		boolean istrue = true;
		Scanner scanner = new Scanner(System.in);
		String inputString = "";
		String[] stringarray;
		Player youPlayer = Player.getPlayer();
		final ArrayList<String> ming = new ArrayList<String>();
		ming.add("exit");
		ming.add("eat");
		ming.add("drink");
		ming.add("exit");
		ming.add("do");
		try 
		{
			while(istrue)
			{
				System.out.print("控制台:");
				inputString = scanner.next();
				stringarray = inputString.split("-");
				switch (stringarray[0])
				{
				case "e":
				case "exit": 
					istrue = false;
					scanner.close();
					System.out.println("线程退出");
					break;
				case "eat":
					youPlayer.eat(stringarray[1]);
					break;
				case "drink":
					youPlayer.drink(stringarray[1]);
					break;
				case "doing":
					youPlayer.doing(stringarray[1]);
					break;
				case "h":
				case "help":
					youPlayer.getHelp();
					for(String s : ming)
					{
						System.out.println(s);
					}
					break;
					
				
				default:
					System.out.println("指令错误，请按照xxx-xx的格式来，不知道命令可输入help或h");
				}
			}
			System.out.println("主线程结束");
		
		} catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
		
	
}
