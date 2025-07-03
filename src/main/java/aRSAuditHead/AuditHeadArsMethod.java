package aRSAuditHead;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import arsPerformer.Locator1;

import login.BasePage;

public class AuditHeadArsMethod extends BasePage{
	
	

	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable

	
	
	
	
	public static void VerticalMaster( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.VerticalMaster().click();
		Thread.sleep(3000);
		
		
		
		AuditHeadArsLocator.AddNewVM().click();
		Thread.sleep(6000);
		
		AuditHeadArsLocator.SaveVM().click();
		Thread.sleep(3000);
		
		String t = AuditHeadArsLocator.SuccessfullyVM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Without Enter Data Add Vertical - " + t );
		Thread.sleep(3000);
		
		if(AuditHeadArsLocator.CloseVM().isEnabled())
		{
			
			Thread.sleep(2000);
			AuditHeadArsLocator.CloseVM().click();
			test.log(LogStatus.PASS, " Close Button Is Working Properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Close Button Is Working Properly"  );
			
		}
		Thread.sleep(4000);
		
	
	}
	
	
	
	public static void BusinessProcessWithoutEnterDataAddActivity( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.BusinessProcess().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.SubProcessBP().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.BusinessProcessSubActivity().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.BusinessActivity().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.BusinessActivitySave().click();
		Thread.sleep(5000);
	
		String t3 = AuditHeadArsLocator.BusinessActivitySuccessfully().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,   t3 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.BusinessActivityClose().click();
		Thread.sleep(5000);
	
		
	}
	
	
	
	
	public static void UnitAssignment( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.UnitAssignment().click();
		Thread.sleep(9000);
		
		AuditHeadArsLocator.AddNewUA().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.SaveUA().click();
		Thread.sleep(5000);
		
		String t1 = AuditHeadArsLocator.SuccessfullyUA().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Audit Head Tab - Without Select Any Filter Add Unit Assinment - " + t1 );
		Thread.sleep(9000);
		
			
		//////////////////////////////
		AuditHeadArsLocator.ManagementTab().click();
		Thread.sleep(5000);
				
		AuditHeadArsLocator.SaveUA1().click();
		Thread.sleep(5000);
		
		String t2 = AuditHeadArsLocator.SuccessfullyUA1().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Management Tab - Without Select Any Filter Add Unit Assinment - " + t1 );
		Thread.sleep(9000);

		//////////
		AuditHeadArsLocator.DepartmentTab().click();
		Thread.sleep(5000);
				
		AuditHeadArsLocator.SaveUA2().click();
		Thread.sleep(5000);
		
		String t3 = AuditHeadArsLocator.SuccessfullyUA2().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Departmnt Tab - Without Select Any Filter Add Unit Assinment - " + t1 );
		Thread.sleep(9000);
/////////////////////

		
		if(AuditHeadArsLocator.CloseUA2().isEnabled())
		{
			
			Thread.sleep(2000);
			AuditHeadArsLocator.CloseUA2().click();
			test.log(LogStatus.PASS, " Close Button is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Close Button is not Working Properly "  );
			
		}
		Thread.sleep(5000);
	
	}
	
	
	
	public static void UnitAssignmentWithoutEnterAnyFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.UnitAssignment().click();
		Thread.sleep(9000);
		
		AuditHeadArsLocator.AddNewUA().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.SaveUA().click();
		Thread.sleep(5000);
		
