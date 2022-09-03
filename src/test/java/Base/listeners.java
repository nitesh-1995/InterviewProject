package Base;


import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listeners extends baseClass implements ITestListener
{
		public void onStart(ITestContext result) 
		{
			Reporter.log("The Program Started in "+ result.getName(),true);
		}

		public void onTestStart(ITestResult result)
		{
			Reporter.log("The Execution Started in "+ result.getName(),true);
		}
		
		
		public void onTestSuccess(ITestResult result)
		{
			Reporter.log("The Execution Successful in "+ result.getName(),true);
		}
		
		public void onFinish(ITestContext result)
		{
			Reporter.log("The Program Finished in "+ result.getName(),true);
		}
		
		public void onTestFailure(ITestResult result) 
		{
			Reporter.log("The Execution Failed in "+ result.getName(),true);
			try {
					baseClass.Screenshot(driver, "Failed Test Case", "Gmail Compose Validation", ".jpg");
				} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void onTestSkipped(ITestResult result) 
		{
			Reporter.log("The Execution Skipped in "+ result.getName(),true);
		}
}
