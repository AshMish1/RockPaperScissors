import java.util.Scanner;
public class Player extends GameItems{
	//initiate scanner
	Scanner scan;
	//Constructor
	public Player()
	{
		super();
		scan = new Scanner(System.in);//instantiate Scanner(create it), cant use this code for online web applications
	}
	
	public CHOICES getChoice()
	{
		System.out.println("Enter your choice: Rock, Paper, Scissors: ");
		char playerChoice = scan.nextLine().toLowerCase().charAt(0);
		
		switch(playerChoice)
		{
		case 'r':
			return CHOICES.ROCK;
		case 'p':
			return CHOICES.PAPER;
		case 's':
			return CHOICES.SCISSORS;
		}
		//ask to enter again bc its invalid
		System.out.println("Invalid Input");
		return getChoice();
	}
}