		String t1 = AuditHeadArsLocator.SuccessfullyUA().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,   t1 );
		Thread.sleep(9000);
		
		AuditHeadArsLocator.CloseUA().click();
		Thread.sleep(5000);
		
		
		
		
		
	}
	

	
	
	
	public static void AuditorMaster( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AuditorMaster().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AddNewAM().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.SaveAM().click();
		Thread.sleep(5000);
	
		String t2 = AuditHeadArsLocator.SuccessfullyAM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Without Enter Data Add Auditor Master - " + t2 );
		Thread.sleep(3000);
		
	if(AuditHeadArsLocator.CloseAM().isEnabled())
		{
			
			Thread.sleep(2000);
			AuditHeadArsLocator.CloseAM().click();
			test.log(LogStatus.PASS, " Close Button Is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Close Button Is Working Properly "  );
			
		}
		
		Thread.sleep(2000);
	}
	
	
	
	
	public static void CityMaster( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CityMaster().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AddNewCM().click();
		Thread.sleep(13000);
		
		AuditHeadArsLocator.SaveAM().click();
		Thread.sleep(9000);
	
		String t1 = AuditHeadArsLocator.SuccessfullyAM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Without Enter Data - " + t1 );
		Thread.sleep(3000);
		
	
	
	}
	
	
	public static void AddObservation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		AuditHeadArsLocator.ReportGeneration().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.ViewAuditDeatils().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);
       
        AuditHeadArsLocator.DraftObservationListing().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	    
	    AuditHeadArsLocator.ViewAuditDetails().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	    
	    getDriver().switchTo().frame(AuditHeadArsLocator.Frame1());
		Thread.sleep(7000);
 
	    sheet = workbook.getSheetAt(2); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
 		int row = 0;
 		Thread.sleep(500);
 		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
 		Cell c1 = null;
 		
		
		 if(AuditHeadArsLocator.NextButton1().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			AuditHeadArsLocator.NextButton1().click();
	 			test.log(LogStatus.PASS, "Next Button Is Clickable " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "Next Button Is Clickable"  );
	 			
	 		}
	        Thread.sleep(2000);
			
		
	//	Locator1.NextButton1().click();					                //Clicking on Dashboard count
     //   Thread.sleep(2000);
            
	    AuditHeadArsLocator.ProcessWalkthrogh().clear();
	    Thread.sleep(2000);
        
        row0 = sheet.getRow(4);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ProcessWalkthrogh().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		AuditHeadArsLocator.ActualWorkdone().clear(); 
		Thread.sleep(2000);
		
        row0 = sheet.getRow(5);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ActualWorkdone().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		AuditHeadArsLocator.Population().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(6);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Population().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		AuditHeadArsLocator.Sample().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(7);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Sample().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		AuditHeadArsLocator.Remarks().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(8);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Remarks().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		
    //    Locator1.NextButton2().click();					                //Clicking on Dashboard count
    //    Thread.sleep(2000);
        
        if(AuditHeadArsLocator.NextButton2().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			AuditHeadArsLocator.NextButton2().click();
 			test.log(LogStatus.PASS, "Next Button Is Clickable " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, "Next Button Is Clickable"  );
 			
 		}
        Thread.sleep(2000);
        
        AuditHeadArsLocator.ObservationTitle().clear();
        Thread.sleep(2000);
        
        row0 = sheet.getRow(11);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ObservationTitle().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		AuditHeadArsLocator.Observation().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(12);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Observation().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		AuditHeadArsLocator.briefObservation().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(13);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.briefObservation().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		AuditHeadArsLocator.ObservationBackground().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(14);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ObservationBackground().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		/*
		row0 = sheet.getRow(15);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.WorkingFile1().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		AuditHeadArsLocator.WorkingFile1Uploadbutton().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Alert aca=getDriver().switchTo().alert();
		
		String ta=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, " Working File Upload - " + ta );
		
		Thread.sleep(5000);
		aca.accept();
		Thread.sleep(3000);
			
	       File dir6 = new File("C:\\Users\\ambujs\\Downloads");
			File[] dirContents6 = dir6.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(6000);
			AuditHeadArsLocator.ObservationWorkingFileDownload().click();
			
		 	Thread.sleep(9000);
			File dir7 = new File("C:\\Users\\ambujs\\Downloads");
			File[] allFilesNew7 = dir7.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
		  
	        Thread.sleep(3000);
		   if (dirContents6.length < allFilesNew7.length) {
				test.log(LogStatus.PASS,  "Working File Files Download Successfully");
			}
		   else
		   {
				test.log(LogStatus.FAIL, "Working File Files does not Download Successfully");
			}

		   Thread.sleep(3000);
		   
		   AuditHeadArsLocator.ObservationWorkingFileDelete().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	 
	        Alert acc=getDriver().switchTo().alert();
			
	 //		String t1=getDriver().switchTo().alert().getText();
	 		
	 //		test.log(LogStatus.PASS,  t1 );
	 		
	 		Thread.sleep(5000);
	 		acc.accept();
	 		Thread.sleep(3000);
	 	
	        Alert acd=getDriver().switchTo().alert();
			
	 		String td=getDriver().switchTo().alert().getText();
	 		
	 		test.log(LogStatus.PASS, " Working File - "+ td );
	 		
	 		Thread.sleep(5000);
	 		acd.accept();
	 		Thread.sleep(3000);
	 */
	 		/*
			row0 = sheet.getRow(41);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.WorkingFile1().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Locator1.WorkingFile1Uploadbutton().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        Alert ace=getDriver().switchTo().alert();
			
	//		String te=getDriver().switchTo().alert().getText();
			
		//	test.log(LogStatus.PASS, " Working File Upload - " + ta );
			
			Thread.sleep(5000);
			ace.accept();
			*/
			Thread.sleep(3000);
     
		row0 = sheet.getRow(16);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.AnnexureTitle().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		AuditHeadArsLocator.Table().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
		
        AuditHeadArsLocator.TableWizard().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
		
        AuditHeadArsLocator.OKTable().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
		
		row0 = sheet.getRow(17);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ImageUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		AuditHeadArsLocator.ImageUploadButton().click();					                //Clicking on Dashboard count
        Thread.sleep(17000);	
	 		
	    Thread.sleep(9000);
        
		row0 = sheet.getRow(18);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.AudioVideoLink().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		AuditHeadArsLocator.AuditComitee().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.AuditComiteeDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        row0 = sheet.getRow(19);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.BusinessRisk().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(20);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.RootCause().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.FinancialImpact().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		AuditHeadArsLocator.RiskRating().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.RiskRatingDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        	
        AuditHeadArsLocator.ObservationCatogary().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.ObservationCatogaryDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.ObservationSubCatogary().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.ObservationSubCatogaryDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.ReccomendationType().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.ReccomendationTypeDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        
        AuditHeadArsLocator.Reccomendation().clear();
        Thread.sleep(2000);
        
        row0 = sheet.getRow(22);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Reccomendation().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
        
		AuditHeadArsLocator.ResponceDueDate1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.ResponceDueDateDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.ManagementResponce().clear();
        Thread.sleep(2000);
        
        row0 = sheet.getRow(23);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ManagementResponce().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
           
		AuditHeadArsLocator.TimelineCalender1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        	
        AuditHeadArsLocator.TimelineCalenderDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.PersonResponsible1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.PersonResponsibleDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.OwnerName1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.OwnerNameDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.SaveReccomendation().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        String t = AuditHeadArsLocator.Successfullyreccomendation().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS,  t);
 		Thread.sleep(2000);
         
 		AuditHeadArsLocator.OK1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.SaveObservation().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
              
        String t5 = AuditHeadArsLocator.SuccessfullyObservation().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS,  t5);
 		Thread.sleep(2000);
         
 		AuditHeadArsLocator.OK2().click();					                //Clicking on Dashboard count
        Thread.sleep(4000);
              
        row0 = sheet.getRow(27);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ReviewRemark().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(28);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.File().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
			
		AuditHeadArsLocator.UploadButton().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.SubmitButton().click();					                //Clicking on Dashboard count
        Thread.sleep(7000);
        
        String t0 = AuditHeadArsLocator.Successfully3().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS,  t0);
 		Thread.sleep(4000);
          
 		AuditHeadArsLocator.OK().click();					                //Clicking on Dashboard count            
        Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		AuditHeadArsLocator.ClosePage().click();
		
		Thread.sleep(3000);
        
		  if(AuditHeadArsLocator.BackButton().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			AuditHeadArsLocator.BackButton().click();
	 			test.log(LogStatus.PASS, "Back Button Working Properly " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "Back Button Does Not Working Properly"  );
	 			
	 		}
	        Thread.sleep(4000);
	        
	        
    
	    
	}
	

	public static void InternalControlUploadSubProcessFile( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AuditReporting().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.ImportExportUtility().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.RadioSubProcess().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.UploadButton1().click();
		Thread.sleep(3000);
		/*
		Thread.sleep(7000);
		Alert ac1=getDriver().switchTo().alert();
			
		String t2=getDriver().switchTo().alert().getText();
			
		test.log(LogStatus.PASS, "Without Select File - " +  t2 );
			
		Thread.sleep(5000);
		ac1.accept();
			
		Thread.sleep(6000);
	*/
		sheet = workbook.getSheetAt(2); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(51);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(20000);
		
		AuditHeadArsLocator.UploadButton1().click();
		Thread.sleep(15000);
		
		String t = AuditHeadArsLocator.SuccessfullyIC().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,   t );
		Thread.sleep(4000);
		
		
	
	}
	
	
	
	
	public static void AddUnitAssignment( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AuditReporting().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AuditAssignment().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AddNew().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Company1().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Company1DD().click();
		Thread.sleep(6000);
		
		AuditHeadArsLocator.Save().click();
		Thread.sleep(15000);
		
		String t = AuditHeadArsLocator.Successfully().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,   t );
		Thread.sleep(4000);
		
		  if(AuditHeadArsLocator.Close().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			AuditHeadArsLocator.Close().click();
	 			test.log(LogStatus.PASS, "Close Button Working Properly " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "Close Button Does Not Working Properly"  );
	 			
	 		}
	        Thread.sleep(4000);
	  
	
	}
	
	
	
	public static void UnitAssignmentFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AuditReporting().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AuditAssignment().click();
		Thread.sleep(3000);

	
		AuditHeadArsLocator.Comapny2().click();
	    Thread.sleep(3000);
        String UnitText =AuditHeadArsLocator.Comapny2DD().getText();
        Thread.sleep(2000);
        AuditHeadArsLocator.Comapny2DD().click();
	    Thread.sleep(3000);
	    
	  List<String> li=new ArrayList<String>();
     
     li.add(UnitText);
   
     
     
     Thread.sleep(3000);
     
		List<String> filter=new ArrayList<String>();	
		filter.add("Unit");
		
		
		/*
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);
*/
		
		
			
		AuditHeadArsLocator.Grid().click();					//Clicking on Text of total items just to scroll down.
		String s = AuditHeadArsLocator.Grid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("0")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grdRiskActivityMatrix']/tbody/tr[2]/td[3]"));
		List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor']/tbody/tr[2]/td[2]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();
			
			

				if(i==0)
				{
					raw.addAll(unitcol);
				}
			
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);

		
		
	
	}

	
	public static void ProcessNumbered( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		AuditHeadArsLocator.ReportGeneration().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.ViewAuditDeatils().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);

		sheet = workbook.getSheetAt(2); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ProcessOrder().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);

		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ObservationNumber().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);

		AuditHeadArsLocator.SelectProcess().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.SelectProcessDD().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);
        
		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ObservationNumbered().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ProcessOrder1().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);

		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ObservationNumber1().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);

		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ObservationNumbered1().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);

				
		  if(AuditHeadArsLocator.FeedbackForm().isEnabled())
	 		{
			    Thread.sleep(5000);
				row0 = sheet.getRow(51);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				AuditHeadArsLocator.FeedbackForm().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(5000);

	 			test.log(LogStatus.PASS, "File Upload Successfully " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "File Does Not Upload Successfully"  );
	 			
	 		}
	        Thread.sleep(4000);
	
	
		row0 = sheet.getRow(23);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Remark().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);

		AuditHeadArsLocator.Save1().click();					                //Clicking on Dashboard count		
		Thread.sleep(6000);
		
		String t = AuditHeadArsLocator.Successfullyp().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,   t );
		Thread.sleep(4000);
		
		File dir2 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		AuditHeadArsLocator.Draft().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
	  
        Thread.sleep(3000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "Draft Report Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Draft Report does not Download Successfully");
		}

	   Thread.sleep(3000);
	
	}
	
	
	
	public static void PastObservationFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.PastObservation().click();
		Thread.sleep(4000);
		
		AuditHeadArsLocator.ViewHistorical().click();
		Thread.sleep(4000);
		
		AuditHeadArsLocator.Process().click();
	    Thread.sleep(3000);
        String procesText =AuditHeadArsLocator.ProcessDD().getText();
        Thread.sleep(2000);
        AuditHeadArsLocator.ProcessDD().click();
	    Thread.sleep(3000);
	    AuditHeadArsLocator.ProcessOK().click();
	    Thread.sleep(20000);
	    
		AuditHeadArsLocator.SubProcess().click();
	    Thread.sleep(3000);
        String SubProcessText =AuditHeadArsLocator.SubProcessDD().getText();
        Thread.sleep(2000);
        AuditHeadArsLocator.SubProcessDD().click();
	    Thread.sleep(3000);
	    AuditHeadArsLocator.SubProcessok().click();
		Thread.sleep(3000);


	    
	  List<String> li=new ArrayList<String>();
     
     li.add(procesText);
     li.add(SubProcessText);
     
     
     Thread.sleep(3000);
     
		List<String> filter=new ArrayList<String>();	
		filter.add("Process");
		filter.add("Sub-Process");
		
		
		/*
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);
*/
		
		
			
		AuditHeadArsLocator.Grid().click();					//Clicking on Text of total items just to scroll down.
		String s = AuditHeadArsLocator.Grid().getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("0")) {
		Thread.sleep(5000);
	
	//	List<WebElement> entitycol=getDriver().findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> processcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdViewObservations']/tbody/tr[2]/td[2]"));
		List<WebElement> subprocesscol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdViewObservations']/tbody/tr[2]/td[3]"));
		
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();
			
			

				if(i==0)
				{
					raw.addAll(processcol);
				}
				
				else if(i==1)
				{
					raw.addAll(subprocesscol);
				}
		
			
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(5000);
		
		sheet = workbook.getSheetAt(2); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;


		  if(AuditHeadArsLocator.SearchBox().isEnabled())
	 		{
			    Thread.sleep(5000);
				row0 = sheet.getRow(52);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				AuditHeadArsLocator.SearchBox().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(5000);
				 String t = AuditHeadArsLocator.SearchText().getText();
		         Thread.sleep(4000);
				AuditHeadArsLocator.Grid().click();
				Thread.sleep(5000);
	           
	 			test.log(LogStatus.FAIL, "Serach Box Does Not Working Properly ");
	 			
	 			
	 		}
	 		
	 		else
	 		{
	 			Thread.sleep(4000);
	 			test.log(LogStatus.FAIL, "Serach Box Does Not Working Properly"  );
	 			
	 		}
	        Thread.sleep(4000);
	
		
	
	}

	
	
	public static void PastObservationAuditStepButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.PastObservation().click();
		Thread.sleep(4000);
		
		AuditHeadArsLocator.ViewHistorical().click();
		Thread.sleep(4000);
		
	
		  if(AuditHeadArsLocator.AuditStep().isEnabled())
	 		{
			  
			  Thread.sleep(4000);
				AuditHeadArsLocator.AuditStep().click();
	 			test.log(LogStatus.PASS, "Audit Step Button Working Properly ");
	 			
	 			
	 		}
	 		
	 		else
	 		{
	 			Thread.sleep(4000);
	 			test.log(LogStatus.FAIL, "Audit Step Button Does Not Working Properly"  );
	 			
	 		}
	        Thread.sleep(4000);
	
			  if(AuditHeadArsLocator.CloseButton().isEnabled())
		 		{
				  
				  Thread.sleep(4000);
					AuditHeadArsLocator.CloseButton().click();
		 			test.log(LogStatus.PASS, "Close Button Working Properly ");
		 			
		 			
		 		}
		 		
		 		else
		 		{
		 			Thread.sleep(4000);
		 			test.log(LogStatus.FAIL, "Close Button Does Not Working Properly"  );
		 			
		 		}
		        Thread.sleep(4000);

				AuditHeadArsLocator.ObservationCount().click();
				Thread.sleep(4000);
				
			    getDriver().switchTo().frame(AuditHeadArsLocator.Frame2());
				Thread.sleep(7000);
		 

				  if(AuditHeadArsLocator.View().isEnabled())
			 		{
					  
					  Thread.sleep(4000);
						AuditHeadArsLocator.View().click();
			 			test.log(LogStatus.PASS, "View Button Working Properly ");
			 			
			 			
			 		}
			 		
			 		else
			 		{
			 			Thread.sleep(4000);
			 			test.log(LogStatus.FAIL, "View Button Does Not Working Properly"  );
			 			
			 		}
			        Thread.sleep(4000);

					  if(AuditHeadArsLocator.Closebutton1().isEnabled())
				 		{
						  
						  Thread.sleep(4000);
							AuditHeadArsLocator.Closebutton1().click();
				 			test.log(LogStatus.PASS, "Close Button Working Properly ");
				 			
				 			
				 		}
				 		
				 		else
				 		{
				 			Thread.sleep(4000);
				 			test.log(LogStatus.FAIL, "Close Button Does Not Working Properly"  );
				 			
				 		}
				        Thread.sleep(4000);

		        
		        
	}
	
	
	
	
	
	public static void UnitAssignmentEdit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.UnitAssignment().click();
		Thread.sleep(9000);
		
		AuditHeadArsLocator.EditUA().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.SelectUnitUA().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.SelectUnitDDUA().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.Ok().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.User1().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.User1DD().click();
		Thread.sleep(9000);
		
		AuditHeadArsLocator.SelectProcess().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.SelectProcessDD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.SelectProcessDD().click();
		Thread.sleep(5000);

		
		AuditHeadArsLocator.ok1().click();
		
		Thread.sleep(19000);
		
		AuditHeadArsLocator.save2().click();
		Thread.sleep(20000);
		
		String t = AuditHeadArsLocator.Successfully2().getText();
		Thread.sleep(5000);
		
		test.log(LogStatus.FAIL, "Without Select Process - " +  t );
		Thread.sleep(19000);
		
	//	AuditHeadArsLocator.close2().click();
	//	Thread.sleep(9000);
		/*
		///////////////////////////
		AuditHeadArsLocator.EditUA().click();
		Thread.sleep(19000);
	
		AuditHeadArsLocator.SelectUnitUA().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.SelectUnitDDUA().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.Ok().click();
		
		Thread.sleep(20000);
		*/
		AuditHeadArsLocator.User1().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.UserDD().click();
		Thread.sleep(9000);
		
		AuditHeadArsLocator.SelectProcess().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.SelectProcessDD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.ok1().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.save2().click();
		Thread.sleep(20000);
		
		String t1 = AuditHeadArsLocator.Successfully2().getText();
		Thread.sleep(20000);
		
		test.log(LogStatus.PASS, "Without Select User - " +  t1 );
		Thread.sleep(19000);
		/*
		AuditHeadArsLocator.close2().click();
		Thread.sleep(9000);
		*/
		
		AuditHeadArsLocator.User1().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.User1DD().click();
		Thread.sleep(9000);

		AuditHeadArsLocator.SelectUnitUA().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.SelectUnitDDUA().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.Ok().click();
		Thread.sleep(19000);

		AuditHeadArsLocator.save2().click();
		Thread.sleep(20000);
		
		String t2 = AuditHeadArsLocator.Successfully2().getText();
		Thread.sleep(5000);
		
		test.log(LogStatus.PASS, "Without Select Unit - " +  t2 );
		Thread.sleep(5000);
	
	}
	
	

	
	public static void UnitAssignmentManagementValidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.UnitAssignment().click();
		Thread.sleep(9000);
		
		AuditHeadArsLocator.EditUA().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.ManagementTab().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.Unit().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.UnitDD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.OK().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.User().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.UserSDD().click();
		Thread.sleep(9000);
		
		AuditHeadArsLocator.Processs().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.ProcesssDD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.ProcesssDD().click();
		Thread.sleep(5000);

		AuditHeadArsLocator.OKProcess().click();
		
		Thread.sleep(19000);
		
		AuditHeadArsLocator.SaveUA1().click();
		Thread.sleep(5000);
		
		String t2 = AuditHeadArsLocator.SuccessfullyUA1().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.FAIL, "Without Select Process - " + t2 );
		Thread.sleep(9000);
			///////////////////////
		AuditHeadArsLocator.User().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.UserNewDD().click();
		Thread.sleep(9000);
		
		AuditHeadArsLocator.Processs().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.ProcesssDD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.OKProcess().click();
		Thread.sleep(19000);
		
	//	AuditHeadArsLocator.save2().click();
	//	Thread.sleep(20000);
		
		AuditHeadArsLocator.SaveUA1().click();
		Thread.sleep(5000);
		
		String t = AuditHeadArsLocator.SuccessfullyUA1().getText();
		Thread.sleep(5000);
		
		test.log(LogStatus.PASS, "Without Select User - " + t );
		Thread.sleep(3000);
	///////////////////////////////
		
		AuditHeadArsLocator.User().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.UserSDD().click();
		Thread.sleep(9000);

		AuditHeadArsLocator.Unit().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.UnitDD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.OK().click();
		Thread.sleep(19000);

		AuditHeadArsLocator.SaveUA1().click();
		Thread.sleep(20000);
		
		String t3 = AuditHeadArsLocator.SuccessfullyUA1().getText();
		Thread.sleep(5000);
		
		test.log(LogStatus.PASS, "Without Select Unit - " +  t3 );
		Thread.sleep(5000);
	
	}
	
	
	
	public static void ReportGeneration( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		AuditHeadArsLocator.ReportGeneration().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.ViewAuditDeatils1().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);

		sheet = workbook.getSheetAt(2); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		/*
		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ProcessOrder().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);

		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ObservationNumber().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);

		AuditHeadArsLocator.SelectProcess().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        AuditHeadArsLocator.SelectProcessDD().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);
        
		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ObservationNumbered().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ProcessOrder1().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);

		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ObservationNumber1().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);

		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ObservationNumbered1().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
*/
				
		  if(AuditHeadArsLocator.FeedbackForm().isEnabled())
	 		{
			    Thread.sleep(5000);
				row0 = sheet.getRow(51);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				AuditHeadArsLocator.FeedbackForm().sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(5000);

	 			test.log(LogStatus.PASS, "File Upload Successfully " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "File Does Not Upload Successfully"  );
	 			
	 		}
	        Thread.sleep(4000);
	
	
		row0 = sheet.getRow(23);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Remark().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);

		/*
		AuditHeadArsLocator.Save1().click();					                //Clicking on Dashboard count		
		Thread.sleep(6000);
		
		String t = AuditHeadArsLocator.Successfullyp().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,   t );
		*/
		Thread.sleep(4000);
		
		File dir2 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		AuditHeadArsLocator.GenerateReport().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
	  
        Thread.sleep(3000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  " Report Generated Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, " Report does not Generated Successfully");
		}

	   Thread.sleep(3000);
	
	
	}
	
	
	
	public static void UnitAssignmentDepartmentValidation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.UnitAssignment().click();
		Thread.sleep(9000);
		
		AuditHeadArsLocator.EditUA().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.DepartmentTab().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.UnitD().click();
		
		Thread.sleep(5000);
		
		AuditHeadArsLocator.UnitDDD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.UnitDOK().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.UserD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.UserDDD().click();
		Thread.sleep(9000);
				
		AuditHeadArsLocator.Department().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.DepartmentDD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.DepartmentDD().click();
		Thread.sleep(5000);

		AuditHeadArsLocator.DepartmentOK().click();		
		Thread.sleep(19000);
			
		AuditHeadArsLocator.SaveUA2().click();
		Thread.sleep(5000);
		
		String t3 = AuditHeadArsLocator.SuccessfullyUA2().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Without Select Department - " + t3 );
		Thread.sleep(9000);		Thread.sleep(9000);
			///////////////////////
		
		AuditHeadArsLocator.UserD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.UserDDDNew().click();
		Thread.sleep(9000);
		
		AuditHeadArsLocator.Department().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.DepartmentDD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.DepartmentOK().click();
		Thread.sleep(19000);
		
	//	AuditHeadArsLocator.SaveUA2().click();
	//	Thread.sleep(20000);
		
		AuditHeadArsLocator.SaveUA2().click();
		Thread.sleep(5000);
		
		String t = AuditHeadArsLocator.SuccessfullyUA2().getText();
		Thread.sleep(5000);
		
		test.log(LogStatus.PASS, "Without Select User - " + t );
		Thread.sleep(3000);
	///////////////////////////////
		
		AuditHeadArsLocator.UserD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.UserDDD().click();
		Thread.sleep(9000);

		AuditHeadArsLocator.UnitD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.UnitDDD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.UnitDOK().click();
		Thread.sleep(19000);

		AuditHeadArsLocator.SaveUA2().click();
		Thread.sleep(20000);
		
		String t4 = AuditHeadArsLocator.SuccessfullyUA2().getText();
		Thread.sleep(5000);
		
		test.log(LogStatus.PASS, "Without Select Unit - " +  t4 );
		Thread.sleep(5000);
	
	}

	
	
	
	public static void Master( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master1().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Unit1().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.addnew().click();
		Thread.sleep(5000);
		
		
		
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Name().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		String OptionText = "Option 3";
		String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_ddlType']/option[3]",OptionText);
		WebElement dropdownOption = getDriver().findElement(By.xpath(xpathExpression));
		dropdownOption.click();
		
		
		Thread.sleep(3000);
		row0 = sheet.getRow(4);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Adress().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		String OptionText1 = "Option 5";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[5]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		
		Thread.sleep(5000);
		String OptionText2 = "Option 3";
		String xpathExpression2 = String.format("//select[@id='ContentPlaceHolder1_ddlCity']/option[3]",OptionText2);
		WebElement dropdownOption2 = getDriver().findElement(By.xpath(xpathExpression2));
		dropdownOption2.click();
		
		Thread.sleep(3000);
		row0 = sheet.getRow(5);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		row0 = sheet.getRow(6);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		
		AuditHeadArsLocator.save().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.Successfully1().click();
		Thread.sleep(5000);
		
		String t4 = AuditHeadArsLocator.Successfully1().getText();
		Thread.sleep(5000);
		
		test.log(LogStatus.PASS, "Add Unit - " + t4 );

		Thread.sleep(5000);
		
		AuditHeadArsLocator.Close().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.Edit().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.Name().clear();
		Thread.sleep(5000);
		
		row0 = sheet.getRow(7);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Name().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		String OptionText3 = "Option 7";
		String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_ddlType']/option[7]",OptionText3);
		WebElement dropdownOption3 = getDriver().findElement(By.xpath(xpathExpression3));
		dropdownOption3.click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Adress().clear();
		Thread.sleep(1000);
		
		Thread.sleep(5000);
		row0 = sheet.getRow(8);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Adress().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		String OptionText4 = "Option 5";
		String xpathExpression4 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[5]",OptionText4);
		WebElement dropdownOption4 = getDriver().findElement(By.xpath(xpathExpression4));
		dropdownOption4.click();
		
		Thread.sleep(5000);
		String OptionText5 = "Option 3";
		String xpathExpression5 = String.format("//select[@id='ContentPlaceHolder1_ddlCity']/option[3]",OptionText5);
		WebElement dropdownOption5 = getDriver().findElement(By.xpath(xpathExpression5));
		dropdownOption5.click();
		
		Thread.sleep(5000);
		
		AuditHeadArsLocator.ContactPerson().clear();
		
		
		Thread.sleep(5000);
		row0 = sheet.getRow(9);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.Email().clear();
		Thread.sleep(1000);
		row0 = sheet.getRow(10);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		
		AuditHeadArsLocator.save().click();
		Thread.sleep(7000);
		
		AuditHeadArsLocator.Successfully1().click();
		Thread.sleep(5000);
		
		String t3 = AuditHeadArsLocator.Successfully1().getText();
		Thread.sleep(5000);
		
		test.log(LogStatus.PASS, "Update Unit - " + t3 );

		Thread.sleep(5000);
		
		AuditHeadArsLocator.Close().click();
		
		Thread.sleep(5000);
		
		if(AuditHeadArsLocator.ExportToExcel().isEnabled())
		{
			
			Thread.sleep(2000);
			AuditHeadArsLocator.ExportToExcel().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Download Successfully "  );
			
		}
		
		Thread.sleep(5000);
	
		AuditHeadArsMethod.MasterSubUnit(test, workbook);

	Thread.sleep(5000);
	
	}
	
	
	public static void MasterSubUnit(ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		/*
		Thread.sleep(1000);
		Locator.IFC().click();
		Thread.sleep(3000);
		
		Locator.Master().click();
		Thread.sleep(3000);
		
		Locator.Unit().click();
		Thread.sleep(3000);
		
		*/
		Thread.sleep(3000);
		AuditHeadArsLocator.SubUnit().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.addnew().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(4); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(71);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Name().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		String OptionText = "Option 3";
		String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_ddlType']/option[3]",OptionText);
		WebElement dropdownOption = getDriver().findElement(By.xpath(xpathExpression));
		dropdownOption.click();
		
		
		Thread.sleep(3000);
		row0 = sheet.getRow(72);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Adress().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		String OptionText1 = "Option 5";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[5]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		
		Thread.sleep(3000);
		String OptionText2 = "Option3";
		String xpathExpression2 = String.format("//select[@id='ContentPlaceHolder1_ddlCity']/option[3]",OptionText2);
		WebElement dropdownOption2 = getDriver().findElement(By.xpath(xpathExpression2));
		dropdownOption2.click();
		
		Thread.sleep(3000);
		row0 = sheet.getRow(73);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(74);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		
		AuditHeadArsLocator.save().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Successfully1().click();
		Thread.sleep(3000);
		
		String t1 = AuditHeadArsLocator.Successfully1().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Add Sub Unit - " + t1 );

		Thread.sleep(2000);
		
		AuditHeadArsLocator.Close().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Edit().click();
		Thread.sleep(3000);
		
		
		AuditHeadArsLocator.Name().clear();
		Thread.sleep(1000);
		row0 = sheet.getRow(7);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Name().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		/*
		String OptionText3 = "Option 9";
		String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_ddlCompanyType']/option[9]",OptionText3);
		WebElement dropdownOption3 = get()get()getDriver().findElement(By.xpath(xpathExpression3));
		dropdownOption3.click();
		*/
		AuditHeadArsLocator.Adress().clear();
		Thread.sleep(1000);
		Thread.sleep(3000);
		row0 = sheet.getRow(8);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Adress().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		String OptionText4 = "Option 5";
		String xpathExpression4 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[5]",OptionText4);
		WebElement dropdownOption4 = getDriver().findElement(By.xpath(xpathExpression4));
		dropdownOption4.click();
		
		Thread.sleep(3000);
		String OptionText5 = "Option 3";
		String xpathExpression5 = String.format("//select[@id='ContentPlaceHolder1_ddlCity']/option[3]",OptionText5);
		WebElement dropdownOption5 = getDriver().findElement(By.xpath(xpathExpression5));
		dropdownOption5.click();
		
		AuditHeadArsLocator.ContactPerson().clear();
		Thread.sleep(1000);
		
		Thread.sleep(3000);
		row0 = sheet.getRow(9);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ContactPerson().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		AuditHeadArsLocator.Email().clear();
		Thread.sleep(1000);
		row0 = sheet.getRow(10);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		
		AuditHeadArsLocator.save().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Successfully1().click();
		Thread.sleep(3000);
		
		String t2 = AuditHeadArsLocator.Successfully1().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "Update Sub-Unit - " + t2 );

		Thread.sleep(2000);
		
		AuditHeadArsLocator.Close1().click();
		Thread.sleep(3000);
		
		/*
		if(Locator.Close().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.Close().click();
			test.log(LogStatus.PASS, " Close Button Is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Close Button Is Not Working Properly "  );
			
		}
		
		
		Thread.sleep(3000);
		*/

		if(AuditHeadArsLocator.ExportToExcel().isEnabled())
		{
			
			Thread.sleep(2000);
			AuditHeadArsLocator.ExportToExcel().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Download Successfully "  );
			
		}
		
		Thread.sleep(5000);
		
		
	
	
		
		
		
		
	}
		
	
	public static void DepartmentMaster( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.DepartmentMaster().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AddNewDM().click();
		Thread.sleep(3000);
	
		sheet = workbook.getSheetAt(4); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(11);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.DepartmentName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
	
		AuditHeadArsLocator.SaveDM().click();
		Thread.sleep(3000);
		
		String t1 = AuditHeadArsLocator.SuccessfullyDM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, " Add Department - " +t1 );

		Thread.sleep(2000);
		
		AuditHeadArsLocator.CloseDM().click();
		Thread.sleep(7000);
		
		AuditHeadArsLocator.EditDM().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.DepartmentName().clear();
		Thread.sleep(1000);
		
		row0 = sheet.getRow(12);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.DepartmentName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
	
		AuditHeadArsLocator.SaveDM().click();
		Thread.sleep(3000);
		
		String t2 = AuditHeadArsLocator.SuccessfullyDM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Update Department - " + t2 );

		Thread.sleep(2000);
		
		if(AuditHeadArsLocator.CloseDM().isEnabled())
		{
			
			Thread.sleep(2000);
			AuditHeadArsLocator.CloseDM().click();
			test.log(LogStatus.PASS, " Close Button is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Close Button is not Working Properly "  );
			
		}
		
		Thread.sleep(2000);
		
		
		
	
	}
	

	
	public static void VerticalMaster1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.VerticalMaster().click();
		Thread.sleep(3000);
		
		
		
		AuditHeadArsLocator.AddNewVM().click();
		Thread.sleep(6000);
		
		sheet = workbook.getSheetAt(4); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(13);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.VerticalName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.SaveVM().click();
		Thread.sleep(3000);
		
		String t1 = AuditHeadArsLocator.SuccessfullyVM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Add Vertical - " + t1 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CloseVM().click();
		Thread.sleep(3000);
	
		AuditHeadArsLocator.EditVM().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.VerticalName().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(14);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.VerticalName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		AuditHeadArsLocator.SaveVM().click();
		Thread.sleep(3000);
		
		String t2 = AuditHeadArsLocator.SuccessfullyVM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Update Vertical - " + t2 );
		Thread.sleep(3000);
		
		if(AuditHeadArsLocator.CloseVM().isEnabled())
		{
			
			Thread.sleep(2000);
			AuditHeadArsLocator.CloseVM().click();
			test.log(LogStatus.PASS, " Close Button Is Working Properly" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Close Button Is Working Properly"  );
			
		}
		Thread.sleep(4000);
		
		
	
		AuditHeadArsLocator.LocationVerticalMapping().click();
		Thread.sleep(3000);
		
		getDriver().switchTo().frame(AuditHeadArsLocator.Frame());
	    Thread.sleep(5000);
	    
	    
		
	    AuditHeadArsLocator.SelectCompanyVM().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.SelectCompanyDDVM().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.SelectVertical().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.SelectVerticalDD().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.OKVM().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.SaveLVM().click();
		Thread.sleep(3000);
		
		String t3 = AuditHeadArsLocator.SuccessfullyLVM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,   t3 );
		Thread.sleep(3000);
		
		if(AuditHeadArsLocator.DownloadLVM().isEnabled())
		{
			
			Thread.sleep(2000);
			AuditHeadArsLocator.DownloadLVM().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Download Successfully "  );
			
		}
		Thread.sleep(5000);
		
		
		

	
	}
	
	public static void BusinessProcess( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.BusinessProcess().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AddNewBP().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(4); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(15);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.NameBP().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.SaveBP().click();
		Thread.sleep(3000);
		
		String t1 = AuditHeadArsLocator.SuccessfulBP().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Add Business Process - " + t1 );
		Thread.sleep(3000);
	
		
		AuditHeadArsLocator.CloseBP().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.EditBP().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.NameBP().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(16);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.NameBP().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		AuditHeadArsLocator.SaveBP().click();
		Thread.sleep(4000);
		
		String t2 = AuditHeadArsLocator.SuccessfulBP().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Update Business Process - " + t2 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CloseBP().click();
		Thread.sleep(3000);
		
		/*
		
		if(Locator.CloseBP().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.CloseBP().click();
			test.log(LogStatus.PASS, " Close Button Is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Close Button Is Working Properly "  );
			
		}
		
		*/
		
		AuditHeadArsLocator.SubProcessBP().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.SubProcessAddNewBP().click();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(17);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.SubProcessNameBP().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		AuditHeadArsLocator.SaveBP().click();
		Thread.sleep(3000);
		
		String t4 = AuditHeadArsLocator.SuccessfulBP().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Add Sub-Process - " + t4 );
		Thread.sleep(3000);
		
		
		
		AuditHeadArsLocator.CloseBP().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.EditSubProcessBP().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.SubProcessNameBP().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(18);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.SubProcessNameBP().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		AuditHeadArsLocator.SaveBP().click();
		Thread.sleep(3000);
		
		String t5 = AuditHeadArsLocator.SuccessfulBP().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Update Sub-Process - " + t5 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CloseBP().click();
		Thread.sleep(3000);
		
		/*
		
		if(Locator.CloseBP().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.CloseBP().click();
			test.log(LogStatus.PASS, " Sub-Process - Close Button Is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Sub-Process - Close Button Is Working Properly "  );
			
		}
		
		*/
		
		AuditHeadArsLocator.BackSubProcessBP().click();
		Thread.sleep(3000);
		/*
		if(Locator.BackSubProcessBP().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.BackSubProcessBP().click();
			test.log(LogStatus.PASS, " Sub-Process - Back Button Is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Sub-Process - Back Button Is Working Properly "  );
			
		}
		*/
		
		Thread.sleep(3000);
		
		AuditHeadArsLocator.SubProcessBP().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.BusinessProcessSubActivity().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.BusinessActivity().click();
		Thread.sleep(5000);
		
		row0 = sheet.getRow(66);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.BusinessActivityName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.BusinessActivitySave().click();
		Thread.sleep(5000);
	
		String t7 = AuditHeadArsLocator.BusinessActivitySuccessfully().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Add Activiy - " + t7 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.BusinessActivityClose().click();
		Thread.sleep(5000);
	
		AuditHeadArsLocator.BusinessActivityEdit().click();
		Thread.sleep(5000);
	
		AuditHeadArsLocator.BusinessActivityName().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(70);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.BusinessActivityName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.BusinessActivitySave().click();
		Thread.sleep(9000);
	
		String t8 = AuditHeadArsLocator.BusinessActivitySuccessfully().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Update Activity - " + t8 );
		Thread.sleep(5000);
		
		
		AuditHeadArsLocator.BusinessActivityClose().click();
		Thread.sleep(5000);
		
		/*
		if(Locator.BusinessActivityClose().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.BusinessActivityClose().click();
			test.log(LogStatus.PASS, " Activity - Close Button Is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Activity - Close Button Is Not Working Properly "  );
			
		}
		*/
		
		
		AuditHeadArsLocator.BackSubProcessBP().click();
		Thread.sleep(5000);
		
		/*
		if(Locator.BackSubProcessBP().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.BackSubProcessBP().click();
			test.log(LogStatus.PASS, " Activity - Back Button Is Working Properly  " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Activity - Back Button Is Not Working Properly "  );
			
		}
		
		*/
		Thread.sleep(5000);
		
		
		
	}
	
	
	public static void ObservationCatogaries( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Observations().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AddNewOC().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(4); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(19);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.NameOC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		AuditHeadArsLocator.SaveOC().click();
		Thread.sleep(3000);
		
		String t1 = AuditHeadArsLocator.SuccessfullOC().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Add Observation Category - " + t1 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CancelOC().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.EditOC().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.NameOC().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(20);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.NameOC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		AuditHeadArsLocator.SaveOC().click();
		Thread.sleep(3000);
		
		String t2 = AuditHeadArsLocator.SuccessfullOC().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "Update Observation Category - " + t2 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CancelOC().click();
		Thread.sleep(3000);
		
		/*
		if(Locator.CancelOC().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.CancelOC().click();
			test.log(LogStatus.PASS, " Close Button is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  Close Button is Not Working Properly "  );
			
		}
		
		*/
		
		Thread.sleep(5000);
		
		
		AuditHeadArsLocator.SubCatogariesOC().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.SubCatogariesAddNewOC().click();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(21);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.SubCatogariesNameOC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.SaveOC().click();
		Thread.sleep(3000);
		
		String t4 = AuditHeadArsLocator.SuccessfullOC().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Add Sub-Category - " + t4 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CancelOC().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.SubCatogariesEditOC().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.SubCatogariesNameOC().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(22);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.SubCatogariesNameOC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.SaveOC().click();
		Thread.sleep(3000);
		
		String t5 = AuditHeadArsLocator.SuccessfullOC().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Update Sub-Category - " + t5 );
		Thread.sleep(3000);
		
		/*
		
		if(Locator.CancelOC().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.CancelOC().click();
			test.log(LogStatus.PASS, " Close Button Is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Close Button Is not Working Properly "  );
			
		}
		
		*/
		
		AuditHeadArsLocator.CancelOC().click();
	    Thread.sleep(3000);
	    
	    AuditHeadArsLocator.BackSubProcessBP().click();
	    Thread.sleep(3000);
	    
	    /*
		
		if(Locator.BackSubProcessBP().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.BackSubProcessBP().click();
			test.log(LogStatus.PASS, " Back Button Is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Back Button Is Not Working Properly  "  );
			
		}
	
		Thread.sleep(3000);
	*/
		
	
	}
	
	
	
	public static void RiskCategory( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.RiskCatogary().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AddNewRC().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.RadioRC().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Radio1RC().click();
		Thread.sleep(3000);
		
		sheet = workbook.getSheetAt(4); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(23);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.NameRC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		AuditHeadArsLocator.SaveOC().click();
		Thread.sleep(3000);
		
		String t2 = AuditHeadArsLocator.SuccessfullOC().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Add Risk Category - " + t2 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CancelOC().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.EditRC().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Radio1RC().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.RadioRC().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.NameRC().clear();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.NameRC().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		AuditHeadArsLocator.SaveOC().click();
		Thread.sleep(3000);
		
		String t1 = AuditHeadArsLocator.SuccessfullOC().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Update Risk Category - " + t1 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CancelOC().click();
		Thread.sleep(3000);
		
		
		
		
	
	}
	
	public static void Users( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Users().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AddNewUsers().click();
		Thread.sleep(5000);
		
		sheet = workbook.getSheetAt(4); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(25);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.FirstNameU().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		row0 = sheet.getRow(26);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.LastNameU().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		row0 = sheet.getRow(27);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.DestinationU().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		row0 = sheet.getRow(28);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.EmailU().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		row0 = sheet.getRow(29);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ContactNoU().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		String OptionText = "Option 2";
		String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']/option[2]",OptionText);
		WebElement dropdownOption = getDriver().findElement(By.xpath(xpathExpression));
		dropdownOption.click();
		
		AuditHeadArsLocator.DepartmentCheckBoxU().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.RadioU().click();
		Thread.sleep(3000);
		
		String OptionText1 = "Option 2";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']/option[2]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		
		AuditHeadArsLocator.SaveU().click();
		Thread.sleep(9000);
		
		String t2 = AuditHeadArsLocator.SuccessfullyU().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Add User - " + t2 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CancelU().click();
		Thread.sleep(3000);
		/*
		
		Thread.sleep(3000);
		row0 = sheet.getRow(68);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.FilterU().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.ClickOperation().click();
		Thread.sleep(6000);
		
		*/
		
		AuditHeadArsLocator.EditU().click();
		Thread.sleep(6000);
		
		AuditHeadArsLocator.FirstNameU().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(30);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.FirstNameU().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.LastNameU().clear();
		Thread.sleep(3000);
	
		row0 = sheet.getRow(31);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.LastNameU().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		AuditHeadArsLocator.DestinationU().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(32);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.DestinationU().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		AuditHeadArsLocator.EmailU().clear();
		Thread.sleep(3000);
	
		row0 = sheet.getRow(33);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.EmailU().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.ContactNoU().clear();
		Thread.sleep(3000);
	
		row0 = sheet.getRow(34);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ContactNoU().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		String OptionText2 = "Option 2";
		String xpathExpression2 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']/option[2]",OptionText2);
		WebElement dropdownOption2 = getDriver().findElement(By.xpath(xpathExpression2));
		dropdownOption2.click();
		
		AuditHeadArsLocator.DepartmentCheckBoxU().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.RadioU().click();
		Thread.sleep(3000);
		
		String OptionText3 = "Option 2";
		String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']/option[2]",OptionText3);
		WebElement dropdownOption3 = getDriver().findElement(By.xpath(xpathExpression3));
		dropdownOption3.click();
		
		AuditHeadArsLocator.SaveU().click();
		Thread.sleep(17000);
		
		String t3 = AuditHeadArsLocator.SuccessfullyU().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Update User - " + t3 );
		Thread.sleep(3000);
		
		/*
		
		if(Locator.CancelU().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.CancelU().click();
			test.log(LogStatus.PASS, " Close Button Is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Close Button Is Not Working Properly "  );
			
		}
		
		Thread.sleep(3000);
*/
		
		AuditHeadArsLocator.CancelU().click();
		Thread.sleep(3000);
				
		AuditHeadArsLocator.ResetPasswordU().click();
		Thread.sleep(4000);
		
		
        Alert ac1=getDriver().switchTo().alert();		
		Thread.sleep(4000);
		ac1.accept();
		
		Thread.sleep(7000);
		
        Alert ac2=getDriver().switchTo().alert();
		
		String t6=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t6 );
		
		Thread.sleep(4000);
		ac2.accept();
		
		AuditHeadArsLocator.DeleteU().click();
		Thread.sleep(4000);
		
		Alert ac=getDriver().switchTo().alert();
		
		String t4=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t4 );
		
		Thread.sleep(4000);
		ac.accept();
		Thread.sleep(4000);
		
		if(AuditHeadArsLocator.ExportToExcelU().isEnabled())
		{
			
			Thread.sleep(2000);
			AuditHeadArsLocator.ExportToExcelU().click();
			test.log(LogStatus.PASS, " File Download Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " File Download Successfully "  );
			
		}
		
		Thread.sleep(5000);
		
		/*
		
		Thread.sleep(3000);
		row0 = sheet.getRow(68);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.FilterU().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
	//	Locator.ClickOperation().click();
	//	Thread.sleep(5000);
		
		
		if(Locator.ClickOperation().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.ClickOperation().click();
			test.log(LogStatus.PASS, " Search Box Is working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Search Box Is working Properly "  );
			
		}
		
		*/
		Thread.sleep(3000);
	}
	
	
	
	public static void UnitAssignment1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.UnitAssignment().click();
		Thread.sleep(9000);
		
		AuditHeadArsLocator.AddNewUA().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.SelectCompanyUA().click();
		Thread.sleep(9000);
		
		AuditHeadArsLocator.SelectCompanyUADD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.OKUA().click();
		Thread.sleep(20000);
		
		AuditHeadArsLocator.SelectProcessUA().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.SelectProcessUADD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.OK3().click();
		Thread.sleep(20000);
		
		AuditHeadArsLocator.UsersUA().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.UsersDDUA().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.SaveUA().click();
		Thread.sleep(15000);
		
		String t2 = AuditHeadArsLocator.SuccessfullyUA().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Add Unit Assignment - " + t2 );
		Thread.sleep(9000);
		
		AuditHeadArsLocator.CloseUA().click();
		Thread.sleep(5000);
		
		/*
		
		if(Locator.CloseUA().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.CloseUA().click();
			test.log(LogStatus.PASS, " Close Button is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Close Button is not Working Properly "  );
			
		}
		
		
		Thread.sleep(5000);
		*/
	
		AuditHeadArsLocator.EditUA().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.SelectUnitUA().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.SelectUnitDDUA().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.Ok().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.User1().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.User1DD().click();
		Thread.sleep(9000);
		
		AuditHeadArsLocator.SelectProcess().click();
		Thread.sleep(19000);
		
		AuditHeadArsLocator.SelectProcessDD().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.ok1().click();
		Thread.sleep(20000);
		
		AuditHeadArsLocator.save2().click();
		Thread.sleep(20000);
		
		String t = AuditHeadArsLocator.Successfully2().getText();
		Thread.sleep(5000);
		
		test.log(LogStatus.PASS, "Update Unit Assignment - " + t );
		Thread.sleep(19000);
		
		AuditHeadArsLocator.close2().click();
		Thread.sleep(9000);
	
		AuditHeadArsLocator.ReAssignUA().click();
		Thread.sleep(15000);
		
		AuditHeadArsLocator.User3().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.User3DD().click();
		Thread.sleep(20000);
		
		AuditHeadArsLocator.NewUserAssignUA().click();
		Thread.sleep(20000);
		
		AuditHeadArsLocator.NewUserAssignUADD().click();
		Thread.sleep(20000);
		
		AuditHeadArsLocator.Save1UA().click();
		Thread.sleep(5000);
		
        Alert ac2=getDriver().switchTo().alert();
		
		String t5=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t5 );
		
		Thread.sleep(4000);
		ac2.accept();
		
		Thread.sleep(5000);
		
		String t6 = AuditHeadArsLocator.Successfullymessage().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,   t6 );
		Thread.sleep(3000);
		
		/*
		
		if(Locator.Close1UA().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.Close1UA().click();
			test.log(LogStatus.PASS, " Close Button Is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Close Button Is not Working Properly  "  );
			
		}
		Thread.sleep(2000);
	
		*/
		AuditHeadArsLocator.Close1UA().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.DeleteUA().click();
		Thread.sleep(5000);
	
        Alert ac=getDriver().switchTo().alert();
		
		String t7=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t7 );
		
		Thread.sleep(4000);
		ac.accept();
		
		Thread.sleep(1000);
	
	
		
		
	}
	
	
	public static void AuditorMaster1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AuditorMaster().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AddNewAM().click();
		Thread.sleep(5000);
		
		sheet = workbook.getSheetAt(4); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(35);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.AuditFirmNameAM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		row0 = sheet.getRow(36);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.PartenerNameAM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		row0 = sheet.getRow(37);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.PartenerContactNoAM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		row0 = sheet.getRow(38);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ManagerNameAM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
	
		row0 = sheet.getRow(39);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ManagerContactNoAM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		AuditHeadArsLocator.SaveAM().click();
		Thread.sleep(9000);
	
		String t = AuditHeadArsLocator.SuccessfullyAM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.FAIL, "Add Auditor Master - " + t );
		Thread.sleep(3000);
		
		/*
		
		if(Locator.CloseAM().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.CloseAM().click();
			test.log(LogStatus.PASS, " Close Button Is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Close Button Is Working Properly "  );
			
		}
		
		Thread.sleep(2000);
		*/
		
		AuditHeadArsLocator.CloseAM().click();
		Thread.sleep(5000);
	
		AuditHeadArsLocator.EditAM().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.AuditFirmNameAM().clear();
		Thread.sleep(3000);
	
		row0 = sheet.getRow(40);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.AuditFirmNameAM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.PartenerNameAM().clear();
		Thread.sleep(3000);
	
		row0 = sheet.getRow(41);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.PartenerNameAM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.PartenerContactNoAM().clear();
		Thread.sleep(3000);
	
		row0 = sheet.getRow(42);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.PartenerContactNoAM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		AuditHeadArsLocator.ManagerNameAM().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(43);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ManagerNameAM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		AuditHeadArsLocator.ManagerContactNoAM().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(44);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ManagerContactNoAM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		AuditHeadArsLocator.SaveAM().click();
		Thread.sleep(5000);
	
		String t3 = AuditHeadArsLocator.SuccessfullyAM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Update Auditor - " + t3 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CloseAM().click();
		Thread.sleep(5000);
		
		
	
	
	}
	
	public static void AuditorsTeamMaster( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AuditorsTeamMaster().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AddNewATM().click();
		Thread.sleep(5000);
		
		String OptionText3 = "Option 2";
		String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_ddlAuditor']/option[2]",OptionText3);
		WebElement dropdownOption3 = getDriver().findElement(By.xpath(xpathExpression3));
		dropdownOption3.click();
		
		AuditHeadArsLocator.RadioATM().click();
		Thread.sleep(5000);
		
		sheet = workbook.getSheetAt(4); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
	
	
		row0 = sheet.getRow(45);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.FirstNameATM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		row0 = sheet.getRow(46);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.LastNameATM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		row0 = sheet.getRow(47);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.EmailATM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		row0 = sheet.getRow(48);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ContactATM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		AuditHeadArsLocator.SaveAM().click();
		Thread.sleep(9000);
	
		String t1 = AuditHeadArsLocator.SuccessfullyAM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Add Auditors Team - " + t1 );
		Thread.sleep(6000);
		
		AuditHeadArsLocator.CloseAM().click();
		Thread.sleep(5000);
		
		String OptionText1 = "Option 2";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlFilterAuditor']/option[2]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		
		Thread.sleep(5000);
		
		AuditHeadArsLocator.EditATM().click();
		Thread.sleep(5000);
	
		String OptionText = "Option 2";
		String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_ddlAuditor']/option[2]",OptionText);
		WebElement dropdownOption = getDriver().findElement(By.xpath(xpathExpression));
		dropdownOption.click();
		
		AuditHeadArsLocator.RadioATM().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.FirstNameATM().clear();
		Thread.sleep(3000);
	
		row0 = sheet.getRow(49);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.FirstNameATM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		AuditHeadArsLocator.LastNameATM().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(50);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.LastNameATM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.EmailATM().clear();
		Thread.sleep(3000);
	
		row0 = sheet.getRow(51);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.EmailATM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.ContactATM().clear();
		Thread.sleep(3000);
	
		row0 = sheet.getRow(52);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.ContactATM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		AuditHeadArsLocator.SaveAM().click();
		Thread.sleep(5000);
	
		String t2 = AuditHeadArsLocator.SuccessfullyAM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Update -" + t2 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CloseAM().click();
		 Thread.sleep(2000);
		
		
	}
	
	
	public static void StateMaster( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.StateMaster().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AddNewSM().click();
		Thread.sleep(5000);
		
		sheet = workbook.getSheetAt(4); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(53);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.NameSM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		String OptionText3 = "Option 2";
		String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_ddlCountry']/option[2]",OptionText3);
		WebElement dropdownOption3 = getDriver().findElement(By.xpath(xpathExpression3));
		dropdownOption3.click();
		
		AuditHeadArsLocator.SaveAM().click();
		Thread.sleep(5000);
	
		String t2 = AuditHeadArsLocator.SuccessfullyAM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Add State - " + t2 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CloseAM().click();
		Thread.sleep(5000);
	
		AuditHeadArsLocator.EditSM().click();
		Thread.sleep(5000);
	
		AuditHeadArsLocator.NameSM().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(54);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.NameSM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		String OptionText = "Option 2";
		String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_ddlCountry']/option[2]",OptionText);
		WebElement dropdownOption = getDriver().findElement(By.xpath(xpathExpression));
		dropdownOption.click();
		
		AuditHeadArsLocator.SaveAM().click();
		Thread.sleep(5000);
	
		String t = AuditHeadArsLocator.SuccessfullyAM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Update State - " + t );
		Thread.sleep(4000);
		
		AuditHeadArsLocator.CloseAM().click();
		Thread.sleep(5000);

		
	}
	
	
	public static void CityMaster1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CityMaster().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AddNewCM().click();
		Thread.sleep(13000);
		
		sheet = workbook.getSheetAt(4); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(55);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.CityNameCM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		String OptionText3 = "Option 20";
		String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[20]",OptionText3);
		WebElement dropdownOption3 = getDriver().findElement(By.xpath(xpathExpression3));
		dropdownOption3.click();
		
		Thread.sleep(10000);
		
		AuditHeadArsLocator.SaveAM().click();
		Thread.sleep(9000);
	
		String t2 = AuditHeadArsLocator.SuccessfullyAM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Add City - " + t2 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CloseAM().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.EditCM().click();
		Thread.sleep(9000);
		
		AuditHeadArsLocator.CityNameCM().clear();
		Thread.sleep(7000);
		
		row0 = sheet.getRow(56);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.CityNameCM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
	
		String OptionText = "Option 32";
		String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[32]",OptionText);
		WebElement dropdownOption = getDriver().findElement(By.xpath(xpathExpression));
		dropdownOption.click();
		
		Thread.sleep(7000);
		
		AuditHeadArsLocator.SaveAM().click();
		Thread.sleep(5000);
	
		String t = AuditHeadArsLocator.SuccessfullyAM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Update City - " + t );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CloseAM().click();
		Thread.sleep(5000);
		
		/*
		if(Locator.CloseAM().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.CloseAM().click();
			test.log(LogStatus.PASS, " Close Button Is Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Close Button Is Working Properly "  );
			
		}
		
		
		Thread.sleep(4000);
		row0 = sheet.getRow(68);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.CitySearch().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		//Locator.FilterClick().click();
		//Thread.sleep(2000);
		
		if(Locator.ActionClickForSearch().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.ActionClickForSearch().click();
			test.log(LogStatus.PASS, " Search Box Is working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Search Box Is working Properly "  );
			
		}
		Thread.sleep(2000);
	
	*/
	
	}
	
	
	public static void ProcessRatingMaster( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.Master().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.ProcessMaster().click();
		Thread.sleep(3000);
		
		AuditHeadArsLocator.AddNewPM().click();
		Thread.sleep(5000);
		
		sheet = workbook.getSheetAt(4); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(57);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.NamePM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		row0 = sheet.getRow(58);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.DescriptionPM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.SaveAM().click();
		Thread.sleep(5000);
	
		String t1 = AuditHeadArsLocator.SuccessfullyAM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "Add Process Rating - " + t1 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CloseAM().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.EditPM().click();
		Thread.sleep(5000);
		
		AuditHeadArsLocator.NamePM().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(59);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.NamePM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.DescriptionPM().clear();
		Thread.sleep(3000);
		
		row0 = sheet.getRow(60);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		AuditHeadArsLocator.DescriptionPM().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(5000);
		
		AuditHeadArsLocator.SaveAM().click();
		Thread.sleep(5000);
	
		String t2 = AuditHeadArsLocator.SuccessfullyAM().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Update Process Rating - " + t2 );
		Thread.sleep(3000);
		
		AuditHeadArsLocator.CloseAM().click();
		Thread.sleep(5000);
		
		/*
		if(Locator.CloseAM().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator.CloseAM().click();
			test.log(LogStatus.PASS, " Close Button Is Working Proerly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Close Button Is Working properly "  );
			
		}
		Thread.sleep(2000);
	*/
		
		AuditHeadArsLocator.DeletePM().click();
		Thread.sleep(5000);
		
        Alert ac2=getDriver().switchTo().alert();
		
		String t5=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  t5 );
		
		Thread.sleep(4000);
		ac2.accept();
		
		Thread.sleep(1000);
		
		
		
		
	}
	
	public static void ViewProcessWiseDetails( ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
	Thread.sleep(1000);
	
	AuditHeadArsLocator.AuditReporting().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.AuditKickoff().click();
	Thread.sleep(3000);
	
	AuditHeadArsLocator.ViewProcessWiseDetails().click();
	Thread.sleep(4000);
	AuditHeadArsLocator.Performer().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.PerformerCheckBox().click();
	AuditHeadArsLocator.PerformerOk().click();
	Thread.sleep(7000);
	
	AuditHeadArsLocator.SelectReviwer().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.SelectReviwerA().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.SaveVp().click();
	Thread.sleep(3000);
	String Msg1=AuditHeadArsLocator.SaveVpMSg().getText();
	Thread.sleep(1000);
	test.log(LogStatus.PASS, Msg1);
	// --------------Audit  Assignment Sample Excel  File -----------------------
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	AuditHeadArsLocator.AuditAssignmentSampleExcelFile().click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\ambujs\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	//--------------- Upload File----------------------------------
	AuditHeadArsLocator.ChooseFileVP().sendKeys("C:\\Users\\ambujs\\Downloads\\UserList (5).xlsx");
	Thread.sleep(1000);
	AuditHeadArsLocator.UploadVp().click();
	String Msg2=AuditHeadArsLocator.UploadMsg().getText();
	Thread.sleep(1000);
	test.log(LogStatus.PASS, Msg2);
	Thread.sleep(1000);
	AuditHeadArsLocator.Back().click();
	Thread.sleep(1000);
	test.log(LogStatus.PASS,  " Back Button Working successfully");
	}

	
	
	public static void AdditionalRiskCreation( ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
	Thread.sleep(1000);
	AuditHeadArsLocator.AuditReporting().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.AdditionalRiskCreation().click();
	Thread.sleep(3000);
	
	AuditHeadArsLocator.ARAddNew().click();
	Thread.sleep(4000);
	AuditHeadArsLocator.CompanyAr().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.IndiaAR().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.SelectProcessAR().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.ActionProcessAR().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.OkAR().click();
	Thread.sleep(5000);
	AuditHeadArsLocator.SelectSubProcess().click();
	Thread.sleep(2000);
	AuditHeadArsLocator.SubAction().click();
	Thread.sleep(2000);
	AuditHeadArsLocator.OkSubAction().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.SelectPersonResponsible().click();
	Thread.sleep(2000);
	AuditHeadArsLocator.ambujperformer2AR().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.SelectRCMType().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.Both().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.SelectKeyType().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.SelectKeyTypeYes().click();
	Thread.sleep(1000);
	
	sheet = workbook.getSheetAt(4); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);	
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(111);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	int No = (int) c1.getNumericCellValue();
	AuditHeadArsLocator.ObjectiveRef().sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);

	row0 = sheet.getRow(112);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	AuditHeadArsLocator.Risk().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(113);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	AuditHeadArsLocator.ControlObjective().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(114);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	AuditHeadArsLocator.ControlDescription().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(115);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	AuditHeadArsLocator.AuditMethodology().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(116);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	AuditHeadArsLocator.AuditSteps().sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	/*
	AuditHeadArsLocator.ObjectiveRef().sendKeys("2222222222"); // Writing Task title
	Thread.sleep(1000);
	
	AuditHeadArsLocator.Risk().sendKeys("High"); // Writing Task title
	Thread.sleep(1000);
	
	AuditHeadArsLocator.ControlObjective().sendKeys("NA"); // Writing Task title
	Thread.sleep(1000);

	AuditHeadArsLocator.ControlDescription().sendKeys("NA"); // Writing Task title
	Thread.sleep(1000);
	
	AuditHeadArsLocator.AuditMethodology().sendKeys("Internal Audit Methodology"); // Writing Task title
	Thread.sleep(1000);

	AuditHeadArsLocator.AuditSteps().sendKeys("Activity To Be Done 1"); // Writing Task title
	Thread.sleep(1000);
*/


	AuditHeadArsLocator.SaveAR().click();
	Thread.sleep(1000);
	try {
	String Msg2=AuditHeadArsLocator.SaveMsg().getText();
	Thread.sleep(1000);
	if (Msg2.equalsIgnoreCase("Details Added Successfully.")) {
		test.log(LogStatus.PASS,  "Message display :-" +Msg2);
	} else {
		test.log(LogStatus.FAIL,  "Message display :-" +Msg2);
	}
	}catch(Exception e) {
		test.log(LogStatus.PASS,  "Message display :- Details Already Present.");
	}
	Thread.sleep(1000);
	if(AuditHeadArsLocator.CloseBtnAR().isEnabled()) {
		
		AuditHeadArsLocator.CloseBtnAR().click();
		test.log(LogStatus.PASS,  "Close Button Working Successfully");
	}else {
		test.log(LogStatus.PASS,  "Close Button Not Working Successfully");
	}
	 }
	
	
	
	public static void ExportToExcel( ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
	Thread.sleep(1000);
	AuditHeadArsLocator.AuditReporting().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.AdditionalRiskCreation().click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	AuditHeadArsLocator.ExportAR().click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\ambujs\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	 }
	


	public static void DeActivate( ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
	Thread.sleep(1000);
	AuditHeadArsLocator.AuditReporting().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.AdditionalRiskCreation().click();
	Thread.sleep(2000);
	AuditHeadArsLocator.DeActivate().click();
	Thread.sleep(2000);
	AuditHeadArsLocator.CompanyAR().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.ireland().click();
	Thread.sleep(2000);
	
	AuditHeadArsLocator.SelectAuditStep().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.SelectAuditStepChckBox().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.SelectAuditStep().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.ClickShow().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.CheckBox().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.SaveDeactivate().click();
	Thread.sleep(1000);
	String Msg1	=AuditHeadArsLocator.SaveDeactivateMSG().getText();
	Thread.sleep(1000);
	test.log(LogStatus.PASS,  "Message display :-" +Msg1);
	Thread.sleep(1000);
	AuditHeadArsLocator.ClickDashboard().click();
	 }
	
	
	public static void SpecialAuditScheduling( ExtentTest test) throws InterruptedException
	 { 
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);


	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
	Thread.sleep(1000);
	AuditHeadArsLocator.AuditReporting().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.SpecialAuditScheduling().click();
	Thread.sleep(2000);
	AuditHeadArsLocator.ADDNew().click();
	Thread.sleep(2000);
	AuditHeadArsLocator.CompanyAr().click();
	Thread.sleep(500);
	AuditHeadArsLocator.india().click();
	Thread.sleep(500);
	AuditHeadArsLocator.FinancialYearSA().click();
	Thread.sleep(500);
	AuditHeadArsLocator.FY20232024().click();
	Thread.sleep(500);
	AuditHeadArsLocator.VerticalSA().click();
	Thread.sleep(500);
	AuditHeadArsLocator.NASA().click();
	Thread.sleep(500);
	
	AuditHeadArsLocator.StartDateSA().sendKeys("02-02-2023");
	Thread.sleep(500);
	AuditHeadArsLocator.EndDateSa().sendKeys("08-02-2023");
	Thread.sleep(500);
	AuditHeadArsLocator.ProcessName().sendKeys("Analytica");
	Thread.sleep(500);
	AuditHeadArsLocator.SaveSA().click();
	Thread.sleep(500);
	String Msg1	=AuditHeadArsLocator.SaveSAMsg().getText();
	Thread.sleep(1000);
	if(Msg1.equalsIgnoreCase("Data successfully saved.")) {
		test.log(LogStatus.PASS,  "Message display :-" +Msg1);
	}else {
		test.log(LogStatus.FAIL,  "Message display :-" +Msg1);
	}
	
	Thread.sleep(1000);
	AuditHeadArsLocator.CloseSa().click();
	Thread.sleep(500);
	
	 }
	
	public static void SpecialAuditSchedulingUpload( ExtentTest test) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
	Thread.sleep(1000);
	AuditHeadArsLocator.AuditReporting().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.SpecialAuditScheduling().click();
	Thread.sleep(2000);
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	AuditHeadArsLocator.SpecialAuditStep().click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\ambujs\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	Thread.sleep(3000);
	if(AuditHeadArsLocator.Choosefile().isEnabled()) {
	AuditHeadArsLocator.Choosefile().sendKeys("C:\\Users\\ambujs\\Downloads\\SpecialStepSample (2).xlsx");
	Thread.sleep(500);
	AuditHeadArsLocator.upload().click();
	Thread.sleep(2000);
	String Msg1	=AuditHeadArsLocator.uploadMsg().getText();
	Thread.sleep(1000);
	test.log(LogStatus.PASS, "Meassage Display :-" +Msg1);
	
	}else {
		test.log(LogStatus.FAIL, "  File Already Uploaded");
	}
	 }
	
	public static void AuditDocuments( ExtentTest test) throws InterruptedException
	 {
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
	Thread.sleep(1000);
	AuditHeadArsLocator.AuditReporting().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.AuditDocuments().click();
	Thread.sleep(2000);
	AuditHeadArsLocator.AddNewDA().click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));
	AuditHeadArsLocator.CompanyAD().click();
	Thread.sleep(500);
	AuditHeadArsLocator.indiaAD().click();
	Thread.sleep(500);
	AuditHeadArsLocator.FinanacialYear().click();
	Thread.sleep(500);
	AuditHeadArsLocator.FY().click();
	Thread.sleep(500);
	AuditHeadArsLocator.ChooseFileAD().sendKeys("C:\\Users\\ambujs\\Downloads\\OpenObservationReport (83).xlsx");
	Thread.sleep(500);
	AuditHeadArsLocator.SaveAD().click();
	test.log(LogStatus.PASS,  "Audit Documents Add Successfully");
	Thread.sleep(500);
	getDriver().switchTo().parentFrame();
	AuditHeadArsLocator.ClosePop().click();
	 }
	
	public static void View( ExtentTest test) throws InterruptedException
	 {
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
	Thread.sleep(1000);
	AuditHeadArsLocator.AuditReporting().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.AuditDocuments().click();
	Thread.sleep(2000);
	AuditHeadArsLocator.View().click();
	Thread.sleep(2000);
	
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	AuditHeadArsLocator.ClickDownload().click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\ambujs\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	AuditHeadArsLocator.ViewClose().click();
	Thread.sleep(500);
	 }
	
	public static void ReportGeneration( ExtentTest test) throws InterruptedException
	 {
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

// ----------------Filter ----------------------------------------------
	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[7]/a"))); 
	Thread.sleep(1000);
	AuditHeadArsLocator.ReportGeneration().click();
	Thread.sleep(3000);
	AuditHeadArsLocator.Company().click();
	Thread.sleep(2000);
	AuditHeadArsLocator.allahabad().click();
	Thread.sleep(1000);
	
	AuditHeadArsLocator.FinancialYearRG().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.RG20232024().click();
	Thread.sleep(4000);
	
	AuditHeadArsLocator.FinancialYearRG().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.RG20222023().click();
	Thread.sleep(3000);
	
	String Msg=	AuditHeadArsLocator.FinancialYearText().getText();
	if(Msg.equalsIgnoreCase("2022-2023")) {
		test.log(LogStatus.PASS,  " Filter Working successfully.");
			} else {
				test.log(LogStatus.FAIL, "  Filter not Working successfully.");
			}
		
	// ---------------- Export To Excel ----------------------------------------------
	
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	AuditHeadArsLocator.ExportRG().click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\ambujs\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	// ----------------View Audit Status ----------------------------------------------
	AuditHeadArsLocator.ViewAuditStatus().click();
	Thread.sleep(2000);
	AuditHeadArsLocator.ViewAuditStatusClose().click();
	Thread.sleep(1000);
	test.log(LogStatus.PASS,  " View Audit Status  successfully.");
	
	 }
	
	public static void ViewAuditDetails( ExtentTest test) throws InterruptedException
	 {
		
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

// ----------------View Audit Details - Save ----------------------------------------------
	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[7]/a"))); 
	Thread.sleep(1000);
	AuditHeadArsLocator.ReportGeneration().click();
	Thread.sleep(3000);
	AuditHeadArsLocator.Company().click();
	Thread.sleep(2000);
	AuditHeadArsLocator.allahabad().click();
	Thread.sleep(1000);
	
	AuditHeadArsLocator.FinancialYearRG().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.RG20232024().click();
	Thread.sleep(4000);
	
	AuditHeadArsLocator.FinancialYearRG().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.RG20222023().click();
	Thread.sleep(3000);
	
	AuditHeadArsLocator.ViewAuditDetails().click();
	Thread.sleep(3000);
	
	AuditHeadArsLocator.ChooseFileRG().sendKeys("C:\\Users\\ambujs\\Downloads\\AuditStatusReport (31).xlsx");
	Thread.sleep(1000);
	AuditHeadArsLocator.Remarks().sendKeys("remark");
	Thread.sleep(2000);
	AuditHeadArsLocator.SaveVAD().click();
	Thread.sleep(3000);
	String Msg1	=AuditHeadArsLocator.SaveVADMsg().getText();
	Thread.sleep(1000);
	test.log(LogStatus.PASS, "Meassage Display :-" +Msg1);
	
	// ----------------View Audit Details - Draft ----------------------------------------------
	
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	AuditHeadArsLocator.Draft().click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\ambujs\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "Draft -  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	// ----------------View Audit Details - Generate Report ----------------------------------------------
	
			File dir2 = new File("C:\\Users\\ambujs\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(500);
			AuditHeadArsLocator.GenerateReport().click();		//Exporting (Downloading) file
			Thread.sleep(1000);
			String Msg =getDriver().switchTo().alert().getText();
			Thread.sleep(1000);
			getDriver().switchTo().alert().dismiss();
			test.log(LogStatus.PASS,  " Message Display :- " +Msg);
			Thread.sleep(3000);
			
			File dir3 = new File("C:\\Users\\ambujs\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "Generate Report : - File downloaded successfully.");
			} else {
				test.log(LogStatus.FAIL, "Generate Report :-  File does not downloaded.");
			}

	 }
	
	public static void DraftObservationListing( ExtentTest test) throws InterruptedException
	 {
		
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

// ----------------Draft Observation Listing - Save ----------------------------------------------
	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[7]/a"))); 
	Thread.sleep(1000);
	AuditHeadArsLocator.ReportGeneration().click();
	Thread.sleep(3000);
	//AuditHeadArsLocator.Company().click();
	Thread.sleep(2000);
	//AuditHeadArsLocator.allahabad().click();
	Thread.sleep(1000);
	
	AuditHeadArsLocator.FinancialYearRG().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.RG20232024().click();
	Thread.sleep(4000);
	
	AuditHeadArsLocator.FinancialYearRG().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.RG20222023().click();
	Thread.sleep(3000);
	
	AuditHeadArsLocator.ViewAuditDetails().click();
	Thread.sleep(3000);
	AuditHeadArsLocator.DraftObservationListing().click();
	Thread.sleep(3000);
	AuditHeadArsLocator.Observation().clear();
	Thread.sleep(1000);
	AuditHeadArsLocator.Observation().sendKeys("Observation 11");
	Thread.sleep(3000);
	AuditHeadArsLocator.ObservationList_CheckBox().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.ObservationList_Save().click();
	Thread.sleep(3000);
	String Msg1	=AuditHeadArsLocator.ObservationList_SaveMsg().getText();
	Thread.sleep(1000);
	test.log(LogStatus.PASS, "Meassage Display :-" +Msg1);
	
	// ----------------Draft Observation Listing- Export ----------------------------------------------
	
			File dir = new File("C:\\Users\\ambujs\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(500);
			AuditHeadArsLocator.ObservationList_Export().click();		//Exporting (Downloading) file
			
			Thread.sleep(3000);//C://Users//jiya//Downloads//
			File dir1 = new File("C:\\Users\\ambujs\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "  File downloaded successfully.");
			} else {
				test.log(LogStatus.FAIL, "  File does not downloaded.");
			}
			
			// ----------------Draft Observation Listing- View ----------------------------------------------
			
			AuditHeadArsLocator.ViewAuditDetail().click();
			Thread.sleep(3000);
			AuditHeadArsLocator.ViewAuditDetailclose().click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS,  "  View Audit Detail successfully.");
			
			// ----------------Draft Observation Listing- Delete ----------------------------------------------
			AuditHeadArsLocator.Delete().click();
			Thread.sleep(3000);
			String Msg =getDriver().switchTo().alert().getText();
			Thread.sleep(1000);
			getDriver().switchTo().alert().dismiss();
			test.log(LogStatus.PASS,  " Message Display :- " +Msg);
			Thread.sleep(3000);
			// ----------------Draft Observation Listing- Back ----------------------------------------------

			if(AuditHeadArsLocator.BackDOR().isEnabled()) {
				
				AuditHeadArsLocator.BackDOR().click();
				test.log(LogStatus.PASS,  "  Back Button wroking  successfully.");
			} else {
				test.log(LogStatus.FAIL, "   Back Button not wroking  successfully.");
			}	
			Thread.sleep(3000);	
	 }
	
	public static void HistoricalObservation( ExtentTest test) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[8]/a"))); 
	Thread.sleep(1000);
	AuditHeadArsLocator.PastObservations().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.UploadHistoricalObservations().click();
	Thread.sleep(3000);
	
	// ----------------Historical Observation- Sample Format for Historical Observation ----------------------------------------------
	
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	AuditHeadArsLocator.FormatHistoricalObservation().click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\ambujs\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  " Sample Format for Historical Observation :- File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	// ----------------Historical Observation- File Upload ----------------------------------------------

	AuditHeadArsLocator.fileUploadHO().sendKeys("D:\\Desktop - Copy\\4octhistorical.xlsx");
	Thread.sleep(1000);
	AuditHeadArsLocator.UploadHO().click();
	try {
	String Msg2=AuditHeadArsLocator.UploadHOMsg().getText();
	Thread.sleep(1000);
	test.log(LogStatus.PASS, Msg2);
	}catch(Exception e) {
		
	}
	
	File dir2 = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	AuditHeadArsLocator.ClickDwonload().click();		//Exporting (Downloading) file
	Thread.sleep(1000);
	
	File dir3 = new File("C:\\Users\\ambujs\\Downloads");
	File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents1.length < allFilesNew1.length) {
		test.log(LogStatus.PASS,  "Generate Report : - File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "Generate Report :-  File does not downloaded.");
	}

	 }
	
	public static void ViewHistoricalObservations( ExtentTest test) throws InterruptedException
	 {
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[8]/a"))); 
	Thread.sleep(1000);
	AuditHeadArsLocator.PastObservations().click();
	Thread.sleep(1000);
	AuditHeadArsLocator.ViewHistoricalObservations().click();
	Thread.sleep(3000);
	// ----------------View Observations ----------------------------------------------

	AuditHeadArsLocator.ViewAuditt().click();
	Thread.sleep(3000);
	String Msg3=AuditHeadArsLocator.ViewAuditText().getText();
	Thread.sleep(1000);
	
		test.log(LogStatus.PASS, "Audit Step View Successfully" +Msg3);
	
	Thread.sleep(1000);
	
	AuditHeadArsLocator.ViewAuditclose().click();
	Thread.sleep(3000);
	// ----------------Detailed Observation ----------------------------------------------

	AuditHeadArsLocator.ObservationCount().click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("DetObsshowdetails"));	//Wait until frame get visible and switch to it.

	AuditHeadArsLocator.ObservationViewAuditStep().click();
	Thread.sleep(1000);
	String Msg2=AuditHeadArsLocator.ObservationViewAuditStepT().getText();
	Thread.sleep(2000);
	
	AuditHeadArsLocator.ObservationCloseAuditStep().click();
	Thread.sleep(1000);
	test.log(LogStatus.PASS, Msg2);
	AuditHeadArsLocator.DetailedObservationView().click();
	Thread.sleep(1000);
	String Msg4=AuditHeadArsLocator.DetailedObservationViewText().getText();
	Thread.sleep(1000);
	test.log(LogStatus.PASS, Msg4);
	AuditHeadArsLocator.DetailedObservationViewClose().click();
	Thread.sleep(1000);
	getDriver().switchTo().defaultContent();
	AuditHeadArsLocator.DetailedObservationClose().click();
	Thread.sleep(2000);
	AuditHeadArsLocator.ClickDashboard().click();
	Thread.sleep(3000);
	
	 }
	
	public static void HighRisk( ExtentTest test ,String RiskType,String type) throws InterruptedException
	 {
		
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);


	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	if(type.equalsIgnoreCase("open")) {
	Thread.sleep(1000);
	AuditHeadArsLocator.ClickHighOpen().click();
	Thread.sleep(2000);
	
	
	}else {
		
		Thread.sleep(5000);
		AuditHeadArsLocator.ClickHighClose().click();
		Thread.sleep(8000);
		
	}
	
	String FinanceAccounts = AuditHeadArsLocator.FinanceAccountsHigh().getText();		//Reading the Closed Timely value of Human Resource
	FinanceAccounts = FinanceAccounts.replaceAll(" ","");									//Removing all white spaces from string. 
	int Finance_Accounts = Integer.parseInt(FinanceAccounts);	
	
	AuditHeadArsLocator.FinanceAccountsHigh().click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

	Thread.sleep(1000);
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	
	AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);
	File dir1 = new File("C:\\Users\\ambujs\\Downloads");

	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
	Thread.sleep(3000);
	
	AuditHeadArsLocator.RiskView().click();		
	Thread.sleep(3000);
	AuditHeadArsLocator.RiskViewClose().click();		
	Thread.sleep(8000);
	
	test.log(LogStatus.PASS,  "  View successfully.");
	
	String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
	String[] bits = s1.split(" ");									//Splitting the String
	String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
	
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		Thread.sleep(1000);
		s1 = AuditHeadArsLocator.readTotalItems().getText();
		bits = s1.split(" ");										//Splitting the String
		itomsCount = bits[bits.length - 2];
	}
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		itomsCount = "0";
	}
	int count1 = Integer.parseInt(itomsCount);
	
	if(count1 == Finance_Accounts)
	{
		test.log(LogStatus.PASS, "'"+RiskType+"' Risk Count matches to number of items from grid.");
		test.log(LogStatus.PASS, "'"+RiskType+"'  Risk  Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
	}
	else
	{
		test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count doesn't matches to number of items from grid.");
		test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
	}
	
	
	/*AuditHeadArsLocator.SelectPeriod().click();		
	Thread.sleep(3000);
	AuditHeadArsLocator.PeriodAnnually().click();		
	Thread.sleep(3000);
	if(AuditHeadArsLocator.ApplyFilter().isEnabled()) {
	AuditHeadArsLocator.ApplyFilter().click();		
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "  Filter Working successfully.");
	}else {
		test.log(LogStatus.PASS,  "  Filter not Working");
	}*/
	getDriver().switchTo().parentFrame();
	AuditHeadArsLocator.ClosePopRisk().click();		
	
	
	Thread.sleep(3000);
	AuditHeadArsLocator.ClickDashboard().click();		
	Thread.sleep(3000);
	 }
	
	public static void MediumRisk( ExtentTest test ,String RiskType,String type) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	if(type.equalsIgnoreCase("open")) {
	Thread.sleep(3000);
	AuditHeadArsLocator.ClickMediumOpen().click();
	Thread.sleep(4000);
	
	
	}else {
		
		Thread.sleep(3000);
		AuditHeadArsLocator.ClickMediumClose().click();
		Thread.sleep(4000);
		
	}
	
	String FinanceAccounts = AuditHeadArsLocator.FinanceAccountsHigh().getText();		//Reading the Closed Timely value of Human Resource
	FinanceAccounts = FinanceAccounts.replaceAll(" ","");									//Removing all white spaces from string. 
	int Finance_Accounts = Integer.parseInt(FinanceAccounts);	
	
	AuditHeadArsLocator.FinanceAccountsHigh().click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

	Thread.sleep(3000);
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	
	AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);
	File dir1 = new File("C:\\Users\\ambujs\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
	Thread.sleep(3000);
	
	AuditHeadArsLocator.RiskView().click();		
	Thread.sleep(3000);
	AuditHeadArsLocator.RiskViewClose().click();		
	Thread.sleep(3000);
	
	test.log(LogStatus.PASS,  "  View successfully.");
	
	String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
	String[] bits = s1.split(" ");									//Splitting the String
	String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
	
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		Thread.sleep(1000);
		s1 = AuditHeadArsLocator.readTotalItems().getText();
		bits = s1.split(" ");										//Splitting the String
		itomsCount = bits[bits.length - 2];
	}
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		itomsCount = "0";
	}
	int count1 = Integer.parseInt(itomsCount);
	
	if(count1 == Finance_Accounts)
	{
		test.log(LogStatus.PASS, "'"+RiskType+"' Risk Count matches to number of items from grid.");
		test.log(LogStatus.PASS, "'"+RiskType+"'  Risk  Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
	}
	else
	{
		test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count doesn't matches to number of items from grid.");
		test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
	}
	
	
	/*AuditHeadArsLocator.SelectPeriod().click();		
	Thread.sleep(4000);
	AuditHeadArsLocator.PeriodAnnually().click();		
	Thread.sleep(3000);
	if(AuditHeadArsLocator.ApplyFilter().isEnabled()) {
	AuditHeadArsLocator.ApplyFilter().click();		
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "  Filter Working successfully.");
	}else {
		test.log(LogStatus.PASS,  "  Filter not Working");
	}*/
	getDriver().switchTo().parentFrame();
	AuditHeadArsLocator.ClosePopRisk().click();		
	
		
	Thread.sleep(8000);
	AuditHeadArsLocator.ClickDashboard().click();		
	Thread.sleep(3000);
	 }
	
	
	public static void LowRisk( ExtentTest test ,String RiskType,String type) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	if(type.equalsIgnoreCase("open")) {
	Thread.sleep(3000);
	AuditHeadArsLocator.ClickLowOpen().click();
	Thread.sleep(3000);
	
	
	}else {
		
		Thread.sleep(3000);
		AuditHeadArsLocator.ClickLowClose().click();
		Thread.sleep(4000);
		
	}
	
	String FinanceAccounts = AuditHeadArsLocator.FinanceAccountsHigh().getText();		//Reading the Closed Timely value of Human Resource
	FinanceAccounts = FinanceAccounts.replaceAll(" ","");									//Removing all white spaces from string. 
	int Finance_Accounts = Integer.parseInt(FinanceAccounts);	
	
	AuditHeadArsLocator.FinanceAccountsHigh().click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

	Thread.sleep(4000);
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	
	AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);
	File dir1 = new File("C:\\Users\\ambujs\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
	Thread.sleep(3000);
	
	AuditHeadArsLocator.RiskView().click();		
	Thread.sleep(3000);
	AuditHeadArsLocator.RiskViewClose().click();		
	Thread.sleep(3000);
	
	test.log(LogStatus.PASS,  "  View successfully.");
	
	String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
	String[] bits = s1.split(" ");									//Splitting the String
	String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
	
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		Thread.sleep(1000);
		s1 = AuditHeadArsLocator.readTotalItems().getText();
		bits = s1.split(" ");										//Splitting the String
		itomsCount = bits[bits.length - 2];
	}
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		itomsCount = "0";
	}
	int count1 = Integer.parseInt(itomsCount);
	
	if(count1 == Finance_Accounts)
	{
		test.log(LogStatus.PASS, "'"+RiskType+"' Risk Count matches to number of items from grid.");
		test.log(LogStatus.PASS, "'"+RiskType+"'  Risk  Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
	}
	else
	{
		test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count doesn't matches to number of items from grid.");
		test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
	}
	
	
	/*AuditHeadArsLocator.SelectPeriod().click();		
	Thread.sleep(5000);
	AuditHeadArsLocator.PeriodAnnually().click();		
	Thread.sleep(3000);
	if(AuditHeadArsLocator.ApplyFilter().isEnabled()) {
	AuditHeadArsLocator.ApplyFilter().click();		
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "  Filter Working successfully.");
	}else {
		test.log(LogStatus.PASS,  "  Filter not Working");
	}*/
	getDriver().switchTo().parentFrame();
	AuditHeadArsLocator.ClosePopRisk().click();		
	
		
	Thread.sleep(3000);
	AuditHeadArsLocator.ClickDashboard().click();		
	Thread.sleep(3000);
	 }
	
	public static void CategoryOpen(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (50));
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,800)");	
	
	
	Thread.sleep(1500);
	int ProcessInefficiency_Open = Integer.parseInt(AuditHeadLocatorARS.ProcessInefficiencyOpen().getText());	//Reading value of 'After Due Date'
	AuditHeadLocatorARS.ProcessInefficiencyOpen().click();								//CLicking on 'Not Completed' count
	
	Thread.sleep(500);
	
	int high = Integer.parseInt(AuditHeadLocatorARS.readHigh().getText());		//reading High risk count.
	int medium = Integer.parseInt(AuditHeadLocatorARS.readMedium().getText());	//reading Medium risk count.
	int low = Integer.parseInt(AuditHeadLocatorARS.readLow().getText());			//reading Low risk count.
	Thread.sleep(500);
	int total = high + medium + low;
	Thread.sleep(500);
	if(ProcessInefficiency_Open == total)
	{
		//test.log(LogStatus.PASS, "'Process Inefficiency Open' Category Count matches to sum of all risked Categorirs.");
		test.log(LogStatus.PASS, "Total 'Process Inefficiency' Open Category : "+total);
	}
	else
	{
		//test.log(LogStatus.FAIL, "'Process Inefficiency Open' Category Count doesn't matches to sum of all risked Categorirs.");
		test.log(LogStatus.FAIL, "Total 'Closed Timely' Compliances : "+total+" | Total Sum : "+ProcessInefficiency_Open);
	}
	
	CategoryWise(driver, test, "High", high);
	Thread.sleep(3000);
	CategoryWise(driver, test, "Medium", medium);
	Thread.sleep(3000);
	CategoryWise(driver, test, "Low", low);
	Thread.sleep(3000);
	
	////ArsLocators.ClickDashboard(driver).click();		
	Thread.sleep(3000);
	 }
	public static void CategoryClose1( ExtentTest test) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("window.scrollBy(0,500)");	
	
	
	Thread.sleep(1500);
	int ProcessInefficiency_Close = Integer.parseInt(AuditHeadArsLocator.ProcessInefficiencyClose().getText());	//Reading value of 'After Due Date'
	AuditHeadArsLocator.ProcessInefficiencyClose().click();								//CLicking on 'Not Completed' count
	
	Thread.sleep(5000);
	
	int high = Integer.parseInt(AuditHeadArsLocator.readHigh().getText());		//reading High risk count.
	int medium = Integer.parseInt(AuditHeadArsLocator.readMedium().getText());	//reading Medium risk count.
	int low = Integer.parseInt(AuditHeadArsLocator.readLow().getText());			//reading Low risk count.
	Thread.sleep(5000);
	int total = high + medium + low;
	Thread.sleep(5000);
	if(ProcessInefficiency_Close == total)
	{
		test.log(LogStatus.PASS, "'Process Inefficiency Close' Category Count matches to sum of all risked Categorirs.");
		test.log(LogStatus.PASS, "Total 'Process Inefficiency' Close Category : "+total);
	}
	else
	{
		test.log(LogStatus.FAIL, "'Process Inefficiency Close' Category Count doesn't matches to sum of all risked Categorirs.");
		test.log(LogStatus.FAIL, "Total 'Process Inefficiency' Close Category : "+total+" | Total Sum : "+ProcessInefficiency_Close);
	}
	
	CategoryWise1( test, "High", high);
	Thread.sleep(3000);
	CategoryWise1( test, "Medium", medium);
	Thread.sleep(3000);
	CategoryWise1( test, "Low", low);
	Thread.sleep(3000);
	AuditHeadArsLocator.ClickDashboard().click();		
	Thread.sleep(3000);
	 }
	
	
	public static void CategoryWise( WebDriver driver, ExtentTest test ,String risk,int riskCount) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	if(risk.equalsIgnoreCase("High"))
	{
		AuditHeadArsLocator.readHigh().click();						//Clicking on High value of Pie Chart of 'Not Completed'.
	}
	else if(risk.equalsIgnoreCase("Medium"))
	{
		AuditHeadArsLocator.readMedium().click();						//Clicking on Medium value of Pie Chart of 'Not Completed'.
	}
	else if(risk.equalsIgnoreCase("Low"))
	{
		AuditHeadArsLocator.readLow().click();						//Clicking on Low value of Pie Chart of 'Not Completed'.
	}
	
	Thread.sleep(5000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

	Thread.sleep(5000);
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	
	AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);
	File dir1 = new File("C:\\Users\\ambujs\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
	Thread.sleep(3000);
	
	AuditHeadArsLocator.CategoryView().click();		
	Thread.sleep(3000);
	AuditHeadArsLocator.RiskViewClose().click();		
	Thread.sleep(3000);
	
	test.log(LogStatus.PASS,  "  View successfully.");
	
	String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
	String[] bits = s1.split(" ");									//Splitting the String
	String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
	
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		Thread.sleep(1000);
		s1 = AuditHeadArsLocator.readTotalItems().getText();
		bits = s1.split(" ");										//Splitting the String
		itomsCount = bits[bits.length - 2];
	}
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		itomsCount = "0";
	}
	int count1 = Integer.parseInt(itomsCount);
	
	if(count1 == riskCount)
	{
		test.log(LogStatus.PASS, "'"+risk+"' Risk Count matches to number of items from grid.");
		test.log(LogStatus.PASS, "'"+risk+"'  Risk  Count = "+ riskCount + " | Total no of items from grid = "+ count1);
	}
	else
	{
		test.log(LogStatus.FAIL, "'"+risk+"' Risk Count doesn't matches to number of items from grid.");
		test.log(LogStatus.FAIL, "'"+risk+"' Risk Count = "+ riskCount + " | Total no of items from grid = "+ count1);
	}
	
	
	/*AuditHeadArsLocator.SelectPeriod().click();		
	Thread.sleep(1000);
	AuditHeadArsLocator.PeriodAnnually().click();		
	Thread.sleep(3000);
	if(AuditHeadArsLocator.ApplyFilter().isEnabled()) {
	AuditHeadArsLocator.ApplyFilter().click();		
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "  Filter Working successfully.");
	}else {
		test.log(LogStatus.PASS,  "  Filter not Working");
	}*/
	getDriver().switchTo().parentFrame();
	AuditHeadArsLocator.ClosePopRisk().click();		
	
		
	Thread.sleep(3000);
	
	 }
	
	public static void ProcessHigh( ExtentTest test) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("window.scrollBy(0,1000)");	
	Thread.sleep(2000);
	
	AuditHeadArsLocator.ProcessHigh().click();
	Thread.sleep(3000);
	
	
		int Process_High = Integer.parseInt(AuditHeadArsLocator.ProcessHighOpen().getText());	
		Thread.sleep(2000);
		AuditHeadArsLocator.ProcessHighOpen().click();						
		Thread.sleep(3000);
		int open = Integer.parseInt(AuditHeadArsLocator.ProcessOpen().getText());		//reading High risk count.
		Thread.sleep(5000);
		int close = Integer.parseInt(AuditHeadArsLocator.ProcessClose().getText());	//reading Medium risk count.
		Thread.sleep(5000);
		int total = open + close;
		Thread.sleep(5000);
		if(Process_High == total)
		{
			test.log(LogStatus.PASS, "'Finance and Accounts High' Process Count matches to sum of all  Categorirs.");
			test.log(LogStatus.PASS, "Total 'Finance and Accounts High' Risk : "+total);
		}
		else
		{
			test.log(LogStatus.FAIL, "'Finance and Accounts High' Process Count doesn't matches to sum of all  Categorirs.");
			test.log(LogStatus.FAIL, "Total ''Finance and Accounts High' Risk : "+total+" | Total Sum : "+Process_High);
		}
		
		ProcessCategories(test, "open", open);
		Thread.sleep(3000);
		ProcessCategories(test, "close", close);
		Thread.sleep(3000);
		
		
		AuditHeadArsLocator.ClickDashboard().click();		
		Thread.sleep(3000);
	
	
	 }
	
	public static void ProcessMedium( ExtentTest test) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("window.scrollBy(0,1300)");	
	Thread.sleep(2000);
	
	AuditHeadArsLocator.ProcessMedium().click();
	Thread.sleep(3000);

	
		int Process_Medium = Integer.parseInt(AuditHeadArsLocator.ProcessMediumOpen().getText());	
		Thread.sleep(2000);
		AuditHeadArsLocator.ProcessMediumOpen().click();						
		Thread.sleep(3000);
		int open = Integer.parseInt(AuditHeadArsLocator.ProcessOpen().getText());		//reading High risk count.
		Thread.sleep(5000);
		int close = Integer.parseInt(AuditHeadArsLocator.ProcessClose().getText());	//reading Medium risk count.
		Thread.sleep(5000);
		int total = open + close;
		Thread.sleep(5000);
		if(Process_Medium == total)
		{
			test.log(LogStatus.PASS, "'Finance and Accounts Medium' Process Count matches to sum of all  Categorirs.");
			test.log(LogStatus.PASS, "Total 'Finance and Accounts Medium' Risk : "+total);
		}
		else
		{
			test.log(LogStatus.FAIL, "'Finance and Accounts Medium' Process Count doesn't matches to sum of all  Categorirs.");
			test.log(LogStatus.FAIL, "Total ''Finance and Accounts Medium' Risk : "+total+" | Total Sum : "+Process_Medium);
		}
		
		ProcessCategories(test, "open", open);
		Thread.sleep(3000);
		ProcessCategories(test, "close", close);
		Thread.sleep(3000);
		
		
		AuditHeadArsLocator.ClickDashboard().click();		
		Thread.sleep(3000);
	
	
	 }
	
	public static void ProcessLow( ExtentTest test) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("window.scrollBy(0,1000)");	
	Thread.sleep(2000);
	
	AuditHeadArsLocator.ProcessLow().click();
	Thread.sleep(3000);
	
		int Process_Low = Integer.parseInt(AuditHeadArsLocator.ProcessLowOpen().getText());	
		Thread.sleep(2000);
		AuditHeadArsLocator.ProcessLowOpen().click();						
		Thread.sleep(3000);
		int open = Integer.parseInt(AuditHeadArsLocator.ProcessOpen().getText());		//reading High risk count.
		Thread.sleep(5000);
		int close = Integer.parseInt(AuditHeadArsLocator.ProcessClose().getText());	//reading Medium risk count.
		Thread.sleep(5000);
		int total = open + close;
		Thread.sleep(5000);
		if(Process_Low == total)
		{
			test.log(LogStatus.PASS, "'Finance and Accounts Low' Process Count matches to sum of all  Categorirs.");
			test.log(LogStatus.PASS, "Total 'Finance and Accounts Low' Risk : "+total);
		}
		else
		{
			test.log(LogStatus.FAIL, "'Finance and Accounts Low' Process Count doesn't matches to sum of all  Categorirs.");
			test.log(LogStatus.FAIL, "Total ''Finance and Accounts Low' Risk : "+total+" | Total Sum : " +Process_Low);
		}
		
		ProcessCategories(test, "open", open);
		Thread.sleep(3000);
		ProcessCategories(test, "close", close);
		Thread.sleep(3000);
		
		
		AuditHeadArsLocator.ClickDashboard().click();		
		Thread.sleep(3000);
	
	
	 }
	
	
	public static void ProcessCategories( ExtentTest test ,String Category,int CategoryCount) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	if(Category.equalsIgnoreCase("open"))
	{
		AuditHeadArsLocator.ProcessOpen().click();						//Clicking on High value of Pie Chart of 'Not Completed'.
	}
	else if(Category.equalsIgnoreCase("close"))
	{
		AuditHeadArsLocator.ProcessClose().click();						//Clicking on Medium value of Pie Chart of 'Not Completed'.
	}
	
	Thread.sleep(1000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

	Thread.sleep(5000);
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	
	AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);
	File dir1 = new File("C:\\Users\\ambujs\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
	Thread.sleep(3000);
	
	AuditHeadArsLocator.RiskView().click();		
	Thread.sleep(3000);
	AuditHeadArsLocator.RiskViewClose().click();		
	Thread.sleep(3000);
	
	test.log(LogStatus.PASS,  "  View successfully.");
	
	String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
	String[] bits = s1.split(" ");									//Splitting the String
	String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
	
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		Thread.sleep(1000);
		s1 = AuditHeadArsLocator.readTotalItems().getText();
		bits = s1.split(" ");										//Splitting the String
		itomsCount = bits[bits.length - 2];
	}
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		itomsCount = "0";
	}
	int count1 = Integer.parseInt(itomsCount);
	
	if(count1 == CategoryCount)
	{
		test.log(LogStatus.PASS, "'"+Category+"' Category Count matches to number of items from grid.");
		test.log(LogStatus.PASS, "'"+Category+"'  Risk  Count = "+ CategoryCount + " | Total no of items from grid = "+ count1);
	}
	else
	{
		test.log(LogStatus.FAIL, "'"+Category+"' Category Count doesn't matches to number of items from grid.");
		test.log(LogStatus.FAIL, "'"+Category+"' Category Count = "+ CategoryCount + " | Total no of items from grid = "+ count1);
	}
	
	
	/*AuditHeadArsLocator.SelectPeriod().click();		
	Thread.sleep(5000);
	AuditHeadArsLocator.PeriodAnnually().click();		
	Thread.sleep(3000);
	if(AuditHeadArsLocator.ApplyFilter().isEnabled()) {
	AuditHeadArsLocator.ApplyFilter().click();		
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "  Filter Working successfully.");
	}else {
		test.log(LogStatus.PASS,  "  Filter not Working");
	}*/
	getDriver().switchTo().parentFrame();
	AuditHeadArsLocator.ClosePopRisk().click();		
	
		
	Thread.sleep(3000);
	
	 }
	
	public static void AgingGreatercr90( ExtentTest test ) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
	/*	AuditHeadArsLocator.btnminimize().click();						//Clicking on High value of Pie Chart of 'Not Completed'.
		Thread.sleep(1000);
		AuditHeadArsLocator.SelectFinancialYear1().click();		
		Thread.sleep(1000);
		AuditHeadArsLocator.SelectAll().click();
		Thread.sleep(1000);
		AuditHeadArsLocator.SelectAllOk().click();
		Thread.sleep(2000);
		AuditHeadArsLocator.ApplyFilters().click();
		Thread.sleep(3000);
		*/
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1800)");	
		Thread.sleep(3000);
		
		int Aging_90 = Integer.parseInt(AuditHeadArsLocator.Click90days().getText());	
		Thread.sleep(2000);
		AuditHeadArsLocator.Click90days().click();						
		Thread.sleep(3000);
		
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
		Thread.sleep(3000);
		
		AuditHeadArsLocator.RiskView().click();		
		Thread.sleep(3000);
		AuditHeadArsLocator.RiskViewClose().click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = AuditHeadArsLocator.readTotalItems().getText();
			bits = s1.split(" ");										//Splitting the String
			itomsCount = bits[bits.length - 2];
		}
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			itomsCount = "0";
		}
		int count1 = Integer.parseInt(itomsCount);
		
		if(count1 == Aging_90)
		{
			test.log(LogStatus.PASS, "'  >90 days Aging Count matches to number of items from grid.");
			test.log(LogStatus.PASS, "'  >90 days Dashboard  Count = "+ Aging_90 + " | Total no of items from grid = "+ count1);
		}
		else
		{
			test.log(LogStatus.FAIL, "'  >90 days Aging Count doesn't matches to number of items from grid.");
			test.log(LogStatus.FAIL, "'  >90 days Dashboard Count = "+ Aging_90 + " | Total no of items from grid = "+ count1);
		}
		
		Thread.sleep(1000);
	
		getDriver().switchTo().parentFrame();
		AuditHeadArsLocator.ClosePopRisk().click();		
		
			
		Thread.sleep(3000);
		AuditHeadArsLocator.ClickDashboard().click();		
		Thread.sleep(3000);
		
		
	 }
	
	
	public static void AgingNotDue1( ExtentTest test ) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
	
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1800)");	
		Thread.sleep(3000);
		
		int Aging_NotDue = Integer.parseInt(AuditHeadArsLocator.ClickNotDue().getText());	
		Thread.sleep(2000);
		AuditHeadArsLocator.ClickNotDue().click();						
		Thread.sleep(3000);
		
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
		Thread.sleep(3000);
		
		AuditHeadArsLocator.RiskView().click();		
		Thread.sleep(3000);
		AuditHeadArsLocator.RiskViewClose().click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = AuditHeadArsLocator.readTotalItems().getText();
			bits = s1.split(" ");										//Splitting the String
			itomsCount = bits[bits.length - 2];
		}
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			itomsCount = "0";
		}
		int count1 = Integer.parseInt(itomsCount);
		
		if(count1 == Aging_NotDue)
		{
			test.log(LogStatus.PASS, "'  Not Due Aging Count matches to number of items from grid.");
			test.log(LogStatus.PASS, "'  Not Due Dashboard  Count = "+ Aging_NotDue + " | Total no of items from grid = "+ count1);
		}
		else
		{
			test.log(LogStatus.FAIL, "'  Not Due Aging Count doesn't matches to number of items from grid.");
			test.log(LogStatus.FAIL, "'  Not Due Dashboard Count = "+ Aging_NotDue + " | Total no of items from grid = "+ count1);
		}
		
		Thread.sleep(1000);
	
		getDriver().switchTo().parentFrame();
		AuditHeadArsLocator.ClosePopRisk().click();		
		
			
		Thread.sleep(3000);
		AuditHeadArsLocator.ClickDashboard().click();		
		Thread.sleep(3000);
		
		
	 }
	
	
	public static void AuditCommitteeOpen1( ExtentTest test ) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
	
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,2300)");	
		Thread.sleep(3000);
		
		int AuditCommittee_Open = Integer.parseInt(AuditHeadArsLocator.AuditCommitteeOpen().getText());	
		Thread.sleep(2000);
		AuditHeadArsLocator.AuditCommitteeOpen().click();						
		Thread.sleep(3000);
		
		
		Thread.sleep(5000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(3000);
		File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
		Thread.sleep(3000);
		
		AuditHeadArsLocator.RiskView().click();		
		Thread.sleep(3000);
		AuditHeadArsLocator.RiskViewClose().click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = AuditHeadArsLocator.readTotalItems().getText();
			bits = s1.split(" ");										//Splitting the String
			itomsCount = bits[bits.length - 2];
		}
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			itomsCount = "0";
		}
		int count1 = Integer.parseInt(itomsCount);
		
		if(count1 == AuditCommittee_Open)
		{
			test.log(LogStatus.PASS, "'  Audit Committee Open Count matches to number of items from grid.");
			test.log(LogStatus.PASS, "' Audit Committee Open Dashboard  Count = "+ AuditCommittee_Open + " | Total no of items from grid = "+ count1);
		}
		else
		{
			test.log(LogStatus.FAIL, "'  Audit Committee Open Count doesn't matches to number of items from grid.");
			test.log(LogStatus.FAIL, "'  Audit Committee Open Dashboard Count = "+ AuditCommittee_Open + " | Total no of items from grid = "+ count1);
		}
		
		Thread.sleep(1000);
	
		getDriver().switchTo().parentFrame();
		AuditHeadArsLocator.ClosePopRisk().click();		
		
			
		Thread.sleep(3000);
		AuditHeadArsLocator.ClickDashboard().click();		
		Thread.sleep(3000);
		
		
	 }
	
	public static void AuditCommitteeClose1( ExtentTest test ) throws InterruptedException
	 {
		
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);


	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
	
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,2300)");	
		Thread.sleep(3000);
		
		int AuditCommittee_close = Integer.parseInt(AuditHeadArsLocator.AuditCommitteeClose().getText());	
		Thread.sleep(2000);
		AuditHeadArsLocator.AuditCommitteeClose().click();						
		Thread.sleep(3000);
		
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
		Thread.sleep(3000);
		
		AuditHeadArsLocator.RiskView().click();		
		Thread.sleep(3000);
		AuditHeadArsLocator.RiskViewClose().click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = AuditHeadArsLocator.readTotalItems().getText();
			bits = s1.split(" ");										//Splitting the String
			itomsCount = bits[bits.length - 2];
		}
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			itomsCount = "0";
		}
		int count1 = Integer.parseInt(itomsCount);
		
		if(count1 == AuditCommittee_close)
		{
			test.log(LogStatus.PASS, "'  Audit Committee Close Count matches to number of items from grid.");
			test.log(LogStatus.PASS, "' Audit Committee Close Dashboard  Count = "+ AuditCommittee_close + " | Total no of items from grid = "+ count1);
		}
		else
		{
			test.log(LogStatus.FAIL, "'  Audit Committee Close Count doesn't matches to number of items from grid.");
			test.log(LogStatus.FAIL, "'  Audit Committee Close Dashboard Count = "+ AuditCommittee_close + " | Total no of items from grid = "+ count1);
		}
		
		Thread.sleep(1000);
	
		getDriver().switchTo().parentFrame();
		AuditHeadArsLocator.ClosePopRisk().click();		
		
			
		Thread.sleep(3000);
		AuditHeadArsLocator.ClickDashboard().click();		
		Thread.sleep(3000);
		
		
	 }
	
	public static void AuditTrackerPlanned( ExtentTest test ) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
	
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,2500)");	
		Thread.sleep(3000);
		
		
		AuditHeadArsLocator.AuditTrackerPlanned().click();						
		Thread.sleep(3000);
		//Thread.sleep(1000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		Thread.sleep(3000);
		getDriver().switchTo().parentFrame();
		AuditHeadArsLocator.ClosePopRisk().click();		
		
			
		Thread.sleep(3000);
		AuditHeadArsLocator.ClickDashboard().click();		
		Thread.sleep(3000);
		
		
	 }
	
	public static void AuditTrackerActual( ExtentTest test ) throws InterruptedException
	 {
		
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);


	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
	
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,2500)");	
		Thread.sleep(3000);
		
		
		AuditHeadArsLocator.AuditTrackerActual().click();						
		Thread.sleep(3000);
		//Thread.sleep(1000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		Thread.sleep(3000);
		getDriver().switchTo().parentFrame();
		AuditHeadArsLocator.ClosePopRisk().click();		
		
			
		Thread.sleep(3000);
		AuditHeadArsLocator.ClickDashboard().click();		
		Thread.sleep(3000);
		
		
	 }
	
	
	public static void AuditStatus1( ExtentTest test ) throws InterruptedException
	 {

		
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
	
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,2800)");	
		Thread.sleep(3000);
		
		
		AuditHeadArsLocator.AuditStatusView().click();						
		Thread.sleep(3000);
		
		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		AuditHeadArsLocator.AuditStatusExport().click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		File dir2 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(500);
		AuditHeadArsLocator.DraftClosure().click();		//Exporting (Downloading) file
		Thread.sleep(1000);
		
		File dir3 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
		if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  " Draft Closure: - File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "Draft Closure :-  File does not downloaded.");
		}
		
		Thread.sleep(500);
		AuditHeadArsLocator.DraftObservationListing1().click();		//Exporting (Downloading) file
		Thread.sleep(2000);
		
		File dir4 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents2 = dir4.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(500);
		AuditHeadArsLocator.ExportToExcel().click();		//Exporting (Downloading) file
		Thread.sleep(1000);
		
		File dir5 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew2 = dir5.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
		if (dirContents2.length < allFilesNew2.length) {
			test.log(LogStatus.PASS,  "  - File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, " File does not downloaded.");
		}
		
		
		AuditHeadArsLocator.Observation().clear();
		Thread.sleep(1000);
		AuditHeadArsLocator.Observation().sendKeys("Observation 6");
		Thread.sleep(3000);
		AuditHeadArsLocator.ObservationList_CheckBox().click();
		Thread.sleep(1000);
		AuditHeadArsLocator.ObservationList_Save().click();
		Thread.sleep(3000);
		String Msg1	=AuditHeadArsLocator.ObservationList_SaveMsg().getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Meassage Display :-" +Msg1);
		
		// ----------------Draft Observation Listing- View ----------------------------------------------
		
		AuditHeadArsLocator.ViewAuditDetail().click();
		Thread.sleep(3000);
		AuditHeadArsLocator.ViewAuditDetailclose().click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS,  "  View Audit Detail successfully.");
		
		// ----------------Draft Observation Listing- Delete ----------------------------------------------
		AuditHeadArsLocator.Delete().click();
		Thread.sleep(3000);
		String Msg =getDriver().switchTo().alert().getText();
		Thread.sleep(1000);
		getDriver().switchTo().alert().dismiss();
		test.log(LogStatus.PASS,  " Message Display :- " +Msg);
		Thread.sleep(3000);
		// ----------------Draft Observation Listing- Back ----------------------------------------------

		if(AuditHeadArsLocator.BackDOR().isEnabled()) {
			
			AuditHeadArsLocator.BackDOR().click();
			test.log(LogStatus.PASS,  "  Back Button wroking  successfully.");
		} else {
			test.log(LogStatus.FAIL, "   Back Button not wroking  successfully.");
		}	
		
		Thread.sleep(3000);
		AuditHeadArsLocator.ClickDashboard().click();
		Thread.sleep(3000);	
	 }
	
	public static void AuditHeadSummaryOpenAudits1( ExtentTest test ) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
	
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,3000)");	
		Thread.sleep(3000);
		
		
		AuditHeadArsLocator.OpenAudit().click();						
		Thread.sleep(3000);

		AuditHeadArsLocator.ViewAuditDetails1().click();						
		Thread.sleep(3000);
		
		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		AuditHeadArsLocator.ExporttoExcel().click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		Thread.sleep(1000);
		Thread.sleep(500);
		AuditHeadArsLocator.DraftObservationListing1().click();		//Exporting (Downloading) file
		Thread.sleep(2000);
		
		File dir4 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents2 = dir4.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(500);
		AuditHeadArsLocator.ExportToExcel().click();		//Exporting (Downloading) file
		Thread.sleep(1000);
		
		File dir5 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew2 = dir5.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
		if (dirContents2.length < allFilesNew2.length) {
			test.log(LogStatus.PASS,  "  - File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, " File does not downloaded.");
		}
		
		
		AuditHeadArsLocator.Observation().clear();
		Thread.sleep(1000);
		AuditHeadArsLocator.Observation().sendKeys("Observation 6");
		Thread.sleep(3000);
		AuditHeadArsLocator.ObservationList_CheckBox().click();
		Thread.sleep(1000);
		AuditHeadArsLocator.ObservationList_Save().click();
		Thread.sleep(3000);
		String Msg1	=AuditHeadArsLocator.ObservationList_SaveMsg().getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Meassage Display :-" +Msg1);
		
		// ----------------Draft Observation Listing- View ----------------------------------------------
		
		AuditHeadArsLocator.ViewAuditDetail().click();
		Thread.sleep(3000);
		AuditHeadArsLocator.ViewAuditDetailclose().click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS,  "  View Audit Detail successfully.");
		
		// ----------------Draft Observation Listing- Delete ----------------------------------------------
		AuditHeadArsLocator.Delete().click();
		Thread.sleep(3000);
		String Msg =getDriver().switchTo().alert().getText();
		Thread.sleep(1000);
		getDriver().switchTo().alert().dismiss();
		test.log(LogStatus.PASS,  " Message Display :- " +Msg);
		Thread.sleep(3000);
		// ----------------Draft Observation Listing- Back ----------------------------------------------

		if(AuditHeadArsLocator.BackDOR().isEnabled()) {
			
			AuditHeadArsLocator.BackDOR().click();
			test.log(LogStatus.PASS,  "  Back Button wroking  successfully.");
		} else {
			test.log(LogStatus.FAIL, "   Back Button not wroking  successfully.");
		}	
		
		Thread.sleep(3000);
		AuditHeadArsLocator.ClickDashboard().click();
		Thread.sleep(3000);	
	 }
	
	public static void AuditHeadSummaryClosedAuditscritical( ExtentTest test ) throws InterruptedException
	 {

		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
	
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,3000)");	
		Thread.sleep(3000);
		
		
		AuditHeadArsLocator.ClosedAudits().click();						
		Thread.sleep(3000);

		AuditHeadArsLocator.ViewAuditDetails1().click();						
		Thread.sleep(3000);
		
		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		AuditHeadArsLocator.ExporttoExcel().click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		Thread.sleep(1000);
		Thread.sleep(500);
		AuditHeadArsLocator.DraftObservationListing1().click();		//Exporting (Downloading) file
		Thread.sleep(2000);
		
		File dir4 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents2 = dir4.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(500);
		AuditHeadArsLocator.ExportToExcel().click();		//Exporting (Downloading) file
		Thread.sleep(1000);
		
		File dir5 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew2 = dir5.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
		if (dirContents2.length < allFilesNew2.length) {
			test.log(LogStatus.PASS,  "  - File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, " File does not downloaded.");
		}
		
		
		
		// ----------------- Back ----------------------------------------------

		if(AuditHeadArsLocator.BackDOR().isEnabled()) {
			
			AuditHeadArsLocator.BackDOR().click();
			test.log(LogStatus.PASS,  "  Back Button wroking  successfully.");
		} else {
			test.log(LogStatus.FAIL, "   Back Button not wroking  successfully.");
		}	
		
		Thread.sleep(3000);
		AuditHeadArsLocator.ClickDashboard().click();
		Thread.sleep(3000);	
	 }		

	///////////////////////////////////////////
	
	public static void DashboardOpenCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
	
		Thread.sleep(1000);
		AuditHeadArsLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	
	AuditHeadArsLocator.ClickHighOpen().click();
	Thread.sleep(2000);
	
	int open = Integer.parseInt(AuditHeadArsLocator.FinanceAccountsHigh().getText());	//Reading Dashboard count.
	AuditHeadArsLocator.FinanceAccountsHigh().click();					                //Clicking on Dashboard count

    Thread.sleep(20000);
    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.
   
	Thread.sleep(2000);
   			
    JavascriptExecutor js = (JavascriptExecutor)getDriver();
    
    js.executeScript("window.scrollBy(0,1000)");
    Thread.sleep(2000);
   

	String item = AuditHeadArsLocator.readTotalItems().getText();
	String[] bits = item.split(" ");								//Splitting the String
	String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
	int count1 = Integer.parseInt(compliancesCount);

	
	
	if(open == count1)
				
	{
					
	//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
					
	test.log(LogStatus.PASS, "Dashboard Count = "+open+" | Displayed records from grid = "+count1);
				
	}
				
	else
				
	{
					
	//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
					
	test.log(LogStatus.FAIL, "Dashboard Count = "+open+" | Displayed records from grid = "+count1);
				
	}
	
	Thread.sleep(2000);
	
    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
    
    jss.executeScript("window.scrollBy(0,-1000)");
    Thread.sleep(2000);
	
	
    Thread.sleep(1000);
    File dir = new File("C:\\Users\\ambujs\\Downloads");
    File[] dirContents = dir.listFiles();						//Counting number of files in directory before download


    AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file

    Thread.sleep(3000);
    File dir1 = new File("C:\\Users\\ambujs\\Downloads");

    File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download


    if (dirContents.length < allFilesNew.length) {
    test.log(LogStatus.PASS,  "  File downloaded successfully.");
    } else {
    test.log(LogStatus.FAIL, "  File does not downloaded.");
    }

    Thread.sleep(3000);

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
    Thread.sleep(3000);

    AuditHeadArsLocator.RiskView().click();		
    Thread.sleep(3000);
    AuditHeadArsLocator.RiskViewClose().click();		
    Thread.sleep(8000);

    test.log(LogStatus.PASS,  "  View successfully.");
    Thread.sleep(3000);
    getDriver().switchTo().parentFrame();
    AuditHeadArsLocator.ClosePopRisk().click();		


    Thread.sleep(3000);
    AuditHeadArsLocator.ClickDashboard().click();		
    Thread.sleep(3000);
	
	
	
	
	
	
}

