package pagefactoryobjects;

import org.openqa.selenium.support.PageFactory;

import projectspecificmethods.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	
	public HomePage()
	{
		System.out.println("HomePage Constructor - Page Factory code");
		PageFactory.initElements(driver,this);
	}
	
	public MyHomePage clickCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}

}
