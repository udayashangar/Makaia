package lib.reports;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import lib.listeners.WebDriverListener;
import lib.selenium.PreAndPost;

public abstract class Report {
	
	public static ExtentHtmlReporter html;
	public static ExtentReports extent;
	public static ExtentTest testSuite, test;
		
	//@BeforeSuite
	public void startResult() {
		html = new ExtentHtmlReporter("./reports/report.html");
		html.setAppendExisting(true);
		html.loadXMLConfig("./src/main/resources/extent-config.xml");
		
		extent = new ExtentReports();
		extent.attachReporter(html);
	}
		
	//@BeforeClass
	public ExtentTest startTestCase(String testcaseName, String testcaseDesc) {
		
	testSuite = extent.createTest(testcaseName,testcaseDesc);
	return testSuite;
	}
		
	//@BeforeMethod
	public ExtentTest startTestModule(String nodeName) {
		test = testSuite.createNode(nodeName);
	
	return test;
	}
	
	//@AfterSuite
	public void endResult() {
		extent.flush();
	}
	
	public abstract long takeSnap();

	public void reportSteps(String desc,String status) {
		
		
		MediaEntityModelProvider img = null;

		long snapNumber = 1000000L;
		snapNumber = takeSnap();

			try {
			img = MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/"+snapNumber+".png").build();
		} catch (IOException e) {			
		}		

		if(status.equalsIgnoreCase("PASS")) {
			test.pass(desc, img);		
		}else if(status.equalsIgnoreCase("FAIL")) {
			test.fail(desc, img);
			throw new RuntimeException();
		}else if(status.equalsIgnoreCase("WARNING")) {
			test.warning(desc, img);		
		}else {
			test.info(desc);
		}
	}

	
	
	
/*	public void testCaseSteps(String desc, String status) {
		
		try {
			MediaEntityModelProvider img = MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/snap.jpg").build();
			if (status.equalsIgnoreCase("PASS")){
				test.pass(desc,img);
			}
			if (status.equalsIgnoreCase("Fail")){
				test.fail(desc,img);
				throw new RuntimeException();
			}
			if (status.equalsIgnoreCase("warning")){
				test.warning(desc,img);
			}

		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		*/	
}

