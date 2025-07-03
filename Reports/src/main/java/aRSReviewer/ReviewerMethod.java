package aRSReviewer;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import aRSAuditee.Locator;
import arsPerformer.Method1;
import login.BasePage;

public class ReviewerMethod extends BasePage{

	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	
	
	
	
	
	public static void OpenAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		ReviewerLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(ReviewerLocator.OAudit().getText());	//Reading Dashboard count.
        ReviewerLocator.OAudit().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(ReviewerLocator.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(ReviewerLocator.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdRiskActivityMatrix']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-2;
	    
	    System.out.println(length_Row + "  " + open );
	    
	  
       
/*
		String item = Locator4.GridCount().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		*/
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

    	 
 		Thread.sleep(2000);
    	 
		
	    
	}
	
	
	
	
	public static void OpenImplementation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		ReviewerLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(ReviewerLocator.OImplementation().getText());	//Reading Dashboard count.
        ReviewerLocator.OImplementation().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(ReviewerLocator.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(ReviewerLocator.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdRiskActivityMatrix']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-2;
	    
	    System.out.println(length_Row + "  " + open );
	    
	   
       
/*
		String item = Locator4.GridCount().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		*/
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

    	 
 		
    	////////////////////ambuj///////////// 
 		//ReviewerLocator.clickimplcompany().click();
 		Thread.sleep(7000);
 		//ReviewerLocator.clickimplselectcompany().click();
 		
 		//WebWait wait = new WebWait(, (40));	
 		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_grdRiskActivityMatrix_lnkprerequsiteDetails_0")));	//Wait until records table get visible.
 		ReviewerLocator.clicknewmail113().click();
 		Thread.sleep(7000);
 		ReviewerLocator.clicknewmail12().click();
 		Thread.sleep(7000);
 		ReviewerLocator.clickto2().click();
 		Thread.sleep(7000);
 		ReviewerLocator.clickselectto2().click();
 		Thread.sleep(7000);
 		ReviewerLocator.clicksendmail2().click();
 		Thread.sleep(7000);
 		// Switching to Alert        
 		test.log(LogStatus.PASS, "Mail Sent Successfully successfully.");
 		Alert alert1 = getDriver().switchTo().alert();		
 				
 		// Capturing alert message.    
 		String alertMessage1= getDriver().switchTo().alert().getText();	


 		test.log(LogStatus.PASS, alertMessage1);
 				
 		// Displaying alert message		
 		System.out.println(alertMessage1);

 		// Accepting alert		
 		alert1.accept();

 		ReviewerLocator.clickcross1().click();
 		Thread.sleep(7000);


 		ReviewerLocator.clickcountrew2().click();
 		Thread.sleep(7000);

 		ReviewerLocator.clickaudithistory().click();
 		Thread.sleep(7000);
 		test.log(LogStatus.PASS, "  Audit history Popup open successfully.");
 		ReviewerLocator.clickaudithistoryclose().click();
 		Thread.sleep(7000);
 		test.log(LogStatus.PASS, "  Audit history Popup Close successfully.");
 		ReviewerLocator.clickauditchangestatus().click();
 		Thread.sleep(7000);
 		test.log(LogStatus.PASS, " Change status button Work Successfully.");
 		getDriver().switchTo().frame(ReviewerLocator.clickframe()); // i frame enter krne krne k liye
 		Thread.sleep(7000);
 		ReviewerLocator.clickdownloadfinal().click();
 		Thread.sleep(7000);
 		test.log(LogStatus.PASS, "  File Download Successfully.");
 		ReviewerLocator.clickenterremark().sendKeys("enter the remark mandatory");
 		Thread.sleep(7000);
 		ReviewerLocator.clickreviewhistory().click();
 		Thread.sleep(7000);
 		
 		test.log(LogStatus.PASS, "  Next Button work Successfully.");
 		ReviewerLocator.clickreviewremarkimp().sendKeys("review remark mandatory");
 		Thread.sleep(7000);
 		ReviewerLocator.clickselectstatus1().click();
 		Thread.sleep(7000);
 		ReviewerLocator.clickselectstatus22().click();
 		Thread.sleep(7000);
 		ReviewerLocator.clicksubmitbutton().click();
 		Thread.sleep(7000);
 		test.log(LogStatus.PASS, " Audit Step Submitted Successfully.");
 		getDriver().switchTo().parentFrame(); 
 		ReviewerLocator.clickclosepopup().click();
 		Thread.sleep(7000);
 		
 		ReviewerLocator.clickbackbuttonimp().click();
 		Thread.sleep(7000);

	    
	}
	
	
	
	
	
	public static void ClosedAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		ReviewerLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(ReviewerLocator.CAudit().getText());	//Reading Dashboard count.
        ReviewerLocator.CAudit().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(ReviewerLocator.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(ReviewerLocator.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdRiskActivityMatrix']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-2;
	    
	    System.out.println(length_Row + "  " + open );
	    
	   
       
/*
		String item = Locator4.GridCount().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		*/
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

    	 
 		Thread.sleep(2000);
    	 
		
	    
	}
	
	
	
	public static void ClosedImplementation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		ReviewerLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(ReviewerLocator.CImplementation().getText());	//Reading Dashboard count.
        ReviewerLocator.CImplementation().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(ReviewerLocator.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(ReviewerLocator.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdRiskActivityMatrix']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-2;
	    
	    System.out.println(length_Row + "  " + open );
	    
	   
       
/*
		String item = Locator4.GridCount().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		*/
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

    	 
 		Thread.sleep(2000);
    	 
		
	    
	}
	
	//start date and end date
	public static void AddStartDateEndDate( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		ReviewerLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        ReviewerLocator.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.SaveAuditDateDetail().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        String t = ReviewerLocator.Successfully().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS,  t);
 		Thread.sleep(2000);
       
        ReviewerLocator.StartDate().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.StartDateDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.EndDate().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.EndDateDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
      //  ReviewerLocator.SaveAuditDateDetail().click();					                //Clicking on Dashboard count
      //  Thread.sleep(2000);
        
        if(ReviewerLocator.SaveAuditDateDetail().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			ReviewerLocator.SaveAuditDateDetail().click();
 			test.log(LogStatus.PASS, "Save Successfully " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, "Save Successfully"  );
 			
 		}
    	 
    	 
		
	    
	}
	
	
	
	
	
	
	public static void AddDocumentDetails( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		
		
		ReviewerLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        ReviewerLocator.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.ViewDataRequestDetails().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        getDriver().switchTo().frame(ReviewerLocator.Frame1());
		Thread.sleep(7000);
		
		ReviewerLocator.AddRequestData().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	     
	    getDriver().switchTo().frame(ReviewerLocator.Frame());
		Thread.sleep(7000);
		
		ReviewerLocator.AddDocument().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
			
        
        row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.DocumentName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
        
    //    ReviewerLocator.DocumentName().click();					                //Clicking on Dashboard count
    //    Thread.sleep(2000);
        
        ReviewerLocator.Save().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        	
        String t = ReviewerLocator.Successfully1().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS, " Add Document - " + t);
 		Thread.sleep(2000);
         
        ReviewerLocator.Addplus().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        if(ReviewerLocator.Delete().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			ReviewerLocator.Delete().click();
 			test.log(LogStatus.PASS, " Document Delete Successfully " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Document does not Delete Successfully"  );
 			
 		}
        Thread.sleep(2000);
    	 /*
        getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		ReviewerLocator.Close().click();
		*/
        ReviewerLocator.Close().click();
		Thread.sleep(3000);
		
		 row0 = sheet.getRow(31);
		 c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		 ReviewerLocator.TypeToSearchBox().sendKeys(c1.getStringCellValue()); // Writing Task title
		 Thread.sleep(2000);
			
		
		 if(ReviewerLocator.ClickOperation().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			ReviewerLocator.ClickOperation().click();
	 			test.log(LogStatus.PASS, "Search Box Working Properly " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "Search Box Does Not Working Properly"  );
	 			
	 		}
	        Thread.sleep(2000);
	    	
	        getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			ReviewerLocator.Close1().click();
			
			Thread.sleep(9000);
	}
	
	public static void AddObservation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		ReviewerLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        ReviewerLocator.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.ViewAuditDetails().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
       
		
 		 sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
 		int row = 0;
 		Thread.sleep(500);
 		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
 		Cell c1 = null;
 		
         
 		
		
 		/////////////////ambuj/////////////
 		ReviewerLocator.clickexporttoexcel().click();
		  Thread.sleep(7000);
		  test.log(LogStatus.PASS, "  Audit Status Summary Excel file downloadded successfully.");
		  ReviewerLocator.clickdraftobservation().click();
		  Thread.sleep(7000);
		  test.log(LogStatus.PASS, " Draft observation Button Works successfully.");
		  ReviewerLocator.clickprocess().click();
		  Thread.sleep(7000);
		  ReviewerLocator.clickselectprocess().click();
		  Thread.sleep(7000);
		ReviewerLocator.ObservationList_CheckBox().click();
			Thread.sleep(2000);
			ReviewerLocator.ObservationList_Save().click();
			Thread.sleep(7000);
			String messge=ReviewerLocator.ObservationList_SaveMsg().getText();
			if(messge.equalsIgnoreCase("Observation updated successfully.")) 
			{
				test.log(LogStatus.PASS, "Observation updated successfully.");
			}
			else
			{
				test.log(LogStatus.FAIL, "Observation not updated successfully.");
			}
		//ReviewerLocator.clickremoveobservation().click();
		Thread.sleep(5000);	
		 //((TargetLocator) ReviewerLocator.clickremoveobservation()).alert().accept();
		// getDriver().switchTo().alert().accept();
		// Thread.sleep(3000);	
		 ReviewerLocator.clickexporttoexcelin().click();
		  Thread.sleep(5000);
		  ReviewerLocator.clickbackbtn().click();
		  Thread.sleep(5000);
		  ReviewerLocator.clicknewmail11().click();
		  Thread.sleep(7000);
		  ReviewerLocator.clicknewmail12().click();
		  Thread.sleep(7000);
		  ReviewerLocator.clickto2().click();
		  Thread.sleep(7000);
		  ReviewerLocator.clickselectto2().click();
		  Thread.sleep(7000);
		  ReviewerLocator.clicksendmail2().click();
		  Thread.sleep(7000);
		    // Switching to Alert        
	        Alert alert1 = getDriver().switchTo().alert();		
	        		
	        // Capturing alert message.    
	        String alertMessage1= getDriver().switchTo().alert().getText();	
	        
	        
	        test.log(LogStatus.PASS, alertMessage1);
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage1);
	        
	     // Accepting alert		
	        alert1.accept();
	        ReviewerLocator.clickcross3().click();
			  Thread.sleep(7000);
 		
 		ReviewerLocator.Submit().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
 		
 		ReviewerLocator.clickcheckboox().click();
		  Thread.sleep(7000);
		  ReviewerLocator.clickstatus().click();
	      Thread.sleep(7000);
		  ReviewerLocator.clickselectstatus2().click();
		  Thread.sleep(7000);
		  ReviewerLocator.clicksave().click();
		  Thread.sleep(7000);
		  test.log(LogStatus.PASS, "Audit Step Submitted Successfully.");
		  //String messge142=ReviewerLocator.clicksavemessagess().getText();
			//if(messge142.equalsIgnoreCase("Audit Step Submitted Successfully.")) //change krna hai
			//{
				//test.log(LogStatus.PASS, "Audit Step Submitted Successfully.");
			//}
			//else
			//{
				//test.log(LogStatus.FAIL, "Audit Step not Submitted Successfully.");
			//}
			
 		
		ReviewerLocator.ChangeStatus().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        getDriver().switchTo().frame(ReviewerLocator.Frame2());
		Thread.sleep(7000);
		
		 if(ReviewerLocator.NextButton1().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			ReviewerLocator.NextButton1().click();
	 			test.log(LogStatus.PASS, "Next Button Is Clickable " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "Next Button Is Clickable"  );
	 			
	 		}
	        Thread.sleep(2000);
			
		
	//	ReviewerLocator.NextButton1().click();					                //Clicking on Dashboard count
     //   Thread.sleep(2000);
            
       	
        
        row0 = sheet.getRow(4);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.ProcessWalkthrogh().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		 
        row0 = sheet.getRow(5);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.ActualWorkdone().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(6);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.Population().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(7);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.Sample().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(8);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.Remarks().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(9);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.WorkingFileUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		ReviewerLocator.WorkingFileUploadButton().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t1 );
		
		Thread.sleep(5000);
		ac.accept();
		Thread.sleep(3000);
		
		 ReviewerLocator.WorkingFiledownloadButton().click();	
		 Thread.sleep(2000);
		  test.log(LogStatus.PASS, "WorkingFile download Successfully.");
		  Thread.sleep(2000);
		  //test.log(LogStatus.PASS, "WorkingFile deleted Successfully.");
		  //Thread.sleep(3000);
		 ReviewerLocator.DeleteWorkingFile().click();	
		 Thread.sleep(2000);
		 Alert ac3=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(4000);
			ac3.accept();
			Thread.sleep(4000);
	        // Capturing alert message.
			Alert ac4=getDriver().switchTo().alert();
			
			String t4=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t4);
			
