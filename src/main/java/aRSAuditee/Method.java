package aRSAuditee;

import java.io.File;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import login.BasePage;


public class Method extends BasePage{
	
	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	
	
	public static void ARS( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{

		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
		
		
		
		
		
	}
	
	
	
	public static void OpenAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator.OpenAudit().getText());	//Reading Dashboard count.
        Locator.OpenAudit().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdDrillDown']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
	
	
	
	public static void OpenAuditSubmitted( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		
        Locator.OpenAudit().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        Locator.managementResponce().clear();	      
 		Thread.sleep(2000);
 		
 		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(11);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.managementResponce().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		Locator.TimeLine().clear();	      
 		Thread.sleep(2000);
 		
 		row0 = sheet.getRow(12);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.TimeLine().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
        Locator.CheckBox().click();	      
 		Thread.sleep(2000);
 		Locator.SaveOpen().click();
 		Thread.sleep(3000);
 		
 		String t1 = Locator.Successfully1().getText();	      
 		Thread.sleep(2000);
    	test.log(LogStatus.PASS, t1 );
 		Thread.sleep(2000);
	    
	}
	
	
	
	
	
	public static void OpenAuditSubmitted1( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		
        Locator.OpenAudit().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        Locator.OpenAuditChangeStatus().click();
		Thread.sleep(3000);
	
		getDriver().switchTo().frame(Locator.Frame());
		Thread.sleep(7000);
	
 		Locator.ObservationsTab().click();	      
 		Thread.sleep(2000);
    	 
 	//	Locator.ObservationsTab().click();	      
 	//	Thread.sleep(2000);
 		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,2560)");
        Thread.sleep(5000);
        
        sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
			
		row0 = sheet.getRow(13);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		if(Locator.Upload().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.Upload().click();
 			test.log(LogStatus.PASS, "File Upload Successfully " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " File Does Not Upload Sucessfully"  );
 			
 		}
        
        Thread.sleep(2000);
 		Locator.SaveObservation().click();
 		Thread.sleep(2000); 
 		
 		String t1 = Locator.SaveObservation().getText();
 		test.log(LogStatus.PASS, t1 );
 		Thread.sleep(2000); 
 		
