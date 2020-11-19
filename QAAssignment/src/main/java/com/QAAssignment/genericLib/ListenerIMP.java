package com.QAAssignment.genericLib;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerIMP implements ITestListener{
	
	 @Override		
	    public void onFinish(ITestContext arg0) {					
	        				
	        		
	    }		

	    @Override		
	    public void onStart(ITestContext arg0) {					
	        				
	        		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	     				
	        		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult arg0) {					
	       
				try {
					WebdriverUtility.getScreenshot(BaseClass.staticDriver, arg0.getName());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestStart(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

}
