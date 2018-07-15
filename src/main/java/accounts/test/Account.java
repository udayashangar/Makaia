package accounts.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class Account extends WebDriverServiceImpl{

	@Test
	public void createAccount() {
		
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		
		WebElement eleCreateAcc = locateElement("link","Create Account");
		click(eleCreateAcc);
		
		WebElement eleAccName = locateElement("xpath","(//input[@id='accountName'])[1]");
		type(eleAccName,"sudaysh");
		
		WebElement eleIndustry = locateElement("name","industryEnumId");
		selectDropDownUsingVisibleText(eleIndustry, "Aerospace");
		
		WebElement elePreCurr = locateElement("xpath","(//select[@id='currencyUomId'])[1]");
		//clear(elePreCurr);
		selectDropDownUsingValue(elePreCurr,"AED");
		
		WebElement eleSourceId = locateElement("xpath","//select[@id='dataSourceId']");
		selectDropDownUsingValue(eleSourceId,"LEAD_DIRECTMAIL");
		
		WebElement eleMarketCamp = locateElement("xpath","//select[@id='marketingCampaignId']");
		selectDropDownUsingValue(eleMarketCamp,"9002");
		
		WebElement elePhNum = locateElement("xpath","//input[@id='primaryPhoneNumber']");
		type(elePhNum,"98435");
		
		WebElement eleCity = locateElement("xpath","//input[@id='generalCity']");
		type(eleCity,"Chennai");
		
		WebElement eleEmail = locateElement("xpath","//input[@id='primaryEmail']");
		type(eleCity,"u@s.com");
		
		
		WebElement eleCountry = locateElement("id", "generalCountryGeoId");
		selectDropDownUsingValue(eleCountry,"USA");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		WebElement eleState = locateElement("id", "generalStateProvinceGeoId");
		selectDropDownUsingValue(eleState,"AL");
		
		WebElement eleCreatAccBut = locateElement("xpath","//input[@value='Create Account']");
		click(eleCreatAccBut);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement eleAccId = locateElement("xpath","(//span[@class='tabletext'])[3]");
		String accId = eleAccId.getText();
		//int l = accId.length();
		//String id = accId.substring(l-6, l-1);
		//System.out.println(accId);
		String id =accId.replaceAll("\\D", " ");
		
	    //System.out.println(accId.replaceAll("\\D", " "));
		
		
		WebElement eleFindAcc= locateElement("link","Find Accounts");
		click(eleFindAcc);
		
		WebElement eleAccIDField = locateElement("xpath","(//div[@class='x-form-element']/input)[13]");
		type(eleAccIDField,id.trim());
		
		WebElement eleAccName2 = locateElement("xpath","(//div[@class='x-form-element']/input)[14]");
		type(eleAccName2,"sudaysh");
		
		WebElement eleFindBut2 = locateElement("xpath","(//button[@class='x-btn-text'])[7]");
		click(eleFindBut2);
		
		WebElement eleSearchId = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		verifyExactText(eleSearchId,id.trim());
		
		closeActiveBrowser();

		
		
		
		
		
		
		
	}
	
	
}




