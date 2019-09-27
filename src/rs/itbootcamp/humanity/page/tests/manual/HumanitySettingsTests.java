package rs.itbootcamp.humanity.page.tests.manual;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;

public class HumanitySettingsTests {

	@Test
	public static void settingsTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); //sets the starting properties for browser control
		WebDriver driver = new ChromeDriver(); //creates the new webdriver for Google Chrome
		try {
			driver.get(HumanityHome.URL); // goes to the Humanity home page
			driver.manage().window().maximize(); // maximizes the browser window
			HumanityHome.clickLoginButton(driver); // clicks on the login button
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //implicitly waits for 5 seconds
			HumanityHome.clickOnEmailField(driver); // clicks on the "Email/Username" field
			HumanityHome.inputEmail(driver); // inputs valid "Email/Username"
			HumanityHome.clickOnPasswordField(driver); // clicks on the "Password" field
			HumanityHome.inputPassword(driver); // inputs valid "Password"
			HumanityHome.clickOnFinalLogInButton(driver); // clicks on the login button
			Thread.sleep(15000); //waits for 15 seconds
			HumanityMenu.clickOnGearSettingsButton(driver); //clicks on the gear icon
			String country = "Serbia"; //choice of country
			HumanitySettings.selectCountry(driver, country); //chooses the country
			String language = "Croatian (machine)"; //choice of language
			HumanitySettings.selectDefaultLanguage(driver, language); //chooses the language
			String timeFormat = "24 hour"; //choice of time format
			HumanitySettings.selectTimeFormat(driver, timeFormat); //chooses the time format
			HumanitySettings.clickSaveSettingsButton(driver); //saves the changes
			String c = HumanitySettings.getSelectCountry(driver).getFirstSelectedOption().getText(); //returns string representation of the chosen country
			String l = HumanitySettings.getDefaultLanguage(driver).getFirstSelectedOption().getText(); //returns string representation of the chosen language
			String t = HumanitySettings.getTimeFormat(driver).getFirstSelectedOption().getText(); //returns string representation of the chosen time format
			Thread.sleep(15000); //waits for 15 seconds
			SoftAssert sa = new SoftAssert(); //defines new soft assert variable
			sa.assertEquals(c, country); //checks if selected country corresponds to the desired country
			sa.assertEquals(l, language); //checks if selected language corresponds to the desired language
			sa.assertEquals(t, timeFormat); //checks if selected time format corresponds to the desired time format
			sa.assertAll(); //runs all the asserts, one by one
			System.out.println("Test successful!");
		} catch (AssertionError ae) {
			Assert.fail(); //marks test as failed
			System.out.println(ae.getMessage()); //transforms exception message to string
			System.out.println("Test unsuccessful!");
		} finally {
			//reseting settings to default values
			String country = "United States"; //choice of default country
			HumanitySettings.selectCountry(driver, country); //chooses the default country
			String language = "American English"; //choice of default language
			HumanitySettings.selectDefaultLanguage(driver, language); //chooses the default language
			String timeFormat = "12 hour"; //choice of default time format
			HumanitySettings.selectTimeFormat(driver, timeFormat); //chooses the default time format
			HumanitySettings.clickSaveSettingsButton(driver);
			Thread.sleep(5000); //waits for 5 seconds
			driver.quit(); // closes the Browser
		}
	}
}
