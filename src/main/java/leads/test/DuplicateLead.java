package leads.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import leads.page.MyHomePage;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class DuplicateLead extends PreAndPost{
	
	 @BeforeTest
	 public void beforeTest() {
		 
		 testcaseName = "DuplicateLead";
		 testcaseDesc = "Validating duplicate Lead using the data provide in excel";
		 nodeName = "Duplicate";
		 author = "Uday";
		 category="smoke";
		 excelFileName="DuplicateLead";
	 }

	
	@Test(dataProvider="SIT")
	public void duplicateLead(String emailId) {
		
	new MyHomePage(/*driver, test*/).clickLeadLink().clickFindLead()
		.clickEmailLink().typeEmailTextBox(emailId).clickSearchButton()
		.clickFirstResultingNameLink().clickDuplicateLeadLink().verifyPageTitle().clickCreateLeadButton().verifyFirstNameText();
	
	
	
		/*	//Click Leads link		
		WebElement eleLeadsLink = locateElement("link", "Leads");
		click(eleLeadsLink);
		//Click Find leads
		WebElement eleFindLeadsLink = locateElement("link", "Find Leads");
		click(eleFindLeadsLink);
		//Click on Email
		WebElement eleEmailLink = locateElement("link", "Email");
		click(eleEmailLink);
		//Enter Email
		WebElement eleEmailId = locateElement("name", "emailAddress");
		type(eleEmailId,emailId);
		//Click find leads button
		WebElement eleFindLeadLink = locateElement("xpath", "(//button[@class='x-btn-text'])[7]");
		click(eleFindLeadLink);  
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Capture name of First Resulting lead
		String elefirstName = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		System.out.println("FirstName:"+elefirstName);
		//Click First Resulting lead
		WebElement eleResultLink = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		click(eleResultLink);
		//Click Duplicate Lead
		WebElement eleDuplicateLeadLink = locateElement("link", "Duplicate Lead");
		click(eleDuplicateLeadLink);
		//Verify the title as 'Duplicate Lead'
		String pageTitle = driver.getTitle();
		System.out.println("Title is "+pageTitle);
		boolean title = driver.getTitle().contains("Duplicate Lead");
		System.out.println("Title Verified:"+ title);
		//Click Create Lead
		WebElement eleSubmitButton = locateElement("name", "submitButton");
		click(eleSubmitButton);
		//Confirm the duplicated lead name is same as captured name
		String eleViewFirstName = locateElement("id","viewLead_firstName_sp").getText();
		if(elefirstName.equals(eleViewFirstName))
			System.out.println("Duplicate Lead name: "+eleViewFirstName);
		else
			System.out.println("Not Duplicate Lead name ");*/
		
	}
	
	
	

}
