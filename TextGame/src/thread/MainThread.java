package thread;

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
		
		
		while(istrue)
		{
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
				
				
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + inputString);
			}
		}
		System.out.println("主线程结束");
	}
	
}
