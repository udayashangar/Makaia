package practise;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportPract {
	
	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter html =new ExtentHtmlReporter("./reports/reports.html");
		html.setAppendExisting(true);
		html.loadXMLConfig("./src/main/resources/extent-config.xml");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest testSuite = extent.createTest("Creat Leads","Leads are getting created");
		ExtentTest test = testSuite.createNode("Leads");
		test.assignCategory("smoke");
		test.assignAuthor("Uday");
		
		MediaEntityBuilder img = MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/snap1.jpg");
		
		test.pass("Test1 Passed",img.build());
		test.pass("Test2 Passed");
		test.pass("Test3 Passed");
		test.fail("Test4 failed");
		test.fail("Test5 failed");
		extent.flush();
	}

}
