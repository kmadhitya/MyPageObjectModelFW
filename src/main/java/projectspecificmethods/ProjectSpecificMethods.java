package projectspecificmethods;

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

public class ProjectSpecificMethods {
	
	public ChromeDriver driver;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite method");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test method");
	}
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
		
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
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
