package leads.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import lib.selenium.WebDriverServiceImpl;

public class MyHomePage extends WebDriverServiceImpl {
	
	//pagefactory, to load the webelement in the given variable
	public MyHomePage(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver = driver;
		this.test =test;*/
		PageFactory.initElements(driver, this);
	}
	
	
	//locating webelement
	@FindBy(linkText = "Leads")
	WebElement eleLeads;
	
	
	
	//method to perform business action
	
	
	
	@Then("Click on Leads link")
	public MyLeadsPage clickLeadLink() {
		
		click(eleLeads);
		
		return new MyLeadsPage(/*driver, test*/);	
		}

}
