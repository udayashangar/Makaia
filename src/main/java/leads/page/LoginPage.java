package leads.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import lib.selenium.WebDriverServiceImpl;

public class LoginPage extends WebDriverServiceImpl {

	//pagefactory, to load the webelement in the given variable
	public LoginPage(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver = driver;
		this.test =test;*/
		PageFactory.initElements(driver, this);
	}

	//locating webelement
	@FindBy(id = "username")
	WebElement eleUsername;

	@FindBy(id = "password")
	WebElement elePassword;

	@FindBy(className="decorativeSubmit")
	WebElement eleLoginButton;

	//method to perform business action

	@Given("enter the username as (.*)")		
	public LoginPage typeLoginUsername(String uName) {

		type(eleUsername,uName);

		return this;	
	}

	@And("enter the password as (.*)")
	public LoginPage typeLoginPassword(String lPass) {

		type(elePassword,lPass);

		return this;	
	}
	@And("Click on Login Button")
	public HomePage clickLoginButton() {

		click(eleLoginButton);
		return new HomePage();

	}

}
