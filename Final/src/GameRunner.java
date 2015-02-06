
public class GameRunner
	{
	public static void main(String[] args)
		{
		Board.makeBoard();
		Board.displayBoard();
		PlayerTurn.greetUser();
		PlayerTurn.askForTurn();
		while (PlayerTurn.isWon)
			{
			PlayerTurn.assignTurn();
			Board.displayBoard();
			}
		}
	}