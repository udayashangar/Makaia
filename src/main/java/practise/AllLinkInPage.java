package practise;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkInPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.google.com");

		List<WebElement> eleList = driver.findElementsByTagName("a");
		int size = eleList.size();
		System.out.println(size);
		for(WebElement eachEle: eleList) {
			System.out.println(eachEle);
		}
	}

}
