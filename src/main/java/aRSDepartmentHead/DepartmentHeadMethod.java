package aRSDepartmentHead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import aRSAuditee.Locator;
import arsPerformer.Locator1;
import login.BasePage;









public class DepartmentHeadMethod extends BasePage{

	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	

	
	
	
	public static void ObservationCatogary( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
	//	Thread.sleep(4000);
//		DepartmentHeadLocator.ARS().click();
		Thread.sleep(5000);
				
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(6000);
		       
        DepartmentHeadLocator.ObservationCategory().click();
        Thread.sleep(9000);
        
		int open = Integer.parseInt(DepartmentHeadLocator.Major().getText());	//Reading Dashboard count.
		DepartmentHeadLocator.Major().click();					                //Clicking on Dashboard count

        Thread.sleep(5000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
       
       			
		/*
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       */
/*
		String item = DepartmentHeadLocator.GridCunt().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
		*/
        
	    getDriver().switchTo().frame(DepartmentHeadLocator.Frame());
	    Thread.sleep(4000);
		
	    WebElement table = getDriver().findElement(By.xpath("(//table[@role='grid'])[1]"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  " + open );
	    


		Thread.sleep(3000);
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Major - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Major - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
		
		
	
		Thread.sleep(4000);
		
		/*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		*/
	    
	    
	    if(DepartmentHeadLocator.ExportToExcel().isEnabled())
		{
			
			Thread.sleep(2000);
			DepartmentHeadLocator.ExportToExcel().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button Is Clickable "  );
			
		}
	    
	    
	    
	    Thread.sleep(20000);
	    
	    String fis1 = "C:\\Users\\shitalb\\Downloads\\Observation Report.xlsx";
		
		File file = new File(fis1);
		  
		 if(file.exists()) {
			 
			 if(file.delete())
			 {
			 
			 System.out.println("File deleted Successfully.");
		     }
			 
		 }
		 else {
			 
			 System.out.println("File does not exist Successfully.");
		 }
		 
	    Thread.sleep(4000);
	    
	//    DepartmentHeadMethod.GridAndExcelCountMatch(test,workbook);
	//	Thread.sleep(4000);
	    
	    /*
	    
	    if(Locator6.View().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator6.View().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		*/
		
		Thread.sleep(2000);
		getDriver().switchTo().parentFrame();
		Thread.sleep(5000);
		
		DepartmentHeadLocator.ClosePage().click();
		Thread.sleep(5000);
		
		DepartmentHeadMethod.ObservationCatogaryModerate(test,workbook);
		Thread.sleep(4000);
		
		DepartmentHeadMethod.ObservationCatogaryMinor(test,workbook);
		Thread.sleep(4000);
	    
	}
	
	
	
	public static void ObservationCatogaryModerate( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
	//	Thread.sleep(4000);
//		DepartmentHeadLocator.ARS().click();
		Thread.sleep(5000);
				
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(6000);
		       
  //      DepartmentHeadLocator.ObservationCategory().click();
  //      Thread.sleep(9000);
        
		int open = Integer.parseInt(DepartmentHeadLocator.Moderate().getText());	//Reading Dashboard count.
		DepartmentHeadLocator.Moderate().click();					                //Clicking on Dashboard count

        Thread.sleep(5000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
       
       			
		/*
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       */
/*
		String item = DepartmentHeadLocator.GridCunt().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
		*/
        
	    getDriver().switchTo().frame(DepartmentHeadLocator.Frame());
	    Thread.sleep(4000);
		
	    WebElement table = getDriver().findElement(By.xpath("(//table[@role='grid'])[1]"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  " + open );
	    


		Thread.sleep(3000);
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Moderate - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Moderate - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
		
		
	
		Thread.sleep(4000);
		
		/*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		*/
	    
	    
	    if(DepartmentHeadLocator.ExportToExcel().isEnabled())
		{
			
			Thread.sleep(2000);
			DepartmentHeadLocator.ExportToExcel().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button Is Clickable "  );
			
		}
	    
	    
	    
	    Thread.sleep(20000);
	    
	    String fis1 = "C:\\Users\\shitalb\\Downloads\\Observation Report.xlsx";
		
		File file = new File(fis1);
		  
		 if(file.exists()) {
			 
			 if(file.delete())
			 {
			 
			 System.out.println("File deleted Successfully.");
		     }
			 
		 }
		 else {
			 
			 System.out.println("File does not exist Successfully.");
		 }
		 
	    Thread.sleep(4000);
	    
	//    DepartmentHeadMethod.GridAndExcelCountMatch(test,workbook);
	//	Thread.sleep(4000);
	    
	    /*
	    
	    if(Locator6.View().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator6.View().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		*/
		Thread.sleep(2000);
		getDriver().switchTo().parentFrame();
		Thread.sleep(5000);
		
		DepartmentHeadLocator.ClosePage().click();
		Thread.sleep(5000);

//		DepartmentHeadLocator.ClosePage().click();
		
		
	    
	}
	
	
	public static void ObservationCatogaryMinor( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
	//	Thread.sleep(4000);
//		DepartmentHeadLocator.ARS().click();
		Thread.sleep(5000);
				
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(6000);
		       
 //       DepartmentHeadLocator.ObservationCategory().click();
 //       Thread.sleep(9000);
        
		int open = Integer.parseInt(DepartmentHeadLocator.Minor().getText());	//Reading Dashboard count.
		DepartmentHeadLocator.Minor().click();					                //Clicking on Dashboard count

        Thread.sleep(5000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
       
       			
		/*
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       */
/*
		String item = DepartmentHeadLocator.GridCunt().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
		*/
        
	    getDriver().switchTo().frame(DepartmentHeadLocator.Frame());
	    Thread.sleep(4000);
		
	    WebElement table = getDriver().findElement(By.xpath("(//table[@role='grid'])[1]"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  " + open );
	    


		Thread.sleep(3000);
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Moderate - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Moderate - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
		
		
	
		Thread.sleep(4000);
		
		/*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		*/
	    
	    
	    if(DepartmentHeadLocator.ExportToExcel().isEnabled())
		{
			
			Thread.sleep(2000);
			DepartmentHeadLocator.ExportToExcel().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button Is Clickable "  );
			
		}
	    
	    
	    
	    Thread.sleep(20000);
	    
	    String fis1 = "C:\\Users\\shitalb\\Downloads\\Observation Report.xlsx";
		
		File file = new File(fis1);
		  
		 if(file.exists()) {
			 
			 if(file.delete())
			 {
			 
			 System.out.println("File deleted Successfully.");
		     }
			 
		 }
		 else {
			 
			 System.out.println("File does not exist Successfully.");
		 }
		 
	    Thread.sleep(4000);
	    
	//    DepartmentHeadMethod.GridAndExcelCountMatch(test,workbook);
	//	Thread.sleep(4000);
	    
	    /*
	    
	    if(Locator6.View().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator6.View().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		*/
		
//		DepartmentHeadLocator.ClosePage().click();
		Thread.sleep(2000);
		getDriver().switchTo().parentFrame();
		Thread.sleep(5000);
		
		DepartmentHeadLocator.ClosePage().click();
		Thread.sleep(5000);

		
	    
	}
	
	
	
	
	
	
	
	public static void GridAndExcelCountMatch( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		Thread.sleep(1000);
		/*
		Locator.IFC().click();
		Thread.sleep(5000);
		
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(5000);
		
        
		Locator3.CompliedGraph().click();	
		Thread.sleep(4000);
		
		*/
			
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       

		String item = DepartmentHeadLocator.GridCunt().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);

		if(compliancesCount.equalsIgnoreCase("to"))
		{
			Thread.sleep(5000);
		   item = DepartmentHeadLocator.GridCunt().getText();
			bits = item.split(" ");
        
		}
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
		Thread.sleep(2000);
	//	DepartmentHeadLocator.ExportToExcel().click();
	//	Thread.sleep(20000);
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		DepartmentHeadLocator.ExportToExcel().click();
		
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
			test.log(LogStatus.FAIL,  "File Download Successfully");
		}

	   Thread.sleep(6000);
	   
	
		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\shitalb\\Downloads\\Observation Report.xlsx");
	//Workbook workbook = new XSSFWorkbook(fileInputStream);	
	workbook = new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(0);
	
	//int rowCount = sheet.getLastRowNum();
	
	sheet = workbook.getSheetAt(0);
	int columnNumber = 3;
	int rowCount = 0;
	int actualRow=0;
	
	for(Row row : sheet)
	{
		
		Cell cell =row.getCell(columnNumber);
		if(cell != null) {
			
			rowCount++;
			actualRow = rowCount-1;
		}
		
	}
	
	
	System.out.println("Row Count in column  " + columnNumber + ": " + actualRow);
	
	workbook.close();
	fis.close();
	
	if(count1 == actualRow)
	{
		//test.log(LogStatus.PASS, "No of records from grid matches to no of records in Excel Sheet.");
		test.log(LogStatus.PASS, "Total records from Grid = "+count1+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, "Total records from Grid = "+count1+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\Users\\shitalb\\Downloads\\Observation Report.xlsx";
	
	File file = new File(fis1);
	  
	 if(file.exists()) {
		 
		 if(file.delete())
		 {
		 
		 System.out.println("File deleted Successfully.");
	     }
		 
	 }
	 else {
		 
		 System.out.println("File does not exist Successfully.");
	 }
	 
	
	
	 
 }
	
	
	
	
	public static void AegingGraphlessthan90days( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		Thread.sleep(4000);
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(5000);
				
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(5000);
 
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(6000);
		             
		int open = Integer.parseInt(DepartmentHeadLocator.lessthan90Days().getText());	//Reading Dashboard count.
		DepartmentHeadLocator.lessthan90Days().click();					                //Clicking on Dashboard count

        Thread.sleep(15000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
       
       			
		/*
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       */
        
	    getDriver().switchTo().frame(DepartmentHeadLocator.Frame());
	    Thread.sleep(4000);


		String item = DepartmentHeadLocator.GridCunt().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
		
        /*
		
	    WebElement table = getDriver().findElement(By.xpath("(//table[@role='grid'])[1]"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  " + open );
	    */


		Thread.sleep(3000);
		
		if(open == count1)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " >90 Days - Dashboard Count = "+open+" | Displayed records from grid = "+count1);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " >90 Days - Dashboard Count = "+open+" | Displayed records from grid = "+count1);
					
		}
		
		
	
		Thread.sleep(4000);
		
		/*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		*/
	    /*
	    
	    if(DepartmentHeadLocator.ExportToExcel().isEnabled())
		{
			
			Thread.sleep(2000);
			DepartmentHeadLocator.ExportToExcel().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button Is Clickable "  );
			
		}
	    
	    
	    
	    Thread.sleep(20000);
	    
	    String fis1 = "C:\\Users\\shitalb\\Downloads\\Observation Report.xlsx";
		
		File file = new File(fis1);
		  
		 if(file.exists()) {
			 
			 if(file.delete())
			 {
			 
			 System.out.println("File deleted Successfully.");
		     }
			 
		 }
		 else {
			 
			 System.out.println("File does not exist Successfully.");
		 }
		 */
	    Thread.sleep(4000);
	    
	    DepartmentHeadMethod.GridAndExcelCountMatch(test,workbook);
		Thread.sleep(4000);
	    
	    
	    
	    if(DepartmentHeadLocator.ViewButton().isEnabled())
		{
			
			Thread.sleep(2000);
			DepartmentHeadLocator.ViewButton().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		
		Thread.sleep(2000);
		getDriver().switchTo().parentFrame();
		Thread.sleep(5000);
		
		DepartmentHeadLocator.ClosePage().click();
		Thread.sleep(5000);
		
	    
	}
	
	
	
	public static void MyDocument( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(9000);
		
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		DepartmentHeadLocator.MyDocument().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
             
        String OptionText1 = "Option 1";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[1]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		Thread.sleep(7000);

//	    Locator1.DownloadButton().click();					                //Clicking on Dashboard count
//	    Thread.sleep(5000);
		
        File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		DepartmentHeadLocator.DownloadButton().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
	  
        Thread.sleep(3000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "Working Document - File Download Successfully");
		}
	   else
	   {
		    Thread.sleep(5000);
		    String t = Locator1.Succssesfully().getText();					                //Clicking on Dashboard count
 		    Thread.sleep(5000);
 			test.log(LogStatus.FAIL, " Working Document - " + t  );
 
		}   
	   Thread.sleep(4000);
	   
       String OptionText = "Option 2";
		String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[2]",OptionText);
		WebElement dropdownOption = getDriver().findElement(By.xpath(xpathExpression));
		dropdownOption.click();
		Thread.sleep(7000);

//	    Locator1.DownloadButton().click();					                //Clicking on Dashboard count
//	    Thread.sleep(5000);
		
       File dir = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		DepartmentHeadLocator.DownloadButton().click();
		
	 	Thread.sleep(9000);
		File dir4 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew4 = dir4.listFiles();						//Counting number of files in directory after download
	  
       Thread.sleep(3000);
	   if (dirContents.length < allFilesNew4.length) {
			test.log(LogStatus.PASS,  "Review Document - File Download Successfully");
		}
	   else
	   {
		    Thread.sleep(5000);
		    String t = Locator1.Succssesfully().getText();					                //Clicking on Dashboard count
		    Thread.sleep(5000);
			test.log(LogStatus.FAIL, " Review Document - " + t  );

		}   
	   Thread.sleep(4000);
	   
	      String OptionText2 = "Option 3";
			String xpathExpression2 = String.format("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[3]",OptionText2);
			WebElement dropdownOption2 = getDriver().findElement(By.xpath(xpathExpression2));
			dropdownOption2.click();
			Thread.sleep(7000);

//		    Locator1.DownloadButton().click();					                //Clicking on Dashboard count
//		    Thread.sleep(5000);
			
	       File dir5 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents5 = dir5.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			DepartmentHeadLocator.DownloadButton().click();
			
		 	Thread.sleep(9000);
			File dir6 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew6 = dir6.listFiles();						//Counting number of files in directory after download
		  
	       Thread.sleep(3000);
		   if (dirContents5.length < allFilesNew6.length) {
				test.log(LogStatus.PASS,  "Annexure Document - File Download Successfully");
			}
		   else
		   {
			    Thread.sleep(5000);
			    String t = Locator1.Succssesfully().getText();					                //Clicking on Dashboard count
			    Thread.sleep(5000);
				test.log(LogStatus.FAIL, " Annexure Document - " + t  );

			}   
		   Thread.sleep(4000);
		   
		      String OptionText3 = "Option 4";
				String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[4]",OptionText3);
				WebElement dropdownOption3 = getDriver().findElement(By.xpath(xpathExpression3));
				dropdownOption3.click();
				Thread.sleep(7000);

//			    Locator1.DownloadButton().click();					                //Clicking on Dashboard count
//			    Thread.sleep(5000);
				
		       File dir7 = new File("C:\\Users\\shitalb\\Downloads");
				File[] dirContents7 = dir7.listFiles();						//Counting number of files in directory before download
				
				Thread.sleep(3000);
				DepartmentHeadLocator.DownloadButton().click();
				
			 	Thread.sleep(9000);
				File dir0 = new File("C:\\Users\\shitalb\\Downloads");
				File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
			  
		       Thread.sleep(3000);
			   if (dirContents7.length < allFilesNew0.length) {
					test.log(LogStatus.PASS,  "Audit Committee Presentation Document - File Download Successfully");
				}
			   else
			   {
				    Thread.sleep(5000);
				    String t = Locator1.Succssesfully().getText();					                //Clicking on Dashboard count
				    Thread.sleep(5000);
					test.log(LogStatus.FAIL, " Audit Committee Presentation Document - " + t  );

				}   
			   Thread.sleep(4000);
 
			   
			      String OptionText4 = "Option 5";
					String xpathExpression4 = String.format("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[5]",OptionText4);
					WebElement dropdownOption4 = getDriver().findElement(By.xpath(xpathExpression4));
					dropdownOption4.click();
					Thread.sleep(7000);

//				    Locator1.DownloadButton().click();					                //Clicking on Dashboard count
//				    Thread.sleep(5000);
					
			       File dir8 = new File("C:\\Users\\shitalb\\Downloads");
					File[] dirContents8 = dir8.listFiles();						//Counting number of files in directory before download
					
					Thread.sleep(3000);
					DepartmentHeadLocator.DownloadButton().click();
					
				 	Thread.sleep(9000);
					File dir9 = new File("C:\\Users\\shitalb\\Downloads");
					File[] allFilesNew9 = dir9.listFiles();						//Counting number of files in directory after download
				  
			       Thread.sleep(3000);
				   if (dirContents8.length < allFilesNew9.length) {
						test.log(LogStatus.PASS,  "Final Deliverables Document - File Download Successfully");
					}
				   else
				   {
					    Thread.sleep(5000);
					    String t = Locator1.Succssesfully().getText();					                //Clicking on Dashboard count
					    Thread.sleep(5000);
						test.log(LogStatus.FAIL, " Final Deliverables Document - " + t  );

					}   
				   Thread.sleep(4000);
   
				      String OptionText5 = "Option 6";
						String xpathExpression5 = String.format("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[6]",OptionText5);
						WebElement dropdownOption5 = getDriver().findElement(By.xpath(xpathExpression5));
						dropdownOption5.click();
						Thread.sleep(7000);

//					    Locator1.DownloadButton().click();					                //Clicking on Dashboard count
//					    Thread.sleep(5000);
						
				       File dir10 = new File("C:\\Users\\shitalb\\Downloads");
						File[] dirContents10 = dir10.listFiles();						//Counting number of files in directory before download
						
						Thread.sleep(3000);
						DepartmentHeadLocator.DownloadButton().click();
						
					 	Thread.sleep(9000);
						File dir11 = new File("C:\\Users\\shitalb\\Downloads");
						File[] allFilesNew11 = dir11.listFiles();						//Counting number of files in directory after download
					  
				       Thread.sleep(3000);
					   if (dirContents10.length < allFilesNew11.length) {
							test.log(LogStatus.PASS,  "Deleted Documents - File Download Successfully");
						}
					   else
					   {
						    Thread.sleep(5000);
						    String t = Locator1.Succssesfully().getText();					                //Clicking on Dashboard count
						    Thread.sleep(5000);
							test.log(LogStatus.FAIL, " Deleted Documents - " + t  );

						}   
					   Thread.sleep(4000);
 
			   
					      String OptionText6 = "Option 7";
							String xpathExpression6 = String.format("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[7]",OptionText6);
							WebElement dropdownOption6 = getDriver().findElement(By.xpath(xpathExpression6));
							dropdownOption6.click();
							Thread.sleep(7000);

//						    Locator1.DownloadButton().click();					                //Clicking on Dashboard count
//						    Thread.sleep(5000);
							
					       File dir12 = new File("C:\\Users\\shitalb\\Downloads");
							File[] dirContents12 = dir12.listFiles();						//Counting number of files in directory before download
							
							Thread.sleep(3000);
							Locator1.DownloadButton().click();
							
						 	Thread.sleep(9000);
							File dir13 = new File("C:\\Users\\shitalb\\Downloads");
							File[] allFilesNew13 = dir13.listFiles();						//Counting number of files in directory after download
						  
					       Thread.sleep(3000);
						   if (dirContents12.length < allFilesNew13.length) {
								test.log(LogStatus.PASS,  "Feedback Form Documents - File Download Successfully");
							}
						   else
						   {
							    Thread.sleep(5000);
							    String t = Locator1.Succssesfully().getText();					                //Clicking on Dashboard count
							    Thread.sleep(5000);
								test.log(LogStatus.FAIL, " Feedback Form Documents - " + t  );

							}   
						   Thread.sleep(3000);
	 
						   DepartmentHeadMethod.MyDocumentMultipleFilter(test,workbook);
							Thread.sleep(5000);
	
	   	
	}
	
	
	
	public static void AuditTracker( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		Thread.sleep(4000);
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(5000);
				
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);

		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(6000);
		              
		int open = Integer.parseInt(DepartmentHeadLocator.PlannedCountAug23().getText());	//Reading Dashboard count.
		DepartmentHeadLocator.PlannedCountAug23().click();					                //Clicking on Dashboard count

        Thread.sleep(5000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
       
       			
		/*
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       */
/*
		String item = DepartmentHeadLocator.GridCunt().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
		*/
        
	    getDriver().switchTo().frame(DepartmentHeadLocator.Frame());
	    Thread.sleep(4000);
		
	    WebElement table = getDriver().findElement(By.xpath("//table[@id='grdSummaryDetailsAuditCoverage']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  " + open );
	    


		Thread.sleep(3000);
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Planned - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Planned - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
		
		
	
		Thread.sleep(4000);
		
		/*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		*/
	    
	    /*
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		DepartmentHeadLocator.ExportToExcel().click();
		
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
			test.log(LogStatus.FAIL,  "File Download Successfully");
		}
*/
	   Thread.sleep(3000);
	  
	    DepartmentHeadMethod.GridAndExcelCountMatchAuditTracker(test,workbook);
		Thread.sleep(4000);

	   
		Thread.sleep(2000);
		getDriver().switchTo().parentFrame();
		Thread.sleep(5000);
		
		DepartmentHeadLocator.ClosePage().click();
		Thread.sleep(5000);

		DepartmentHeadMethod.AuditTrackerActualCount(test,workbook);
		Thread.sleep(5000);
		
	    
	}
	
	
	
	
	public static void AuditTrackerActualCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
	//	Thread.sleep(4000);
	//	DepartmentHeadLocator.ARS().click();
		Thread.sleep(5000);
				
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(6000);
		              
		int open = Integer.parseInt(DepartmentHeadLocator.ActualCountAug23().getText());	//Reading Dashboard count.
		DepartmentHeadLocator.ActualCountAug23().click();					                //Clicking on Dashboard count

        Thread.sleep(5000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
       
       			
		/*
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       */
/*
		String item = DepartmentHeadLocator.GridCunt().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
		*/
        
	    getDriver().switchTo().frame(DepartmentHeadLocator.Frame());
	    Thread.sleep(4000);
		
	    WebElement table = getDriver().findElement(By.xpath("//table[@id='grdSummaryDetailsAuditCoverage']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  " + open );
	    


		Thread.sleep(3000);
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Actual - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Actual - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
		
		
	
		Thread.sleep(4000);
		
		/*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		*/
	    
	    /*
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		DepartmentHeadLocator.ExportToExcel().click();
		
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
			test.log(LogStatus.FAIL,  "File Download Successfully");
		}
*/
	    DepartmentHeadMethod.GridAndExcelCountMatchAuditTracker(test,workbook);
		Thread.sleep(4000);

	   Thread.sleep(3000);
	  
		Thread.sleep(2000);
		getDriver().switchTo().parentFrame();
		Thread.sleep(5000);
		
		DepartmentHeadLocator.ClosePage().click();
		Thread.sleep(5000);


		
	    
	}
	

	
	public static void ObservationProcessWise( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		Thread.sleep(4000);
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(5000);
				
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(5000);
 
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(6000);
		            
		int open = Integer.parseInt(DepartmentHeadLocator.processWiseObservationMajor().getText());	//Reading Dashboard count.
		DepartmentHeadLocator.processWiseObservationMajor().click();					                //Clicking on Dashboard count

        Thread.sleep(15000);
 	/*
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       */
/*
		String item = DepartmentHeadLocator.GridCunt().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
		*/
        
	    getDriver().switchTo().frame(DepartmentHeadLocator.Frame());
	    Thread.sleep(4000);
		
	    WebElement table = getDriver().findElement(By.xpath("(//table[@role='grid'])[1]"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  " + open );
	    


		Thread.sleep(3000);
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Major - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Major - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
		
		
	
		Thread.sleep(4000);
		
		/*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		*/
	    
	    
	    if(DepartmentHeadLocator.ExportToExcel().isEnabled())
		{
			
			Thread.sleep(2000);
			DepartmentHeadLocator.ExportToExcel().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button Is Clickable "  );
			
		}
	    
	    
	    
	    Thread.sleep(20000);
	    
	    String fis1 = "C:\\Users\\shitalb\\Downloads\\Observation Report.xlsx";
		
		File file = new File(fis1);
		  
		 if(file.exists()) {
			 
			 if(file.delete())
			 {
			 
			 System.out.println("File deleted Successfully.");
		     }
			 
		 }
		 else {
			 
			 System.out.println("File does not exist Successfully.");
		 }
		 
	    Thread.sleep(4000);
	    
	//    DepartmentHeadMethod.GridAndExcelCountMatch(test,workbook);
	//	Thread.sleep(4000);
	    
	    /*
	    
	    if(Locator6.View().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator6.View().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		*/
		
		Thread.sleep(2000);
		getDriver().switchTo().parentFrame();
		Thread.sleep(5000);
		
		DepartmentHeadLocator.ClosePage().click();
		Thread.sleep(5000);
		
		DepartmentHeadMethod.ObservationProcessWiseModerate(test,workbook);
		Thread.sleep(4000);
		
		DepartmentHeadMethod.ObservationProcessWiseMinor(test,workbook);
		Thread.sleep(4000);
	    
	}

	
	public static void ObservationProcessWiseModerate( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
//		Thread.sleep(4000);
//		DepartmentHeadLocator.ARS().click();
		Thread.sleep(5000);
						
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(6000);
		            
		int open = Integer.parseInt(DepartmentHeadLocator.processWiseObservationModerate().getText());	//Reading Dashboard count.
		DepartmentHeadLocator.processWiseObservationModerate().click();					                //Clicking on Dashboard count

        Thread.sleep(5000);
 	/*
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       */
/*
		String item = DepartmentHeadLocator.GridCunt().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
		*/
        
	    getDriver().switchTo().frame(DepartmentHeadLocator.Frame());
	    Thread.sleep(4000);
		
	    WebElement table = getDriver().findElement(By.xpath("(//table[@role='grid'])[1]"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  " + open );
	    


		Thread.sleep(3000);
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Moderate - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Moderate - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
		
		
	
		Thread.sleep(4000);
		
		/*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		*/
	    
	    
	    if(DepartmentHeadLocator.ExportToExcel().isEnabled())
		{
			
			Thread.sleep(2000);
			DepartmentHeadLocator.ExportToExcel().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button Is Clickable "  );
			
		}
	    
	    
	    
	    Thread.sleep(20000);
	    
	    String fis1 = "C:\\Users\\shitalb\\Downloads\\Observation Report.xlsx";
		
		File file = new File(fis1);
		  
		 if(file.exists()) {
			 
			 if(file.delete())
			 {
			 
			 System.out.println("File deleted Successfully.");
		     }
			 
		 }
		 else {
			 
			 System.out.println("File does not exist Successfully.");
		 }
		 
	    Thread.sleep(4000);
	    
	//    DepartmentHeadMethod.GridAndExcelCountMatch(test,workbook);
	//	Thread.sleep(4000);
	    
	    /*
	    
	    if(Locator6.View().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator6.View().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		*/
		
		Thread.sleep(2000);
		getDriver().switchTo().parentFrame();
		Thread.sleep(5000);
		
		DepartmentHeadLocator.ClosePage().click();
		Thread.sleep(5000);
		
	    
	}


	
	public static void ObservationProcessWiseMinor( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
//		Thread.sleep(4000);
//		DepartmentHeadLocator.ARS().click();
		Thread.sleep(5000);
						
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(6000);
		            
		int open = Integer.parseInt(DepartmentHeadLocator.processWiseObservationMinor().getText());	//Reading Dashboard count.
		DepartmentHeadLocator.processWiseObservationMinor().click();					                //Clicking on Dashboard count

        Thread.sleep(5000);
 	/*
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       */
/*
		String item = DepartmentHeadLocator.GridCunt().getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
		*/
        
	    getDriver().switchTo().frame(DepartmentHeadLocator.Frame());
	    Thread.sleep(4000);
		
	    WebElement table = getDriver().findElement(By.xpath("(//table[@role='grid'])[1]"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  " + open );
	    


		Thread.sleep(3000);
		
		if(open == length_Row)
					
		{
						
		//test.log(LogStatus.PASS, type+" count matches to number of records displayed.");
						
		test.log(LogStatus.PASS, " Minor - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
					
		else
					
		{
						
		//test.log(LogStatus.FAIL, type+" count doesn't matches to number of records displayed.");
						
		test.log(LogStatus.FAIL, " Minor - Dashboard Count = "+open+" | Displayed records from grid = "+length_Row);
					
		}
		
		
	
		Thread.sleep(4000);
		
		/*
	    JavascriptExecutor jss = (JavascriptExecutor) getDriver();
	    
	    jss.executeScript("window.scrollBy(0,-1000)");
	    Thread.sleep(2000);
		*/
	    
	    
	    if(DepartmentHeadLocator.ExportToExcel().isEnabled())
		{
			
			Thread.sleep(2000);
			DepartmentHeadLocator.ExportToExcel().click();
			test.log(LogStatus.PASS, " Export Button Is Clickable" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, " Export Button Is Clickable "  );
			
		}
	    
	    
	    
	    Thread.sleep(20000);
	    
	    String fis1 = "C:\\Users\\shitalb\\Downloads\\Observation Report.xlsx";
		
		File file = new File(fis1);
		  
		 if(file.exists()) {
			 
			 if(file.delete())
			 {
			 
			 System.out.println("File deleted Successfully.");
		     }
			 
		 }
		 else {
			 
			 System.out.println("File does not exist Successfully.");
		 }
		 
	    Thread.sleep(4000);
	    
	//    DepartmentHeadMethod.GridAndExcelCountMatch(test,workbook);
	//	Thread.sleep(4000);
	    
	    /*
	    
	    if(Locator6.View().isEnabled())
		{
			
			Thread.sleep(2000);
		 Locator6.View().click();
			test.log(LogStatus.PASS, "  View Button Is Clickable " );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, "  View Button Is Clickable "  );
			
		}
		*/
		
		Thread.sleep(2000);
		getDriver().switchTo().parentFrame();
		Thread.sleep(5000);
		
		DepartmentHeadLocator.ClosePage().click();
		Thread.sleep(5000);
		
	    
	}


	public static void MyDocumentFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
       Thread.sleep(9000);	
       /*
		Locator1.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        Locator1.MyDocument().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        */
       DepartmentHeadLocator.Company().click();
		 Thread.sleep(3000);
	     String CompanyText =DepartmentHeadLocator.CompanyDD().getText();
	     Thread.sleep(2000);
	     DepartmentHeadLocator.CompanyDD().click();
		 Thread.sleep(20000);
		
		 DepartmentHeadLocator.FinancialYear().click();
		 Thread.sleep(3000);
		 String FinancialyearText =DepartmentHeadLocator.FinancialYearDD().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.FinancialYearDD().click();
		 Thread.sleep(20000);
		 
		 
		 DepartmentHeadLocator.SchedulingType().click();
	     Thread.sleep(2000);
	     DepartmentHeadLocator.SchedulingTypeDD().click();
		 Thread.sleep(4000);
		
		 DepartmentHeadLocator.Period().click();
		 Thread.sleep(3000);
		 String PeriodText =DepartmentHeadLocator.PeriodDD().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.PeriodDD().click();
		 Thread.sleep(20000);
			
			
	      List<String> li=new ArrayList<String>();
	      
	      li.add(CompanyText);
	      li.add(FinancialyearText);
	      li.add(PeriodText);
	     
	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Company");
			filter.add("Financial Year");
			filter.add("Period");
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,2000)");	
			Thread.sleep(3000);
	
			Locator.Grid2().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator.Grid2().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[2]"));
			List<WebElement> financialyearcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[5]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[6]"));

			
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
				
					else if(i==1)
					{
						raw.addAll(financialyearcol);
					}
				
					else if(i==2)
					{
						raw.addAll(periodcol);
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
	

	public static void MyReportAllReports( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		Thread.sleep(9000);
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		       	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	  
		DepartmentHeadLocator.ExicutiveSummary().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	    
	       File dir2 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			DepartmentHeadLocator.DownloadButton().click();
			
		 	Thread.sleep(9000);
			File dir3 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		  
	        Thread.sleep(3000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "Executive Summary Report Download Successfully");
			}
		   else
		   {
			 	test.log(LogStatus.FAIL, " Executive Summary Report Does Not Download Successfully "   );
	 
			}   
		   Thread.sleep(4000);
		
			DepartmentHeadMethod.InternalAuditReport(test,workbook);
			Thread.sleep(1000);

			DepartmentHeadMethod.FinalAuditReport(test,workbook);
			Thread.sleep(1000);
			
			DepartmentHeadMethod.ScedulingDeviation(test,workbook);
			Thread.sleep(1000);

			DepartmentHeadMethod.OpenObservation(test,workbook);
			Thread.sleep(1000);
			
			DepartmentHeadMethod.AuditStatus(test,workbook);
			Thread.sleep(1000);

			DepartmentHeadMethod.AuditScheduling(test,workbook);
			Thread.sleep(1000);
			
			DepartmentHeadMethod.AuditCommitteeReport(test,workbook);
			Thread.sleep(1000);

			DepartmentHeadMethod.PreRequisiteLogReport(test,workbook);
			Thread.sleep(1000);

			DepartmentHeadMethod.ManagementResponceLogReport(test,workbook);
			Thread.sleep(1000);
		
			DepartmentHeadMethod.MyReportPastauditReport(test,workbook);
			Thread.sleep(1000);
	}
	
	
	
	public static void InternalAuditReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		        	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	  
		DepartmentHeadLocator.InternalAuditReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	    
	       File dir2 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			DepartmentHeadLocator.DownloadButton1().click();
			
		 	Thread.sleep(9000);
			File dir3 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		  
	        Thread.sleep(3000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "Internal Audit Report Download Successfully");
			}
		   else
		   {
			 	test.log(LogStatus.FAIL, " Internal Audit Report Does Not Download Successfully "   );
	 
			}   
		   Thread.sleep(4000);
		
	    
	    


	}
	
	
	
	
	public static void FinalAuditReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(9000);
		/*
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(4000);
        */	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	  
		DepartmentHeadLocator.FinalAudit().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);

                        
     	sheet = workbook.getSheetAt(3); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
 		int row = 0;
 		Thread.sleep(500);
 		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
 		Cell c1 = null;
 		   
 		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		DepartmentHeadLocator.DraftReportChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);

		DepartmentHeadLocator.UploadBtton1().click();					                //Clicking on Dashboard count
	    Thread.sleep(5000);
	    
	    String t = DepartmentHeadLocator.SuccessfullyReport().getText();					                //Clicking on Dashboard count
	    Thread.sleep(5000);
	    
		test.log(LogStatus.PASS, " Final Audit Report  - Draft Report " + t);
		Thread.sleep(5000);
	    
        File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		DepartmentHeadLocator.DownloadBtton1().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
	  
        Thread.sleep(3000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "Draft Report Download Successfully");
		}
	   else
	   {
		 	test.log(LogStatus.FAIL, " Draft Report Does Not Download Successfully "   );
 
		}   
	   Thread.sleep(4000);
	   
     
		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		DepartmentHeadLocator.FinalDeliverableChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);

		DepartmentHeadLocator.UploadButton2().click();					                //Clicking on Dashboard count
	    Thread.sleep(5000);
	    
	    String t1 = DepartmentHeadLocator.SuccessfullyReport().getText();					                //Clicking on Dashboard count
	    Thread.sleep(5000);
	    
		test.log(LogStatus.PASS, " Final Deliverables Report " + t1);
		Thread.sleep(5000);
	    
       File dir = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		DepartmentHeadLocator.DownloadButton2().click();
		
	 	Thread.sleep(9000);
		File dir4 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew4 = dir4.listFiles();						//Counting number of files in directory after download
	  
       Thread.sleep(3000);
	   if (dirContents.length < allFilesNew4.length) {
			test.log(LogStatus.PASS,  "Final Deliverables Report Download Successfully");
		}
	   else
	   {
		 	test.log(LogStatus.FAIL, " Final Deliverables Report Does Not Download Successfully "   );

		}   
	   Thread.sleep(4000);
	   
		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		DepartmentHeadLocator.AuditComiteeChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);

		DepartmentHeadLocator.UploadButton3().click();					                //Clicking on Dashboard count
	    Thread.sleep(5000);
	    
	    String t2 = DepartmentHeadLocator.SuccessfullyReport().getText();					                //Clicking on Dashboard count
	    Thread.sleep(5000);
	    
		test.log(LogStatus.PASS, " Audit Committee Report " + t2);
		Thread.sleep(5000);
	    
        File dir5 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents5 = dir5.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		DepartmentHeadLocator.DownloadButton3().click();
		
	 	Thread.sleep(9000);
		File dir6 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew6 = dir6.listFiles();						//Counting number of files in directory after download
	  
      Thread.sleep(3000);
	   if (dirContents5.length < allFilesNew6.length) {
			test.log(LogStatus.PASS,  "Audit Committee Report Download Successfully");
		}
	   else
	   {
		 	test.log(LogStatus.FAIL, " Audit Committee Report Does Not Download Successfully "   );

		}   
	   Thread.sleep(4000);
	  

	   
		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		DepartmentHeadLocator.FeedbackFormChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
    
	       if(DepartmentHeadLocator.UploadButton4().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			DepartmentHeadLocator.UploadButton4().click();
	 			test.log(LogStatus.PASS, "Feedback Form Uploaded Successfully " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "Feedback Form Does Not Uploaded Successfully"  );
	 			
	 		}
	        Thread.sleep(3000);
	  
	    /*
	    String t3 = Locator1.SuccessfullyReport().getText();					                //Clicking on Dashboard count
	    Thread.sleep(5000);
	    
		test.log(LogStatus.PASS, " Feedback Form " + t3);
		Thread.sleep(5000);
	    */
        File dir7 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents7 = dir7.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		DepartmentHeadLocator.DownloadButton4().click();
		
	 	Thread.sleep(9000);
		File dir8 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew8 = dir8.listFiles();						//Counting number of files in directory after download
	  
        Thread.sleep(3000);
	   if (dirContents7.length < allFilesNew8.length) {
			test.log(LogStatus.PASS,  "Feedback Form Report Download Successfully");
		}
	   else
	   {
		 	test.log(LogStatus.FAIL, " Feedback Form Report Does Not Download Successfully "   );

		}   
	   Thread.sleep(4000);
	    
        File dir9 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		DepartmentHeadLocator.AllFileDownloadButton5().click();
		
	 	Thread.sleep(9000);
		File dir0 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
	  
       Thread.sleep(3000);
	   if (dirContents9.length < allFilesNew0.length) {
			test.log(LogStatus.PASS,  "All Report Download Successfully");
		}
	   else
	   {
		 	test.log(LogStatus.FAIL, " All Report Does Not Download Successfully "   );

		}   
	   Thread.sleep(4000);
	
	
	}
	

	public static void ScedulingDeviation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
       	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	  
		DepartmentHeadLocator.SchedulingDeviation().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	    
		DepartmentHeadLocator.Company1().click();					                //Clicking on Dashboard count
	    Thread.sleep(1000);  
		DepartmentHeadLocator.Company1DD().click();					                //Clicking on Dashboard count
	    Thread.sleep(1000);
	    
		DepartmentHeadLocator.SchedulingType1().click();					                //Clicking on Dashboard count
	    Thread.sleep(1000);  
		DepartmentHeadLocator.SchedulingType1DD().click();					                //Clicking on Dashboard count
	    Thread.sleep(1000);

		DepartmentHeadLocator.Period1().click();					                //Clicking on Dashboard count
	    Thread.sleep(1000);  
		DepartmentHeadLocator.Period1DD().click();					                //Clicking on Dashboard count
	    Thread.sleep(1000);

	    
	       File dir2 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			DepartmentHeadLocator.ExportToExcelButton().click();
			
		 	Thread.sleep(9000);
			File dir3 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		  
	        Thread.sleep(3000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "Scheduling Deviation Report Download Successfully");
			}
		   else
		   {
				Thread.sleep(6000);
				String t = DepartmentHeadLocator.SuccessfullyReport().getText();		   
			 	test.log(LogStatus.FAIL, t   );
	 
			}   
		   Thread.sleep(4000);
		
	    
	    


	}
	
	
	
	public static void OpenObservation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
       	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	  
		DepartmentHeadLocator.OpenObservation().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	    
	    /*
	       File dir2 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			DepartmentHeadLocator.Exportbutton().click();
			
		 	Thread.sleep(9000);
			File dir3 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		  
	        Thread.sleep(3000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "Open Observation Report Download Successfully");
			}
		   else
		   {
				Thread.sleep(2000);
			//	String t = DepartmentHeadLocator.ExportToExcelButton().getText();		   
			 	test.log(LogStatus.FAIL, "Open Observation Report Does Not Download Successfully"   );
	 
			}  
			 
		   Thread.sleep(4000);
		*/
			DepartmentHeadMethod.GridAndExcelCountMatchOpenObservationReport(test,workbook);
			Thread.sleep(1000);
		   


	}
	
	
	
	
	public static void AuditStatus( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
//		Thread.sleep(9000);
//		Locator1.ARS().click();
	//	Thread.sleep(3000);
	
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
       	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	  
		DepartmentHeadLocator.AuditStatus().click();					                //Clicking on Dashboard count
	    Thread.sleep(9000);
	    
	    
	       File dir2 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			DepartmentHeadLocator.Exportbutton1().click();
			
		 	Thread.sleep(17000);
			File dir3 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		  
	        Thread.sleep(6000);
		   if (dirContents1.length < allFilesNew1.length) {
			   Thread.sleep(2000);
				test.log(LogStatus.PASS,  "Audit Status Report Download Successfully");
			}
		   else
		   {
				Thread.sleep(2000);
			//	String t = DepartmentHeadLocator.ExportToExcelButton().getText();		   
			 	test.log(LogStatus.FAIL, "Audit Status Report Does Not Download Successfully"   );
	 
			}   
		   Thread.sleep(4000);
		
	}
	
	

	
	
	public static void AuditScheduling( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
       	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	  
		DepartmentHeadLocator.AuditScheduling().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	    
	    /*
	       File dir2 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			DepartmentHeadLocator.AuditSchedulingExport().click();
			
		 	Thread.sleep(9000);
			File dir3 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		  
	        Thread.sleep(3000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "Audit Scheduling Report Download Successfully");
			}
		   else
		   {
				Thread.sleep(2000);
			//	String t = DepartmentHeadLocator.ExportToExcelButton().getText();		   
			 	test.log(LogStatus.FAIL, "Audit Scheduling Report Does Not Download Successfully"   );
	 
			}   
		   Thread.sleep(4000);
		   */
			DepartmentHeadMethod.GridAndExcelCountMatchAuditSchedulingReport(test,workbook);
			Thread.sleep(1000);
		   
		   
		
	}
	
	
	
	public static void AuditCommitteeReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
       	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	  
		DepartmentHeadLocator.AuditComitee().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	    
		DepartmentHeadLocator.AuditComiteeFromMonth().click();					                //Clicking on Dashboard count
	    Thread.sleep(1000);
	  
		DepartmentHeadLocator.AuditComiteeFromMonthDD().click();					                //Clicking on Dashboard count
	    Thread.sleep(1000);

		DepartmentHeadLocator.AuditComiteeToMonth().click();					                //Clicking on Dashboard count
	    Thread.sleep(1000);
	  
		DepartmentHeadLocator.AuditComiteeToMonthDD().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);

	    
	       File dir2 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(2000);
			DepartmentHeadLocator.AuditComiteeExport().click();
			
		 	Thread.sleep(10000);
			File dir3 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		  
	        Thread.sleep(3000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "Audit Committee Report Download Successfully");
			}
		   else
		   {
				Thread.sleep(2000);
			//	String t = DepartmentHeadLocator.ExportToExcelButton().getText();		   
			 	test.log(LogStatus.FAIL, "Audit Committee Report Does Not Download Successfully"   );
	 
			}   
		   Thread.sleep(4000);
		
	    
	    


	}
	
	
	
	public static void PreRequisiteLogReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
       	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	  
		DepartmentHeadLocator.PreRequisiteLogReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	    
		DepartmentHeadLocator.Company1().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);	  
		DepartmentHeadLocator.Company2DD().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);

