
/*
	Name: Khushbu D. Vyas, Andrew Tscherne, Kevin Sequeira
	Course No. and Section: CSCI 504 (Computer Programming II)
	Instructor Name: Dr.Wenjia Li
	Date: 04/24/2018

*/


//Imports the Package
import javax.swing.JOptionPane;

public class Driver {
	
	//A method that shows the description of the game
	public static void showIntroduction() {
		//This is the welcome screen and shows the basic rule to the user.
		JOptionPane.showMessageDialog(null,"Welcome to Rock, Paper and Scissors");
		JOptionPane.showMessageDialog(null,"Let me remind you the rules first:\n1. Scissor cuts paper.\n2. Paper covers rock.\n3. Rock beats scissors.");
		JOptionPane.showMessageDialog(null,"Either type: \n1.Rock\n2.Paper\n3.Scissors");
	}
	
	
	public static void gameGenerator() {
		
				//Variable Declaration 
				int yourChoice;
				int computerChoice;
				int yourWins = 0;
				int yourLosses = 0;
				int yourTies = 0;
				int gamesPlayed = 0;
				String yourInput;
				String[] rounds = new String[0];
				

		//Get your choice 
		int x = 0;
		do{
			try{
				
				
				//Get user input
				yourInput = JOptionPane.showInputDialog("Now Tell me your choice for round number: " + (gamesPlayed + 1));
				
				//Convert string choice to a number for easy comparison
				if (yourInput.equalsIgnoreCase("rock")) {
					yourChoice = 0;
				} else if (yourInput.equalsIgnoreCase("paper")) {
					yourChoice= 1;
				} else if (yourInput.equalsIgnoreCase("scissors")) {
					yourChoice = 2;
				} else {
					throw new NotStringException();
				}
				
				
				String score;
				
				//Get computers choice
				//Generates a random number.
				computerChoice = (int)(Math.random()*10);
				
				//This gives the remainder when we divide the computersChoice by 3.
				computerChoice %= 3;
				System.out.println(computerChoice);
	
				//Compare your choice with computers choice and output the result.
				//CASE I: Both you and computer pick the same choice, then it's a tie!
				if(yourChoice == computerChoice) {
					JOptionPane.showMessageDialog(null,"Its a Tie");
					yourTies += 1;
					score = "It was a tie!";
				}
					
					
				//CASE II: You Win!
				else if((yourChoice == 0 && computerChoice == 2) || (yourChoice == 1 && computerChoice == 0) || (yourChoice == 2 && computerChoice == 1) ) {
					JOptionPane.showMessageDialog(null,"You win!");
					yourWins += 1;
					score = "The user won!";
				} 
				
				else{
					JOptionPane.showMessageDialog(null,"You Lose!");
					yourLosses += 1;
					score = "The computer won!";
				}
				
				//Change computer to words
				String computerInput;
				if (computerChoice == 0) {
					computerInput = "rock";
				} else if (computerChoice == 1) {
					computerInput = "paper";
				} else {
					computerInput = "scissors";
				}
				
				//Add game record
				String[] tempArray = new String[rounds.length];
				for (int i = 0; i < tempArray.length; i++) {
					tempArray[i] = rounds[i];
				}
					
				rounds = new String[tempArray.length + 1];
				for (int j = 0; j < tempArray.length; j++) {
					rounds[j] = tempArray[j];
				}
				rounds[rounds.length - 1] = "In Round: " + (gamesPlayed+1) + "\nYou chose " + yourInput + " and the computer chose " + computerInput + ". \n" + score + "\n";
				
					
					
					
				//Check if they want to play again
				int y = 0;
				do {
					String temp = JOptionPane.showInputDialog("Would you like to continue ? Type Yes or No.");
					try {
						if(temp.equalsIgnoreCase("yes")) {
							x = 0;
							y += 1;
						} else if(temp.equalsIgnoreCase("no")) {
							x += 1;
							y += 1;
						} else {
							throw new NotStringException();
						}
						gamesPlayed += 1;
					}
						catch(Exception e){
							JOptionPane.showMessageDialog(null,e.getMessage());
						}
					} while(y == 0);		
			}
				
			
			catch(Exception e){
				JOptionPane.showMessageDialog(null,e.getMessage());
			} 
			
			
		
		} while(x == 0);
		
		//Display statistics
		JOptionPane.showMessageDialog(null,"Your Wins: " + yourWins + "\nYour Losses: " + yourLosses + "\nYour Ties: " + yourTies + "\nGames Played: " + gamesPlayed);
		
		String games = "";
		for (int i = 0; i < rounds.length; i++) {
			games += rounds[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, games);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
				
				//Calling the two methods
				showIntroduction();
				gameGenerator();
				
			}
	}

	
public class NotStringException extends Exception {
	
	public NotStringException() {
		super("Please choose only from the options provided!");
	}
}



