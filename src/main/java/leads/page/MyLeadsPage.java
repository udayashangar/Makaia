package leads.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import lib.selenium.WebDriverServiceImpl;

public class MyLeadsPage extends WebDriverServiceImpl {

	//pagefactory, to load the webelement in the given variable
	public MyLeadsPage(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver = driver;
		this.test =test;*/

		PageFactory.initElements(driver, this);
	}

	//locating webelement
	@FindBy(linkText = "Create Lead")
	WebElement eleCreateLead;

	@FindBy(linkText = "Find Leads")
	WebElement eleFindLead;	


	@FindBy(linkText = "Merge Leads")
	WebElement eleMergeLead;	



	//method for business action
	@Given("Click Find leads")
	public FindLeadPage clickFindLead() {
		click(eleFindLead);
		return new FindLeadPage(/*driver, test*/);
	}
	@And("Click on CreateLead link")
	public CreateLeadPage clickCreateLead() {

		click(eleCreateLead);

		return new CreateLeadPage(/*driver, test*/); 
	}

	public MergeLeadPage clickMergeLead() {
		click(eleMergeLead);
		return new MergeLeadPage(/*driver, test*/);	
	}

}
