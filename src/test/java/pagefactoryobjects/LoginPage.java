package pagefactoryobjects;

import org.openqa.selenium.support.PageFactory;

import projectspecificmethods.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	
	public LoginPage()
	{
		System.out.println("Login Page Constructor - Page Factory code");
		PageFactory.initElements(driver,this);
	}
	
	public LoginPage enterUserName()
	{
		driver.findElementById("username").sendKeys("DemoSalesManager");
		return this;
	}
	
	public LoginPage enterPassword()
	{
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}
	
	public HomePage clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}
	
	

}
