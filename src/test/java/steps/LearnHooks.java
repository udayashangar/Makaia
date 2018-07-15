package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import lib.selenium.WebDriverServiceImpl;

public class LearnHooks extends WebDriverServiceImpl{
	@Before
	public void beforeScenario(Scenario sc) {
		//System.out.println(sc.getName());
		//System.out.println(sc.getId());  
		startResult();
		startTestCase(sc.getName(),sc.getId());
		startTestModule("leads for LeafTaps");
		test.assignAuthor("Uday");
		test.assignCategory("Smoke");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();

		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();*/   	
	}

	@After
	public void afterScenario(Scenario sc) {
		//System.out.println(sc.getStatus());
		//System.out.println(sc.isFailed());
		closeActiveBrowser();
		endResult();


	}
}
