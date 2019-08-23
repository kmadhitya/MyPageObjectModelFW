package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import projectspecificmethods.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage()
	{
		System.out.println("CreateLeadPage Constructor - Page Factory code");
	}
	
	public CreateLeadPage enterCompanyName()
	{
		driver.findElementById("createLeadForm_companyName").sendKeys("Company");
		return this;
	}
	
	public CreateLeadPage enterFirstName()
	{
		driver.findElementById("createLeadForm_firstName").sendKeys("Company");
		return this;
	}
	
	public CreateLeadPage enterLastName()
	{
		driver.findElementById("createLeadForm_lastName").sendKeys("Company_LastName");
		return this;
	}
	
	public CreateLeadPage enterEmail()
	{
		driver.findElementByXPath("//span[text()='E-Mail Address']/following::input[1]").sendKeys("kmadhitya@selenium.com");
		return this;
	}
	
	public CreateLeadPage selectmarketingcampaign()
	{
		WebElement marketingcampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd = new Select(marketingcampaign);
		List<WebElement> alloptions = dd.getOptions();
		int size = alloptions.size();
		dd.selectByIndex(size-1);
		return this;
	}
	public CreateLeadPage selectIndustry()
	{
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select ind = new Select(industry);
		ind.selectByVisibleText("Computer Software");
		return this;
	}
	public void clickCreateLead()
	{
		driver.findElementByName("submitButton").click();
		//return this;
	}

}
