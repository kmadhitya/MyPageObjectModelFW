package pagefactoryobjects;

import org.openqa.selenium.support.PageFactory;

import projectspecificmethods.ProjectSpecificMethod;

public class LeadsPage extends ProjectSpecificMethod{
	
	public LeadsPage()
	{
		System.out.println("LeadsPage Constructor - Page Factory code");
		PageFactory.initElements(driver,this);
	}
	
	public CreateLeadPage clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
	

}
