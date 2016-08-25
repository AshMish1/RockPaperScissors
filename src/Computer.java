import java.util.Random;//need for ramdon number 
public class Computer extends GameItems{
	//create variable for object random
	private Random rand;
	//Constructor
	public Computer() 
	{
		super();
		rand = new Random();//create an object and ready to use
	}
	public CHOICES getChoice() 
	{
		int choice = 1 + rand.nextInt(3);//choice will hold value 1,2 or 3
		
		switch(choice)
		{
		case 1:
			return CHOICES.ROCK;//case1 
		case 2:
			return CHOICES.PAPER;//case2
		}
		return CHOICES.SCISSORS;//case 3
		
	}
}
