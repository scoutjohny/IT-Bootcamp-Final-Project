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
public static void settingsTest() throws InterruptedException{
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
		Thread.sleep(15000);
		HumanityMenu.clickOnGearSettingsButton(driver);
		String country="Serbia";
		HumanitySettings.selectCountry(driver, country);
		String language="Croatian (machine)";
		HumanitySettings.selectDefaultLanguage(driver, language);
		String timeFormat="24 hour";
		HumanitySettings.selectTimeFormat(driver, timeFormat);
		HumanitySettings.clickSaveSettingsButton(driver);
		String c=HumanitySettings.getSelectCountry(driver).getFirstSelectedOption().getText();
		String l=HumanitySettings.getDefaultLanguage(driver).getFirstSelectedOption().getText();
		String t=HumanitySettings.getTimeFormat(driver).getFirstSelectedOption().getText();
		Thread.sleep(15000);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(c, country);
		sa.assertEquals(l, language);
		sa.assertEquals(t, timeFormat);
		sa.assertAll();
	}catch (AssertionError ae) {
		Assert.fail();
		System.out.println(ae.getMessage());
	}finally {
		
		driver.quit(); //closes the Browser
	}
}
}