////////////////////////////////////////////////Critical/////////////////////////////////////////////////////////////////
public static void HighRisk1( ExtentTest test ,String RiskType,String type) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
if(type.equalsIgnoreCase("open")) {
Thread.sleep(1000);
AuditHeadArsLocator.ClickHighOpen().click();
Thread.sleep(2000);


}else {

Thread.sleep(5000);
AuditHeadArsLocator.ClickHighClose().click();
Thread.sleep(8000);

}

String FinanceAccounts = AuditHeadArsLocator.FinanceAccountsHigh().getText();		//Reading the Closed Timely value of Human Resource
FinanceAccounts = FinanceAccounts.replaceAll(" ","");									//Removing all white spaces from string. 
int Finance_Accounts = Integer.parseInt(FinanceAccounts);	

AuditHeadArsLocator.FinanceAccountsHigh().click();
Thread.sleep(3000);

wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

Thread.sleep(1000);
File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download


AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file

Thread.sleep(3000);
File dir1 = new File("C:\\Users\\ambujs\\Downloads");

File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download


if (dirContents.length < allFilesNew.length) {
test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
test.log(LogStatus.FAIL, "  File does not downloaded.");
}

Thread.sleep(3000);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
Thread.sleep(3000);

AuditHeadArsLocator.RiskView().click();		
Thread.sleep(3000);
AuditHeadArsLocator.RiskViewClose().click();		
Thread.sleep(8000);

