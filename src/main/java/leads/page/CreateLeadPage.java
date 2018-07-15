package leads.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import lib.selenium.WebDriverServiceImpl;

public class CreateLeadPage extends WebDriverServiceImpl {
	
	//pagefactory, to load the webelement in the given variable
	public CreateLeadPage(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver = driver;
		this.test =test;*/
		PageFactory.initElements(driver, this);
	}
	
	
	//locating webelement
	@FindBy(id = "createLeadForm_companyName")
	WebElement eleCmpName;
	
	@FindBy(id= "createLeadForm_firstName")
	WebElement eleFirstName;
	
	@FindBy(id= "createLeadForm_lastName")
	WebElement eleLastName;
	
	@FindBy(id= "createLeadForm_primaryPhoneNumber")
	WebElement elePhNum;
	
	@FindBy(name= "submitButton")
	WebElement eleCreateLeadBut;
	
		
	//method to perform business action
	@And("enter company name as (.*)")
	 public CreateLeadPage typeCmpName(String cName) {
		 type(eleCmpName, cName);
		 return this;
	 }
	@And("enter firstname as (.*)")
	 public CreateLeadPage typeFirstName(String fName) {
		 type(eleFirstName, fName);
		 return this;
	 }
	@And("enter lastname as (.*)")
	 public CreateLeadPage typeLastName(String lName) {
		 type(eleLastName, lName);
		 return this;
	 }
	 
	 public CreateLeadPage typePhNum(String ph) {
		 type(elePhNum, ph);
		 return this;
	 }
	
	 @When("click on CreateLead button")
	public ViewLeadPage clickCreateLeadButton() {
		
		click(eleCreateLeadBut);
		
		return new ViewLeadPage(/*driver, test*/);	
		}

}
