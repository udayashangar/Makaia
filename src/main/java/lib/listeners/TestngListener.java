package lib.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestngListener implements IAnnotationTransformer, IRetryAnalyzer {

	int maxCount =0;
	
	@Override
	public boolean retry(ITestResult results) {
		
		if(!results.isSuccess() & maxCount<2) {
			maxCount++;
			return true;
		}
		
		return false;
	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		//annotation.setRetryAnalyzer(this.getClass());
		
		if(testMethod.getName().equals("deleteLead")) {
			annotation.setEnabled(false);
		}
		
		if(testMethod.getName().equals("createLead")){
			annotation.setTimeOut(10000);
		}
		
	}
	
	

}
