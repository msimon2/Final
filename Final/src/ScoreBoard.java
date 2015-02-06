import java.util.*;


public class ScoreBoard
	{
	static ArrayList <ScoreBoard>board = new ArrayList<ScoreBoard>();
	String names;
	int scores;
	public ScoreBoard (String bc, int ab)
		{
		scores = ab;
		names = bc;
		}
	public String getNames()
		{
		return names;
		}
	public void setNames(String names)
		{
		this.names = names;
		}
	public int getScores()
		{
		return scores;
		}
	public void setScores(int scores)
		{
		this.scores = scores;
		}
	public static void addNames()
		{
		System.out.println("Here's the current scoreboard: ");
		board.add(new ScoreBoard("Joe", 90));
		board.add(new ScoreBoard("Andy", 106));
		board.add(new ScoreBoard("Sarah", 82)); 
		board.add(new ScoreBoard("Kate", 127));
		for (int i=0; i<board.size(); i++)
			{
			System.out.println(board.get(i).getNames() + " has a score of " + board.get(i).getScores());
			}
		board.add(new ScoreBoard(PlayerTurn.name, GameRunner.score));
		}
	}