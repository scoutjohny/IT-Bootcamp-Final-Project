package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityDashboard {
	private static final String SETTINGS_BUTTON_XPATH = "//i[@class='primNavQtip__icon icon-gear']";
	
	//method that gets gear settings button
	public static WebElement getSettingsButton(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_BUTTON_XPATH));
	}
	
	//method that clicks on gear settings button
	public static void clickSettingsButton(WebDriver driver) {
		getSettingsButton(driver).click();
	}

}