		DepartmentHeadLocator.FinancialYear1().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);	  
		DepartmentHeadLocator.FinancialYear1DD().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	    
		DepartmentHeadLocator.SchedulingType1().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);	  
		DepartmentHeadLocator.SchedulingType1DD().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);

		DepartmentHeadLocator.Period1().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);	  
		DepartmentHeadLocator.Period1DD().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);

	    
	       File dir2 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			DepartmentHeadLocator.PreRequisiteLogReportExport().click();
			
		 	Thread.sleep(9000);
			File dir3 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		  
	        Thread.sleep(3000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "Pre-Requisite Log Report Download Successfully");
			}
		   else
		   {
				Thread.sleep(2000);
				String t = DepartmentHeadLocator.Successfully1().getText();		   
			 	test.log(LogStatus.FAIL, t   );
	 
			}   
		   Thread.sleep(4000);
	}
	

	
	public static void ManagementResponceLogReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
	//	Thread.sleep(9000);
	//	Locator1.ARS().click();
	//	Thread.sleep(3000);

		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
       	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	  
		DepartmentHeadLocator.ManagementResponceLogReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	    
		DepartmentHeadLocator.SelectCompany().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);	  
		DepartmentHeadLocator.Company2DD().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);

		DepartmentHeadLocator.FinancialYear1().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);	  
		DepartmentHeadLocator.FinancialYear1DD().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	    
		DepartmentHeadLocator.SchedulingType1().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);	  
		DepartmentHeadLocator.SchedulingType1DD().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);

		DepartmentHeadLocator.Period1().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);	  
		DepartmentHeadLocator.Period1DD().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);

	    
	       File dir2 = new File("C:\\Users\\shitalb\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			DepartmentHeadLocator.PreRequisiteLogReportExport().click();
			
		 	Thread.sleep(9000);
			File dir3 = new File("C:\\Users\\shitalb\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		  
	        Thread.sleep(3000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "Management Response Log Report Download Successfully");
			}
		   else
		   {
				Thread.sleep(2000);
				String t = DepartmentHeadLocator.Successfully1().getText();		   
			 	test.log(LogStatus.FAIL, t   );
	 
			}   
		   Thread.sleep(4000);
	}
	

	
	
	public static void MyReportPastauditReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
       Thread.sleep(4000);
       
