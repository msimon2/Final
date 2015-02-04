import java.util.*;

public class PlayerTurn
	{
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
		}
	}