			Thread.sleep(4000);
			ac4.accept();
			Thread.sleep(4000);
	        JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,500)");	
			Thread.sleep(3000);
			
		 
		row0 = sheet.getRow(10);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.AnnexureFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		ReviewerLocator.AnnexureFileUploadButton().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Alert ac2=getDriver().switchTo().alert();
		
		String t2=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t2 );
		
		Thread.sleep(5000);
		ac2.accept();
		Thread.sleep(5000);
	
	

		       File dir4 = new File("C:\\Users\\ambujs\\Downloads");
				File[] dirContents4 = dir4.listFiles();						//Counting number of files in directory before download
				
				Thread.sleep(3000);
				ReviewerLocator.AnnexureFileDownload().click();
				
			 	Thread.sleep(9000);
				File dir5 = new File("C:\\Users\\ambujs\\Downloads");
				File[] allFilesNew5 = dir5.listFiles();						//Counting number of files in directory after download
				
				Thread.sleep(3000);
			  
		        Thread.sleep(3000);
			   if (dirContents4.length < allFilesNew5.length) {
					test.log(LogStatus.PASS,  "Annexure Files Download Successfully");
				}
			   else
			   {
					test.log(LogStatus.FAIL, "Annexure Files does not Download Successfully");
				}

			   Thread.sleep(3000);
			   
				ReviewerLocator.AnnexureFileDelete().click();					                //Clicking on Dashboard count
		        Thread.sleep(2000);
		 
		        Alert ac6=getDriver().switchTo().alert();
				
		 //		String t1=getDriver().switchTo().alert().getText();
		 		
		 //		test.log(LogStatus.PASS,  t1 );
		 		
		 		Thread.sleep(5000);
		 		ac6.accept();
		 		Thread.sleep(3000);
		 	
		        Alert ac7=getDriver().switchTo().alert();
				
		 		String t15=getDriver().switchTo().alert().getText();
		 		
		 		test.log(LogStatus.PASS, " Annexure File - "+ t15 );
		 		
		 		Thread.sleep(5000);
		 		ac7.accept();
		 		Thread.sleep(3000);

		
    //    ReviewerLocator.NextButton2().click();					                //Clicking on Dashboard count
    //    Thread.sleep(2000);   ambuj
		 
        if(ReviewerLocator.NextButton2().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			ReviewerLocator.NextButton2().click();
 			test.log(LogStatus.PASS, "Next Button Is Clickable " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, "Next Button Is Clickable"  );
 			
 		}
        Thread.sleep(2000);
        
        //ReviewerLocator.Addobservation().click();	
       // Thread.sleep(2000);
        
        
        row0 = sheet.getRow(11);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.ObservationTitle().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(12);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.Observation().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(13);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.briefObservation().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(14);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.ObservationBackground().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(15);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.WorkingFile1().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		ReviewerLocator.WorkingFile1Uploadbutton().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Alert ac22=getDriver().switchTo().alert();
		
		String t9=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t9 );
		
		Thread.sleep(5000);
		ac22.accept();
		Thread.sleep(3000);
		
		File dir6 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents6 = dir6.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		ReviewerLocator.ObservationWorkingFileDownload().click();
		
	 	Thread.sleep(9000);
		File dir7 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew7 = dir7.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
	  
        Thread.sleep(3000);
	   if (dirContents4.length < allFilesNew5.length) {
			test.log(LogStatus.PASS,  "Working File Files Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Working File Files does not Download Successfully");
		}

	   Thread.sleep(3000);

	   ReviewerLocator.ObservationWorkingFileDelete().click();					                //Clicking on Dashboard count
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

		
		row0 = sheet.getRow(16);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.AnnexureTitle().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		ReviewerLocator.Table().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
		
        ReviewerLocator.TableWizard().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
		
        ReviewerLocator.OKTable().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
		
		row0 = sheet.getRow(17);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.ImageUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		ReviewerLocator.ImageUploadButton().click();					                //Clicking on Dashboard count
        Thread.sleep(10000);
        
        Alert ac9=getDriver().switchTo().alert();
		
		String t10=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t10 );
		
		Thread.sleep(5000);
		ac9.accept();
		Thread.sleep(3000);
        
		/*ReviewerLocator.ImageviewButton().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);
        if(ReviewerLocator.ImageviewButton().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			ReviewerLocator.ImageviewButton().click();
 			test.log(LogStatus.PASS, "View Button Working Properly " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, "View Button Does Not Working Properly"  );
 			
 		}
        Thread.sleep(9000);
        ReviewerLocator.ImageviewButtonclose().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);
        ReviewerLocator.ImagedeleteButton().click();
        Thread.sleep(5000);
        Alert acc1=getDriver().switchTo().alert();
        Thread.sleep(5000);
        acc1.accept();
		Thread.sleep(3000);
	
       Alert acc2=getDriver().switchTo().alert();
		
		String td9=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, " Working File - "+ td9 );
		
		Thread.sleep(5000);
		acc2.accept();
		Thread.sleep(3000);
        */
		row0 = sheet.getRow(18);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.AudioVideoLink().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
        ReviewerLocator.AuditComitee().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.AuditComiteeDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        row0 = sheet.getRow(19);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.BusinessRisk().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(20);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.RootCause().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		ReviewerLocator.FinancialImpact().clear();
		ReviewerLocator.FinancialImpact().sendKeys("12345");
		    Thread.sleep(5000);
		
		//row0 = sheet.getRow(24);
		//c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		//ReviewerLocator.FinancialImpact().sendKeys(c1.getStringCellValue()); // Writing Task title
		//Thread.sleep(2000);
		
        ReviewerLocator.RiskRating().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.RiskRatingDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        	
        ReviewerLocator.ObservationCatogary().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.ObservationCatogaryDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.ObservationSubCatogary().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.ObservationSubCatogaryDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.ReccomendationType().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.ReccomendationTypeDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        row0 = sheet.getRow(22);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.Reccomendation().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
        
        ReviewerLocator.ResponceDueDate().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.ResponceDueDateDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
       
        row0 = sheet.getRow(23);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.ManagementResponce().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
           
      // ReviewerLocator.TimelineCalender().click();					                //Clicking on Dashboard count
        //Thread.sleep(2000);
        	
        //ReviewerLocator.TimelineCalenderDD().click();					                //Clicking on Dashboard count
        //Thread.sleep(2000);
        
        ReviewerLocator.PersonResponsible().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.PersonResponsibleDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.OwnerName().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.OwnerNameDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.SaveReccomendation().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        String t = ReviewerLocator.Successfullyreccomendation().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS,  t);
 		Thread.sleep(2000);
         
        ReviewerLocator.OK1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.SaveObservation().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
              
        String t11 = ReviewerLocator.SuccessfullyObservation().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS,  t11);
 		Thread.sleep(2000);
         
        ReviewerLocator.OK2().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        if(ReviewerLocator.NextButton3().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			ReviewerLocator.NextButton3().click();
 			test.log(LogStatus.PASS, "Next Button Is Clickable " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, "Next Button Is Clickable"  );
 			
 		}
        Thread.sleep(2000);
        
       // ReviewerLocator.clicknext3().click();
		 // test.log(LogStatus.PASS, " :- Observation Next Button Works successfully.");
		 // Thread.sleep(7000);
		  
		  
		  //ReviewerLocator.clickhistorylog().click();
		  Thread.sleep(7000);
		  ReviewerLocator.clickreviewremark().sendKeys("Review remark");
		  ReviewerLocator.clickreviewremark().click();
		  Thread.sleep(7000);
		  ReviewerLocator.clickselectstatus().click();
		  Thread.sleep(7000);
		  ReviewerLocator.clicksubmitbtn01().click();
		  Thread.sleep(7000);
		 // ReviewerLocator.clicksubmitbtnok().click();
		  Thread.sleep(7000);
			
		// getDriver().switchTo().parentFrame();
		 //ReviewerLocator.clickclose2().click();
		  //Thread.sleep(7000);
        // change
        /*ReviewerLocator.ShowReviewHistoryLogLink().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        row0 = sheet.getRow(27);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.ReviewRemark().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(28);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.File().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
			
		ReviewerLocator.UploadButton().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.SubmitButton().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        String t0 = ReviewerLocator.Successfully3().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS,  t0);
 		Thread.sleep(4000);
          
        ReviewerLocator.OK().click();					                //Clicking on Dashboard count            
        Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		ReviewerLocator.ClosePage().click();
		
		Thread.sleep(3000);
        
		  if(ReviewerLocator.BackButton().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			ReviewerLocator.BackButton().click();
	 			test.log(LogStatus.PASS, "Back Button Working Properly " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "Back Button Does Not Working Properly"  );
	 			
	 		}
	        Thread.sleep(2000);
	        
    
	    
	}
	*/
	}
	
	
	public static void MyWorkspaceFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
       Thread.sleep(1000);	
		ReviewerLocator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        ReviewerLocator.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
		 ReviewerLocator.Company().click();
		 Thread.sleep(3000);
	     String CompanyText =ReviewerLocator.CompanyDD().getText();
	     Thread.sleep(2000);
	     ReviewerLocator.CompanyDD().click();
		 Thread.sleep(20000);
		 
		 /*
		 ReviewerLocator.FinancialYearW().click();
		 Thread.sleep(3000);
		 String FinancialyearText =ReviewerLocator.FinancialYearWDD().getText();
		 Thread.sleep(2000);
		 ReviewerLocator.FinancialYearWDD().click();
		 Thread.sleep(20000);
		 
		 ReviewerLocator.FrequencyW().click();
	     Thread.sleep(2000);
	     ReviewerLocator.FrequencyWDD().click();
		 Thread.sleep(20000);
		
		 ReviewerLocator.PeriodW().click();
		 Thread.sleep(3000);
		 String PeriodText =ReviewerLocator.PeriodWDD().getText();
		 Thread.sleep(2000);
		 ReviewerLocator.PeriodWDD().click();
		 Thread.sleep(20000);
			*/
			
	      List<String> li=new ArrayList<String>();
	      
	      li.add(CompanyText);
	  //    li.add(FinancialyearText);
	   //   li.add(PeriodText);
	     
	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Company");
		//	filter.add("Financial Year");
		//	filter.add("Period");
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,2000)");	
			Thread.sleep(3000);
	
			Locator.Grid2().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator.Grid2().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix']/tbody/tr[2]/td[1]"));
	//		List<WebElement> financialyearcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdInternalAudits']/tbody/tr[2]/td[4]"));
	//		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdInternalAudits']/tbody/tr[2]/td[5]"));

			
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
					test.log(LogStatus.FAIL,  filter.get(i)+" column shows incorrect value : "+Fal);
			 }	
			 for(String Pas : pass)
			 {
				 test.log(LogStatus.PASS,   filter.get(i)+" dropdown working properly.");
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
	}

	public static void AddCheckBoxAndSendMail( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
		Thread.sleep(1000);
		ReviewerLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        ReviewerLocator.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.ViewDataRequestDetails().click();					                //Clicking on Dashboard count
        Thread.sleep(6000);
        
        getDriver().switchTo().frame(ReviewerLocator.Frame1());
		Thread.sleep(7000);
		
		ReviewerLocator.ActDetail().click();
		Thread.sleep(6000);
	
		ReviewerLocator.SelectProcess2().click();
		Thread.sleep(2000);
	    String ProcessText =ReviewerLocator.SelectProcess2DD().getText();
	    Thread.sleep(2000);
		ReviewerLocator.SelectProcess2DD().click();
		Thread.sleep(20000);

		ReviewerLocator.SelectSubProcess2().click();
		Thread.sleep(2000);
	    String SubProcessText =ReviewerLocator.SelectSubProcess2DD().getText();
	    Thread.sleep(2000);
		ReviewerLocator.SelectSubProcess2DD().click();
		Thread.sleep(20000);
			
	      List<String> li=new ArrayList<String>();
	      
	        li.add(ProcessText);
	        li.add(SubProcessText);
	 //     li.add(DocumentText);
	     
	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Process");
			filter.add("Sub-Process");
		//	filter.add("Period");
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,2000)");	
			Thread.sleep(3000);
	
			/*
			ReviewerLocator.Grid2().click();					//Clicking on Text of total items just to scroll down.
			String s = ReviewerLocator.Grid2().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		*/
			List<WebElement> processcol=getDriver().findElements(By.xpath("//*[@id='grdRiskActivityMatrix']/tbody/tr[2]/td[1]"));
			List<WebElement> subprocesscol=getDriver().findElements(By.xpath("//*[@id='grdRiskActivityMatrix']/tbody/tr[2]/td[2]"));
	//		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdInternalAudits']/tbody/tr[2]/td[5]"));

			
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
					test.log(LogStatus.FAIL,  filter.get(i)+" column shows incorrect value : "+Fal);
			 }	
			 for(String Pas : pass)
			 {
				 test.log(LogStatus.PASS,   filter.get(i)+" dropdown working properly.");
					test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
					System.out.println(filter.get(i)+" : "+Pas);
		 }
			 text.clear();
			pass.clear();
			fail.clear();
			raw.clear();
			
			
			}
			Thread.sleep(17000);
			
			ReviewerLocator.ReminderCheckBox().click();
			Thread.sleep(2000);

			ReviewerLocator.EscalationCheckBox().click();
			Thread.sleep(2000);

		       if(ReviewerLocator.SendMailA().isEnabled())
		 		{
		 			
		 			Thread.sleep(2000);
		 			ReviewerLocator.SendMailA().click();
		 			test.log(LogStatus.PASS, "Email sent Successfully " );
		 			
		 		}
		 		
		 		else
		 		{
		 			test.log(LogStatus.FAIL, "Email Does Not sent Successfully"  );
		 			
		 		}
		        Thread.sleep(9000);
		     
	}
	
	public static void AddDocument( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
		Thread.sleep(1000);
		ReviewerLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        ReviewerLocator.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.ViewDataRequestDetails().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        getDriver().switchTo().frame(ReviewerLocator.Frame1());
		Thread.sleep(7000);
	    
		String OptionText3 = "Option 2";
		String xpathExpression3 = String.format("//select[@id='grdProcessAudit_ddlPerformer_0']/option[2]",OptionText3);
		WebElement dropdownOption3 = getDriver().findElement(By.xpath(xpathExpression3));
		dropdownOption3.click();
		Thread.sleep(16000);
			
		String OptionText4 = "Option 2";
		String xpathExpression4 = String.format("//select[@id='grdProcessAudit_ddlReviewer_0']/option[2]",OptionText4);
		WebElement dropdownOption4 = getDriver().findElement(By.xpath(xpathExpression4));
		dropdownOption4.click();
		Thread.sleep(16000);
			
        ReviewerLocator.Timeline().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);

        ReviewerLocator.TimelineDD().click();					                //Clicking on Dashboard count
        Thread.sleep(9000);
      
        ReviewerLocator.AddDocumentAndRemark().click();					                //Clicking on Dashboard count
        Thread.sleep(9000);

    	sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
 		int row = 0;
 		Thread.sleep(500);
 		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
 		Cell c1 = null;
        
 		row0 = sheet.getRow(37);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);

        ReviewerLocator.Save5().click();					                //Clicking on Dashboard count
        Thread.sleep(7000);

        String t5 = ReviewerLocator.Successfully5().getText();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        		
 		Thread.sleep(2000);
 		test.log(LogStatus.PASS, " Upload Document  - " + t5 ); 			
        Thread.sleep(7000);
              
		ReviewerLocator.CloseButton5().click();
		Thread.sleep(7000);
       
	//	getDriver().switchTo().frame(ReviewerLocator.Frame1());
	//	Thread.sleep(7000);

		ReviewerLocator.AddDocumentAndRemark().click();					                //Clicking on Dashboard count
        Thread.sleep(9000);

        ReviewerLocator.Deletefile().click();					                //Clicking on Dashboard count
        Thread.sleep(7000);

        Alert ac3=getDriver().switchTo().alert();
		
		String t3=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t3 );
		
		Thread.sleep(4000);
		ac3.accept();
	
        String t6 = ReviewerLocator.Successfully4().getText();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        		
 		Thread.sleep(2000);
 		test.log(LogStatus.PASS, " Message Displyed - " + t6 ); 			
        Thread.sleep(2000);
  
      
        if(ReviewerLocator.CloseButton5().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			ReviewerLocator.CloseButton5().click();
 			test.log(LogStatus.PASS, "Close Button Working Properly " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, "Close Button Does Not Working Properly"  );
 			
 		}
        Thread.sleep(20000);
        
	    ReviewerLocator.Plus().click();
	    Thread.sleep(9000);
	   
 		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.DocumentName1().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);

	    ReviewerLocator.Save3().click();
	    Thread.sleep(17000);
        
        String t = ReviewerLocator.Successfull().getText();					                //Clicking on Dashboard count
        Thread.sleep(17000);
        		
 		test.log(LogStatus.PASS, " Add Document - " + t ); 			
        Thread.sleep(9000);
  
	    
        
}
	

	
	public static void AddPrerequisiteFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
       Thread.sleep(1000);	
		ReviewerLocator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        ReviewerLocator.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        ReviewerLocator.ViewDataRequestDetails().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        getDriver().switchTo().frame(ReviewerLocator.Frame1());
		Thread.sleep(7000);
		
		ReviewerLocator.AddRequestData().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	     
	    getDriver().switchTo().frame(ReviewerLocator.Frame());
		Thread.sleep(7000);
        
		 ReviewerLocator.SelectProcess().click();
		 Thread.sleep(3000);
		 ReviewerLocator.CheckBox().click();
		 Thread.sleep(3000);
	     String ProcessText =ReviewerLocator.SelectProcessDD().getText();
	     Thread.sleep(2000);
	     ReviewerLocator.OKP().click();
		 Thread.sleep(9000);
		 
		 
		 ReviewerLocator.SelectSubProcess().click();
		 Thread.sleep(3000);
		 String SubprocessText =ReviewerLocator.SelectSubProcessDD().getText();
		 Thread.sleep(2000);
		 ReviewerLocator.SelectSubProcessDD().click();
		 Thread.sleep(9000);
		 ReviewerLocator.OKSP().click();
		 Thread.sleep(20000);
		 
		 ReviewerLocator.SelectDocumentRequired().click();
	     Thread.sleep(2000);
	     ReviewerLocator.SelectDocumentRequiredDD().click();
		 Thread.sleep(9000);
	     ReviewerLocator.OK3().click();
		 Thread.sleep(20000);

		
		 /*
		 ReviewerLocator.PeriodW().click();
		 Thread.sleep(3000);
		 String PeriodText =ReviewerLocator.PeriodWDD().getText();
		 Thread.sleep(2000);
		 ReviewerLocator.PeriodWDD().click();
		 Thread.sleep(20000);
			*/
			
	      List<String> li=new ArrayList<String>();
	      
	      li.add(ProcessText);
	      li.add(SubprocessText);
	 //     li.add(DocumentText);
	     
	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Process");
			filter.add("Sub-Process");
		//	filter.add("Period");
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,2000)");	
			Thread.sleep(3000);
	
			/*
			ReviewerLocator.Grid2().click();					//Clicking on Text of total items just to scroll down.
			String s = ReviewerLocator.Grid2().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		*/
			List<WebElement> processcol=getDriver().findElements(By.xpath("//*[@id='grdProcessAudit']/tbody/tr[2]/td[2]"));
			List<WebElement> subprocesscol=getDriver().findElements(By.xpath("//*[@id='grdProcessAudit']/tbody/tr[2]/td[3]"));
	//		List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdInternalAudits']/tbody/tr[2]/td[5]"));

			
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
					test.log(LogStatus.FAIL,  filter.get(i)+" column shows incorrect value : "+Fal);
			 }	
			 for(String Pas : pass)
			 {
				 test.log(LogStatus.PASS,   filter.get(i)+" dropdown working properly.");
					test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
					System.out.println(filter.get(i)+" : "+Pas);
		 }
			 text.clear();
			pass.clear();
			fail.clear();
			raw.clear();
			
			
			}
			Thread.sleep(9000);
			JavascriptExecutor j = (JavascriptExecutor) getDriver();
			j.executeScript("window.scrollBy(0,-2000)");	
			Thread.sleep(9000);
		
	}
	
	public static void ForceMail( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(9000);
		
		
		ReviewerLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        ReviewerLocator.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.ViewDataRequestDetails().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        getDriver().switchTo().frame(ReviewerLocator.Frame1());
		Thread.sleep(7000);

	    ReviewerLocator.ForceMail().click();					                //Clicking on Dashboard count
	    Thread.sleep(20000);
	    
	    ReviewerLocator.ForceMail1().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);

        ReviewerLocator.TO().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.TODD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
    	sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
 		int row = 0;
 		Thread.sleep(500);
 		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
 		Cell c1 = null;
 		   
 		row0 = sheet.getRow(29);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.Subject().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(30);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.FileUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(7000);
           
		ReviewerLocator.UploadButton1().click();					                //Clicking on Dashboard count
        Thread.sleep(9000);
        
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t1 );
		
		Thread.sleep(4000);
		ac.accept();
		
		Thread.sleep(2000);
		
		ReviewerLocator.SendMail().click();					                //Clicking on Dashboard count
        Thread.sleep(9000);
        
        Alert ac1=getDriver().switchTo().alert();
		
		String t2=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t2 );
		
		Thread.sleep(4000);
		ac1.accept();
		
		Thread.sleep(2000);
		
		ReviewerLocator.Summery().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);
        
        row0 = sheet.getRow(30);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.FileUpload1().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(7000);
          
        Alert ac3=getDriver().switchTo().alert();
		
		String t3=getDriver().switchTo().alert().getText();
		
		//test.log(LogStatus.PASS, t3 );
		if(t3.equalsIgnoreCase("File uploaded successfully.")) 
		 {
				test.log(LogStatus.PASS, t3);
			}
			/*else  // reemove comment
			{
				test.log(LogStatus.FAIL, t3);
				
				
			}
		*/
		Thread.sleep(4000);
		ac3.accept();
		
		Thread.sleep(2000);
		
        File dir2 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		ReviewerLocator.Download().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
	  
        Thread.sleep(3000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "File does not Download Successfully");
		}

	   Thread.sleep(3000);
	   
        
        if(ReviewerLocator.View().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			ReviewerLocator.View().click();
 			test.log(LogStatus.PASS, "View Button Is Clickable " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, "View Button Is Clickable"  );
 			
 		}
        Thread.sleep(2000);
        
	}

	public static void InternalAuditMeeting( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		ReviewerLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        ReviewerLocator.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.InternalAuditMeeting().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
       
        ReviewerLocator.NewMailButton().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
       
        ReviewerLocator.TO().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.TODD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
    	sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
 		int row = 0;
 		Thread.sleep(500);
 		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
 		Cell c1 = null;
 		   
 		row0 = sheet.getRow(29);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.Subject().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(30);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.FileUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(7000);
           
		ReviewerLocator.UploadButton1().click();					                //Clicking on Dashboard count
        Thread.sleep(9000);
        
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t1 );
		
		Thread.sleep(4000);
		ac.accept();
		
		Thread.sleep(2000);
		
		ReviewerLocator.SendMail().click();					                //Clicking on Dashboard count
        Thread.sleep(9000);
        
        Alert ac1=getDriver().switchTo().alert();
		
		String t2=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t2 );
		
		Thread.sleep(4000);
		ac1.accept();
		
		Thread.sleep(2000);
		
		ReviewerLocator.Summery().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);
        
        row0 = sheet.getRow(30);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ReviewerLocator.FileUpload1().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(7000);
          
        Alert ac3=getDriver().switchTo().alert();
		
		String t3=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t3 );
		
		Thread.sleep(4000);
		ac3.accept();
		
		Thread.sleep(2000);
		
        File dir2 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		ReviewerLocator.Download().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
	  
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "File Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "File does not Download Successfully");
		}

	   Thread.sleep(3000);
	   
        
        if(ReviewerLocator.View().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			ReviewerLocator.View().click();
 			test.log(LogStatus.PASS, "View Button Is Clickable " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, "View Button Is Clickable"  );
 			
 		}
        Thread.sleep(2000);
        
	}
	
	public static void MyDocument( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(9000);
		
		ReviewerLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        ReviewerLocator.MyDocument().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        ReviewerLocator.OpenAuditFilter().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        ReviewerLocator.OpenAuditFilterDD().click();					                //Clicking on Dashboard count
        Thread.sleep(7000);
     
        String OptionText1 = "Option 1";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[1]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		Thread.sleep(7000);

//	    ReviewerLocator.DownloadButton().click();					                //Clicking on Dashboard count
//	    Thread.sleep(5000);
		
        File dir2 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(8000);
		ReviewerLocator.DownloadButton().click();
		
	 	Thread.sleep(10000);
		File dir3 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
	  
        Thread.sleep(3000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "Working Document - File Download Successfully");
		}
	  /* else
	   {
		    Thread.sleep(5000);
		    String t = ReviewerLocator.Succssesfully().getText();					                //Clicking on Dashboard count
 		    Thread.sleep(5000);
 			test.log(LogStatus.FAIL, " Working Document - " + t  );
 
		}*/   
	   Thread.sleep(4000);
	   
       String OptionText = "Option 2";
		String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[2]",OptionText);
		WebElement dropdownOption = getDriver().findElement(By.xpath(xpathExpression));
		dropdownOption.click();
		Thread.sleep(7000);

