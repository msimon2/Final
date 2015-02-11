import java.util.*;

public class GameRunner
	{
	static int score = 0;
	public static void main(String[] args)
		{
		Board.makeBoard();
		Board.displayBoard();
		PlayerTurn.greetUser();
		PlayerTurn.intruduceGame();
		while (PlayerTurn.isWon)
			{
			PlayerTurn.askUser();
			CheckForWinn.protectComputer();
			PlayerTurn.assignTurn();
			Board.displayBoard();
			score++;
			Scanner userInput = new Scanner(System.in);
			System.out.println("Are you finished?");
			String answer = userInput.nextLine();
			if (answer.equals("yes"))
				{
				CheckForWinn.checkBoards();
				}
			
			}
		ScoreBoard.addNames();
		}
	}