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

import aRSAuditHead.AuditHeadArsMethod;
import aRSAuditHead.AuditHeadMethodARS;
import aRSAuditHead.AuditHeadMethodARS;
import login.BasePage;







public class AuditHeadCriticalCases extends BasePage{
	
	
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
		sheet = workbook.getSheetAt(4);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("D:\\AuditARSReportingTesting\\Reports\\AuditHeadCriticalTest.html",true);

		test = extent.startTest("Verify OpenBrowser");
		
		test.log(LogStatus.PASS, "Test Passed - Audit Head Login");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
		initialization("company",4);
		
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
	
	
	/*@Test(priority = 1)
	void HighOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Risk Wise - Open - Risk- High ");
		
		AuditHeadMethodARS.HighRisk1(test,"High - Open","open");
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 2)
	void MediumOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Risk- Medium - Open");
		
		AuditHeadMethodARS.MediumRisk(test,"Medium - Open","open");
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 3)
	void LowOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Risk- Low - Open");
		
		AuditHeadMethodARS.LowRisk(test,"Low - Open","open");
		
		extent.endTest(test);
		extent.flush();
	}

	
	//@Test(priority = 4)
	void DashboardOpenCount() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Risk- High - Open");
		
		AuditHeadMethodARS.DashboardOpenCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 5)
	void HighClose() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Risk- High - Close");
		
		AuditHeadMethodARS.HighRisk1(test,"High - Close","close");
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 6)
	void MediumClose() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Risk- Medium - Close");
		
		AuditHeadMethodARS.MediumRisk(test,"Medium - Close","close");
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 7)
	void LowClose() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Risk- Low - Close");
		
		AuditHeadArsMethod.LowRisk(test,"Low - Close","close");
		
		extent.endTest(test);
		extent.flush();
	} 

	@Test(priority = 8)
	void CategoryOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Category Wise - Open");
		
		AuditHeadMethodARS.CategoryOpen1(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 9)
	void CategoryClose() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Category Wise - Close");
		
		AuditHeadMethodARS.CategoryClose(test);
		
		extent.endTest(test);
		extent.flush();
	}
	

		@Test(priority = 10)
	void ProcessHigh() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Process  Wise - High");
		
		AuditHeadMethodARS.ProcessHigh(test);
		
		extent.endTest(test);
		extent.flush();
		}

	
	
	@Test(priority = 11)
	void ProcessMedium() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Process  Wise - Medium");
		
		AuditHeadMethodARS.ProcessMedium(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 12)
	void ProcessLow() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Process  Wise - Low");
		
		AuditHeadMethodARS.ProcessLow(test);
		
		extent.endTest(test);
		extent.flush();
	}


	//@Test(priority = 13)
	void AgingGreater90() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Aging - Process Wise - >90 days");
		
		AuditHeadArsMethod.AgingGreater90(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 14)
	void AgingNotDue1() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Aging - Process Wise - Not Due");
		
		AuditHeadMethodARS.AgingNotDue(test);
		
		extent.endTest(test);
		extent.flush();
	}
	//AgingGreaterthan1Year
	
	@Test(priority = 14)
	void AgingGreaterthan1Year() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Aging - Process Wise - AgingGreaterthan1Year");
		
		AuditHeadMethodARS.AgingGreaterthan1Year(test);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 15)
	void AuditCommitteeOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Audit Committee - Open");
		
		AuditHeadMethodARS.AuditCommitteeOpen(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 16)
	void AuditCommitteeClose() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Audit Committee - Close");
		
		AuditHeadMethodARS.AuditCommitteeClose(test);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 17)
	void AuditTrackerPlanned() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Audit Tracker - Planned");
		
		AuditHeadMethodARS.AuditTrackerPlanned(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 18)
	void AuditTrackerActual() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Audit Tracker - Actual");
		
		AuditHeadMethodARS.AuditTrackerActual(test);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 19)
	void AuditStatus() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Audit Status ");
		
		AuditHeadMethodARS.AuditStatus(test);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 20)
	void AuditHeadSummaryOpenAudits() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Audit Head Summary - Open Audits - Audit ");
		
		AuditHeadMethodARS.AuditHeadSummaryOpenAudits(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 21)
	void AuditHeadSummaryClosedAudits() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Audit Head Summary - Closed Audits - Audit ");
		
		AuditHeadMethodARS.AuditHeadSummaryClosedAudits(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//---------------------Master-----------------------
	
	
	@Test(priority =22)
	void Master1() throws InterruptedException, IOException
	{
		test = extent.startTest("Unit Master Verification ");
		
		AuditHeadMethodARS.Master(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 23) 
	void DepartmentMaster1() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - Department Master Verification ");
		
		AuditHeadMethodARS.DepartmentMaster(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}


	@Test(priority = 24) 
	void VerticalMaster11() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - Vertical Master Verification ");
		
		AuditHeadMethodARS.VerticalMaster1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 25) 
	void BusinessProcess1() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - Business Process Verification ");
		
		AuditHeadMethodARS.BusinessProcess(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 26) 
	void ObservationCatogaries1() throws InterruptedException, IOException
	{
	test = extent.startTest("Master - Observation Category Verification ");
			
	AuditHeadMethodARS.ObservationCatogaries(test,workbook);
			
	extent.endTest(test);
	extent.flush();
	}

		
	@Test(priority =27) 
    void RiskCategory1() throws InterruptedException, IOException
	{
	test = extent.startTest("Master - Risk Category Verification ");
		 			
	AuditHeadMethodARS.RiskCategory(test,workbook);
		 			
	extent.endTest(test);
	extent.flush();
	}
		 		
	@Test(priority = 28) 
	void Users1() throws InterruptedException, IOException
	{
	test = extent.startTest("User Master Verification ");
			
	AuditHeadMethodARS.Users(test,workbook);
			
	extent.endTest(test);
	extent.flush();
	}
		

	@Test(priority = 29) 
	void UnitAssignment11() throws InterruptedException, IOException
	{
	test = extent.startTest("Unit Assignment Master Verification ");
			
	AuditHeadMethodARS.UnitAssignment1(test,workbook);
			
	extent.endTest(test);
	extent.flush();
	}

	
	@Test(priority = 30) 
	void AuditorMaster11() throws InterruptedException, IOException
	{
	test = extent.startTest("Master - Auditor Master Verification ");
			
	AuditHeadMethodARS.AuditorMaster1(test,workbook);
			
	extent.endTest(test);
	extent.flush();
	}

	
	@Test(priority = 31) 
	void AuditorsTeamMaster1() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - Auditors Team Master Verification ");
		
		AuditHeadMethodARS.AuditorsTeamMaster(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	//@Test(priority = 32) 
	void StateMaster1() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - State Master Verification ");
		
		AuditHeadMethodARS.StateMaster(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	//@Test(priority = 33) 
	void CityMaster11() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - City Master Verification ");
		
		AuditHeadMethodARS.CityMaster1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 34) 
	void ProcessRatingMaster1() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - Process Rating Master Verification ");
		
		AuditHeadMethodARS.ProcessRatingMaster(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	//-----------------------------Configuration----------------------
	
		/*@Test(priority=35)
	void configuration() throws InterruptedException {
		test=extent.startTest("Configuration");
		
		AuditHeadMethodARS.configuration(test);
		
	//	test.log(LogStatus.PASS, "configuration");
		extent.flush();
}

//-----------------------Audit Reporting -------------------------

	//@Test(priority = 36) 
	void InternalControlUploadSubProcessFile1() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Import / Export Utility - Upload Sub-Process File Verification ");
		
		AuditHeadMethodARS.InternalControlUploadSubProcessFile(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 37)
	void RiskControlMatrix() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Import / Export Utility -Risk Control Matrix");
		
		AuditHeadMethodARS.RiskControlMatrix(test);
		
		extent.endTest(test);
		extent.flush();
	}

	
//	@Test(priority = 38)
	void SubProcess() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Import / Export Utility -Sub Process");
		
		AuditHeadMethodARS.SubProcess(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	//@Test(priority = 39)
	void UpdateRiskControlMatrix() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Import / Export Utility -Update Risk Control Matrix");
		
		AuditHeadMethodARS.UpdateRiskControlMatrix(test);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 40)
	void AdditionalRiskCreation() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Add New");
		
		AuditHeadMethodARS.AdditionalRiskCreation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}   
	
	@Test(priority = 41)
	void ExportToExcel1() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Export To Excel Verification");
		
		AuditHeadMethodARS.ExportToExcel(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}   

	
	@Test(priority = 42)
	void FilterAdditionalRiskCreation() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Multiple Filter Verification");
		
		AuditHeadMethodARS.FilterAdditionalRiskCreation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}   
	
//	@Test(priority = 43)
	void AddNewRiskDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Add New Risk Details Verification");
		
		AuditHeadMethodARS.AddNewRiskDetails(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	} 
	
//	@Test(priority = 44)
	void EditRiskDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Edit Risk Detail Verification");
		
		AuditHeadMethodARS.EditRiskDetails(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	} 

//	@Test(priority = 45)
	void DeActivate() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- De-activate Verification");
		
		AuditHeadMethodARS.DeActivate(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	} 

	

	
	@Test(priority = 46) 
	void AddUnitAssignment1() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Assignment - Add Assignment Verification ");
		
		AuditHeadMethodARS.AddUnitAssignment(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 47)
	void AuditScheduling() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Scheduling-Add New");
		
		AuditHeadMethodARS.AuditScheduling(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 48)
	void DisplayScheduleInformation() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Scheduling-Display Schedule Information");
		
		AuditHeadMethodARS.DisplayScheduleInformation(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 49)
	void EditScheduleInformation() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Scheduling-Edit Schedule Information");
		
		AuditHeadMethodARS.EditScheduleInformation(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 50)
	void DeleteSchedulingDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Scheduling-Delete Scheduling Details");
		
		AuditHeadMethodARS.DeleteSchedulingDetails(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 51)
	void ReAssignAK() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting -Audit Kickoff -Re-Assign -Audit");
		
		AuditHeadMethodARS.ReAssignAK(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 52)
	void Implementation() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting -Audit Kickoff -Re-Assign -Implementation");
		
		AuditHeadMethodARS.Implementation(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 53)
	void ViewProcessWiseDetails1() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Kickoff -View  ProcessWise Details");
		
		AuditHeadMethodARS.ViewProcessWiseDetails(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	/*  @Test(priority = 54)
	void AddNewRiskDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Add New Risk Details ");
		
		AuditHeadMethodARS.AddNewRiskDetails1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 55)
	void EditRiskDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Edit Risk Details ");
		
		AuditHeadMethodARS.EditRiskDetails1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 56)
	void DeActivate() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- De-Activate ");
		
		AuditHeadMethodARS.DeActivate1(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 57)
	void SpecialAuditScheduling() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Special Audit Scheduling-Add New ");
		
		AuditHeadMethodARS.SpecialAuditScheduling1(test);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 58)
	void SpecialAuditSchedulingUpload() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Special Audit Scheduling-File Upload ");
		
		AuditHeadMethodARS.SpecialAuditSchedulingUpload1(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 58)
	void AuditDocuments() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Documents-Add New ");
		
		AuditHeadMethodARS.AuditDocuments1(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 59)
	void View() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Documents-View and Download ");
		
		AuditHeadMethodARS.View1(test);
		
		extent.endTest(test);
		extent.flush();
	}

	//--------------------Report Generation -----------------------------
	
	@Test(priority = 60)
	void ReportGeneration() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - Filter ,Export to Excel  and View Audit Status ");
		
		AuditHeadMethodARS.ReportGeneration11(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 61)
	void ViewAuditDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - View Audit Details ");
		
		AuditHeadMethodARS.ViewAuditDetails1(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 62)
	void DraftObservationListing() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - View Audit Details - Draft Observation Listing ");
		
		AuditHeadMethodARS.DraftObservationListing1(test);
		
		extent.endTest(test);
		extent.flush();
	}
		
	@Test(priority = 63)
	void ViewHistoricalObservations() throws InterruptedException, IOException
	{
		test = extent.startTest(" Past Observations - View Historical Observations ");
		
		AuditHeadMethodARS.ViewHistoricalObservations1(test);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 64) 
	void ProcessNumbered1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - Add Process Numbered Verification ");
		
		AuditHeadMethodARS.ProcessNumbered(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 65) 
	void ReportGeneration1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - Report Generation Button Verification ");
		
		AuditHeadMethodARS.ReportGeneration(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}	
	
	//------------------past observation------------------------
	
	
	@Test(priority = 66)
	void HistoricalObservation() throws InterruptedException, IOException
	{
		test = extent.startTest("Past Observation - Upload Historical Observation ");
		
		AuditHeadMethodARS.HistoricalObservation(test);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 67) 
	void PastObservationAuditStepButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Past Observation - View Historical Observation - Audit Step Verification ");
		
		AuditHeadMethodARS.PastObservationAuditStepButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}




//-------------------My Document------------------------	
	
	@Test(priority=68)
	void mydocument() throws InterruptedException {
		test=extent.startTest("My Document - File Download Verification");
		
		AuditHeadMethodARS.mydocument(test,workbook);
	
		extent.endTest(test);
		extent.flush();
	}

	
	//------------------------------My Report -----------------------------------
	
	//@Test(priority=69)
	void myreport() throws InterruptedException {
		test=extent.startTest("MY Report");
		
		AuditHeadMethodARS.myreport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
}

	*/		
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
  		Thread.sleep(5000);
  	//	driver.close();
  		
  		closeBrowser();
  	}	



}
