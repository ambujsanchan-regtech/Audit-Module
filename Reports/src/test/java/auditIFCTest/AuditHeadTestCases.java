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
import arsPerformer.CriticalMethod1;
import login.BasePage;

public class AuditHeadTestCases extends BasePage{
	
	
	
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
	//	fis = new FileInputStream("C:\\Users\\Shital Bhoyar\\eclipse-workspace\\AuditIFC\\TestData\\TestData.xlsx");

		
		fis = new FileInputStream("D:\\AuditIFCProject\\TestData\\TestData.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("D:\\AuditARSReportingTesting\\Reports\\AuditHeadTArsTest.html",true);
		test = extent.startTest("Verify OpenBrowser");
		
		test.log(LogStatus.PASS, "Test Passed - Audit Head Login");
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
	
	
	
	
	//@Test(priority = 1)
	void HighOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Risk Wise - Open - Risk- High ");
		
		AuditHeadArsMethod.HighRisk1(test,"High - Open","open");
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	//@Test(priority = 2)
	void MediumOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Risk- Medium - Open");
		
		AuditHeadArsMethod.MediumRisk(test,"Medium - Open","open");
		
		extent.endTest(test);
		extent.flush();
	}

	
//	@Test(priority = 3)
	void LowOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Risk- Low - Open");
		
		AuditHeadArsMethod.LowRisk(test,"Low - Open","open");
		