test.log(LogStatus.PASS,  "  View successfully.");

String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
String[] bits = s1.split(" ");									//Splitting the String
String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)

if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
Thread.sleep(1000);
s1 = AuditHeadArsLocator.readTotalItems().getText();
bits = s1.split(" ");										//Splitting the String
itomsCount = bits[bits.length - 2];
}
if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
itomsCount = "0";
}
int count1 = Integer.parseInt(itomsCount);

if(count1 == Finance_Accounts)
{
test.log(LogStatus.PASS, "'"+RiskType+"' Risk Count matches to number of items from grid.");
test.log(LogStatus.PASS, "'"+RiskType+"'  Risk  Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
}
else
{
test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count doesn't matches to number of items from grid.");
test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
}
getDriver().switchTo().parentFrame();
AuditHeadArsLocator.ClosePopRisk().click();		


Thread.sleep(3000);
AuditHeadArsLocator.ClickDashboard().click();		
Thread.sleep(3000);

}

public static void MediumRisk1( ExtentTest test ,String RiskType,String type) throws InterruptedException
{

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
if(type.equalsIgnoreCase("open")) {
Thread.sleep(3000);
AuditHeadArsLocator.ClickMediumOpen().click();
Thread.sleep(4000);


}else {

Thread.sleep(3000);
AuditHeadArsLocator.ClickMediumClose().click();
Thread.sleep(4000);

}

String FinanceAccounts = AuditHeadArsLocator.FinanceAccountsHigh().getText();		//Reading the Closed Timely value of Human Resource
FinanceAccounts = FinanceAccounts.replaceAll(" ","");									//Removing all white spaces from string. 
int Finance_Accounts = Integer.parseInt(FinanceAccounts);	

AuditHeadArsLocator.FinanceAccountsHigh().click();
Thread.sleep(3000);
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

Thread.sleep(3000);
File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download


AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file

Thread.sleep(3000);
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download


if (dirContents.length < allFilesNew.length) {
test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
test.log(LogStatus.FAIL, "  File does not downloaded.");
}

Thread.sleep(3000);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
Thread.sleep(3000);

AuditHeadArsLocator.RiskView().click();		
Thread.sleep(3000);
AuditHeadArsLocator.RiskViewClose().click();		
Thread.sleep(3000);

test.log(LogStatus.PASS,  "  View successfully.");

String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
String[] bits = s1.split(" ");									//Splitting the String
String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)

