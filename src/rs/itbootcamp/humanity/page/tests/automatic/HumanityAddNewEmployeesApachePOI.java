package rs.itbootcamp.humanity.page.tests.automatic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeesApachePOI {

	private static List<String> addedEmployees  = new ArrayList<>();


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
			HSSFRow r1=sheet1.getRow(1); //gets the second row, containing login data
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
		HSSFSheet sheet2 = wbe.getSheetAt(1); //gets the fist sheet
		int rowcount2=sheet2.getLastRowNum(); //counts the number of rows
		HumanityMenu.clickOnStaffButton(driver); //clicks on the "Staff" button
		Thread.sleep(3000);
		HumanityStaff.clickOnAddEmployeesButton(driver); //clicks on the "Add Employees" button
		Thread.sleep(3000);
		
		//automated adding of new employees
		try {
			
			for (int i=1;i<rowcount2;i++) {
				HSSFRow r2=sheet2.getRow(i); //gets the i-th row, containing user data
				if(r2!=null) {
					String firstName=r2.getCell(0).getStringCellValue(); //gets String value for First Name
					String lastName=r2.getCell(1).getStringCellValue(); //gets String value for Last Name
					String email=r2.getCell(2).getStringCellValue(); //gets String value for email
					addedEmployees.add(firstName+" "+lastName); // this adds the newly entered employee into new employees list
					System.out.println(addedEmployees); //prints out all the members of the new employees list
					HumanityStaff.inputFirstNameField(driver, i, firstName); //sets First Name
					HumanityStaff.inputLastNameField(driver, i, lastName); //sets Last Name
					HumanityStaff.inputEmailField(driver, i, email); //sets email
					
				}else {
					System.out.println("EMPTY ROW ["+i+"]");
				}
			}
			
		}catch(Exception e) {
			System.out.println(e.toString()); //transforms exception message to string
		}finally{
			HumanityStaff.clickSaveEmployeesButton(driver); //clicks on the "Save Employees" button
			Thread.sleep(5000);
			System.out.println("Automated process of adding employees completed!");
			wbe.close(); //closes the Excel file
		}
		Thread.sleep(5000);
						
		driver.navigate().back(); //returns the browser one page back
		Thread.sleep(2000);
		driver.navigate().back(); //returns the browser to the "staff" page
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.className("j-employee-row")); //creates a list of web elements that contain data from all the employees
		List<String> list1=new ArrayList<>(); //creates a new String list
		for(WebElement l:list) {
			list1.add(l.getAttribute("Title")); //gets the first and last name, contained in the tile of the field
			System.out.println(list1);
		}
		Assert.assertTrue(list1.containsAll(addedEmployees)); //checks if the list of all employees has all of the added employees
		System.out.println("Test successful!");
		}catch (AssertionError ae) {
			Assert.fail(); // marks the test as failed
			System.out.println(ae.getMessage()); //transforms exception message to string
			System.out.println("Test unsuccessful!");
		}finally {
			
			driver.quit(); //closes the Browser
		}
		
	}
}

	


