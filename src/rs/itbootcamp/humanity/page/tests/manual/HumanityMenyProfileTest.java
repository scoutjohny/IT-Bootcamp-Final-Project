package rs.itbootcamp.humanity.page.tests.manual;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityMenyProfileTest {
@Test
	public static void testUploadAvatarPicture() throws InterruptedException {
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
			HumanityMenu.clickOnArrowDownButton(driver);
			HumanityMenu.clickOnProfileButton(driver);
			HumanityProfile.clickEditDetailsButton(driver);
			HumanityProfile.uploadPicture(driver);
			Thread.sleep(5000);
			Assert.assertNotEquals(driver.findElement(By.className("j-user-avatar-settings")).getAttribute("src"), "https://d3l54fgzztlejs.cloudfront.net/app/layout/images/no_avatar.png", "Bad upload!");
		}catch (AssertionError ae) {
			Assert.fail();
			System.out.println(ae.getMessage());
		}finally {
			
			driver.quit(); //closes the Browser
		}
}
}
