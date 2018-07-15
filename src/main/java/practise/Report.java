package practise;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report {

	public static void main(String[] args) throws IOException {
		
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/report.html");
		html.setAppendExisting(false);
		//html.loadXMLConfig(file);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		
		ExtentTest testSuite = extent.createTest("T1 CreateLeaf", "First Report for Creating Leaf");
		ExtentTest test = testSuite.createNode("leads");
		test.assignCategory("smoke");
		test.assignAuthor("Uday");
		
		test.pass("Create Leaf Success", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/snap1.jpg").build());
        test.fail("Login Failed");
		
		extent.flush();
	}

}
