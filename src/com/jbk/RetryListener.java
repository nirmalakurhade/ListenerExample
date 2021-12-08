package com.jbk;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {
    int count =1;
    int maxLimit =3;
    
	@Override
	public boolean retry(ITestResult result) {
		
		if(count<maxLimit) {
			count++;
			return true;
		}
		return false;
	}

}
