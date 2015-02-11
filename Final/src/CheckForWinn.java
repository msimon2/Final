public class CheckForWinn 
	{
	static boolean validity;
	static boolean full;
	public static void checkBoards()
		{	
		if (Board.board[0][2].equals(" 4 ") && Board.board[0][3].equals(" 6 ") && Board.board[0][5].equals(" 8 ") && Board.board[0][6].equals(" 9 ") 
			&& Board.board[0][7].equals(" 1 ") && Board.board[0][8].equals(" 2 ") && Board.board[1][1].equals(" 7 ") && Board.board[1][2].equals(" 2 ")
			&& Board.board[1][6].equals(" 3 ") && Board.board[1][7].equals(" 4 ") && Board.board[1][8].equals(" 8 ") && Board.board[2][0].equals(" 1 ")
			&& Board.board[2][3].equals(" 3 ") && Board.board[2][4].equals(" 4 ") && Board.board[2][5].equals(" 2 ") && Board.board[2][6].equals(" 5 ")
			&& Board.board[2][8].equals(" 7 ")
			&& Board.board[3][1].equals(" 5 ") && Board.board[3][2].equals(" 9 ") && Board.board[3][3].equals(" 7 ") && Board.board[3][5].equals(" 1 ")  
			&& Board.board[3][6].equals(" 4 ") && Board.board[3][7].equals(" 2 ") && Board.board[4][1].equals(" 2 ") && Board.board[4][2].equals(" 6 ") 
			&& Board.board[4][4].equals(" 5 ") && Board.board[4][6].equals(" 7 ") && Board.board[4][7].equals(" 9 ") && Board.board[5][1].equals(" 1 ") 
			&& Board.board[5][2].equals(" 3 ") && Board.board[5][3].equals(" 9 ") && Board.board[5][5].equals(" 4 ") && Board.board[5][6].equals(" 8 ") 
			&& Board.board[5][7].equals(" 5 ") && Board.board[6][0].equals(" 9 ") && Board.board[6][2].equals(" 1 ") && Board.board[6][3].equals(" 5 ") 
			&& Board.board[6][4].equals(" 3 ") && Board.board[6][5].equals(" 7 ") && Board.board[6][8].equals(" 4 ") && Board.board[7][0].equals(" 2 ")
			&& Board.board[7][1].equals(" 8 ") && Board.board[7][2].equals(" 7 ") && Board.board[7][6].equals(" 6 ") && Board.board[7][7].equals(" 3 ")  
			&& Board.board[8][0].equals(" 3 ") && Board.board[8][1].equals(" 4 ") && Board.board[8][2].equals(" 5 ") && Board.board[8][3].equals(" 2 ") 
			&& Board.board[8][5].equals(" 6 ") && Board.board[8][6].equals(" 1 "))
				{
				System.out.println("Congrats, you won!");
				System.exit(0);
				}
		else
			{
			System.out.println("You either haven't finished, or there's duplicates somewhere. Go back and fix that!");
			}
		}
	public static void protectComputer()
		{
		if (Board.board[0][0].equals(" 5 ") && Board.board[0][1].equals(" 3 ") && Board.board[0][4].equals(" 7 "))
			{
			if (PlayerTurn.spot.equals("a1") || PlayerTurn.spot.equals("a2") || PlayerTurn.spot.equals("a5") || PlayerTurn.spot.equals("b1") 
				|| PlayerTurn.spot.equals("b4") || PlayerTurn.spot.equals("b5") || PlayerTurn.spot.equals("b6") || PlayerTurn.spot.equals("c2")
				|| PlayerTurn.spot.equals("c3") || PlayerTurn.spot.equals("c8") || PlayerTurn.spot.equals("d8") || PlayerTurn.spot.equals("d8")
				|| PlayerTurn.spot.equals("d9") || PlayerTurn.spot.equals("e1") || PlayerTurn.spot.equals("e4") || PlayerTurn.spot.equals("e6")
				|| PlayerTurn.spot.equals("e1") || PlayerTurn.spot.equals("f1") || PlayerTurn.spot.equals("f5") || PlayerTurn.spot.equals("f9")
				|| PlayerTurn.spot.equals("g2") || PlayerTurn.spot.equals("g7") || PlayerTurn.spot.equals("g8") || PlayerTurn.spot.equals("h4")
				|| PlayerTurn.spot.equals("h5") || PlayerTurn.spot.equals("h6") || PlayerTurn.spot.equals("h9") || PlayerTurn.spot.equals("i5")
				|| PlayerTurn.spot.equals("i8") || PlayerTurn.spot.equals("i9"))
					{
					System.out.println("That's a computer generated number, you can't change that.");
					System.out.println( );
					}
			}
		}
	}