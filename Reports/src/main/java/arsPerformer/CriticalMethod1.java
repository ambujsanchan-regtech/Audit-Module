package arsPerformer;

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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import aRSAuditee.Locator;
import login.BasePage;

public class CriticalMethod1 extends BasePage{
	
	
	
	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	
	
	
	
	
	public static void OpenAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator1.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator1.OAudit().getText());	//Reading Dashboard count.
        Locator1.OAudit().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        /*String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       		*/	
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        /*WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdRiskActivityMatrix']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-2;
	    
	    System.out.println(length_Row + "  " + open );
	    
	   
       
*/
		String item = Locator1.GridCount().getText();
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

    	 
 		Thread.sleep(4000);
    	 
	//	Method1.OpenAuditFilter(test,workbook);
	//	Thread.sleep(5000);
	    
	}
	

	
	
	public static void OpenImplementation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator1.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator1.OImplementation().getText());	//Reading Dashboard count.
        Locator1.OImplementation().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
       /* String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       		*/	
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        /*WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdRiskActivityMatrix']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-2;
	    
	    System.out.println(length_Row + "  " + open );     
*/
		String item = Locator1.GridCount().getText();
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
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(5000);

	//	Method1.ImplementationAuditFilter(test,workbook);
	//	Thread.sleep(7000);
		
		//Method1.OpenImplementationForceMailAdd(test,workbook);
		//Thread.sleep(5000);
	    
	}
	
	

	public static void ClosedAudit( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator1.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator1.CAudit().getText());	//Reading Dashboard count.
        Locator1.CAudit().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        /*String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 
        
		Thread.sleep(4000);
       	*/		
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        /*WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdRiskActivityMatrix']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-2;
	    
	    System.out.println(length_Row + "  " + open );
	    
	   
       
*/
		String item = Locator1.GridCount().getText();
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
 		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);

	//	Method1.ClosedAuditFilter(test,workbook);
	//	 Thread.sleep(4000);
	    
	}
	
	
	
	public static void ClosedImplementation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator1.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		int open = Integer.parseInt(Locator1.CImplementation().getText());	//Reading Dashboard count.
        Locator1.CImplementation().click();					                //Clicking on Dashboard count

        Thread.sleep(2000);
       
        //    wait.until(ExpectedConditions.visibilityOf(Locator1.Edit()));
		//    wait.until(ExpectedConditions.visibilityOf(Locator1.GridLoad()));
        
        /*String OptionText1 = "Option 4";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		 Thread.sleep(16000);
		 */
        
		Thread.sleep(4000);
       			
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
       /* WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdRiskActivityMatrix']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    int Row_Count = rows.size();
	    		
	    int length_Row = Row_Count-2;
	    
	    System.out.println(length_Row + "  " + open );
	    
	   
       
*/
		String item = Locator1.GridCount().getText();
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
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);

 	//	Thread.sleep(4000);
	//	Method1.ClosedAImplementationFilter(test,workbook);
	//	Thread.sleep(5000);
		
		//Method1.ClosedImplementationForceMailAdd(test,workbook);
		//Thread.sleep(5000);
		
	    
	}
	

	
	public static void AddStartDateEndDate( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator1.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator1.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.SaveAuditDateDetail().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        String t = Locator1.Successfully().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS,  t);
 		Thread.sleep(2000);
       
        Locator1.StartDate().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.StartDateDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.EndDate().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.EndDateDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
      //  Locator1.SaveAuditDateDetail().click();					                //Clicking on Dashboard count
      //  Thread.sleep(2000);
        
        if(Locator1.SaveAuditDateDetail().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator1.SaveAuditDateDetail().click();
 			test.log(LogStatus.PASS, "Save Successfully " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, "Save Successfully"  );
 			
 		}
    	 
    	 
		
	    
	}
	
	
	
	
	public static void AddCheckBoxAndSendMail( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
		Thread.sleep(1000);
		Locator1.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator1.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ViewDataRequestDetails().click();					                //Clicking on Dashboard count
        Thread.sleep(6000);
        
        getDriver().switchTo().frame(Locator1.Frame1());
		Thread.sleep(7000);
		
		Locator1.ActDetail().click();
		Thread.sleep(6000);
	
		Locator1.SelectProcess2().click();
		Thread.sleep(2000);
	//    String ProcessText =Locator1.SelectProcess2DD().getText();
	//    Thread.sleep(2000);
		Locator1.SelectProcess2DD().click();
		Thread.sleep(20000);

		Locator1.SelectSubProcess2().click();
		Thread.sleep(2000);
	//    String SubProcessText =Locator1.SelectSubProcess2DD().getText();
	//    Thread.sleep(2000);
		Locator1.SelectSubProcess2DD().click();
		Thread.sleep(20000);
		
		
		 /*
		 Locator1.PeriodW().click();
		 Thread.sleep(3000);
		 String PeriodText =Locator1.PeriodWDD().getText();
		 Thread.sleep(2000);
		 Locator1.PeriodWDD().click();
		 Thread.sleep(20000);
			*/
			/*
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
			Locator1.Grid2().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator1.Grid2().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		*/
		/*
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
			*/
			Thread.sleep(17000);
			
			Locator1.ReminderCheckBox().click();
			Thread.sleep(2000);

			Locator1.EscalationCheckBox().click();
			Thread.sleep(2000);

		       if(Locator1.SendMailA().isEnabled())
		 		{
		 			
		 			Thread.sleep(2000);
		 			Locator1.SendMailA().click();
		 			test.log(LogStatus.PASS, "Email sent Successfully " );
		 			
		 		}
		 		
		 		else
		 		{
		 			test.log(LogStatus.FAIL, "Email Does Not sent Successfully"  );
		 			
		 		}
		        Thread.sleep(9000);
		     
	}

	
	
	
	
	public static void AddPrerequisiteFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
       Thread.sleep(1000);	
		Locator1.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        Locator1.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        Locator1.ViewDataRequestDetails().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        getDriver().switchTo().frame(Locator1.Frame1());
		Thread.sleep(7000);
		
		Locator1.AddRequestData().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	     
	    getDriver().switchTo().frame(Locator1.Frame());
		Thread.sleep(7000);
        
		/*
		 Locator1.SelectProcess().click();
		 Thread.sleep(3000);
		 Locator1.CheckBox().click();
		 Thread.sleep(3000);
	     String ProcessText =Locator1.SelectProcessDD().getText();
	     Thread.sleep(2000);
	     Locator1.OKP().click();
		 Thread.sleep(9000);
		 
		 
		 Locator1.SelectSubProcess().click();
		 Thread.sleep(3000);
		 String SubprocessText =Locator1.SelectSubProcessDD().getText();
		 Thread.sleep(2000);
		 Locator1.SelectSubProcessDD().click();
		 Thread.sleep(9000);
		 Locator1.OKSP().click();
		 Thread.sleep(20000);
		 
		 Locator1.SelectDocumentRequired().click();
	     Thread.sleep(2000);
	     Locator1.SelectDocumentRequiredDD().click();
		 Thread.sleep(9000);
	     Locator1.OK3().click();
		 Thread.sleep(20000);

		
		 /*
		 Locator1.PeriodW().click();
		 Thread.sleep(3000);
		 String PeriodText =Locator1.PeriodWDD().getText();
		 Thread.sleep(2000);
		 Locator1.PeriodWDD().click();
		 Thread.sleep(20000);
			*/
			/*
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
			Locator1.Grid2().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator1.Grid2().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		*/
		/*
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
			Thread.sleep(10000);
	*/
			
			//Method1.AddDocumentDetails(test,workbook);
			//Thread.sleep(9000);

			//Method1.ViewAuditDetailsAddUser(test,workbook);
			//Thread.sleep(9000);
				
		
	}
	
	
	
	
	
	public static void ForceMail( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(9000);
		
		
		Locator1.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator1.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ViewDataRequestDetails().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        getDriver().switchTo().frame(Locator1.Frame1());
		Thread.sleep(7000);

	    Locator1.ForceMail().click();					                //Clicking on Dashboard count
	    Thread.sleep(20000);
	    
	    Locator1.ForceMail1().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);

        Locator1.TO().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.TODD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
    	sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
 		int row = 0;
 		Thread.sleep(500);
 		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
 		Cell c1 = null;
 		   
 		row0 = sheet.getRow(29);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.Subject().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(30);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.FileUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(7000);
           
		Locator1.UploadButton1().click();					                //Clicking on Dashboard count
        Thread.sleep(9000);
        
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t1 );
		
		Thread.sleep(4000);
		ac.accept();
		
		Thread.sleep(2000);
		
		Locator1.SendMail().click();					                //Clicking on Dashboard count
        Thread.sleep(9000);
        
        Alert ac1=getDriver().switchTo().alert();
		
		String t2=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t2 );
		
		Thread.sleep(4000);
		ac1.accept();
		
		Thread.sleep(2000);
		
		Locator1.Summery().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);
        
        row0 = sheet.getRow(30);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.FileUpload1().sendKeys(c1.getStringCellValue()); // Writing Task title
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
		Locator1.Download().click();
		
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
	   
        
        if(Locator1.View().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator1.View().click();
 			test.log(LogStatus.PASS, "View Button Is Clickable " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, "View Button Is Clickable"  );
 			
 		}
        Thread.sleep(2000);
        
	}
	

	
	
	public static void ViewDataRequestFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
		Thread.sleep(1000);
		Locator1.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator1.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ViewDataRequestDetails().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        getDriver().switchTo().frame(Locator1.Frame1());
		Thread.sleep(7000);
		
