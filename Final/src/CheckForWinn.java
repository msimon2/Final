
public class CheckForWinn 
	{
	static boolean validity;
	public static void checkBoards()
		{	
		for(int i=0; i<9; i++)
			{
			for (int j=0; j<9; j++)
				{
				if (Board.board[i]==Board.board[j] && i!=j)
					{
					validity=true;
					System.out.println("There seems to be some mistakes.");
					}
				else
					{
					System.exit(0);	
					}
				}
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
		if (Board.board[2][1].equals(" 7 ") && Board.board[2][2].equals(" 4 ") && Board.board[2][4].equals(" 8 "))
			{
			if (PlayerTurn.spot.equals("a2") || PlayerTurn.spot.equals("a6") || PlayerTurn.spot.equals("b4") || PlayerTurn.spot.equals("b9") 
				|| PlayerTurn.spot.equals("c2") || PlayerTurn.spot.equals("c3") || PlayerTurn.spot.equals("c5") || PlayerTurn.spot.equals("d6") 
				|| PlayerTurn.spot.equals("d9") || PlayerTurn.spot.equals("e2") || PlayerTurn.spot.equals("e5") || PlayerTurn.spot.equals("e8")
				|| PlayerTurn.spot.equals("f1") || PlayerTurn.spot.equals("f5") || PlayerTurn.spot.equals("g5") || PlayerTurn.spot.equals("g7") 
				|| PlayerTurn.spot.equals("g8") || PlayerTurn.spot.equals("h1") || PlayerTurn.spot.equals("h6") || PlayerTurn.spot.equals("i8"))
					{
					System.out.println("That's a computer generated number, you can't change that.");
					System.out.println( );
					}
			}
		if (Board.board[0][1].equals(" 9 ") && Board.board[0][3].equals(" 5 ") && Board.board[0][4].equals(" 6 ") && Board.board[0][8].equals(" 7 ") )
			{
			if (PlayerTurn.spot.equals("a2") || PlayerTurn.spot.equals("a4") || PlayerTurn.spot.equals("a5") || PlayerTurn.spot.equals("a7") 
				|| PlayerTurn.spot.equals("b3") || PlayerTurn.spot.equals("b4") || PlayerTurn.spot.equals("b5") || PlayerTurn.spot.equals("c2")
				|| PlayerTurn.spot.equals("c3") || PlayerTurn.spot.equals("c5") || PlayerTurn.spot.equals("c6") || PlayerTurn.spot.equals("d2")
				|| PlayerTurn.spot.equals("d3") || PlayerTurn.spot.equals("d4") || PlayerTurn.spot.equals("d6") || PlayerTurn.spot.equals("d7")
				|| PlayerTurn.spot.equals("e4") || PlayerTurn.spot.equals("f6") || PlayerTurn.spot.equals("f7") || PlayerTurn.spot.equals("f8")
				|| PlayerTurn.spot.equals("g1") || PlayerTurn.spot.equals("g3") || PlayerTurn.spot.equals("g9") || PlayerTurn.spot.equals("h1")
				|| PlayerTurn.spot.equals("h3") || PlayerTurn.spot.equals("h5") || PlayerTurn.spot.equals("h9") || PlayerTurn.spot.equals("i2")
				|| PlayerTurn.spot.equals("i5") || PlayerTurn.spot.equals("i8"))
					{
					System.out.println("That's a computer generated number, you can't change that.");
					System.out.println( );
					}
				}
			}
		}
	
	
	












