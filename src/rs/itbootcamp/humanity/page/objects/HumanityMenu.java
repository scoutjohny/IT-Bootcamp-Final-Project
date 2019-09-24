package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {

	public static final String URL = "https://testerinc.humanity.com/app/dashboard/";
	private static final String DASHBOARD_BUTTON_XPATH = "//p[contains(text(),'Dashboard')]";
	private static final String SHIFT_PLANNING_BUTTON_XPATH = "//p[contains(text(),'ShiftPlanning')]";
	private static final String TIME_CLOCK_BUTTON_XPATH = "//p[contains(text(),'Time Clock')]";
	private static final String LEAVE_BUTTON_XPATH = "//p[@class='primNavQtip__itemName'][contains(text(),'Leave')]";
	private static final String TRAINING_BUTTON_XPATH = "//p[contains(text(),'Training')]";
	private static final String STAFF_BUTTON_XPATH = "//p[contains(text(),'Staff')]";
	private static final String PAYROLL_BUTTON_XPATH = "//p[contains(text(),'Payroll')]";
	private static final String REPORTS_BUTTON_XPATH = "//p[contains(text(),'Reports')]";
	private static final String AVATAR_XPATH = "//img[@id='tr_avatar']";
	private static final String ARROW_DOWN_BUTTON_XPATH = "//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";
	private static final String PROFILE_BUTTON_XPATH = "//a[contains(text(),'Profile')]";
	private static final String SETTINGS_BUTTON_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String AVAILABILITY_BUTTON_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String SIGN_OUT_BUTTON_XPATH = "//a[contains(text(),'Sign Out')]";
	private static final String HUMANITY_APP_VERSION_XPATH = "//div[@id='humanityAppVersion']";
	
	
	// method finds "Dashboard" button
	public static WebElement getDashboardButton(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_BUTTON_XPATH));
	}

	// method clicks on "Dashboard" button
	public static void clickOnDashboardButton(WebDriver driver) {
		getDashboardButton(driver).click();
	}

	// method finds "ShiftPlanning" button
	public static WebElement getShiftPlanningButton(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFT_PLANNING_BUTTON_XPATH));
	}

	// method clicks on "ShiftPlanning" button
	public static void clickOnShiftPlanningButton(WebDriver driver) {
		getShiftPlanningButton(driver).click();
	}

	// method finds "Time Clock" button
	public static WebElement getTimeClockButton(WebDriver driver) {
		return driver.findElement(By.xpath(TIME_CLOCK_BUTTON_XPATH));
	}

	// method clicks on "Time Clock" button
	public static void clickOnTimeClockButton(WebDriver driver) {
		getTimeClockButton(driver).click();
	}

	// method finds "Leave" button
	public static WebElement getLeaveButton(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_BUTTON_XPATH));
	}

	// method clicks on "Leave" button
	public static void clickOnLeaveButton(WebDriver driver) {
		getLeaveButton(driver).click();
	}

	// method finds "Training" button
	public static WebElement getTrainingButton(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_BUTTON_XPATH));
	}

	// method clicks on "Training" button
	public static void clickOnTrainingButton(WebDriver driver) {
		getTrainingButton(driver).click();
	}

	// method finds "Staff" button
	public static WebElement getStaffButton(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_BUTTON_XPATH));
	}

	// method clicks on "Staff" button
	public static void clickOnStaffButton(WebDriver driver) {
		getStaffButton(driver).click();
	}

	// method finds "Payroll" button
	public static WebElement getPayrollButton(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_BUTTON_XPATH));
	}

	// method clicks on "Payroll" button
	public static void clickOnPayrollButton(WebDriver driver) {
		getPayrollButton(driver).click();
	}

	// method finds "Reports" button
	public static WebElement getReportsButton(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_BUTTON_XPATH));
	}

	// method clicks on "Reports" button
	public static void clickOnReportsButton(WebDriver driver) {
		getReportsButton(driver).click();
	}
	
	// method finds "Avatar" button 
	public static WebElement getAvatarButton(WebDriver driver) {
		return driver.findElement(By.xpath(AVATAR_XPATH));
	}

	// method clicks on "Avatar" button
	public static void clickOnAvatarButton(WebDriver driver) {
		getAvatarButton(driver).click();
	}
	
	// method finds "Arrow down" button next to avatar
		public static WebElement getArrowDownButton(WebDriver driver) {
			return driver.findElement(By.xpath(ARROW_DOWN_BUTTON_XPATH));
	}

	// method clicks on "Arrow down" button next to avatar
	public static void clickOnArrowDownButton(WebDriver driver) {
		getArrowDownButton(driver).click();
	}
	
	// method finds "Profile" button next to avatar
			public static WebElement getProfileButton(WebDriver driver) {
				return driver.findElement(By.xpath(PROFILE_BUTTON_XPATH));
	}

	// method clicks on "Profile" button next to avatar
	public static void clickOnProfileButton(WebDriver driver) {
		getProfileButton(driver).click();
	}
	
	// method finds "Settings" button next to avatar
	public static WebElement getSettingsButton(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_BUTTON_XPATH));
	}

	// method clicks on "Settings" button next to avatar
	public static void clickOnSettingsButton(WebDriver driver) {
		getSettingsButton(driver).click();
	}
	
	// method finds "Availability" button next to avatar
	public static WebElement getAvailabilityButton(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_BUTTON_XPATH));
	}

	// method clicks on "Settings" button next to avatar
	public static void clickOnAvailabilityButton(WebDriver driver) {
		getAvailabilityButton(driver).click();
	}
	
	// method finds "Sign Out" button next to avatar
	public static WebElement getSignOutButton(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_OUT_BUTTON_XPATH));
	}

	// method clicks on "Sign Out" button next to avatar
	public static void clickOnSignOutButton(WebDriver driver) {
		getSignOutButton(driver).click();
	}
	
	// method finds "Humanity App Version" element
	public static WebElement getHumanityAppVersion(WebDriver driver) {
		return driver.findElement(By.xpath(HUMANITY_APP_VERSION_XPATH));
	}
	
	// method that finds version number of the Humanity app
	public static String versionNumber(WebDriver driver) {
		return getHumanityAppVersion(driver).findElement(By.tagName("b")).getText();
	}

}
