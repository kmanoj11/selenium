package ExtentReportDemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportdDemo4 
{

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest parentExtentLogger;
	public static ExtentTest childExtentLogger;

	@Test
	public void extentreportdemo()
	{
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\k.manoj kumar\\OneDrive\\Desktop\\FrameWorkDemo\\ExtentReportDemo1\\test4.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger = extent.createTest("funtional flow_1");
		childExtentLogger=parentExtentLogger.createNode("senario_1");
		childExtentLogger.log(Status.FAIL,MarkupHelper.createLabel(" - Test Case failed", ExtentColor.RED));
		
		childExtentLogger=parentExtentLogger.createNode("senario_2");
		childExtentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
		
		parentExtentLogger = extent.createTest("funtional flow_2");
		childExtentLogger=parentExtentLogger.createNode("senario_3");
		childExtentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
		
		childExtentLogger=parentExtentLogger.createNode("senario_4");
		childExtentLogger.log(Status.SKIP,MarkupHelper.createLabel(" - Test Case skipped", ExtentColor.GREY));

		extent.flush();
		System.out.println("Done");

	}

}
