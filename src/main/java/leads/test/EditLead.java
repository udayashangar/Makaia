package leads.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import leads.page.MyHomePage;
import leads.page.MyLeadsPage;
import lib.data.ReadExcel;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class EditLead extends PreAndPost {
	
	 @BeforeTest
	 public void beforeTest() {
		 
		 testcaseName = "EditLead";
		 testcaseDesc = "Editing Lead using the data provide in excel";
		 nodeName = "Edit";
		 author = "Uday";
		 category="smoke";
		 excelFileName="EditLead";
	 }

	
	//@Test(dependsOnMethods={"tests.CreateLead.createLead"},description = "Edit Lead from Leaftaps" , groups= {"smoke"})
	
	 @Test(dataProvider="SIT")
		public void editLead(String fName,String cName) {
		
		
		new MyHomePage(/*driver, test*/).clickLeadLink()
		.clickFindLead().typeFindFirstName(fName).clickSearchButton()
		.clickFirstResultingIDLink().verifyFirstName(fName).clickEditLink().verifyEditPageTitle()
		.typeCmpName(cName).clickSubmitButton();
	
	 }	

 }
		/*//		6	Click Leads link		
		WebElement eleLeadsLink = locateElement("link", "Leads");
		click(eleLeadsLink);
		//		7	Click Find leads		
		WebElement eleFindLeadsLink = locateElement("link", "Find Leads");
		click(eleFindLeadsLink);
		//		8	Enter first name		
		WebElement elefirstName = locateElement("xpath", "(//input[@name ='firstName'])[3]");
		click(elefirstName);
		//		9	Click Find leads button		
		WebElement eleSearchBut = locateElement("xpath", "(//button)[7]");
		click(eleSearchBut);   
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//		10	Click on first resulting lead		
		WebElement eleResultLink = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		click(eleResultLink);
		//		11	Verify title of the page		
		boolean title = driver.getTitle().contains("View Lead");
		System.out.println("Title Verified:"+ title);
		//		12	Click Edit		
		WebElement eleEditLink = locateElement("link", "Edit");
		click(eleEditLink);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//		13	Change the company name
		WebElement eleCmpNameUp = locateElement("id", "updateLeadForm_companyName");
		eleCmpNameUp.clear();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement eleCmpNameUp2 = locateElement("id", "updateLeadForm_companyName");
		type(eleCmpNameUp2, cName);


		//		14	Click Update		
		WebElement eleSubButUp = locateElement("name", "submitButton");
		click(eleSubButUp);
		//		15	Confirm the changed name appears
		//		16	Close the browser (Do not log out)
*/
		
