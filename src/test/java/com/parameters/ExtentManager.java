package com.parameters;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentEmailReporter;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

import java.util.List;

public class ExtentManager {

    public static ExtentReports extent;
    public static ExtentTest extentTest;

    public static void main(String[] args) {
        String fileName="report.html";
        extent=new ExtentReports();

        ExtentEmailReporter emailableReport=new ExtentEmailReporter("/Users/rabia/IdeaProjects/testNGPractice/report.html");
        extent.attachReporter(emailableReport);
        extentTest=extent.createTest("ExtentX");
        extentTest.assignAuthor("rabia");
        extentTest.log(Status.PASS,"pass");
        extent.flush();

    }


}
