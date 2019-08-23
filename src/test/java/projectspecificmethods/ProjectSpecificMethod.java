package projectspecificmethods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import util.ExcelUtil;

public class ProjectSpecificMethod {
	
	public static ChromeDriver driver;
	public String excelFileName;
	@DataProvider(name = "leadData")
	public Object[][] setUpData() throws IOException {
		Object[][] data = ExcelUtil.excelData(excelFileName);
		return data;
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite method");
	}
	/*@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test method");
	}*/
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class method");
	}
	
	
	
	@BeforeMethod
	public void login()
	{
		System.out.println("Before method");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void closeDriver()
	{
		System.out.println("After method");
		driver.close();
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class method");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test method");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite method");
	}

}