//		DepartmentHeadLocator.ARS().click();
//		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
              
        DepartmentHeadLocator.PastAuditReport().click();					                //Clicking on Dashboard count
        Thread.sleep(6000);
        
        sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
			

        
        if(DepartmentHeadLocator.SearchBox().isEnabled())
 		{
 			
 			Thread.sleep(2000);
	        row0 = sheet.getRow(51);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DepartmentHeadLocator.SearchBox().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
	        DepartmentHeadLocator.Grid().click();					                //Clicking on Dashboard count
	        Thread.sleep(20000);
	   
	//        String t1 = DepartmentHeadLocator.UnitGet().getText();				                //Clicking on Dashboard count
	 //       Thread.sleep(6000);
    
 			test.log(LogStatus.PASS, "Search Box Working Properly "  );
 			
 		}
 		
 		else
 		{
 			Thread.sleep(6000);
 			test.log(LogStatus.FAIL, "Search Box Not Working Properly"  );
 			
 		}
        Thread.sleep(6000);

               
        DepartmentHeadLocator.AddNewPastAuditReport().click();
		Thread.sleep(5000);
		
        getDriver().switchTo().frame(DepartmentHeadLocator.Frame2());
		Thread.sleep(7000);
 
		DepartmentHeadLocator.Unit().click();
		 Thread.sleep(3000);
		 DepartmentHeadLocator.MROpenObservationCompanyDD().click();
		 Thread.sleep(20000);
		 
		 DepartmentHeadLocator.FinancialYear2().click();
		 Thread.sleep(3000);
		 DepartmentHeadLocator.FinancialYearMReportDD().click();
		 Thread.sleep(20000);
		 
		 DepartmentHeadLocator.AuditBackground().click();
	     Thread.sleep(2000);
	     DepartmentHeadLocator.AuditBackgroundDD().click();
		 Thread.sleep(20000);
		 
		 DepartmentHeadLocator.ReportGenerationDate().click();
		 Thread.sleep(3000);		 
		 DepartmentHeadLocator.ReportGenerationDateDD().click();
		 Thread.sleep(20000);
			
	        
	        row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DepartmentHeadLocator.ReportIssueByTextBox().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
		
	        row0 = sheet.getRow(47);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DepartmentHeadLocator.ReportTitleTextBox().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);

	        row0 = sheet.getRow(48);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DepartmentHeadLocator.RemarkTextBox().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);

	        row0 = sheet.getRow(49);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DepartmentHeadLocator.UploadFile().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);

			DepartmentHeadLocator.SavePastAudit().click();
			 Thread.sleep(20000);

			 String t = DepartmentHeadLocator.SuccessfullySave().getText();
			 Thread.sleep(20000);

	 		 test.log(LogStatus.PASS, "Add Past Audit - " + t  );
	 		 Thread.sleep(20000);
			
		        File dir9 = new File("C:\\Users\\shitalb\\Downloads");
		 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
		 		
		 		Thread.sleep(3000);
		 		DepartmentHeadLocator.Download().click();
		 		
		 	 	Thread.sleep(9000);
		 		File dir0 = new File("C:\\Users\\shitalb\\Downloads");
		 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
		 	  
		        Thread.sleep(3000);
		 	   if (dirContents9.length < allFilesNew0.length) {
		 			test.log(LogStatus.PASS,  " File Download Successfully");
		 		}
		 	   else
		 	   {
		 		 	test.log(LogStatus.FAIL, "  File Does Not Download Successfully "   );

		 		}   
		 	   Thread.sleep(4000);


		        if(DepartmentHeadLocator.ViewButton2().isEnabled())
		 		{
		 			
		 			Thread.sleep(2000);
		 			DepartmentHeadLocator.ViewButton2().click();
		 			test.log(LogStatus.PASS, "View Button Is Clickable " );
		 			
		 		}
		 		
		 		else
		 		{
		 			test.log(LogStatus.FAIL, "View Button Is Clickable"  );
		 			
		 		}
		        Thread.sleep(6000);
		 
		        DepartmentHeadLocator.ClosePopup().click();
				 Thread.sleep(7000);

			        if(DepartmentHeadLocator.CloseButton1().isEnabled())
			 		{
			 			
			 			Thread.sleep(2000);
			 			DepartmentHeadLocator.CloseButton1().click();
			 			test.log(LogStatus.PASS, "Close Button Is Clickable " );
			 			
			 		}
			 		
			 		else
			 		{
			 			test.log(LogStatus.FAIL, "Close Button Is Clickable"  );
			 			
			 		}
			        Thread.sleep(3000);
			        

			
			
	}
	
	
	
	public static void MyReportPastauditReportUpdate( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
       Thread.sleep(9000);
       
       DepartmentHeadLocator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
               
        DepartmentHeadLocator.PastAuditReport().click();					                //Clicking on Dashboard count
        Thread.sleep(6000);
         
        DepartmentHeadLocator.Update().click();
		Thread.sleep(5000);
		
        getDriver().switchTo().frame(DepartmentHeadLocator.Frame2());
		Thread.sleep(7000);
 
		DepartmentHeadLocator.Unit().click();
		 Thread.sleep(3000);
		 DepartmentHeadLocator.Company1DD().click();
		 Thread.sleep(20000);
		 
		 DepartmentHeadLocator.FinancialYear2().click();
		 Thread.sleep(3000);
		 DepartmentHeadLocator.FinancialYearMReportDD().click();
		 Thread.sleep(20000);
		 
		 DepartmentHeadLocator.AuditBackground().click();
	     Thread.sleep(2000);
	     DepartmentHeadLocator.AuditBackgroundDD().click();
		 Thread.sleep(20000);
		 
		 DepartmentHeadLocator.ReportGenerationDate().click();
		 Thread.sleep(3000);		 
		 DepartmentHeadLocator.ReportGenerationDateDD().click();
		 Thread.sleep(20000);
			
	        sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
				
			DepartmentHeadLocator.ReportIssueByTextBox().clear();
			Thread.sleep(2000);
			
	        row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DepartmentHeadLocator.ReportIssueByTextBox().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			DepartmentHeadLocator.ReportTitleTextBox().clear();
			Thread.sleep(2000);
		
	        row0 = sheet.getRow(47);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DepartmentHeadLocator.ReportTitleTextBox().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			DepartmentHeadLocator.RemarkTextBox().clear();
			Thread.sleep(2000);

	        row0 = sheet.getRow(48);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DepartmentHeadLocator.RemarkTextBox().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);

			/*
	        row0 = sheet.getRow(49);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.UploadFile().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
*/
			DepartmentHeadLocator.SavePastAudit().click();
			 Thread.sleep(20000);

			 String t = DepartmentHeadLocator.SuccessfullySave().getText();
			 Thread.sleep(20000);

	 		 test.log(LogStatus.PASS, "Update Past Audit - " + t  );
	 		 Thread.sleep(2000);
			
	 		 /*
		        File dir9 = new File("C:\\Users\\shitalb\\Downloads");
		 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
		 		
		 		Thread.sleep(3000);
		 		DepartmentHeadLocator.Download().click();
		 		
		 	 	Thread.sleep(9000);
		 		File dir0 = new File("C:\\Users\\shitalb\\Downloads");
		 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
		 	  
		        Thread.sleep(3000);
		 	   if (dirContents9.length < allFilesNew0.length) {
		 			test.log(LogStatus.PASS,  " File Download Successfully");
		 		}
		 	   else
		 	   {
		 		 	test.log(LogStatus.FAIL, "  File Does Not Download Successfully "   );

		 		}   
		 	   Thread.sleep(4000);


		        if(DepartmentHeadLocator.ViewButton2().isEnabled())
		 		{
		 			
		 			Thread.sleep(2000);
		 			DepartmentHeadLocator.ViewButton2().click();
		 			test.log(LogStatus.PASS, "View Button Is Clickable " );
		 			
		 		}
		 		
		 		else
		 		{
		 			test.log(LogStatus.FAIL, "View Button Is Clickable"  );
		 			
		 		}
		 		
		        Thread.sleep(6000);
		 
		        DepartmentHeadLocator.ClosePopup().click();
		        */
				 Thread.sleep(7000);

			        if(DepartmentHeadLocator.CloseButton1().isEnabled())
			 		{
			 			
			 			Thread.sleep(2000);
			 			DepartmentHeadLocator.CloseButton1().click();
			 			test.log(LogStatus.PASS, "Close Button Is Clickable " );
			 			
			 		}
			 		
			 		else
			 		{
			 			test.log(LogStatus.FAIL, "Close Button Is Clickable"  );
			 			
			 		}
			        Thread.sleep(5000);

			        if(DepartmentHeadLocator.ViewPastAuditReport().isEnabled())
			 		{
			 			
			 			Thread.sleep(2000);
			 			DepartmentHeadLocator.ViewPastAuditReport().click();
			 			test.log(LogStatus.PASS, "Past Audit Reports Page - View Button Is Clickable " );
			 			
			 		}
			 		
			 		else
			 		{
			 			test.log(LogStatus.FAIL, "Past Audit Reports - View Button Is Clickable"  );
			 			
			 		}
			        Thread.sleep(5000);

			        getDriver().switchTo().frame(DepartmentHeadLocator.Frame());
					Thread.sleep(7000);
					
			        File dir = new File("C:\\Users\\shitalb\\Downloads");
			 		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			 		
			 		Thread.sleep(3000);
			 		DepartmentHeadLocator.DownloadButton1().click();
			 		
			 	 	Thread.sleep(9000);
			 		File dir1 = new File("C:\\Users\\shitalb\\Downloads");
			 		File[] allFilesNew1 = dir1.listFiles();						//Counting number of files in directory after download
			 	  
			        Thread.sleep(3000);
			 	   if (dirContents.length < allFilesNew1.length) {
			 			test.log(LogStatus.PASS,  " Document Download Successfully");
			 		}
			 	   else
			 	   {
			 		 	test.log(LogStatus.FAIL, "  Document Does Not Download Successfully "   );

			 		}   
			 	   Thread.sleep(4000);


			        if(DepartmentHeadLocator.ViewDocument().isEnabled())
			 		{
			 			
			 			Thread.sleep(2000);
			 			DepartmentHeadLocator.ViewDocument().click();
			 			test.log(LogStatus.PASS, " Document View Successfully " );
			 			
			 		}
			 		
			 		else
			 		{
			 			test.log(LogStatus.FAIL, " Document Does Not View Successfully"  );
			 			
			 		}
			        Thread.sleep(5000);

			        
			
	}
	

	public static void GridAndExcelCountMatchAuditTracker( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		Thread.sleep(1000);
		/*
		Locator.IFC().click();
		Thread.sleep(5000);
		
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(5000);
		
        
		Locator3.CompliedGraph().click();	
		Thread.sleep(4000);
		
		*/
			
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
       

	    WebElement table = getDriver().findElement(By.xpath("//table[@id='grdSummaryDetailsAuditCoverage']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  "  );
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
		Thread.sleep(2000);
	//	DepartmentHeadLocator.ExportToExcel().click();
	//	Thread.sleep(20000);
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		DepartmentHeadLocator.ExportToExcel().click();
		
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
			test.log(LogStatus.FAIL,  "File Download Successfully");
		}

	   Thread.sleep(3000);
	   
	
		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\shitalb\\Downloads\\Audit Status Report.xlsx");
	//Workbook workbook = new XSSFWorkbook(fileInputStream);	
	workbook = new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(0);
	
	//int rowCount = sheet.getLastRowNum();
	
	sheet = workbook.getSheetAt(0);
	int columnNumber = 3;
	int rowCount = 0;
	int actualRow=0;
	
	for(Row row : sheet)
	{
		
		Cell cell =row.getCell(columnNumber);
		if(cell != null) {
			
			rowCount++;
			actualRow = rowCount-1;
		}
		
	}
	
	
	System.out.println("Row Count in column  " + columnNumber + ": " + actualRow);
	
	workbook.close();
	fis.close();
	
	if(length_Row == actualRow)
	{
		//test.log(LogStatus.PASS, "No of records from grid matches to no of records in Excel Sheet.");
		test.log(LogStatus.PASS, "Total records from Grid = "+length_Row+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, "Total records from Grid = "+length_Row+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\Users\\shitalb\\Downloads\\Audit Status Report.xlsx";
	
	File file = new File(fis1);
	  
	 if(file.exists()) {
		 
		 if(file.delete())
		 {
		 
		 System.out.println("File deleted Successfully.");
	     }
		 
	 }
	 else {
		 
		 System.out.println("File does not exist Successfully.");
	 }
	 
	
	
	 
 }
	
	
	
	public static void GridAndExcelCountMatchOpenObservationReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		Thread.sleep(1000);
		/*
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(5000);
		
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	  
		DepartmentHeadLocator.OpenObservation().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	    

		/*
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(5000);
				
		*/
			
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000);
       
	    String OptionText = "Option 2";
		String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText);
		WebElement dropdownOption = getDriver().findElement(By.xpath(xpathExpression));
		dropdownOption.click();
		Thread.sleep(5000);


	    WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  "  );
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
		Thread.sleep(2000);
	//	DepartmentHeadLocator.ExportToExcel().click();
	//	Thread.sleep(20000);
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		DepartmentHeadLocator.Exportbutton().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
	  
        Thread.sleep(3000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "Open Observation Report Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL,  "Open Observation Report Download Successfully");
		}

	   Thread.sleep(3000);
	   
	
		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\shitalb\\Downloads\\OpenObservationReport.xlsx");
	//Workbook workbook = new XSSFWorkbook(fileInputStream);	
	workbook = new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(0);
	
	//int rowCount = sheet.getLastRowNum();
	
	sheet = workbook.getSheetAt(0);
	int columnNumber = 3;
	int rowCount = 0;
	int actualRow=0;
	
	for(Row row : sheet)
	{
		
		Cell cell =row.getCell(columnNumber);
		if(cell != null) {
			
			rowCount++;
			actualRow = rowCount-1;
		}
		
	}
	
	
	System.out.println("Row Count in column  " + columnNumber + ": " + actualRow);
	
	workbook.close();
	fis.close();
	
	if(length_Row == actualRow)
	{
		//test.log(LogStatus.PASS, "No of records from grid matches to no of records in Excel Sheet.");
		test.log(LogStatus.PASS, "Total records from Grid = "+length_Row+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, "Total records from Grid = "+length_Row+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\Users\\shitalb\\Downloads\\OpenObservationReport.xlsx";
	
	File file = new File(fis1);
	  
	 if(file.exists()) {
		 
		 if(file.delete())
		 {
		 
		 System.out.println("File deleted Successfully.");
	     }
		 
	 }
	 else {
		 
		 System.out.println("File does not exist Successfully.");
	 }
	 
	
	
	 
 }
	
	
	
	
	public static void GridAndExcelCountMatchAuditSchedulingReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		Thread.sleep(1000);
		/*
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(5000);
		
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	  
		DepartmentHeadLocator.OpenObservation().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	    

		/*
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(5000);
				
		*/
			
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000);
       
	    String OptionText = "Option 2";
		String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText);
		WebElement dropdownOption = getDriver().findElement(By.xpath(xpathExpression));
		dropdownOption.click();
		Thread.sleep(5000);


	    WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-1;
	    
	    System.out.println(length_Row + "  "  );
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
		Thread.sleep(2000);
	//	DepartmentHeadLocator.ExportToExcel().click();
	//	Thread.sleep(20000);
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		DepartmentHeadLocator.AuditSchedulingExport().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
	  
        Thread.sleep(3000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "Audit Scheduling Report Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL,  "Audit Scheduling Report Download Successfully");
		}

	   Thread.sleep(3000);
	   
	
		
		
	FileInputStream fis = new FileInputStream("C:\\Users\\shitalb\\Downloads\\Audit Scheduling Report.xlsx");
	//Workbook workbook = new XSSFWorkbook(fileInputStream);	
	workbook = new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(0);
	
	//int rowCount = sheet.getLastRowNum();
	
	sheet = workbook.getSheetAt(0);
	int columnNumber = 3;
	int rowCount = 0;
	int actualRow=0;
	
	for(Row row : sheet)
	{
		
		Cell cell =row.getCell(columnNumber);
		if(cell != null) {
			
			rowCount++;
			actualRow = rowCount-1;
		}
		
	}
	
	
	System.out.println("Row Count in column  " + columnNumber + ": " + actualRow);
	
	workbook.close();
	fis.close();
	
	if(length_Row == actualRow)
	{
		//test.log(LogStatus.PASS, "No of records from grid matches to no of records in Excel Sheet.");
		test.log(LogStatus.PASS, "Total records from Grid = "+length_Row+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, "Total records from Grid = "+length_Row+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\Users\\shitalb\\Downloads\\Audit Scheduling Report.xlsx";
	
	File file = new File(fis1);
	  
	 if(file.exists()) {
		 
		 if(file.delete())
		 {
		 
		 System.out.println("File deleted Successfully.");
	     }
		 
	 }
	 else {
		 
		 System.out.println("File does not exist Successfully.");
	 }
	 
	
	
	 
 }
	
	
	
	public static void MyDocumentMultipleFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		 Thread.sleep(1000);
		 
		 DepartmentHeadLocator.ARS().click();
		 Thread.sleep(3000);
		
		 WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
		 Thread.sleep(2000);
				
		 DepartmentHeadLocator.MyDocument().click();
		 Thread.sleep(7000);
		 
						
		 DepartmentHeadLocator.Company().click();
		 Thread.sleep(3000);
	     String UnitText =DepartmentHeadLocator.CompanyDD().getText();
	     Thread.sleep(2000);
	     DepartmentHeadLocator.CompanyDD().click();
		 Thread.sleep(20000);
		 
		 DepartmentHeadLocator.FinancialYear().click();
		 Thread.sleep(3000);
		 String FinancialYearText =DepartmentHeadLocator.FinancialYearDD().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.FinancialYearDD().click();
		 Thread.sleep(20000);
		
		 DepartmentHeadLocator.SchedulingType().click();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.SchedulingTypeDD().click();
		 Thread.sleep(20000);

		 DepartmentHeadLocator.Period().click();
		 Thread.sleep(3000);
		 String PeriodText =DepartmentHeadLocator.PeriodDD1().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.PeriodDD1().click();
		 Thread.sleep(20000);


	     
	      List<String> li=new ArrayList<String>();
	      
	      li.add(UnitText);
	      li.add(FinancialYearText);
	      li.add(PeriodText);

	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Unit");
			filter.add("Financial Year");
			filter.add("Period");
			
			/*
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);
	*/
			DepartmentHeadLocator.Grid().click();					//Clicking on Text of total items just to scroll down.
			String s = DepartmentHeadLocator.Grid().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[2]"));
			List<WebElement> financialYearcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[5]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[6]"));

			
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
				else if(i==1)
					{
						raw.addAll(financialYearcol);
					}
					
				else if(i==2)
				{
					raw.addAll(periodcol);
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
			
			Thread.sleep(4000);	
		
		
	}
	

	
	
	public static void ExicutiveSummaryFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		Thread.sleep(9000);
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		       	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	  
		DepartmentHeadLocator.ExicutiveSummary().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);

		 DepartmentHeadLocator.Company().click();
		 Thread.sleep(3000);
	     String UnitText =DepartmentHeadLocator.CompanyDD().getText();
	     Thread.sleep(2000);
	     DepartmentHeadLocator.CompanyDD().click();
		 Thread.sleep(20000);
		 
		 DepartmentHeadLocator.FinancialYear().click();
		 Thread.sleep(3000);
		 String FinancialYearText =DepartmentHeadLocator.FinancialYearDD().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.FinancialYearDD().click();
		 Thread.sleep(4000);
		
		 DepartmentHeadLocator.SchedulingType().click();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.SchedulingTypeDD().click();
		 Thread.sleep(3000);

		 DepartmentHeadLocator.Period().click();
		 Thread.sleep(3000);
		 String PeriodText =DepartmentHeadLocator.PeriodDD1().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.PeriodDD1().click();
		 Thread.sleep(22000);


	     
	      List<String> li=new ArrayList<String>();
	      
	      li.add(UnitText);
	      li.add(FinancialYearText);
	      li.add(PeriodText);

	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Unit");
			filter.add("Financial Year");
			filter.add("Period");
			
			/*
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);
	*/
			DepartmentHeadLocator.Grid().click();					//Clicking on Text of total items just to scroll down.
			String s = DepartmentHeadLocator.Grid().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits']/tbody/tr[2]/td[2]"));
			List<WebElement> financialYearcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits']/tbody/tr[2]/td[5]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits']/tbody/tr[2]/td[6]"));

			
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
				else if(i==1)
					{
						raw.addAll(financialYearcol);
					}
					
				else if(i==2)
				{
					raw.addAll(periodcol);
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
			
			Thread.sleep(4000);	
		

	
	}
	
	
	
	public static void InternalAuditReportFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(4000);
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		        	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	  
		DepartmentHeadLocator.InternalAuditReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	    
		 DepartmentHeadLocator.Company().click();
		 Thread.sleep(3000);
	     String UnitText =DepartmentHeadLocator.CompanyDD().getText();
	     Thread.sleep(2000);
	     DepartmentHeadLocator.CompanyDD().click();
		 Thread.sleep(20000);
		 
		 DepartmentHeadLocator.FinancialYear().click();
		 Thread.sleep(3000);
		 String FinancialYearText =DepartmentHeadLocator.FinancialYearDD().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.FinancialYearDD().click();
		 Thread.sleep(4000);
		
		 DepartmentHeadLocator.SchedulingType().click();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.SchedulingTypeDD().click();
		 Thread.sleep(3000);

		 DepartmentHeadLocator.Period().click();
		 Thread.sleep(3000);
		 String PeriodText =DepartmentHeadLocator.PeriodDD1().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.PeriodDD1().click();
		 Thread.sleep(22000);


	     
	      List<String> li=new ArrayList<String>();
	      
	      li.add(UnitText);
	      li.add(FinancialYearText);
	      li.add(PeriodText);

	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Unit");
			filter.add("Financial Year");
			filter.add("Period");
			
			/*
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);
	*/
			DepartmentHeadLocator.Grid().click();					//Clicking on Text of total items just to scroll down.
			String s = DepartmentHeadLocator.Grid().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits']/tbody/tr[2]/td[2]"));
			List<WebElement> financialYearcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits']/tbody/tr[2]/td[5]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits']/tbody/tr[2]/td[6]"));

			
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
				else if(i==1)
					{
						raw.addAll(financialYearcol);
					}
					
				else if(i==2)
				{
					raw.addAll(periodcol);
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
			
			Thread.sleep(4000);	
		

	}
	
	
	
	public static void FinalAuditReportFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(9000);
		
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(4000);
        	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	  
		DepartmentHeadLocator.FinalAudit().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);

		 DepartmentHeadLocator.Company().click();
		 Thread.sleep(3000);
	     String UnitText =DepartmentHeadLocator.CompanyDD().getText();
	     Thread.sleep(2000);
	     DepartmentHeadLocator.CompanyDD().click();
		 Thread.sleep(20000);
		 
		 DepartmentHeadLocator.FinancialYear().click();
		 Thread.sleep(3000);
