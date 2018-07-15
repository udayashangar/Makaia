package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadC{
	ChromeDriver driver;

	/*//		Given Open the browser
	@Given("Open the browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	//		And launch URL
	@And("launch URL")
	public void launchURL() {
		driver.get("http://leaftaps.com/opentaps/");
	}

	//		And Set Timeout
	@And("Set Timeout")
	public void setTimeout() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	//		And maximize the browser
	@And("maximize the browser")
	public void maximizeBrowser() {
		driver.manage().window().maximize();

	}

	//		And enter the username
	@Given ("enter the username as (.*)")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);

	}

	//		And enter the password
	@And("enter the password as (.*)")
	public void enterPassword(String uPass) {
		driver.findElement(By.id("password")).sendKeys(uPass);

	}
	//		When Click on Login Button
	@And("Click on Login Button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	//			And Click on CRM/SFA link
	@And("Click on CRMSFA link")
	public void ClickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();;
	}
	//			And Click on Leads link
	@And("Click on Leads link")
	public void ClickLeadsLink() {
		driver.findElement(By.linkText("Leads")).click();
	}

	//			And Click on CreateLead link
	@And("Click on CreateLead link")
	public void clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();

	}
	//			And enter company name
	@And("enter company name as (.*)")
	public void enterCompanyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}
	//			And enter firstname
	@And("enter firstname as (.*)")
	public void enterFirstname(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

	}
	//			And enter lastname
	@And("enter lastname as (.*)")
	public void enterLastname(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	//			When click on CreateLead button
	@When("click on CreateLead button")
	public void clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();;
	}

	//			Then CreateLead should be successful
	@Then("CreateLead should be successful")
	public void loginSuccess() {
		System.out.println("CreateLead is Successfull");		
	}
*/
}