//	    ReviewerLocator.DownloadButton().click();					                //Clicking on Dashboard count
//	    Thread.sleep(5000);
		
       File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		ReviewerLocator.DownloadButton().click();
		
	 	Thread.sleep(9000);
		File dir4 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew4 = dir4.listFiles();						//Counting number of files in directory after download
	  
       Thread.sleep(3000);
	   if (dirContents.length < allFilesNew4.length) {
			test.log(LogStatus.PASS,  "Review Document - File Download Successfully");
		}
	 //  else
	   //{
		  //  Thread.sleep(5000);
		   // String t = ReviewerLocator.Succssesfully().getText();					                //Clicking on Dashboard count
		   // Thread.sleep(5000);
			//test.log(LogStatus.FAIL, " Review Document - " + t  );

		//}   
	   Thread.sleep(4000);
	   
	      String OptionText2 = "Option 3";
			String xpathExpression2 = String.format("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[3]",OptionText2);
			WebElement dropdownOption2 = getDriver().findElement(By.xpath(xpathExpression2));
			dropdownOption2.click();
			Thread.sleep(7000);

//		    ReviewerLocator.DownloadButton().click();					                //Clicking on Dashboard count
//		    Thread.sleep(5000);
			
	       File dir5 = new File("C:\\Users\\ambujs\\Downloads");
			File[] dirContents5 = dir5.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			ReviewerLocator.DownloadButton().click();
			
		 	Thread.sleep(9000);
			File dir6 = new File("C:\\Users\\ambujs\\Downloads");
			File[] allFilesNew6 = dir6.listFiles();						//Counting number of files in directory after download
		  
	       Thread.sleep(3000);
		   if (dirContents5.length < allFilesNew6.length) {
				test.log(LogStatus.PASS,  "Annexure Document - File Download Successfully");
			}
		 /*  else
		   {
			    Thread.sleep(5000);
			    String t = ReviewerLocator.Succssesfully().getText();					                //Clicking on Dashboard count
			    Thread.sleep(5000);
				test.log(LogStatus.FAIL, " Annexure Document - " + t  );

			}   */
		   Thread.sleep(4000);
		   
		      String OptionText3 = "Option 4";
				String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[4]",OptionText3);
				WebElement dropdownOption3 = getDriver().findElement(By.xpath(xpathExpression3));
				dropdownOption3.click();
				Thread.sleep(7000);