//		 String FinancialYearText =DepartmentHeadLocator.FinancialYearDD().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.FinancialYearDD().click();
		 Thread.sleep(4000);
		
		 DepartmentHeadLocator.SchedulingType().click();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.SchedulingTypeDD().click();
		 Thread.sleep(3000);

		 DepartmentHeadLocator.Period().click();
		 Thread.sleep(3000);
//		 String PeriodText =DepartmentHeadLocator.PeriodDD1().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.PeriodDD1().click();
		 Thread.sleep(22000);


	     
	      List<String> li=new ArrayList<String>();
	      
	      li.add(UnitText);
	//      li.add(FinancialYearText);
	 //     li.add(PeriodText);

	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Unit");
		//	filter.add("Financial Year");
		//	filter.add("Period");
			
			/*
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);
	*/
			DepartmentHeadLocator.Grid().click();					//Clicking on Text of total items just to scroll down.
			String s = DepartmentHeadLocator.Grid().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[1]"));
		//	List<WebElement> financialYearcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits']/tbody/tr[2]/td[5]"));
		//	List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits']/tbody/tr[2]/td[6]"));

			
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
			
			Thread.sleep(4000);	
		

	}
	

	
	
	public static void OpenObservationFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		Thread.sleep(4000);
		
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
       	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	  
		DepartmentHeadLocator.OpenObservation().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);

		 DepartmentHeadLocator.Company().click();
		 Thread.sleep(3000);
	     String UnitText =DepartmentHeadLocator.CompanyDD().getText();
	     Thread.sleep(2000);
	     DepartmentHeadLocator.CompanyDD().click();
		 Thread.sleep(20000);
		 
		 DepartmentHeadLocator.FinancialYear().click();
		 Thread.sleep(3000);
		 String FinancialYearText =DepartmentHeadLocator.FinancialYearDD().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.FinancialYearDD().click();
		 Thread.sleep(4000);
		
		 DepartmentHeadLocator.SchedulingType().click();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.SchedulingTypeDD().click();
		 Thread.sleep(3000);

		 DepartmentHeadLocator.Period().click();
		 Thread.sleep(3000);
		 String PeriodText =DepartmentHeadLocator.PeriodDD1().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.PeriodDD1().click();
		 Thread.sleep(22000);

		 DepartmentHeadLocator.Status().click();
		 Thread.sleep(3000);
		 String StatusText =DepartmentHeadLocator.StatusDD().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.StatusDD().click();
		 Thread.sleep(22000);

		 
	     
	      List<String> li=new ArrayList<String>();
	      
	      li.add(UnitText);
	      li.add(FinancialYearText);
	      li.add(PeriodText);
	      li.add(StatusText);

	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Unit");
			filter.add("Financial Year");
			filter.add("Period");
			filter.add("Status");
			
			/*
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);
	*/
			DepartmentHeadLocator.Grid().click();					//Clicking on Text of total items just to scroll down.
			String s = DepartmentHeadLocator.Grid().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[2]"));
			List<WebElement> financialYearcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[3]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[4]"));
			List<WebElement> statuscol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[9]"));

			
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
					
					if(i==1)
					{
						raw.addAll(financialYearcol);
					}

					if(i==2)
					{
						raw.addAll(periodcol);
					}

					if(i==3)
					{
						raw.addAll(statuscol);
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
			
			Thread.sleep(4000);	
		

	}

	
	
	
	public static void AuditStatusFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
