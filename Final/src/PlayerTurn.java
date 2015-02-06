import java.util.*;

public class PlayerTurn
	{
	static boolean isWon = true;
	static Scanner userInput = new Scanner(System.in);
	static String spot;
	static String number;
	public static void greetUser()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		String[] array = {"You look lovely today, ", "What a nice shirt you've got on, ", "Looks like you've lost those last few pounds, ", 
				"Now I know where your daughter got her dashing good looks, ", "Did you get a hair cut? It looks great, ", 
				"You look great, as always, ", "Did you sleep last night? You look gross, "};
		int randomCompliment = (int)(Math.random()*array.length);
		System.out.println(array[randomCompliment] + name + ".");
		}
	public static void askForTurn()
		{
		System.out.println();
		System.out.println("Today you're playing Sudoku. The object of the game to fill each column, row, and box "
				+ "with numbers 1-4. ");
		System.out.println("You can only have one of each number in each column, row, and box. Good luck!");
		System.out.println();
		}
	public static void assignTurn()
		{
		System.out.println("Go ahead and put in the spot you'd like to fill.");
		spot = userInput.nextLine();
		System.out.println("Now put in the number you'd like in that spot.");
		number = userInput.nextLine();
		if (spot.equals("a1"))
			{
			if (Board.board[0][0].equals("   "))
				{
				Board.board[0][0] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		if (spot.equals("a2"))
			{
			if (Board.board[0][1].equals("   "))
				{
				Board.board[0][1] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		if (spot.equals("a3"))
			{
			if (Board.board[0][2].equals("   "))
				{
				Board.board[0][2] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		if (spot.equals("a4"))
			{
			if (Board.board[0][3].equals("   "))
				{
				Board.board[0][3] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		if (spot.equals("b1"))
			{
			if (Board.board[1][0].equals("   "))
				{
				Board.board[1][0] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		if (spot.equals("b2"))
			{
			if (Board.board[1][1].equals("   "))
				{
				Board.board[1][1] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		if (spot.equals("b3"))
			{
			if (Board.board[1][2].equals("   "))
				{
				Board.board[1][2] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		if (spot.equals("b4"))
			{
			if (Board.board[1][3].equals("   "))
				{
				Board.board[1][3] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		if (spot.equals("c1"))
			{
			if (Board.board[2][0].equals("   "))
				{
				Board.board[2][0] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		if (spot.equals("c2"))
			{
			if (Board.board[2][1].equals("   "))
				{
				Board.board[2][1] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		if (spot.equals("c3"))
			{
			if (Board.board[2][2].equals("   "))
				{
				Board.board[2][2] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		if (spot.equals("c4"))
			{
			if (Board.board[2][3].equals("   "))
				{
				Board.board[2][3] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		if (spot.equals("d1"))
			{
			if (Board.board[3][0].equals("   "))
				{
				Board.board[3][0] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		if (spot.equals("d2"))
			{
			if (Board.board[3][1].equals("   "))
				{
				Board.board[3][1] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		if (spot.equals("d3"))
			{
			if (Board.board[3][2].equals("   "))
				{
				Board.board[3][2] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		if (spot.equals("d4"))
			{
			if (Board.board[3][3].equals("   "))
				{
				Board.board[3][3] = " " + number + " ";
				}
			else
				{
				System.out.println("you can't do that!");
				assignTurn();
				}
			}
		}
	}