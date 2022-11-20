package guesserGame;

import java.util.Random;
import java.util.Scanner;

public class guessGame {

	public static void main(String[] args) {
//	random number 
		Random ranNo = new Random();
		
		int randomNumber = ranNo.nextInt(30) + 1;
//	System.out.println("Number by system :" + randomNumber);
//		count1,count2,count3 to store the number of attempts by the player to guess the number
//	if attempts are less player will winn
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
//		input numbers from the player1
		while(true) {System.out.print("Player1 Enter your guess (1-30) : ");		
		
		Scanner scan = new Scanner(System.in);
		
		int playerGuess1 = scan.nextInt();
		count1++;
//		to check if the player guess the correct number
				
	if (playerGuess1 == randomNumber) {
		
		System.out.println("Correct! It took you "+ count1 + " tries.");
		break;
		
	}else if(randomNumber> playerGuess1){
		System.out.println("Nope! your number is lower");
		
	}else {
		System.out.println("Nope! your number is higher");		
			}
	}
		
		
//		input numbers by player2
	while(true) {System.out.print("Player2 Enter your guess (1-30) : ");
		Scanner scan = new Scanner(System.in);
		
		int playerGuess2 = scan.nextInt();
		count2++;
		
	if (playerGuess2 == randomNumber) {
		
		System.out.println("Correct! It took you "+ count2 + " tries");
		break;
		
	}else if(randomNumber> playerGuess2){
		System.out.println("Nope! your number is lower");
		
	}else {
		System.out.println("Nope! your number is higher");		
			}
		}
	
//	input numbers by player3
while(true) {System.out.print("Player3 Enter your guess (1-30) : ");
	Scanner scan = new Scanner(System.in);
	
	int playerGuess3 = scan.nextInt();
	count3++;
	
if (playerGuess3 == randomNumber) {
	
	System.out.println("Correct! It took you "+ count3 + " tries");
	break;
	
}else if(randomNumber> playerGuess3){
	System.out.println("Nope! your number is lower");
	
}else {
	System.out.println("Nope! your number is higher");		
		}
	}

 // compare to see who won the match
	if (count1==count2&& count2==count3) {
		System.out.println("Match is a tie");
		
	}else if(count1==count2&& count3<count2) {
		System.out.println("Player3 won the match");
	}
	else if(count1==count2&& count3>count2) {
		System.out.println("Match is a tie between Player1 and Player2");
	}
	else if(count1==count3&& count2<count3) {
		System.out.println("Player2 won the match");
	}
	else if(count1==count3&& count2>count3) {
		System.out.println("Match is a tie between Player1 and Player3");
	}
	else if(count3==count2&& count1<count3) {
		System.out.println("Player1 won the match");
	}
	else if(count3==count2&& count1>count3) {
		System.out.println("Match is a tie between Player2 and Player3");
	}
	
	else if(count1<count2&& count1<count3) {
		System.out.println("Player1 won the match");
	}
	else if(count2<count1&& count2<count3) {
			System.out.println("Player2 won the match");
	}
	else if(count3<count2&& count3<count1) {
		System.out.println("Player3 won the match");
    }
		
		System.out.println("Number by system :" + randomNumber);
	}
	
	}