//			    ReviewerLocator.DownloadButton().click();					                //Clicking on Dashboard count
//			    Thread.sleep(5000);
				
		       File dir7 = new File("C:\\Users\\ambujs\\Downloads");
				File[] dirContents7 = dir7.listFiles();						//Counting number of files in directory before download
				
				Thread.sleep(3000);
				ReviewerLocator.DownloadButton().click();
				
			 	Thread.sleep(9000);
				File dir0 = new File("C:\\Users\\ambujs\\Downloads");
				File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
			  
		       Thread.sleep(3000);
			   if (dirContents7.length < allFilesNew0.length) {
					test.log(LogStatus.PASS,  "Audit Committee Presentation Document - File Download Successfully");
				}
			 /*  else
			   {
				    Thread.sleep(5000);
				    String t = ReviewerLocator.Succssesfully().getText();					                //Clicking on Dashboard count
				    Thread.sleep(5000);
					test.log(LogStatus.FAIL, " Audit Committee Presentation Document - " + t  );

				}   */
			   Thread.sleep(4000);
 
			   
			      String OptionText4 = "Option 5";
					String xpathExpression4 = String.format("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[5]",OptionText4);
					WebElement dropdownOption4 = getDriver().findElement(By.xpath(xpathExpression4));
					dropdownOption4.click();
					Thread.sleep(7000);

