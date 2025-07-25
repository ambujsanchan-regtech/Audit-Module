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

import aRSAuditee.MethodCritical;
import login.BasePage;

public class AuditeeCriticaltestcases extends BasePage{
	
	
//	public static WebDriver driver = null;		//WebDriver instance created
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
	
		
		fis = new FileInputStream("D:\\AuditIFCProject\\TestData\\TestData3.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("D:\\AuditARSReportingTesting\\Reports\\AuditeeArsCriticalTest.html",true);
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
		
		MethodCritical.OpenAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	@Test(priority = 2) 
	void SubmitAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Audit Observation Status - Submitted - Submit Count Verification ");
		
		MethodCritical.SubmitAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority = 3) 
	void commentAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Audit Observation Status - Submitted - Comment Count Verification ");
		
		MethodCritical.commentAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 4) 
	void OpenAuditSubmitted1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - Audit Step Verification Verification ");
		
		MethodCritical.OpenAuditSubmitted(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 5) 
	void OpenAuditSubmitted11() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - View Audit Details - Audit Step Verification ");
		
		MethodCritical.OpenAuditSubmitted1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 6) 
	void OpenAuditStepPerform1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - Change status - Audit Step - Next Button Verification ");
		
		MethodCritical.OpenAuditStepPerform(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 7) 
	void OpenAuditStepUserCreated1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - Change status - Audit Step - User Create Verification ");
		
		MethodCritical.OpenAuditStepUserCreated(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	


	

	
	@Test(priority = 8) 
	void UpcomingAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Implementation Status - Upcoming Count Verification ");
		
		MethodCritical.UpcomingAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	
	@Test(priority = 9) 
	void OverdueAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Implementation Status - Overdue Count Verification ");
		
		MethodCritical.OverdueAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 10) 
	void SubmittedAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Implementation Status - Submitted Count Verification ");
		
		MethodCritical.SubmittedAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 11) 
	void CommentsAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Implementation Status - Comments Count Verification ");
		
		MethodCritical.CommentsAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}


	
	@Test(priority = 12) 
	void ImplementedAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Implementation Status - Implemented Count Verification ");
		
		MethodCritical.ImplementedAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 13) 
	void PreRequisiteOpen1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Pre-Requisite Summary - Open Count Verification ");
		
		MethodCritical.PreRequisiteOpen(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 14) 
	void PreRequisiteSubmitted1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Pre-Requisite Summary - Submitted Count Verification ");
		
		MethodCritical.PreRequisiteSubmitted(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	@Test(priority = 15) 
	void PreRequisiteRejected1() throws InterruptedException, IOException
	{
		test = extent.startTest("Person Responsible Summary - Pre-Requisite Summary - Rejected Count Verification ");
		
		MethodCritical.PreRequisiteRejected(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	


	
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
  		Thread.sleep(5000);
  	//	driver.close();
  		closeBrowser();
  	}		

}
