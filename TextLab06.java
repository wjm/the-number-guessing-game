//TextLab06Wang.java
//100 + extra version of TextLab06.

//I attempt the 100 and the extra version.
//You can enter you own game first and last number.

import java.util.Scanner; 
import java.util.Random;
public class TextLab06
{
	public static void main(String args[])
	{
		System.out.println("Welcome to the number guessing game!");
		
		RepeatGuessingGame n = new RepeatGuessingGame();
		n.repeat();//To start the game
	}
}
class NumberGuessingGame
{
	Scanner input;
	int a;
	int b;
	public NumberGuessingGame()//Defult constrctor
	{
		 input=new Scanner(System.in);
	}
	public void playGame()//The main game.
	{
		System.out.println("please choose the number from the first to the end!");
		System.out.print("First Number : ");
		a = input.nextInt();
		System.out.print("Last Number : ");
		b = input.nextInt();
		int r = getRandom();
		int g = getGuess();
		while(g!=r)
		{
			checkGuess(g,r);
			g=input.nextInt();
		}
	System.out.println("You guessed correctly! You Win!!!");
	}
	public int getRandom()//get the random number.
	{
		Random rand = new Random();
		return rand.nextInt(b+1-a)+a;
	}
	public int getGuess()//get the player's guess number.
	{
		System.out.print("The number you guess between "+a+ " and " +b+" ----> ");
	    return input.nextInt();
	}
	public void checkGuess(int guess,int ran)//check the guess and the random number.
	{
		if(guess>ran)
			System.out.print("You guess is too high. Guess again:");
		if(guess<ran)
			System.out.print("You guess is too low. Guess again:");
	}
}
//add a class for the 90 point version
class RepeatGuessingGame extends NumberGuessingGame
{
	public RepeatGuessingGame()
	{
		super();
	}
	public void repeat()//This use for repeat the game.
		{
		String r="y";
		while(r.equals("y"))
		{
		this.playGame();
		System.out.print("Play again? (y/n)");
		r=input.next();
		
		}
	}
}
//add a subclass for the 100 point version
