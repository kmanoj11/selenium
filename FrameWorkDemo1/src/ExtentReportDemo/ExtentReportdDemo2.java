package ExtentReportDemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportdDemo2 
{

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest parentExtentLogger;
	public static ExtentTest childExtentLogger;

	@Test
	public void extentreportdemo()
	{
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\k.manoj kumar\\OneDrive\\Desktop\\FrameWorkDemo\\ExtentReportDemo1\\test2.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger = extent.createTest("Test1");
		childExtentLogger=parentExtentLogger.createNode("senario_1");
		childExtentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
		childExtentLogger.log(Status.FAIL,MarkupHelper.createLabel(" - Test Case failed", ExtentColor.RED));

		extent.flush();
		System.out.println("Done");

	}

}
