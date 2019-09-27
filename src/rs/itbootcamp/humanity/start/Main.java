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
import rs.itbootcamp.humanity.page.tests.manual.HumanityProfileNicknameTest;
import rs.itbootcamp.humanity.page.tests.manual.HumanitySettingsTests;
import rs.itbootcamp.humanity.page.utility.ChristmasTree;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {

		Scanner sc = new Scanner(System.in);
		int menu; // this variable will be the choice of the user
		
		do {
			System.out.println();
			System.out.println("Wellcome to the TestInc test framework!");
			System.out.println("This application will give you the opportunity to test out");
			System.out.println("some functionalities of the humanity.com website");
			System.out.println();
			System.out.println("These are your options:");
			System.out.println();
			System.out.println("1 - Manual tests with preselected data");
			System.out.println("2 - Automatic tests with preselected data from excel database Data.xls");
			System.out.println("0 - Exit the testing framework");

			menu = sc.nextInt(); // user inputs the choice
			sc.nextLine();
			System.out.println();
			switch (menu) {
			case 0:
				System.out.println("Thank You for using our test framework!");
				Thread.sleep(2000);
				System.out.println("We hope You've enjoyed the experiance!");
				Thread.sleep(2000);
				System.out.println("Feel free to reuse our application anytime!");
				Thread.sleep(2000);
				System.out.println("Have a nice day!");
				Thread.sleep(2000);
				System.out.println("We, at TestInc, think that all effort should be rewarded.");
				Thread.sleep(2000);
				System.out.println("so we decided to make something nice for You");
				Thread.sleep(2000);
				System.out.println();
				Thread.sleep(2000);
				System.out.println("Behold the reward!");
				Thread.sleep(2000);
				System.out.println();
				ChristmasTree.makeTree();
				break;
			case 1:
				String menu1;
				do {

					System.out.println("Welcome to the maual testing section of our application");
					System.out.println("You can choose one of the following tests:");
					System.out.println("a - Testing of the successfull Login to the website");
					System.out.println("b - Testing of the unsuccessfull Login to the website");
					System.out.println(
							"c - Testing of the successfull uploading of the avatar picture for the main account");
					System.out.println("d - Verification of the app version info");
					System.out.println("e - Testing of the addition of the one new employee");
					System.out.println(
							"f - Testing of the successfull change of the Country, Default language and Time format");
					System.out.println("g - Testing of the addition of the new nickname for the Employer");
					System.out.println("q - Return to the previous menu");
					menu1 = sc.nextLine();
					System.out.println();
					switch (menu1) {
					case "a":
						System.out.println("Testing of the successfull Login to the website");
						HumanityLoginTests.testLogin();
						System.out.println("Test completed!");
						System.out.println();
						break;
					case "b":
						System.out.println("Testing of the unsuccessfull Login to the website");
						HumanityLoginTestsUnsuccessfull.testLogin();
						System.out.println("Test completed!");
						System.out.println();
						break;
					case "c":
						System.out.println(
								"Testing of the successfull uploading of the avatar picture for the main account");
						HumanityMenyProfileTest.testUploadAvatarPicture();
						System.out.println("Test completed!");
						System.out.println();
						break;
					case "d":
						System.out.println("Verification of the app version info");
						HumanityMenuVersionTest.testAppVersion();
						System.out.println("Test completed!");
						System.out.println();
						break;
					case "e":
						System.out.println("Testing of the addition of the one new employee");
						HumanityAddNewEmployeeTests.testAddNewEmployee();
						System.out.println("Test completed!");
						System.out.println();
						break;
					case "f":
						System.out.println(
								"Testing of the successfull change of the Country, Default language and Time format");
						HumanitySettingsTests.settingsTest();
						System.out.println("Test completed!");
						System.out.println();
						break;
					case "g":
						System.out.println(
								"Testing of the addition of the new nickname for the Employer");
						HumanityProfileNicknameTest.nicknameSetTest();
						System.out.println("Test completed!");
						System.out.println();
						break;
					case "q":
						System.out.println("Returning to the previous menu");
						System.out.print(".");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.println(".");
						Thread.sleep(1000);
						System.out.println("still returning");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.println(".");
						Thread.sleep(1000);
						System.out.println("VOILA!");
						Thread.sleep(1000);
						System.out.println();
						break;
					default:
						System.out.println(
								"Dear user, You have chosen the unsupported option and will be redirected to the previous menu!");
						System.out.println("Returning to the previous menu");
						System.out.print(".");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.println(".");
						Thread.sleep(1000);
						System.out.println("feeding unicorns");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.println(".");
						System.out.println("done!");
						Thread.sleep(1000);
						System.out.println();
						break;
					}
				} while (!menu1.equals("q"));
				break;

			case 2:
				String menu2;
				do {
					System.out.println("Welcome to the automatic testing section of our application");
					System.out.println("You can choose one of the following tests:");
					System.out.println("a - Testing of the successfull Login to the website");
					System.out.println("b - Testing of the unsuccessfull Login to the website");
					System.out.println("c - Testing of the addition of the seven new employees");
					System.out.println("q - Return to the previous menu");
					menu2 = sc.nextLine();
					switch (menu2) {
					case "a":
						System.out.println("Testing of the successfull Login to the website");
						HumanityLoginTestsApachePOI.testAddNewEmployee();
						System.out.println("Test completed!");
						System.out.println();
						break;
					case "b":
						System.out.println("Testing of the unsuccessfull Login to the website");
						HumanityLoginTestsUnsuccessfullApachePOI.testAddNewEmployee();
						System.out.println("Test completed!");
						System.out.println();
						break;
					case "c":
						System.out.println("Testing of the addition of the one new employee");
						HumanityAddNewEmployeesApachePOI.testAddNewEmployee();
						System.out.println("Test completed!");
						System.out.println();
						break;
					case "q":
						System.out.println("Returning to the previous menu");
						System.out.print(".");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.println(".");
						Thread.sleep(1000);
						System.out.println("mining for Bitcoin");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.println(".");
						System.out.println("here we go!");
						Thread.sleep(1000);
						System.out.println();
						break;
					default:
						System.out.println(
								"Dear user, You have chosen the unsupported option and will be redirected to the previous menu!");
						System.out.println("Returning to the previous menu");
						System.out.print(".");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.println(".");
						Thread.sleep(1000);
						System.out.println("searching for the meaning of life");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.print(".");
						Thread.sleep(1000);
						System.out.println(".");
						System.out.println("oh, it's 42!");
						Thread.sleep(1000);
						System.out.println();
						break;
					}
				} while (!menu2.equals("q"));
				break;
			default:
				System.out.println(
						"Dear user, You have chosen the unsupported option and will be directed to the main menu!");
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.println(".");
				Thread.sleep(1000);
				System.out.println("Singing: D.I.S.C.O. she is D.I.S.C.O.!");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.println(".");
				System.out.println("Singing: She is O, o, ooooooooo!!!!!");
				Thread.sleep(1000);
				System.out.println();
				break;
			}

		} while (menu != 0);

	}
}
