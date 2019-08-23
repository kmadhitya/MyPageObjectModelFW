package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagefactoryobjects.LoginPage;
import projectspecificmethods.ProjectSpecificMethod;




public class CreateLeads extends ProjectSpecificMethod{
	
	
	@BeforeTest
	public void createLeadExcelData()
	{
		excelFileName = "CreateLeadData";
	}
	
	@Test(dataProvider="leadData")
	public void runCreateLead(String comp, String fn, String ln)
	{
		new LoginPage().enterUserName().enterPassword().clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickCreateLead()
		.enterCompanyName(comp).enterFirstName(fn).enterLastName(ln).enterEmail()
		.selectmarketingcampaign().selectIndustry().clickCreateLead();
		
		 
	}

}