 		Locator.OK().click();
 		Thread.sleep(2000);
 		/*
        if(Locator.Submit().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.Submit().click();
 			test.log(LogStatus.PASS, "Save Sucessfully " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Does Not Save Sucessfully"  );
 			
 		}
        Thread.sleep(2000); 
 		*/
	}
	
	
	
	
	
	
	
	
	public static void OpenAuditStepPerform( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.OpenAudit().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(9000);
		 
		Locator.OpenAuditChangeStatus().click();
		Thread.sleep(3000);
	
		getDriver().switchTo().frame(Locator.Frame());
		Thread.sleep(5000);
	
		Locator.AuditCoverage().click();
		Thread.sleep(3000);
	
		if(Locator.Next().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.Next().click();
 			test.log(LogStatus.PASS, "Audit Coverage Tab - Next Button Working Properly " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Audit Coverage Tab - Next Button Does Not Working Properly"  );
 			
 		}
    	 
    	 
 		Thread.sleep(2000);
    	 
 		Locator.ActualTestingWorkDoneTab().click();
		Thread.sleep(3000);
		
		 JavascriptExecutor js = (JavascriptExecutor) getDriver();
	        
	        js.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(2000);
	        
	
		if(Locator.Next2().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.Next2().click();
 			test.log(LogStatus.PASS, " Actual Testing/ Work Done Tab - Next Button Working Properly " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Actual Testing/ Work Done Tab - Next Button Does Not Working Properly"  );
 			
 		}
    	  
 		Thread.sleep(2000);
 		Locator.ObservationsTab().click();
		Thread.sleep(3000);
		
	//	Locator.ViewButton().click();
	//	Thread.sleep(3000);
		
		
		
		if(Locator.ViewButton().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.ViewButton().click();
 			test.log(LogStatus.PASS, " Observation Table - Document Does Not View Successfully " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Observation Table - Document Does Not View Successfully"  );
 			
 		}
 		
 		
    	
		Thread.sleep(3000);
		 JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	        
	        js1.executeScript("window.scrollBy(0,1800)");
	        Thread.sleep(4000);
	     
	//	Locator.ViewButton1().click();
		
		
		if(Locator.ViewButton1().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.ViewButton1().click();
 			test.log(LogStatus.PASS, " Recomendation Table - Document Does Not View Successfully " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Recomendation Table - Document Does Not View Successfully"  );
 			
 		}
    	
		
		Thread.sleep(3000);
		Locator.ViewButton2().click();
		Thread.sleep(4000);
		
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, " Audit Log Table - View Button - " + t1 );
		
		Thread.sleep(5000);
		ac.accept();
		Thread.sleep(3000);
	    	
		Locator.Close().click();
		Thread.sleep(2000);
		
		Locator.DownloadButton().click();
		Thread.sleep(4000);
		
        Alert ac1=getDriver().switchTo().alert();
		
		String t=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, "Audit Log - Download Button - " + t );
		
		Thread.sleep(5000);
		ac1.accept();
		Thread.sleep(3000);
	    	
		/*
		if(Locator.ViewButton2().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.ViewButton2().click();
 			test.log(LogStatus.PASS, " Audit Log Table - View Button Is Clickable " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Audit Log Table - View Button Does not Is Clickabl"  );
 			
 		}
    	
    	*/
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		Locator.View3().click();
		Thread.sleep(2000);
		
        Alert ac2=getDriver().switchTo().alert();
		
		String t2=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, " Review History Table - View Button - " + t2 );
		
		Thread.sleep(5000);
		ac.accept();
		Thread.sleep(3000);
	    	
		Locator.Close().click();
		Thread.sleep(2000);
		
		Locator.Download1().click();
		Thread.sleep(2000);
		
        Alert ac3=getDriver().switchTo().alert();
		
		String t3=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, " Review History Table - Download Button - " + t3 );
		
		Thread.sleep(5000);
		ac1.accept();
		Thread.sleep(3000);
	    	
		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator.ClosePage().click();
		
		Thread.sleep(2000);
		
	    
	}
	
	
	public static void OpenAuditStepUserCreated( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.OpenAudit().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(9000);
		 
		Locator.OpenAuditChangeStatus().click();
		Thread.sleep(3000);
	
		getDriver().switchTo().frame(Locator.Frame());
		Thread.sleep(5000);
	
		Locator.ObservationsTab().click();
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	        
	    js1.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(3000);
	    
	    Locator.PlusIcon().click();
		Thread.sleep(3000);
		
		getDriver().switchTo().frame(Locator.Frame1());
		Thread.sleep(5000);
	
		Locator.Save().click();
		Thread.sleep(3000);
	   
		String t4 = Locator.Successfull1().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Without Enter Data - " +  t4 );

		Thread.sleep(3000);
		
	   
	    sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		/*
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row1 = 0;
		Thread.sleep(500);
		Row row2 = sheet.getRow(row1); // Selected 0th index row (First row)
		Cell c2 = (Cell) null;
			*/		
					
		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.FirstName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(4);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.LastName().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(5);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Designation().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(6);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Email().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		
		row0 = sheet.getRow(7);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ContactNo().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		/*
		row2 = sheet.getRow(8);
		c2 = row2.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.ContactNo().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		*/
		
		Locator.Save().click();
		Thread.sleep(3000);
	   
	
		
		String t5 = Locator.Successfully().getText();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  t5 );

		Thread.sleep(3000);
		
		if(Locator.Cancel().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator.Cancel().click();
 			test.log(LogStatus.PASS, " Close Button Working Properly " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Close Button Does Not Working Properly"  );
 			
 		}
    	
		Thread.sleep(3000);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void SubmitAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator.SubmitAudit().getText());	//Reading Dashboard count.
        Locator.SubmitAudit().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdDrillDown']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
	
	
	
	
	
	
	public static void commentAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator.commentAudit().getText());	//Reading Dashboard count.
        Locator.commentAudit().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdDrillDown']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
	
	
	
	
	
	
	public static void OpenAuditFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
       Thread.sleep(1000);	
		Locator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        Locator.OpenAudit().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
		 Locator.Company().click();
		 Thread.sleep(3000);
	     String CompanyText =Locator.Company2DD().getText();
	     Thread.sleep(2000);
	     Locator.Company2DD().click();
		 Thread.sleep(20000);
		 
		 /*
		 Locator1.FinancialYearW().click();
		 Thread.sleep(3000);
		 String FinancialyearText =Locator1.FinancialYearWDD().getText();
		 Thread.sleep(2000);
		 Locator1.FinancialYearWDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.FrequencyW().click();
	     Thread.sleep(2000);
	     Locator1.FrequencyWDD().click();
		 Thread.sleep(20000);
		
		 Locator1.PeriodW().click();
		 Thread.sleep(3000);
		 String PeriodText =Locator1.PeriodWDD().getText();
		 Thread.sleep(2000);
		 Locator1.PeriodWDD().click();
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
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdDrillDown']/tbody/tr[2]/td[2]"));
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
	
	
	
	
	
	
	public static void MyWorkspaceAuditFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
       Thread.sleep(1000);	
		Locator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        Locator.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
		 Locator.Company().click();
		 Thread.sleep(3000);
	     String CompanyText =Locator.Company2DD().getText();
	     Thread.sleep(2000);
	     Locator.Company2DD().click();
		 Thread.sleep(20000);
		 
		 /*
		 Locator1.FinancialYearW().click();
		 Thread.sleep(3000);
		 String FinancialyearText =Locator1.FinancialYearWDD().getText();
		 Thread.sleep(2000);
		 Locator1.FinancialYearWDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.FrequencyW().click();
	     Thread.sleep(2000);
	     Locator1.FrequencyWDD().click();
		 Thread.sleep(20000);
		
		 Locator1.PeriodW().click();
		 Thread.sleep(3000);
		 String PeriodText =Locator1.PeriodWDD().getText();
		 Thread.sleep(2000);
		 Locator1.PeriodWDD().click();
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
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdDrillDown']/tbody/tr[2]/td[2]"));
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
	
	
	
	
	
	
	
	
	
	
	
	public static void SubmitFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
       Thread.sleep(1000);	
		Locator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        Locator.SubmitAudit().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
		 Locator.Company().click();
		 Thread.sleep(3000);
	     String CompanyText =Locator.CompanyDD().getText();
	     Thread.sleep(2000);
	     Locator.CompanyDD().click();
		 Thread.sleep(20000);
		 
		 /*
		 Locator1.FinancialYearW().click();
		 Thread.sleep(3000);
		 String FinancialyearText =Locator1.FinancialYearWDD().getText();
		 Thread.sleep(2000);
		 Locator1.FinancialYearWDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.FrequencyW().click();
	     Thread.sleep(2000);
	     Locator1.FrequencyWDD().click();
		 Thread.sleep(20000);
		
		 Locator1.PeriodW().click();
		 Thread.sleep(3000);
		 String PeriodText =Locator1.PeriodWDD().getText();
		 Thread.sleep(2000);
		 Locator1.PeriodWDD().click();
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
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdDrillDown']/tbody/tr[2]/td[2]"));
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
	
	
	
	
	
	
	
	
	public static void CommentFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
       Thread.sleep(1000);	
		Locator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        Locator.commentAudit().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
		 Locator.Company().click();
		 Thread.sleep(3000);
	     String CompanyText =Locator.Company2DD().getText();
	     Thread.sleep(2000);
	     Locator.Company2DD().click();
		 Thread.sleep(9000);
		 
		 /*
		 Locator1.FinancialYearW().click();
		 Thread.sleep(3000);
		 String FinancialyearText =Locator1.FinancialYearWDD().getText();
		 Thread.sleep(2000);
		 Locator1.FinancialYearWDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.FrequencyW().click();
	     Thread.sleep(2000);
	     Locator1.FrequencyWDD().click();
		 Thread.sleep(20000);
		
		 Locator1.PeriodW().click();
		 Thread.sleep(3000);
		 String PeriodText =Locator1.PeriodWDD().getText();
		 Thread.sleep(2000);
		 Locator1.PeriodWDD().click();
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
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdDrillDown']/tbody/tr[2]/td[2]"));
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
	
	
	public static void OpenAuditStepPerformSuccessfully( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.OpenAudit().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(9000);
		 
		Locator.OpenAuditChangeStatus().click();
		Thread.sleep(3000);
	
		getDriver().switchTo().frame(Locator.Frame());
		Thread.sleep(5000);

 		Locator.ObservationsTab().click();
		Thread.sleep(3000);
		
		Locator.SaveObservation().click();
		Thread.sleep(3000);
		
		Thread.sleep(2000);
		
	    
	}
	
	
	
	public static void UpcomingAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator.Upcoming().getText());	//Reading Dashboard count.
        Locator.Upcoming().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdImplementationAudits']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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

    	 
 		Thread.sleep(3000);
		Method.UpcomingAuditCountAll(test,workbook);
		Thread.sleep(3000);
 		
	    
	}
	
	
	
	public static void OverdueAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator.Overdue().getText());	//Reading Dashboard count.
        Locator.Overdue().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdImplementationAudits']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
		Method.OverdueAuditCountAll(test,workbook);
		Thread.sleep(2000);
 		
	    
	}
	
	
	
	
	public static void SubmittedAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator.Submitted().getText());	//Reading Dashboard count.
        Locator.Submitted().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdImplementationAudits']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
		Method.SubmittedAuditCountAll(test,workbook);
		Thread.sleep(2000);
		
 		
	}
	
	
	
	
	
	public static void CommentsAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator.Comments().getText());	//Reading Dashboard count.
        Locator.Comments().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdImplementationAudits']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
		Method.CommentsAuditCountAll(test,workbook);
		Thread.sleep(2000);
    	 
 		
	    
	}
	
	
	
	
	public static void ImplementedAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator.Implemented().getText());	//Reading Dashboard count.
        Locator.Implemented().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdImplementationAudits']"));
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
		Method.ImplementedAuditCountAll(test,workbook);
		Thread.sleep(2000);
 		
	    
	}
	
	
	
	
	
	public static void OpenAuditeeAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator.OAAudit().getText());	//Reading Dashboard count.
        Locator.OAAudit().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
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
	
	
	public static void OpenAuditeeImplementation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator.OAAuditImplementation().getText());	//Reading Dashboard count.
        Locator.OAAuditImplementation().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
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
	
	
	public static void ClosedAuditeeAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator.CAAuditAudit().getText());	//Reading Dashboard count.
        Locator.CAAuditAudit().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
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
	
	
	
	
	public static void ClosedAuditeeImplementation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator.CAAuditImplementation().getText());	//Reading Dashboard count.
        Locator.CAAuditImplementation().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
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
	
	
	
	public static void PreRequisiteOpen( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator.PrerequisiteSummeryOpen().getText());	//Reading Dashboard count.
        Locator.PrerequisiteSummeryOpen().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
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
 		
 		/*
    	 
 		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator.Download().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
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
		*/

	   Thread.sleep(3000);
	   Locator.ViewAuditDetails().click();
	   Thread.sleep(3000);
	   
	   sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(9);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Remark().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		row0 = sheet.getRow(10);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.UploadDocument().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
	   if(Locator.SaveButton().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.SaveButton().click();
			test.log(LogStatus.PASS, " Save Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Does Not Save successfully"  );
			
		}
   	
		Thread.sleep(3000);
		
		Locator.ViewAuditDetails().click();
		Thread.sleep(3000);
		   
		 if(Locator.CloseButton().isEnabled())
			{
				
				Thread.sleep(2000);
				Locator.CloseButton().click();
				test.log(LogStatus.PASS, " Close Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Close Button Does Not Working Properly"  );
				
			}
	   	
			Thread.sleep(3000);
			
	   
	}
	
	
	
	public static void PreRequisiteSubmitted( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));

		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator.PrerequisiteSummerySubmitted().getText());	//Reading Dashboard count.
        Locator.PrerequisiteSummerySubmitted().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
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
    	 
 		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator.PrerequisiteSummerySubmittedDownloadButton().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
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
	   
	    
	}
	
	
	
	public static void PreRequisiteRejected( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));

		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator.PrerequisiteSummeryRejected().getText());	//Reading Dashboard count.
        Locator.PrerequisiteSummeryRejected().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
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
 		/*
    	 
 		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator.PrerequisiteSummerySubmittedDownloadButton().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
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
	   
	   Thread.sleep(3000);
	   Locator.ViewAuditDetails().click();
	   Thread.sleep(3000);
	   
	   sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		row0 = sheet.getRow(9);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Remark().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		row0 = sheet.getRow(10);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.UploadDocument().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
	   if(Locator.SaveButton().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.SaveButton().click();
			test.log(LogStatus.PASS, " Save Successfully " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Does Not Save successfully"  );
			
		}
   	
		Thread.sleep(3000);
		
		Locator.ViewAuditDetails().click();
		Thread.sleep(3000);
		   
		 if(Locator.CloseButton().isEnabled())
			{
				
				Thread.sleep(2000);
				Locator.CloseButton().click();
				test.log(LogStatus.PASS, " Close Button Working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Close Button Does Not Working Properly"  );
				
			}
	   	
			Thread.sleep(3000);
			*/
	   
	    
	}
	
	
	
	
	
	public static void PrerequisiteOpenAuditFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
		
	    Locator.PrerequisiteSummeryOpen().click();	
	    Thread.sleep(2000);
		
		 Locator.SelectAudit().click();
		 Thread.sleep(3000);
		 Locator.SelectAuditDD1().click();
		 Thread.sleep(3000);
		 
		 Locator.SelectProcess().click();
		 Thread.sleep(3000);
	     String ProcessText =Locator.SelectProcessDD1().getText();
	     Thread.sleep(2000);
	     Locator.SelectProcessDD1().click();
		 Thread.sleep(5000);
		
			Locator.SelectSubProcess().click();
			Thread.sleep(3000);
			String SubProcessText =Locator.SelectSubProcessDD1().getText();
		    Thread.sleep(2000);
			Locator.SelectSubProcessDD1().click();
			Thread.sleep(5000);
			
			/*
			Locator7.SelectYear().click();
			Thread.sleep(3000);
			String YearText =Locator7.YearText().getText();
		    Thread.sleep(2000);
			Locator7.SelectYearDD().click();
			Thread.sleep(20000);
			
			
			Locator7.ApplyFilter().click();
			Thread.sleep(20000);
			
			*/
			
	      List<String> li=new ArrayList<String>();
	      
	      li.add(ProcessText);
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
			Locator.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator.GridCount().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("No items to display")) {
			Thread.sleep(5000);
		
			List<WebElement> processcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix']/tbody/tr[2]/td[3]"));
			List<WebElement> subprocesscol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix']/tbody/tr[2]/td[4]"));
	//		List<WebElement> financialyearcol=getDriver().findElements(By.xpath("//*[@id='grd_csa']/div[2]/table/tbody/tr/td[3]"));
			
			
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
			
			Thread.sleep(4000);

			
			
		
		
	}
	
	
	public static void PrerequisiteRejectedAuditFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
		
	    Locator.PrerequisiteSummeryRejected().click();	
	    Thread.sleep(2000);
		
		 Locator.SelectAudit().click();
		 Thread.sleep(3000);
		 Locator.SelectAuditDD1().click();
		 Thread.sleep(3000);
		 
		 Locator.SelectProcess().click();
		 Thread.sleep(3000);
	     String ProcessText =Locator.SelectProcessDD1().getText();
	     Thread.sleep(2000);
	     Locator.SelectProcessDD1().click();
		 Thread.sleep(5000);
		
			Locator.SelectSubProcess().click();
			Thread.sleep(3000);
			String SubProcessText =Locator.SelectSubProcessDD1().getText();
		    Thread.sleep(2000);
			Locator.SelectSubProcessDD1().click();
			Thread.sleep(5000);
			
			/*
			Locator7.SelectYear().click();
			Thread.sleep(3000);
			String YearText =Locator7.YearText().getText();
		    Thread.sleep(2000);
			Locator7.SelectYearDD().click();
			Thread.sleep(20000);
			
			
			Locator7.ApplyFilter().click();
			Thread.sleep(20000);
			
			*/
			
	      List<String> li=new ArrayList<String>();
	      
	      li.add(ProcessText);
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
			Locator.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator.GridCount().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> processcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix']/tbody/tr[2]/td[3]"));
			List<WebElement> subprocesscol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix']/tbody/tr[2]/td[4]"));
	//		List<WebElement> financialyearcol=getDriver().findElements(By.xpath("//*[@id='grd_csa']/div[2]/table/tbody/tr/td[3]"));
			
			
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
				test.log(LogStatus.PASS,"No Records Found.");	
			}
			
			Thread.sleep(4000);

			
			
		
		
	}
	
	
	
	
	
	public static void PrerequisiteSubmittedAuditFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
		
	    Locator.PrerequisiteSummerySubmitted().click();	
	    Thread.sleep(2000);
		
		 Locator.SelectAudit().click();
		 Thread.sleep(3000);
		 Locator.SelectAuditDD1().click();
		 Thread.sleep(3000);
		 
		 Locator.SelectProcess().click();
		 Thread.sleep(3000);
	     String ProcessText =Locator.SelectProcessDD1().getText();
	     Thread.sleep(2000);
	     Locator.SelectProcessDD1().click();
		 Thread.sleep(5000);
		
			Locator.SelectSubProcess().click();
			Thread.sleep(3000);
			String SubProcessText =Locator.SelectSubProcessDD1().getText();
		    Thread.sleep(2000);
			Locator.SelectSubProcessDD1().click();
			Thread.sleep(5000);
			
			/*
			Locator7.SelectYear().click();
			Thread.sleep(3000);
			String YearText =Locator7.YearText().getText();
		    Thread.sleep(2000);
			Locator7.SelectYearDD().click();
			Thread.sleep(20000);
			
			
			Locator7.ApplyFilter().click();
			Thread.sleep(20000);
			
			*/
			
	      List<String> li=new ArrayList<String>();
	      
	      li.add(ProcessText);
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
			Locator.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator.GridCount().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> processcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix']/tbody/tr[2]/td[3]"));
			List<WebElement> subprocesscol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix']/tbody/tr[2]/td[4]"));
	//		List<WebElement> financialyearcol=getDriver().findElements(By.xpath("//*[@id='grd_csa']/div[2]/table/tbody/tr/td[3]"));
			
			
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
			
			Thread.sleep(4000);

			
			
		
		
	}
	
	
	
	
	
	public static void ImplementationOpenUpcomingFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
		
	    Locator.Upcoming().click();	
	    Thread.sleep(6000);
		
		 Locator.SelectAudit().click();
		 Thread.sleep(3000);
	     String companyText =Locator.SelectcompanyDD().getText();
	     Thread.sleep(3000);
		 Locator.SelectcompanyDD().click();
		 Thread.sleep(3000);
		 /*
		 Locator.SelectProcess().click();
		 Thread.sleep(3000);
	     String ProcessText =Locator.SelectProcessDD().getText();
	     Thread.sleep(2000);
	     Locator.SelectProcessDD().click();
		 Thread.sleep(5000);
		
			Locator.SelectSubProcess().click();
			Thread.sleep(3000);
			String SubProcessText =Locator.SelectSubProcessDD().getText();
		    Thread.sleep(2000);
			Locator.SelectSubProcessDD().click();
			Thread.sleep(5000);
			
			/*
			Locator7.SelectYear().click();
			Thread.sleep(3000);
			String YearText =Locator7.YearText().getText();
		    Thread.sleep(2000);
			Locator7.SelectYearDD().click();
			Thread.sleep(20000);
			
			
			Locator7.ApplyFilter().click();
			Thread.sleep(20000);
			
			*/
			
	      List<String> li=new ArrayList<String>();
	      
	      li.add(companyText);
	  //    li.add(SubProcessText);
	 
	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Company");
		//	filter.add("Sub-Process");
			
			
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);
	
			Locator.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator.GridCount().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> companycol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdImplementationAudits']/tbody/tr[2]/td[1]"));
		//	List<WebElement> subprocesscol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix']/tbody/tr[2]/td[4]"));
	//		List<WebElement> financialyearcol=getDriver().findElements(By.xpath("//*[@id='grd_csa']/div[2]/table/tbody/tr/td[3]"));
			
			
			Thread.sleep(2000);

			for(int i=0; i<li.size(); i++){
				
				List<String> text= new ArrayList<String>();
				HashSet<String> pass=new LinkedHashSet<>();
				HashSet<String> fail=new LinkedHashSet<>();
				List<WebElement> raw=new ArrayList<WebElement>();
				
				

					if(i==0)
					{
						raw.addAll(companycol);
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
			
			Thread.sleep(4000);

			
			
		
		
	}
	
	
	
	
	public static void ImplementationOpenOverdueFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
		
	    Locator.Overdue().click();	
	    Thread.sleep(6000);
		
		 Locator.SelectAudit().click();
		 Thread.sleep(3000);
	     String companyText =Locator.SelectcompanyOverdueDD().getText();
	     Thread.sleep(3000);
		 Locator.SelectcompanyOverdueDD().click();
		 Thread.sleep(3000);
		 /*
		 Locator.SelectProcess().click();
		 Thread.sleep(3000);
	     String ProcessText =Locator.SelectProcessDD().getText();
	     Thread.sleep(2000);
	     Locator.SelectProcessDD().click();
		 Thread.sleep(5000);
		
			Locator.SelectSubProcess().click();
			Thread.sleep(3000);
			String SubProcessText =Locator.SelectSubProcessDD().getText();
		    Thread.sleep(2000);
			Locator.SelectSubProcessDD().click();
			Thread.sleep(5000);
			
			/*
			Locator7.SelectYear().click();
			Thread.sleep(3000);
			String YearText =Locator7.YearText().getText();
		    Thread.sleep(2000);
			Locator7.SelectYearDD().click();
			Thread.sleep(20000);
			
			
			Locator7.ApplyFilter().click();
			Thread.sleep(20000);
			
			*/
			
	      List<String> li=new ArrayList<String>();
	      
	      li.add(companyText);
	  //    li.add(SubProcessText);
	 
	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Company");
		//	filter.add("Sub-Process");
			
			
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);
	
			Locator.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator.GridCount().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> companycol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdImplementationAudits']/tbody/tr[2]/td[1]"));
		//	List<WebElement> subprocesscol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix']/tbody/tr[2]/td[4]"));
	//		List<WebElement> financialyearcol=getDriver().findElements(By.xpath("//*[@id='grd_csa']/div[2]/table/tbody/tr/td[3]"));
			
			
			Thread.sleep(2000);

			for(int i=0; i<li.size(); i++){
				
				List<String> text= new ArrayList<String>();
				HashSet<String> pass=new LinkedHashSet<>();
				HashSet<String> fail=new LinkedHashSet<>();
				List<WebElement> raw=new ArrayList<WebElement>();
				
				

					if(i==0)
					{
						raw.addAll(companycol);
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
			
			Thread.sleep(4000);

			
			
		
		
	}
	
	
	
	
	
	public static void ImplementationSubmittedForReviewSubmitFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
		
	    Locator.Submitted().click();	
	    Thread.sleep(6000);
		
		 Locator.SelectAudit().click();
		 Thread.sleep(3000);
	     String companyText =Locator.SelectcompanyOverdueDD().getText();
	     Thread.sleep(3000);
		 Locator.SelectcompanyOverdueDD().click();
		 Thread.sleep(3000);
		 /*
		 Locator.SelectProcess().click();
		 Thread.sleep(3000);
	     String ProcessText =Locator.SelectProcessDD().getText();
	     Thread.sleep(2000);
	     Locator.SelectProcessDD().click();
		 Thread.sleep(5000);
		
			Locator.SelectSubProcess().click();
			Thread.sleep(3000);
			String SubProcessText =Locator.SelectSubProcessDD().getText();
		    Thread.sleep(2000);
			Locator.SelectSubProcessDD().click();
			Thread.sleep(5000);
			
			/*
			Locator7.SelectYear().click();
			Thread.sleep(3000);
			String YearText =Locator7.YearText().getText();
		    Thread.sleep(2000);
			Locator7.SelectYearDD().click();
			Thread.sleep(20000);
			
			
			Locator7.ApplyFilter().click();
			Thread.sleep(20000);
			
			*/
			
	      List<String> li=new ArrayList<String>();
	      
	      li.add(companyText);
	  //    li.add(SubProcessText);
	 
	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Company");
		//	filter.add("Sub-Process");
			
			
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);
	
			Locator.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator.GridCount().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> companycol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdImplementationAudits']/tbody/tr[2]/td[1]"));
		//	List<WebElement> subprocesscol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix']/tbody/tr[2]/td[4]"));
	//		List<WebElement> financialyearcol=getDriver().findElements(By.xpath("//*[@id='grd_csa']/div[2]/table/tbody/tr/td[3]"));
			
			
			Thread.sleep(2000);

			for(int i=0; i<li.size(); i++){
				
				List<String> text= new ArrayList<String>();
				HashSet<String> pass=new LinkedHashSet<>();
				HashSet<String> fail=new LinkedHashSet<>();
				List<WebElement> raw=new ArrayList<WebElement>();
				
				

					if(i==0)
					{
						raw.addAll(companycol);
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
			
			Thread.sleep(4000);

			
			
		
		
	}
	
	
	
	public static void ImplementationCommentsForReviewSubmitFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
		
	    Locator.Comments().click();	
	    Thread.sleep(6000);
		
		 Locator.SelectAudit().click();
		 Thread.sleep(3000);
	     String companyText =Locator.SelectcompanyOverdueDD().getText();
	     Thread.sleep(3000);
		 Locator.SelectcompanyOverdueDD().click();
		 Thread.sleep(3000);
		 /*
		 Locator.SelectProcess().click();
		 Thread.sleep(3000);
	     String ProcessText =Locator.SelectProcessDD().getText();
	     Thread.sleep(2000);
	     Locator.SelectProcessDD().click();
		 Thread.sleep(5000);
		
			Locator.SelectSubProcess().click();
			Thread.sleep(3000);
			String SubProcessText =Locator.SelectSubProcessDD().getText();
		    Thread.sleep(2000);
			Locator.SelectSubProcessDD().click();
			Thread.sleep(5000);
			
			/*
			Locator7.SelectYear().click();
			Thread.sleep(3000);
			String YearText =Locator7.YearText().getText();
		    Thread.sleep(2000);
			Locator7.SelectYearDD().click();
			Thread.sleep(20000);
			
			
			Locator7.ApplyFilter().click();
			Thread.sleep(20000);
			
			*/
			
	      List<String> li=new ArrayList<String>();
	      
	      li.add(companyText);
	  //    li.add(SubProcessText);
	 
	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Company");
		//	filter.add("Sub-Process");
			
			
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);
	
			Locator.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator.GridCount().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> companycol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdImplementationAudits']/tbody/tr[2]/td[1]"));
		//	List<WebElement> subprocesscol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix']/tbody/tr[2]/td[4]"));
	//		List<WebElement> financialyearcol=getDriver().findElements(By.xpath("//*[@id='grd_csa']/div[2]/table/tbody/tr/td[3]"));
			
			
			Thread.sleep(2000);

			for(int i=0; i<li.size(); i++){
				
				List<String> text= new ArrayList<String>();
				HashSet<String> pass=new LinkedHashSet<>();
				HashSet<String> fail=new LinkedHashSet<>();
				List<WebElement> raw=new ArrayList<WebElement>();
				
				

					if(i==0)
					{
						raw.addAll(companycol);
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
			
			Thread.sleep(4000);

			
			
		
		
	}
	
	
	
	
	public static void ImplementationImplementedtFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		Thread.sleep(1000);
		Locator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
		
	    Locator.Implemented().click();	
	    Thread.sleep(6000);
		
		 Locator.SelectAudit().click();
		 Thread.sleep(3000);
	     String companyText =Locator.SelectcompanyOverdueDD().getText();
	     Thread.sleep(3000);
		 Locator.SelectcompanyOverdueDD().click();
		 Thread.sleep(3000);
		 /*
		 Locator.SelectProcess().click();
		 Thread.sleep(3000);
	     String ProcessText =Locator.SelectProcessDD().getText();
	     Thread.sleep(2000);
	     Locator.SelectProcessDD().click();
		 Thread.sleep(5000);
		
			Locator.SelectSubProcess().click();
			Thread.sleep(3000);
			String SubProcessText =Locator.SelectSubProcessDD().getText();
		    Thread.sleep(2000);
			Locator.SelectSubProcessDD().click();
			Thread.sleep(5000);
			
			/*
			Locator7.SelectYear().click();
			Thread.sleep(3000);
			String YearText =Locator7.YearText().getText();
		    Thread.sleep(2000);
			Locator7.SelectYearDD().click();
			Thread.sleep(20000);
			
			
			Locator7.ApplyFilter().click();
			Thread.sleep(20000);
			
			*/
			
	      List<String> li=new ArrayList<String>();
	      
	      li.add(companyText);
	  //    li.add(SubProcessText);
	 
	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Company");
		//	filter.add("Sub-Process");
			
			
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);
	
			Locator.GridCount().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator.GridCount().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> companycol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdImplementationAudits']/tbody/tr[2]/td[1]"));
		//	List<WebElement> subprocesscol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix']/tbody/tr[2]/td[4]"));
	//		List<WebElement> financialyearcol=getDriver().findElements(By.xpath("//*[@id='grd_csa']/div[2]/table/tbody/tr/td[3]"));
			
			
			Thread.sleep(2000);

			for(int i=0; i<li.size(); i++){
				
				List<String> text= new ArrayList<String>();
				HashSet<String> pass=new LinkedHashSet<>();
				HashSet<String> fail=new LinkedHashSet<>();
				List<WebElement> raw=new ArrayList<WebElement>();
				
				

					if(i==0)
					{
						raw.addAll(companycol);
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
			
			Thread.sleep(4000);

			
			
		
		
	}
	
	
	
	
	
	
	
	public static void UpcomingAuditCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
        int open = Integer.parseInt(Locator.OpenObservation().getText());	//Reading Dashboard count.
        Locator.OpenObservation().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
						
		test.log(LogStatus.PASS, "Open Observations Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Open Observations = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		Method.UpcomingSubmittedICountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.UpcomingReviewCommentCountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.UpcomingResubmittedCountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.UpcomingReview2CountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.UpcomingReview3CountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.UpcomingClosedCountAll(test,workbook);
		Thread.sleep(3000);
		
		
		
	}
	
	
	
	
	public static void UpcomingSubmittedICountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.SubmittedI().getText());	//Reading Dashboard count.
        Locator.SubmittedI().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	public static void UpcomingReviewCommentCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.ReviewComment().getText());	//Reading Dashboard count.
        Locator.ReviewComment().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
						
		test.log(LogStatus.PASS, "ReviewComment Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "ReviewComment Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	
	
	public static void UpcomingResubmittedCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Resubmitted().getText());	//Reading Dashboard count.
        Locator.Resubmitted().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Re-submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Re-submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	

	
	public static void UpcomingReview2CountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Review2().getText());	//Reading Dashboard count.
        Locator.Review2().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Review2 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Review2 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	
	public static void UpcomingReview3CountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Review3().getText());	//Reading Dashboard count.
        Locator.Review3().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Review3 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Review3 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	public static void UpcomingClosedCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Closed().getText());	//Reading Dashboard count.
        Locator.Closed().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(7000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  " + open );
	    
	    Thread.sleep(2000);
       
/*
		String item = Locator4.GridCount().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		*/
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "Closed Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Closed Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(3000);
	//    Locator.BackButton().click();	
	//	Thread.sleep(3000);
		
		if(Locator.BackButton().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.BackButton().click();
			test.log(LogStatus.PASS, " Back Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Back Button Does Not Working Properly"  );
			
		}
   	
		Thread.sleep(3000);
		
	    
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	
	public static void OverdueAuditCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
        int open = Integer.parseInt(Locator.OpenObservation().getText());	//Reading Dashboard count.
        Locator.OpenObservation().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
						
		test.log(LogStatus.PASS, "Open Observations Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Open Observations = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		Method.OverdueSubmittedICountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.OverdueReviewCommentCountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.OverdueResubmittedCountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.OverdueReview2CountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.OverdueReview3CountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.OverdueClosedCountAll(test,workbook);
		Thread.sleep(3000);
		
		
		
	}
	
	
	
	
	public static void OverdueSubmittedICountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.SubmittedI().getText());	//Reading Dashboard count.
        Locator.SubmittedI().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
						
		test.log(LogStatus.PASS, "Submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	public static void OverdueReviewCommentCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.ReviewComment().getText());	//Reading Dashboard count.
        Locator.ReviewComment().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
						
		test.log(LogStatus.PASS, "ReviewComment Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "ReviewComment Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	
	
	public static void OverdueResubmittedCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Resubmitted().getText());	//Reading Dashboard count.
        Locator.Resubmitted().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Re-submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Re-submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	

	
	public static void OverdueReview2CountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Review2().getText());	//Reading Dashboard count.
        Locator.Review2().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Review2 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Review2 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	
	public static void OverdueReview3CountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Review3().getText());	//Reading Dashboard count.
        Locator.Review3().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Review3 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Review3 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	public static void OverdueClosedCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Closed().getText());	//Reading Dashboard count.
        Locator.Closed().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(7000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  " + open );
	    
	    Thread.sleep(2000);
       
/*
		String item = Locator4.GridCount().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		*/
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "Closed Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Closed Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(3000);
	//    Locator.BackButton().click();	
	//	Thread.sleep(3000);
		
		if(Locator.BackButton().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.BackButton().click();
			test.log(LogStatus.PASS, " Back Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Back Button Does Not Working Properly"  );
			
		}
   	
		Thread.sleep(3000);
		
	    
	}
	
	
	////////////////////////////////////////////////////////////////////////////Submitted
	
	
	
	public static void SubmittedAuditCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
        int open = Integer.parseInt(Locator.OpenObservation().getText());	//Reading Dashboard count.
        Locator.OpenObservation().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
						
		test.log(LogStatus.PASS, "Open Observations Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Open Observations = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		Method.SubmittedSubmittedICountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.SubmittedReviewCommentCountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.SubmittedResubmittedCountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.SubmittedReview2CountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.SubmittedReview3CountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.SubmittedClosedCountAll(test,workbook);
		Thread.sleep(3000);
		
		
		
	}
	
	
	
	
	public static void SubmittedSubmittedICountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.SubmittedI().getText());	//Reading Dashboard count.
        Locator.SubmittedI().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
						
		test.log(LogStatus.PASS, "Submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	public static void SubmittedReviewCommentCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.ReviewComment().getText());	//Reading Dashboard count.
        Locator.ReviewComment().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
						
		test.log(LogStatus.PASS, "ReviewComment Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "ReviewComment Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	
	
	public static void SubmittedResubmittedCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Resubmitted().getText());	//Reading Dashboard count.
        Locator.Resubmitted().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Re-submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Re-submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	

	
	public static void SubmittedReview2CountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Review2().getText());	//Reading Dashboard count.
        Locator.Review2().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Review2 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Review2 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	
	public static void SubmittedReview3CountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Review3().getText());	//Reading Dashboard count.
        Locator.Review3().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Review3 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Review3 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	public static void SubmittedClosedCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Closed().getText());	//Reading Dashboard count.
        Locator.Closed().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(7000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  " + open );
	    
	    Thread.sleep(2000);
       
/*
		String item = Locator4.GridCount().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		*/
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "Closed Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Closed Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(3000);
	//    Locator.BackButton().click();	
	//	Thread.sleep(3000);
		
		if(Locator.BackButton().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.BackButton().click();
			test.log(LogStatus.PASS, " Back Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Back Button Does Not Working Properly"  );
			
		}
   	
		Thread.sleep(3000);
		
	    
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////Comments
	
	
	
	
	public static void CommentsAuditCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
        int open = Integer.parseInt(Locator.OpenObservation().getText());	//Reading Dashboard count.
        Locator.OpenObservation().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
						
		test.log(LogStatus.PASS, "Open Observations Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Open Observations = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		Method.CommentsSubmittedICountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.CommentsReviewCommentCountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.CommentsResubmittedCountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.CommentsReview2CountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.CommentsReview3CountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.CommentsClosedCountAll(test,workbook);
		Thread.sleep(3000);
		
		
		
	}
	
	
	
	
	public static void CommentsSubmittedICountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.SubmittedI().getText());	//Reading Dashboard count.
        Locator.SubmittedI().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
						
		test.log(LogStatus.PASS, "Submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	public static void CommentsReviewCommentCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.ReviewComment().getText());	//Reading Dashboard count.
        Locator.ReviewComment().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
						
		test.log(LogStatus.PASS, "ReviewComment Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "ReviewComment Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	
	
	public static void CommentsResubmittedCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Resubmitted().getText());	//Reading Dashboard count.
        Locator.Resubmitted().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Re-submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Re-submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	

	
	public static void CommentsReview2CountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Review2().getText());	//Reading Dashboard count.
        Locator.Review2().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Review2 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Review2 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	
	public static void CommentsReview3CountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Review3().getText());	//Reading Dashboard count.
        Locator.Review3().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Review3 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Review3 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	public static void CommentsClosedCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Closed().getText());	//Reading Dashboard count.
        Locator.Closed().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(7000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  " + open );
	    
	    Thread.sleep(2000);
       
/*
		String item = Locator4.GridCount().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		*/
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "Closed Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Closed Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(3000);
	//    Locator.BackButton().click();	
	//	Thread.sleep(3000);
		
		if(Locator.BackButton().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.BackButton().click();
			test.log(LogStatus.PASS, " Back Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Back Button Does Not Working Properly"  );
			
		}
   	
		Thread.sleep(3000);
		
	    
	}
	
	
	
