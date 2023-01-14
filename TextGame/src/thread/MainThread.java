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
		Player you = Player.getPlayer();
		
		
		
		
		System.out.println("请输入指令。");
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
					you.eat(stringarray[1]);
					break;
				case "drink":
					you.drink(stringarray[1]);
					break;
				case "doing":
					you.doing(stringarray[1]);
					break;
				case "look":
					switch(stringarray[1])
					{
						case "me":
							you.lookYouSelf();
							break;
					}
					you.lookYouSelf();
					break;
				case "h":
				case "help":
					you.getHelp();
					break;
					
				
				default:
					System.out.println("指令错误，请按照xxx-xx的格式来，不知道命令可输入help或h");
				}
			}
			System.out.println("主线程结束");
		
		} catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("啊啦？程序出错了哦");
			e.printStackTrace();
		}
	}
		
	
}
