package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
	
	public static final String URL="https://testerinc.humanity.com/app/staff/edit/5093154/";
	private static final String SAVE_EMPLOYEE_BUTTON_XPATH = "//button[@id='act_primary']";
	private static final String EDIT_DETAILS_BUTTON_XPATH = "//a[contains(text(),'Edit Details')]";
	private static final String UPLOAD_PICTURE_BUTTON_XPATH="//input[@id='fileupload']";
	private static final String NICK_NAME_XPATH = "//input[@id='nick_name']";
	
	//method that finds "Save Employee" button
	public static WebElement getSaveEmployeeButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE_BUTTON_XPATH));
	}
			
	// method that clicks on the "Save Employee" button
	public static void clickSaveEmployeeButton(WebDriver driver) {
		getSaveEmployeeButton(driver).click();
	}
	
	//method that finds "Edit Details" button
	public static WebElement getEditDetailsButton(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_DETAILS_BUTTON_XPATH));
	}
		
	// method that clicks on the "Edit Details" button
	public static void clickEditDetailsButton(WebDriver driver) {
		getEditDetailsButton(driver).click();
	}
	
	//method that uploads preselected picture to the page of the chosen employee
	public static void uploadPicture(WebDriver driver) {
		driver.findElement(By.xpath(UPLOAD_PICTURE_BUTTON_XPATH)).sendKeys("D:\\Install\\Posao\\Programiranje - IT Bootcamp\\Predavanja - Automation QA\\Java kod\\09232019 - Zavrsni projekat\\Dandelion.png");
	}
	
	//method that finds "Nick Name" button
	public static WebElement getNickNameButton(WebDriver driver) {
		return driver.findElement(By.xpath(NICK_NAME_XPATH));
	}
				
	// method that clicks on the "Nick Name" button
	public static void clickNickNameButton(WebDriver driver) {
		getNickNameButton(driver).click();
	}
	
	// method that clicks on the "Nick Name" button
	public static void inputNickNameButton(WebDriver driver, String nickname) {
		getNickNameButton(driver).sendKeys(nickname);
	}

}
