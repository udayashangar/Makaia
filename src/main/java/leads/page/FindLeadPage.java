package leads.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import lib.selenium.WebDriverServiceImpl;

public class FindLeadPage extends WebDriverServiceImpl {
	
	
	
	//pagefactory, to load the webelement in the given variable
	public FindLeadPage(/*EventFiringWebDriver driver, ExtentTest test*/) {
	/*	this.driver = driver;
		this.test =test;*/
		PageFactory.initElements(driver, this);
	}
	
	//locating webelement
		
	@FindBy(xpath="(//input[@name ='firstName'])[3]")
	WebElement eleFindFirstName;
	
	@FindBy(xpath= "//button[text()='Find Leads']")
	WebElement eleSearchButton;
							     
	@FindBy(xpath="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	WebElement eleFirstResultingIDLink;
	
	@FindBy(xpath="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")
	WebElement eleFirstResultingNameLink;
	
	@FindBy(linkText="Email")
	WebElement eleEmailLink;
	
	@FindBy(name="emailAddress")
	WebElement eleEmailTextBox;
	
	@FindBy(xpath="//span[text()='Phone']")
	WebElement elePhoneLink;
	
	@FindBy(name="phoneNumber")
	WebElement elePhNumTextBox;
	
	@FindBy(name="id")
	WebElement eleLeadIdTextBox;
	
	@FindBy(xpath="//div[@class='x-paging-info']")
	WebElement eleErrormsg;
	

	//method to perform business action
	@And("Enter first name as (.*)")
	public FindLeadPage typeFindFirstName(String fName) {
		type(eleFindFirstName, fName);
		return this;
	}
	@And("Click Find leads button")
	public FindLeadPage clickSearchButton() {
		click(eleSearchButton);		
		return this;	
	}
	
	
	public FindLeadPage clickEmailLink() {
		click(eleEmailLink);		
		return this;	
	}
	
	public FindLeadPage typeEmailTextBox(String eMail) {
		type(eleEmailTextBox, eMail);
		return this;
	}
	
	public FindLeadPage clickPhoneLink() {
		click(elePhoneLink);		
		return this;	
	}
	
	public FindLeadPage typePhNumTextBox(String ph) {
		type(elePhNumTextBox, ph);
		return this;
	}
	
	public FindLeadPage getTextFirstResultingIDLink() {
		firstIdText = eleFirstResultingIDLink.getText();
		return this;
	}
	
	public FindLeadPage getTextFirstResultingNameLink() {
		firstNameText = eleFirstResultingNameLink.getText();
		return this;
	}
	@And("Click on first resulting lead")
	public ViewLeadPage clickFirstResultingIDLink() {
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(eleFirstResultingIDLink));
		getTextFirstResultingIDLink();
		click(eleFirstResultingIDLink);		
		return new ViewLeadPage(/*driver, test*/);	
	}
	
	public ViewLeadPage clickFirstResultingNameLink() {
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(eleFirstResultingNameLink));
		getTextFirstResultingNameLink();
		click(eleFirstResultingNameLink);		
		return new ViewLeadPage(/*driver, test*/);	
	}
	
	public MergeLeadPage clickFirstResultLinkInNewWindow() {
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(eleFirstResultingIDLink));
		click(eleFirstResultingIDLink);	
		switchToWindows(0);		
		return new MergeLeadPage(/*driver, test*/);	
	}
	
	public FindLeadPage typeLeadIdTestBox(String leadID) {
		type(eleLeadIdTextBox, leadID);
		return this;
	}
	
	public void verifyErrorMsg() {
		verifyExactText(eleErrormsg, "No records to display");
	}

}
