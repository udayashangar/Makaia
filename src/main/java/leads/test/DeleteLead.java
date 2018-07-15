package leads.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import leads.page.MyHomePage;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class DeleteLead extends PreAndPost{
	
	 @BeforeTest
	 public void beforeTest() {
		 
		 testcaseName = "DeleteLead";
		 testcaseDesc = "Deleting Lead using the data provide in excel";
		 nodeName = "Delete";
		 author = "Uday";
		 category="smoke";
		 excelFileName="DeleteLead";
	 }

	
	
	//@Test(dependsOnMethods= {"tests.CreateLead.createLead"}, alwaysRun =true, groups= {"sanity"})
	@Test(dataProvider="SIT")
	public void deleteLead(String ph) {
		
		new MyHomePage(/*driver, test*/).clickLeadLink().clickFindLead()
		.clickPhoneLink().typePhNumTextBox(ph).clickSearchButton()
		.clickFirstResultingIDLink().clickDeleteLink().clickFindLead().typeLeadIdTestBox(firstIdText).clickSearchButton().verifyErrorMsg();
		
		/*WebElement eleLeadsLink = locateElement("link", "Leads");
		click(eleLeadsLink);
		WebElement eleFindLeadsLink = locateElement("link", "Find Leads");
		click(eleFindLeadsLink);
		
		WebElement elePhoneNum = locateElement("xpath", "//span[text()='Phone']");
		click(elePhoneNum);
		
		WebElement elePhNumText = locateElement("name", "phoneNumber");
		type(elePhNumText, ph);
		
		WebElement eleFindLeadLink = locateElement("xpath", "(//button[@class='x-btn-text'])[7]");
		click(eleFindLeadLink);  
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement eleResultLink = locateElement("xpath", "(//a[@class='linktext'])[4]");
		String firstID = eleResultLink.getText();
		System.out.println("FirstID:"+firstID);
		click(eleResultLink); 
		WebElement eleDelete = locateElement("link", "Delete");
		click(eleDelete);
		WebElement eleFindLeads = locateElement("link", "Find Leads");
		click(eleFindLeads);
		WebElement eleFirstId = locateElement("name", "id");
		type(eleFirstId, firstID);
		WebElement eleFindLeadButt = locateElement("xpath", "(//button[@class='x-btn-text'])[7]");
		click(eleFindLeadButt);  
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement eleMsg = locateElement("xpath", "//div[@class='x-paging-info']");
		
		System.out.println("ErrorMsg:"+eleMsg.getText());*/
			
	}
	
	
}
