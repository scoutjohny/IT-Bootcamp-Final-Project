package rs.itbootcamp.humanity.page.tests.automatic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;

public class HumanityLoginTestsUnsuccessfullApachePOI {
	@Test
	public static void testAddNewEmployee() throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	try {
		driver.get(HumanityHome.URL); //goes to the Humanity home page
		driver.manage().window().maximize();
		HumanityHome.clickLoginButton(driver); //clicks on the login button
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//ApachePOI automation of the login proces
		
		File src=new File("Data.xls"); //finds data file
		FileInputStream fis = new FileInputStream(src); //loads the selected file
		HSSFWorkbook wbe = new HSSFWorkbook(fis); //loads the workbook
		HSSFSheet sheet1 = wbe.getSheetAt(0); //gets the fist sheet
		int rowcount1=sheet1.getLastRowNum(); //counts the number of rows
		
		try {
			HSSFRow r1=sheet1.getRow(2); //gets the third row, containing invalid login data
				if(r1!=null) {
					String email=r1.getCell(0).getStringCellValue(); //gets String value for email from Data.xls
					String password=r1.getCell(1).getStringCellValue(); //gets String value for password from Data.xls
					HumanityHome.inputAnyEmail(driver, email); //inputs valid "Email/Username"
					HumanityHome.inputAnyPassword(driver, password); //inputs valid "Password"
					
				}else {
					System.out.println("EMPTY ROW ["+1+"]");
				}
						
		}catch (Exception e) {
			System.out.println(e.toString()); //transforms exception message to string
			System.out.println("Something went wrong in the automated Login process");
		
		}finally{
			HumanityHome.clickOnFinalLogInButton(driver); //clicks on the login button
			System.out.println("Automated Login process complete!");
		}
		Thread.sleep(3000);
		Assert.assertNotEquals(driver.getCurrentUrl(), HumanityMenu.URL,"Nesto se ne load-uje kako treba!"); //checks if the current URL of the new page corresponds to the HumanityMenu URL
		System.out.println("Test successful!");
	}catch (AssertionError ae) {
		Assert.fail(); // marks test as failed!
		System.out.println(ae.getMessage()); //transforms exception message to string
		System.out.println("Test unsuccessful!");
	}finally {
		
		driver.quit(); //closes the Browser
	}
}
}
