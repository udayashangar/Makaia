package leads.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class DuplicateLeadPage extends WebDriverServiceImpl {

	//pagefactory, to load the webelement in the given variable
	public DuplicateLeadPage(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver = driver;
		this.test =test;*/
		PageFactory.initElements(driver, this);
	}

	//locating webelement
	@FindBy(name = "submitButton")
	WebElement eleSubmitButton ;


	//method for business action
	public DuplicateLeadPage verifyPageTitle() {
		verifyExactTitle("Duplicate Lead");
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {

		click(eleSubmitButton);
		return new ViewLeadPage(/*driver, test*/);
	}


}
