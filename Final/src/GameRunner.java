
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
			CheckForWinn.checkBoards();
			}
		}
	}