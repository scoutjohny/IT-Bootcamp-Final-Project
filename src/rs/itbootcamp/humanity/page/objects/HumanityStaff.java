package rs.itbootcamp.humanity.page.objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {

	public static final String URL = "https://testerinc.humanity.com/app/staff/list/load/true/";
	private static final String ADD_EMPLOYEES_BUTTON_XPATH = "//button[@id='act_primary']";
	private static final String FIRST_NAME_AND_LAST_NAME_FIRST_PART_XPATH = "//a[contains(text(),'";
	private static final String FIRST_NAME_AND_LAST_NAME_LAST_PART_XPATH = "']";
	private static final String EDIT_DETAILS_XPATH="//a[contains(text(),'Edit Details')]";
	private static final String FIRST_NAME_EMPLOYEE_1_XPATH = "//input[@id='_asf1']";
	private static final String FIRST_NAME_EMPLOYEE_XPATH = "//input[@id='_asf";
	private static final String LAST_NAME_EMPLOYEE_1_XPATH = "//input[@id='_asl1']";
	private static final String LAST_NAME_EMPLOYEE_XPATH = "//input[@id='_asl";
	private static final String EMAIL_EMPLOYEE_1_XPATH = "//input[@id='_ase1']";
	private static final String EMAIL_EMPLOYEE_XPATH = "//input[@id='_ase";
	private static final String SAVE_EMPLOYEES_BUTTON_XPATH="//button[@id='_as_save_multiple']";
	private static final String UPLOAD_PICTURE_BUTTON_XPATH="//input[@id='fileupload']";
	private static final String ADDED_EMPLOYEE_XPATH = "//a[contains(text(),'Predrag Predragovic')]";
	private static final String CLICK_HERE_XPATH = "//a[contains(text(),'Click Here')]";
	
	// method that clicks on the chosen employee (one that we select)
	public static void chooseEmployee(WebDriver driver, String name) {
		driver.findElement(By.xpath(FIRST_NAME_AND_LAST_NAME_FIRST_PART_XPATH + name + FIRST_NAME_AND_LAST_NAME_LAST_PART_XPATH)).click();
	}
	
	//method that finds "Edit Details" button in the page of the chosen employee
	public static WebElement getEditDetailsButton(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_DETAILS_XPATH));
	}
	
	// method that clicks on the "Edit Details" button in the page of the chosen employee
	public static void clickEditDetailsButton(WebDriver driver) {
		getEditDetailsButton(driver).click();
	}
	
	//method that uploads preselected picture to the page of the chosen employee
	public static void inputPicture(WebDriver driver) {
		driver.findElement(By.xpath(UPLOAD_PICTURE_BUTTON_XPATH)).sendKeys("D:\\Install\\Posao\\Programiranje - IT Bootcamp\\Predavanja - Automation QA\\Java kod\\09232019 - Zavrsni projekat\\Dandelion.png");
	}
	
	// method finds "Add Employees" button
	public static WebElement getAddEmployeesButton(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEES_BUTTON_XPATH));
	}

	// method clicks on "Add Employees" button
	public static void clickOnAddEmployeesButton(WebDriver driver) {
		getAddEmployeesButton(driver).click();
	}
	
	// method that finds the "First Name" field (in the first row of the "Add Employees" page)
	public static WebElement getFirstName1Field(WebDriver driver) {
		return driver.findElement(By.xpath(FIRST_NAME_EMPLOYEE_1_XPATH));
	}
	
	// method that clicks on the "First Name" field (in the first row of the "Add Employees" page)
	public static void clickFirstName1Field(WebDriver driver) {
		getFirstName1Field(driver).click();
	}
	
	// method that inputs the Fist name in the "First Name" field (in the first row of the "Add Employees" page)
	public static void inputFirstName1Field(WebDriver driver) {
		getFirstName1Field(driver).sendKeys("Predrag");
	}
	
	// method that finds the "First Name" field of n-th position
	public static WebElement getFirstNameField(WebDriver driver, int n) {
		return driver.findElement(By.xpath(FIRST_NAME_EMPLOYEE_XPATH+n+FIRST_NAME_AND_LAST_NAME_LAST_PART_XPATH));
	}
			
	// method that clicks on the the "First Name" field of n-th position
	public static void clickFirstNameField(WebDriver driver, int n) {
		getFirstNameField(driver, n).click();
	}
	
	// method that inputs the Fist name in the the "First Name" field of n-th position
	public static void inputFirstNameField(WebDriver driver, int n, String firstName) {
		getFirstNameField(driver, n).sendKeys(firstName);
	}
	
	// method that finds the "Last Name" field (in the first row of the "Add Employees" page)
	public static WebElement getLastName1Field(WebDriver driver) {
		return driver.findElement(By.xpath(LAST_NAME_EMPLOYEE_1_XPATH));
	}
		
	// method that clicks on the "Last Name" field (in the first row of the "Add Employees" page)
	public static void clickLastName1Field(WebDriver driver) {
		getLastName1Field(driver).click();
	}
		
	// method that inputs the Last name in the "Last Name" field (in the first row of the "Add Employees" page)
	public static void inputLastName1Field(WebDriver driver) {
		getLastName1Field(driver).sendKeys("Predragovic");
	}
	
	// method that finds the "Last Name" field of n-th position
	public static WebElement getLastNameField(WebDriver driver, int n) {
		return driver.findElement(By.xpath(LAST_NAME_EMPLOYEE_XPATH+n+FIRST_NAME_AND_LAST_NAME_LAST_PART_XPATH));
	}
		
	// method that clicks on the "Last Name" field of n-th position
	public static void clickLastNameField(WebDriver driver, int n) {
		getLastNameField(driver,n).click();
	}
			
	// method that inputs the Last name in the "Last Name" field of n-th position
	public static void inputLastNameField(WebDriver driver, int n, String lastName) {
		getLastNameField(driver,n).sendKeys(lastName);
	}
	
	// method that finds the "Email" field (in the first row of the "Add Employees" page)
	public static WebElement getEmail1Field(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_EMPLOYEE_1_XPATH));
	}
			
	// method that clicks on the "Email" field (in the first row of the "Add Employees" page)
	public static void clickEmail1Field(WebDriver driver) {
		getEmail1Field(driver).click();
	}
			
	// method that inputs the email in the "Email" field (in the first row of the "Add Employees" page)
	public static void inputEmail1Field(WebDriver driver) {
		getEmail1Field(driver).sendKeys("predrag@pancevorulz.com");
	}
	
	// method that finds the "Email" field of n-th position
	public static WebElement getEmailField(WebDriver driver, int n) {
		return driver.findElement(By.xpath(EMAIL_EMPLOYEE_XPATH+n+FIRST_NAME_AND_LAST_NAME_LAST_PART_XPATH));
	}
				
	// method that clicks on the "Email" field of n-th position
	public static void clickEmailField(WebDriver driver, int n) {
		getEmailField(driver,n).click();
	}
			
	// method that inputs the email in the "Email" field of n-th position
	public static void inputEmailField(WebDriver driver, int n, String email) {
		getEmailField(driver, n).sendKeys(email);
	}
	
	// method that finds the "Save Employees" button
	public static WebElement getSaveEmployeesButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEES_BUTTON_XPATH));
	}
			
	// method that clicks on the "Save Employees" button
	public static void clickSaveEmployeesButton(WebDriver driver) {
		getSaveEmployeesButton(driver).click();
	}
	
	// method that finds the newly created employee
	public static WebElement getNewEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(ADDED_EMPLOYEE_XPATH));
	}
				
	// method that clicks on the newly created employee
	public static void clickNewEmployee(WebDriver driver) {
		getNewEmployee(driver).click();
	}
	
	// method that finds the "click here" button
	public static WebElement getClickHereButton(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_HERE_XPATH));
	}
					
	// method that clicks on the "click here" button
	public static void clickClickHereButton(WebDriver driver) {
		getClickHereButton(driver).click();
	}
	
		
}
