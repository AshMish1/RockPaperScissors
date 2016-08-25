import java.util.Scanner;
public class PlayGame {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String name;
		Game game = new Game();
		char end = ' ';
		String opponent; 
		System.out.println("Enter your name: ");
		name = scan.nextLine();
		System.out.println("Welcome " + name + " to the Rock Paper Scissors game.");
		System.out.println("Choose a player that you would like to play against: Kobe or Brock.");
		opponent = scan.nextLine();
		System.out.println("You selected "+ opponent + ".");
		while(end != 'N')
		{
		//if Kobe-----play vs random player
			if(opponent.equalsIgnoreCase("kobe")) 
			{
				Computer vs = new Computer();
				game.play();
			}
		
			game.play();
			
			System.out.println("Would you like to play again? Press any button to continue or N to quit: ");
			end = scan.nextLine().toUpperCase().charAt(0);
		}
		scan.close();
		game.displayRecord();
	}

}
