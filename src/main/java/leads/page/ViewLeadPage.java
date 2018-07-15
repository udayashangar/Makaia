package leads.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import lib.selenium.WebDriverServiceImpl;

public class ViewLeadPage extends WebDriverServiceImpl {

	//pagefactory, to load the webelement in the given variable
	public ViewLeadPage(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver = driver;
		this.test =test;*/
		PageFactory.initElements(driver, this);
	}

	//locating webelement
	@FindBy(id = "viewLead_firstName_sp")
	WebElement eleFirstName;

	@FindBy(linkText = "Edit")
	WebElement eleEditLink;

	@FindBy(linkText = "Duplicate Lead")
	WebElement eleDuplicateLeadLink;

	@FindBy(linkText = "Delete")
	WebElement eleDeleteLink;



	//method for business action
	//@Then("Confirm the changed name appears")
	@Then("Lead with firstname as (.*) is successfully created")
	public ViewLeadPage verifyFirstName(String fName) {

		verifyExactText(eleFirstName, fName);
		return this;
	}
	@And("Click Edit")
	public EditLeadPage clickEditLink() {

		click(eleEditLink);
		return new EditLeadPage(/*driver, test*/);
	}


	public MyLeadsPage clickDeleteLink() {
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(eleDeleteLink));
		click(eleDeleteLink);
		return new MyLeadsPage(/*driver, test*/);
	}

	public DuplicateLeadPage clickDuplicateLeadLink() {
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(eleDuplicateLeadLink));
		click(eleDuplicateLeadLink);
		return new DuplicateLeadPage(/*driver, test*/);
	}
	public ViewLeadPage verifyFirstNameText() {
		verifyExactText(eleFirstName, firstNameText);
		return this;
	}

}
