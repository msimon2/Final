
public class GameRunner
	{
	static int score = 0;
	public static void main(String[] args)
		{
		Board.makeBoard();
		Board.displayBoard();
		ScoreBoard.addNames();
		PlayerTurn.greetUser();
		PlayerTurn.askForTurn();
		while (PlayerTurn.isWon)
			{
			PlayerTurn.assignTurn();
			Board.displayBoard();
			score++;
			}
		}
	}