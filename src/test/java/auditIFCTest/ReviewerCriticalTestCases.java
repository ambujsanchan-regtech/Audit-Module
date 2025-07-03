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

import aRSReviewer.ReviewerMethod;
import arsPerformer.CriticalMethod1;
import login.BasePage;

public class ReviewerCriticalTestCases extends BasePage{

	
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
		sheet = workbook.getSheetAt(1);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("D:\\AuditARSReportingTesting\\Reports\\ReviewerCriticalTest.html",true);
		test = extent.startTest("Verify OpenBrowser");
		
		test.log(LogStatus.PASS, "Test Passed - Reviewer Login");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
	
		initialization("company",1);
		
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
	

  @Test(priority = 1) //working
	void OpenAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Performer/Reviewer Summary - Open Audits - Audit Count Verification ");
		
		ReviewerMethod.OpenAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 2) //working
	void OpenImplementation1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Performer/Reviewer Summary - Open Audits - Implementation Count Verification ");
		
		ReviewerMethod.OpenImplementation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 3) //working
	void ClosedAudit1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Performer/Reviewer Summary - Closed Audits - Audit Count Verification ");
		
		ReviewerMethod.ClosedAudit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}


	
	
	@Test(priority = 4) //working
	void ClosedImplementation1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Performer/Reviewer Summary - Closed Audits - Implementation Count Verification ");
		
		ReviewerMethod.ClosedImplementation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 6) //working
	void AddCheckBoxAndSendMail1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - View data request Details - View Data Request table Email send Verification ");
		
		ReviewerMethod.AddCheckBoxAndSendMail(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
 @Test(priority = 7) //working
	void AddPrerequisiteFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - View data request Details - Add Data request Verification ");
		
		ReviewerMethod.AddPrerequisiteFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

   @Test(priority = 8) // Not working 
	void ForceMail1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - View Data Request Details - Add Force Mail Verification ");
		
		ReviewerMethod.ForceMail(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
		@Test(priority = 9) // working
	void ViewDataRequestFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - View Data Request Details - Save Button Verification ");
		
		ReviewerMethod.ViewDataRequestFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
		@Test(priority = 10) //not wprking
	void AddDocument1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - Add Data Request Detail - Add Document Verification ");
		
		ReviewerMethod.AddDocument(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}


			 @Test(priority = 11) //working
	void AddObservation1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - View Audit Details - Not Done - Change status - Add Observation Verification ");
		
		ReviewerMethod.AddObservation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
		@Test(priority = 13) // working
	void DraftObservationListing1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - View Audit Details - Draft Observation Listing Verification ");
		
		CriticalMethod1.DraftObservationListing(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	


	
	
			@Test(priority = 14) //not  working
	void InternalAuditMeeting1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Workspace - Internal Audit Meeting - Add Mail Verification ");
		
		ReviewerMethod.InternalAuditMeeting(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	

	@Test(priority = 17) // working
	void MyDocument1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Document - Download Button Verification ");
		
		ReviewerMethod.MyDocument(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	 	@Test(priority = 18) // working
	void MyReportObservationReportFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Report - More Report - Observation Report Verification ");
		//2789 line pr change locator pr
		CriticalMethod1.MyReportObservationReportFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 19) //working
	void MyReportPastauditReportUpdate1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Report - More Report - Update - Past Audit Log Report Filter Report Verification ");
		
		CriticalMethod1.MyReportPastauditReportUpdate(test,workbook);
		
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
