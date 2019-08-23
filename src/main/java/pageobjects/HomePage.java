package pageobjects;

import projectspecificmethods.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage()
	{
		System.out.println("HomePage Constructor - Page Factory code");
	}
	
	public MyHomePage clickCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}

}
