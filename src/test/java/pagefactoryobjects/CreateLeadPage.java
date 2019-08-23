package pagefactoryobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import projectspecificmethods.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
	public CreateLeadPage()
	{
		System.out.println("CreateLeadPage Constructor - Page Factory code");
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID, using="createLeadForm_companyName")
	WebElement eleCompany;
	public CreateLeadPage enterCompanyName(String comp)
	{
		eleCompany.sendKeys(comp);
		return this;
	}
	@FindBy(how=How.ID, using = "createLeadForm_firstName")
	WebElement eleFirstName;
	public CreateLeadPage enterFirstName(String fn)
	{
		eleFirstName.sendKeys(fn);
		return this;
	}
	@FindBy(how=How.ID, using="createLeadForm_lastName")
	WebElement eleLastName;
	public CreateLeadPage enterLastName(String ln)
	{
		eleLastName.sendKeys(ln);
		return this;
	}
	@FindBy(how=How.XPATH, using="//span[text()='E-Mail Address']/following::input[1]")
	WebElement eleEmail;
	public CreateLeadPage enterEmail()
	{
		eleEmail.sendKeys("kmadhitya@selenium.com");
		return this;
	}
	@FindBy(how=How.ID, using="createLeadForm_marketingCampaignId")
	WebElement eleMarketnigCampaign;
	public CreateLeadPage selectmarketingcampaign()
	{
		//WebElement marketingcampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd = new Select(eleMarketnigCampaign);
		List<WebElement> alloptions = dd.getOptions();
		int size = alloptions.size();
		dd.selectByIndex(size-1);
		return this;
	}
	@FindBy(how=How.ID, using="createLeadForm_marketingCampaignId")
	WebElement eleSelectIndustry;
	public CreateLeadPage selectIndustry()
	{
		//WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select ind = new Select(eleSelectIndustry);
		ind.selectByVisibleText("Computer Software");
		return this;
	}
	@FindBy(how=How.NAME, using="submitButton")
	WebElement eleCreateLead;
	public void clickCreateLead()
	{
		eleCreateLead.click();
		//return this;
	}

}
