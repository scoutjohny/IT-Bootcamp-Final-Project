package rs.itbootcamp.humanity.page.tests.manual;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;

public class HumanityLoginTestsUnsuccessfull {
	@Test
	public static void testLogin() throws InterruptedException {
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
			System.out.println(driver.getCurrentUrl());
			Assert.assertNotEquals(driver.getCurrentUrl(), HumanityMenu.URL,"Nesto se ne load-uje kako treba!"); //checks if the current URL of the new page corresponds to the HumanityMenu URL 
		}catch (AssertionError ae) {
			Assert.fail();
			System.out.println(ae.getMessage());
		}finally {
			
			driver.quit();
		}
		
		
		
		
	}
}

