package leads.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import leads.page.MyHomePage;
import leads.page.MyLeadsPage;
import lib.data.ReadExcel;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class CreateLead extends PreAndPost{

 @BeforeTest
 public void beforeTest() {
	 
	 testcaseName = "CreateLead";
	 testcaseDesc = "Creating New Lead using the data provide in excel";
	 nodeName = "Create";
	 author = "Uday";
	 category="smoke";
	 excelFileName="CreateLead";
 }

	//@Test(dataProvider="SIT", invocationCount=2,timeOut=30000, groups= {"smoke"})
	@Test(dataProvider="SIT")
	public void createLead(String cName, String fName, String lName,String ph) {

		new MyHomePage(/*driver, test*/).clickLeadLink()
		.clickCreateLead()
		.typeCmpName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.typePhNum(ph)
		.clickCreateLeadButton();
		
		
		/*//locating the element
		 WebElement eleCreateLeadLink = locateElement("link","Create Lead");
		click(eleCreateLeadLink);

		WebElement eleCmpName = locateElement("id", "createLeadForm_companyName");
		type(eleCmpName, cName);
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		type(eleFirstName, fName);
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName, lName);
		WebElement eleSourceId = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingValue(eleSourceId, "LEAD_PR");

		WebElement elePhNum = locateElement("id", "createLeadForm_primaryPhoneNumber");
		type(elePhNum, ph+"");
		WebElement eleCreateLeadBut = locateElement("name", "submitButton");
		click(eleCreateLeadBut);*/

	}
}




