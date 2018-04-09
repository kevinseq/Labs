/*
	Program Name: Paper, Scissor and Rock Varsion 1.0
	Initially Created by: Dr.Wenjia Li
	Finished By: Kevin Sequeira
	Date: 04/05/2018
	Lab number: 8 Exception Handling II

*/

import javax.swing.JOptionPane;

public class FirstRPSGame{

	public static void main(String args[]) throws GreaterThan2Exception {

		//Variable Declaration 
		int yourChoice;
		int computerChoice;
		String yourInput = "";

		//This is the welcome screen and shows the basic rule to the user.
		JOptionPane.showMessageDialog(null,"Welcome to Rock, Paper and Scissors");
		JOptionPane.showMessageDialog(null,"Let me remind you the rules first:\n1. Scissor cuts paper.\n2. Paper covers rock.\n3. Rock beats scissors.");
		JOptionPane.showMessageDialog(null,"0: Rock\n1: Paper\n2: Scissor");

		//Get your choice 
		int x = 0;
		do{
			try{
				yourInput = JOptionPane.showInputDialog("Now Tell me your choice!");
				yourChoice = Integer.parseInt(yourInput);
				
				if (yourInput == null)  {
			        throw new Exception();
			    } else if (yourChoice > 2) {
			    		throw new GreaterThan2Exception();
			    } else {
				
				
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
					}
					
					//CASE II: You Win!
					else if((yourChoice == 0 && computerChoice == 2) || (yourChoice == 1 && computerChoice == 0) || (yourChoice == 2 && computerChoice == 1) ) {
						JOptionPane.showMessageDialog(null,"You win!");
					} 
					
					else{
						JOptionPane.showMessageDialog(null,"You Lose!");
					}
					
					
					x += 1;
				}	
			}
			
			catch(GreaterThan2Exception e){
				JOptionPane.showMessageDialog(null,e.getMessage());
			} 
			
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"You did not enter any integer, Please enter an integer");
			}
		} while(x == 0);

	}
}

public class GreaterThan2Exception extends Exception {

	public GreaterThan2Exception(){
		super("You entered a number greater than 2" + "\n" + "Please enter a number between 0-2!!");
	}
}
