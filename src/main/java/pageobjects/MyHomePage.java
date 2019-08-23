package pageobjects;


import projectspecificmethods.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyHomePage()
	{
		System.out.println("MyHomePage Constructor - Page Factory code");
	}
	
	public LeadsPage clickLeadsTab()
	{
		driver.findElementByXPath("//a[text()='Leads']").click();
		return new LeadsPage();
	}

}
