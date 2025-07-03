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

import aRSManagement.ManagementMethod;
import login.BasePage;



public class ManagementNonCritical extends BasePage{

	
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

		
		fis = new FileInputStream("D:\\AuditIFCProject\\TestData\\TestData3.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(3);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("D:\\AuditARSReportingTesting\\Reports\\ManagementNonCriticalTest.html",true);
		test = extent.startTest("Verify OpenBrowser");
		
		test.log(LogStatus.PASS, "Test Passed - Audit Head Login");
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
		driver = login.Login.UserLogin(uname,password,"company");		//Method of Login class to login user.
		*/
	}
	

	
	@Test(priority = 3)
	void HighOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- High - Open");
		
		ManagementMethod.HighRisk(test,"High - Open","open");
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	/*@Test(priority = 4)
	void HighClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- High - Close");
		
		ManagementMethod.HighRisk(test,"High - Close","close");
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 5)
	void MediumOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- Medium - Open");
		
		ManagementMethod.MediumRisk(test,"Medium - Open","open");
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 6)
	void MediumClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- Medium - Close");
		
		ManagementMethod.MediumRisk(test,"Medium - Close","close");
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 7)// not working
	void LowOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- Low - Open");
		
		ManagementMethod.LowRisk1(test,"Low - Open","open");
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 8)
	void LowClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- Low - Close");
		
		ManagementMethod.LowRisk1(test,"Low - Close","close");
		
		extent.endTest(test);
		extent.flush();
	} 
	*/	
		//@Test(priority = 9)//not working
	void CategoryOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Category Wise - Open");
		
		ManagementMethod.CategoryOpen(test);
		
		extent.endTest(test);
		extent.flush();
	}
		
		//@Test(priority = 10)// not working
		void CategoryClose() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Category Wise - Close");
			
			ManagementMethod.CategoryClose(test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		// @Test(priority = 11)
		void ProcessHigh() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Process  Wise - High");
			
			ManagementMethod.ProcessHigh(test);
			
			extent.endTest(test);
			extent.flush();
			}
		 //@Test(priority = 12)
		void ProcessMedium() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Process  Wise - Medium");
			
			ManagementMethod.ProcessMedium(test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		 /*@Test(priority = 13)
		void ProcessLow() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Process  Wise - Low");
			
			ManagementMethod.ProcessLow(test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 14)
		void AgingGreater90() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Aging - Process Wise - >90 days");
			
			ManagementMethod.AgingGreater90(test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 15)
		void AgingNotDue() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Aging - Process Wise - Not Due");
			
			ManagementMethod.AgingNotDue(test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 16)
		void AuditCommitteeOpen() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Audit Committee - Open");
			
			ManagementMethod.AuditCommitteeOpen(test);
			
			extent.endTest(test);
			extent.flush();
		}
		@Test(priority = 17)
		void AuditCommitteeClose() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Audit Committee - Close");
			
			ManagementMethod.AuditCommitteeClose(test);
			
			extent.endTest(test);
			extent.flush();
		}	
		
		
		@Test(priority = 18)
		void observationlist() throws InterruptedException, IOException
		{
			test = extent.startTest("Observationlist");
			
			ManagementMethod.observationlist(test);
			
			extent.endTest(test);
			extent.flush();
		}	
		
		
	
	@Test(priority = 19)
	void MyReport() throws InterruptedException, IOException
	{
		test = extent.startTest("My Report - Final Audit");
		
		ManagementMethod.MyReport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}	

		
	@Test(priority = 20)
	void MyReportObservationReportFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("My Report - OpenObservation - Multiple Filter Verification");
		
		ManagementMethod.MyReportObservationReportFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}	

*/
		
		
		
		@AfterMethod
	  	void browserClosing() throws InterruptedException
	  	{
	  		Thread.sleep(5000);
	  		//driver.close();
	  		closeBrowser();
	  	}	


}
