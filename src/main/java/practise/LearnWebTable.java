package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		//Get the count of number of columns  
		//WebElement eleTable = driver.findElement(By.tagName("tbody"));
		List <WebElement> eleList1 = driver.findElements(By.tagName("th"));
		System.out.println("No. of columns in the given table: "+ eleList1.size());

		//Get the count of number of rows  
		List <WebElement> eleList2 = driver.findElements(By.tagName("tr"));
		System.out.println("No. of rows in the given table: "+ eleList2.size());

		//Get the progress value of 'Learn to interact with Elements'  
		String learnInt = driver.findElement(By.xpath("//*[@class='even']//font/following::td/font")).getText();
		System.out.println("Progress value of \"Learn to interact with Elements\": "+ learnInt);

		//Check the vital task for the least completed progress.
		 
		Map <Integer, Integer> progValues= new HashMap<Integer, Integer>();
		for(int i=2; i<=4; i++) {
			String prog = driver.findElement(By.xpath("//table[@cellspacing='0']//tr["+i+"]/td[2]/font")).getText();
			prog=prog.replaceAll("\\D","");
			int intProg = Integer.parseInt(prog);
			progValues.put(i,intProg);
			System.out.println(intProg);
			System.out.println("Size of prog: "+progValues.size());
		}
			
		/*for(Integer eachKey,eachValue:progValues) {
		System.out.println(entrySet());
	     }*/
		
		for(int j=0; j<progValues.size()-1; j++) {
			for (int k = 1; k <= j; k++) {
				if(progValues.get(j)!=progValues.get(k)) {
					System.out.println(progValues.get(k));
					
				}
				
			}
			
		}System.out.println("working");
		
		driver.close();

	}

}
