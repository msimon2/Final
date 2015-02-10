import java.util.*;

public class PlayerTurn
	{
	static boolean isWon = true;
	static Scanner userInput = new Scanner(System.in);
	static String spot;
	static String number;
	static String name;
	public static void greetUser()
		{
		System.out.println();
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		name = userInput.nextLine();
		String[] array = {"You look lovely today, ", "What a nice shirt you've got on, ", "I love what you did with your hair, ", 
				"Now I know where your daughter got her dashing good looks, ", "Did you get a hair cut? It looks great, ", 
				"You look great, as always, ", "Wow, you look amazing today, "};
		int randomCompliment = (int)(Math.random()*array.length);
		System.out.println(array[randomCompliment] + name + "!");
		}
	public static void intruduceGame()
		{
		System.out.println();
		System.out.println("Today you're playing Sudoku. The object of the game to fill each column, row, and box "
				+ "with numbers 1-9. ");
		System.out.println("You can only have one of each number in each column, row, and box. Good luck!");
		System.out.println();
		}
	public static void askUser()
		{
		System.out.println("Go ahead and put in the spot you'd like to fill.");
		spot = userInput.nextLine();
		System.out.println("Now put in the number you'd like in that spot.");
		number = userInput.nextLine();
		}
	public static void assignTurn()
		{
		if (spot.equals("a1"))
			{
			if (Board.board[0][0].equals("   "))
				{
				Board.board[0][0] = " " + number + " ";
				}
			}
		if (spot.equals("a2"))
			{
			if (Board.board[0][1].equals("   "))
				{
				Board.board[0][1] = " " + number + " ";
				}
			}
		if (spot.equals("a3"))
			{
			if (Board.board[0][2].equals("   "))
				{
				Board.board[0][2] = " " + number + " ";
				}
			}
		if (spot.equals("a4"))
			{
			if (Board.board[0][3].equals("   "))
				{
				Board.board[0][3] = " " + number + " ";
				}
			}
		if (spot.equals("a5"))
			{
			if (Board.board[0][4].equals("   "))
				{
				Board.board[0][4] = " " + number + " ";
				}
			}
		if (spot.equals("a6"))
			{
			if (Board.board[0][5].equals("   "))
				{
				Board.board[0][5] = " " + number + " ";
				}
			}
		if (spot.equals("a7"))
			{
			if (Board.board[0][6].equals("   "))
				{
				Board.board[0][6] = " " + number + " ";
				}
			}
		if (spot.equals("a8"))
			{
			if (Board.board[0][7].equals("   "))
				{
				Board.board[0][7] = " " + number + " ";
				}
			}
		if (spot.equals("a9"))
			{
			if (Board.board[0][8].equals("   "))
				{
				Board.board[0][8] = " " + number + " ";
				}
			}
		if (spot.equals("b1"))
			{
			if (Board.board[1][0].equals("   "))
				{
				Board.board[1][0] = " " + number + " ";
				}
			}
		if (spot.equals("b2"))
			{
			if (Board.board[1][1].equals("   "))
				{
				Board.board[1][1] = " " + number + " ";
				}
			}
		if (spot.equals("b3"))
			{
			if (Board.board[1][2].equals("   "))
				{
				Board.board[1][2] = " " + number + " ";
				}
			}
		if (spot.equals("b4"))
			{
			if (Board.board[1][3].equals("   "))
				{
				Board.board[1][3] = " " + number + " ";
				}
			}
		if (spot.equals("b5"))
			{
			if (Board.board[1][4].equals("   "))
				{
				Board.board[1][4] = " " + number + " ";
				}
			}
		if (spot.equals("b6"))
			{
			if (Board.board[1][5].equals("   "))
				{
				Board.board[1][5] = " " + number + " ";
				}
			}
		if (spot.equals("b7"))
			{
			if (Board.board[1][6].equals("   "))
				{
				Board.board[1][6] = " " + number + " ";
				}
			}
		if (spot.equals("b8"))
			{
			if (Board.board[1][7].equals("   "))
				{
				Board.board[1][7] = " " + number + " ";
				}
			}
		if (spot.equals("b9"))
			{
			if (Board.board[1][7].equals("   "))
				{
				Board.board[1][7] = " " + number + " ";
				}
			}
		if (spot.equals("c1"))
			{
			if (Board.board[2][0].equals("   "))
				{
				Board.board[2][0] = " " + number + " ";
				}
			}
		if (spot.equals("c2"))
			{
			if (Board.board[2][1].equals("   "))
				{
				Board.board[2][1] = " " + number + " ";
				}
			}
		if (spot.equals("c3"))
			{
			if (Board.board[2][2].equals("   "))
				{
				Board.board[2][2] = " " + number + " ";
				}
			}
		if (spot.equals("c4"))
			{
			if (Board.board[2][3].equals("   "))
				{
				Board.board[2][3] = " " + number + " ";
				}
			}
		if (spot.equals("c5"))
			{
			if (Board.board[2][4].equals("   "))
				{
				Board.board[2][4] = " " + number + " ";
				}
			}
		if (spot.equals("c6"))
			{
			if (Board.board[2][5].equals("   "))
				{
				Board.board[2][5] = " " + number + " ";
				}
			}
		if (spot.equals("c7"))
			{
			if (Board.board[2][5].equals("   "))
				{
				Board.board[2][5] = " " + number + " ";
				}
			}
		if (spot.equals("c8"))
			{
			if (Board.board[2][7].equals("   "))
				{
				Board.board[2][7] = " " + number + " ";
				}
			}
		if (spot.equals("c9"))
			{
			if (Board.board[2][8].equals("   "))
				{
				Board.board[2][8] = " " + number + " ";
				}
			}
		if (spot.equals("d1"))
			{
			if (Board.board[3][0].equals("   "))
				{
				Board.board[3][0] = " " + number + " ";
				}
			}
		if (spot.equals("d2"))
			{
			if (Board.board[3][1].equals("   "))
				{
				Board.board[3][1] = " " + number + " ";
				}
			}
		if (spot.equals("d3"))
			{
			if (Board.board[3][2].equals("   "))
				{
				Board.board[3][2] = " " + number + " ";
				}
			}
		if (spot.equals("d4"))
			{
			if (Board.board[3][3].equals("   "))
				{
				Board.board[3][3] = " " + number + " ";
				}
			}
		if (spot.equals("d5"))
			{
			if (Board.board[3][4].equals("   "))
				{
				Board.board[3][4] = " " + number + " ";
				}
			}
		if (spot.equals("d6"))
			{
			if (Board.board[3][5].equals("   "))
				{
				Board.board[3][5] = " " + number + " ";
				}
			}
		if (spot.equals("d7"))
			{
			if (Board.board[3][6].equals("   "))
				{
				Board.board[3][6] = " " + number + " ";
				}
			}
		if (spot.equals("d8"))
			{
			if (Board.board[3][7].equals("   "))
				{
				Board.board[3][7] = " " + number + " ";
				}
			}
		if (spot.equals("d9"))
			{
			if (Board.board[3][8].equals("   "))
				{
				Board.board[3][8] = " " + number + " ";
				}
			}
		if (spot.equals("e1"))
			{
			if (Board.board[4][0].equals("   "))
				{
				Board.board[4][0] = " " + number + " ";
				}
			}
		if (spot.equals("e2"))
			{
			if (Board.board[4][1].equals("   "))
				{
				Board.board[4][1] = " " + number + " ";
				}
			}
		if (spot.equals("e3"))
			{
			if (Board.board[4][2].equals("   "))
				{
				Board.board[4][2] = " " + number + " ";
				}
			}
		if (spot.equals("e4"))
			{
			if (Board.board[4][3].equals("   "))
				{
				Board.board[4][3] = " " + number + " ";
				}
			}
		if (spot.equals("e5"))
			{
			if (Board.board[4][4].equals("   "))
				{
				Board.board[4][4] = " " + number + " ";
				}
			}
		if (spot.equals("e6"))
			{
			if (Board.board[4][5].equals("   "))
				{
				Board.board[4][5] = " " + number + " ";
				}
			}
		if (spot.equals("e7"))
			{
			if (Board.board[4][6].equals("   "))
				{
				Board.board[4][6] = " " + number + " ";
				}
			}
		if (spot.equals("e8"))
			{
			if (Board.board[4][7].equals("   "))
				{
				Board.board[4][7] = " " + number + " ";
				}
			}
		if (spot.equals("e9"))
			{
			if (Board.board[4][8].equals("   "))
				{
				Board.board[4][8] = " " + number + " ";
				}
			}
		if (spot.equals("f1"))
			{
			if (Board.board[5][0].equals("   "))
				{
				Board.board[5][0] = " " + number + " ";
				}
			}
		if (spot.equals("f2"))
			{
			if (Board.board[5][1].equals("   "))
				{
				Board.board[5][1] = " " + number + " ";
				}
			}
		if (spot.equals("f3"))
			{
			if (Board.board[5][2].equals("   "))
				{
				Board.board[5][2] = " " + number + " ";
				}
			}
		if (spot.equals("f4"))
			{
			if (Board.board[5][3].equals("   "))
				{
				Board.board[5][3] = " " + number + " ";
				}
			}
		if (spot.equals("f5"))
			{
			if (Board.board[5][4].equals("   "))
				{
				Board.board[5][4] = " " + number + " ";
				}
			}
		if (spot.equals("f6"))
			{
			if (Board.board[5][5].equals("   "))
				{
				Board.board[5][5] = " " + number + " ";
				}
			}
		if (spot.equals("f7"))
			{
			if (Board.board[5][6].equals("   "))
				{
				Board.board[5][6] = " " + number + " ";
				}
			}
		if (spot.equals("f8"))
			{
			if (Board.board[5][7].equals("   "))
				{
				Board.board[5][7] = " " + number + " ";
				}
			}
		if (spot.equals("f9"))
			{
			if (Board.board[5][8].equals("   "))
				{
				Board.board[5][8] = " " + number + " ";
				}
			}
		if (spot.equals("g1"))
			{
			if (Board.board[6][0].equals("   "))
				{
				Board.board[6][0] = " " + number + " ";
				}
			}
		if (spot.equals("g2"))
			{
			if (Board.board[6][1].equals("   "))
				{
				Board.board[6][1] = " " + number + " ";
				}
			}
		if (spot.equals("g3"))
			{
			if (Board.board[6][2].equals("   "))
				{
				Board.board[6][2] = " " + number + " ";
				}
			}
		if (spot.equals("g4"))
			{
			if (Board.board[6][3].equals("   "))
				{
				Board.board[6][3] = " " + number + " ";
				}
			}
		if (spot.equals("g5"))
			{
			if (Board.board[6][4].equals("   "))
				{
				Board.board[6][4] = " " + number + " ";
				}
			}
		if (spot.equals("g6"))
			{
			if (Board.board[6][5].equals("   "))
				{
				Board.board[6][5] = " " + number + " ";
				}
			}
		if (spot.equals("g7"))
			{
			if (Board.board[6][6].equals("   "))
				{
				Board.board[6][6] = " " + number + " ";
				}
			}
		if (spot.equals("g8"))
			{
			if (Board.board[6][7].equals("   "))
				{
				Board.board[6][7] = " " + number + " ";
				}
			}
		if (spot.equals("g9"))
			{
			if (Board.board[6][8].equals("   "))
				{
				Board.board[6][8] = " " + number + " ";
				}
			}
		if (spot.equals("h1"))
			{
			if (Board.board[7][0].equals("   "))
				{
				Board.board[7][0] = " " + number + " ";
				}
			}
		if (spot.equals("h2"))
			{
			if (Board.board[7][1].equals("   "))
				{
				Board.board[7][1] = " " + number + " ";
				}
			}
		if (spot.equals("h3"))
			{
			if (Board.board[7][2].equals("   "))
				{
				Board.board[7][2] = " " + number + " ";
				}
			}
		if (spot.equals("h4"))
			{
			if (Board.board[7][3].equals("   "))
				{
				Board.board[7][3] = " " + number + " ";
				}
			}
		if (spot.equals("h5"))
			{
			if (Board.board[7][4].equals("   "))
				{
				Board.board[7][4] = " " + number + " ";
				}
			}
		if (spot.equals("h6"))
			{
			if (Board.board[7][5].equals("   "))
				{
				Board.board[7][5] = " " + number + " ";
				}
			}
		if (spot.equals("h7"))
			{
			if (Board.board[7][6].equals("   "))
				{
				Board.board[7][6] = " " + number + " ";
				}
			}
		if (spot.equals("h8"))
			{
			if (Board.board[7][7].equals("   "))
				{
				Board.board[7][7] = " " + number + " ";
				}
			}
		if (spot.equals("h9"))
			{
			if (Board.board[7][8].equals("   "))
				{
				Board.board[7][8] = " " + number + " ";
				}
			}
		if (spot.equals("i1"))
			{
			if (Board.board[8][0].equals("   "))
				{
				Board.board[8][0] = " " + number + " ";
				}
			}
		if (spot.equals("i2"))
			{
			if (Board.board[8][1].equals("   "))
				{
				Board.board[8][1] = " " + number + " ";
				}
			}
		if (spot.equals("i3"))
			{
			if (Board.board[8][2].equals("   "))
				{
				Board.board[8][2] = " " + number + " ";
				}
			}
		if (spot.equals("i4"))
			{
			if (Board.board[8][3].equals("   "))
				{
				Board.board[8][3] = " " + number + " ";
				}
			}
		if (spot.equals("i5"))
			{
			if (Board.board[8][4].equals("   "))
				{
				Board.board[8][4] = " " + number + " ";
				}
			}
		if (spot.equals("i6"))
			{
			if (Board.board[8][5].equals("   "))
				{
				Board.board[8][5] = " " + number + " ";
				}
			}
		if (spot.equals("i7"))
			{
			if (Board.board[8][6].equals("   "))
				{
				Board.board[8][6] = " " + number + " ";
				}
			}
		if (spot.equals("i8"))
			{
			if (Board.board[8][7].equals("   "))
				{
				Board.board[8][7] = " " + number + " ";
				}
			}
		if (spot.equals("i9"))
			{
			if (Board.board[8][8].equals("   "))
				{
				Board.board[8][8] = " " + number + " ";
				}
			}
		}

	}