		extent.endTest(test);
		extent.flush();
	}

	
	//@Test(priority = 4)
	void DashboardOpenCount() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Risk- High - Open");
		
		AuditHeadArsMethod.DashboardOpenCount(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	//@Test(priority = 5)
	void HighClose() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Risk- High - Close");
		
		AuditHeadArsMethod.HighRisk1(test,"High - Close","close");
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 6)
	void MediumClose() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Risk- Medium - Close");
		
		AuditHeadArsMethod.MediumRisk(test,"Medium - Close","close");
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	//@Test(priority = 7)
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
		
		AuditHeadArsMethod.CategoryOpen(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 9)
	void CategoryClose() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Category Wise - Close");
		
		AuditHeadArsMethod.CategoryClose(test);
		
		extent.endTest(test);
		extent.flush();
	}
	

	@Test(priority = 10)
	void ProcessHigh() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Process  Wise - High");
		
		AuditHeadArsMethod.ProcessHigh(test);
		
		extent.endTest(test);
		extent.flush();
		}

	
	
	@Test(priority = 11)
	void ProcessMedium() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Process  Wise - Medium");
		
		AuditHeadArsMethod.ProcessMedium(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 12)
	void ProcessLow() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Process  Wise - Low");
		
		AuditHeadArsMethod.ProcessLow(test);
		
		extent.endTest(test);
		extent.flush();
	}


	@Test(priority = 13)
	void AgingGreater90() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Aging - Process Wise - >90 days");
		
		AuditHeadArsMethod.AgingGreater90(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 14)
	void AgingNotDue() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Aging - Process Wise - Not Due");
		
		AuditHeadArsMethod.AgingNotDue(test);
		
		extent.endTest(test);
		extent.flush();
	}


	@Test(priority = 15)
	void AuditCommitteeOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Audit Committee - Open");
		
		AuditHeadArsMethod.AuditCommitteeOpen(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 16)
	void AuditCommitteeClose() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Audit Committee - Close");
		
		AuditHeadArsMethod.AuditCommitteeClose(test);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 17)
	void AuditTrackerPlanned() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Audit Tracker - Planned");
		
		AuditHeadArsMethod.AuditTrackerPlanned(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 18)
	void AuditTrackerActual() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Audit Tracker - Actual");
		
		AuditHeadArsMethod.AuditTrackerActual(test);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	@Test(priority = 19)
	void AuditStatus() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Observations - Audit Status ");
		
		AuditHeadArsMethod.AuditStatus(test);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 20)
	void AuditHeadSummaryOpenAudits() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Audit Head Summary - Open Audits - Audit ");
		
		AuditHeadArsMethod.AuditHeadSummaryOpenAudits(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 21)
	void AuditHeadSummaryClosedAudits() throws InterruptedException, IOException
	{
		test = extent.startTest("My Dashboard - Audit Head Summary - Closed Audits - Audit ");
		
		AuditHeadArsMethod.AuditHeadSummaryClosedAudits(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//---------------------Master-----------------------
	
	
	@Test(priority =22)
	void Master1() throws InterruptedException, IOException
	{
		test = extent.startTest("Unit Master Verification ");
		
		AuditHeadArsMethod.Master(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 23) 
	void DepartmentMaster1() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - Department Master Verification ");
		
		AuditHeadArsMethod.DepartmentMaster(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}


	@Test(priority = 24) 
	void VerticalMaster11() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - Vertical Master Verification ");
		
		AuditHeadArsMethod.VerticalMaster1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 25) 
	void VerticalMaster1() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - Vertical Master - Without Enter Data Add Vertical Verification ");
		
		AuditHeadArsMethod.VerticalMaster(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 26) 
	void BusinessProcess1() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - Business Process Verification ");
		
		AuditHeadArsMethod.BusinessProcess(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 27) 
	void BusinessProcessWithoutEnterDataAddActivity1() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - Business Process Master - Without Enter Data Add Activity Verification ");
		
		AuditHeadArsMethod.BusinessProcessWithoutEnterDataAddActivity(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 28) 
	void ObservationCatogaries1() throws InterruptedException, IOException
	{
	test = extent.startTest("Master - Observation Category Verification ");
			
	AuditHeadArsMethod.ObservationCatogaries(test,workbook);
			
	extent.endTest(test);
	extent.flush();
	}

		
	@Test(priority =29) 
    void RiskCategory1() throws InterruptedException, IOException
	{
	test = extent.startTest("Master - Risk Category Verification ");
		 			
	AuditHeadArsMethod.RiskCategory(test,workbook);
		 			
	extent.endTest(test);
	extent.flush();
	}
	
		 		
	@Test(priority = 30) 
	void Users1() throws InterruptedException, IOException
	{
	test = extent.startTest("User Master Verification ");
			
	AuditHeadArsMethod.Users(test,workbook);
			
	extent.endTest(test);
	extent.flush();
	}
		

	@Test(priority = 31) 
	void UnitAssignment11() throws InterruptedException, IOException
	{
	test = extent.startTest("Unit Assignment Master Verification ");
			
	AuditHeadArsMethod.UnitAssignment1(test,workbook);
			
	extent.endTest(test);
	extent.flush();
	}


	@Test(priority = 32) 
	void UnitAssignment1() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - Unit Assignment Master - Without Enter Data Add Assignment Verification ");
		
		AuditHeadArsMethod.UnitAssignment(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 33) 
	void UnitAssignmentEdit1() throws InterruptedException, IOException
	{
		test = extent.startTest("Unit Assignment Master - Edit- validation For All mandatory field Verification ");
		
		AuditHeadArsMethod.UnitAssignmentEdit(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 34) 
	void UnitAssignmentManagementValidation1() throws InterruptedException, IOException
	{
		test = extent.startTest("Unit Assignment Master - Edit- Management Tab -Validation For All mandatory field Verification ");
		
		AuditHeadArsMethod.UnitAssignmentManagementValidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 35) 
	void UnitAssignmentDepartmentValidation1() throws InterruptedException, IOException
	{
		test = extent.startTest("Unit Assignment Master - Edit- Department Tab - Validation For All mandatory field Verification ");
		
		AuditHeadArsMethod.UnitAssignmentDepartmentValidation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	

	

	@Test(priority = 36) //pass
	void AuditorMaster1() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - Auditor Master - Without Enter Data Add Auditor Verification ");
		
		AuditHeadArsMethod.AuditorMaster(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}


	
	@Test(priority = 37) //not working
	void AuditorMaster11() throws InterruptedException, IOException
	{
	test = extent.startTest("Master - Auditor Master Verification ");
			
	AuditHeadArsMethod.AuditorMaster1(test,workbook);
			
	extent.endTest(test);
	extent.flush();
	}

	
	@Test(priority = 38) //not working
	void AuditorsTeamMaster1() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - Auditors Team Master Verification ");
		
		AuditHeadArsMethod.AuditorsTeamMaster(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	//@Test(priority = 39) 
	void StateMaster1() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - State Master Verification ");
		
		AuditHeadArsMethod.StateMaster(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 40) //not working
	void CityMaster11() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - City Master Verification ");
		
		AuditHeadArsMethod.CityMaster1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 41) //working
	void CityMaster1() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - City Master - Without Enter Data Add City Verification ");
		
		AuditHeadArsMethod.CityMaster(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 42) //not working
	void ProcessRatingMaster1() throws InterruptedException, IOException
	{
		test = extent.startTest("Master - Process Rating Master Verification ");
		
		AuditHeadArsMethod.ProcessRatingMaster(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	//-----------------------------Configuration----------------------
	
	@Test(priority=43) // working
	void configuration() throws InterruptedException {
		test=extent.startTest("Configuration");
		
		AuditHeadArsMethod.configuration(test);
		
	//	test.log(LogStatus.PASS, "configuration");
		extent.flush();
}

//-----------------------Audit Reporting -------------------------

	@Test(priority = 44) //not working
	void InternalControlUploadSubProcessFile1() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Import / Export Utility - Upload Sub-Process File Verification ");
		
		AuditHeadArsMethod.InternalControlUploadSubProcessFile(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 45) //not working
	void RiskControlMatrix() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Import / Export Utility -Risk Control Matrix");
		
		AuditHeadArsMethod.RiskControlMatrix(test);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 46) //not working
	void SubProcess() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Import / Export Utility -Sub Process");
		
		AuditHeadArsMethod.SubProcess(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 47) //not working
	void UpdateRiskControlMatrix() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Import / Export Utility -Update Risk Control Matrix");
		
		AuditHeadArsMethod.UpdateRiskControlMatrix(test);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 48) //not working
	void AdditionalRiskCreation() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Add New");
		
		AuditHeadArsMethod.AdditionalRiskCreation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}   
	
	@Test(priority = 49) //working
	void ExportToExcel1() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Export To Excel Verification");
		
		AuditHeadArsMethod.ExportToExcel(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}   

	
	@Test(priority = 50)//not working
	void FilterAdditionalRiskCreation() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Multiple Filter Verification");
		
		AuditHeadArsMethod.FilterAdditionalRiskCreation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}   
	
	@Test(priority = 51)//not working
	void AddNewRiskDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Add New Risk Details Verification");
		
		AuditHeadArsMethod.AddNewRiskDetails(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	} 
	
	@Test(priority = 52) //not working
	void EditRiskDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Edit Risk Detail Verification");
		
		AuditHeadArsMethod.EditRiskDetails(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	} 

//	@Test(priority = 53)
	void DeActivate() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- De-activate Verification");
		
		AuditHeadArsMethod.DeActivate(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	} 

	

	
	@Test(priority = 54) //not working
	void AddUnitAssignment1() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Assignment - Add Assignment Verification ");
		
		AuditHeadArsMethod.AddUnitAssignment(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	 
	@Test(priority = 55) //not working
	void AuditScheduling() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Scheduling-Add New");
		
		AuditHeadArsMethod.AuditScheduling(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 56) // working
	void DisplayScheduleInformation() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Scheduling-Display Schedule Information");
		
		AuditHeadArsMethod.DisplayScheduleInformation(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 57)//working
	void EditScheduleInformation() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Scheduling-Edit Schedule Information");
		
		AuditHeadArsMethod.EditScheduleInformation(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 58)// working
	void DeleteSchedulingDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Scheduling-Delete Scheduling Details");
		
		AuditHeadArsMethod.DeleteSchedulingDetails(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 59) //not working
	void ReAssignAK() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting -Audit Kickoff -Re-Assign -Audit");
		
		AuditHeadArsMethod.ReAssignAK(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 60) //not working
	void Implementation() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting -Audit Kickoff -Re-Assign -Implementation");
		
		AuditHeadArsMethod.Implementation(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 61) // working
	void ViewProcessWiseDetails1() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Kickoff -View  ProcessWise Details");
		
		AuditHeadArsMethod.ViewProcessWiseDetails(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	  @Test(priority = 62) //not working
	void AddNewRiskDetails1() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Add New Risk Details ");
		
		AuditHeadArsMethod.AddNewRiskDetails1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 63) //not working
	void EditRiskDetails1() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Edit Risk Details ");
		
		AuditHeadArsMethod.EditRiskDetails1(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 64)//not working
	void DeActivate1() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- De-Activate ");
		
		AuditHeadArsMethod.DeActivate1(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 65) //not working
	void SpecialAuditScheduling() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Special Audit Scheduling-Add New ");
		
		AuditHeadArsMethod.SpecialAuditScheduling1(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 66) //working
	void SpecialAuditSchedulingUpload() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Special Audit Scheduling-File Upload ");
		
		AuditHeadArsMethod.SpecialAuditSchedulingUpload1(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 67) //not working
	void AuditDocuments() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Documents-Add New ");
		
		AuditHeadArsMethod.AuditDocuments1(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 68) //not working
	void View() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Documents-View and Download ");
		
		AuditHeadArsMethod.View1(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 69) //not working
	void InternalControlUploadSubProcessFile11() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Upload Sub-Process File Verification ");
		
		AuditHeadArsMethod.InternalControlUploadSubProcessFile(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 70) //not working
	void AddUnitAssignment11() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Assignment - Add Assignment Verification ");
		
		AuditHeadArsMethod.AddUnitAssignment(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 71) //not working
	void UnitAssignmentFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Assignment -  Multiple Filter Verification ");
		
		AuditHeadArsMethod.UnitAssignmentFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	


	//--------------------Report Generation -----------------------------
	
	@Test(priority = 72) //not working
	void ReportGeneration() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - Filter ,Export to Excel  and View Audit Status ");
		
		AuditHeadArsMethod.ReportGeneration11(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 73) //not working
	void ViewAuditDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - View Audit Details ");
		
		AuditHeadArsMethod.ViewAuditDetails1(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 74)//not working
	void DraftObservationListing() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - View Audit Details - Draft Observation Listing ");
		
		AuditHeadArsMethod.DraftObservationListing1(test);
		
		extent.endTest(test);
		extent.flush();
	}
		
	@Test(priority = 75)// working
	void ViewHistoricalObservations() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - Past Observations - View Historical Observations ");
		
		AuditHeadArsMethod.ViewHistoricalObservations1(test);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 76) //not working
	void ProcessNumbered11() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - Add Process Numbered Verification ");
		
		AuditHeadArsMethod.ProcessNumbered(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 77) //not working
	void ReportGeneration11() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - Report Generation Button Verification ");
		
		AuditHeadArsMethod.ReportGeneration(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}	
	
	
		@Test(priority =78) // working
	void AddObservation1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - Add Observation Verification ");
		
		AuditHeadArsMethod.AddObservation(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	

	
	@Test(priority = 79) //not working
	void ProcessNumbered1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - Add Process Numbered Verification ");
		
		AuditHeadArsMethod.ProcessNumbered(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 80) //not working
	void ReportGeneration1() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - Report Generation Button Verification ");
		
		AuditHeadArsMethod.ReportGeneration(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	
	//------------------past observation------------------------
	
	
	@Test(priority = 81)//working
	void HistoricalObservation() throws InterruptedException, IOException
	{
		test = extent.startTest("Past Observation - Upload Historical Observation ");
		
		AuditHeadArsMethod.HistoricalObservation(test);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 82) //working
	void PastObservationAuditStepButton11() throws InterruptedException, IOException
	{
		test = extent.startTest("Past Observation - View Historical Observation - Audit Step Verification ");
		
		AuditHeadArsMethod.PastObservationAuditStepButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 83) // not working
	void PastObservationFilter1() throws InterruptedException, IOException
	{
		test = extent.startTest("Past Observation - Multiple Filter Verification ");
		
		AuditHeadArsMethod.PastObservationFilter(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 84) //working
	void PastObservationAuditStepButton1() throws InterruptedException, IOException
	{
		test = extent.startTest("Past Observation - Audit Step Verification ");
		
		AuditHeadArsMethod.PastObservationAuditStepButton(test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	



//-------------------My Document------------------------	
	
	@Test(priority=85)
	void mydocument() throws InterruptedException {
		test=extent.startTest("My Document - File Download Verification");
		
		AuditHeadArsMethod.mydocument(test,workbook);
	
		extent.endTest(test);
		extent.flush();
	}

	
	//------------------------------My Report -----------------------------------
	
	@Test(priority=86)
	void myreport() throws InterruptedException {
		test=extent.startTest("MY Report");
		
		AuditHeadArsMethod.myreport(test,workbook);
		
		extent.endTest(test);
		extent.flush();
}


	
	
	
//---------------------------------------------------------------------------------------------------------------
	
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
  		Thread.sleep(5000);
  	//	driver.close();
  		
  		closeBrowser();
  	}	

	
	
	
	
	
	
	
	
	
	
	
	

}