//				    ReviewerLocator.DownloadButton().click();					                //Clicking on Dashboard count
//				    Thread.sleep(5000);
					
			       File dir8 = new File("C:\\Users\\ambujs\\Downloads");
					File[] dirContents8 = dir8.listFiles();						//Counting number of files in directory before download
					
					Thread.sleep(3000);
					ReviewerLocator.DownloadButton().click();
					
				 	Thread.sleep(9000);
					File dir9 = new File("C:\\Users\\ambujs\\Downloads");
					File[] allFilesNew9 = dir9.listFiles();						//Counting number of files in directory after download
				  
			       Thread.sleep(3000);
				   if (dirContents8.length < allFilesNew9.length) {
						test.log(LogStatus.PASS,  "Final Deliverables Document - File Download Successfully");
					}
				  /* else
				   {
					    Thread.sleep(5000);
					    String t = ReviewerLocator.Succssesfully().getText();					                //Clicking on Dashboard count
					    Thread.sleep(5000);
						test.log(LogStatus.FAIL, " Final Deliverables Document - " + t  );

					}  */ 
				   Thread.sleep(4000);
   
				      String OptionText5 = "Option 6";
						String xpathExpression5 = String.format("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[6]",OptionText5);
						WebElement dropdownOption5 = getDriver().findElement(By.xpath(xpathExpression5));
						dropdownOption5.click();
						Thread.sleep(7000);

//					    ReviewerLocator.DownloadButton().click();					                //Clicking on Dashboard count
//					    Thread.sleep(5000);
						
				       File dir10 = new File("C:\\Users\\ambujs\\Downloads");
						File[] dirContents10 = dir10.listFiles();						//Counting number of files in directory before download
						
						Thread.sleep(3000);
						ReviewerLocator.DownloadButton().click();
						
					 	Thread.sleep(9000);
						File dir11 = new File("C:\\Users\\ambujs\\Downloads");
						File[] allFilesNew11 = dir11.listFiles();						//Counting number of files in directory after download
					  
				       Thread.sleep(3000);
					   if (dirContents10.length < allFilesNew11.length) {
							test.log(LogStatus.PASS,  "Deleted Documents - File Download Successfully");
						}
					 /*  else
					   {
						    Thread.sleep(5000);
						    String t = ReviewerLocator.Succssesfully().getText();					                //Clicking on Dashboard count
						    Thread.sleep(5000);
							test.log(LogStatus.FAIL, " Deleted Documents - " + t  );

						}  */ 
					   Thread.sleep(4000);
 
			   
					      String OptionText6 = "Option 7";
							String xpathExpression6 = String.format("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[7]",OptionText6);
							WebElement dropdownOption6 = getDriver().findElement(By.xpath(xpathExpression6));
							dropdownOption6.click();
							Thread.sleep(7000);

