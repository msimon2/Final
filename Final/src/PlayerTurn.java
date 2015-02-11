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
			Board.board[0][0] = " " + number + " ";
			}
		if (spot.equals("a2"))
			{
			Board.board[0][1] = " " + number + " ";
			}
		if (spot.equals("a3"))
			{
			Board.board[0][2] = " " + number + " ";
			}
		if (spot.equals("a4"))
			{
			Board.board[0][3] = " " + number + " ";
			}
		if (spot.equals("a5"))
			{
			Board.board[0][4] = " " + number + " ";
			}
		if (spot.equals("a6"))
			{
			Board.board[0][5] = " " + number + " ";
			}
		if (spot.equals("a7"))
			{
			Board.board[0][6] = " " + number + " ";
			}
		if (spot.equals("a8"))
			{
			Board.board[0][7] = " " + number + " ";
			}
		if (spot.equals("a9"))
			{
			Board.board[0][8] = " " + number + " ";
			}
		if (spot.equals("b1"))
			{
			Board.board[1][0] = " " + number + " ";
			}
		if (spot.equals("b2"))
			{
			Board.board[1][1] = " " + number + " ";
			}
		if (spot.equals("b3"))
			{
			Board.board[1][2] = " " + number + " ";
			}
		if (spot.equals("b4"))
			{
			Board.board[1][3] = " " + number + " ";
			}
		if (spot.equals("b5"))
			{
			Board.board[1][4] = " " + number + " ";
			}
		if (spot.equals("b6"))
			{
			Board.board[1][5] = " " + number + " ";
			}
		if (spot.equals("b7"))
			{
			Board.board[1][6] = " " + number + " ";
			}
		if (spot.equals("b8"))
			{
			Board.board[1][7] = " " + number + " ";
			}
		if (spot.equals("b9"))
			{
			Board.board[1][8] = " " + number + " ";
			}
		if (spot.equals("c1"))
			{
			Board.board[2][0] = " " + number + " ";
			}
		if (spot.equals("c2"))
			{
			Board.board[2][1] = " " + number + " ";
			}
		if (spot.equals("c3"))
			{
			Board.board[2][2] = " " + number + " ";
			}
		if (spot.equals("c4"))
			{
			Board.board[2][3] = " " + number + " ";
			}
		if (spot.equals("c5"))
			{
			Board.board[2][4] = " " + number + " ";
			}
		if (spot.equals("c6"))
			{
			Board.board[2][5] = " " + number + " ";
			}
		if (spot.equals("c7"))
			{
			Board.board[2][6] = " " + number + " ";
			}
		if (spot.equals("c8"))
			{
			Board.board[2][7] = " " + number + " ";
			}
		if (spot.equals("c9"))
			{
			Board.board[2][8] = " " + number + " ";
			}
		if (spot.equals("d1"))
			{
			Board.board[3][0] = " " + number + " ";
			}
		if (spot.equals("d2"))
			{
			Board.board[3][1] = " " + number + " ";
			}
		if (spot.equals("d3"))
			{
			Board.board[3][2] = " " + number + " ";
			}
		if (spot.equals("d4"))
			{
			Board.board[3][3] = " " + number + " ";
			}
		if (spot.equals("d5"))
			{
			Board.board[3][4] = " " + number + " ";
			}
		if (spot.equals("d6"))
			{
			Board.board[3][5] = " " + number + " ";
			}
		if (spot.equals("d7"))
			{
			Board.board[3][6] = " " + number + " ";
			}
		if (spot.equals("d8"))
			{
			Board.board[3][7] = " " + number + " ";
			}
		if (spot.equals("d9"))
			{
			Board.board[3][8] = " " + number + " ";
			}
		if (spot.equals("e1"))
			{
			Board.board[4][0] = " " + number + " ";
			}
		if (spot.equals("e2"))
			{
			Board.board[4][1] = " " + number + " ";
			}
		if (spot.equals("e3"))
			{
			Board.board[4][2] = " " + number + " ";
			}
		if (spot.equals("e4"))
			{
			Board.board[4][3] = " " + number + " ";
			}
		if (spot.equals("e5"))
			{
			Board.board[4][4] = " " + number + " ";
			}
		if (spot.equals("e6"))
			{
			Board.board[4][5] = " " + number + " ";
			}
		if (spot.equals("e7"))
			{
			Board.board[4][6] = " " + number + " ";
			}
		if (spot.equals("e8"))
			{
			Board.board[4][7] = " " + number + " ";
			}
		if (spot.equals("e9"))
			{
			Board.board[4][8] = " " + number + " ";
			}
		if (spot.equals("f1"))
			{
			Board.board[5][0] = " " + number + " ";
			}
		if (spot.equals("f2"))
			{
			Board.board[5][1] = " " + number + " ";
			}
		if (spot.equals("f3"))
			{
			Board.board[5][2] = " " + number + " ";
			}
		if (spot.equals("f4"))
			{
			Board.board[5][3] = " " + number + " ";
			}
		if (spot.equals("f5"))
			{
			Board.board[5][4] = " " + number + " ";
			}
		if (spot.equals("f6"))
			{
			Board.board[5][5] = " " + number + " ";
			}
		if (spot.equals("f7"))
			{
			Board.board[5][6] = " " + number + " ";
			}
		if (spot.equals("f8"))
			{
			Board.board[5][7] = " " + number + " ";
			}
		if (spot.equals("f9"))
			{
			Board.board[5][8] = " " + number + " ";
			}
		if (spot.equals("g1"))
			{
			Board.board[6][0] = " " + number + " ";
			}
		if (spot.equals("g2"))
			{
			Board.board[6][1] = " " + number + " ";
			}
		if (spot.equals("g3"))
			{
			Board.board[6][2] = " " + number + " ";
			}
		if (spot.equals("g4"))
			{
			Board.board[6][3] = " " + number + " ";
			}
		if (spot.equals("g5"))
			{
			Board.board[6][4] = " " + number + " ";
			}
		if (spot.equals("g6"))
			{
			Board.board[6][5] = " " + number + " ";
			}
		if (spot.equals("g7"))
			{
			Board.board[6][6] = " " + number + " ";
			}
		if (spot.equals("g8"))
			{
			Board.board[6][7] = " " + number + " ";
			}
		if (spot.equals("g9"))
			{
			Board.board[6][8] = " " + number + " ";
			}
		if (spot.equals("h1"))
			{
			Board.board[7][0] = " " + number + " ";
			}
		if (spot.equals("h2"))
			{
			Board.board[7][1] = " " + number + " ";
			}
		if (spot.equals("h3"))
			{
			Board.board[7][2] = " " + number + " ";
			}
		if (spot.equals("h4"))
			{
			Board.board[7][3] = " " + number + " ";
			}
		if (spot.equals("h5"))
			{
			Board.board[7][4] = " " + number + " ";
			}
		if (spot.equals("h6"))
			{
			Board.board[7][5] = " " + number + " ";
			}
		if (spot.equals("h7"))
			{
			Board.board[7][6] = " " + number + " ";
			}
		if (spot.equals("h8"))
			{
			Board.board[7][7] = " " + number + " ";
			}
		if (spot.equals("h9"))
			{
			Board.board[7][8] = " " + number + " ";
			}
		if (spot.equals("i1"))
			{
			Board.board[8][0] = " " + number + " ";
			}
		if (spot.equals("i2"))
			{
			Board.board[8][1] = " " + number + " ";
			}
		if (spot.equals("i3"))
			{
			Board.board[8][2] = " " + number + " ";
			}
		if (spot.equals("i4"))
			{
			Board.board[8][3] = " " + number + " ";
			}
		if (spot.equals("i5"))
			{
			Board.board[8][4] = " " + number + " ";
			}
		if (spot.equals("i6"))
			{
			Board.board[8][5] = " " + number + " ";
			}
		if (spot.equals("i7"))
			{
			Board.board[8][6] = " " + number + " ";
			}
		if (spot.equals("i8"))
			{
			Board.board[8][7] = " " + number + " ";
			}
		if (spot.equals("i9"))
			{
			Board.board[8][8] = " " + number + " ";
			}
		}
	}