package leads.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import lib.selenium.WebDriverServiceImpl;

public class EditLeadPage extends WebDriverServiceImpl {

	//pagefactory, to load the webelement in the given variable
	public EditLeadPage(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver = driver;
		this.test =test;*/
		PageFactory.initElements(driver, this);
	}


	//locating webelement
	@FindBy(id = "updateLeadForm_companyName")
	WebElement eleCmpNameTextBox;

	@FindBy(name = "submitButton")
	WebElement eleSubmitButton;


	//method for business action
	@And("Verify title of the page")
	public EditLeadPage verifyEditPageTitle() {
		verifyExactTitle("Edit Lead");
		return this;
	}

	public EditLeadPage clearCmpName() {

		clear(eleCmpNameTextBox);
		return this;
	}
	@And("Change the company name as (.*)")
	public EditLeadPage typeCmpName(String cName) {
		clear(eleCmpNameTextBox);
		type(eleCmpNameTextBox, cName);
		return this;
	}
	@When("Click Update")
	public ViewLeadPage clickSubmitButton() {

		click(eleSubmitButton);
		return new ViewLeadPage(/*driver, test*/);
	}
}