//		Method1.AddDocumentDetails(test,workbook);
//		Thread.sleep(17000);

		Locator1.SelectProcess1().click();
		Thread.sleep(2000);
		Locator1.SelectProcess1DD().click();
		Thread.sleep(20000);

		Locator1.SelectSubProcess1().click();
		Thread.sleep(2000);
		Locator1.SelectSubProcess1DD().click();
		Thread.sleep(20000);

		Locator1.Audtee().click();
		Thread.sleep(2000);
		Locator1.AudteeDD().click();
		Thread.sleep(25000);

		Locator1.ReportingManager1().click();
		Thread.sleep(2000);
		Locator1.ReportingManager1DD().click();
		Thread.sleep(20000);
			
        Locator1.Timeline().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);

        Locator1.TimelineDD().click();					                //Clicking on Dashboard count
        Thread.sleep(20000);
        
		 JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	        
	     js1.executeScript("window.scrollBy(0,2000)");
	     Thread.sleep(20000);

        
        Locator1.Save7().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
		 JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
	        
	     js2.executeScript("window.scrollBy(0,-2000)");
	     Thread.sleep(20000);
    
        String t0 = Locator1.Successfully7().getText();					                //Clicking on Dashboard count
        Thread.sleep(9000);
        		
 		Thread.sleep(2000);
 		test.log(LogStatus.PASS, " Message Displyed - " + t0 ); 			
        Thread.sleep(14000);
        
		 JavascriptExecutor js = (JavascriptExecutor) getDriver();
	        
	     js.executeScript("window.scrollBy(0,200)");
	     Thread.sleep(20000);



	}
	
	
	
	
	public static void AddDocument( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
	
		Thread.sleep(1000);
		Locator1.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator1.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ViewDataRequestDetails().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        getDriver().switchTo().frame(Locator1.Frame1());
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
			
        Locator1.Timeline().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);

        Locator1.TimelineDD().click();					                //Clicking on Dashboard count
        Thread.sleep(15000);
      
        Locator1.AddDocumentAndRemark().click();					                //Clicking on Dashboard count
        Thread.sleep(20000);

    	sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
 		int row = 0;
 		Thread.sleep(500);
 		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
 		Cell c1 = null;
        
 		row0 = sheet.getRow(37);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.ChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(7000);

        Locator1.Save5().click();					                //Clicking on Dashboard count
        Thread.sleep(7000);

        String t5 = Locator1.Successfully5().getText();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        		
 		Thread.sleep(2000);
 		test.log(LogStatus.PASS, " Upload Document  - " + t5 ); 			
        Thread.sleep(7000);
              
		Locator1.CloseButton5().click();
		Thread.sleep(20000);
       
	//	getDriver().switchTo().frame(Locator1.Frame1());
	//	Thread.sleep(7000);

		Locator1.AddDocumentAndRemark().click();					                //Clicking on Dashboard count
        Thread.sleep(9000);

        Locator1.Deletefile().click();					                //Clicking on Dashboard count
        Thread.sleep(7000);

        Alert ac3=getDriver().switchTo().alert();
		
		String t3=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t3 );
		
		Thread.sleep(4000);
		ac3.accept();
	
        String t6 = Locator1.Successfully4().getText();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        		
 		Thread.sleep(2000);
 		test.log(LogStatus.PASS, " Message Displyed - " + t6 ); 			
        Thread.sleep(2000);
  
      
        if(Locator1.CloseButton5().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator1.CloseButton5().click();
 			test.log(LogStatus.PASS, "Close Button Working Properly " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, "Close Button Does Not Working Properly"  );
 			
 		}
        Thread.sleep(20000);
        
		Method1.ViewDocument(test,workbook);
		Thread.sleep(30000);
        
	    Locator1.Plus().click();
	    Thread.sleep(9000);
	   
 		row0 = sheet.getRow(3);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.DocumentName1().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);

	    Locator1.Save3().click();
	    Thread.sleep(17000);
        
        String t = Locator1.Successfull().getText();					                //Clicking on Dashboard count
        Thread.sleep(17000);
        		
 		test.log(LogStatus.PASS, " Add Document - " + t ); 			
        Thread.sleep(9000);
  
	    
        
}
	
	
	
	
	public static void AddObservation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator1.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator1.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ViewAuditDetails().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);
       
		Locator1.NotDone().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	    
		Locator1.CheckBox1().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
 
	    sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
 		int row = 0;
 		Thread.sleep(500);
 		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
 		Cell c1 = null;
 		
		row0 = sheet.getRow(27);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.Remark().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator1.Savebutton().click();					                //Clicking on Dashboard count
	    Thread.sleep(17000);
	    	    
	    String t9 = Locator1.Successfullmessage().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS, " By Selecting Check Box Audit Submitted - " + t9);
 		Thread.sleep(6000);
    	    
	    Locator1.AddNew().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	     
	    getDriver().switchTo().frame(Locator1.Frame3());
		Thread.sleep(7000);
		
		Locator1.SaveAudit().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	    
	    String t7 = Locator1.SuccessfullyAuditStep().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS, "Without Enter Data - " +  t7);
 		Thread.sleep(2000);
 		
 		
         
 		row0 = sheet.getRow(25);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.AuditStep().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
         
		row0 = sheet.getRow(26);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.AuditMethodology().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
         
		Locator1.SaveAudit().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	    
	    String t17 = Locator1.SuccessfullyAuditStep().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS,  t17);
 		Thread.sleep(2000);
 		
 		Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.Closepage1().click();
		
		Thread.sleep(3000);
		
		Locator1.ChangeStatus().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        getDriver().switchTo().frame(Locator1.Frame2());
		Thread.sleep(7000);
		
		
		 if(Locator1.NextButton1().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			Locator1.NextButton1().click();
	 			test.log(LogStatus.PASS, "Next Button Is Clickable " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "Next Button Is Clickable"  );
	 			
	 		}
	        Thread.sleep(2000);
			
		
	//	Locator1.NextButton1().click();					                //Clicking on Dashboard count
     //   Thread.sleep(2000);
            
       	
        
        row0 = sheet.getRow(4);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.ProcessWalkthrogh().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		 
        row0 = sheet.getRow(5);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.ActualWorkdone().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(6);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.Population().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(7);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.Sample().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(8);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.Remarks().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(9);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.WorkingFileUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator1.WorkingFileUploadButton().click();					                //Clicking on Dashboard count
        Thread.sleep(6000);
        
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, " Working File Upload - "+ t1 );
		
		Thread.sleep(5000);
		ac.accept();
		Thread.sleep(6000);
		 
        File dir2 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(7000);
		Locator1.WorkingFileDownload().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
	  
        Thread.sleep(3000);
	   if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "Working File Download Successfully");
		}
	   else
	   {
			test.log(LogStatus.FAIL, "Working File does not Download Successfully");
		}

	   Thread.sleep(3000);
	   
		Locator1.DeleteWorkingFile().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
 
        Alert ac1=getDriver().switchTo().alert();
		
 //		String t1=getDriver().switchTo().alert().getText();
 		
 //		test.log(LogStatus.PASS,  t1 );
 		
 		Thread.sleep(5000);
 		ac1.accept();
 		Thread.sleep(3000);
 	
        Alert ac2=getDriver().switchTo().alert();
		
 		String t2=getDriver().switchTo().alert().getText();
 		
 		test.log(LogStatus.PASS, " Working File - "+ t2 );
 		
 		Thread.sleep(5000);
 		ac2.accept();
 		Thread.sleep(3000);
 	
 		/*
		row0 = sheet.getRow(39);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.WorkingFileUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator1.WorkingFileUploadButton().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Alert ac3=getDriver().switchTo().alert();
		
//		String t1=getDriver().switchTo().alert().getText();
		
//		test.log(LogStatus.PASS, " Working File Upload - "+ t1 );
		
		Thread.sleep(5000);
		ac3.accept();
		Thread.sleep(3000);
		*/
 		
		row0 = sheet.getRow(10);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.AnnexureFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(9000);
		
		Locator1.AnnexureFileUploadButton().click();					                //Clicking on Dashboard count
        Thread.sleep(10000);
        
        Alert ac4=getDriver().switchTo().alert();
		
		String t4=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS," Annexure Files - " + t4 );
		
		Thread.sleep(5000);
		ac4.accept();
		Thread.sleep(3000);

	       File dir4 = new File("C:\\Users\\ambujs\\Downloads");
			File[] dirContents4 = dir4.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(6000);
			Locator1.AnnexureFileDownload().click();
			
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
		   
			Locator1.DeleteWorkingFile().click();					                //Clicking on Dashboard count
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
	 		/*
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.AnnexureFile().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Locator1.AnnexureFileUploadButton().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	        
	        Alert ac9=getDriver().switchTo().alert();
			
	//		String t4=getDriver().switchTo().alert().getText();
			
	//		test.log(LogStatus.PASS," Annexure Files - " + t4 );
			
			Thread.sleep(5000);
			ac4.accept();
			Thread.sleep(3000);
			*/
    //    Locator1.NextButton2().click();					                //Clicking on Dashboard count
    //    Thread.sleep(2000);
        
        if(Locator1.NextButton2().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator1.NextButton2().click();
 			test.log(LogStatus.PASS, "Next Button Is Clickable " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, "Next Button Is Clickable"  );
 			
 		}
        Thread.sleep(2000);
        
        row0 = sheet.getRow(11);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.ObservationTitle().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(12);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.Observation().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(13);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.briefObservation().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(14);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.ObservationBackground().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(15);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.WorkingFile1().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator1.WorkingFile1Uploadbutton().click();					                //Clicking on Dashboard count
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
			Locator1.ObservationWorkingFileDownload().click();
			
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
		   
			Locator1.ObservationWorkingFileDelete().click();					                //Clicking on Dashboard count
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
		Locator1.AnnexureTitle().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator1.Table().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
		
        Locator1.TableWizard().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
		
        Locator1.OKTable().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
		
		row0 = sheet.getRow(17);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.ImageUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		Locator1.ImageUploadButton().click();					                //Clicking on Dashboard count
        Thread.sleep(17000);
        
        Alert acb=getDriver().switchTo().alert();
		
		String tb=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, tb );
		
		Thread.sleep(5000);
		acb.accept();
		Thread.sleep(5000);
		
		
		  if(Locator1.ViewImage().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			Locator1.ViewImage().click();
	 			test.log(LogStatus.PASS, "View Button Working Properly " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "View Button Does Not Working Properly"  );
	 			
	 		}
	        Thread.sleep(9000);

	        Thread.sleep(2000);
 			Locator1.CloseImagePopUp().click();
 			Thread.sleep(9000);
 			
 			Locator1.DeleteImage().click();
 			Thread.sleep(9000);
 				        
 	        Alert acg=getDriver().switchTo().alert();
 			
 			String tg=getDriver().switchTo().alert().getText();
 			
 			test.log(LogStatus.PASS, tg );
 			
 			Thread.sleep(5000);
 			acg.accept();
 			Thread.sleep(5000);

	        Alert ach=getDriver().switchTo().alert();
 			
 			String th=getDriver().switchTo().alert().getText();
 			
 			test.log(LogStatus.PASS, th );
 			
 			Thread.sleep(5000);
 			ach.accept();
 			Thread.sleep(5000);
 			/*
 			row0 = sheet.getRow(17);
 			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 			Locator1.ImageUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
 			Thread.sleep(4000);
 			
 			Locator1.ImageUploadButton().click();					                //Clicking on Dashboard count
 	        Thread.sleep(17000);
 	        
 	        Alert aci=getDriver().switchTo().alert();
 			
 	//		String tb=getDriver().switchTo().alert().getText();
 			
 	//		test.log(LogStatus.PASS, tb );
 			
 			Thread.sleep(5000);
 			aci.accept();
 			Thread.sleep(5000);
*/
        
		row0 = sheet.getRow(18);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.AudioVideoLink().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
        Locator1.AuditComitee().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.AuditComiteeDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        row0 = sheet.getRow(19);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.BusinessRisk().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(20);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.RootCause().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.FinancialImpact().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
        Locator1.RiskRating().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.RiskRatingDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        	
        Locator1.ObservationCatogary().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ObservationCatogaryDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ObservationSubCatogary().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ObservationSubCatogaryDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ReccomendationType().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ReccomendationTypeDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        row0 = sheet.getRow(22);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.Reccomendation().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
        
        Locator1.ResponceDueDate().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ResponceDueDateDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        row0 = sheet.getRow(23);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.ManagementResponce().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
           
        Locator1.TimelineCalender().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        	
        Locator1.TimelineCalenderDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.PersonResponsible().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.PersonResponsibleDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.OwnerName().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.OwnerNameDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.SaveReccomendation().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        String t = Locator1.Successfullyreccomendation().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS,  t);
 		Thread.sleep(2000);
         
        Locator1.OK1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.SaveObservation().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
              
        String t5 = Locator1.SuccessfullyObservation().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS,  t5);
 		Thread.sleep(2000);
         
        Locator1.OK2().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ShowReviewHistoryLogLink().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        row0 = sheet.getRow(27);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.ReviewRemark().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(28);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.File().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
			
		Locator1.UploadButton().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        
        
        Locator1.SubmitButton().click();					                //Clicking on Dashboard count
        Thread.sleep(7000);
        
        String t0 = Locator1.Successfully3().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS,  t0);
 		Thread.sleep(4000);
          
 //       Locator1.OK().click();					                //Clicking on Dashboard count            
  //      Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(3000);
        
		  if(Locator1.BackButton().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			Locator1.BackButton().click();
	 			test.log(LogStatus.PASS, "Back Button Working Properly " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "Back Button Does Not Working Properly"  );
	 			
	 		}
	        Thread.sleep(4000);
	        
	        
    
	    
	}
	
	
	public static void DraftObservationListing( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator1.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator1.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ViewAuditDetails().click();					                //Clicking on Dashboard count
        Thread.sleep(6000);
        
        
        File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator1.ExportToExcel().click();
		
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
       
		Locator1.DraftObservationListing().click();					                //Clicking on Dashboard count
	    Thread.sleep(7000);
	    
        Locator1.CheckBox2().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);

        Locator1.Save4().click();					                //Clicking on Dashboard count
        Thread.sleep(7000);

        String t = Locator1.SuccessfullyObservation1().getText();				                //Clicking on Dashboard count
        Thread.sleep(7000);
        
		test.log(LogStatus.PASS,  " By Selecting Check Box Update Observation - " + t);
		Thread.sleep(2000);
        
	    
	    File dir2 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator1.Export().click();
		
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
	    
	    Locator1.EyeIcon().click();					                //Clicking on Dashboard count
	    Thread.sleep(2000);
	    
 		sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
 		int row = 0;
 		Thread.sleep(500);
 		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
 		Cell c1 = null;
 		
        getDriver().switchTo().frame(Locator1.Frame2());
		Thread.sleep(7000);
		
		 if(Locator1.NextButton1().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			Locator1.NextButton1().click();
	 			test.log(LogStatus.PASS, "Audit Coverage Tab - Next Button Is Clickable " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "Audit Coverage Tab - Next Button Is Clickable"  );
	 			
	 		}
	        Thread.sleep(7000);
			
		
	//	Locator1.NextButton1().click();					                //Clicking on Dashboard count
     //   Thread.sleep(2000);
            
	    Locator1.ProcessWalkthrogh().clear();
	    Thread.sleep(2000);
        
        row0 = sheet.getRow(4);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.ProcessWalkthrogh().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
	    Locator1.ActualWorkdone().clear();
	    Thread.sleep(2000);
 
        row0 = sheet.getRow(5);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.ActualWorkdone().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
	    Locator1.Population().clear();
	    Thread.sleep(2000);
 
		
		row0 = sheet.getRow(6);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.Population().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
	    Locator1.Sample().clear();
	    Thread.sleep(2000);
 
		
		row0 = sheet.getRow(7);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.Sample().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
	    Locator1.Remarks().clear();
	    Thread.sleep(2000);
 
		
		row0 = sheet.getRow(8);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.Remarks().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		/*
        File dir4 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents4 = dir4.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator1.WorkingDocument1().click();
		
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
		Locator1.WorkingFileUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator1.WorkingFileUploadButton().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t1 );
		
		Thread.sleep(5000);
		ac.accept();
		Thread.sleep(3000);
	    	
		
		row0 = sheet.getRow(10);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.AnnexureFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator1.AnnexureFileUploadButton().click();					                //Clicking on Dashboard count
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
		Locator1.AnnexureDocument1().click();
		
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
	       
	
	    	
    //    Locator1.NextButton2().click();					                //Clicking on Dashboard count
    //    Thread.sleep(2000);
        
        if(Locator1.NextButton2().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator1.NextButton2().click();
 			test.log(LogStatus.PASS, " Actual Testing/ Work Done - Next Button Is Clickable " );
 			
 		}
 		
 		else
 		{
 			test.log(LogStatus.FAIL, " Actual Testing/ Work Done - Next Button Is Clickable"  );
 			
 		}
        Thread.sleep(2000);
        
        Locator1.ObservationTitle().clear();
        Thread.sleep(2000);
        
        row0 = sheet.getRow(11);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.ObservationTitle().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
	    Locator1.Observation().clear();
	    Thread.sleep(2000);
	 
		
		row0 = sheet.getRow(12);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.Observation().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
	    Locator1.briefObservation().clear();
	    Thread.sleep(2000);

		
		row0 = sheet.getRow(13);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.briefObservation().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		
	    Locator1.ObservationBackground().clear();
	    Thread.sleep(2000);

		
		row0 = sheet.getRow(14);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.ObservationBackground().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		/*
		row0 = sheet.getRow(15);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.WorkingFile1().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator1.WorkingFile1Uploadbutton().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Alert ac2=getDriver().switchTo().alert();
		
		String t3=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t3 );
		
		Thread.sleep(5000);
		ac2.accept();
		Thread.sleep(3000);
        */
		
	    Locator1.AnnexureTitle().clear();
	    Thread.sleep(2000);

		
		row0 = sheet.getRow(16);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.AnnexureTitle().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator1.Table1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
		
        Locator1.TableWizard().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
		
        Locator1.OKTable().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
		
		/*row0 = sheet.getRow(17);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		//Locator1.ImageUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);
		
		Locator1.ImageUploadButton().click();					                //Clicking on Dashboard count
        Thread.sleep(17000);
        */
        /*
        Alert ac9=getDriver().switchTo().alert();
		
		String t10=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t10 );
		
		Thread.sleep(5000);
		ac9.accept();
		Thread.sleep(3000);
        */
        
		Locator1.AudioVideoLink().clear();
		Thread.sleep(3000);
        
		row0 = sheet.getRow(18);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.AudioVideoLink().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		 JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
	        
	        js1.executeScript("window.scrollBy(0,200)");
	        Thread.sleep(9000);
	  
		
        Locator1.AuditComitee1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.AuditComiteeDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        row0 = sheet.getRow(19);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.BusinessRisk().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(20);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.RootCause().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(3000);
		
		/*row0 = sheet.getRow(24);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.FinancialImpact().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		*/
        Locator1.ObservationRating().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.RiskRatingDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        	
        Locator1.ObservationCatogary1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ObservationCatogaryDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ObservationSubCatogary1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ObservationSubCatogaryDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ReccomendationType1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ReccomendationTypeDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        row0 = sheet.getRow(22);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.Reccomendation().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
        
        Locator1.ResponceDueDate1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.ResponceDueDateDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        row0 = sheet.getRow(23);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.ManagementResponce().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
           
        Locator1.TimelineCalender1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        	
        Locator1.TimelineCalenderDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.PersonResponsible1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.PersonResponsibleDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.OwnerName1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.OwnerNameDD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.SaveReccomendation().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        String t6 = Locator1.Successfullyreccomendation().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS,  t6);
 		Thread.sleep(2000);
         
        Locator1.OK1().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.SaveObservation().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
              
        String t5 = Locator1.SuccessfullyObservation().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS,  t5);
 		Thread.sleep(2000);
         
        Locator1.OK2().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
    //    Locator1.ShowReviewHistoryLogLink().click();					                //Clicking on Dashboard count
     //   Thread.sleep(2000);
        
        row0 = sheet.getRow(27);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.ReviewRemark().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(28);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.File().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
			
		Locator1.UploadButton().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.SubmitButton().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        String t0 = Locator1.Successfully3().getText();				                //Clicking on Dashboard count
        Thread.sleep(2000);
		test.log(LogStatus.PASS,  t0);
 		Thread.sleep(4000);
          
       Locator1.OK().click();					                //Clicking on Dashboard count            
       Thread.sleep(4000);

		getDriver().switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		Locator1.ClosePage().click();
		
		Thread.sleep(3000);
         
	        Locator1.DeleteDraft().click();					                //Clicking on Dashboard count
	        Thread.sleep(2000);
	       
	        Alert ac0=getDriver().switchTo().alert();
			
			String t40=getDriver().switchTo().alert().getText();
			
			test.log(LogStatus.PASS, t40 );
			
			Thread.sleep(5000);
			ac0.accept();
			Thread.sleep(3000);
			
			if(Locator1.Back().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			Locator1.Back().click();
	 			test.log(LogStatus.PASS, "Back Button Working Properly " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "Back Button Does Not Working Properly"  );
	 			
	 		}
			
	        Thread.sleep(7000);
	        	        
			Method1.AddMail(test,workbook);
			Thread.sleep(9000);
			
 			Locator1.Submitted().click();
 			Thread.sleep(7000);
			
	        if(Locator1.BackButtonS().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			Locator1.BackButtonS().click();
	 			test.log(LogStatus.PASS, "Submitted - Back Button Working Properly " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "Submitted - Back Button Does Not Working Properly"  );
	 			
	 		}
	        Thread.sleep(9000);

		  
	        if(Locator1.BackButton1().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			Locator1.BackButton1().click();
	 			test.log(LogStatus.PASS, "Back Button Working Properly " );
	 			
	 		}
	 		
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "Back Button Does Not Working Properly"  );
	 			
	 		}
	        Thread.sleep(9000);

    
		   
	}
	
	
	
	public static void InternalAuditMeeting( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(1000);
		Locator1.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator1.MyWorkspace().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.InternalAuditMeeting().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
       
        Locator1.NewMailButton().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
       
        Locator1.TO().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.TODD().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
    	sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
 		int row = 0;
 		Thread.sleep(500);
 		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
 		Cell c1 = null;
 		   
 		row0 = sheet.getRow(29);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.Subject().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		row0 = sheet.getRow(30);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.FileUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(7000);
           
		Locator1.UploadButton1().click();					                //Clicking on Dashboard count
        Thread.sleep(9000);
        
        Alert ac=getDriver().switchTo().alert();
		
		String t1=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t1 );
		
		Thread.sleep(4000);
		ac.accept();
		
		Thread.sleep(2000);
		
		Locator1.SendMail().click();					                //Clicking on Dashboard count
        Thread.sleep(9000);
        
        Alert ac1=getDriver().switchTo().alert();
		
		String t2=getDriver().switchTo().alert().getText();
		
		test.log(LogStatus.PASS, t2 );
		
		Thread.sleep(4000);
		ac1.accept();
		
		Thread.sleep(2000);
		
		Locator1.Summery().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);
        
        row0 = sheet.getRow(30);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.FileUpload1().sendKeys(c1.getStringCellValue()); // Writing Task title
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
		Locator1.Download().click();
		
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
	   
        
        if(Locator1.View().isEnabled())
 		{
 			
 			Thread.sleep(2000);
 			Locator1.View().click();
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
		
		Locator1.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator1.MyDocument().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        
        Locator1.OpenAuditFilter().click();					                //Clicking on Dashboard count
        Thread.sleep(2000);
        Locator1.OpenAuditFilterDD().click();					                //Clicking on Dashboard count
        Thread.sleep(7000);
     
        String OptionText1 = "Option 1";
		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[1]",OptionText1);
		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
		dropdownOption1.click();
		Thread.sleep(7000);

//	    Locator1.DownloadButton().click();					                //Clicking on Dashboard count
//	    Thread.sleep(5000);
		
        File dir2 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(8000);
		Locator1.DownloadButton().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\ambujs\\Downloads");
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
		
       File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator1.DownloadButton().click();
		
	 	Thread.sleep(9000);
		File dir4 = new File("C:\\Users\\ambujs\\Downloads");
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
			
	       File dir5 = new File("C:\\Users\\ambujs\\Downloads");
			File[] dirContents5 = dir5.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			Locator1.DownloadButton().click();
			
		 	Thread.sleep(9000);
			File dir6 = new File("C:\\Users\\ambujs\\Downloads");
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
				
		       File dir7 = new File("C:\\Users\\ambujs\\Downloads");
				File[] dirContents7 = dir7.listFiles();						//Counting number of files in directory before download
				
				Thread.sleep(3000);
				Locator1.DownloadButton().click();
				
			 	Thread.sleep(9000);
				File dir0 = new File("C:\\Users\\ambujs\\Downloads");
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
					
			       File dir8 = new File("C:\\Users\\ambujs\\Downloads");
					File[] dirContents8 = dir8.listFiles();						//Counting number of files in directory before download
					
					Thread.sleep(3000);
					Locator1.DownloadButton().click();
					
				 	Thread.sleep(9000);
					File dir9 = new File("C:\\Users\\ambujs\\Downloads");
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
						
				       File dir10 = new File("C:\\Users\\ambujs\\Downloads");
						File[] dirContents10 = dir10.listFiles();						//Counting number of files in directory before download
						
						Thread.sleep(3000);
						Locator1.DownloadButton().click();
						
					 	Thread.sleep(9000);
						File dir11 = new File("C:\\Users\\ambujs\\Downloads");
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
							
					       File dir12 = new File("C:\\Users\\ambujs\\Downloads");
							File[] dirContents12 = dir12.listFiles();						//Counting number of files in directory before download
							
							Thread.sleep(3000);
							Locator1.DownloadButton().click();
							
						 	Thread.sleep(9000);
							File dir13 = new File("C:\\Users\\ambujs\\Downloads");
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
						   Thread.sleep(9000);
	 
						//	Method1.MyDocumentFilter(test,workbook);
						//	Thread.sleep(5000);
			   
	   	
	}
	
	
	
	
	public static void MyReportObservationReportFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
       Thread.sleep(4000);
       
		Locator1.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        Locator1.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        CriticalMethod1.MyReport(test,workbook);
		Thread.sleep(4000);
        
        Locator1.MoreReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        Locator1.MoreReportOpenObservationReport().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);
        
        CriticalMethod1.ObservationReportExportAndGridCount(test,workbook);
		Thread.sleep(5000);
        /*
		 Locator1.MROpenObservationCompany().click();
		 Thread.sleep(3000);
	     String CompanyText =Locator1.MROpenObservationCompanyDD().getText();
	     Thread.sleep(2000);
	     Locator1.MROpenObservationCompanyDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.FinancialYearMReport().click();
		 Thread.sleep(3000);
		 String FinancialyearText =Locator1.FinancialYearMReportDD().getText();
		 Thread.sleep(2000);
		 Locator1.FinancialYearMReportDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.SelectSchedulingType().click();
	     Thread.sleep(2000);
	     Locator1.SelectSchedulingTypeDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.Period().click();
		 Thread.sleep(3000);
		 String PeriodText =Locator1.PeriodDD().getText();
		 Thread.sleep(2000);
		 Locator1.PeriodDD().click();
		 Thread.sleep(20000);
		
		 Locator1.Status().click();
		 Thread.sleep(3000);
		 String StatusText =Locator1.StatusDD().getText();
		 Thread.sleep(2000);
		 Locator1.StatusDD().click();
		 Thread.sleep(20000);
		
			
	      List<String> li=new ArrayList<String>();
	      
	      li.add(CompanyText);
	      li.add(FinancialyearText);
	      li.add(PeriodText);
	      li.add(StatusText);
	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Company");
			filter.add("Financial Year");
			filter.add("Period");
			filter.add("Status");
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,2000)");	
			Thread.sleep(3000);
	
			Locator.Grid2().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator.Grid2().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[2]"));
			List<WebElement> financialyearcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']/tbody/tr[2]/td[3]"));
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
						raw.addAll(financialyearcol);
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
*/
		
			Thread.sleep(5000);

			CriticalMethod1.MyReportAuditSceduling(test,workbook);
			Thread.sleep(5000);
			
			CriticalMethod1.MyReportAuditStatus(test,workbook);
			Thread.sleep(5000);
		
			CriticalMethod1.PrerequisitLogReportFilteer(test,workbook);
			Thread.sleep(5000);
			
			CriticalMethod1.ManagementResponceLogReportFilteer(test,workbook);
			Thread.sleep(5000);
			
			CriticalMethod1.DaftObservationFilter(test,workbook);
		    Thread.sleep(5000);
		
		  //  CriticalMethod1.ObservationWordFilter(test,workbook);
		    Thread.sleep(5000);

		   // CriticalMethod1.MyReportPastauditReportFilter(test,workbook);
			Thread.sleep(5000);
			
	
	}


	
	public static void MyReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(9000);
		/*
		Locator1.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
        Locator1.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(4000);
        */
	//	Method1.MyReportFilter(test,workbook);
	//	Thread.sleep(4000);
		
	    Locator1.MyReport().click();					                //Clicking on Dashboard count
	    Thread.sleep(4000);
	  
                        
     	sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
 		int row = 0;
 		Thread.sleep(500);
 		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
 		Cell c1 = null;
 		   
 		row0 = sheet.getRow(42);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.DraftReportChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(4000);

	    Locator1.UploadBtton1().click();					                //Clicking on Dashboard count
	    Thread.sleep(5000);
	    
	    String t = Locator1.SuccessfullyReport().getText();					                //Clicking on Dashboard count
	    Thread.sleep(5000);
	    
		test.log(LogStatus.PASS, " Draft Report " + t);
		Thread.sleep(5000);
	    
        File dir2 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator1.DownloadBtton1().click();
		
	 	Thread.sleep(9000);
		File dir3 = new File("C:\\Users\\ambujs\\Downloads");
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
	   
     
		row0 = sheet.getRow(43);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.FinalDeliverableChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);

	    Locator1.UploadButton2().click();					                //Clicking on Dashboard count
	    Thread.sleep(5000);
	    
	    String t1 = Locator1.SuccessfullyReport().getText();					                //Clicking on Dashboard count
	    Thread.sleep(5000);
	    
		test.log(LogStatus.PASS, " Final Deliverables Report " + t1);
		Thread.sleep(5000);
	    
       File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator1.DownloadButton2().click();
		
	 	Thread.sleep(9000);
		File dir4 = new File("C:\\Users\\ambujs\\Downloads");
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
	   
		row0 = sheet.getRow(44);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.AuditComiteeChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);

	    Locator1.UploadButton3().click();					                //Clicking on Dashboard count
	    Thread.sleep(5000);
	    
	    String t2 = Locator1.SuccessfullyReport().getText();					                //Clicking on Dashboard count
	    Thread.sleep(5000);
	    
		test.log(LogStatus.PASS, " Audit Committee Report " + t2);
		Thread.sleep(5000);
	    
        File dir5 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents5 = dir5.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator1.DownloadButton3().click();
		
	 	Thread.sleep(9000);
		File dir6 = new File("C:\\Users\\ambujs\\Downloads");
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
	   
	   /*
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    
	    js.executeScript("document.body.style.zoom = '80%';");
	    Thread.sleep(5000);
	/*
       JavascriptExecutor js1 = (JavascriptExecutor) getDriver();

       // Scroll horizontally by 1000 pixels
       js1.executeScript("arguments[0].scrollLeft = 500;");
       Thread.sleep(4000);
       */

	   
		row0 = sheet.getRow(45);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator1.FeedbackFormChooseFile().sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);

	//    Locator1.UploadButton4().click();					                //Clicking on Dashboard count
	 //   Thread.sleep(20000);
	    
	       if(Locator1.UploadButton4().isEnabled())
	 		{
	 			
	 			Thread.sleep(2000);
	 			Locator1.UploadButton4().click();
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
        File dir7 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents7 = dir7.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		Locator1.DownloadButton4().click();
		
	 	Thread.sleep(9000);
		File dir8 = new File("C:\\Users\\ambujs\\Downloads");
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
	    
        File dir9 = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(3000);
		/*Locator1.AllFileDownloadButton5().click();
		
	 	Thread.sleep(9000);
		File dir0 = new File("C:\\Users\\ambujs\\Downloads");
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
	//   Method1.MyReportFilter(test,workbook);
	//   Thread.sleep(4000);
	*/
	}
	
	
	
	public static void MyReportAuditSceduling( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
       Thread.sleep(4000);
       
	//	Locator1.ARS().click();
	//	Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        Locator1.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(6000);
        
        Locator1.MoreReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        Locator1.AuditScheduling().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);
        
        File dir9 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
 		
 		Thread.sleep(3000);
 		Locator1.AuditSchedulingExportToExcelButton().click();
 		
 	 	Thread.sleep(9000);
 		File dir0 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
 	  
        Thread.sleep(3000);
 	   if (dirContents9.length < allFilesNew0.length) {
 			test.log(LogStatus.PASS,  " Audit Sceduling Report - Export Report Download Successfully");
 		}
 	   else
 	   {
 		 	test.log(LogStatus.FAIL, " Audit Sceduling Report - Export Report Does Not Download Successfully "   );

 		}   
 	   Thread.sleep(4000);

	
	
	
	}
	
	
	
	
	public static void ObservationReportExportAndGridCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(26000);
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
 		
        
        String OptionText1 = "Option 4";
 		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
 		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
 		dropdownOption1.click();
 		 Thread.sleep(16000);
 		 
         
 		Thread.sleep(4000);
        			
         JavascriptExecutor js = (JavascriptExecutor) getDriver();
         
         js.executeScript("window.scrollBy(0,1000)");
         Thread.sleep(5000);
         
         WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage']"));
 	    List<WebElement> rows = table.findElements(By.tagName("tr"));

 	    int Row_Count = rows.size();
 	    		
 	    int length_Row = Row_Count-1;
 	    
 	    System.out.println(length_Row + "  "  );
 	    
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js2.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
        File dir9 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
 		
 		Thread.sleep(3000);
 		Locator1.MROpenObservationReportExportReport().click();
 		
 	 	Thread.sleep(9000);
 		File dir0 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
 	  
        Thread.sleep(3000);
 	   if (dirContents9.length < allFilesNew0.length) {
 			test.log(LogStatus.PASS,  " Open Observation Report - Export Report Download Successfully");
 		}
 	   else
 	   {
 		 	test.log(LogStatus.FAIL, " Open Observation Report - Export Report Does Not Download Successfully "   );

 		}   
 	   Thread.sleep(4000);
		
		/*
	FileInputStream fis = new FileInputStream("C:\\\\Users\\\\shitalb\\\\Downloads\\\\OpenObservationReport.xlsx");
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
		test.log(LogStatus.PASS, " Total records from Grid = "+length_Row+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, " Total records from Grid = "+length_Row+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\Users\\ambujs\\Downloads\\OpenObservationReport.xlsx";
	
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
	 Thread.sleep(2000);

	    */
		
	}
	
	

	public static void MyReportAuditStatus( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
       Thread.sleep(7000);
       
//		Locator1.ARS().click();
//		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        Locator1.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        Locator1.MoreReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        Locator1.AuditStatus().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);
        
        Locator1.NotDoneTab().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);
        
        CriticalMethod1.AuditStatusNotDoneGridAndExcelCount(test,workbook);
		Thread.sleep(5000);
		
	    Locator1.SubmittedTab().click();					                //Clicking on Dashboard count
	    Thread.sleep(5000);
	        
	    CriticalMethod1.AuditStatusSubmittedGridAndExcelCount(test,workbook);
		Thread.sleep(5000);

	    Locator1.TeamReviewTab().click();					                //Clicking on Dashboard count
	    Thread.sleep(5000);

	    CriticalMethod1.AuditStatusTeamReviewGridAndExcelCount(test,workbook);
		Thread.sleep(5000);

	    Locator1.AuditeeReviewTab().click();					                //Clicking on Dashboard count
	    Thread.sleep(5000);

	    CriticalMethod1.AuditStatusAuditeeReviewGridAndExcelCount(test,workbook);
		Thread.sleep(5000);

	    Locator1.FinalReviewTab().click();					                //Clicking on Dashboard count
	    Thread.sleep(5000);

	    CriticalMethod1.AuditStatusFinalReviewGridAndExcelCount(test,workbook);
		Thread.sleep(5000);

	    Locator1.ClosedTab().click();					                //Clicking on Dashboard count
	    Thread.sleep(5000);
	    
	    CriticalMethod1.AuditStatusClosedGridAndExcelCount(test,workbook);
		Thread.sleep(7000);


	    

		
	}

	
	
	public static void PrerequisitLogReportFilteer( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
       Thread.sleep(4000);
       
//		Locator1.ARS().click();
//		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        Locator1.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        Locator1.MoreReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
     
        Locator1.PreRequisiteLogReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
		 Locator1.Company().click();
		 Thread.sleep(3000);
	     Locator1.CompanyDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.FinancialYearp().click();
		 Thread.sleep(3000);
		 Locator1.FinancialYearDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.SchedulingTypeP().click();
	     Thread.sleep(2000);
	     Locator1.SchedulingTypePDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.Periodp().click();
	     Thread.sleep(2000);
	     Locator1.PeriodpDD().click();
		 Thread.sleep(20000);


	        File dir9 = new File("C:\\Users\\ambujs\\Downloads");
	 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
	 		
	 		Thread.sleep(3000);
	 		Locator1.ExportToExcelButton().click();
	 		
	 	 	Thread.sleep(9000);
	 		File dir0 = new File("C:\\Users\\ambujs\\Downloads");
	 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
	 	  
	        Thread.sleep(3000);
	 	   if (dirContents9.length < allFilesNew0.length) {
	 			test.log(LogStatus.PASS,  " Pre-Requisite Log Report - Export Report Download Successfully");
	 		}
	 	   else
	 	   {
	 		 	test.log(LogStatus.FAIL, " Pre-Requisite Log Report - Export Report Does Not Download Successfully "   );

	 		}   
	 	   Thread.sleep(9000);

			
		
		
	}

	
	
	public static void ManagementResponceLogReportFilteer( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		
		
       Thread.sleep(4000);
       
//		Locator1.ARS().click();
//		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        Locator1.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        Locator1.MoreReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
     
        Locator1.ManagementResponcelogreport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
		 Locator1.Company().click();
		 Thread.sleep(3000);
	     Locator1.CompanyDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.FinancialYearp().click();
		 Thread.sleep(3000);
		 Locator1.FinancialYearDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.SchedulingTypeP().click();
	     Thread.sleep(2000);
	     Locator1.SchedulingTypePDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.Periodp().click();
	     Thread.sleep(2000);
	     Locator1.PeriodpDD().click();
		 Thread.sleep(20000);


	        File dir9 = new File("C:\\Users\\ambujs\\Downloads");
	 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
	 		
	 		Thread.sleep(3000);
	 		Locator1.ExportToExcelButton().click();
	 		
	 	 	Thread.sleep(9000);
	 		File dir0 = new File("C:\\Users\\ambujs\\Downloads");
	 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
	 	  
	        Thread.sleep(3000);
	 	   if (dirContents9.length < allFilesNew0.length) {
	 			test.log(LogStatus.PASS,  " Management Response Log Report - Export Report Download Successfully");
	 		}
	 	   else
	 	   {
	 		 	test.log(LogStatus.FAIL, " Management Response Log Report - Export Report Does Not Download Successfully "   );

	 		}   
	 	   Thread.sleep(4000);

			
		
		
	}

	
	
	//26august24 change kiya 
	/* public static void MyReportPastauditReportFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
       Thread.sleep(4000);
      // /*
		Locator1.ARS().click();
		Thread.sleep(3000);
		//*/
	/*	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        Locator1.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        Locator1.MoreReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        Locator1.PastAuditReports().click();					                //Clicking on Dashboard count
        Thread.sleep(6000);
        
//		Method1.PastAuditFilter(test,workbook);
//		Thread.sleep(6000);
        
        Locator1.AddNewPastAuditReport().click();
		Thread.sleep(5000);
		
        getDriver().switchTo().frame(Locator1.Frame2());
		Thread.sleep(7000);
 
		 Locator1.Unit().click();
		 Thread.sleep(3000);
	     Locator1.MROpenObservationCompanyDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.FinancialYear2().click();
		 Thread.sleep(3000);
		 Locator1.FinancialYearMReportDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.AuditBackground().click();
	     Thread.sleep(2000);
	     Locator1.AuditBackgroundDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.ReportGenerationDate().click();
		 Thread.sleep(3000);		 
		 Locator1.ReportGenerationDateDD().click();
		 Thread.sleep(20000);
			
	        sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
				
	        
	        row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.ReportIssueByTextBox().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
		
	        row0 = sheet.getRow(47);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.ReportTitleTextBox().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);

	        row0 = sheet.getRow(48);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.RemarkTextBox().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);

	        row0 = sheet.getRow(49);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.UploadFile().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);

			 Locator1.SavePastAudit().click();
			 Thread.sleep(20000);

			 String t = Locator1.SuccessfullySave().getText();
			 Thread.sleep(20000);

	 		 test.log(LogStatus.PASS, "Add Past Audit - " + t  );
	 		 Thread.sleep(20000);
			
		        File dir9 = new File("C:\\Users\\ambujs\\Downloads");
		 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
		 		
		 		Thread.sleep(3000);
		 		Locator1.DownloadButton1().click();
		 		
		 	 	Thread.sleep(9000);
		 		File dir0 = new File("C:\\Users\\ambujs\\Downloads");
		 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
		 	  
		        Thread.sleep(3000);
		 	   if (dirContents9.length < allFilesNew0.length) {
		 			test.log(LogStatus.PASS,  " Past Audit Report Download Successfully");
		 		}
		 	   else
		 	   {
		 		 	test.log(LogStatus.FAIL, "  Past Audit Report Does Not Download Successfully "   );

		 		}   
		 	   Thread.sleep(4000);


		        if(Locator1.ViewButton().isEnabled())
		 		{
		 			
		 			Thread.sleep(2000);
		 			Locator1.ViewButton().click();
		 			test.log(LogStatus.PASS, "View Button Is Clickable " );
		 			
		 		}
		 		
		 		else
		 		{
		 			test.log(LogStatus.FAIL, "View Button Is Clickable"  );
		 			
		 		}
		        Thread.sleep(6000);
		 
				 Locator1.ClosePopup().click();
				 Thread.sleep(7000);

			        if(Locator1.CloseButton1().isEnabled())
			 		{
			 			
			 			Thread.sleep(2000);
			 			Locator1.CloseButton1().click();
			 			test.log(LogStatus.PASS, "Close Button Is Clickable " );
			 			
			 		}
			 		
			 		else
			 		{
			 			test.log(LogStatus.FAIL, "Close Button Is Clickable"  );
			 			
			 		}
			        Thread.sleep(15000);
			        

			//		Method1.MyReportPastauditReportUpdate(test,workbook);
			//		Thread.sleep(3000);
			
			
	}
	
	*/
	
	public static void MyReportPastauditReportUpdate( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
       Thread.sleep(9000);
       
		Locator1.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        Locator1.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        Locator1.MoreReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        Locator1.PastAuditReports().click();					                //Clicking on Dashboard count
        Thread.sleep(6000);
         
        Locator1.Update().click();
		Thread.sleep(5000);
		
        getDriver().switchTo().frame(Locator1.Frame2());
		Thread.sleep(7000);
 
		 Locator1.Unit().click();
		 Thread.sleep(3000);
	     Locator1.MROpenObservationCompanyDD().click();
		 Thread.sleep(20000);
		 
		 //Locator1.FinancialYear2().click();
		 Thread.sleep(3000);
		 //Locator1.FinancialYearMReportDD().click();
		// Thread.sleep(20000);
		 
		 Locator1.AuditBackground().click();
	     Thread.sleep(2000);
	     Locator1.AuditBackgroundDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.ReportGenerationDate().click();
		 Thread.sleep(3000);		 
		 Locator1.ReportGenerationDateDD().click();
		 Thread.sleep(20000);
			
	        sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
				
	        
	        row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.ReportIssueByTextBox().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
		
	        row0 = sheet.getRow(47);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.ReportTitleTextBox().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);

	        row0 = sheet.getRow(48);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.RemarkTextBox().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);

			/*
	        row0 = sheet.getRow(49);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator1.UploadFile().sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
*/
			 Locator1.SavePastAudit().click();
			 Thread.sleep(20000);

			 String t = Locator1.SuccessfullySave().getText();
			 Thread.sleep(20000);

	 		 test.log(LogStatus.PASS, "Update Past Audit - " + t  );
	 		 Thread.sleep(20000);
			
		        File dir9 = new File("C:\\Users\\ambujs\\Downloads");
		 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
		 		
		 		Thread.sleep(3000);
		 		Locator1.DownloadButton1().click();
		 		
		 	 	Thread.sleep(9000);
		 		File dir0 = new File("C:\\Users\\ambujs\\Downloads");
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


		        if(Locator1.ViewButton().isEnabled())
		 		{
		 			
		 			Thread.sleep(2000);
		 			Locator1.ViewButton().click();
		 			test.log(LogStatus.PASS, "View Button Is Clickable " );
		 			
		 		}
		 		
		 		else
		 		{
		 			test.log(LogStatus.FAIL, "View Button Is Clickable"  );
		 			
		 		}
		        Thread.sleep(6000);
		 
				 Locator1.ClosePopup().click();
				 Thread.sleep(7000);

			      /*  if(Locator1.CloseButton1().isEnabled())
			 		{
			 			
			 			Thread.sleep(2000);
			 			Locator1.CloseButton1().click();
			 			test.log(LogStatus.PASS, "Close Button Is Clickable " );
			 			
			 		}
			 		
			 		else
			 		{
			 			test.log(LogStatus.FAIL, "Close Button Is Clickable"  );
			 			
			 		}
			        Thread.sleep(5000);

			        if(Locator1.ViewPastAuditReport().isEnabled())
			 		{
			 			
			 			Thread.sleep(2000);
			 			Locator1.ViewPastAuditReport().click();
			 			test.log(LogStatus.PASS, "Past Audit Reports Page - View Button Is Clickable " );
			 			
			 		}
			 		
			 		else
			 		{
			 			test.log(LogStatus.FAIL, "Past Audit Reports - View Button Is Clickable"  );
			 			
			 		}
			        Thread.sleep(5000);

			*/
			
	}
	

	
	
	
	public static void DaftObservationFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
       Thread.sleep(4000);
