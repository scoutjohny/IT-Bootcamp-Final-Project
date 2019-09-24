package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {
	
	public static final String URL= "https://testerinc.humanity.com/app/admin/settings/";
	private static final String COUNTRY_DROP_DOWN_MENU_XPATH = "//select[@id='country']";
	private static final String LANGUAGE_DROP_DOWN_MENU_XPATH = "//select[@name='language']";
	private static final String TIME_FORMAT_DROP_DOWN_MENU_XPATH = "//select[@name='pref_24hr']";
	
	//method directs browser to the settings url
	public static void goToUrl(WebDriver driver) {
		driver.get(URL);
	}
	
	//method finds "Country" drop down menu
	public static Select getSelectCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(COUNTRY_DROP_DOWN_MENU_XPATH)));
	}
	
	//method chooses preferred country
	public static void selectCountry(WebDriver driver, String country) {
		getSelectCountry(driver).selectByVisibleText(country);
	}
	
	//method finds "Default Language" drop down menu
	public static Select getDefaultLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(LANGUAGE_DROP_DOWN_MENU_XPATH)));
	}
		
	//method chooses preferred default language
	public static void selectDefaultLanguage(WebDriver driver, String language) {
		getDefaultLanguage(driver).selectByVisibleText(language);
	}
	
	//method finds "Time Format" drop down menu
	public static Select getTimeFormat(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(LANGUAGE_DROP_DOWN_MENU_XPATH)));
	}
			
	//method chooses preferred time format
	public static void selectTimeFormat(WebDriver driver, String timeFormat) {
		getTimeFormat(driver).selectByVisibleText(timeFormat);
	}

}
