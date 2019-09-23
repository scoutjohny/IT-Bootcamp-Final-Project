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

}
