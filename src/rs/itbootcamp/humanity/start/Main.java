package rs.itbootcamp.humanity.start;

import java.io.IOException;
import java.util.Scanner;

import rs.itbootcamp.humanity.page.tests.automatic.HumanityAddNewEmployeesApachePOI;
import rs.itbootcamp.humanity.page.tests.automatic.HumanityLoginTestsApachePOI;
import rs.itbootcamp.humanity.page.tests.automatic.HumanityLoginTestsUnsuccessfullApachePOI;
import rs.itbootcamp.humanity.page.tests.manual.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.manual.HumanityLoginTests;
import rs.itbootcamp.humanity.page.tests.manual.HumanityLoginTestsUnsuccessfull;
import rs.itbootcamp.humanity.page.tests.manual.HumanityMenuVersionTest;
import rs.itbootcamp.humanity.page.tests.manual.HumanityMenyProfileTest;
import rs.itbootcamp.humanity.page.tests.manual.HumanitySettingsTests;
import rs.itbootcamp.humanity.page.utility.ChristmasTree;

public class Main {

	public static final int SEGMENTS = 4;
	public static final int HEIGHT = 4;
		
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Scanner sc=new Scanner(System.in);
		int menu; //this variable will be the choice of the user
		do {
			System.out.println("Wellcome to the TestInc test framework!");
			System.out.println("This application will give you the opportunity to test out");
			System.out.println("some functionalities of the humanity.com website");
			System.out.println("These are your options");
			System.out.println("1 - Manual tests with preselected data");
			System.out.println("2 - Automatic tests with preselected data from excel database Data.xls");
			System.out.println("0 - Exit the testing framework");
			
			menu =sc.nextInt(); //user inputs the choice
			sc.nextLine();
			switch (menu) {
			case 0:
				System.out.println("Thank You for using our test network!");
				System.out.println("We hope You've enjoyed the experiance!");
				System.out.println("Feel free to reuse our application anytime!");
				System.out.println("Have a nice day!");
				System.out.println("We, at TestInc think that all effort should be rewarded.");
				System.out.println("so we decided to make something nice for You");
				System.out.println();
				System.out.println("Behold the reward!");
				ChristmasTree.makeTree();
				break;
			case 1:
				String menu1;
				do {
					
					System.out.println("Welcome to the maual testing part of our application");
					System.out.println("You can choose one of the following tests:");
					System.out.println("a - Testing of the successfull Login to the website");
					System.out.println("b - Testing of the unsuccessfull Login to the website");
					System.out.println("c - Testing of the successfull uploading of the avatar picture for the main account");
					System.out.println("d - Verification of the app version info");
					System.out.println("e - Testing of the addition of the one new employee");
					System.out.println("f - Testing of the successfull change of the Country, Default language and Time format");
					System.out.println("q - Return to the previous menu");
					menu1=sc.nextLine();
					switch (menu1) {
					case "a":
						System.out.println("Testing of the successfull Login to the website");
						HumanityLoginTests.testLogin();
						break;
					case "b":
						System.out.println("Testing of the unsuccessfull Login to the website");
						HumanityLoginTestsUnsuccessfull.testLogin();
						break;
					case "c":
						System.out.println("Testing of the successfull uploading of the avatar picture for the main account");
						HumanityMenyProfileTest.testUploadAvatarPicture();
						break;
					case "d":
						System.out.println("Verification of the app version info");
						HumanityMenuVersionTest.testAppVersion();
						break;
					case "e":	
						System.out.println("Testing of the addition of the one new employee");
						HumanityAddNewEmployeeTests.testAddNewEmployee();
						break;
					case "f":
						System.out.println("Testing of the successfull change of the Country, Default language and Time format");
						HumanitySettingsTests.settingsTest();
						break;
					case "q":
						System.out.println("Returning to the previous menu");
						System.out.print(".");
						Thread.sleep(200);
						System.out.print(".");
						Thread.sleep(200);
						System.out.print(".");
						Thread.sleep(200);
						System.out.println();
						break;
					default:
						System.out.println("Dear user, You have chosen the unsupported option and will be directed to the previous menu!");
					}
				}while(!menu1.equals("q"));
				break;
			
			case 2:
				String menu2;
				do {
					System.out.println("Welcome to the maual testing part of our application");
					System.out.println("You can choose one of the following tests:");
					System.out.println("a - Testing of the successfull Login to the website");
					System.out.println("b - Testing of the unsuccessfull Login to the website");
					System.out.println("c - Testing of the addition of the one new employee");
					System.out.println("q - Return to the previous menu");
					menu2=sc.nextLine();
					switch(menu2) {
					case "a":
						System.out.println("Testing of the successfull Login to the website");
						HumanityLoginTestsApachePOI.testAddNewEmployee();
						break;
					case "b":
						System.out.println("Testing of the unsuccessfull Login to the website");
						HumanityLoginTestsUnsuccessfullApachePOI.testAddNewEmployee();
						break;
					case "c":
						System.out.println("Testing of the addition of the one new employee");
						HumanityAddNewEmployeesApachePOI.testAddNewEmployee();
						break;
					case "q":
						System.out.println("Returning to the previous menu");
						System.out.print(".");
						Thread.sleep(200);
						System.out.print(".");
						Thread.sleep(200);
						System.out.print(".");
						Thread.sleep(200);
						System.out.println();
						break;
					default:
						System.out.println("Dear user, You have chosen the unsupported option and will be directed to the previous menu!");
						
					}
				}while(!menu2.equals("q"));
			default: 
				System.out.println("Dear user, You have chosen the unsupported option and will be directed to the main menu!");
				System.out.print(".");
				Thread.sleep(200);
				System.out.print(".");
				Thread.sleep(200);
				System.out.print(".");
				Thread.sleep(200);
				System.out.println();
				break;
			}
		
		
		
		}while (menu!=0);
		
		
	}		
}