if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
Thread.sleep(1000);
s1 = AuditHeadArsLocator.readTotalItems().getText();
bits = s1.split(" ");										//Splitting the String
itomsCount = bits[bits.length - 2];
}
if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
itomsCount = "0";
}
int count1 = Integer.parseInt(itomsCount);

if(count1 == Finance_Accounts)
{
test.log(LogStatus.PASS, "'"+RiskType+"' Risk Count matches to number of items from grid.");
test.log(LogStatus.PASS, "'"+RiskType+"'  Risk  Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
}
else
{
test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count doesn't matches to number of items from grid.");
test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
}

getDriver().switchTo().parentFrame();
AuditHeadArsLocator.ClosePopRisk().click();		


Thread.sleep(8000);
AuditHeadArsLocator.ClickDashboard().click();		
Thread.sleep(3000);
}

public static void LowRisk1( ExtentTest test ,String RiskType,String type) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
if(type.equalsIgnoreCase("open")) {
Thread.sleep(3000);
AuditHeadArsLocator.ClickLowOpen().click();
Thread.sleep(3000);


}else {

Thread.sleep(3000);
AuditHeadArsLocator.ClickLowClose().click();
Thread.sleep(4000);

}

String FinanceAccounts = AuditHeadArsLocator.FinanceAccountsHigh().getText();		//Reading the Closed Timely value of Human Resource
FinanceAccounts = FinanceAccounts.replaceAll(" ","");									//Removing all white spaces from string. 
int Finance_Accounts = Integer.parseInt(FinanceAccounts);	

AuditHeadArsLocator.FinanceAccountsHigh().click();
Thread.sleep(3000);
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

Thread.sleep(4000);
File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download


AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file

Thread.sleep(3000);
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download


if (dirContents.length < allFilesNew.length) {
test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
test.log(LogStatus.FAIL, "  File does not downloaded.");
}

Thread.sleep(3000);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
Thread.sleep(3000);

AuditHeadArsLocator.RiskView().click();		
Thread.sleep(3000);
AuditHeadArsLocator.RiskViewClose().click();		
Thread.sleep(3000);

test.log(LogStatus.PASS,  "  View successfully.");

String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
String[] bits = s1.split(" ");									//Splitting the String
String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)

if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
Thread.sleep(1000);
s1 = AuditHeadArsLocator.readTotalItems().getText();
bits = s1.split(" ");										//Splitting the String
itomsCount = bits[bits.length - 2];
}
if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
itomsCount = "0";
}
int count1 = Integer.parseInt(itomsCount);

if(count1 == Finance_Accounts)
{
test.log(LogStatus.PASS, "'"+RiskType+"' Risk Count matches to number of items from grid.");
test.log(LogStatus.PASS, "'"+RiskType+"'  Risk  Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
}
else
{
test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count doesn't matches to number of items from grid.");
test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
}

getDriver().switchTo().parentFrame();
AuditHeadArsLocator.ClosePopRisk().click();			
Thread.sleep(3000);
AuditHeadArsLocator.ClickDashboard().click();		
Thread.sleep(3000);
}

