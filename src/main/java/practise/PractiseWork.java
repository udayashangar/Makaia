package practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import practise.NameReverse;
import lib.selenium.WebDriverServiceImpl;

public class PractiseWork extends WebDriverServiceImpl{
	@Test
	public void practiseWork() {
		
		NameReverse obj = new NameReverse();
		obj.method1();
		NameReverse.method2();
		NameReverse.method3();
		
	/*	//1	Launch the browser
		//2 Enter Username
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		//3Enter the password
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		//4Click Login
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);

		//Take ScreenShot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps2/Practise/img.jpeg");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
	}

}
