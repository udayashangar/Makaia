package leads.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class AlertHandlePage extends WebDriverServiceImpl {
	
	//pagefactory, to load the webelement in the given variable
	public AlertHandlePage(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver = driver;
		this.test =test;*/
		
		PageFactory.initElements(driver, this);
	}
	
	//locating webelement
	
	
	
	

	//method for business action
	
	public ViewLeadPage AcceptAlert(){
		acceptAlert();
		
	return new ViewLeadPage(/*driver, test*/);
	}

	
}
