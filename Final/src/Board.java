
public class Board
	{
	static String [] [] board = new String [9] [9];
	static int boardMaker = (int)(Math.random()*3+1);
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
		switch (boardMaker)
			{
			case 1:
				{
				System.out.println("    1   2   3   4   5   6   7   8   9");
				System.out.println("   �����������������������������������");
				System.out.println("A |" + board[0][0] + "|" + " 9 " + "|" + board[0][2] + "|" + " 5 " + "|" + " 6 " + "|"
						+ board[0][5] + "|" + " 7 " + "|" + board[0][7] + "|" + board[0][8] + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("B |" + board[1][0] + "|" + board[1][1] + "|" + " 4 " + "|" + " 3 " + "|" + " 9 " + "|"
						+ board[1][5] + "|" + board[1][6] + "|" + board[1][7] + "|" + board[1][8] + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("C |" + board[2][0] + "|" + " 5 " + "|" + " 2 " + "|" + board[2][3] + "|" + " 8 " + "|"
						+ " 7 " + "|" + board[2][6] + "|" + board[2][7] + "|" + board[2][8] + "|");
				System.out.println("   �����������������������������������");
				System.out.println("D |" + board[3][0] + "|" + " 1 " + "|" + " 7 " + "|" + " 6 " + "|" + board[3][4] + "|"
						+ " 4 " + "|" + " 5 " + "|" + board[3][7] + "|" + board[3][8] + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("E |" + board[4][0] + "|" + board[4][1] + "|" + board[4][2] + "|" + " 2 " + "|" + board[4][4] + "|"
						+ board[4][5] + "|" + board[4][6] + "|" + board[4][7] + "|" + board[4][8] + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("F |" + board[5][0] + "|" + board[5][1] + "|" + board[5][2] + "|" + board[5][3] + "|" + board[5][4] + "|"
						+ " 8 " + "|" + " 4 " + "|" + " 7 " + "|" + board[5][8] + "|");
				System.out.println("   �����������������������������������");
				System.out.println("G |" + " 3 " + "|" + board[6][1] + "|" + " 1 " + "|" + board[6][3] + "|" + board[6][4] + "|"
						+ board[6][5] + "|" + board[6][6] + "|" + board[6][7] + "|" + " 9 " + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("H |" + " 9 " + "|" + board[7][1] + "|" + " 6 " + "|" + board[7][3] + "|" + " 2 " + "|"
						+ board[7][5] + "|" + board[7][6] + "|" + board[7][7] + "|" + " 3 " + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("I |" + board[8][0] + "|" + " 8 " + "|" + board[8][2] + "|" + board[8][3] + "|" + " 1 " + "|"
						+ board[8][5] + "|" + board[8][6] + "|" + " 2 " + "|" + board[8][8] + "|");
				System.out.println("   �����������������������������������");
				System.out.println();
				break;
				}
			case 2:
				{
				System.out.println("    1   2   3   4   5   6   7   8   9");
				System.out.println("   �����������������������������������");
				System.out.println("A |" + " 5 " + "|" + " 3 " + "|" + board[0][2] + "|" + board[0][3] + "|" + " 7 " + "|"
						+ board[0][5] + "|" + board[0][6] + "|" + board[0][7] + "|" + board[0][8] + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("B |" + " 6 " + "|" + board[1][1] + "|" + board[1][2] + "|" + " 1 " + "|" + " 9 " + "|"
						+ " 5 " + "|" + board[1][6] + "|" + board[1][7] + "|" + board[1][8] + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("C |" + board[2][0] + "|" + " 9 " + "|" + " 8 " + "|" + board[2][3] + "|" + board[2][4] + "|"
						+ board[2][5] + "|" + board[2][6] + "|" + " 6 " + "|" + board[2][8] + "|");
				System.out.println("   �����������������������������������");
				System.out.println("D |" + " 8 " + "|" + board[3][1] + "|" + board[3][2] + "|" + board[3][3] + "|" + " 6 " + "|"
						+ board[3][5] + "|" + board[3][6] + "|" + board[3][7] + "|" + " 3 " + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("E |" + " 4 " + "|" + board[4][1] + "|" + board[4][2] + "|" + " 8 " + "|" + board[4][4] + "|"
						+ " 3 " + "|" + board[4][6] + "|" + board[4][7] + "|" + " 1 " + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("F |" + " 7 " + "|" + board[5][1] + "|" + board[5][2] + "|" + board[5][3] + "|" + " 2 " + "|"
						+ board[5][5] + "|" + board[5][6] + "|" + board[5][7] + "|" + " 6 " + "|");
				System.out.println("   �����������������������������������");
				System.out.println("G |" + board[6][0] + "|" + " 6 " + "|" + board[6][2] + "|" + board[6][3] + "|" + board[6][4] + "|"
						+ board[6][5] + "|" + " 2 " + "|" + " 8 " + "|" + board[6][8] + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("H |" + board[7][0] + "|" + board[7][1] + "|" + board[7][2] + "|" + " 4 " + "|" + " 1 " + "|"
						+ " 9 " + "|" + board[7][6] + "|" + board[7][7] + "|" + " 5 " + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("I |" + board[8][0] + "|" + board[8][1] + "|" + board[8][2] + "|" + board[8][3] + "|" + " 8 " + "|"
						+ board[8][5] + "|" + board[8][6] + "|" + " 7 " + "|" + " 9 " + "|");
				System.out.println("   �����������������������������������");

				System.out.println();
				break;
				}
			case 3:
				{
				System.out.println("    1   2   3   4   5   6   7   8   9");
				System.out.println("   �����������������������������������");
				System.out.println("A |" + board[0][0] + "|" + " 2 " + "|" + board[0][2] + "|" + board[0][3] + "|" + board[0][4] + "|"
						+ board[0][5] + "|" + board[0][6] + "|" + board[0][7] + "|" + board[0][8] + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("B |" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|" + " 6 " + "|" + board[1][4] + "|"
						+ board[1][5] + "|" + board[1][6] + "|" + board[1][7] + "|" + " 3 " + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("C |" + board[2][0] + "|" + " 7 " + "|" + " 4 " + "|" + board[2][3] + "|" + " 8 " + "|"
						+ board[2][5] + "|" + board[2][6] + "|" + board[2][7] + "|" + board[2][8] + "|");
				System.out.println("   �����������������������������������");
				System.out.println("D |" + board[3][0] + "|" + board[3][1] + "|" + board[3][2] + "|" + board[3][3] + "|" + board[3][4] + "|"
						+ " 3 " + "|" + board[3][6] + "|" + board[3][7] + "|" + " 2 " + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("E |" + board[4][0] + "|" + " 8 " + "|" + board[4][2] + "|" + board[4][3] + "|" + " 4 " + "|"
						+ board[4][5] + "|" + board[4][6] + "|" + " 1 " + "|" + board[4][8] + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("F |" + " 6 " + "|" + board[5][1] + "|" + board[5][2] + "|" + " 5 " + "|" + board[5][4] + "|"
						+ board[5][5] + "|" + board[5][6] + "|" + board[5][7] + "|" + board[5][8] + "|");
				System.out.println("   �����������������������������������");
				System.out.println("G |" + board[6][0] + "|" + board[6][1] + "|" + board[6][2] + "|" + board[6][3] + "|" + " 1 " + "|"
						+ board[6][5] + "|" + " 7 " + "|" + " 8 " + "|" + board[6][8] + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("H |" + " 5 " + "|" + board[7][1] + "|" + board[7][2] + "|" + board[7][3] + "|" + board[7][4] + "|"
						+ " 9 " + "|" + board[7][6] + "|" + board[7][7] + "|" + board[7][8] + "|");
				System.out.println("  ------------|-----------|-----------|");
				System.out.println("I |" + board[8][0] + "|" + board[8][1] + "|" + board[8][2] + "|" + board[8][3] + "|" + board[8][4] + "|"
						+ board[8][5] + "|" + board[8][6] + "|" + " 4 " + "|" + board[8][8] + "|");
				System.out.println("   �����������������������������������");

				System.out.println();
				break;
				}
			}
		}

}