//		Thread.sleep(9000);
//		DepartmentHeadLocator.ARS().click();
	//	Thread.sleep(3000);
	
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
       	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	  
		DepartmentHeadLocator.AuditStatus().click();					                //Clicking on Dashboard count
	    Thread.sleep(9000);
	
	
	}
	
	
	public static void AuditSchedulingFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		Thread.sleep(4000);
		
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
       	
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	  
		DepartmentHeadLocator.AuditScheduling().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);

		 DepartmentHeadLocator.Company().click();
		 Thread.sleep(3000);
	     String UnitText =DepartmentHeadLocator.CompanyDD().getText();
	     Thread.sleep(2000);
	     DepartmentHeadLocator.CompanyDD().click();
		 Thread.sleep(20000);
		 
		 DepartmentHeadLocator.FinancialYear().click();
		 Thread.sleep(3000);
		 String FinancialYearText =DepartmentHeadLocator.FinancialYearDD().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.FinancialYearDD().click();
		 Thread.sleep(7000);
		
		 DepartmentHeadLocator.SchedulingType().click();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.SchedulingTypeDD().click();
		 Thread.sleep(3000);

		 DepartmentHeadLocator.Period().click();
		 Thread.sleep(3000);
		 String PeriodText =DepartmentHeadLocator.PeriodDD1().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.PeriodDD1().click();
		 Thread.sleep(22000);

		 
	     
	      List<String> li=new ArrayList<String>();
	      
	      li.add(UnitText);
	      li.add(FinancialYearText);
	      li.add(PeriodText);
	     
	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Unit");
			filter.add("Financial Year");
			filter.add("Period");
			filter.add("Status");
			
			/*
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);
	*/
			DepartmentHeadLocator.Grid().click();					//Clicking on Text of total items just to scroll down.
			String s = DepartmentHeadLocator.Grid().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[2]"));
			List<WebElement> financialYearcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[4]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[5]"));

			
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
					
					if(i==1)
					{
						raw.addAll(financialYearcol);
					}

					if(i==2)
					{
						raw.addAll(periodcol);
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
			
			Thread.sleep(4000);	
		

	}
	
	
	public static void PastauditReportFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
        Thread.sleep(4000);        
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
		DepartmentHeadLocator.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
              
        DepartmentHeadLocator.PastAuditReport().click();					                //Clicking on Dashboard count
        Thread.sleep(6000);

		 DepartmentHeadLocator.Company().click();
		 Thread.sleep(3000);
	     String UnitText =DepartmentHeadLocator.Company1DD().getText();
	     Thread.sleep(2000);
	     DepartmentHeadLocator.Company1DD().click();
		 Thread.sleep(20000);
		 
		 DepartmentHeadLocator.FinancialYear3().click();
		 Thread.sleep(3000);
		 String FinancialYearText =DepartmentHeadLocator.FinancialYearDD().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.FinancialYearDD().click();
		 Thread.sleep(7000);
		
		 DepartmentHeadLocator.AuditBackground1().click();
		 Thread.sleep(3000);
		 String AuditBackgroundText =DepartmentHeadLocator.AuditBackground1DD().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.AuditBackground1DD().click();
		 Thread.sleep(22000);

		 
	     
	      List<String> li=new ArrayList<String>();
	      
	      li.add(UnitText);
	      li.add(FinancialYearText);
	      li.add(AuditBackgroundText);
	     
	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Unit");
			filter.add("Financial Year");
			filter.add("Audit Background");
		
			
			/*
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);
	*/
			DepartmentHeadLocator.Grid().click();					//Clicking on Text of total items just to scroll down.
			String s = DepartmentHeadLocator.Grid().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix']/tbody/tr[2]/td[2]"));
			List<WebElement> financialYearcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix']/tbody/tr[2]/td[3]"));
			List<WebElement> auditbackgroundcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix']/tbody/tr[2]/td[4]"));

			
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
					
					if(i==1)
					{
						raw.addAll(financialYearcol);
					}

					if(i==2)
					{
						raw.addAll(auditbackgroundcol);
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
			
			Thread.sleep(4000);	
		

	
	}
	
	
	public static void DashboardExportButton( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
       Thread.sleep(4000);    
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));

		DepartmentHeadLocator.buttonMinimize().click();
		Thread.sleep(3000);
		
		File dir2 = new File("C:\\Users\\shitalb\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		DepartmentHeadLocator.dashboardExport().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\shitalb\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
	  
        Thread.sleep(3000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  " Report Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL,  " Report Does Not Download Successfully");
		}

	   Thread.sleep(3000);
	   


	}
	
	
	
	public static void AuditTrackerPlannedFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		Thread.sleep(4000);
		DepartmentHeadLocator.ARS().click();
		Thread.sleep(5000);
				
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);

		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(6000);
		              
		DepartmentHeadLocator.PlannedCountAug23().click();	
		Thread.sleep(5000);
		
	    getDriver().switchTo().frame(DepartmentHeadLocator.Frame());
	    Thread.sleep(4000);

		 DepartmentHeadLocator.SelectUnit().click();
		 Thread.sleep(3000);
	     String UnitText =DepartmentHeadLocator.SelectUnitDD().getText();
	     Thread.sleep(2000);
	     DepartmentHeadLocator.SelectUnitDD().click();
		 Thread.sleep(2000);
	     DepartmentHeadLocator.OK().click();
		 Thread.sleep(9000); 
		 
		 DepartmentHeadLocator.FinancialYeartracker().click();
		 Thread.sleep(3000);
		 String FinancialYearText =DepartmentHeadLocator.FinancialYeartrackerDD().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.FinancialYeartrackerDD().click();
		 Thread.sleep(2000);
	     DepartmentHeadLocator.OK1().click();
		 Thread.sleep(9000);

		
		 DepartmentHeadLocator.SchedulingTypetracker().click();
		 Thread.sleep(3000);
