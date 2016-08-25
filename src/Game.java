
public class Game extends GameItems{
	private Player player;
	private Computer computer;
	private CHOICES playerChoice;
	private CHOICES compChoice;
	private RESULTS result;
	private static int wins;
	private static int loses;
	private static int ties;

	
	public Game()
	{
		super();
		player = new Player();
		computer = new Computer();
	}
	
	public void play()
	{
		playerChoice = player.getChoice();//assign rock/paper/scissor 
		compChoice = computer.getChoice();//computer randomly makes choice
		result = getResult();//eval choice
		displayResults();//who won??
		record();//show results for game
	}
	public void displayRecord()
	{
		System.out.println("You have played "+(wins+loses+ties) + " and won "+ wins + " times and tied " + ties + " times.");
	}
	private void record()
	{
		if(result == RESULTS.WIN)
			wins++;
		else if (result == RESULTS.LOSE)
			loses++;
		else 
			ties++;
	}
	private void displayResults()
	{
		switch(result)
		{
		case WIN:
			System.out.println(playerChoice + " beats " + compChoice + ". You Win.");
			break;
		case LOSE:
			System.out.println(playerChoice + " loses to " + compChoice + ". Kobe Wins.");
			break;
		case TIE:
			System.out.println(playerChoice + " equals to " + compChoice + ". It's a tie.");
			break;
		}
	}
	private RESULTS getResult() //wont access outside the function
	{
	//
		if(playerChoice == compChoice) 
		{
			return RESULTS.TIE;
		}
		switch(playerChoice)
		{
		case ROCK:
			return (compChoice == CHOICES.SCISSORS ? RESULTS.WIN : RESULTS.LOSE);
		case PAPER:
			return (compChoice == CHOICES.ROCK ? RESULTS.WIN : RESULTS.LOSE);
		case SCISSORS:
			return (compChoice == CHOICES.SCISSORS ? RESULTS.WIN : RESULTS.LOSE);//change this line
		}
		return RESULTS.LOSE;
		
		}
	}