////////////////////////////////////////////////////////////////////////////////////Implemented	
	
	
	public static void ImplementedAuditCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
        int open = Integer.parseInt(Locator.OpenObservation().getText());	//Reading Dashboard count.
        Locator.OpenObservation().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
						
		test.log(LogStatus.PASS, "Open Observations Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Open Observations = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		Method.ImplementedSubmittedICountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.ImplementedReviewCommentCountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.ImplementedResubmittedCountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.ImplementedReview2CountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.ImplementedReview3CountAll(test,workbook);
		Thread.sleep(3000);
		
		Method.ImplementedClosedCountAll(test,workbook);
		Thread.sleep(3000);
		
		
		
	}
	
	
	
	
	public static void ImplementedSubmittedICountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.SubmittedI().getText());	//Reading Dashboard count.
        Locator.SubmittedI().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
						
		test.log(LogStatus.PASS, "Submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	public static void ImplementedReviewCommentCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.ReviewComment().getText());	//Reading Dashboard count.
        Locator.ReviewComment().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
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
						
		test.log(LogStatus.PASS, "ReviewComment Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "ReviewComment Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	
	
	public static void ImplementedResubmittedCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Resubmitted().getText());	//Reading Dashboard count.
        Locator.Resubmitted().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Re-submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Re-submitted Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	

	
	public static void ImplementedReview2CountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Review2().getText());	//Reading Dashboard count.
        Locator.Review2().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Review2 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Review2 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	
	public static void ImplementedReview3CountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Review3().getText());	//Reading Dashboard count.
        Locator.Review3().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
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
						
		test.log(LogStatus.PASS, "Review3 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Review3 Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(2000);
	    Locator.BackButton().click();	
		Thread.sleep(3000);
		
		
	    
	}
	
	
	public static void ImplementedClosedCountAll( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		/*
		Locator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator.Upcoming().click();	
        */
		
        int open = Integer.parseInt(Locator.Closed().getText());	//Reading Dashboard count.
        Locator.Closed().click();					                //Clicking on Dashboard count


        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(7000);
        
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  " + open );
	    
	    Thread.sleep(2000);
       
/*
		String item = Locator4.GridCount().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		*/
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, "Closed Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, "Closed Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}

	    Thread.sleep(3000);
	//    Locator.BackButton().click();	
	//	Thread.sleep(3000);
		
		if(Locator.BackButton().isEnabled())
		{
			
			Thread.sleep(2000);
			Locator.BackButton().click();
			test.log(LogStatus.PASS, " Back Button Working Properly " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Back Button Does Not Working Properly"  );
			
		}
   	
		Thread.sleep(3000);
		
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