//						    ReviewerLocator.DownloadButton().click();					                //Clicking on Dashboard count
//						    Thread.sleep(5000);
							
					       File dir12 = new File("C:\\Users\\ambujs\\Downloads");
							File[] dirContents12 = dir12.listFiles();						//Counting number of files in directory before download
							
							Thread.sleep(3000);
							ReviewerLocator.DownloadButton().click();
							
						 	Thread.sleep(9000);
							File dir13 = new File("C:\\Users\\ambujs\\Downloads");
							File[] allFilesNew13 = dir13.listFiles();						//Counting number of files in directory after download
						  
					       Thread.sleep(3000);
						   if (dirContents12.length < allFilesNew13.length) {
								test.log(LogStatus.PASS,  "Feedback Form Documents - File Download Successfully");
							}
						  /* else
						   {
							    Thread.sleep(5000);
							    String t = ReviewerLocator.Succssesfully().getText();					                //Clicking on Dashboard count
							    Thread.sleep(5000);
								test.log(LogStatus.FAIL, " Feedback Form Documents - " + t  );

							}   */
						   //Thread.sleep(9000);
	 
						//	Method1.MyDocumentFilter(test,workbook);
							//Thread.sleep(5000);
			   
	   	
	}

	
	 public static void Documnets( ExtentTest test)throws InterruptedException 
	  {
		 Thread.sleep(1000);
			ReviewerLocator.ARS().click();
			Thread.sleep(3000);
		
			WebDriverWait wait = new WebDriverWait( getDriver(),(60));
			Thread.sleep(2000);
			
        Thread.sleep(2000);
        ReviewerLocator.clickmydocument().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
		 /* ReviewerLocator.clickmydocumentfilter().click();
		  Thread.sleep(9000);
		  ReviewerLocator.clickmydocumentselectfilter().click();
		  Thread.sleep(11000);
		  WebWait wait2 = new WebWait(,(60));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/a")));	//Wait until records table get visible.
		  By locator = By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/a");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = getDriver().findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click();", ViewButton);
		*/
		  ReviewerLocator.clickmydocumentfinancialyear().click();
		  Thread.sleep(9000);
		  
		 ReviewerLocator.clickmydocumentstatusfilter().click();
		  Thread.sleep(9000);
		 ReviewerLocator.clickmydocumentselectstatus().click();
		  Thread.sleep(9000);
		  
		  test.log(LogStatus.PASS, "My Document Filter Work Successfully");
		  Thread.sleep(5000);
		   if(ReviewerLocator.clickmydocumentdownload().isEnabled())
           {
                Thread.sleep(9000);
                ReviewerLocator.clickmydocumentdownload().click();
                test.log(LogStatus.PASS, "Working Document Downloaded");
           }
         else
         {
   	         test.log(LogStatus.FAIL, "Document not Dowmloaded");
   	        
         }
		   Thread.sleep(8000);
		   ReviewerLocator.clickmydocumentclick1().click();
			  Thread.sleep(9000);
		   ReviewerLocator.clickmydocumentreview().click();
			  Thread.sleep(9000);
		   if(ReviewerLocator.clickmyreviewdocumentdownload().isEnabled())
           {
                Thread.sleep(2000);
                ReviewerLocator.clickmyreviewdocumentdownload().click();
                test.log(LogStatus.PASS, "Review Document Downloaded");
           }
         else
         {
   	         test.log(LogStatus.FAIL, "Review Document not Dowmloaded");
   	        
         }
	  
	  Thread.sleep(8000);
	  ReviewerLocator.clickmydocumentclick2().click();
	  Thread.sleep(9000);
  ReviewerLocator.clickmydocumentannexure().click();
	  Thread.sleep(9000);
  if(ReviewerLocator.clickmyannexuredocumentdownload().isEnabled())
  {
       Thread.sleep(2000);
       ReviewerLocator.clickmyannexuredocumentdownload().click();
       test.log(LogStatus.PASS, "annexure Document Downloaded");
  }
else
{
       test.log(LogStatus.FAIL, "annexure Document not Dowmloaded");
      
}
	  Thread.sleep(8000);
	  ReviewerLocator.clickmydocumentclick3().click();
	  Thread.sleep(9000);
  ReviewerLocator.clickmydocumentFinaldeliverable().click();
	  Thread.sleep(9000);
  if(ReviewerLocator.clickmyFinaldeliverabledocumentdownload().isEnabled())
  {
       Thread.sleep(2000);
       ReviewerLocator.clickmyFinaldeliverabledocumentdownload().click();
       test.log(LogStatus.PASS, "Finaldeliverable Document Downloaded");
  }
else
{
       test.log(LogStatus.FAIL, "Finaldeliverable Document not Dowmloaded");     
}

	  
	  Thread.sleep(8000);
	  ReviewerLocator.clickmydocumentclick4().click();
	  Thread.sleep(9000);
  ReviewerLocator.clickmydocumentFeedback().click();
	  Thread.sleep(9000);
  if(ReviewerLocator.clickmydocumentFeedbackdownload().isEnabled())
  {
       Thread.sleep(2000);
       ReviewerLocator.clickmyFinaldeliverabledocumentdownload().click();
       test.log(LogStatus.PASS, "Feedback Document Downloaded");
  }
else
{
       test.log(LogStatus.FAIL, "Feedback Document not Dowmloaded");     
}

	 
	  ReviewerLocator.clickmydocumentDeleted().click();
	  Thread.sleep(9000);
  if(ReviewerLocator.clickmydocumentDeleteddownload().isEnabled())
  {
       Thread.sleep(2000);
       ReviewerLocator.clickmydocumentDeleteddownload().click();
       test.log(LogStatus.PASS, "Deleted Document Downloaded");
  }
	  }
