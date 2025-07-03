package aRSAuditee;

import java.io.File;
import java.io.FileInputStream;
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

import login.BasePage;

public class MethodCritical extends BasePage{
	
	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable

	
	
	
	
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
	//	Method.OverdueAuditCountAll(,test,workbook);
	//	Thread.sleep(2000);
 		
	    
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
//		Method.SubmittedAuditCountAll(,test,workbook);
//		Thread.sleep(2000);
		
 		
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
//		Method.CommentsAuditCountAll(,test,workbook);
//		Thread.sleep(2000);
    	 
 		
	    
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
	//	Method.ImplementedAuditCountAll(,test,workbook);
	//	Thread.sleep(2000);
 		
	    
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
    	 
 		File dir2 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator.PrerequisiteSummerySubmittedDownloadButton().click();
		
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
	
	
	
	

}
