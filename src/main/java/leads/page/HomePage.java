package leads.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import lib.selenium.WebDriverServiceImpl;

public class HomePage extends WebDriverServiceImpl {

	//pagefactory, to load the webelement in the given variable
	public HomePage(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver = driver;
		this.test =test;*/
		PageFactory.initElements(driver, this);
	}


	//locating webelement
	@FindBy(linkText = "CRM/SFA")
	WebElement eleCRMSFA;

	//method to perform business action
	@When("Click on CRMSFA link")
	public MyHomePage clickCRMSFA() {

		click(eleCRMSFA);
		return new MyHomePage();

	}

}
