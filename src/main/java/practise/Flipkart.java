package practise;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class Flipkart extends WebDriverServiceImpl{

	@Test
	public void flipkart() {
		
//sendKeyboardKeys("ESCAPE");
//		Open Flipkart website 
//		Close the login screen
		sendKeyboardKeys();
//		Mouse over to TVs & Appliances
		Actions driver1 = new Actions(driver);
		WebElement eleTvApp = locateElement("link","TVs & Appliances");
		driver1.moveToElement(eleTvApp).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Click on Samsung product
		WebElement eleSamsung = locateElement("link","Samsung");
		driver1.click(eleSamsung).perform();
//		In Price filter, select min price to 25000
		WebElement eleMinPrice = locateElement("xpath","(//select[@class='fPjUPw'])[1]");
		selectDropDownUsingVisibleText(eleMinPrice, "₹25000");
//		In Price filter, select max price to 60000
		
		WebElement eleMaxPrice = locateElement("xpath","(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingVisibleText(eleMaxPrice, "₹60000");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Click on Screensize filter
		WebElement eleScrSize = locateElement("xpath","(//div[@class='_2yccxO D0YrLF'])[2]");
		click(eleScrSize);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Check 48 - 55 size box	
		WebElement eleLSize2 = locateElement("xpath","//div[text()='48 - 55']");
		click(eleLSize2);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Click on the first product 
		WebElement eleProdPriceWin1 = locateElement("xpath", "(//div[@class='_1vC4OE _2rQ-NK'])[1]");
		String priceWin1 = eleProdPriceWin1.getText();
			   priceWin1 = priceWin1.replaceAll("\\D", " ");
			   priceWin1 = priceWin1.trim();
		
		
		System.out.println("In Win1, Win1 Price="+priceWin1);	
		WebElement eleFirstProd = locateElement("xpath", "//div[text()='Samsung Series 6 123cm (49 inch) Full HD Curved LED Smart TV']");
		click(eleFirstProd);
			
//		Switch to New window 
		switchToWindow(1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("In Win2, Win1 Price="+priceWin1);
	
//		Confirm the price on the first window is same as in second window
		WebElement eleProdPriceWin2 = locateElement("xpath", "//div[@class='_1vC4OE _3qQ9m1']");
		String priceWin2 = eleProdPriceWin2.getText();
		   priceWin2 = priceWin2.replaceAll("\\D", " ");
		   priceWin2 = priceWin2.trim();                       
		System.out.println("In Win2, Win2 Price="+priceWin2);
		verifyExactText(eleProdPriceWin2, priceWin1);
//		Close the window
		closeActiveBrowser();
//		Switch back to parent window 
		driver.switchTo().window(eleList1.get(0));
//		Check Add to Compare for the first 2 products
		WebElement eleAdd1 = locateElement("xpath","(//span[text()='Add to Compare'])[1]");
		click(eleAdd1);
		WebElement eleAdd2 = locateElement("xpath","(//span[text()='Add to Compare'])[2]");
		click(eleAdd2);
		
//		Click on compare button (on right bottom corner)
		WebElement eleCompare = locateElement("xpath","//span[text()='COMPARE']");
		click(eleCompare);
//		Verify the Compare appears as section title
		
		WebElement eleSecCompare = locateElement("xpath","(//span[text()='Compare'])[1]");
		verifyExactText(eleSecCompare, "Compare");
//		Print the lowest price between the two items		
		WebElement elePrice1 = locateElement("xpath", "(//div[@class='_1vC4OE'])[1]");
		String price1 = elePrice1.getText();
		price1 = price1.replaceAll("\\D", " ");
		price1 = price1.replaceAll("\\s", "");
		int result1 = Integer.parseInt(price1);
		System.out.println(result1);
		WebElement elePrice2 = locateElement("xpath", "(//div[@class='_1vC4OE'])[2]");
		String price2 = elePrice2.getText();
		price2 = price2.replaceAll("\\D", " ");
		price2 = price2.replaceAll("\\s", ""); 
		int result2 = Integer.parseInt(price2);
		if(result1<result2)
		{
			System.out.println("Lowest Price = "+result1);
		}else
		{
			System.out.println("Lowest Price = "+result2);
		}
		
		
		
		
	}
	
	
}