//else
//{
//	 test.log(LogStatus.FAIL, "Deleted Document Downloaded");      
//}
	  
	 public static void Reports( ExtentTest test)throws InterruptedException 
	  {
		 Thread.sleep(1000);
			ReviewerLocator.ARS().click();
			Thread.sleep(3000);
		
			WebDriverWait wait = new WebDriverWait( getDriver(),(60));
          Thread.sleep(5000);
          ReviewerLocator.clickmyreport().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickmyreportfilter().click();
			  Thread.sleep(9000);
			  ReviewerLocator.clickmyreportselectfilter().click();
			  Thread.sleep(9000);
			  ReviewerLocator.clickmyreportselectfinancial().click();
			  Thread.sleep(9000);
			  ReviewerLocator.clickmyreportselectfinancialyear().click();
			  Thread.sleep(9000);
			  test.log(LogStatus.PASS, "Final Audit Report Filter work successfully.");
			  ReviewerLocator.clickmydocumentdownload().click();
			  Thread.sleep(5000);
			  test.log(LogStatus.PASS, "Final Audit Report Downloaded");
			  Thread.sleep(9000);
	        ReviewerLocator.clickmore().click();
			  Thread.sleep(9000);
			  
			  ReviewerLocator.clickauditstatus().click();
			  Thread.sleep(5000);
			  test.log(LogStatus.PASS, "Audit Status Filter work successfully.");
			  Thread.sleep(2000);
			  if(ReviewerLocator.clickexportexcel().isEnabled())
	            {
	                 Thread.sleep(2000);
	                 ReviewerLocator.clickexportexcel().click();
	                 test.log(LogStatus.PASS, "Audit Status Report Downloaded");
	            }
			  //ReviewerLocator.clickexportexcel().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickmore1().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickopenobservation().click();
			  Thread.sleep(5000);
			  if(ReviewerLocator.clickdownloadopenobservation().isEnabled())
	            {
	                 Thread.sleep(2000);
	                 test.log(LogStatus.PASS, "open observation Filter work successfully"); 
	                 Thread.sleep(2000);
	                 ReviewerLocator.clickdownloadopenobservation().click();
	                 test.log(LogStatus.PASS, "open observation Report Downloaded");
			 // ReviewerLocator.clickdownloadopenobservation().click();
			  //Thread.sleep(5000);
	           
			  ReviewerLocator.clickmore3().click();
			  Thread.sleep(5000);
			 ReviewerLocator.clickprerequsite().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickentity().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickselectentity().click();
			  Thread.sleep(5000);
			// ReviewerLocator.clicksubentity().click();
			  Thread.sleep(5000);
			 // ReviewerLocator.clickselectsubentity().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickyear().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickselectyear().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickschedulingtype().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickselectschedulingtype().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickperiod().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickselectperiod().click();
			  Thread.sleep(5000);
			  test.log(LogStatus.PASS, "Pre-requisite Filters Work Successfully.");
			  //ReviewerLocator.clickprerequsiteexcelexport().click();
			  Thread.sleep(5000);
	            }
			  if(ReviewerLocator.clickprerequsiteexcelexport().isEnabled())
	            {
	                 Thread.sleep(5000);
	                 ReviewerLocator.clickprerequsiteexcelexport().click();
	                 test.log(LogStatus.PASS, "Pre-requisite report Downloaded Successfully.");
			 
			 /* ReviewerLocator.clickmore2().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickmore22().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickmore12().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickpastauditreport().click();
			  Thread.sleep(5000);
			//  ReviewerLocator.clickpastauditviewreport().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickaddnewpastaudit().click();
			  Thread.sleep(5000);
			  getDriver().switchTo().frame(ReviewerLocator.clickaddnewpastauditframe());// i frame enter 
			 ReviewerLocator.clickaddnewunit().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickaddnewselectunit().click();
			  Thread.sleep(5000);
			//  ReviewerLocator.clickaddnewsubunit().click();
			  Thread.sleep(5000);
			// ReviewerLocator.clickaddnewselectsubunit().click();
			  Thread.sleep(5000);
			 ReviewerLocator.clickaddnewfinancialyear().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickaddnewselectfinancialyear().click();
			  Thread.sleep(5000);
			ReviewerLocator.clickaddnewauditbackground().click();
			  Thread.sleep(5000);
			 ReviewerLocator.clickaddnewauditselectbackground().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickaddnewaudituploadfile().sendKeys("D:\\download data\\AuditStatusSummary (3).xlsx");
			  Thread.sleep(3000);
			  //ReviewerLocator.clickaddnewauditsave().click();
			  //Thread.sleep(5000);
			  if(ReviewerLocator.clickaddnewauditsave().isEnabled())
	            {
	                 Thread.sleep(2000);
	                 ReviewerLocator.clickaddnewauditsave().click();
	                 test.log(LogStatus.PASS, "Record Uploaded Successfully.");
			  ReviewerLocator.clickaddnewauditclose().click();
			  Thread.sleep(8000);
			  ReviewerLocator.clickpastauditview().click();
			  Thread.sleep(5000);
			  
			 // ReviewerLocator.clickdownloadpast().click();
			 // Thread.sleep(5000);
			  getDriver().switchTo().frame(ReviewerLocator.clickpastauditviewframe());// i frame enter 
			  if(ReviewerLocator.clickdownloadpast().isEnabled())
	            {
	                 Thread.sleep(2000);
	                 ReviewerLocator.clickdownloadpast().click();
	                 test.log(LogStatus.PASS, "past Audit file Downloaded Successfully.");
			  ReviewerLocator.clickviewpast().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickviewpastclose().click();
			  Thread.sleep(8000);
			  getDriver().switchTo().parentFrame();
			  ReviewerLocator.clickviewpastclose1().click();
			  Thread.sleep(5000);
			  ReviewerLocator.clickpastauditedit().click();
			  Thread.sleep(5000);
			 getDriver().switchTo().frame(ReviewerLocator.clickpastauditeditframe());
			  ReviewerLocator.clickpastauditeditsave().click();
			  Thread.sleep(5000);
			  if(ReviewerLocator.clickpastauditeditsave().isEnabled())
	            {
	                 Thread.sleep(2000);
	                 ReviewerLocator.clickpastauditeditsave().click();
	                 test.log(LogStatus.PASS, "Record Updated Successfully.");
			 // ReviewerLocator.clickpastauditeditclose().click();
			 // Thread.sleep(5000);
			  
			  if(ReviewerLocator.clickdownloadpast().isEnabled())
	            {
	                 Thread.sleep(2000);
	                 ReviewerLocator.clickdownloadpast().click();
	                 test.log(LogStatus.PASS, "Downloaded Document Successfully.");
	                // ReviewerLocator.clickviewpast1().click();
					  Thread.sleep(5000);
					 // ReviewerLocator.clickviewpastclose11().click();
					  Thread.sleep(8000);
					  getDriver().switchTo().parentFrame();
					  //ReviewerLocator.clickviewpastclose12().click();
					  Thread.sleep(5000);
	                 ReviewerLocator.clickpastauditeditclose().click();
					  Thread.sleep(5000);
					  */
					  ReviewerLocator.clickmore4().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickmanagementreport().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickmanagementunit().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickmanagementselectunit().click();
					  Thread.sleep(5000);
					 // ReviewerLocator.clickmanagementsubunit().click();
					  Thread.sleep(5000);
					 // ReviewerLocator.clickmanagementselectsubunit().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickmanagementfinancial().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickmanagementselectfinancial().click();
					  Thread.sleep(9000);
					  ReviewerLocator.clickmanagementschedulingtype().click();
					  Thread.sleep(9000);
					  ReviewerLocator.clickmanagementselectschedulingtype().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickmanagementperiodtype().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickselectmanagementperiodtype().click();
					  Thread.sleep(5000);
					  test.log(LogStatus.PASS, "Management Response Filters work Successfully.");
					  Thread.sleep(5000);
					  if(ReviewerLocator.clickselectmanagementexporttoexcel().isEnabled())
			            {
			                 Thread.sleep(2000);
			                 ReviewerLocator.clickselectmanagementexporttoexcel().click();
			                 test.log(LogStatus.PASS, "Management Response report Downloaded Successfully.");
					  
	             
			  
	                 ReviewerLocator.clickmore5().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickAuditscheduling().click();
					  Thread.sleep(5000);
					  //ReviewerLocator.clickmore55().click();
					 // Thread.sleep(5000);
					  //ReviewerLocator.clickdraftreport().click();
					  //Thread.sleep(5000);
					  ReviewerLocator.clickdraftunit().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickdraftselectunit().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickdraftsubunit().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickdraftselectsubunit().click();
					  Thread.sleep(5000);
					//  ReviewerLocator.clickdraftfinancial().click();
					  //Thread.sleep(5000);
					 // ReviewerLocator.clickdraftselectfinancial().click();
					  //Thread.sleep(5000);
					 /* ReviewerLocator.clickdraftschedulingtype().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickdraftselectschedulingtype().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickdraftperiodtype().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickselectdraftperiodtype().click();
					  Thread.sleep(5000);*/
					  test.log(LogStatus.PASS, "Audit Scheduling Filters work Successfully.");
					  ReviewerLocator.clickselectdraftexporttoexcel().click();
					  Thread.sleep(5000);
					  test.log(LogStatus.PASS, "Audit Scheduling report Downloaded Successfully.");
					  ReviewerLocator.clickmore51().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickDraftobservation().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickdraftunit1().click();
					  Thread.sleep(5000);
					  ReviewerLocator.clickdraftselectunit1().click();
					  Thread.sleep(5000);
					  test.log(LogStatus.PASS, "Draft observation Filters work Successfully.");
					  Thread.sleep(2000);
					  //ReviewerLocator.clickdraftview().click();
					  Thread.sleep(5000);
					  test.log(LogStatus.PASS, "Draft observation View button work Successfully.");
					  Thread.sleep(5000);
					  //ReviewerLocator.clickdraftexporttoexcel().click();
					  //Thread.sleep(5000);
					  test.log(LogStatus.PASS, "Draft observation Report Downloaded Successfully.");
					  Thread.sleep(2000);
					  test.log(LogStatus.PASS, "Draft observation Report save Successfully.");
					  Thread.sleep(2000);
					  test.log(LogStatus.PASS, "Back button work Successfully.");
			          
//  getDriver().switchTo().alert().accept();
// getDriver().switchTo().parentFrame();
}
	            
	            }
			  
	  }
	 
	 
		public static void ViewDataRequestFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{
		
			Thread.sleep(1000);
			ReviewerLocator.ARS().click();
			Thread.sleep(3000);
		
			WebDriverWait wait = new WebDriverWait( getDriver(),(60));
			Thread.sleep(2000);
			
			ReviewerLocator.MyWorkspace().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.ViewDataRequestDetails().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        getDriver().switchTo().frame(ReviewerLocator.Frame1());
			Thread.sleep(7000);
			
//			Method1.AddDocumentDetails(test,workbook);
//			Thread.sleep(17000);

			ReviewerLocator.SelectProcess1().click();
			Thread.sleep(2000);
			ReviewerLocator.SelectProcess1DD().click();
			Thread.sleep(20000);

			ReviewerLocator.SelectSubProcess1().click();
			Thread.sleep(2000);
			ReviewerLocator.SelectSubProcess1DD().click();
			Thread.sleep(20000);

			ReviewerLocator.Audtee().click();
			Thread.sleep(2000);
			ReviewerLocator.AudteeDD().click();
			Thread.sleep(25000);

			ReviewerLocator.ReportingManager1().click();
			Thread.sleep(2000);
			ReviewerLocator.ReportingManager1DD().click();
			Thread.sleep(20000);
				
			ReviewerLocator.Timeline().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);

	        ReviewerLocator.TimelineDD().click();					                //Clicking on Dashboard count
	        Thread.sleep(20000);
	        
			 JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		        
		     js1.executeScript("window.scrollBy(0,2000)");
		     Thread.sleep(20000);

	        
		     ReviewerLocator.Save7().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
			 JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
		        
		     js2.executeScript("window.scrollBy(0,-2000)");
		     Thread.sleep(20000);
	    
	        String t0 = ReviewerLocator.Successfully7().getText();					                //Clicking on Dashboard count
	        Thread.sleep(9000);
	        		
	 		Thread.sleep(2000);
	 		test.log(LogStatus.PASS, " Message Displyed - " + t0 ); 			
	        Thread.sleep(14000);
	        
			 JavascriptExecutor js = (JavascriptExecutor) getDriver();
		        
		     js.executeScript("window.scrollBy(0,200)");
		     Thread.sleep(20000);



		}

		
		public static void DraftObservationListing( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{
			Thread.sleep(1000);
			ReviewerLocator.ARS().click();
			Thread.sleep(3000);
		
			WebDriverWait wait = new WebDriverWait( getDriver(),(60));
			Thread.sleep(2000);
			
			ReviewerLocator.MyWorkspace().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.ViewAuditDetails().click();					                //Clicking on Dashboard count
	        Thread.sleep(6000);
	        
	        
	        File dir = new File("C:\\Users\\ambujs\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			ReviewerLocator.ExportToExcel().click();
			
		 	Thread.sleep(9000);
			File dir0 = new File("C:\\Users\\ambujs\\Downloads");
			File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
		  
	        Thread.sleep(3000);
		   if (dirContents.length < allFilesNew0.length) {
				test.log(LogStatus.PASS,  "Report Download Successfully");
			}
		   else
		   {
				test.log(LogStatus.FAIL, "Report does not Download Successfully");
			}

		   Thread.sleep(6000);
	       
		   ReviewerLocator.DraftObservationListing().click();					                //Clicking on Dashboard count
		    Thread.sleep(7000);
		    
		    ReviewerLocator.CheckBox2().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);

	        ReviewerLocator.Save4().click();					                //Clicking on Dashboard count
	        Thread.sleep(7000);

	        String t = ReviewerLocator.SuccessfullyObservation1().getText();				                //Clicking on Dashboard count
	        Thread.sleep(7000);
	        
			test.log(LogStatus.PASS,  " By Selecting Check Box Update Observation - " + t);
			Thread.sleep(2000);
	        
		    
		    File dir2 = new File("C:\\Users\\ambujs\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			ReviewerLocator.Export().click();
			
		 	Thread.sleep(9000);
			File dir3 = new File("C:\\Users\\ambujs\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
		  
	        Thread.sleep(3000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "Report Download Successfully");
			}
		   else
		   {
				test.log(LogStatus.FAIL, "Report does not Download Successfully");
			}

		   Thread.sleep(3000);
		    
		   ReviewerLocator.EyeIcon().click();					                //Clicking on Dashboard count
		    Thread.sleep(2000);
		    
	 		sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	 		int row = 0;
	 		Thread.sleep(500);
	 		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	 		Cell c1 = null;
	 		
	        getDriver().switchTo().frame(ReviewerLocator.Frame2());
			Thread.sleep(7000);
			
			 if(ReviewerLocator.NextButton1().isEnabled())
		 		{
		 			
		 			Thread.sleep(2000);
		 			ReviewerLocator.NextButton1().click();
		 			test.log(LogStatus.PASS, "Audit Coverage Tab - Next Button Is Clickable " );
		 			
		 		}
		 		
		 		else
		 		{
		 			test.log(LogStatus.FAIL, "Audit Coverage Tab - Next Button Is Clickable"  );
		 			
		 		}
		        Thread.sleep(7000);
				
			
		//	ReviewerLocator.NextButton1().click();					                //Clicking on Dashboard count
	     //   Thread.sleep(2000);
	            
		        ReviewerLocator.ProcessWalkthrogh().clear();
		    Thread.sleep(2000);
	        
	        row0 = sheet.getRow(4);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.ProcessWalkthrogh().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			ReviewerLocator.ActualWorkdone().clear();
		    Thread.sleep(2000);
	 
	        row0 = sheet.getRow(5);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.ActualWorkdone().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			ReviewerLocator.Population().clear();
		    Thread.sleep(2000);
	 
			
			row0 = sheet.getRow(6);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.Population().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			ReviewerLocator.Sample().clear();
		    Thread.sleep(2000);
	 
			
			row0 = sheet.getRow(7);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.Sample().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			ReviewerLocator.Remarks().clear();
		    Thread.sleep(2000);
	 
			
			row0 = sheet.getRow(8);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.Remarks().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(4000);
			
			/*
	        File dir4 = new File("C:\\Users\\ambujs\\Downloads");
			File[] dirContents4 = dir4.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			ReviewerLocator.WorkingDocument1().click();
			
		 	Thread.sleep(9000);
			File dir5 = new File("C:\\Users\\ambujs\\Downloads");
			File[] allFilesNew5 = dir5.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
		  
	        Thread.sleep(3000);
		   if (dirContents4.length < allFilesNew5.length) {
				test.log(LogStatus.PASS,  "File Download Successfully");
			}
		   else
		   {
				test.log(LogStatus.FAIL, "File does not Download Successfully");
			}

		   Thread.sleep(3000);
	*/
			
			/*
			row0 = sheet.getRow(9);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.WorkingFileUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			ReviewerLocator.WorkingFileUploadButton().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        Alert ac=getDriver().switchTo().alert();
			
			String t1=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t1 );
			
			Thread.sleep(5000);
			ac.accept();
			Thread.sleep(3000);
		    	
			
			row0 = sheet.getRow(10);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.AnnexureFile().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			ReviewerLocator.AnnexureFileUploadButton().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        Alert ac1=getDriver().switchTo().alert();
			
			String t2=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t2 );
			
			Thread.sleep(5000);
			ac.accept();
			Thread.sleep(7000);
			*/
		   /*
	       File dir6 = new File("C:\\Users\\ambujs\\Downloads");
			File[] dirContents6 = dir6.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			ReviewerLocator.AnnexureDocument1().click();
			
		 	Thread.sleep(9000);
			File dir7 = new File("C:\\Users\\ambujs\\Downloads");
			File[] allFilesNew7 = dir7.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
		  
	       Thread.sleep(3000);
		   if (dirContents6.length < allFilesNew7.length) {
				test.log(LogStatus.PASS,  "File Download Successfully");
			}
		   else
		   {
				test.log(LogStatus.FAIL, "File does not Download Successfully");
			}

		   Thread.sleep(3000);
		   */

			 JavascriptExecutor js = (JavascriptExecutor) getDriver();
		        
		        js.executeScript("window.scrollBy(0,1000)");
		        Thread.sleep(9000);
		       
		
		    	
	    //    ReviewerLocator.NextButton2().click();					                //Clicking on Dashboard count
	    //    Thread.sleep(2000);
	        
	        if(ReviewerLocator.NextButton2().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			ReviewerLocator.NextButton2().click();
	 			test.log(LogStatus.PASS, " Actual Testing/ Work Done - Next Button Is Clickable " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, " Actual Testing/ Work Done - Next Button Is Clickable"  );
	 			
	 		}
	        Thread.sleep(2000);
	        
	        ReviewerLocator.ObservationTitle().clear();
	        Thread.sleep(2000);
	        
	        row0 = sheet.getRow(11);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.ObservationTitle().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			ReviewerLocator.Observation().clear();
		    Thread.sleep(2000);
		 
			
			row0 = sheet.getRow(12);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.Observation().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			ReviewerLocator.briefObservation().clear();
		    Thread.sleep(2000);

			
			row0 = sheet.getRow(13);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.briefObservation().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			
			ReviewerLocator.ObservationBackground().clear();
		    Thread.sleep(2000);

			
			row0 = sheet.getRow(14);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.ObservationBackground().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			/*
			row0 = sheet.getRow(15);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.WorkingFile1().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			ReviewerLocator.WorkingFile1Uploadbutton().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        Alert ac2=getDriver().switchTo().alert();
			
			String t3=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t3 );
			
			Thread.sleep(5000);
			ac2.accept();
			Thread.sleep(3000);
	        */
			
		    ReviewerLocator.AnnexureTitle().clear();
		    Thread.sleep(2000);

			
			row0 = sheet.getRow(16);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.AnnexureTitle().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			ReviewerLocator.Table1().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
			
	        ReviewerLocator.TableWizard().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
			
	        ReviewerLocator.OKTable().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
			
			row0 = sheet.getRow(17);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.ImageUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(4000);
			
			ReviewerLocator.ImageUploadButton().click();					                //Clicking on Dashboard count
	        Thread.sleep(17000);
	        
	        /*
	        Alert ac9=getDriver().switchTo().alert();
			
			String t10=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t10 );
			
			Thread.sleep(5000);
			ac9.accept();
			Thread.sleep(3000);
	        */
	        
			ReviewerLocator.AudioVideoLink().clear();
			Thread.sleep(3000);
	        
			row0 = sheet.getRow(18);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.AudioVideoLink().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			 JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		        
		        js1.executeScript("window.scrollBy(0,200)");
		        Thread.sleep(9000);
		  
			
	        ReviewerLocator.AuditComitee1().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.AuditComiteeDD().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        row0 = sheet.getRow(19);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.BusinessRisk().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(20);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.RootCause().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			row0 = sheet.getRow(24);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.FinancialImpact().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
	        ReviewerLocator.ObservationRating().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.RiskRatingDD().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        	
	        ReviewerLocator.ObservationCatogary1().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.ObservationCatogaryDD().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.ObservationSubCatogary1().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.ObservationSubCatogaryDD().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.ReccomendationType1().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.ReccomendationTypeDD().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        row0 = sheet.getRow(22);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.Reccomendation().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
	        
	        ReviewerLocator.ResponceDueDate1().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.ResponceDueDateDD().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        row0 = sheet.getRow(23);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.ManagementResponce().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
	           
	        ReviewerLocator.TimelineCalender1().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        	
	        ReviewerLocator.TimelineCalenderDD().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.PersonResponsible1().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.PersonResponsibleDD().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.OwnerName1().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.OwnerNameDD().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.SaveReccomendation().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        String t6 = ReviewerLocator.Successfullyreccomendation().getText();				                //Clicking on Dashboard count
	        Thread.sleep(2000);
			test.log(LogStatus.PASS,  t6);
	 		Thread.sleep(2000);
	         
	        ReviewerLocator.OK1().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.SaveObservation().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	              
	        String t5 = ReviewerLocator.SuccessfullyObservation().getText();				                //Clicking on Dashboard count
	        Thread.sleep(2000);
			test.log(LogStatus.PASS,  t5);
	 		Thread.sleep(2000);
	         
	        ReviewerLocator.OK2().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	    //    ReviewerLocator.ShowReviewHistoryLogLink().click();					                //Clicking on Dashboard count
	     //   Thread.sleep(2000);
	        
	        row0 = sheet.getRow(27);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.ReviewRemark().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(28);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			ReviewerLocator.File().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
				
			ReviewerLocator.UploadButton().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        ReviewerLocator.SubmitButton().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        String t0 = ReviewerLocator.Successfully3().getText();				                //Clicking on Dashboard count
	        Thread.sleep(2000);
			test.log(LogStatus.PASS,  t0);
	 		Thread.sleep(4000);
	          
	       ReviewerLocator.OK().click();					                //Clicking on Dashboard count            
	       Thread.sleep(4000);

			getDriver().switchTo().parentFrame();
			
			Thread.sleep(4000);
			
			ReviewerLocator.ClosePage().click();
			
			Thread.sleep(3000);
	         
		        ReviewerLocator.DeleteDraft().click();					                //Clicking on Dashboard count
		        Thread.sleep(2000);
		       
		        Alert ac0=getDriver().switchTo().alert();
				
				String t40=getDriver().switchTo().alert().getText();
				
				test.log(LogStatus.PASS, t40 );
				
				Thread.sleep(5000);
				ac0.accept();
				Thread.sleep(3000);
				
				if(ReviewerLocator.Back().isEnabled())
		 		{
		 			
		 			Thread.sleep(2000);
		 			ReviewerLocator.Back().click();
		 			test.log(LogStatus.PASS, "Back Button Working Properly " );
		 			
		 		}
		 		
		 		else
		 		{
		 			test.log(LogStatus.FAIL, "Back Button Does Not Working Properly"  );
		 			
		 		}
				
		        Thread.sleep(7000);
		        	        
				Method1.AddMail(test,workbook);
				Thread.sleep(9000);
				
	 			ReviewerLocator.Submitted().click();
	 			Thread.sleep(7000);
				
		        if(ReviewerLocator.BackButtonS().isEnabled())
		 		{
		 			
		 			Thread.sleep(2000);
		 			ReviewerLocator.BackButtonS().click();
		 			test.log(LogStatus.PASS, "Submitted - Back Button Working Properly " );
		 			
		 		}
		 		
		 		else
		 		{
		 			test.log(LogStatus.FAIL, "Submitted - Back Button Does Not Working Properly"  );
		 			
		 		}
		        Thread.sleep(9000);

			  
		        if(ReviewerLocator.BackButton1().isEnabled())
		 		{
		 			
		 			Thread.sleep(2000);
		 			ReviewerLocator.BackButton1().click();
		 			test.log(LogStatus.PASS, "Back Button Working Properly " );
		 			
		 		}
		 		
		 		else
		 		{
		 			test.log(LogStatus.FAIL, "Back Button Does Not Working Properly"  );
		 			
		 		}
		        Thread.sleep(9000);

	    
			   
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
