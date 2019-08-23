package pageobjects;


import projectspecificmethods.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods{
	
	public LeadsPage()
	{
		System.out.println("LeadsPage Constructor - Page Factory code");
	}
	
	public CreateLeadPage clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
	

}
