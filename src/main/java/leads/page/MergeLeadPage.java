package leads.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class MergeLeadPage extends WebDriverServiceImpl {
	//WebDriverWait wait= new WebDriverWait(driver, 10);
	//pagefactory, to load the webelement in the given variable
	public MergeLeadPage(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver = driver;
		this.test =test;*/
		
		PageFactory.initElements(driver, this);
	}
	
	//locating webelement
	@FindBy(xpath = "(//img[@alt='Lookup'])[1]")
	WebElement eleFromLeadImg;
	
	@FindBy(xpath = "(//img[@alt='Lookup'])[2]")
	WebElement eleToLeadImg;
	
	@FindBy(className = "buttonDangerous")
	WebElement eleMergeButton;
	
	

	//method for business action
	
	public FindLeadPage clickFromLeadImg() {
		click(eleFromLeadImg);
		switchToWindows(1);
		
	return new FindLeadPage(/*driver, test*/);
	}

	public FindLeadPage clickToLeadImg() {
		//driver.register(this);
		//wait.until(ExpectedConditions.visibilityOf(eleToLeadImg));
		click(eleToLeadImg);
		switchToWindows(1);
		
	return new FindLeadPage(/*driver, test*/);
	}    

	public AlertHandlePage clickMergeButton() {
		click(eleMergeButton);
		return new AlertHandlePage(/*driver, test*/);
	}

}