//		Locator1.ARS().click();
//		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
       Locator1.MyReport().click();					                //Clicking on Dashboard count
       Thread.sleep(3000);
       
       Locator1.MoreReport().click();					                //Clicking on Dashboard count
       Thread.sleep(3000);
       
       Locator1.AuditScheduling().click();					                //Clicking on Dashboard count
       Thread.sleep(3000);
       
       Locator1.MoreReport().click();					                //Clicking on Dashboard count
       Thread.sleep(3000);
       
       Locator1.DraftObservation().click();					                //Clicking on Dashboard count
       Thread.sleep(7000);
       /*
 	   Locator1.UnitD().click();
	   Thread.sleep(3000);
	   String unitText =Locator1.MROpenObservationCompanyDD().getText();
	   Thread.sleep(3000);
	   Locator1.MROpenObservationCompanyDD().click();
	   Thread.sleep(20000);
		 
		 Locator1.FinancialYearD().click();
		 Thread.sleep(3000);
		 String financialyearText =Locator1.FinancialYearMReportDD().getText();
		 Thread.sleep(3000);
		 Locator1.FinancialYearMReportDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.SchedulingTypeP().click();
	     Thread.sleep(2000);
	//	 String schedulingtypeText =Locator1.SchedulingTypePDD().getText();
	//	 Thread.sleep(2000);
	     Locator1.SchedulingTypePDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.Periodp().click();
	     Thread.sleep(2000);
		 String periodText =Locator1.PeriodpDD().getText();
		 Thread.sleep(2000);
	     Locator1.PeriodpDD().click();
		 Thread.sleep(20000);

	 

		 
			
	      List<String> li=new ArrayList<String>();
	      
	      li.add(unitText);
	      li.add(financialyearText);
	   //   li.add(schedulingtypeText);
	      li.add(periodText);
	      
	      Thread.sleep(3000);
	      
			List<String> filter=new ArrayList<String>();	
			filter.add("Unit");
			filter.add("Financial Year");
		//	filter.add("Scheduling Type");
			filter.add("Period");
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,2000)");	
			Thread.sleep(3000);
	
			Locator.Grid2().click();					//Clicking on Text of total items just to scroll down.
			String s = Locator.Grid2().getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("0")) {
			Thread.sleep(5000);
		
			List<WebElement> unitcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits']/tbody/tr[2]/td[2]"));
			List<WebElement> financialyearcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits']/tbody/tr[2]/td[4]"));
		//	List<WebElement> schedulingtypecol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix']/tbody/tr[2]/td[4]"));
			List<WebElement> periodcol=getDriver().findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits']/tbody/tr[2]/td[5]"));

			
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
						raw.addAll(financialyearcol);
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
*/
			Thread.sleep(5000);

			//CriticalMethod1.MyReportDraftObservation(test,workbook);
			//Thread.sleep(5000);
	
	
	
	}
	
	
	public static void ObservationWordFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
       Thread.sleep(4000);
	//	Locator1.ARS().click();
	//	Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
       Locator1.MyReport().click();					                //Clicking on Dashboard count
       Thread.sleep(3000);
       
       Locator1.MoreReport().click();					                //Clicking on Dashboard count
       Thread.sleep(3000);
       
       Locator1.AuditScheduling().click();					                //Clicking on Dashboard count
       Thread.sleep(3000);
       
       Locator1.MoreReport().click();					                //Clicking on Dashboard count
       Thread.sleep(3000);
       
       /* Locator1.ObservationWord().click();					                //Clicking on Dashboard count
       Thread.sleep(7000);
       
 	   Locator1.UnitD().click();
	   Thread.sleep(3000);
	   Locator1.MROpenObservationCompanyDD().click();
	   Thread.sleep(20000);
		 
		 Locator1.FinancialYearD().click();
		 Thread.sleep(3000);
		 Locator1.FinancialYearMReportDD().click();
		 Thread.sleep(20000);
		 
		 
		 Locator1.SchedulingTypeP().click();
	     Thread.sleep(2000);
	//	 String schedulingtypeText =Locator1.SchedulingTypePDD().getText();
	//	 Thread.sleep(2000);
	     Locator1.SchedulingTypePDD().click();
		 Thread.sleep(20000);
		 
		 Locator1.Periodp().click();
	     Thread.sleep(2000);
		 String periodText =Locator1.PeriodpDD().getText();
		 Thread.sleep(2000);
	     Locator1.PeriodpDD().click();
		 Thread.sleep(20000);

	 */

	        File dir9 = new File("C:\\Users\\ambujs\\Downloads");
	 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
	 		
	 		Thread.sleep(3000);
	 		Locator1.ExportObservationWord().click();
	 		
	 	 	Thread.sleep(9000);
	 		File dir0 = new File("C:\\Users\\ambujs\\Downloads");
	 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
	 	  
	        Thread.sleep(3000);
	 	   if (dirContents9.length < allFilesNew0.length) {
	 			test.log(LogStatus.PASS,  " Observation-Word Document Download Successfully");
	 		}
	 	   else
	 	   {
	 		 	test.log(LogStatus.FAIL, "  Observation-Word Document Does Not Download Successfully "   );

	 		}   
	 	   Thread.sleep(4000);


	//	 Method1.MyReportDraftObservation(test,workbook);
	//	 Thread.sleep(5000);
	
	
	
	}
	
	
	
	public static void MyReportDraftObservation( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
       Thread.sleep(9000);
       
	//	Locator1.ARS().click();
	//	Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
        Locator1.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        Locator1.MoreReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        Locator1.AuditScheduling().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        Locator1.MoreReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        Locator1.DraftObservation().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        if(Locator1.ViewIcon().isEnabled())
 		{
        	Thread.sleep(3000);
            Locator1.ViewIcon().click();					                //Clicking on Dashboard count
	 		test.log(LogStatus.PASS, "Draft Observation - View Button Working Properly " );
 			
 		}
 		
 		else
 		{
 			Thread.sleep(3000);
 			test.log(LogStatus.FAIL, "Draft Observation - View Button Does Not Working Properly"  );
 			
 		}
        Thread.sleep(5000);
        
        File dir = new File("C:\\Users\\ambujs\\Downloads");
 		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
 		
 		Thread.sleep(3000);
 		Locator1.DraftExportToExcel().click();
 		
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
        
 	//	Locator1.DraftObservationListing().click();					                //Clicking on Dashboard count
 	//    Thread.sleep(7000);
 	    
         Locator1.CheckBox2().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);

         Locator1.Save4().click();					                //Clicking on Dashboard count
         Thread.sleep(7000);

         String t = Locator1.SuccessfullyObservation1().getText();				                //Clicking on Dashboard count
         Thread.sleep(7000);
         
 		test.log(LogStatus.PASS,  " By Selecting Check Box Update Observation - " + t);
 		Thread.sleep(2000);
         
  	   Thread.sleep(3000);
 	    
 	    Locator1.EyeIcon().click();					                //Clicking on Dashboard count
 	    Thread.sleep(2000);
 	    
  		sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
  		int row = 0;
  		Thread.sleep(500);
  		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
  		Cell c1 = null;
  		
         getDriver().switchTo().frame(Locator1.Frame2());
 		Thread.sleep(7000);
 		
 		 if(Locator1.NextButton1().isEnabled())
 	 		{
 	 			
 	 			Thread.sleep(2000);
 	 			Locator1.NextButton1().click();
 	 			test.log(LogStatus.PASS, "Audit Coverage Tab - Next Button Is Clickable " );
 	 			
 	 		}
 	 		
 	 		else
 	 		{
 	 			test.log(LogStatus.FAIL, "Audit Coverage Tab - Next Button Is Clickable"  );
 	 			
 	 		}
 	        Thread.sleep(7000);
 			
 		
 	//	Locator1.NextButton1().click();					                //Clicking on Dashboard count
      //   Thread.sleep(2000);
             
 	    Locator1.ProcessWalkthrogh().clear();
 	    Thread.sleep(2000);
         
         row0 = sheet.getRow(4);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.ProcessWalkthrogh().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
 	    Locator1.ActualWorkdone().clear();
 	    Thread.sleep(2000);
  
         row0 = sheet.getRow(5);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.ActualWorkdone().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
 	    Locator1.Population().clear();
 	    Thread.sleep(2000);
  
 		
 		row0 = sheet.getRow(6);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.Population().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
 	    Locator1.Sample().clear();
 	    Thread.sleep(2000);
  
 		
 		row0 = sheet.getRow(7);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.Sample().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
 	    Locator1.Remarks().clear();
 	    Thread.sleep(2000);
  
 		
 		row0 = sheet.getRow(8);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.Remarks().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(4000);
 		
 		/*
         File dir4 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] dirContents4 = dir4.listFiles();						//Counting number of files in directory before download
 		
 		Thread.sleep(3000);
 		Locator1.WorkingDocument1().click();
 		
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
 		Locator1.WorkingFileUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
 		Locator1.WorkingFileUploadButton().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Alert ac=getDriver().switchTo().alert();
 		
 		String t1=getDriver().switchTo().alert().getText();
 		
 		test.log(LogStatus.PASS, t1 );
 		
 		Thread.sleep(5000);
 		ac.accept();
 		Thread.sleep(3000);
 	    	
 		
 		row0 = sheet.getRow(10);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.AnnexureFile().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
 		Locator1.AnnexureFileUploadButton().click();					                //Clicking on Dashboard count
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
 		Locator1.AnnexureDocument1().click();
 		
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
 	       
 	
 	    	
     //    Locator1.NextButton2().click();					                //Clicking on Dashboard count
     //    Thread.sleep(2000);
         
         if(Locator1.NextButton2().isEnabled())
  		{
  			
  			Thread.sleep(2000);
  			Locator1.NextButton2().click();
  			test.log(LogStatus.PASS, " Actual Testing/ Work Done - Next Button Is Clickable " );
  			
  		}
  		
  		else
  		{
  			test.log(LogStatus.FAIL, " Actual Testing/ Work Done - Next Button Is Clickable"  );
  			
  		}
         Thread.sleep(2000);
         
         Locator1.ObservationTitle().clear();
         Thread.sleep(2000);
         
         row0 = sheet.getRow(11);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.ObservationTitle().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
 	    Locator1.Observation().clear();
 	    Thread.sleep(2000);
 	 
 		
 		row0 = sheet.getRow(12);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.Observation().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
 	    Locator1.briefObservation().clear();
 	    Thread.sleep(2000);

 		
 		row0 = sheet.getRow(13);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.briefObservation().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
 		
 	    Locator1.ObservationBackground().clear();
 	    Thread.sleep(2000);

 		
 		row0 = sheet.getRow(14);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.ObservationBackground().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
 		/*
 		row0 = sheet.getRow(15);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.WorkingFile1().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
 		Locator1.WorkingFile1Uploadbutton().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Alert ac2=getDriver().switchTo().alert();
 		
 		String t3=getDriver().switchTo().alert().getText();
 		
 		test.log(LogStatus.PASS, t3 );
 		
 		Thread.sleep(5000);
 		ac2.accept();
 		Thread.sleep(3000);
         */
 		
 	    Locator1.AnnexureTitle().clear();
 	    Thread.sleep(2000);

 		
 		row0 = sheet.getRow(16);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.AnnexureTitle().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
 		Locator1.Table1().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
 		
         Locator1.TableWizard().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
 		
         Locator1.OKTable().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
 		
 		row0 = sheet.getRow(17);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.ImageUpload().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(4000);
 		
 		Locator1.ImageUploadButton().click();					                //Clicking on Dashboard count
         Thread.sleep(17000);
         
         /*
         Alert ac9=getDriver().switchTo().alert();
 		
 		String t10=getDriver().switchTo().alert().getText();
 		
 		test.log(LogStatus.PASS, t10 );
 		
 		Thread.sleep(5000);
 		ac9.accept();
 		Thread.sleep(3000);
         */
         
 		Locator1.AudioVideoLink().clear();
 		Thread.sleep(3000);
         
 		row0 = sheet.getRow(18);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.AudioVideoLink().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
 		 JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
 	        
 	        js1.executeScript("window.scrollBy(0,200)");
 	        Thread.sleep(9000);
 	  
 		
         Locator1.AuditComitee1().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Locator1.AuditComiteeDD().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         row0 = sheet.getRow(19);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.BusinessRisk().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
 		row0 = sheet.getRow(20);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.RootCause().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(3000);
 		
 		row0 = sheet.getRow(24);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.FinancialImpact().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
         Locator1.ObservationRating().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Locator1.RiskRatingDD().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         	
         Locator1.ObservationCatogary1().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Locator1.ObservationCatogaryDD().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Locator1.ObservationSubCatogary1().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Locator1.ObservationSubCatogaryDD().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Locator1.ReccomendationType1().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Locator1.ReccomendationTypeDD().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         row0 = sheet.getRow(22);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.Reccomendation().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
         
         Locator1.ResponceDueDate1().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Locator1.ResponceDueDateDD().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         row0 = sheet.getRow(23);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.ManagementResponce().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
            
         Locator1.TimelineCalender1().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         	
         Locator1.TimelineCalenderDD().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Locator1.PersonResponsible1().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Locator1.PersonResponsibleDD().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Locator1.OwnerName1().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Locator1.OwnerNameDD().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Locator1.SaveReccomendation().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         String t6 = Locator1.Successfullyreccomendation().getText();				                //Clicking on Dashboard count
         Thread.sleep(2000);
 		test.log(LogStatus.PASS,  t6);
  		Thread.sleep(2000);
          
         Locator1.OK1().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Locator1.SaveObservation().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
               
         String t5 = Locator1.SuccessfullyObservation().getText();				                //Clicking on Dashboard count
         Thread.sleep(2000);
 		test.log(LogStatus.PASS,  t5);
  		Thread.sleep(2000);
          
         Locator1.OK2().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
     //    Locator1.ShowReviewHistoryLogLink().click();					                //Clicking on Dashboard count
      //   Thread.sleep(2000);
         
         row0 = sheet.getRow(27);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.ReviewRemark().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 		
 		row0 = sheet.getRow(28);
 		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
 		Locator1.File().sendKeys(c1.getStringCellValue()); // Writing Task title
 		Thread.sleep(2000);
 			
 		Locator1.UploadButton().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         Locator1.SubmitButton().click();					                //Clicking on Dashboard count
         Thread.sleep(2000);
         
         String t0 = Locator1.Successfully3().getText();				                //Clicking on Dashboard count
         Thread.sleep(2000);
 		test.log(LogStatus.PASS,  t0);
  		Thread.sleep(4000);
           
        Locator1.OK().click();					                //Clicking on Dashboard count            
        Thread.sleep(4000);

 		getDriver().switchTo().parentFrame();
 		
 		Thread.sleep(4000);
 		
 		Locator1.ClosePage().click();
 		
 		Thread.sleep(3000);
          
 	        Locator1.DeleteDraft().click();					                //Clicking on Dashboard count
 	        Thread.sleep(2000);
 	       
 	        Alert ac0=getDriver().switchTo().alert();
 			
 			String t40=getDriver().switchTo().alert().getText();
 			
 			test.log(LogStatus.PASS, t40 );
 			
 			Thread.sleep(5000);
 			ac0.accept();
 			Thread.sleep(3000);
 			
 			if(Locator1.Back().isEnabled())
 	 		{
 	 			
 	 			Thread.sleep(2000);
 	 			Locator1.Back().click();
 	 			test.log(LogStatus.PASS, "Back Button Working Properly " );
 	 			
 	 		}
 	 		
 	 		else
 	 		{
 	 			test.log(LogStatus.FAIL, "Back Button Does Not Working Properly"  );
 	 			
 	 		}
 			
 	        Thread.sleep(7000);
 	          

        
	}
	

	
	
	
	public static void AuditStatusNotDoneGridAndExcelCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(7000);
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
 		
        
        String OptionText1 = "Option 4";
 		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
 		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
 		dropdownOption1.click();
 		 Thread.sleep(16000);
 		
        			
         JavascriptExecutor js = (JavascriptExecutor) getDriver();
         
         js.executeScript("window.scrollBy(0,1000)");
         Thread.sleep(5000);
         
         WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdARSReport']"));
 	    List<WebElement> rows = table.findElements(By.tagName("tr"));

 	    int Row_Count = rows.size();
 	    		
 	    int length_Row = Row_Count-1;
 	    
 	    System.out.println(length_Row + "  "  );
 	    
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js2.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(7000);
 		
        File dir9 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
 		
 		Thread.sleep(9000);
 		Locator1.AuditStatusExportToExcelButton().click();
 		
 	 	Thread.sleep(10000);
 		File dir0 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
 	  
        Thread.sleep(3000);
 	   if (dirContents9.length < allFilesNew0.length) {
 			test.log(LogStatus.PASS,  " Audit Status Report - Not Done Export Report Download Successfully");
 		}
 	   else
 	   {
 		 	test.log(LogStatus.FAIL, " Audit Status Report - Not Done Report Does Not Download Successfully "   );

 		}   
 	   Thread.sleep(7000);
		
		/*
	FileInputStream fis = new FileInputStream("C:\\Users\\ambujs\\Downloads\\AuditStatusReport.xlsx");
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
		test.log(LogStatus.PASS, " Not Done - Total records from Grid = "+length_Row+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, " Not Done - Total records from Grid = "+length_Row+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\\\Users\\\\shitalb\\\\Downloads\\\\AuditStatusReport.xlsx";
	
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
	 Thread.sleep(2000);
*/
	    
		
	}
	

	
	public static void AuditStatusSubmittedGridAndExcelCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
	      Thread.sleep(7000);
	       /*
			Locator1.ARS().click();
			Thread.sleep(3000);
			
			WebDriverWait wait = new WebDriverWait( getDriver(),(60));
			
	        Locator1.MyReport().click();					                //Clicking on Dashboard count
	        Thread.sleep(3000);
	        
	        Locator1.MoreReport().click();					                //Clicking on Dashboard count
	        Thread.sleep(3000);
	        
	        Locator1.AuditStatus().click();					                //Clicking on Dashboard count
	        Thread.sleep(5000);
	        
	        Locator1.SubmittedTab().click();					                //Clicking on Dashboard count
	        Thread.sleep(5000);
*/
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
 		
        
        String OptionText1 = "Option 4";
 		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
 		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
 		dropdownOption1.click();
 		 Thread.sleep(16000);
 		 
  
        WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdARSReport']"));
 	    List<WebElement> rows = table.findElements(By.tagName("tr"));

 	    int Row_Count = rows.size();
 	    		
 	    int length_Row = Row_Count-1;
 	    
 	    System.out.println(length_Row + "  "  );
 	    
		Thread.sleep(4000);
		
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(5000);
        
 		Thread.sleep(3000);

		
       JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
       
       js2.executeScript("window.scrollBy(0,1000)");
       Thread.sleep(5000);
       
 		Locator1.GridPage().click();
 		Thread.sleep(3000);
 		
		Locator1.GridPageDD().click();
 		Thread.sleep(20000);
 		
       JavascriptExecutor js3 = (JavascriptExecutor) getDriver();
        
        js3.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(5000);

        WebElement table1 = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdARSReport']"));
  	    List<WebElement> rows1 = table1.findElements(By.tagName("tr"));

  	    int Row_Count1 = rows1.size();
  	    		
  	    int length_Row1 = Row_Count1-1;
  	    
  	    int Actual_length_Row1 = length_Row+length_Row1;
  	    
  	    System.out.println(Actual_length_Row1 + "  "  );
  
  	  
        File dir9 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
 		
 		Thread.sleep(3000);
 		Locator1.AuditStatusExportToExcelButton().click();
 		
 	 	Thread.sleep(9000);
 		File dir0 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
 	  
        Thread.sleep(3000);
 	   if (dirContents9.length < allFilesNew0.length) {
 			test.log(LogStatus.PASS,  " Submitted Report Download Successfully");
 		}
 	   else
 	   {
 		 	test.log(LogStatus.FAIL, " Submitted Report Does Not Download Successfully "   );

 		}   
 	   Thread.sleep(4000);
		
		/*
	FileInputStream fis = new FileInputStream("C:\\Users\\ambujs\\Downloads\\AuditStatusReport.xlsx");
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
	
	if(Actual_length_Row1 == actualRow)
	{
		//test.log(LogStatus.PASS, "No of records from grid matches to no of records in Excel Sheet.");
		test.log(LogStatus.PASS, " Submitted - Total records from Grid = "+Actual_length_Row1+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, " Submitted - Total records from Grid = "+Actual_length_Row1+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\Users\\ambujs\\Downloads\\AuditStatusReport.xlsx";
	
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
	 Thread.sleep(2000);
*/
	    
		
	}
	

	
	
	public static void AuditStatusTeamReviewGridAndExcelCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(26000);
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
 		
        
        String OptionText1 = "Option 4";
 		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
 		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
 		dropdownOption1.click();
 		 Thread.sleep(16000);
 		 
         
 		Thread.sleep(4000);
        			
         JavascriptExecutor js = (JavascriptExecutor) getDriver();
         
         js.executeScript("window.scrollBy(0,1000)");
         Thread.sleep(5000);
         
         WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdARSReport']"));
 	    List<WebElement> rows = table.findElements(By.tagName("tr"));

 	    int Row_Count = rows.size();
 	    		
 	    int length_Row = Row_Count-2;
 	    
 	    System.out.println(length_Row + "  "  );
 	    
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js2.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
        File dir9 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
 		
 		Thread.sleep(3000);
 		Locator1.AuditStatusExportToExcelButton().click();
 		
 	 	Thread.sleep(9000);
 		File dir0 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
 	  
        Thread.sleep(3000);
 	   if (dirContents9.length < allFilesNew0.length) {
 			test.log(LogStatus.PASS,  " Team Review Report Download Successfully");
 		}
 	   else
 	   {
 		 	test.log(LogStatus.FAIL, " Team Review Report Does Not Download Successfully "   );

 		}   
 	   Thread.sleep(4000);
		
		/*
	FileInputStream fis = new FileInputStream("C:\\Users\\ambujs\\Downloads\\AuditStatusReport.xlsx");
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
		test.log(LogStatus.PASS, " Team Review - Total records from Grid = "+length_Row+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, " Team Review - Total records from Grid = "+length_Row+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\\\Users\\\\shitalb\\\\Downloads\\\\AuditStatusReport.xlsx";
	
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
	 Thread.sleep(2000);

	    */
		
	}
	

	
	public static void AuditStatusAuditeeReviewGridAndExcelCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(26000);
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
 		
        
        String OptionText1 = "Option 4";
 		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
 		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
 		dropdownOption1.click();
 		 Thread.sleep(16000);
 		 
         
 		Thread.sleep(4000);
        			
         JavascriptExecutor js = (JavascriptExecutor) getDriver();
         
         js.executeScript("window.scrollBy(0,1000)");
         Thread.sleep(5000);
         
         WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdARSReport']"));
 	    List<WebElement> rows = table.findElements(By.tagName("tr"));

 	    int Row_Count = rows.size();
 	    		
 	    int length_Row = Row_Count-1;
 	    
 	    System.out.println(length_Row + "  "  );
 	    
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js2.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
        File dir9 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
 		
 		Thread.sleep(3000);
 		Locator1.AuditStatusExportToExcelButton().click();
 		
 	 	Thread.sleep(9000);
 		File dir0 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
 	  
        Thread.sleep(3000);
 	   if (dirContents9.length < allFilesNew0.length) {
 			test.log(LogStatus.PASS,  " Auditee Review Report Download Successfully");
 		}
 	   else
 	   {
 		 	test.log(LogStatus.FAIL, " Auditee Review Report Does Not Download Successfully "   );

 		}   
 	   Thread.sleep(4000);
		
		/*
	FileInputStream fis = new FileInputStream("C:\\Users\\ambujs\\Downloads\\AuditStatusReport.xlsx");
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
		test.log(LogStatus.PASS, " Auditee Review - Total records from Grid = "+length_Row+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, " Auditee Review - Total records from Grid = "+length_Row+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\\\Users\\\\shitalb\\\\Downloads\\\\AuditStatusReport.xlsx";
	
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
	 Thread.sleep(2000);
*/
	    
		
	}
	

	public static void AuditStatusFinalReviewGridAndExcelCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(26000);
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
 		
        
        String OptionText1 = "Option 4";
 		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
 		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
 		dropdownOption1.click();
 		 Thread.sleep(16000);
 		 
         
 		Thread.sleep(4000);
        			
         JavascriptExecutor js = (JavascriptExecutor) getDriver();
         
         js.executeScript("window.scrollBy(0,1000)");
         Thread.sleep(5000);
         
         WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdARSReport']"));
 	    List<WebElement> rows = table.findElements(By.tagName("tr"));

 	    int Row_Count = rows.size();
 	    		
 	    int length_Row = Row_Count-2;
 	    
 	    System.out.println(length_Row + "  "  );
 	    
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js2.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
        File dir9 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
 		
 		Thread.sleep(3000);
 		Locator1.AuditStatusExportToExcelButton().click();
 		
 	 	Thread.sleep(9000);
 		File dir0 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
 	  
        Thread.sleep(3000);
 	   if (dirContents9.length < allFilesNew0.length) {
 			test.log(LogStatus.PASS,  " Final Review Report Download Successfully");
 		}
 	   else
 	   {
 		 	test.log(LogStatus.FAIL, " Final Review Report Does Not Download Successfully "   );

 		}   
 	   Thread.sleep(4000);
		
		/*
	FileInputStream fis = new FileInputStream("C:\\Users\\ambujs\\Downloads\\AuditStatusReport.xlsx");
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
		test.log(LogStatus.PASS, " Final Review  - Total records from Grid = "+length_Row+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, " Final Review  - Total records from Grid = "+length_Row+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\\\Users\\\\shitalb\\\\Downloads\\\\AuditStatusReport.xlsx";
	
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
	 Thread.sleep(2000);
*/
	    
		
	}
	

	
	
	public static void AuditStatusClosedGridAndExcelCount( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(26000);
		
        JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
        
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
 		
        
        String OptionText1 = "Option 4";
 		String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlPageSize']/option[4]",OptionText1);
 		WebElement dropdownOption1 = getDriver().findElement(By.xpath(xpathExpression1));
 		dropdownOption1.click();
 		 Thread.sleep(16000);
 		 
         
 		Thread.sleep(4000);
        			
         JavascriptExecutor js = (JavascriptExecutor) getDriver();
         
         js.executeScript("window.scrollBy(0,1000)");
         Thread.sleep(5000);
         
         WebElement table = getDriver().findElement(By.xpath("//table[@id='ContentPlaceHolder1_grdARSReport']"));
 	    List<WebElement> rows = table.findElements(By.tagName("tr"));

 	    int Row_Count = rows.size();
 	    		
 	    int length_Row = Row_Count-1;
 	    
 	    System.out.println(length_Row + "  "  );
 	    
		
        JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
        
        js2.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
 		
        File dir9 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] dirContents9 = dir9.listFiles();						//Counting number of files in directory before download
 		
 		Thread.sleep(3000);
 		Locator1.AuditStatusExportToExcelButton().click();
 		
 	 	Thread.sleep(9000);
 		File dir0 = new File("C:\\Users\\ambujs\\Downloads");
 		File[] allFilesNew0 = dir0.listFiles();						//Counting number of files in directory after download
 	  
        Thread.sleep(3000);
 	   if (dirContents9.length < allFilesNew0.length) {
 			test.log(LogStatus.PASS,  " Closed Report Download Successfully");
 		}
 	   else
 	   {
 		 	test.log(LogStatus.FAIL, " Closed Report Does Not Download Successfully "   );

 		}   
 	   Thread.sleep(4000);
		
		/*
	FileInputStream fis = new FileInputStream("C:\\Users\\ambujs\\Downloads\\AuditStatusReport.xlsx");
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
		test.log(LogStatus.PASS, " Closed - Total records from Grid = "+length_Row+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, " Closed - Total records from Grid = "+length_Row+" | Total records from Excel Sheet = "+actualRow);
	}
	
	Thread.sleep(2000);
	
	String fis1 = "C:\\\\Users\\\\shitalb\\\\Downloads\\\\AuditStatusReport.xlsx";
	
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
	 Thread.sleep(2000);
*/
	    
		
	}
	

	
	
	

}
