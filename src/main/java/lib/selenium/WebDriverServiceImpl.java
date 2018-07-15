package lib.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import lib.listeners.WebDriverListener;

public class WebDriverServiceImpl extends WebDriverListener implements WebDriverService {
	
	public static String firstIdText;
	public static String firstNameText; 
	protected Set<String> eleSet1;
	protected List<String> eleList1;
	protected int winSize;
	Boolean True;

	public WebElement locateElement(String locator, String locValue) {

		try {
			switch (locator) {
			case "id":
				return driver.findElement(By.id(locValue));

			case "class":
				return driver.findElement(By.className(locValue));

			case "link":
				return driver.findElement(By.linkText(locValue));

			case "name":
				return driver.findElement(By.name(locValue));

			case "xpath":
				return driver.findElement(By.xpath(locValue));
				
			
			default:
				break;
			}
		} catch (NoSuchElementException e) {
			//System.err.println("Element Not found on locator" + locator + "with value " + locValue);
			throw new RuntimeException("Element Not Found");
			// e.printStackTrace();
		} catch (WebDriverException e) {
			System.err.println("Element Not Found");

		} 

		return null;
	}

	public void clear(WebElement ele) {
		driver.unregister(this);
		ele.clear();
		driver.register(this);

	}

	public void type(WebElement ele, String data) {
		
		try {
			ele.sendKeys(data);
			reportSteps("The Data "+data+" is Entered Successfully", "pass");
		} catch (WebDriverException e) {
			reportSteps("The Data "+data+" is not Entered Successfully", "fail");
		}	
		
		
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			reportSteps("Click Action is Successful", "PASS");
		} catch (NoSuchElementException e) {
			//System.err.println("Element " + ele + "to click is not available");
			reportSteps("Click Action is Not Successful", "FAIL");
		} catch (WebDriverException e) {			
			//System.err.println("Click action failed while clicking " + ele);
			reportSteps("Click Action is Not Successful", "FAIL");
			//throw new RuntimeException("Click action failed");
		}
	}

	public String getText(WebElement ele) {
		ele.getText();
		return null;
	}

	public void selectDropDownUsingVisibleText(WebElement ele, String value) {
		Select visibleText = new Select(ele);
		try {

			visibleText.selectByVisibleText(value);
		} catch (NoSuchElementException e) {
			//System.err.println("Given text " + value + "is not available in the dropdown element " + ele);
			throw new RuntimeException("Select option not available");
		} 
	}

	public void selectDropDownUsingValue(WebElement ele, String value) {

		try {
			Select passValue = new Select(ele);
			passValue.selectByValue(value);
		} catch (NoSuchElementException e) {
			System.err.println("Given value " + value + "is not available in the dropdown element " + ele);
			throw new RuntimeException("Select option not available");
		} 
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select usingIndex = new Select(ele);
			usingIndex.selectByValue("value");
		} catch (NoSuchElementException e) {
			System.err.println("Given index " + index + "is not available in the dropdown element " + ele);
			throw new RuntimeException("Select option not available");
		} 

	}

	public boolean verifyExactTitle(String expectedTitle) {
		try {
			driver.getTitle().contentEquals(expectedTitle);
			System.out.println("Title "+"\"" + expectedTitle +"\"" + " is Exactly Matching");
		} catch (NoSuchElementException e) {

			System.err.println("Given Title " + expectedTitle + "is not exactly getting matched with the page title");
		}
		return false;
	}

	public boolean verifyPartialTitle(String expectedTitle) {
		try {
			driver.getTitle().contains(expectedTitle);
		} catch (NoSuchElementException e) {
			System.err
					.println("Given Title contents " + expectedTitle + "is not partially matching with the page title");
		}
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			ele.getText().contentEquals(expectedText);
			System.out.println("Text "+"\"" + expectedText+"\"" + " is Exactly Matching");
		} catch (NoSuchElementException e) {
			System.err.println("Text " +"\""+ expectedText +"\""+ " is not Exactly Matching");
		}

	}

	public void verifyPartialText(WebElement ele, String expectedText) {

		try {
			ele.getText().contains(expectedText);
			System.out.println("Text " +"\""+ expectedText +"\""+ "is Partially Matching");
		} catch (NoSuchElementException e) {
			System.err.println("Text " +"\""+ expectedText +"\""+ "is not Partially Matching");
		}

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {

		try {
			ele.getAttribute(attribute).contentEquals(value);
			System.out.println("ExactAttribute Verification for the weblwment (" + ele + ")and its attribute ("
					+ attribute + ") with value " + value + ":  is Passed");
		} catch (NoSuchElementException e) {
			System.err.println("ExactAttribute Verification for the weblwment (" + ele + ")and its attribute ("
					+ attribute + ") with value " + value + ":  is Failed");
		}

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {

		try {
			ele.getAttribute(attribute).contains(value);
			System.out.println("PartialAttribute Verification for the weblwment (" + ele + ")and its attribute ("
					+ attribute + ") with value " + value + ":  is Passed");
		} catch (NoSuchElementException e) {
			System.err.println("PartialAttribute Verification for the weblwment (" + ele + ")and its attribute ("
					+ attribute + ") with value " + value + ":  is Failed");
		}

	}

	public void verifySelected(WebElement ele) {
		try {
			ele.isSelected();
			System.out.println("Webelement " + ele + " is Selected");
		} catch (NoSuchElementException e) {
			System.err.println("Webelement " + ele + " is Not Selected");
		}

	}

	public void verifyDisplayed(WebElement ele) {

		try {
			ele.isDisplayed();
			System.out.println("Webelement " + ele + " is Displayed");
		} catch (NoSuchElementException e) {
			System.err.println("Webelement " + ele + " is Not Displayed");
		}

	}

	public void switchToWindows(int index) {
		try {
			eleSet1 = driver.getWindowHandles();
			
		} catch (NoSuchWindowException e) {
			System.err.println("No.of Windows doesnt Exist");

		} 
		eleList1 = new ArrayList<String>(eleSet1);
		eleList1.addAll(eleSet1);
		winSize = eleList1.size();
		try {
			driver.switchTo().window(eleList1.get(index));
			reportSteps("Window Switching is Successfull", "PASS");
		} catch (NoSuchWindowException e) {
			//System.err.println("Window doesn't Exist");
			
			reportSteps("Window Switching is Not Successfull", "FAIL");
			throw new RuntimeException("Window doesn't Exist");

		}

	}
	public void switchToWindow(int index) {
		try {
			/*String[] win1 = new String[1];
			win1[index] = driver.getWindowHandle();
			driver.switchTo().window(win1[index]);*/
			driver.switchTo().window(eleList1.get(index));
			reportSteps("Window Switching is Successfull", "PASS");
		} catch (Exception e) {
			e.printStackTrace();			
			reportSteps("Window Switching is Not Successfull", "FAIL");
		}
	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
		} catch (NoSuchElementException e) {
			//System.err.println("Given Frame " + ele + " not available");
			throw new RuntimeException("Frame not available");
		} 

	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			reportSteps("Alert Accept is Successfull", "PASS");
		} catch (UnhandledAlertException e) {
			//System.err.println("No Alert found to Accept");
			reportSteps("Alert Accept is Not Successfull", "FAIL");
			throw new RuntimeException("No Alert found");
			
		} 

	}

	public void dismissAlert() {

		try {
			driver.switchTo().alert().dismiss();
		} catch (UnhandledAlertException e) {
			System.err.println("No Alert found to Dismiss");
			throw new RuntimeException("No Alert found");
		} finally {
			takeSnap();
		}

	}

	public String getAlertText() {
		try {
			driver.switchTo().alert().getText();
		} catch (NoSuchElementException e) {
			System.err.println("No Alert Text found to Read");
		}

		return null;
	}

	public void closeActiveBrowser() {
		try {
			driver.close();
		} catch (NoSuchWindowException e) {
			System.err.println("Issue in closing the Active Window");
			//throw new RuntimeException("No Active Window Found");
		}
		
	}

	public void closeAllBrowsers() {

		try {
			driver.quit();
		} catch (NoSuchWindowException e) {
			System.err.println("Issue in closing the all open Windows");
			//throw new RuntimeException(" Multiple window closing error");

	}
	}
	public void sendKeyboardKeys() {
		driver.getKeyboard().sendKeys(Keys.ESCAPE);

	}

	
}

