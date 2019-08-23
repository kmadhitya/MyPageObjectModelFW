package testcases;


import pageobjects.LoginPage;


import projectspecificmethods.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods{
	
	
	
	public void runCreateLead()
	{
		new LoginPage().enterUserName().enterPassword().clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickCreateLead()
		.enterCompanyName().enterFirstName().enterLastName().enterEmail()
		.selectmarketingcampaign().selectIndustry().clickCreateLead();
		double sqrt = Math.sqrt(2.0);
		 
	}

}