public static void CategoryOpen1( ExtentTest test) throws InterruptedException
{

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
JavascriptExecutor js = (JavascriptExecutor) getDriver();
js.executeScript("window.scrollBy(0,800)");	


Thread.sleep(1500);
int ProcessInefficiency_Open = Integer.parseInt(AuditHeadArsLocator.ProcessInefficiencyOpen(null).getText());	//Reading value of 'After Due Date'
AuditHeadLocatorARS.ProcessInefficiencyOpen().click();								//CLicking on 'Not Completed' count


Thread.sleep(500);

int high = Integer.parseInt(AuditHeadArsLocator.readHigh().getText());		//reading High risk count.
int medium = Integer.parseInt(AuditHeadArsLocator.readMedium().getText());	//reading Medium risk count.
int low = Integer.parseInt(AuditHeadArsLocator.readLow().getText());			//reading Low risk count.
Thread.sleep(500);
int total = high + medium + low;
Thread.sleep(500);
if(ProcessInefficiency_Open == total)
{
test.log(LogStatus.PASS, "'Process Inefficiency Open' Category Count matches to sum of all risked Categorirs.");
test.log(LogStatus.PASS, "Total 'Process Inefficiency' Open Category : "+total);
}
else
{
test.log(LogStatus.FAIL, "'Process Inefficiency Open' Category Count doesn't matches to sum of all risked Categorirs.");
test.log(LogStatus.FAIL, "Total 'Closed Timely' Compliances : "+total+" | Total Sum : "+ProcessInefficiency_Open);
}

CategoryWise1(test, "High", high);
Thread.sleep(3000);
CategoryWise1( test, "Medium", medium);
Thread.sleep(3000);
CategoryWise1( test, "Low", low);
Thread.sleep(3000);

AuditHeadArsLocator.ClickDashboard().click();		
Thread.sleep(3000);
}

public static void CategoryClose( ExtentTest test) throws InterruptedException
{

	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
JavascriptExecutor js = (JavascriptExecutor) getDriver();
js.executeScript("window.scrollBy(0,500)");	

AuditHeadArsLocator.Closed().click();								//CLicking on 'Not Completed' count
Thread.sleep(2000);


Thread.sleep(1500);
int ProcessInefficiency_Close = Integer.parseInt(AuditHeadArsLocator.ProcessInefficiencyClose().getText());	//Reading value of 'After Due Date'
AuditHeadArsLocator.ProcessInefficiencyClose().click();								//CLicking on 'Not Completed' count

Thread.sleep(5000);

int high = Integer.parseInt(AuditHeadArsLocator.readHigh().getText());		//reading High risk count.
int medium = Integer.parseInt(AuditHeadArsLocator.readMedium().getText());	//reading Medium risk count.
int low = Integer.parseInt(AuditHeadArsLocator.readLow().getText());			//reading Low risk count.
Thread.sleep(5000);
int total = high + medium + low;
Thread.sleep(5000);
if(ProcessInefficiency_Close == total)
{
test.log(LogStatus.PASS, "'Process Inefficiency Close' Category Count matches to sum of all risked Categorirs.");
test.log(LogStatus.PASS, "Total 'Process Inefficiency' Close Category : "+total);
}
else
{
test.log(LogStatus.FAIL, "'Process Inefficiency Close' Category Count doesn't matches to sum of all risked Categorirs.");
test.log(LogStatus.FAIL, "Total 'Process Inefficiency' Close Category : "+total+" | Total Sum : "+ProcessInefficiency_Close);
}

CategoryWise1( test, "High", high);
Thread.sleep(3000);
CategoryWise1( test, "Medium", medium);
Thread.sleep(3000);
CategoryWise1( test, "Low", low);
Thread.sleep(3000);
AuditHeadArsLocator.ClickDashboard().click();		
Thread.sleep(3000);
}


public static void CategoryWise1( ExtentTest test ,String risk,int riskCount) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;

if(risk.equalsIgnoreCase("High"))
{
AuditHeadArsLocator.readHigh().click();						//Clicking on High value of Pie Chart of 'Not Completed'.
}
else if(risk.equalsIgnoreCase("Medium"))
{
AuditHeadArsLocator.readMedium().click();						//Clicking on Medium value of Pie Chart of 'Not Completed'.
}
else if(risk.equalsIgnoreCase("Low"))
{
AuditHeadArsLocator.readLow().click();						//Clicking on Low value of Pie Chart of 'Not Completed'.
}

Thread.sleep(5000);
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

Thread.sleep(5000);
File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download


AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file

Thread.sleep(3000);
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download


if (dirContents.length < allFilesNew.length) {
test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
test.log(LogStatus.FAIL, "  File does not downloaded.");
}

Thread.sleep(3000);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
Thread.sleep(3000);

AuditHeadArsLocator.CategoryView().click();		
Thread.sleep(3000);
AuditHeadArsLocator.RiskViewClose().click();		
Thread.sleep(3000);

test.log(LogStatus.PASS,  "  View successfully.");

String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
String[] bits = s1.split(" ");									//Splitting the String
String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)

if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
Thread.sleep(1000);
s1 = AuditHeadArsLocator.readTotalItems().getText();
bits = s1.split(" ");										//Splitting the String
itomsCount = bits[bits.length - 2];
}
if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
itomsCount = "0";
}
int count1 = Integer.parseInt(itomsCount);

if(count1 == riskCount)
{
test.log(LogStatus.PASS, "'"+risk+"' Risk Count matches to number of items from grid.");
test.log(LogStatus.PASS, "'"+risk+"'  Risk  Count = "+ riskCount + " | Total no of items from grid = "+ count1);
}
else
{
test.log(LogStatus.FAIL, "'"+risk+"' Risk Count doesn't matches to number of items from grid.");
test.log(LogStatus.FAIL, "'"+risk+"' Risk Count = "+ riskCount + " | Total no of items from grid = "+ count1);
}
getDriver().switchTo().parentFrame();
AuditHeadArsLocator.ClosePopRisk().click();			
Thread.sleep(3000);

}

public static void ProcessHigh1( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(150));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;

JavascriptExecutor js = (JavascriptExecutor) getDriver();
js.executeScript("window.scrollBy(0,1300)");	
Thread.sleep(2000);

int Process_High = Integer.parseInt(AuditHeadArsLocator.ProcessHigh().getText());	
Thread.sleep(2000);
AuditHeadArsLocator.ProcessHigh().click();						
Thread.sleep(3000);
int open = Integer.parseInt(AuditHeadArsLocator.ProcessOpen().getText());		//reading High risk count.
Thread.sleep(5000);
int close = Integer.parseInt(AuditHeadArsLocator.ProcessClose().getText());	//reading Medium risk count.
Thread.sleep(5000);
int total = open + close;
Thread.sleep(5000);
if(Process_High == total)
{
	test.log(LogStatus.PASS, "'Finance and Accounts High' Process Count matches to sum of all  Categorirs.");
	test.log(LogStatus.PASS, "Total 'Finance and Accounts High' Risk : "+total);
}
else
{
	test.log(LogStatus.FAIL, "'Finance and Accounts High' Process Count doesn't matches to sum of all  Categorirs.");
	test.log(LogStatus.FAIL, "Total ''Finance and Accounts High' Risk : "+total+" | Total Sum : "+Process_High);
}

ProcessCategories(test, "open", open);
Thread.sleep(3000);
ProcessCategories(test, "close", close);
Thread.sleep(3000);


AuditHeadArsLocator.ClickDashboard().click();		
Thread.sleep(3000);


}

public static void ProcessMedium1( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
JavascriptExecutor js = (JavascriptExecutor) getDriver();
js.executeScript("window.scrollBy(0,1300)");	
Thread.sleep(2000);

int Process_Medium = Integer.parseInt(AuditHeadArsLocator.ProcessMedium().getText());	
Thread.sleep(2000);
AuditHeadArsLocator.ProcessMedium().click();						
Thread.sleep(3000);
int open = Integer.parseInt(AuditHeadArsLocator.ProcessOpen().getText());		//reading High risk count.
Thread.sleep(5000);
int close = Integer.parseInt(AuditHeadArsLocator.ProcessClose().getText());	//reading Medium risk count.
Thread.sleep(5000);
int total = open + close;
Thread.sleep(5000);
if(Process_Medium == total)
{
	test.log(LogStatus.PASS, "'Finance and Accounts Medium' Process Count matches to sum of all  Categorirs.");
	test.log(LogStatus.PASS, "Total 'Finance and Accounts Medium' Risk : "+total);
}
else
{
	test.log(LogStatus.FAIL, "'Finance and Accounts Medium' Process Count doesn't matches to sum of all  Categorirs.");
	test.log(LogStatus.FAIL, "Total ''Finance and Accounts Medium' Risk : "+total+" | Total Sum : "+Process_Medium);
}

ProcessCategories(test, "open", open);
Thread.sleep(3000);
ProcessCategories(test, "close", close);
Thread.sleep(3000);


AuditHeadArsLocator.ClickDashboard().click();		
Thread.sleep(3000);


}

public static void ProcessLow1( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;

JavascriptExecutor js = (JavascriptExecutor) getDriver();
js.executeScript("window.scrollBy(0,1000)");	
Thread.sleep(2000);

int Process_Low = Integer.parseInt(AuditHeadArsLocator.ProcessLow().getText());	
Thread.sleep(2000);
AuditHeadArsLocator.ProcessLow().click();						
Thread.sleep(3000);
int open = Integer.parseInt(AuditHeadArsLocator.ProcessOpen().getText());		//reading High risk count.
Thread.sleep(5000);
int close = Integer.parseInt(AuditHeadArsLocator.ProcessClose().getText());	//reading Medium risk count.
Thread.sleep(5000);
int total = open + close;
Thread.sleep(5000);
if(Process_Low == total)
{
	test.log(LogStatus.PASS, "'Finance and Accounts Low' Process Count matches to sum of all  Categorirs.");
	test.log(LogStatus.PASS, "Total 'Finance and Accounts Low' Risk : "+total);
}
else
{
	test.log(LogStatus.FAIL, "'Finance and Accounts Low' Process Count doesn't matches to sum of all  Categorirs.");
	test.log(LogStatus.FAIL, "Total ''Finance and Accounts Low' Risk : "+total+" | Total Sum : " +Process_Low);
}

ProcessCategories(test, "open", open);
Thread.sleep(3000);
ProcessCategories(test, "close", close);
Thread.sleep(3000);


AuditHeadArsLocator.ClickDashboard().click();		
Thread.sleep(3000);


}
public static void AgingGreater90( ExtentTest test ) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);


WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;


/*	AuditHeadArsLocator.btnminimize().click();						//Clicking on High value of Pie Chart of 'Not Completed'.
Thread.sleep(1000);
AuditHeadArsLocator.SelectFinancialYear1().click();		
Thread.sleep(1000);
AuditHeadArsLocator.SelectAll().click();
Thread.sleep(1000);
AuditHeadArsLocator.SelectAllOk().click();
Thread.sleep(2000);
AuditHeadArsLocator.ApplyFilters().click();
Thread.sleep(3000);
*/
JavascriptExecutor js = (JavascriptExecutor) getDriver();
js.executeScript("window.scrollBy(0,1800)");	
Thread.sleep(3000);

int Aging_90 = Integer.parseInt(AuditHeadArsLocator.Click90days().getText());	
Thread.sleep(2000);
AuditHeadArsLocator.Click90days().click();						
Thread.sleep(3000);


Thread.sleep(1000);
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

Thread.sleep(1000);
File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download


AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file

Thread.sleep(3000);
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download


if (dirContents.length < allFilesNew.length) {
	test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "  File does not downloaded.");
}

Thread.sleep(3000);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
Thread.sleep(3000);

AuditHeadArsLocator.RiskView().click();		
Thread.sleep(3000);
AuditHeadArsLocator.RiskViewClose().click();		
Thread.sleep(3000);

test.log(LogStatus.PASS,  "  View successfully.");

String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
String[] bits = s1.split(" ");									//Splitting the String
String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)

if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
	Thread.sleep(1000);
	s1 = AuditHeadArsLocator.readTotalItems().getText();
	bits = s1.split(" ");										//Splitting the String
	itomsCount = bits[bits.length - 2];
}
if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
	itomsCount = "0";
}
int count1 = Integer.parseInt(itomsCount);

if(count1 == Aging_90)
{
	test.log(LogStatus.PASS, "'  >90 days Aging Count matches to number of items from grid.");
	test.log(LogStatus.PASS, "'  >90 days Dashboard  Count = "+ Aging_90 + " | Total no of items from grid = "+ count1);
}
else
{
	test.log(LogStatus.FAIL, "'  >90 days Aging Count doesn't matches to number of items from grid.");
	test.log(LogStatus.FAIL, "'  >90 days Dashboard Count = "+ Aging_90 + " | Total no of items from grid = "+ count1);
}

Thread.sleep(1000);

getDriver().switchTo().parentFrame();
AuditHeadArsLocator.ClosePopRisk().click();		

	
Thread.sleep(3000);
AuditHeadArsLocator.ClickDashboard().click();		
Thread.sleep(3000);


}


public static void AgingNotDue( ExtentTest test ) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;



JavascriptExecutor js = (JavascriptExecutor) getDriver();
js.executeScript("window.scrollBy(0,1800)");	
Thread.sleep(7000);

int Aging_NotDue = Integer.parseInt(AuditHeadArsLocator.ClickNotDue().getText());	
Thread.sleep(5000);
AuditHeadArsLocator.ClickNotDue().click();						
Thread.sleep(3000);


Thread.sleep(1000);
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

Thread.sleep(1000);
File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download


AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file

Thread.sleep(3000);
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download


if (dirContents.length < allFilesNew.length) {
	test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "  File does not downloaded.");
}

Thread.sleep(3000);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
Thread.sleep(3000);

AuditHeadArsLocator.RiskView().click();		
Thread.sleep(3000);
AuditHeadArsLocator.RiskViewClose().click();		
Thread.sleep(3000);

test.log(LogStatus.PASS,  "  View successfully.");

String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
String[] bits = s1.split(" ");									//Splitting the String
String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)

if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
	Thread.sleep(1000);
	s1 = AuditHeadArsLocator.readTotalItems().getText();
	bits = s1.split(" ");										//Splitting the String
	itomsCount = bits[bits.length - 2];
}
if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
	itomsCount = "0";
}
int count1 = Integer.parseInt(itomsCount);

if(count1 == Aging_NotDue)
{
	test.log(LogStatus.PASS, "'  Not Due Aging Count matches to number of items from grid.");
	test.log(LogStatus.PASS, "'  Not Due Dashboard  Count = "+ Aging_NotDue + " | Total no of items from grid = "+ count1);
}
else
{
	test.log(LogStatus.FAIL, "'  Not Due Aging Count doesn't matches to number of items from grid.");
	test.log(LogStatus.FAIL, "'  Not Due Dashboard Count = "+ Aging_NotDue + " | Total no of items from grid = "+ count1);
}

Thread.sleep(1000);

getDriver().switchTo().parentFrame();
AuditHeadArsLocator.ClosePopRisk().click();		

	
Thread.sleep(3000);
AuditHeadArsLocator.ClickDashboard().click();		
Thread.sleep(3000);

}
public static void AuditStatus( ExtentTest test ) throws InterruptedException
{
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;



JavascriptExecutor js = (JavascriptExecutor) getDriver();
js.executeScript("window.scrollBy(0,2800)");	
Thread.sleep(3000);


AuditHeadArsLocator.AuditStatusView().click();						
Thread.sleep(3000);

Thread.sleep(1000);
File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download


AuditHeadArsLocator.AuditStatusExport().click();		//Exporting (Downloading) file

Thread.sleep(3000);
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download


if (dirContents.length < allFilesNew.length) {
	test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "  File does not downloaded.");
}

File dir2 = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download

Thread.sleep(500);
AuditHeadArsLocator.DraftClosure().click();		//Exporting (Downloading) file
Thread.sleep(1000);

File dir3 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download

Thread.sleep(3000);
if (dirContents1.length < allFilesNew1.length) {
	test.log(LogStatus.PASS,  " Draft Closure: - File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "Draft Closure :-  File does not downloaded.");
}

Thread.sleep(500);

AuditHeadArsLocator.DraftObservationListing1().click();		//Exporting (Downloading) file
Thread.sleep(2000);

File dir4 = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents2 = dir4.listFiles();						//Counting number of files in directory before download

Thread.sleep(500);
AuditHeadArsLocator.ExportToExcel1().click();		//Exporting (Downloading) file
Thread.sleep(1000);

File dir5 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew2 = dir5.listFiles();						//Counting number of files in directory after download

Thread.sleep(3000);
if (dirContents2.length < allFilesNew2.length) {
	test.log(LogStatus.PASS,  " File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, " File does not downloaded.");
}
Thread.sleep(3000);

//AuditHeadArsLocator.Observation().clear();
//Thread.sleep(1000);
//AuditHeadArsLocator.Observation().sendKeys("Observation 6");
//Thread.sleep(3000);
AuditHeadArsLocator.ObservationList_CheckBox().click();
Thread.sleep(1000);
AuditHeadArsLocator.ObservationList_Save().click();
Thread.sleep(3000);
String Msg1	=AuditHeadArsLocator.ObservationList_SaveMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, "Meassage Display :-" +Msg1);
Thread.sleep(3000);
// ----------------Draft Observation Listing- View ----------------------------------------------
/*
AuditHeadArsLocator.ViewAuditDetail().click();
Thread.sleep(3000);
AuditHeadArsLocator.ViewAuditDetailclose().click();
Thread.sleep(3000);
test.log(LogStatus.PASS,  "  View Audit Detail successfully.");
*/
// ----------------Draft Observation Listing- Delete ----------------------------------------------
AuditHeadArsLocator.Delete().click();
Thread.sleep(3000);
String Msg =getDriver().switchTo().alert().getText();
Thread.sleep(1000);
getDriver().switchTo().alert().dismiss();
test.log(LogStatus.PASS,  " Message Display :- " +Msg);
Thread.sleep(3000);

// ----------------Draft Observation Listing- Back ----------------------------------------------

if(AuditHeadArsLocator.BackDOR().isEnabled()) {
	
	AuditHeadArsLocator.BackDOR().click();
	test.log(LogStatus.PASS,  "  Back Button wroking  successfully.");
} else {
	test.log(LogStatus.FAIL, "   Back Button not wroking  successfully.");
}	

Thread.sleep(3000);
AuditHeadArsLocator.ClickDashboard().click();
Thread.sleep(3000);	
}

public static void AuditHeadSummaryOpenAudits( ExtentTest test ) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;



JavascriptExecutor js = (JavascriptExecutor) getDriver();
js.executeScript("window.scrollBy(0,3000)");	
Thread.sleep(3000);


AuditHeadArsLocator.OpenAudit().click();						
Thread.sleep(3000);
AuditHeadArsLocator.financialyear().click();	
Thread.sleep(3000);
AuditHeadArsLocator.financialyearselect().click();	
Thread.sleep(3000);

AuditHeadArsLocator.ViewAuditDetails2().click();						
Thread.sleep(3000);

Thread.sleep(1000);
File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download


AuditHeadArsLocator.ExporttoExcel().click();		//Exporting (Downloading) file

Thread.sleep(3000);
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download


if (dirContents.length < allFilesNew.length) {
	test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "  File does not downloaded.");
}

Thread.sleep(1000);
Thread.sleep(500);
AuditHeadArsLocator.DraftObservationListing1().click();		//Exporting (Downloading) file
Thread.sleep(2000);

File dir4 = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents2 = dir4.listFiles();						//Counting number of files in directory before download

Thread.sleep(500);
AuditHeadArsLocator.ExportToExcel().click();		//Exporting (Downloading) file
Thread.sleep(1000);

File dir5 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew2 = dir5.listFiles();						//Counting number of files in directory after download

Thread.sleep(3000);
if (dirContents2.length < allFilesNew2.length) {
	test.log(LogStatus.PASS,  "  - File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, " File does not downloaded.");
}


AuditHeadArsLocator.Observation().clear();
Thread.sleep(1000);
AuditHeadArsLocator.Observation().sendKeys("Observation 6");
Thread.sleep(3000);
AuditHeadArsLocator.ObservationList_CheckBox().click();
Thread.sleep(1000);
AuditHeadArsLocator.ObservationList_Save().click();
Thread.sleep(3000);
String Msg1	=AuditHeadArsLocator.ObservationList_SaveMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, "Meassage Display :-" +Msg1);

// ----------------Draft Observation Listing- View ----------------------------------------------

/*AuditHeadArsLocator.ViewAuditDetail().click();
Thread.sleep(3000);
AuditHeadArsLocator.ViewAuditDetailclose().click();
Thread.sleep(3000);
test.log(LogStatus.PASS,  "  View Audit Detail successfully.");

// ----------------Draft Observation Listing- Delete ----------------------------------------------
AuditHeadArsLocator.Delete().click();
Thread.sleep(3000);
String Msg =getDriver().switchTo().alert().getText();
Thread.sleep(1000);
getDriver().switchTo().alert().dismiss();
test.log(LogStatus.PASS,  " Message Display :- " +Msg);
Thread.sleep(3000);
*/
// ----------------Draft Observation Listing- Back ----------------------------------------------

if(AuditHeadArsLocator.BackDOR().isEnabled()) {
	
	AuditHeadArsLocator.BackDOR().click();
	test.log(LogStatus.PASS,  "  Back Button wroking  successfully.");
} else {
	test.log(LogStatus.FAIL, "   Back Button not wroking  successfully.");
}	

Thread.sleep(3000);
AuditHeadArsLocator.ClickDashboard().click();
Thread.sleep(3000);	
}

public static void AuditHeadSummaryClosedAudits( ExtentTest test ) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;



JavascriptExecutor js = (JavascriptExecutor) getDriver();
js.executeScript("window.scrollBy(0,3000)");	
Thread.sleep(3000);


AuditHeadArsLocator.ClosedAudits().click();						
Thread.sleep(3000);

AuditHeadArsLocator.ViewAuditDetails1().click();						
Thread.sleep(3000);

Thread.sleep(1000);
File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download


AuditHeadArsLocator.ExporttoExcel().click();		//Exporting (Downloading) file

Thread.sleep(3000);
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download


if (dirContents.length < allFilesNew.length) {
	test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "  File does not downloaded.");
}

Thread.sleep(1000);
Thread.sleep(500);
/*AuditHeadArsLocator.DraftObservationListing1().click();		//Exporting (Downloading) file
Thread.sleep(2000);

File dir4 = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents2 = dir4.listFiles();						//Counting number of files in directory before download

Thread.sleep(500);
AuditHeadArsLocator.ExportToExcel().click();		//Exporting (Downloading) file
Thread.sleep(1000);

File dir5 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew2 = dir5.listFiles();						//Counting number of files in directory after download

Thread.sleep(3000);
if (dirContents2.length < allFilesNew2.length) {
	test.log(LogStatus.PASS,  "  - File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, " File does not downloaded.");
}
*/


// ----------------- Back ----------------------------------------------

if(AuditHeadArsLocator.BackDOR().isEnabled()) {
	
	AuditHeadArsLocator.BackDOR().click();
	test.log(LogStatus.PASS,  "  Back Button wroking  successfully.");
} else {
	test.log(LogStatus.FAIL, "   Back Button not wroking  successfully.");
}	

Thread.sleep(3000);
AuditHeadArsLocator.ClickDashboard().click();
Thread.sleep(3000);	
}	
public static void AuditCommitteeOpen( ExtentTest test ) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;



JavascriptExecutor js = (JavascriptExecutor) getDriver();
js.executeScript("window.scrollBy(0,2300)");	
Thread.sleep(3000);

int AuditCommittee_Open = Integer.parseInt(AuditHeadArsLocator.AuditCommitteeOpen().getText());	
Thread.sleep(2000);
AuditHeadArsLocator.AuditCommitteeOpen().click();						
Thread.sleep(3000);


Thread.sleep(5000);
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

Thread.sleep(3000);
File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download


AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file

Thread.sleep(3000);
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download


if (dirContents.length < allFilesNew.length) {
	test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "  File does not downloaded.");
}

Thread.sleep(3000);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
Thread.sleep(3000);

AuditHeadArsLocator.RiskView().click();		
Thread.sleep(3000);
AuditHeadArsLocator.RiskViewClose().click();		
Thread.sleep(3000);

test.log(LogStatus.PASS,  "  View successfully.");

String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
String[] bits = s1.split(" ");									//Splitting the String
String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)

if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
	Thread.sleep(1000);
	s1 = AuditHeadArsLocator.readTotalItems().getText();
	bits = s1.split(" ");										//Splitting the String
	itomsCount = bits[bits.length - 2];
}
if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
	itomsCount = "0";
}
int count1 = Integer.parseInt(itomsCount);

if(count1 == AuditCommittee_Open)
{
	test.log(LogStatus.PASS, "'  Audit Committee Open Count matches to number of items from grid.");
	test.log(LogStatus.PASS, "' Audit Committee Open Dashboard  Count = "+ AuditCommittee_Open + " | Total no of items from grid = "+ count1);
}
else
{
	test.log(LogStatus.FAIL, "'  Audit Committee Open Count doesn't matches to number of items from grid.");
	test.log(LogStatus.FAIL, "'  Audit Committee Open Dashboard Count = "+ AuditCommittee_Open + " | Total no of items from grid = "+ count1);
}

Thread.sleep(1000);

getDriver().switchTo().parentFrame();
AuditHeadArsLocator.ClosePopRisk().click();		

	
Thread.sleep(3000);
AuditHeadArsLocator.ClickDashboard().click();		
Thread.sleep(3000);


}

public static void AuditCommitteeClose( ExtentTest test ) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));


Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;



JavascriptExecutor js = (JavascriptExecutor) getDriver();
js.executeScript("window.scrollBy(0,2300)");	
Thread.sleep(3000);

int AuditCommittee_close = Integer.parseInt(AuditHeadArsLocator.AuditCommitteeClose().getText());	
Thread.sleep(2000);
AuditHeadArsLocator.AuditCommitteeClose().click();						
Thread.sleep(3000);


Thread.sleep(1000);
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

Thread.sleep(1000);
File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download


AuditHeadArsLocator.ClickExport().click();		//Exporting (Downloading) file

Thread.sleep(3000);
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download


if (dirContents.length < allFilesNew.length) {
	test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "  File does not downloaded.");
}

Thread.sleep(3000);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
Thread.sleep(3000);

AuditHeadArsLocator.RiskView().click();		
Thread.sleep(3000);
AuditHeadArsLocator.RiskViewClose().click();		
Thread.sleep(3000);

test.log(LogStatus.PASS,  "  View successfully.");

String s1 = AuditHeadArsLocator.readTotalItems().getText();		//Reading total number of items.
String[] bits = s1.split(" ");									//Splitting the String
String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)

