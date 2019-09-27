package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {

	public static final String URL = "https://www.humanity.com/";
	private static final String ABOUT_US_BUTTON_XPATH = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static final String ABOUT_US_ABOUT_US_BUTTON_XPATH = "//p[contains(text(),'About Us')]";
	private static final String LOGIN_BUTTON_XPATH = "//p[contains(text(),'LOGIN')]";
	private static final String FULL_NAME_FIELD_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String WORK_EMAIL_FIELD_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String START_MY_FREE_TRIAL_BUTTON1_XPATH = "//input[@id='free-trial-link-01']";
	private static final String START_MY_FREE_TRIAL_BUTTON2_XPATH = "//a[@class='button pale']";
	private static final String EMAIL_USERNAME_FIELD_XPATH = "//input[@id='email']";
	private static final String PASSWORD_FIELD_XPATH = "//input[@id='password']";
	private static final String FINAL_LOGIN_BUTTON_XPATH = "//button[contains(text(),'Log in')]";
	private static final String USERNAME = "yoyoho@coin-host.net";
	private static final String PASSWORD = "a1b2c3";

	// method directs WebDriver to the following url "https://www.humanity.com/"
	public static void goToUrl(WebDriver driver) {
		driver.get(URL);
	}

	// method finds "ABOUT US" button
	public static WebElement getAboutUsButton(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUT_US_BUTTON_XPATH));
	}

	// method clicks on "About Us" button in the "ABOUT US" section
	public static void clickAboutUsButton(WebDriver driver) {
		getAboutUsButton(driver).findElement(By.xpath(ABOUT_US_ABOUT_US_BUTTON_XPATH)).click();
	}

	// method finds "LOGIN" button
	public static WebElement getLoginButton(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_BUTTON_XPATH));
	}

	// method clicks on "LOGIN" button
	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();
	}

	// method finds "Email/Username" field
	public static WebElement getEmailField(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_USERNAME_FIELD_XPATH));
	}

	// method clicks on "Email/Username" field
	public static void clickOnEmailField(WebDriver driver) {
		getEmailField(driver).click();
	}

	// method fills in the valid email into the "Email/Username" field
	public static void inputEmail(WebDriver driver) {
		getEmailField(driver).sendKeys(USERNAME);
	}
	
	// method fills in the invalid email into the "Email/Username" field
	public static void inputInvalidEmail(WebDriver driver) {
		getEmailField(driver).sendKeys("USERNAME");
	}
	
	// method fills in any valid email into the "Email/Username" field
	public static void inputAnyEmail(WebDriver driver, String email) {
		getEmailField(driver).sendKeys(email);
	}

	// method finds "Password" field
	public static WebElement getPasswordField(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_FIELD_XPATH));
	}

	// method clicks on "Password" field
	public static void clickOnPasswordField(WebDriver driver) {
		getPasswordField(driver).click();
	}

	// method fills in the valid password into the "Password" field
	public static void inputPassword(WebDriver driver) {
		getPasswordField(driver).sendKeys(PASSWORD);
	}
	
	// method fills in the invalid password into the "Password" field
	public static void inputInvalidPassword(WebDriver driver) {
		getPasswordField(driver).sendKeys("PASSWORD");
	}
	
	// method fills in any valid password into the "Password" field
	public static void inputAnyPassword(WebDriver driver, String password) {
		getPasswordField(driver).sendKeys(password);
	}

	// method finds "Log In" button on the Log In page
	public static WebElement getFinalLogInButton(WebDriver driver) {
		return driver.findElement(By.xpath(FINAL_LOGIN_BUTTON_XPATH));
	}

	// method clicks on "Log In" button on the Log In page
	public static void clickOnFinalLogInButton(WebDriver driver) {
		getFinalLogInButton(driver).click();
	}

	// method finds "Full Name" field
	public static WebElement getFullNameField(WebDriver driver) {
		return driver.findElement(By.xpath(FULL_NAME_FIELD_XPATH));
	}

	// method clicks on "Full Name" field
	public static void clickOnFullNameField(WebDriver driver) {
		getFullNameField(driver).click();
	}

	// method finds "Work Email" field
	public static WebElement getWorkEmailField(WebDriver driver) {
		return driver.findElement(By.xpath(WORK_EMAIL_FIELD_XPATH));
	}

	// method clicks on "Work Email" field
	public static void clickOnWorkEmailField(WebDriver driver) {
		getWorkEmailField(driver).click();
	}

	// method finds "START MY FREE TRIAL" button (underneath the input fields)
	public static WebElement getStartMyFreeTrialButton1(WebDriver driver) {
		return driver.findElement(By.xpath(START_MY_FREE_TRIAL_BUTTON1_XPATH));
	}

	// method clicks on "START MY FREE TRIAL" button (underneath the input fields)
	public static void clickStartMyFreeTrialButton1(WebDriver driver) {
		getStartMyFreeTrialButton1(driver).click();
	}

	// method finds "START MY FREE TRIAL" button (to the right from LOGIN button)
	public static WebElement getStartMyFreeTrialButton2(WebDriver driver) {
		return driver.findElement(By.xpath(START_MY_FREE_TRIAL_BUTTON2_XPATH));
	}

	// method clicks on "START MY FREE TRIAL" button (to the right from LOGIN button)
	public static void clickStartMyFreeTrialButton2(WebDriver driver) {
		getStartMyFreeTrialButton2(driver).click();
	}

}
