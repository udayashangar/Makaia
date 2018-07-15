package leads.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import leads.page.MyHomePage;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class MergeLeadsM extends PreAndPost {
	
	 @BeforeTest
	 public void beforeTest() {
		 
		 testcaseName = "MergeLead";
		 testcaseDesc = "Merge Lead using the data provide in excel";
		 nodeName = "Merge";
		 author = "Uday";
		 category="smoke";
		 excelFileName="MergeLead";
	 }

	
	//@Test(groups= {"sanity"})
	
	@Test(dataProvider="SIT")
	public void mergeLeadsM(String firstID, String secondID) {


		new MyHomePage(/*driver, test*/).clickLeadLink().clickMergeLead()
		.clickFromLeadImg().typeLeadIdTestBox(firstID).clickSearchButton().clickFirstResultLinkInNewWindow()
		.clickToLeadImg().typeLeadIdTestBox(secondID).clickSearchButton().clickFirstResultLinkInNewWindow()
		.clickMergeButton().AcceptAlert();
		
/*//6Click Leads link		
		WebElement eleLeadsLink = locateElement("link", "Leads");
		click(eleLeadsLink);
//7	Click Merge leads
		WebElement eleMergeLead = locateElement("link","Merge Leads");
		click(eleMergeLead);
//8Click on Icon near From Lead
		WebElement eleImg1 = locateElement("xpath", "(//img[@alt='Lookup'])[1]");
		click(eleImg1);
//9Move to new window
		switchToWindows(1);
//10Enter Lead ID
		WebElement eleLeadId = locateElement("name","id");
		type(eleLeadId, firstID);
//11Click Find Leads
		WebElement eleFindLeadSc = locateElement("class","x-btn-text");
		click(eleFindLeadSc);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
//12Click First Resulting lead
		WebElement eleFirstResult1 = locateElement("xpath","(//a[@class='linktext'])[1]");
		click(eleFirstResult1);
		
//13Switch back to primary window
		switchToWindow(0);
//14Click on Icon near To Lead
		WebElement eleImg2 = locateElement("xpath", "(//img[@alt='Lookup'])[2]");
		click(eleImg2);
//15Move to new window
		switchToWindows(1);
		
//16Enter Lead ID
		WebElement eleLeadId2 = locateElement("name","id");
		type(eleLeadId2, secondID);
//17Click Find Leads
		WebElement eleFindLeadSc2 = locateElement("class","x-btn-text");
		click(eleFindLeadSc2);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
//18Click First Resulting lead
		WebElement eleFirstResult2 = locateElement("xpath","(//a[@class='linktext'])[1]");
		click(eleFirstResult2);
//19Switch back to primary window
		switchToWindow(0);
		
//20Click Merge
		WebElement eleMergeBut = locateElement("class","buttonDangerous");
		click(eleMergeBut);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
//21Accept Alert
		acceptAlert();
//22Click Find Leads
		WebElement eleFindLeads2 = locateElement("link","Find Leads");
		click(eleFindLeads2);
//23Enter From Lead ID
		WebElement eleLeadId3 = locateElement("xpath","//input[@name='id']");
		type(eleLeadId3,firstID);
//24Click Find Leads
		WebElement eleFindLeads3 = locateElement("xpath","(//button[@class='x-btn-text'])[7]");
		click(eleFindLeads3);
//25Verify error msg
		WebElement eleErrorMsg = locateElement("class","x-paging-info");
		verifyExactText(eleErrorMsg, "No records to display");
		
//26Close the browser (Do not log out)
*/			
	}
	
}