if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
	Thread.sleep(1000);
	s1 = AuditHeadArsLocator.readTotalItems().getText();
	bits = s1.split(" ");										//Splitting the String
	itomsCount = bits[bits.length - 2];
}
if(itomsCount.equalsIgnoreCase("to"))							//If not items found
{
	itomsCount = "0";
}
int count1 = Integer.parseInt(itomsCount);

if(count1 == AuditCommittee_close)
{
	test.log(LogStatus.PASS, "'  Audit Committee Close Count matches to number of items from grid.");
	test.log(LogStatus.PASS, "' Audit Committee Close Dashboard  Count = "+ AuditCommittee_close + " | Total no of items from grid = "+ count1);
}
else
{
	test.log(LogStatus.FAIL, "'  Audit Committee Close Count doesn't matches to number of items from grid.");
	test.log(LogStatus.FAIL, "'  Audit Committee Close Dashboard Count = "+ AuditCommittee_close + " | Total no of items from grid = "+ count1);
}

Thread.sleep(1000);

getDriver().switchTo().parentFrame();
AuditHeadArsLocator.ClosePopRisk().click();		

	
Thread.sleep(3000);
AuditHeadArsLocator.ClickDashboard().click();		
Thread.sleep(3000);


}

	
public static void RiskControlMatrix( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.ImportExportUtility().click();
Thread.sleep(5000);
AuditHeadArsLocator.RiskControlMatrix().click();

Thread.sleep(3000);
AuditHeadArsLocator.SelectApplicableLocation().click();
Thread.sleep(2000);
AuditHeadArsLocator.LocationExpand().click();
Thread.sleep(2000);
AuditHeadArsLocator.India().click();
Thread.sleep(2000);
AuditHeadArsLocator.Vertical().click();
Thread.sleep(2000);
AuditHeadArsLocator.NA().click();
Thread.sleep(2000);
AuditHeadArsLocator.ChooseFile().sendKeys("E:\\ARSFileUpload\\RiskControlMatrix_Audit Steps_Sample.xlsx");
Thread.sleep(2000);
AuditHeadArsLocator.Upload().click();
Thread.sleep(5000);
//String t = AuditHeadArsLocator.SuccessfullyIC().getText();
//Thread.sleep(3000);

test.log(LogStatus.PASS, "Data uploaded successfully." );
Thread.sleep(4000);


}

	
public static void SubProcess( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.ImportExportUtility().click();
Thread.sleep(2000);
AuditHeadArsLocator.SubProcess().click();
Thread.sleep(2000);
AuditHeadArsLocator.ChooseFile().sendKeys("C:\\Users\\ambujs\\Downloads\\SubProcess_Sample.xlsx");
Thread.sleep(1000);
AuditHeadArsLocator.Upload().click();
Thread.sleep(1000);
}

public static void UpdateRiskControlMatrix( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.ImportExportUtility().click();
Thread.sleep(2000);
AuditHeadArsLocator.UpdateRiskControlMatrix().click();

Thread.sleep(3000);
AuditHeadArsLocator.SelectApplicableLocation().click();
Thread.sleep(1000);
AuditHeadArsLocator.LocationExpand().click();
Thread.sleep(1000);
AuditHeadArsLocator.India().click();
Thread.sleep(3000);
AuditHeadArsLocator.Vertical1().click();

Thread.sleep(1000);
AuditHeadArsLocator.NA().click();
Thread.sleep(1000);
AuditHeadArsLocator.ChooseFile().sendKeys("E:\\ARSFileUpload\\RiskControlMatrixExportForUpdate.xlsx");
Thread.sleep(1000);
AuditHeadArsLocator.Upload().click();
Thread.sleep(7000);
//String t = AuditHeadArsLocator.SuccessfullyIC().getText();
//Thread.sleep(3000);

test.log(LogStatus.PASS, "Data uploaded successfully." );
Thread.sleep(4000);

}

public static void ExportUtility( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.ImportExportUtility().click();
Thread.sleep(2000);
AuditHeadArsLocator.ExportUtility().click();

Thread.sleep(3000);

AuditHeadArsLocator.Company().click();
Thread.sleep(1000);
//AuditHeadArsLocator.EnterText().sendKeys("india");
Thread.sleep(1000);
AuditHeadArsLocator.IndiaCompany().click();


Thread.sleep(1000);
File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download

Thread.sleep(500);
AuditHeadArsLocator.Export().click();		//Exporting (Downloading) file

Thread.sleep(3000);//C://Users//jiya//Downloads//
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download

Thread.sleep(3000);
if (dirContents.length < allFilesNew.length) {
	test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "  File does not downloaded.");
}

}

	

public static void AuditScheduling( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AuditScheduling().click();
Thread.sleep(3000);
AuditHeadArsLocator.ASAddNew().click();

Thread.sleep(1000);
AuditHeadArsLocator.CompanyAS().click();
Thread.sleep(1000);
AuditHeadArsLocator.IndiaAS().click();
Thread.sleep(1000);

AuditHeadArsLocator.SelectProcessAS().click();
Thread.sleep(1000);
AuditHeadArsLocator.BankingCheckbox().click();
Thread.sleep(1000);
AuditHeadArsLocator.OK().click();
Thread.sleep(1000);
AuditHeadArsLocator.FinancialYear().click();
Thread.sleep(1000);
AuditHeadArsLocator.SelectFinancialYear().click();
Thread.sleep(1000);
AuditHeadArsLocator.SchedulingType().click();
Thread.sleep(1000);
AuditHeadArsLocator.STAnnually().click();
Thread.sleep(1000);
AuditHeadArsLocator.StartDate().sendKeys("02-02-2023");
Thread.sleep(1000);
AuditHeadArsLocator.EndDate().sendKeys("20-02-2023");
Thread.sleep(1000);
AuditHeadArsLocator.SchedulingType().click();
Thread.sleep(1000);
AuditHeadArsLocator.SelectBank().click();
Thread.sleep(1000);
AuditHeadArsLocator.SaveBtn().click();
Thread.sleep(1000);
try {
String Msg=	AuditHeadArsLocator.ASSaveMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, Msg);
}
catch(Exception e) {
	test.log(LogStatus.FAIL, "Audit Schedule Already Present");
}
AuditHeadArsLocator.CloseBtn().click();
Thread.sleep(1000);
}

public static void DisplayScheduleInformation( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AuditScheduling().click();
Thread.sleep(3000);
AuditHeadArsLocator.DisplayScheduleInformation().click();
Thread.sleep(3000);
AuditHeadArsLocator.DisplayScheduleInformationSave().click();
Thread.sleep(1000);
String Msg=	AuditHeadArsLocator.DSSaveMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, Msg);
AuditHeadArsLocator.DSClose().click();
Thread.sleep(1000);
}

public static void EditScheduleInformation( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AuditScheduling().click();
Thread.sleep(3000);
AuditHeadArsLocator.EditScheduleInformation().click();
Thread.sleep(3000);
AuditHeadArsLocator.Frequency().click();
Thread.sleep(1000);
AuditHeadArsLocator.EditSave().click();
Thread.sleep(1000);
String Msg=	AuditHeadArsLocator.EditSaveMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, Msg);


}

public static void DeleteSchedulingDetails( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AuditScheduling().click();
Thread.sleep(3000);
AuditHeadArsLocator.DeleteSchedulingDetails().click();
Thread.sleep(3000);

String Msg=	getDriver().switchTo().alert().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, Msg);
getDriver().switchTo().alert().accept();
Thread.sleep(1000);
String Msg1=AuditHeadArsLocator.EditSaveMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, Msg1);


}

	
	
	
public static void ReAssignAK( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AuditKickoff().click();
Thread.sleep(3000);
AuditHeadArsLocator.ReAssignAK().click();
Thread.sleep(3000);
AuditHeadArsLocator.UserAK().click();
Thread.sleep(1000);
AuditHeadArsLocator.DhammapalPerformer().click();
Thread.sleep(3000);

//	AuditHeadArsLocator.CompanyAK().click();
//Thread.sleep(1000);
//	AuditHeadArsLocator.IndiaAK().click();
Thread.sleep(5000);
AuditHeadArsLocator.NewUserAK().click();
Thread.sleep(1000);
AuditHeadArsLocator.ambujperformer2().click();
Thread.sleep(3000);
AuditHeadArsLocator.SaveAk().click();
Thread.sleep(3000);

String Msg=	getDriver().switchTo().alert().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, Msg);
getDriver().switchTo().alert().accept();
Thread.sleep(1000);
String Msg1=AuditHeadArsLocator.SaveAkMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, Msg1);
AuditHeadArsLocator.Close().click();
Thread.sleep(3000);


}

public static void Implementation( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AuditKickoff().click();
Thread.sleep(3000);
AuditHeadArsLocator.ReAssignAK().click();
Thread.sleep(3000);
AuditHeadArsLocator.Implementation().click();
Thread.sleep(3000);
AuditHeadArsLocator.UserAK().click();
Thread.sleep(1000);
AuditHeadArsLocator.DhammapalPerformer().click();
Thread.sleep(3000);

//	AuditHeadArsLocator.CompanyAK().click();
Thread.sleep(1000);
//	AuditHeadArsLocator.IndiaAK().click();
Thread.sleep(3000);
AuditHeadArsLocator.NewUserAK().click();
Thread.sleep(1000);
AuditHeadArsLocator.ambujperformer2().click();
Thread.sleep(3000);
AuditHeadArsLocator.SaveAk().click();
Thread.sleep(3000);

String Msg=	getDriver().switchTo().alert().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, Msg);
getDriver().switchTo().alert().accept();
Thread.sleep(1000);
String Msg1=AuditHeadArsLocator.SaveAkMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, Msg1);
AuditHeadArsLocator.Close().click();
Thread.sleep(3000);


}

public static void ViewProcessWiseDetails( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AuditKickoff().click();
Thread.sleep(3000);

AuditHeadArsLocator.ViewProcessWiseDetails().click();
Thread.sleep(4000);
AuditHeadArsLocator.Performer().click();
Thread.sleep(1000);
AuditHeadArsLocator.PerformerCheckBox().click();
AuditHeadArsLocator.PerformerOk().click();
Thread.sleep(3000);

AuditHeadArsLocator.SelectReviwer().click();
Thread.sleep(1000);
AuditHeadArsLocator.SelectReviwerA().click();
Thread.sleep(1000);
AuditHeadArsLocator.SaveVp().click();
Thread.sleep(3000);
String Msg1=AuditHeadArsLocator.SaveVpMSg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, Msg1);
// --------------Audit  Assignment Sample Excel  File -----------------------
Thread.sleep(1000);
File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download

Thread.sleep(500);
AuditHeadArsLocator.AuditAssignmentSampleExcelFile().click();		//Exporting (Downloading) file

Thread.sleep(3000);//C://Users//jiya//Downloads//
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download

Thread.sleep(3000);
if (dirContents.length < allFilesNew.length) {
	test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "  File does not downloaded.");
}

//--------------- Upload File----------------------------------
AuditHeadArsLocator.ChooseFileVP().sendKeys("C:\\Users\\ambujs\\Downloads\\Audit_Assignment_Excel (1).xlsx");
Thread.sleep(1000);
AuditHeadArsLocator.UploadVp().click();
String Msg2=AuditHeadArsLocator.UploadMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, Msg2);
Thread.sleep(1000);
AuditHeadArsLocator.Back().click();
Thread.sleep(1000);
test.log(LogStatus.PASS,  " Back Button Working successfully");
}

	
	
public static void AddNewRiskDetails1( ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AdditionalRiskCreation().click();
Thread.sleep(2000);
sheet = workbook.getSheetAt(20); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
int row = 0;
Thread.sleep(500);
Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
Cell c1 = null;
row0 = sheet.getRow(9);
c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
AuditHeadArsLocator.Search().sendKeys(c1.getStringCellValue(),Keys.ENTER); // Writing Task title
Thread.sleep(4000);
AuditHeadArsLocator.AddNewRiskDetails().click();
Thread.sleep(2000);
AuditHeadArsLocator.AuditStep().clear();
Thread.sleep(2000);
row0 = sheet.getRow(9);
c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
AuditHeadArsLocator.AuditStep().sendKeys(c1.getStringCellValue(),Keys.ENTER); // Writing Task title
Thread.sleep(1000);
AuditHeadArsLocator.SaveANR().click();
String Msg1	=AuditHeadArsLocator.SaveANRMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS,  "Message display :-" +Msg1);
Thread.sleep(1000);
AuditHeadArsLocator.CloseANR().click();
}

public static void EditRiskDetails1( ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AdditionalRiskCreation().click();
Thread.sleep(2000);
sheet = workbook.getSheetAt(20); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
int row = 0;
Thread.sleep(500);
Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
Cell c1 = null;
row0 = sheet.getRow(9);
c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
AuditHeadArsLocator.Search().sendKeys(c1.getStringCellValue(),Keys.ENTER); // Writing Task title
Thread.sleep(4000);
AuditHeadArsLocator.EditRiskDetails().click();
Thread.sleep(2000);
AuditHeadArsLocator.AuditStep().clear();
Thread.sleep(2000);
row0 = sheet.getRow(9);
c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
AuditHeadArsLocator.AuditStep().sendKeys(c1.getStringCellValue(),Keys.ENTER); // Writing Task title
Thread.sleep(1000);
AuditHeadArsLocator.SaveANR().click();
String Msg1	=AuditHeadArsLocator.SaveANRMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS,  "Message display :-" +Msg1);
Thread.sleep(1000);
AuditHeadArsLocator.CloseANR().click();
}

public static void DeActivate1( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AdditionalRiskCreation().click();
Thread.sleep(2000);
AuditHeadArsLocator.DeActivate().click();
Thread.sleep(2000);
AuditHeadArsLocator.CompanyAR().click();
Thread.sleep(1000);
AuditHeadArsLocator.ireland().click();
Thread.sleep(2000);

AuditHeadArsLocator.SelectAuditStep().click();
Thread.sleep(1000);
AuditHeadArsLocator.SelectAuditStepChckBox().click();
Thread.sleep(1000);
AuditHeadArsLocator.SelectAuditStep().click();
Thread.sleep(1000);
AuditHeadArsLocator.ClickShow().click();
Thread.sleep(1000);
AuditHeadArsLocator.CheckBox().click();
Thread.sleep(1000);
AuditHeadArsLocator.SaveDeactivate().click();
Thread.sleep(1000);
String Msg1	=AuditHeadArsLocator.SaveDeactivateMSG().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS,  "Message display :-" +Msg1);
Thread.sleep(1000);
AuditHeadArsLocator.ClickDashboard().click();
}


public static void SpecialAuditScheduling1( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.SpecialAuditScheduling().click();
Thread.sleep(2000);
AuditHeadArsLocator.ADDNew().click();
Thread.sleep(2000);
AuditHeadArsLocator.CompanyAr().click();
Thread.sleep(500);
AuditHeadArsLocator.india().click();
Thread.sleep(500);
AuditHeadArsLocator.FinancialYearSA().click();
Thread.sleep(500);
AuditHeadArsLocator.FY20232024().click();
Thread.sleep(500);
AuditHeadArsLocator.VerticalSA().click();
Thread.sleep(500);
AuditHeadArsLocator.NASA().click();
Thread.sleep(500);

AuditHeadArsLocator.StartDateSA().sendKeys("02-02-2023");
Thread.sleep(500);
AuditHeadArsLocator.EndDateSa().sendKeys("08-02-2023");
Thread.sleep(500);
AuditHeadArsLocator.ProcessName().sendKeys("Analytica");
Thread.sleep(500);
AuditHeadArsLocator.SaveSA().click();
Thread.sleep(500);
String Msg1	=AuditHeadArsLocator.SaveSAMsg().getText();
Thread.sleep(1000);
if(Msg1.equalsIgnoreCase("Data successfully saved.")) {
	test.log(LogStatus.PASS,  "Message display :-" +Msg1);
}else {
	test.log(LogStatus.FAIL,  "Message display :-" +Msg1);
}

Thread.sleep(1000);
AuditHeadArsLocator.CloseSa().click();
Thread.sleep(500);

}

public static void SpecialAuditSchedulingUpload1( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.SpecialAuditScheduling().click();
Thread.sleep(2000);
File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download

Thread.sleep(500);
AuditHeadArsLocator.SpecialAuditStep().click();		//Exporting (Downloading) file

Thread.sleep(3000);//C://Users//jiya//Downloads//
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download

Thread.sleep(3000);
if (dirContents.length < allFilesNew.length) {
	test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "  File does not downloaded.");
}
Thread.sleep(3000);
if(AuditHeadArsLocator.Choosefile().isEnabled()) {
AuditHeadArsLocator.Choosefile().sendKeys("C:\\Users\\ambujs\\Downloads\\SpecialStepSample (2).xlsx");
Thread.sleep(500);
AuditHeadArsLocator.upload().click();
Thread.sleep(2000);
String Msg1	=AuditHeadArsLocator.uploadMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, "Meassage Display :-" +Msg1);

}else {
	test.log(LogStatus.FAIL, "  File Already Uploaded");
}
}

public static void AuditDocuments1( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AuditDocuments().click();
Thread.sleep(2000);
AuditHeadArsLocator.AddNewDA().click();
Thread.sleep(2000);
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));
AuditHeadArsLocator.CompanyAD().click();
Thread.sleep(500);
AuditHeadArsLocator.indiaAD().click();
Thread.sleep(500);
AuditHeadArsLocator.FinanacialYear().click();
Thread.sleep(500);
AuditHeadArsLocator.FY().click();
Thread.sleep(500);
AuditHeadArsLocator.ChooseFileAD().sendKeys("C:\\Users\\ambujs\\Downloads\\OpenObservationReport (83).xlsx");
Thread.sleep(500);
AuditHeadArsLocator.SaveAD().click();
test.log(LogStatus.PASS,  "Audit Documents Add Successfully");
Thread.sleep(500);
getDriver().switchTo().parentFrame();
AuditHeadArsLocator.ClosePop().click();
}

public static void View1( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AuditDocuments().click();
Thread.sleep(2000);
AuditHeadArsLocator.View().click();
Thread.sleep(2000);

File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download

Thread.sleep(500);
AuditHeadArsLocator.ClickDownload().click();		//Exporting (Downloading) file

Thread.sleep(3000);//C://Users//jiya//Downloads//
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download

Thread.sleep(3000);
if (dirContents.length < allFilesNew.length) {
	test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "  File does not downloaded.");
}

AuditHeadArsLocator.ViewClose().click();
Thread.sleep(500);
}

public static void ReportGeneration1( ExtentTest test) throws InterruptedException
{
// ----------------Filter ----------------------------------------------
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[7]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.ReportGeneration().click();
Thread.sleep(3000);
AuditHeadArsLocator.Company().click();
Thread.sleep(2000);
AuditHeadArsLocator.allahabad().click();
Thread.sleep(1000);

AuditHeadArsLocator.FinancialYearRG().click();
Thread.sleep(1000);
AuditHeadArsLocator.RG20232024().click();
Thread.sleep(4000);

AuditHeadArsLocator.FinancialYearRG().click();
Thread.sleep(1000);
AuditHeadArsLocator.RG20222023().click();
Thread.sleep(3000);

String Msg=	AuditHeadArsLocator.FinancialYearText().getText();
if(Msg.equalsIgnoreCase("2022-2023")) {
	test.log(LogStatus.PASS,  " Filter Working successfully.");
		} else {
			test.log(LogStatus.FAIL, "  Filter not Working successfully.");
		}
	
// ---------------- Export To Excel ----------------------------------------------

File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download

Thread.sleep(500);
AuditHeadArsLocator.ExportRG().click();		//Exporting (Downloading) file

Thread.sleep(3000);//C://Users//jiya//Downloads//
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download

Thread.sleep(3000);
if (dirContents.length < allFilesNew.length) {
	test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "  File does not downloaded.");
}

// ----------------View Audit Status ----------------------------------------------
AuditHeadArsLocator.ViewAuditStatus().click();
Thread.sleep(2000);
AuditHeadArsLocator.ViewAuditStatusClose().click();
Thread.sleep(1000);
test.log(LogStatus.PASS,  " View Audit Status  successfully.");

}

	
	
	
public static void ReportGeneration11( ExtentTest test) throws InterruptedException
{
// ----------------Filter ----------------------------------------------
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[7]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.ReportGeneration().click();
Thread.sleep(3000);
AuditHeadArsLocator.Company().click();
Thread.sleep(2000);
AuditHeadArsLocator.allahabad().click();
Thread.sleep(1000);

AuditHeadArsLocator.FinancialYearRG().click();
Thread.sleep(1000);
AuditHeadArsLocator.RG20232024().click();
Thread.sleep(4000);

AuditHeadArsLocator.FinancialYearRG().click();
Thread.sleep(1000);
AuditHeadArsLocator.RG20222023().click();
Thread.sleep(3000);

String Msg=	AuditHeadArsLocator.FinancialYearText().getText();
if(Msg.equalsIgnoreCase("2022-2023")) {
	test.log(LogStatus.PASS,  " Filter Working successfully.");
		} else {
			test.log(LogStatus.FAIL, "  Filter not Working successfully.");
		}
	
// ---------------- Export To Excel ----------------------------------------------

File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download

Thread.sleep(500);
AuditHeadArsLocator.ExportRG().click();		//Exporting (Downloading) file

Thread.sleep(3000);//C://Users//jiya//Downloads//
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download

Thread.sleep(3000);
if (dirContents.length < allFilesNew.length) {
	test.log(LogStatus.PASS,  "  File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "  File does not downloaded.");
}

// ----------------View Audit Status ----------------------------------------------
AuditHeadArsLocator.ViewAuditStatus().click();
Thread.sleep(2000);
AuditHeadArsLocator.ViewAuditStatusClose().click();
Thread.sleep(1000);
test.log(LogStatus.PASS,  " View Audit Status  successfully.");

}

public static void ViewAuditDetails1( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

// ----------------View Audit Details - Save ----------------------------------------------
WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[7]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.ReportGeneration().click();
Thread.sleep(3000);
AuditHeadArsLocator.Company().click();
Thread.sleep(2000);
AuditHeadArsLocator.allahabad().click();
Thread.sleep(1000);

AuditHeadArsLocator.FinancialYearRG().click();
Thread.sleep(1000);
AuditHeadArsLocator.RG20232024().click();
Thread.sleep(4000);

AuditHeadArsLocator.FinancialYearRG().click();
Thread.sleep(1000);
AuditHeadArsLocator.RG20222023().click();
Thread.sleep(3000);

AuditHeadArsLocator.ViewAuditDetails().click();
Thread.sleep(3000);

AuditHeadArsLocator.ChooseFileRG().sendKeys("C:\\Users\\ambujs\\Downloads\\AuditStatusReport (31).xlsx");
Thread.sleep(1000);
AuditHeadArsLocator.Remarks().sendKeys("remark");
Thread.sleep(2000);
AuditHeadArsLocator.SaveVAD().click();
Thread.sleep(3000);
String Msg1	=AuditHeadArsLocator.SaveVADMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, "Meassage Display :-" +Msg1);

// ----------------View Audit Details - Draft ----------------------------------------------

File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download

Thread.sleep(500);
AuditHeadArsLocator.Draft().click();		//Exporting (Downloading) file

Thread.sleep(3000);//C://Users//jiya//Downloads//
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download

Thread.sleep(3000);
if (dirContents.length < allFilesNew.length) {
	test.log(LogStatus.PASS,  "Draft -  File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "  File does not downloaded.");
}

// ----------------View Audit Details - Generate Report ----------------------------------------------

		File dir2 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(500);
		AuditHeadArsLocator.GenerateReport().click();		//Exporting (Downloading) file
		Thread.sleep(1000);
		String Msg =getDriver().switchTo().alert().getText();
		Thread.sleep(1000);
		getDriver().switchTo().alert().dismiss();
		test.log(LogStatus.PASS,  " Message Display :- " +Msg);
		Thread.sleep(3000);
		
		File dir3 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
		if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "Generate Report : - File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "Generate Report :-  File does not downloaded.");
		}

}

public static void DraftObservationListing1( ExtentTest test) throws InterruptedException
{
// ----------------Draft Observation Listing - Save ----------------------------------------------
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[7]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.ReportGeneration().click();
Thread.sleep(3000);
//AuditHeadArsLocator.Company().click();
Thread.sleep(2000);
//AuditHeadArsLocator.allahabad().click();
Thread.sleep(1000);

AuditHeadArsLocator.FinancialYearRG().click();
Thread.sleep(1000);
AuditHeadArsLocator.RG20232024().click();
Thread.sleep(4000);

AuditHeadArsLocator.FinancialYearRG().click();
Thread.sleep(1000);
AuditHeadArsLocator.RG20222023().click();
Thread.sleep(3000);

AuditHeadArsLocator.ViewAuditDetails().click();
Thread.sleep(3000);
AuditHeadArsLocator.DraftObservationListing().click();
Thread.sleep(3000);
AuditHeadArsLocator.Observation().clear();
Thread.sleep(1000);
AuditHeadArsLocator.Observation().sendKeys("Observation 11");
Thread.sleep(3000);
AuditHeadArsLocator.ObservationList_CheckBox().click();
Thread.sleep(1000);
AuditHeadArsLocator.ObservationList_Save().click();
Thread.sleep(3000);
String Msg1	=AuditHeadArsLocator.ObservationList_SaveMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, "Meassage Display :-" +Msg1);

// ----------------Draft Observation Listing- Export ----------------------------------------------

		File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(500);
		AuditHeadArsLocator.ObservationList_Export().click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);//C://Users//jiya//Downloads//
		File dir1 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		// ----------------Draft Observation Listing- View ----------------------------------------------
		
		AuditHeadArsLocator.ViewAuditDetail().click();
		Thread.sleep(3000);
		AuditHeadArsLocator.ViewAuditDetailclose().click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS,  "  View Audit Detail successfully.");
		
		// ----------------Draft Observation Listing- Delete ----------------------------------------------
		AuditHeadArsLocator.Delete().click();
		Thread.sleep(3000);
		String Msg =getDriver().switchTo().alert().getText();
		Thread.sleep(1000);
		getDriver().switchTo().alert().dismiss();
		test.log(LogStatus.PASS,  " Message Display :- " +Msg);
		Thread.sleep(3000);
		// ----------------Draft Observation Listing- Back ----------------------------------------------

		if(AuditHeadArsLocator.BackDOR().isEnabled()) {
			
			AuditHeadArsLocator.BackDOR().click();
			test.log(LogStatus.PASS,  "  Back Button wroking  successfully.");
		} else {
			test.log(LogStatus.FAIL, "   Back Button not wroking  successfully.");
		}	
		Thread.sleep(3000);	
}

