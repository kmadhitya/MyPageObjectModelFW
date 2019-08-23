package pagefactoryobjects;

import org.openqa.selenium.support.PageFactory;

import projectspecificmethods.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{
	
	public MyHomePage()
	{
		System.out.println("MyHomePage Constructor - Page Factory code");
		PageFactory.initElements(driver,this);
	}
	
	public LeadsPage clickLeadsTab()
	{
		driver.findElementByXPath("//a[text()='Leads']").click();
		return new LeadsPage();
	}

}
