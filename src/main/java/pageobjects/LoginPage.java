package pageobjects;


import projectspecificmethods.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage()
	{
		System.out.println("Login Page Constructor - Page Factory code");
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