public static void HistoricalObservation1( ExtentTest test) throws InterruptedException
{

	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[8]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.PastObservations().click();
Thread.sleep(1000);
AuditHeadArsLocator.UploadHistoricalObservations().click();
Thread.sleep(3000);

// ----------------Historical Observation- Sample Format for Historical Observation ----------------------------------------------

File dir = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents = dir.listFiles();						//Counting number of files in directory before download

Thread.sleep(500);
AuditHeadArsLocator.FormatHistoricalObservation().click();		//Exporting (Downloading) file

Thread.sleep(3000);//C://Users//jiya//Downloads//
File dir1 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download

Thread.sleep(3000);
if (dirContents.length < allFilesNew.length) {
	test.log(LogStatus.PASS,  " Sample Format for Historical Observation :- File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "  File does not downloaded.");
}

// ----------------Historical Observation- File Upload ----------------------------------------------

AuditHeadArsLocator.fileUploadHO().sendKeys("D:\\Desktop - Copy\\4octhistorical.xlsx");
Thread.sleep(1000);
AuditHeadArsLocator.UploadHO().click();
try {
String Msg2=AuditHeadArsLocator.UploadHOMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, Msg2);
}catch(Exception e) {
	
}

File dir2 = new File("C:\\Users\\ambujs\\Downloads");
File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download

Thread.sleep(500);
AuditHeadArsLocator.ClickDwonload().click();		//Exporting (Downloading) file
Thread.sleep(1000);

File dir3 = new File("C:\\Users\\ambujs\\Downloads");
File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download

Thread.sleep(3000);
if (dirContents1.length < allFilesNew1.length) {
	test.log(LogStatus.PASS,  "Generate Report : - File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, "Generate Report :-  File does not downloaded.");
}

}

public static void ViewHistoricalObservations1( ExtentTest test) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);


WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[8]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.PastObservations().click();
Thread.sleep(1000);
AuditHeadArsLocator.ViewHistoricalObservations().click();
Thread.sleep(3000);
// ----------------View Observations ----------------------------------------------

AuditHeadArsLocator.ViewAuditt().click();
Thread.sleep(3000);
String Msg3=AuditHeadArsLocator.ViewAuditText().getText();
Thread.sleep(1000);

	test.log(LogStatus.PASS, "Audit Step View Successfully" +Msg3);

Thread.sleep(1000);

AuditHeadArsLocator.ViewAuditclose().click();
Thread.sleep(3000);
// ----------------Detailed Observation ----------------------------------------------

AuditHeadArsLocator.ObservationCount().click();
Thread.sleep(3000);
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("DetObsshowdetails"));	//Wait until frame get visible and switch to it.

AuditHeadArsLocator.ObservationViewAuditStep().click();
Thread.sleep(1000);
String Msg2=AuditHeadArsLocator.ObservationViewAuditStepT().getText();
Thread.sleep(2000);

AuditHeadArsLocator.ObservationCloseAuditStep().click();
Thread.sleep(1000);
test.log(LogStatus.PASS, Msg2);
AuditHeadArsLocator.DetailedObservationView().click();
Thread.sleep(1000);
String Msg4=AuditHeadArsLocator.DetailedObservationViewText().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS, Msg4);
AuditHeadArsLocator.DetailedObservationViewClose().click();
Thread.sleep(1000);
getDriver().switchTo().defaultContent();
AuditHeadArsLocator.DetailedObservationClose().click();
Thread.sleep(2000);
AuditHeadArsLocator.ClickDashboard().click();
Thread.sleep(3000);

}

	
	
public static void mydocument(ExtentTest test,XSSFWorkbook workbook)throws InterruptedException {
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

	 AuditHeadArsLocator.clickmydocument().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickmydocumentcompany().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickmydocumentselectcompany().click();
	 Thread.sleep(5000);
	 test.log(LogStatus.PASS, " :- Filter Works Successfully.");
		 AuditHeadArsLocator.clickmydocumentdownload().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickmydocumentclick1().click();
	  Thread.sleep(9000);
  AuditHeadArsLocator.clickmydocumentreview().click();
	  Thread.sleep(9000);
  if(AuditHeadArsLocator.clickmyreviewdocumentdownload().isEnabled())
  {
       Thread.sleep(2000);
       AuditHeadArsLocator.clickmyreviewdocumentdownload().click();
       test.log(LogStatus.PASS, "Review Document Downloaded");
  }
else
{
       test.log(LogStatus.FAIL, "Review Document not Dowmloaded");
      
}

Thread.sleep(8000);
AuditHeadArsLocator.clickmydocumentclick2().click();
Thread.sleep(9000);
AuditHeadArsLocator.clickmydocumentannexure().click();
Thread.sleep(9000);
if(AuditHeadArsLocator.clickmyannexuredocumentdownload().isEnabled())
{
Thread.sleep(2000);
AuditHeadArsLocator.clickmyannexuredocumentdownload().click();
test.log(LogStatus.PASS, "annexure Document Downloaded");
}
else
{
test.log(LogStatus.FAIL, "annexure Document not Dowmloaded");

}
Thread.sleep(8000);
AuditHeadArsLocator.clickmydocumentclick3().click();
Thread.sleep(9000);
AuditHeadArsLocator.clickmydocumentFinaldeliverable().click();
Thread.sleep(9000);
if(AuditHeadArsLocator.clickmyFinaldeliverabledocumentdownload().isEnabled())
{
Thread.sleep(2000);
AuditHeadArsLocator.clickmyFinaldeliverabledocumentdownload().click();
test.log(LogStatus.PASS, "Finaldeliverable Document Downloaded");
}
else
{
test.log(LogStatus.FAIL, "Finaldeliverable Document not Dowmloaded");     
}


Thread.sleep(8000);
AuditHeadArsLocator.clickmydocumentclick4().click();
Thread.sleep(9000);
AuditHeadArsLocator.clickmydocumentFeedback().click();
Thread.sleep(9000);
if(AuditHeadArsLocator.clickmydocumentFeedbackdownload().isEnabled())
{
Thread.sleep(2000);
AuditHeadArsLocator.clickmyFinaldeliverabledocumentdownload().click();
test.log(LogStatus.PASS, "Feedback Document Downloaded");
}
else
{
test.log(LogStatus.FAIL, "Feedback Document not Dowmloaded");     
}


AuditHeadArsLocator.clickmydocumentDeleted().click();
Thread.sleep(9000);
if(AuditHeadArsLocator.clickmydocumentDeleteddownload().isEnabled())
{
Thread.sleep(2000);
AuditHeadArsLocator.clickmydocumentDeleteddownload().click();
test.log(LogStatus.PASS, "Deleted Document Downloaded");
}
else
{
test.log(LogStatus.FAIL, "Deleted Document not Dowmloaded");     
}
}		  

	
	
public static void myreport(ExtentTest test,XSSFWorkbook workbook)throws InterruptedException {
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

	 AuditHeadArsLocator.clickmyreport().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickmyreportexecutivereport().click();
	 Thread.sleep(8000);
	// AuditHeadArsLocator.clickmyreportcompany().click();
	// Thread.sleep(8000);
	// AuditHeadArsLocator.clickmyreportselectcompany().click();
	 Thread.sleep(8000);
	 test.log(LogStatus.PASS, " :- Filters work successfully.");
	 AuditHeadArsLocator.clickmyreportexecutivedownload().click();
	 Thread.sleep(8000);
	 test.log(LogStatus.PASS, " :- Executive Report Download Successfuly.");
	// String mesg11=AuditHeadArsLocator.clickmyreportexecutivemessage().getText();
		//if(mesg11.equalsIgnoreCase("You need to generate report first."))
		//{
			//test.log(LogStatus.FAIL, "You need to generate report first");
		//}
		//else
		//{
			//test.log(LogStatus.FAIL, "You need to generate report first");
		//}
		
		AuditHeadArsLocator.clickmyreport().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickinternalauditreport().click();
		 Thread.sleep(8000);
		//AuditHeadArsLocator.clickmyreportfinalauditcompany().click();
	 //Thread.sleep(8000);
	//AuditHeadArsLocator.clickmyreportfinalauditselectcompany().click();
	// Thread.sleep(8000);
	 test.log(LogStatus.PASS, " :- Filters work successfully.");
	 AuditHeadArsLocator.clickinternalauditreportdownload().click();
	 Thread.sleep(8000);
	 test.log(LogStatus.PASS, " :- Internal audit Report download successfully.");
	 Thread.sleep(2000);
		AuditHeadArsLocator.clickmyreport().click();
	   Thread.sleep(8000);
 		AuditHeadArsLocator.clickfinalauditreport().click();
    	 Thread.sleep(8000);
    	//AuditHeadArsLocator.clickmyreportinternalauditcompany().click();
   //	 Thread.sleep(8000);
   	//AuditHeadArsLocator.clickmyreportinternalauditselectcompany().click();
   	 Thread.sleep(8000);
  	 test.log(LogStatus.PASS, " :- Filters Work successfully.");
   	AuditHeadArsLocator.clickfinalauditreportauditdownload().click();
  	 Thread.sleep(8000);
  	 test.log(LogStatus.PASS, " :- Final audit Report download successfully.");
   	 Thread.sleep(8000);
   	 
   	 
   	AuditHeadArsLocator.clickmyreport().click();
	   Thread.sleep(8000);
  		AuditHeadArsLocator.clickmyreportopenobservation().click();
     	 Thread.sleep(8000);
     	AuditHeadArsLocator.clickmyreportopenobservationcompany().click();
    	 Thread.sleep(8000);
    	AuditHeadArsLocator.clickmyreportopenobservationselectcompany().click();
    	 Thread.sleep(5000);
    	 test.log(LogStatus.PASS, " :- Filters Work successfully.");
    	AuditHeadArsLocator.clickmyreportopenobservationexporttoexcel().click();
   	 Thread.sleep(8000);
   	 test.log(LogStatus.PASS, " :- open observation Report download successfully.");
    			
AuditHeadArsLocator.clickmyreport().click();
Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportobservationsummary().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportobservationcompany().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportobservationselectcompany().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportobservationok().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportobservationexporttoexcel().click();
	 Thread.sleep(8000);
	 
	AuditHeadArsLocator.clickmyreport().click();
 Thread.sleep(8000);
		AuditHeadArsLocator.clickmyreportschedulingdeviation().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportschedulingcompany().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportschedulingselectcompany().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportschedulingtype().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportschedulingselecttype().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportschedulingperiod().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportschedulingselectperiod().click();
	 Thread.sleep(8000);
 test.log(LogStatus.PASS, " :- Filters Work successfully.");
	AuditHeadArsLocator.clickmyreportschedulingexporttoexcel().click();
	 Thread.sleep(8000);
 test.log(LogStatus.PASS, " :- Audit scheduling Report Work successfully.");
	AuditHeadArsLocator.clickmyreport().click();
  Thread.sleep(8000);
		AuditHeadArsLocator.clickmyreportmanagementresponse().click();
 	 Thread.sleep(8000);
 	AuditHeadArsLocator.clickmyreportmanagementresponsecompany().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportmanagementresponseselectcompany().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportmanagementresponsefinancial().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportmanagementresponseselectfinancial().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportmanagementresponseselectscheduling().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportmanagementresponseselectselectscheduling().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportmanagementresponseperiod().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportmanagementresponseselectperiod().click();
	 Thread.sleep(8000);
	 test.log(LogStatus.PASS, " :- Filters Work successfully.");
	AuditHeadArsLocator.clickmyreportmanagementresponseexporttoexcel().click();
	 Thread.sleep(8000);
	 test.log(LogStatus.PASS, " :- management responsee Work successfully.");
	 
	 
	AuditHeadArsLocator.clickmyreport().click();
   Thread.sleep(8000);
		AuditHeadArsLocator.clickmyreportprerequisit().click();
  	 Thread.sleep(8000);
  	AuditHeadArsLocator.clickmyreportprerequisitcompancy().click();
 	 Thread.sleep(8000);
 	AuditHeadArsLocator.clickmyreportprerequisitselectcompancy().click();
 	 Thread.sleep(8000);
 	AuditHeadArsLocator.clickmyreportprerequisitfinancial().click();
	 Thread.sleep(8000);
 	AuditHeadArsLocator.clickmyreportprerequisitselectfinancial().click();
 	 Thread.sleep(8000);
  	AuditHeadArsLocator.clickmyreportprerequisitscheduling().click();
	 Thread.sleep(8000);
 	AuditHeadArsLocator.clickmyreportmyreportprerequisitselectscheduling().click();
	 Thread.sleep(8000);
 	AuditHeadArsLocator.clickmyreportmyreportprerequisitperiod().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickmyreportmyreportprerequisitselectperiod().click();
	 Thread.sleep(8000);
	 test.log(LogStatus.PASS, " :- Filters Work successfully.");
	 AuditHeadArsLocator.clickmyreportmyreportprerequisitexporttoexcel().click();
	 Thread.sleep(8000);
	 test.log(LogStatus.PASS, " :- prerequisit report Download successfully.");
	 AuditHeadArsLocator.clickmyreport().click();
	   Thread.sleep(8000);
 		AuditHeadArsLocator.clickmyreportauditscheduling().click();
    	 Thread.sleep(8000);
    	AuditHeadArsLocator.clickmyreportauditschedulingcompancy().click();
   	 Thread.sleep(8000);
   	AuditHeadArsLocator.clickmyreportauditschedulingselectcompancy().click();
   	 Thread.sleep(8000);
   	 test.log(LogStatus.PASS, " :- Filters Work successfully.");
   	AuditHeadArsLocator.clickmyreportauditschedulingexporttoexcel().click();
  	 Thread.sleep(8000);
  	 test.log(LogStatus.PASS, " :-  Audit scheduling report Download successfully.");
  	File dir = new File("C:\\Users\\ambuj\\Downloads");
	File[] dirContents = dir.listFiles(); // Counting number of files in directory before download

	Thread.sleep(500);
	AuditHeadArsLocator.clickmyreportauditschedulingexporttoexcel().click(); // Exporting (Downloading) file

	Thread.sleep(8000);// C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\ambuj\\Downloads");
	File[] allFilesNew = dir1.listFiles(); // Counting number of files in directory after download
	Thread.sleep(8000);
	
if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS, " :- File downloaded successfully.");
	} else {
		test.log(LogStatus.INFO, " :- File does not downloaded.");
	}

AuditHeadArsLocator.clickmyreport().click();
Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportauditstatus().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportauditstatuscompany().click();
	 Thread.sleep(8000);
	AuditHeadArsLocator.clickmyreportauditstatusselectcompany().click();
	 Thread.sleep(8000);
	test.log(LogStatus.PASS, " :- Filters Work successfully.");
	AuditHeadArsLocator.clickmyreportauditstatusexporttoexcel().click();
	 Thread.sleep(8000);
	File dir2 = new File("C:\\Users\\ambuj\\Downloads");
File[] dirContents1 = dir2.listFiles(); // Counting number of files in directory before download

Thread.sleep(500);
AuditHeadArsLocator.clickmyreportauditschedulingexporttoexcel().click(); // Exporting (Downloading) file

Thread.sleep(8000);// C://Users//jiya//Downloads//
File dir3 = new File("C:\\Users\\ambuj\\Downloads");
File[] allFilesNew1 = dir3.listFiles(); // Counting number of files in directory after download
Thread.sleep(8000);

if (dirContents1.length < allFilesNew1.length) {
	test.log(LogStatus.PASS, " :- File downloaded successfully.");
} else {
	test.log(LogStatus.FAIL, " :- File does not downloaded.");
}
AuditHeadArsLocator.clickmyreport().click();
Thread.sleep(8000);
AuditHeadArsLocator.clickmyreportpastaudit().click();
Thread.sleep(8000);
AuditHeadArsLocator.clickmyreportpastauditaddnew().click();
Thread.sleep(8000);
AuditHeadArsLocator.clickmyreportpastauditunit().click();
Thread.sleep(8000);
AuditHeadArsLocator.clickmyreportpastauditselectunit().click();
Thread.sleep(8000);
AuditHeadArsLocator.clickmyreportpastauditfinancial().click();
Thread.sleep(8000);
AuditHeadArsLocator.clickmyreportpastauditselectfinancial().click();
Thread.sleep(8000);
AuditHeadArsLocator.clickmyreportpastauditauditbackground().click();
Thread.sleep(8000);
AuditHeadArsLocator.clickmyreportpastauditselectauditbackground().click();
Thread.sleep(8000);
test.log(LogStatus.PASS, " :- Filters Work successfully.");
AuditHeadArsLocator.clickmyreportpastaudituploadfile().click();
Thread.sleep(8000);
test.log(LogStatus.PASS, " :- past audit file upload successfully.");
AuditHeadArsLocator.clickmyreportpastauditsave().click();
Thread.sleep(8000);
test.log(LogStatus.PASS, " :- Past Audit save successfully.");
AuditHeadArsLocator.clickmyreportpastauditclose().click();
Thread.sleep(8000);
AuditHeadArsLocator.clickmyreportpastauditview().click();
Thread.sleep(8000);
test.log(LogStatus.PASS, " :- Past Audit view Work successfully.");
AuditHeadArsLocator.clickmyreportpastauditedit().click();
Thread.sleep(8000);
AuditHeadArsLocator.clickmyreportpastauditcancel().click();
Thread.sleep(8000);
 }


public static void configuration(ExtentTest test)throws InterruptedException { // live login
	 
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);

	Thread.sleep(1000);
	//AuditHeadArsLocator.ARS().click();
	//Thread.sleep(3000);

	AuditHeadArsLocator.clickconfiguration().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationprofilemaster().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationprofilemasteraddnew().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationprofilemasterprofilename().sendKeys("Group HR");
	 Thread.sleep(8000);
    AuditHeadArsLocator.clickconfigurationprofilemasterlevel().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationprofilemasterselectlevel().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationprocess().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickselectconfigurationprocess().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickok().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationprofilemastersave().click();
	 Thread.sleep(8000);
     Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t1 );
		
		Thread.sleep(4000);
		ac.accept();
		Thread.sleep(4000); 
	 AuditHeadArsLocator.clickconfigurationprofilemasterclose().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationprofilemasteredit().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationprofilemastercancel().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationprofilemasterdeactivate().click();
	 Thread.sleep(8000);
	    Alert ac1=getDriver().switchTo().alert();
		
			String t=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t );
			
			Thread.sleep(4000);
			ac1.accept();
			Thread.sleep(4000); 

	 AuditHeadArsLocator.clickconfiguration().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationprofile().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationprofileclick().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationprofileuser().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationprofileselectuser().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationprofilesave().click();
	 Thread.sleep(8000);
	 String mesg=AuditHeadArsLocator.clickconfigurationmessage().getText();
		if(mesg.equalsIgnoreCase("Profile users saved successfully.")) 
		{
			test.log(LogStatus.PASS, "Profile users saved successfully.");
		}
		else
		{
			test.log(LogStatus.FAIL, "Profile users not saved successfully.");
		}
		 Thread.sleep(8000);
		 AuditHeadArsLocator.clickconfigurationeditmessage().click();
   	 Thread.sleep(8000);
 	AuditHeadArsLocator.clickconfiguration().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationescalation().click();
	 Thread.sleep(8000);	 
	 AuditHeadArsLocator.clickconfigurationescalationaddnew().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationprofilename().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationselectprofile().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationadd().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationsave().click();
	 Thread.sleep(8000);
	    Alert ac2=getDriver().switchTo().alert();
		
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t2 );
			
			Thread.sleep(4000);
			ac2.accept();
			Thread.sleep(4000); 

	 AuditHeadArsLocator.clickconfigurationnocancel().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationnoview().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationcross().click();
	 Thread.sleep(8000);
	 
	 AuditHeadArsLocator.clickconfiguration().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationhod().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationhodaddnew().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickhodprofile().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickhodselectprofile().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickhodtimeline().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickhodsave().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickhodcancel().click();
	 Thread.sleep(8000);
	
	 AuditHeadArsLocator.clickconfiguration().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationdashboard().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationdashboardselect().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationdashboardselectprofile().click();
	 Thread.sleep(8000);
	 AuditHeadArsLocator.clickconfigurationdashboardsave().click();
	 Thread.sleep(8000);
	    Alert ac3=getDriver().switchTo().alert();
		
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(4000);
			ac3.accept();
			Thread.sleep(4000); 

}

	





public static void EditRiskDetails( ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);


WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AdditionalRiskCreation().click();
Thread.sleep(2000);
sheet = workbook.getSheetAt(20); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
int row = 0;
Thread.sleep(500);
Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
Cell c1 = null;
row0 = sheet.getRow(9);
c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
AuditHeadArsLocator.Search().sendKeys(c1.getStringCellValue(),Keys.ENTER); // Writing Task title
Thread.sleep(4000);
AuditHeadArsLocator.EditRiskDetails().click();
Thread.sleep(2000);
AuditHeadArsLocator.AuditStep().clear();
Thread.sleep(2000);
row0 = sheet.getRow(9);
c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
AuditHeadArsLocator.AuditStep().sendKeys(c1.getStringCellValue(),Keys.ENTER); // Writing Task title
Thread.sleep(1000);
AuditHeadArsLocator.SaveANR().click();
String Msg1	=AuditHeadArsLocator.SaveANRMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS,  "Message display :-" +Msg1);
Thread.sleep(1000);
AuditHeadArsLocator.CloseANR().click();
}

public static void DeActivate( ExtentTest test) throws InterruptedException
{

WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AdditionalRiskCreation().click();
Thread.sleep(2000);
AuditHeadArsLocator.DeActivate().click();
Thread.sleep(2000);
AuditHeadArsLocator.CompanyAR().click();
Thread.sleep(1000);
AuditHeadArsLocator.ireland().click();
Thread.sleep(2000);

AuditHeadArsLocator.SelectAuditStep().click();
Thread.sleep(1000);
AuditHeadArsLocator.SelectAuditStepChckBox().click();
Thread.sleep(1000);
AuditHeadArsLocator.SelectAuditStep().click();
Thread.sleep(1000);
AuditHeadArsLocator.ClickShow().click();
Thread.sleep(1000);
AuditHeadArsLocator.CheckBox().click();
Thread.sleep(1000);
AuditHeadArsLocator.SaveDeactivate().click();
Thread.sleep(1000);
String Msg1	=AuditHeadArsLocator.SaveDeactivateMSG().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS,  "Message display :-" +Msg1);
Thread.sleep(1000);
AuditHeadArsLocator.ClickDashboard().click();
}


	
public static void FilterAdditionalRiskCreation( ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);
WebDriverWait wait = new WebDriverWait( getDriver(),(60));


Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AdditionalRiskCreation().click();
Thread.sleep(2000);
AuditHeadArsLocator.CompanyAR().click();
Thread.sleep(1000);
AuditHeadArsLocator.IndiaARF().click();
Thread.sleep(4000);
AuditHeadArsLocator.Process().click();
Thread.sleep(1000);
AuditHeadArsLocator.ActionProcessARF().click();
Thread.sleep(5000);
sheet = workbook.getSheetAt(4); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
int row = 0;
Thread.sleep(500);
Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
Cell c1 = null;

row0 = sheet.getRow(118);
c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
AuditHeadArsLocator.Search().sendKeys(c1.getStringCellValue(),Keys.ENTER); // Writing Task title
Thread.sleep(500);
//String Msg1	=AuditHeadArsLocator.Search().getText();
Thread.sleep(3000);
String Msg=	AuditHeadArsLocator.AuditStepFilter().getText();
Thread.sleep(1000);
if(Msg.equalsIgnoreCase("The auditor will review prior audits in your area and professional literature.")) {
test.log(LogStatus.PASS,  " Filter Working successfully.");
	} else {
		test.log(LogStatus.FAIL, "  Filter not Working successfully.");
	}
Thread.sleep(1000);
}

public static void AddNewRiskDetails( ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
{
	Thread.sleep(1000);
	AuditHeadArsLocator.ARS().click();
	Thread.sleep(3000);


WebDriverWait wait = new WebDriverWait( getDriver(),(60));
Thread.sleep(3000);
getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
Thread.sleep(1000);
AuditHeadArsLocator.AuditReporting().click();
Thread.sleep(1000);
AuditHeadArsLocator.AdditionalRiskCreation().click();
Thread.sleep(2000);
sheet = workbook.getSheetAt(20); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
int row = 0;
Thread.sleep(500);
Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
Cell c1 = null;
row0 = sheet.getRow(9);
c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
AuditHeadArsLocator.Search().sendKeys(c1.getStringCellValue(),Keys.ENTER); // Writing Task title
Thread.sleep(4000);
AuditHeadArsLocator.AddNewRiskDetails().click();
Thread.sleep(2000);
AuditHeadArsLocator.AuditStep().clear();
Thread.sleep(2000);
row0 = sheet.getRow(9);
c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
AuditHeadArsLocator.AuditStep().sendKeys(c1.getStringCellValue(),Keys.ENTER); // Writing Task title
Thread.sleep(1000);
AuditHeadArsLocator.SaveANR().click();
String Msg1	=AuditHeadArsLocator.SaveANRMsg().getText();
Thread.sleep(1000);
test.log(LogStatus.PASS,  "Message display :-" +Msg1);
Thread.sleep(1000);
AuditHeadArsLocator.CloseANR().click();
}



public static void AgingGreater180to365(ExtentTest test) {
	// TODO Auto-generated method stub
	
}



public static void AgingGreater0to90(ExtentTest test) {
	// TODO Auto-generated method stub
	
}
	
	
	
	
	
	
	

}
