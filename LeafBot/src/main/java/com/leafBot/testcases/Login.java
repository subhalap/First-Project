package com.leafBot.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Login extends com.leafBot.testng.api.base.ProjectSpecificMethods {
	
	
	@Test
	public void runCreateTestLead()  {
		//Login();
		
		// TODO Auto-generated method stub

	/*System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe" );
	
	
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	
	driver.findElementById("username").sendKeys("DemoSalesManager");;
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.findElementByLinkText("CRM/SFA").click();*/ //command due to used in TestNG
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElementByLinkText("Create Lead").click();
	
	
	driver.findElementById("createLeadForm_companyName").sendKeys("Amazon");
	driver.findElementById("createLeadForm_firstName").sendKeys("Subhalaxmi");
	
	WebElement dd = driver.findElementById("createLeadForm_dataSourceId");
	
	Select dropdown = new Select(dd);
	dropdown.selectByVisibleText("Employee");
	
	WebElement dd1 = driver.findElementById("createLeadForm_marketingCampaignId");
	
	Select dropdown1 =new Select(dd1);
	List<WebElement> options = dropdown1.getOptions();
	
	int size = options.size();
	
	dropdown1.selectByIndex(size-2);
	//System.out.println(options.get(size-2).getText());
	
	
	
	}

}
	