//		 String SchedulingTypeText =DepartmentHeadLocator.SchedulingTypetrackerDD().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.SchedulingTypetrackerDD().click();
		 Thread.sleep(2000);
	     DepartmentHeadLocator.OK2().click();
		 Thread.sleep(9000);


		 DepartmentHeadLocator.PeriodTracker().click();
		 Thread.sleep(3000);
		 String periodText =DepartmentHeadLocator.periodDD().getText();
		 Thread.sleep(2000);
		 DepartmentHeadLocator.periodDD().click();
		 Thread.sleep(2000);
	     DepartmentHeadLocator.OK3().click();
		 Thread.sleep(9000);

		 DepartmentHeadLocator.ApplyFilter().click();
		 Thread.sleep(20000);

		
	     
	      List<String> li=new ArrayList<String>();
	      
	      li.add(UnitText);
	      li.add(FinancialYearText);
	      li.add(periodText);
	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Unit");
			filter.add("Financial Year");
			filter.add("Period");
		
			
			/*
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);
	*/
			DepartmentHeadLocator.Grid1().click();					//Clicking on Text of total items just to scroll down.
			String s = DepartmentHeadLocator.Grid1().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[2]"));
			List<WebElement> financialYearcol=getDriver().findElements(By.xpath("//*[@id='grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[4]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[5]"));

			
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
					
					if(i==1)
					{
						raw.addAll(financialYearcol);
					}

					if(i==2)
					{
						raw.addAll(periodcol);
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
			
			Thread.sleep(4000);	
		

	
	}
	
	
	


	
}
