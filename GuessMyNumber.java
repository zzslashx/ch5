import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
	
        int number = random.nextInt(100) + 1;
        int guess=0;
        int amountOff =  Math.abs(number - guess);
		System.out.println("I'm thinking of a number between 1 and 100(inclusive) Can you guess what it is?");
		
		while(amountOff>0){
			
	
		System.out.print("Type a number: \n");	
		guess = scanner.nextInt();
		System.out.println("Your guess is: " + guess);
			amountOff = Math.abs(number - guess);
		if(guess>number){
			System.out.println("too high! try again");
			}
		if(guess<number){
			System.out.println("Too low! Try again");
			}
		if(guess==number){
			System.out.println("you're right! you guess it!");
			}
	}	
		
	}
}
