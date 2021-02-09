/*
 * Class: CMSC203 
 * Instructor: Khandan Vahabzadeh
 * Description:  public class WifiDiagnosis goes through a serie of yes or no question to a user to figure out a way to successfully diagnose his/her wiFi and problem associated with it.
 * Due: 2/09/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Yvan Tresor Ebiketie
*/
// package+import+public class

package assignment1;
import java.util.Scanner;
public class WifiDiagnosis
{
	private Scanner scan;
public static void main ( String [] args) 
	
{
		// WiFi Troubleshooting introduction
		
		System.out.println( " If you have a problem with internet connectivity, this wifi Diagnosis might be able to help.\n");
		
		// Calling the WiFiDiagnosis function
		
		WifiDiagnosis diagnosis = new WifiDiagnosis();
		diagnosis.WifiTroubleShoot();
		
}
	
	public void WifiTroubleShoot()
	
	{
		scan = new Scanner( System.in);
		
			//first step, rebooting the computer
	
		System.out.println( "First step: reboot your computer");
		System.out.println ("Are you able to connect to the internet? (yes or no): ");
		String pick= scan.nextLine().trim();
		while(!pick.equals("yes") && !pick.equals("no"))
	 
	{
		 System.out.println("Please enter yes or no!\n");
		System.out.print("Are you able to connect with the internet? (yes or no): ");
		pick = scan.nextLine().trim();
	}
		if(pick.equals("yes"))
	  {
		System.out.println("Rebooting your computer seemed to work");
		return;
	  }
		 
            // 2nd step, reboot and try to connect
		
		System.out.println("Second step: reboot your router");
		System.out.print("Now are you able to connect with the internet? (yes or no): ");
		pick = scan.nextLine().trim();
		while(!pick.equals("yes") && !pick.equals("no"))
		
	{
		System.out.println("Please enter yes or no!\n");
		System.out.print("Now are you able to connect with the internet? (yes or no): ");
		pick = scan.nextLine().trim();
		
	}
		if(pick.equals("yes"))
		{
		System.out.println("Rebooting your router seemed to work");
		return;
	    }
		  
		// 3rd step, making sure the cables are plugged
		
		System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
		System.out.print("Now are you able to connect with the internet? (yes or no): ");
		pick = scan.nextLine().trim();
		while(!pick.equals("yes") && !pick.equals("no"))
	{
		System.out.println("Please enter yes or no!\n");
		System.out.print("Now are you able to connect with the internet? (yes or no): ");
		pick = scan.nextLine().trim();
	}
		if(pick.equals("yes"))
		{
		   System.out.println("Checking the router's cables seemed to work");
		    return;
		}
		  
		// 4th step, get computer closer to router
		
		System.out.println("Fourth step: move your computer closer to your router");
		System.out.print("Now are you able to connect with the internet? (yes or no): ");
		pick = scan.nextLine().trim();
		while(!pick.equalsIgnoreCase("yes") && !pick.equals("no"))
	{
		System.out.println("Please enter yes or no!\n");
		System.out.print("Now are you able to connect with the internet? (yes or no): ");
		pick = scan.nextLine().trim();
	}
		if(pick.equals("yes"))
			
	{
		System.out.println("Moving your computer closer to the router seemed to work");
		return;
	}
		  
		// 5th step, contact ISP if the first four steps are not working
		
		System.out.println("Fifth step: contact your ISP");
		System.out.println("Make sure your ISP is hooked up to your router.");
	
	}
		}

		
		
		
		  
		