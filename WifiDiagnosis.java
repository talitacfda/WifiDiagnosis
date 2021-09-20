/*
 * Class: CMSC203 
 * Instructor:
 * Description: (This program helps when you do not have connectivity. )
 * Due: 09/20/2021
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Talita Araujo
*/

import java.util.Scanner; //Needed for the Scanner class

public class WifiDiagnosis {
public static void main(String[] args) {
		
		// Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner (System.in);
		
		//Display message
		System.out.println("If you have a problem with internet connectivity," +
		"WiFi Diagnosis might work.");
		
		System.out.println("Reboot your computer.");
		
		System.out.println("Are you able to connect with the internet?"+
		"(yes or no)");
		
		//To hold the user's input
		String awnser = keyboard.nextLine();
		
		
		//loop to control the right answer
		while(!awnser.equals("yes") && !awnser.equals("no")) {
			
			System.out.println("Please, type yes or no");
			System.out.println("Are you able to connect with the internet?"+
			"yes or no");
			awnser= keyboard.nextLine();
			}
			

			
			if(awnser.equals("no")) {
			System.out.println("reboot you router");
			System.out.println("Are you able to connect with the internet?" +
					"yes or no?");
			awnser= keyboard.nextLine();
			
			while(!awnser.equals("yes") && !awnser.equals("no")) {
			
			System.out.println("Please, type yes or no");
			System.out.println("Are you able to connect with the internet?"+
			"yes or no");
			awnser= keyboard.nextLine();
			}
		}
		
		if(awnser.equals("no"))
		{
			System.out.println("Make sure the clables to your router are plugged"+
		"in firmly and your router is getting power");
			System.out.println("Are you able to connect with the internet?" +
					"yes or no?");
			awnser= keyboard.nextLine();
		}
		
	while(!awnser.equals("yes") && !awnser.equals("no")) {
			
			System.out.println("Please, type yes or no");
			System.out.println("Are you able to connect with the internet?"+
			"yes or no");
			awnser= keyboard.nextLine();
	}
		if(awnser.equals("no"))
		{
			System.out.println("move your computer closer to your router");
			System.out.println("Are you able to connect with the internet?" +
					"yes or no?");
			awnser= keyboard.nextLine();
		}
		
	while(!awnser.equals("yes") && !awnser.equals("no")) {
			
			System.out.println("Please, type yes or no");
			System.out.println("Are you able to connect with the internet?"+
			"yes or no");
			awnser= keyboard.nextLine();
	}
		
		if(awnser.equals("no"))
		{
			System.out.println("contact your ISP");
			System.out.println("Make sure your ISP is hooked to your router");
			
		}
			
		if(awnser.equals("yes"))
		{
			System.out.println("Reboot your computer seemed to work");
		}
		 
			
			
		 
		 
	}
}


