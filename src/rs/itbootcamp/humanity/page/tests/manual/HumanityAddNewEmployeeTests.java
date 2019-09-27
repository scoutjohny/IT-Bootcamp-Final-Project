package rs.itbootcamp.humanity.page.tests.manual;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTests {

	@Test
	public static void testAddNewEmployee() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); //sets the starting properties for browser control
	WebDriver driver = new ChromeDriver(); //creates the new webdriver for Google Chrome
	try {
		driver.get(HumanityHome.URL); //goes to the Humanity home page
		driver.manage().window().maximize(); //maximizes the browser window
		HumanityHome.clickLoginButton(driver); //clicks on the login button
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //implicitly waits for 5 seconds
		HumanityHome.clickOnEmailField(driver); //clicks on the "Email/Username" field
		HumanityHome.inputEmail(driver); //inputs valid "Email/Username"
		HumanityHome.clickOnPasswordField(driver); //clicks on the "Password" field
		HumanityHome.inputPassword(driver); //inputs valid "Password"
		HumanityHome.clickOnFinalLogInButton(driver); //clicks on the login button
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //implicitly waits for 15 seconds
		Thread.sleep(5000); //pauses the testing for 5 seconds
		HumanityMenu.clickOnStaffButton(driver); //clicks on the "Staff" button
		Thread.sleep(5000); //pauses the testing for 5 seconds
		HumanityStaff.clickOnAddEmployeesButton(driver); //clicks on the "Add Employees" button
		HumanityStaff.inputFirstName1Field(driver); //inputs the First name in the "First Name" field			
		HumanityStaff.inputLastName1Field(driver); //inputs the Last name in the "Last Name" field
		HumanityStaff.inputEmail1Field(driver); //inputs email in the "Email" field
		HumanityStaff.clickSaveEmployeesButton(driver); //clicks on the "Save Employees" button
						
		HumanityMenu.clickOnStaffButton(driver); //clicks on the "Staff" button
		Thread.sleep(5000); //pauses the testing for 5 seconds
				
		//makes a list of all elements that have xpath containing the name of the new employee
		List<WebElement> list = driver.findElements(By.xpath("//a[contains(text(),'Predrag Predragovic')]"));
		Assert.assertTrue(list.size() > 0, "Text not found!"); //checks if the list has any items, if it does, the employee was successfully added
		System.out.println("Test successful!");
		}catch (AssertionError ae) {
			Assert.fail(); //marks test as failed
			System.out.println(ae.getMessage()); //transforms exception message to string
			System.out.println("Test unsuccessful!");
		}finally {
			//deleting newly added employee
			Thread.sleep(2000); //pauses the testing for 2 seconds
			HumanityStaff.clickNewEmployee(driver);
			Thread.sleep(2000); //pauses the testing for 2 seconds
			HumanityStaff.clickClickHereButton(driver);
			Thread.sleep(2000); //pauses the testing for 2 seconds
			
			//Controlling the pop-up choices
			Alert alert = driver.switchTo().alert(); //switches control from website to the pop-up window
			Thread.sleep(2000); //pauses the testing for 2 seconds
			alert.accept(); //clicks on "OK" button
			Thread.sleep(2000); //pauses the testing for 2 seconds
			driver.quit(); //closes the Browser
		}
		
	}
}

	

