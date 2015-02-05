
public class Board
	{
	static String [] [] board = new String [4] [4];
	public static void makeBoard()
		{
		for (int row=0; row<board.length; row++)
			{
			for (int col=0; col<board[0].length; col++)
				{
				board[row][col]= "   ";
				}
			}
		}
	public static void displayBoard()
		{
		int boardMaker = (int)(Math.random()*9)+1;
		switch (boardMaker)
			{
			case 1:
				{
				System.out.println("    1   2   3   4");
				System.out.println("  —————————————————");
				System.out.println("A |" + board[0][0] + "|" + " 1 " + "|" + board[0][2] + "|" + " 3 " + "|"  );
				System.out.println("  --------|--------");
				System.out.println("B |" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|" + board[1][3] + "|" );
				System.out.println("  —————————————————");
				System.out.println("C |" + board[2][0] + "|" + board[2][1] + "|" + " 2 " + "|" + board[2][3] + "|");
				System.out.println("  --------|--------");
				System.out.println("D |" + board[3][0] + "|" + " 2 " + "|" + board[3][2] + "|" + board[3][3] + "|");
				System.out.println("  —————————————————");
				System.out.println();
				}
			}
		}
	}








