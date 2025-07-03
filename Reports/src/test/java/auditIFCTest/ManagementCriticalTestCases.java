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

public class ManagementCriticalTestCases extends BasePage{

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
		fis = new FileInputStream("D:\\AuditARSReportingTesting\\TestData\\TestData3.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(5);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("D:\\AuditARSReportingTesting\\Reports\\ManagementCriticalTest.html",true);
		test = extent.startTest("Verify OpenBrowser");
		
		test.log(LogStatus.PASS, "Test Passed - Audit Head Login");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
	
		initialization("company",5);
		
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
	
	
	@Test(priority = 4)
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
	@Test(priority = 7)
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
	@Test(priority = 9)
	void CategoryOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Category Wise - Open");
		
		ManagementMethod.CategoryOpen(test);
		
		extent.endTest(test);
		extent.flush();
	}
		
		@Test(priority = 10)
		void CategoryClose() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Category Wise - Close");
			
			ManagementMethod.CategoryClose(test);
			
			extent.endTest(test);
			extent.flush();
		}
		
       @Test(priority = 11)
		void ProcessHigh() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Process  Wise - High");
			
			ManagementMethod.ProcessHigh(test);
			
			extent.endTest(test);
			extent.flush();
			}
		@Test(priority = 12)
		void ProcessMedium() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Process  Wise - Medium");
			
			ManagementMethod.ProcessMedium(test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 13)
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
			test = extent.startTest("Observations - Aging - Process Wise - 0-90 days");
			
			ManagementMethod.AgingGreater90(null, test);
			
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
		void Aging90to180days() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Aging - Process Wise - 90-180 days");
			ManagementMethod.Aging90to180days(getDriver(), test);
			
			extent.endTest(test);
			extent.flush();
		}
		/*@Test(priority = 17)
		void Aging180to365days() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Aging - Process Wise - 180-365 days");
			
			ManagementMethod.Aging180to365days(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 18)
		void Greaterthan1year() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Aging - Process Wise - Greaterthan1year");
			
			ManagementMethod.Greaterthan1year(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 19)
		void Aging0to90days() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Aging - Process Wise - Aging0to90days");
			
			ManagementMethod.Aging0to90days(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
*/
		@Test(priority = 20)
		void AuditCommitteeOpen() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Audit Committee - Open");
			
			ManagementMethod.AuditCommitteeOpen(test);
			
			extent.endTest(test);
			extent.flush();
		}
		@Test(priority = 21)
		void AuditCommitteeClose() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Audit Committee - Close");
			
			ManagementMethod.AuditCommitteeClose(test);
			
			extent.endTest(test);
			extent.flush();
		}	
		
		
		@Test(priority = 22)
		void observationlist() throws InterruptedException, IOException
		{
			test = extent.startTest("Observationlist");
			
			ManagementMethod.observationlist(test);
			
			extent.endTest(test);
			extent.flush();
		}	
		
		
	
	@Test(priority = 23)
	void MyReport() throws InterruptedException, IOException
	{
		test = extent.startTest("My Report - Final Audit");
		
		ManagementMethod.MyReport(test,workbook);
		
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
