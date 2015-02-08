
public class CheckForWinn 
	{
	static boolean isWon = true;
	public static void checkBoards()
		{	
		if (Board.board[0][0].equals(" 2 ") && Board.board[0][1].equals(" 1 ") && Board.board[0][2].equals(" 4 " ) && Board.board[0][3].equals(" 3 ")
			&& Board.board[1][0].equals(" 3 ") && Board.board[1][1].equals(" 4 ") && Board.board[1][2].equals(" 1 ") && Board.board[1][3].equals(" 2 ")
			&& Board.board[2][0].equals(" 4 ") && Board.board[2][1].equals(" 3 ") && Board.board[2][2].equals(" 2 ") && Board.board[2][3].equals(" 1 ")
			&& Board.board[3][0].equals(" 1 ") && Board.board[3][1].equals(" 2 ") && Board.board[3][2].equals(" 3 ") && Board.board[3][3].equals(" 4 ")
			|| Board.board[0][0].equals(" 1 ") && Board.board[0][1].equals(" 3 ") && Board.board[0][2].equals(" 4 ") && Board.board[0][3].equals(" 2 ")
			&& Board.board[1][0].equals(" 2 ") && Board.board[1][1].equals(" 4 ") && Board.board[1][2].equals(" 3 ") && Board.board[1][3].equals(" 1 ")
			&& Board.board[2][0].equals(" 4 ") && Board.board[2][1].equals(" 2 ") && Board.board[2][2].equals(" 1 ") && Board.board[2][3].equals(" 3 ")
			&& Board.board[3][0].equals(" 3 ") && Board.board[3][1].equals(" 1 ") && Board.board[3][2].equals(" 2 ") && Board.board[3][3].equals(" 4 ")
			|| Board.board[0][0].equals(" 1 ") && Board.board[0][1].equals(" 1 ") && Board.board[0][2].equals(" 3 ") && Board.board[0][3].equals(" 4 ")
			&& Board.board[1][0].equals(" 4 ") && Board.board[1][1].equals(" 3 ") && Board.board[1][2].equals(" 2 ") && Board.board[1][3].equals(" 1 ")
			&& Board.board[2][0].equals(" 2 ") && Board.board[2][1].equals(" 4 ") && Board.board[2][2].equals(" 1 ") && Board.board[2][3].equals(" 3 ")
			&& Board.board[3][0].equals(" 3 ") && Board.board[3][1].equals(" 1 ") && Board.board[3][2].equals(" 4 ") && Board.board[3][3].equals(" 2 "))
			{
			System.out.println("Congrats, you won!");
			}
		else
			{
			System.out.println("There must be something wrong. why don't you look over your mistakes. Here's the original board: ");
			}
		}
	}