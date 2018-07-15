package lib.selenium;

import org.testng.annotations.Test;

import lib.data.ReadExcel;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class PreAndPost extends WebDriverServiceImpl{
	
	 public String testcaseName;
	 public String testcaseDesc;
	 public String nodeName;
	 public String author;
	 public String category;
	 public String excelFileName;
	
  
  @Parameters({"url","uname"/*,"pass"*/})
  @BeforeMethod(groups= {"smoke","sanity"})
  
  public void beforeMethod(String url, String uname/*,String pass*/) {
	//for reports
			startTestModule(nodeName);
			test.assignAuthor(author);
			test.assignCategory(category);
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		
		driver.manage().window().maximize();
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, uname);
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
  }

  @AfterMethod(groups=  {"smoke","sanity"})
  public void afterMethod() {
	  closeActiveBrowser();
	  
  }

  @BeforeClass
  public void beforeClass() {
	  startTestCase(testcaseName,testcaseDesc);
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	 
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  startResult();
  }

  @AfterSuite
  public void afterSuite() {
	  endResult();
  }

//Data Provider
	@DataProvider(name="SIT", indices = {0}/*, parallel=true*/)
	public String[][] getData() throws IOException {

		ReadExcel obj = new ReadExcel();
		String[][] readExcel = obj.readExcel(excelFileName);
		return readExcel;


	}
}
