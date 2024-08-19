package com.thetestingacademy.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener {

    //@Override
    public void onTestStart(ITestResult result){
        ExtentManager.createTest(result.getMethod().getMethodName(), result.getMethod().getDescription());
    }

    //@Override
    public void onTestSucess(ITestResult result){
        ExtentManager.getInstance().flush();
    }

    //@Override
    public void onTestFailure(ITestResult result){
        ExtentManager.getInstance().flush();
    }

    //@Override
    public void onTestSkipped(ITestResult result){
        ExtentManager.getInstance().flush();
    }

    //@Override
    public void onStart(ITestResult result){
        ExtentManager.getInstance().flush();
    }

    //@Override
    public void onFinish(ITestResult result){
        ExtentManager.getInstance().flush();
    }

}
