package auditIFCTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import aRSAuditee.Method;
import login.BasePage;

public class Audittestcases extends BasePage{

	
	
	
	public static WebDriver driver = null;		//WebDriver instance created
	public static WebElement upload = null;		//WebElement to get upload button
	public static ExtentReports extent;			//Instance created for report file
	public static ExtentTest test;				//Instance created for tests
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	public static List<WebElement> elementsList = null;
	public static List<String> lines = null;
	
	
	public static XSSFSheet ReadExcel() throws IOException
		
	{
	//	fis = new FileInputStream("C:\\Users\\Shital Bhoyar\\eclipse-workspace\\AuditIFC\\TestData\\TestData.xlsx");

		fis = new FileInputStream("D:\\AuditIFCProject\\TestData\\TestData.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("D:\\AuditIFCProject\\Reports\\AuditeeArsTest.html",true);
		test = extent.startTest("Verify OpenBrowser");
		
		test.log(LogStatus.PASS, "Test Passed - Auditee Login");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
		initialization("company",0);
		XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		/*
		login.Login.BrowserSetup(URL);	
*/
	
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		Cell c2 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c2.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c3 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c3.getStringCellValue();		//Got the URL stored at position 2,1
		/*
		driver = login.Login.UserLogin(uname,password,"company");		//Method of Login class to login user.
		*/
	}
	
	
	
	
	
	

	
	
	@Test(priority = 1) 
	void OpenAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Audit Observation Status - open Audit Count Verification ");
		
		Method.OpenAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 2) 
	void OpenAuditSubmitted1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - Audit Step Verification Verification ");
		
		Method.OpenAuditSubmitted(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 3) 
	void OpenAuditSubmitted11() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Audit Observation Status - View Audit Details - Audit Step Verification ");
		
		Method.OpenAuditSubmitted1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 4) 
	void OpenAuditStepPerform1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - Change status - Audit Step - Next Button Verification ");
		
		Method.OpenAuditStepPerform(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 5) 
	void OpenAuditStepUserCreated1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - Change status - Audit Step - User Create Verification ");
		
		Method.OpenAuditStepUserCreated(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 6) 
	void SubmitAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Audit Observation Status - Submitted - Submit Count Verification ");
		
		Method.SubmitAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 7) 
	void commentAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Audit Observation Status - Submitted - Comment Count Verification ");
		
		Method.commentAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority = 8) 
	void OpenAuditFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Audit Observation Status - Open - Multiple Filter Verification ");
		
		Method.OpenAuditFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 9) 
	void MyWorkspaceAuditFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - Multiple Filter Verification ");
		
		Method.MyWorkspaceAuditFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	@Test(priority = 10) 
	void SubmitFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Audit Observation Status - Submit - Multiple Filter Verification ");
		
		Method.SubmitFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 11) 
	void CommentFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Audit Observation Status - Comment - Multiple Filter Verification ");
		
		Method.CommentFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 12) 
	void UpcomingAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Implementation Status - Upcoming Count Verification ");
		
		Method.UpcomingAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	
	@Test(priority = 13) 
	void OverdueAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Implementation Status - Overdue Count Verification ");
		
		Method.OverdueAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 14) 
	void SubmittedAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Implementation Status - Submitted Count Verification ");
		
		Method.SubmittedAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 15) 
	void CommentsAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Implementation Status - Comments Count Verification ");
		
		Method.CommentsAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}


	
	@Test(priority = 16) 
	void ImplementedAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Implementation Status - Implemented Count Verification ");
		
		Method.ImplementedAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 17) 
	void ImplementationOpenUpcomingFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Implementation Status - Open Audit - Upcoming Status Multiple filter Verification ");
		
		Method.ImplementationOpenUpcomingFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 18) 
	void ImplementationOpenOverdueFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Implementation Status - Open Audit - Overdue Status Multiple filter Verification ");
		
		Method.ImplementationOpenOverdueFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 19) 
	void ImplementationSubmittedForReviewSubmitFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Implementation Status - Submitted for Review - Submitted Status Multiple filter Verification ");
		
		Method.ImplementationSubmittedForReviewSubmitFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 20) 
	void ImplementationCommentsForReviewSubmitFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Implementation Status - Submitted for Review - Comments Status Multiple filter Verification ");
		
		Method.ImplementationCommentsForReviewSubmitFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 21) 
	void ImplementationImplementedtFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Implementation Status - Implemented Status Multiple filter Verification ");
		
		Method.ImplementationImplementedtFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	

	
	
	@Test(priority = 22) 
	void PreRequisiteOpen1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Pre-Requisite Summary - Open Count Verification ");
		
		Method.PreRequisiteOpen(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 23) 
	void PreRequisiteSubmitted1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Pre-Requisite Summary - Submitted Count Verification ");
		
		Method.PreRequisiteSubmitted(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 24) 
	void PreRequisiteRejected1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Pre-Requisite Summary - Rejected Count Verification ");
		
		Method.PreRequisiteRejected(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 25) 
	void PrerequisiteRejectedAuditFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Pre-Requisite Summary - Rejected Audit Multiple filter Verification  ");
		
		Method.PrerequisiteRejectedAuditFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	@Test(priority = 26) 
	void PrerequisiteOpenAuditFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Pre-Requisite Summary - Open Audit Multiple filter Verification ");
		
		Method.PrerequisiteOpenAuditFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 27) 
	void PrerequisiteSubmittedAuditFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Pre-Requisite Summary - Submitted Audit Multiple filter Verification ");
		
		Method.PrerequisiteSubmittedAuditFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	

	
	
	
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
  		Thread.sleep(5000);
  		//driver.close();
  		closeBrowser();
  	}	

	
	
	
	
	
}
