package rs.itbootcamp.humanity.page.tests.manual;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityProfileNicknameTest {

	@Test
	public static void nicknameSetTest() throws InterruptedException {
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
			HumanityMenu.clickOnArrowDownButton(driver); //clicks on arrow down button
			HumanityMenu.clickOnProfileButton(driver); //clicks on profile button
			HumanityProfile.clickEditDetailsButton(driver); //clicks on edit detail button
			String nickname="Dzoni";
			HumanityProfile.clearNickNameButton(driver);
			HumanityProfile.inputNickNameButton(driver, nickname);
			Thread.sleep(5000);
			HumanityProfile.clickSaveEmployeeButton(driver);
			Thread.sleep(5000);
			Assert.assertEquals(driver.findElement(By.xpath("//input[@id='nick_name']")).getAttribute("value"),nickname,"Nickanme not setted correctly!");
			System.out.println("Test successful!");
		}catch (AssertionError ae) {
		Assert.fail(); //marks test as failed
		System.out.println(ae.getMessage()); //transforms exception message to string
		System.out.println("Test unsuccessful!");
	}finally {
		
		driver.quit(); //closes the Browser
	}
}
}

