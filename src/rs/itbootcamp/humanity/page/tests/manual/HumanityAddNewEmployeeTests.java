package rs.itbootcamp.humanity.page.tests.manual;

import java.util.List;
import java.util.concurrent.TimeUnit;

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
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	try {
		driver.get(HumanityHome.URL); //goes to the Humanity home page
		driver.manage().window().maximize();
		HumanityHome.clickLoginButton(driver); //clicks on the login button
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		HumanityHome.clickOnEmailField(driver); //clicks on the "Email/Username" field
		HumanityHome.inputEmail(driver); //inputs valid "Email/Username"
		HumanityHome.clickOnPasswordField(driver); //clicks on the "Password" field
		HumanityHome.inputPassword(driver); //inputs valid "Password"
		HumanityHome.clickOnFinalLogInButton(driver); //clicks on the login button
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(5000);
		HumanityMenu.clickOnStaffButton(driver); //clicks on the "Staff" button
		HumanityStaff.clickOnAddEmployeesButton(driver); //clicks on the "Add Employees" button
		HumanityStaff.inputFirstName1Field(driver); //inputs the First name in the "First Name" field			
		HumanityStaff.inputLastName1Field(driver); //inputs the Last name in the "Last Name" field
		HumanityStaff.inputEmail1Field(driver); //inputs email in the "Email" field
		HumanityStaff.clickSaveEmployeesButton(driver); //clicks on the "Save Employees" button
						
		driver.navigate().back(); //returns the browser one page back
		driver.navigate().back(); //returns the browser to the "staff" page
		
		//makes a list of all elements that have xpath containing the name of the new employee
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Predrag Predragovic" + "')]"));
		Assert.assertTrue(list.size() > 0, "Text not found!"); //checks if the list has any items, if it does, the employee was successfully added
		
		}catch (AssertionError ae) {
			Assert.fail();
			System.out.println(ae.getMessage());
		}finally {
			
			driver.quit(); //closes the Browser
		}
		
	}
}

	

