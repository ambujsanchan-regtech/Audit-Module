package auditIFCTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import aRSDepartmentHead.DepartmentHeadCriticalMethod;
import aRSDepartmentHead.DepartmentHeadLocator;
import aRSDepartmentHead.DepartmentHeadMethod;
import login.BasePage;

public class DepartmentHeadCriticalTestCases extends BasePage{
	
	
//	public static Web  = null;		//Web instance created
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

		
		fis = new FileInputStream("E:\\AuditARS\\TestData\\TestData.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(3);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("E:\\AuditARS\\Reports\\DepartmentHeadCriticalTest.html",true);
		test = extent.startTest("Verify OpenBrowser");
		
		test.log(LogStatus.PASS, "Test Passed - Department Head Login");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
	
		initialization("company",3);
		
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
		 = login.Login.UserLogin(uname,password,"company");		//Method of Login class to login user.
		*/
	}
	
	
	@Test(priority = 1) 
	void DashboardExportButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashbaord - Filter - Export Button Verification ");
		
		DepartmentHeadMethod.DashboardExportButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
//	@Test(priority = 1) 
	void ObservationCatogary1() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(5000);
 
		String t = DepartmentHeadLocator.ProcessInefficiency().getText();
		Thread.sleep(2000);

		test = extent.startTest("My Dashbaord - Observations - Category Wise - " +  t  + " Verification ");
		
		DepartmentHeadCriticalMethod.ObservationCatogary(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 2) 
	void ObservationProcessWise1() throws InterruptedException, IOException
	{
	
		test = extent.startTest("My Dashbaord - Observations - Process Wise -  Verification ");
		
		DepartmentHeadCriticalMethod.ObservationProcessWise(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	

//	@Test(priority = 3) 
	void AegingGraphlessthan90days1() throws InterruptedException, IOException
	{

		test = extent.startTest("My Dashbaord - Open Observations- Aging - Process Wise - Mesmerizing2 Verification ");
		
		DepartmentHeadCriticalMethod.AegingGraphlessthan90days(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 4) 
	void AuditTracker1() throws InterruptedException, IOException
	{

		test = extent.startTest("My Dashbaord - Audit Tracker - Aug23 Count Verification ");
		
		DepartmentHeadCriticalMethod.AuditTracker(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 5) 
	void MyDocument1() throws InterruptedException, IOException
	{

		test = extent.startTest("My Document - Download Button Verification ");
		
		DepartmentHeadCriticalMethod.MyDocument(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 6) 
	void MyReportAllReports1() throws InterruptedException, IOException
	{

		test = extent.startTest("My Report - Report Download Verification ");
		
		DepartmentHeadCriticalMethod.MyReportAllReports(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	
//	@Test(priority = 7) 
	void MyReportPastauditReportUpdate1() throws InterruptedException, IOException
	{

		test = extent.startTest("My Report - Past Audit Report - Edit and view button Verification ");
		
		DepartmentHeadCriticalMethod.MyReportPastauditReportUpdate(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
  		Thread.sleep(5000);
  		//.close();
  		closeBrowser();
  	}	



}
