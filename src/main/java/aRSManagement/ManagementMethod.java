package aRSManagement;

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
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import aRSAuditHead.AuditHeadArsLocator;
import aRSAuditee.Locator;
import arsPerformer.Locator1;
import arsPerformer.Method1;
import login.BasePage;



public class ManagementMethod extends BasePage{

	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	public static void HighRisk( ExtentTest test ,String RiskType,String type) throws InterruptedException
	 {
		Thread.sleep(1000);
		ManagementLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	if(type.equalsIgnoreCase("open")) {
	Thread.sleep(1000);
	ManagementLocator.ClickHighOpen().click();
	Thread.sleep(2000);
	
	
	}else {
		
		Thread.sleep(5000);
		ManagementLocator.ClickHighClose().click();
		Thread.sleep(8000);
		
	}
	
	String FinanceAccounts = ManagementLocator.FinanceAccountsHigh().getText();		//Reading the Closed Timely value of Human Resource
	FinanceAccounts = FinanceAccounts.replaceAll(" ","");									//Removing all white spaces from string. 
	int Finance_Accounts = Integer.parseInt(FinanceAccounts);	
	
	ManagementLocator.FinanceAccountsHigh().click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

	Thread.sleep(1000);
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	
	ManagementLocator.ClickExport().click();		//Exporting (Downloading) file
	
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
	
	ManagementLocator.RiskView().click();		
	Thread.sleep(3000);
	ManagementLocator.RiskViewClose().click();		
	Thread.sleep(8000);
	
	test.log(LogStatus.PASS,  "  View successfully.");
	
	String s1 = ManagementLocator.readTotalItems().getText();		//Reading total number of items.
	String[] bits = s1.split(" ");									//Splitting the String
	String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
	
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		Thread.sleep(1000);
		s1 = ManagementLocator.readTotalItems().getText();
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
	ManagementLocator.ClosePopRisk().click();		
	
	
	Thread.sleep(3000);
	ManagementLocator.ClickDashboard().click();		
	Thread.sleep(3000);
	 }

	
	public static void MediumRisk( ExtentTest test ,String RiskType,String type) throws InterruptedException
	{
		Thread.sleep(1000);
		ManagementLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	if(type.equalsIgnoreCase("open")) {
	Thread.sleep(3000);
	ManagementLocator.ClickMediumOpen().click();
	Thread.sleep(4000);


	}else {
		
		Thread.sleep(3000);
		ManagementLocator.ClickMediumClose().click();
		Thread.sleep(4000);
		
	}

	String FinanceAccounts = ManagementLocator.FinanceAccountsHigh().getText();		//Reading the Closed Timely value of Human Resource
	FinanceAccounts = FinanceAccounts.replaceAll(" ","");									//Removing all white spaces from string. 
	int Finance_Accounts = Integer.parseInt(FinanceAccounts);	

	ManagementLocator.FinanceAccountsHigh().click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

	Thread.sleep(3000);
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download


	ManagementLocator.ClickExport().click();		//Exporting (Downloading) file

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

	ManagementLocator.RiskView().click();		
	Thread.sleep(3000);
	ManagementLocator.RiskViewClose().click();		
	Thread.sleep(3000);

	test.log(LogStatus.PASS,  "  View successfully.");

	String s1 = ManagementLocator.readTotalItems().getText();		//Reading total number of items.
	String[] bits = s1.split(" ");									//Splitting the String
	String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)

	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		Thread.sleep(1000);
		s1 = ManagementLocator.readTotalItems().getText();
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
	ManagementLocator.ClosePopRisk().click();		

		
	Thread.sleep(8000);
	ManagementLocator.ClickDashboard().click();		
	Thread.sleep(3000);
	}

	public static void LowRisk1( ExtentTest test ,String RiskType,String type) throws InterruptedException
	{
		Thread.sleep(1000);
		ManagementLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	if(type.equalsIgnoreCase("open")) {
	Thread.sleep(3000);
	ManagementLocator.ClickLowOpen().click();
	Thread.sleep(3000);


	}else {
		
		Thread.sleep(3000);
		ManagementLocator.ClickLowClose().click();
		Thread.sleep(4000);
		
	}

	String FinanceAccounts = ManagementLocator.FinanceAccountsHigh().getText();		//Reading the Closed Timely value of Human Resource
	FinanceAccounts = FinanceAccounts.replaceAll(" ","");									//Removing all white spaces from string. 
	int Finance_Accounts = Integer.parseInt(FinanceAccounts);	

	ManagementLocator.FinanceAccountsHigh().click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

	Thread.sleep(4000);
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download


	ManagementLocator.ClickExport().click();		//Exporting (Downloading) file

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

	ManagementLocator.RiskView().click();		
	Thread.sleep(3000);
	ManagementLocator.RiskViewClose().click();		
	Thread.sleep(3000);

	test.log(LogStatus.PASS,  "  View successfully.");

	String s1 = ManagementLocator.readTotalItems().getText();		//Reading total number of items.
	String[] bits = s1.split(" ");									//Splitting the String
	String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)

	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		Thread.sleep(1000);
		s1 = ManagementLocator.readTotalItems().getText();
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
	ManagementLocator.ClosePopRisk().click();			
	Thread.sleep(3000);
	ManagementLocator.ClickDashboard().click();		
	Thread.sleep(3000);
	}

	public static void CategoryOpen( ExtentTest test) throws InterruptedException
	 {
		Thread.sleep(1000);
		ManagementLocator.ARS().click();
		Thread.sleep(3000);


	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("window.scrollBy(0,800)");	
	Thread.sleep(3000);
	//ManagementLocator.ClickArrow().click();	
	//Thread.sleep(4000);
	//ManagementLocator.ClickArrow().click();	
	//Thread.sleep(3000);
	int ProcessInefficiency_Open = Integer.parseInt(ManagementLocator.ProcessInefficiencyOpen().getText());	//Reading value of 'After Due Date'
	ManagementLocator.ProcessInefficiencyOpen().click();								//CLicking on 'Not Completed' count
	
	Thread.sleep(500);
	
	int high = Integer.parseInt(ManagementLocator.readHigh().getText());		//reading High risk count.
	int medium = Integer.parseInt(ManagementLocator.readMedium().getText());	//reading Medium risk count.
	int low = Integer.parseInt(ManagementLocator.readLow().getText());			//reading Low risk count.
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
	
	CategoryWise( test, "High", high);
	Thread.sleep(3000);
	CategoryWise( test, "Medium", medium);
	Thread.sleep(3000);
	CategoryWise( test, "Low", low);
	Thread.sleep(3000);
	
	ManagementLocator.ClickDashboard().click();		
	Thread.sleep(3000);
	 }
	
	public static void CategoryClose( ExtentTest test) throws InterruptedException
	 {

	
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("window.scrollBy(0,500)");	
	
	
	Thread.sleep(2000);
	int ProcessInefficiency_Close = Integer.parseInt(ManagementLocator.ProcessInefficiencyClose().getText());	//Reading value of 'After Due Date'
	ManagementLocator.ProcessInefficiencyClose().click();								//CLicking on 'Not Completed' count
	
	Thread.sleep(5000);
	
	int high = Integer.parseInt(ManagementLocator.readHigh().getText());		//reading High risk count.
	int medium = Integer.parseInt(ManagementLocator.readMedium().getText());	//reading Medium risk count.
	int low = Integer.parseInt(ManagementLocator.readLow().getText());			//reading Low risk count.
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
	
	CategoryWise( test, "High", high);
	Thread.sleep(5000);
	CategoryWise( test, "Medium", medium);
	Thread.sleep(3000);
	CategoryWise( test, "Low", low);
	Thread.sleep(3000);
	ManagementLocator.ClickDashboard().click();		
	Thread.sleep(3000);
	 }
	
	
	public static void CategoryWise( ExtentTest test ,String risk,int riskCount) throws InterruptedException
	 {
		Thread.sleep(1000);
		ManagementLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	if(risk.equalsIgnoreCase("High"))
	{
		ManagementLocator.readHigh().click();						//Clicking on High value of Pie Chart of 'Not Completed'.
	}
	else if(risk.equalsIgnoreCase("Medium"))
	{
		ManagementLocator.readMedium().click();						//Clicking on Medium value of Pie Chart of 'Not Completed'.
	}
	else if(risk.equalsIgnoreCase("Low"))
	{
		ManagementLocator.readLow().click();						//Clicking on Low value of Pie Chart of 'Not Completed'.
	}
	
	Thread.sleep(5000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

	Thread.sleep(5000);
	File dir = new File("C:\\Users\\ambujs\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	
	ManagementLocator.ClickExport().click();		//Exporting (Downloading) file
	
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
	
	//ManagementLocator.CategoryView().click();		change krna hai
	Thread.sleep(3000);
	ManagementLocator.RiskViewClose().click();		
	Thread.sleep(3000);
	
	test.log(LogStatus.PASS,  "  View successfully.");
	
	String s1 = ManagementLocator.readTotalItems().getText();		//Reading total number of items.
	String[] bits = s1.split(" ");									//Splitting the String
	String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
	
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		Thread.sleep(1000);
		s1 = ManagementLocator.readTotalItems().getText();
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
	
	
	/*ManagementLocator.SelectPeriod().click();		
	Thread.sleep(1000);
	ManagementLocator.PeriodAnnually().click();		
	Thread.sleep(3000);
	if(ManagementLocator.ApplyFilter().isEnabled()) {
	ManagementLocator.ApplyFilter().click();		
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "  Filter Working successfully.");
	}else {
		test.log(LogStatus.PASS,  "  Filter not Working");
	}*/
	getDriver().switchTo().parentFrame();
	ManagementLocator.ClosePopRisk().click();		
	
		
	Thread.sleep(3000);
	
	 }
	public static void ProcessHigh( ExtentTest test) throws InterruptedException
	 {
		Thread.sleep(1000);
		ManagementLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("window.scrollBy(0,1300)");	
	Thread.sleep(2000);
	
		int Process_High = Integer.parseInt(ManagementLocator.ProcessHigh().getText());	
		Thread.sleep(2000);
		ManagementLocator.ProcessHigh().click();						
		Thread.sleep(3000);
		int open = Integer.parseInt(ManagementLocator.ProcessOpen().getText());		//reading High risk count.
		Thread.sleep(500);
		int close = Integer.parseInt(ManagementLocator.ProcessClose().getText());	//reading Medium risk count.
		Thread.sleep(500);
		int total = open + close;
		Thread.sleep(500);
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
		
		ProcessCategories( test, "open", open);
		Thread.sleep(3000);
		ProcessCategories( test, "close", close);
		Thread.sleep(3000);
		
		
		ManagementLocator.ClickDashboard().click();		
		Thread.sleep(3000);
	 }
	public static void ProcessMedium( ExtentTest test) throws InterruptedException
	 {
		Thread.sleep(1000);
		ManagementLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("window.scrollBy(0,1300)");	
	Thread.sleep(2000);
	
		int Process_Medium = Integer.parseInt(ManagementLocator.ProcessMedium().getText());	
		Thread.sleep(2000);
		ManagementLocator.ProcessMedium().click();						
		Thread.sleep(3000);
		int open = Integer.parseInt(ManagementLocator.ProcessOpen().getText());		//reading High risk count.
		Thread.sleep(5000);
		int close = Integer.parseInt(ManagementLocator.ProcessClose().getText());	//reading Medium risk count.
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
		
		ProcessCategories( test, "open", open);
		Thread.sleep(3000);
		ProcessCategories( test, "close", close);
		Thread.sleep(3000);
		
		
		ManagementLocator.ClickDashboard().click();		
		Thread.sleep(3000);
	
	
	 }
	
	public static void ProcessLow( ExtentTest test) throws InterruptedException
	 {
		Thread.sleep(1000);
		ManagementLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("window.scrollBy(0,1000)");	
	Thread.sleep(2000);
	
		int Process_Low = Integer.parseInt(ManagementLocator.ProcessLow().getText());	
		Thread.sleep(2000);
		ManagementLocator.ProcessLow().click();						
		Thread.sleep(3000);
		int open = Integer.parseInt(ManagementLocator.ProcessOpen().getText());		//reading High risk count.
		Thread.sleep(5000);
		int close = Integer.parseInt(ManagementLocator.ProcessClose().getText());	//reading Medium risk count.
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
		
		ProcessCategories( test, "open", open);
		Thread.sleep(3000);
		ProcessCategories( test, "close", close);
		Thread.sleep(3000);
		
		
		ManagementLocator.ClickDashboard().click();		
		Thread.sleep(3000);
	
	
	 }
	
	
	public static void ProcessCategories( ExtentTest test ,String Category,int CategoryCount) throws InterruptedException
	 {
		
		Thread.sleep(1000);
		ManagementLocator.ARS().click();
		Thread.sleep(3000);


	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	if(Category.equalsIgnoreCase("open"))
	{
		ManagementLocator.ProcessOpen().click();						//Clicking on High value of Pie Chart of 'Not Completed'.
	}
	else if(Category.equalsIgnoreCase("close"))
	{
		ManagementLocator.ProcessClose().click();						//Clicking on Medium value of Pie Chart of 'Not Completed'.
	}
	
	Thread.sleep(1000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

	Thread.sleep(5000);
	File dir = new File("C:\\Users\\ambuj\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	
	ManagementLocator.ClickExport().click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);
	File dir1 = new File("C:\\Users\\ambuj\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	
	/*if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}*/
	
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
	Thread.sleep(3000);
	
	ManagementLocator.RiskView().click();		
	Thread.sleep(3000);
	ManagementLocator.RiskViewClose().click();		
	Thread.sleep(3000);
	
	test.log(LogStatus.PASS,  "  View successfully.");
	
	String s1 = ManagementLocator.readTotalItems().getText();		//Reading total number of items.
	String[] bits = s1.split(" ");									//Splitting the String
	String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
	
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		Thread.sleep(1000);
		s1 = ManagementLocator.readTotalItems().getText();
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
	
	getDriver().switchTo().parentFrame();
    ManagementLocator.ClosePopRisk().click();		
	
		
	Thread.sleep(3000);
	
	 }
	public static void AgingGreater90(WebDriver driver, ExtentTest test ) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (50));
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
	/*	ManagementLocator.btnminimize(driver).click();						//Clicking on High value of Pie Chart of 'Not Completed'.
		Thread.sleep(1000);
		ManagementLocator.SelectFinancialYear1(driver).click();		
		Thread.sleep(1000);
		ManagementLocator.SelectAll(driver).click();
		Thread.sleep(1000);
		ManagementLocator.SelectAllOk(driver).click();
		Thread.sleep(2000);
		ManagementLocator.ApplyFilters(driver).click();
		Thread.sleep(3000);
		*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");	
		Thread.sleep(3000);
		
		int Aging_90 = Integer.parseInt(ManagementLocator.Click90days(driver).getText());	
		Thread.sleep(2000);
		ManagementLocator.Click90days(driver).click();						
		Thread.sleep(3000);
		
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		ManagementLocator.ClickExport().click();		//Exporting (Downloading) file
		
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
		
		ManagementLocator.RiskView().click();		
		Thread.sleep(3000);
		ManagementLocator.RiskViewClose().click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = ManagementLocator.readTotalItems().getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = ManagementLocator.readTotalItems().getText();
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
	
		driver.switchTo().parentFrame();
		ManagementLocator.ClosePopRisk(driver).click();		
		
			
		Thread.sleep(3000);
		ManagementLocator.ClickDashboard(driver).click();		
		Thread.sleep(3000);
		
		
	 }
	

	public static void AgingNotDue( ExtentTest test ) throws InterruptedException
	 {
		
		Thread.sleep(1000);
		ManagementLocator.ARS().click();
		Thread.sleep(3000);


	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
	
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1800)");	
		Thread.sleep(3000);
		
		int Aging_NotDue = Integer.parseInt(ManagementLocator.ClickNotDue().getText());	
		Thread.sleep(2000);
		ManagementLocator.ClickNotDue().click();						
		Thread.sleep(3000);
		
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		ManagementLocator.ClickExport().click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
		Thread.sleep(3000);
		
		ManagementLocator.RiskView().click();		
		Thread.sleep(3000);
		ManagementLocator.RiskViewClose().click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = ManagementLocator.readTotalItems().getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = ManagementLocator.readTotalItems().getText();
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
		ManagementLocator.ClosePopRisk().click();		
		
			
		Thread.sleep(3000);
		ManagementLocator.ClickDashboard().click();		
		Thread.sleep(3000);
	 }
	public static void AuditCommitteeOpen( ExtentTest test ) throws InterruptedException
	 {
		Thread.sleep(1000);
		ManagementLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
	
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,2300)");	
		Thread.sleep(3000);
		
		int AuditCommittee_Open = Integer.parseInt(ManagementLocator.AuditCommitteeOpen().getText());	
		Thread.sleep(2000);
		ManagementLocator.AuditCommitteeOpen().click();						
		Thread.sleep(3000);
		
		
		Thread.sleep(5000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(3000);
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		ManagementLocator.ClickExport().click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
		Thread.sleep(3000);
		
		ManagementLocator.RiskView().click();		
		Thread.sleep(3000);
		ManagementLocator.RiskViewClose().click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = ManagementLocator.readTotalItems().getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = ManagementLocator.readTotalItems().getText();
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
		ManagementLocator.ClosePopRisk().click();		
		
			
		Thread.sleep(3000);
		ManagementLocator.ClickDashboard().click();		
		Thread.sleep(3000);
	 }
	
	public static void Aging90to180days(WebDriver driver, ExtentTest test ) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (50));
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
	/*	ManagementLocator.btnminimize(driver).click();						//Clicking on High value of Pie Chart of 'Not Completed'.
		Thread.sleep(1000);
		ManagementLocator.SelectFinancialYear1(driver).click();		
		Thread.sleep(1000);
		ManagementLocator.SelectAll(driver).click();
		Thread.sleep(1000);
		ManagementLocator.SelectAllOk(driver).click();
		Thread.sleep(2000);
		ManagementLocator.ApplyFilters(driver).click();
		Thread.sleep(3000);
		*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");	
		Thread.sleep(3000);
		
		int Aging_90to180 = Integer.parseInt(ManagementLocator.Aging90to180days(driver).getText());	
		Thread.sleep(2000);
		ManagementLocator.Aging90to180days(driver).click();						
		Thread.sleep(3000);
		
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		ManagementLocator.ClickExport().click();		//Exporting (Downloading) file
		
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
		
		ManagementLocator.RiskView().click();		
		Thread.sleep(3000);
		ManagementLocator.RiskViewClose().click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = ManagementLocator.readTotalItems().getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = ManagementLocator.readTotalItems().getText();
			bits = s1.split(" ");										//Splitting the String
			itomsCount = bits[bits.length - 2];
		}
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			itomsCount = "0";
		}
		int count1 = Integer.parseInt(itomsCount);
		
		if(count1 == Aging_90to180)
		{
			test.log(LogStatus.PASS, "'  Aging_90to180 days Aging Count matches to number of items from grid.");
			test.log(LogStatus.PASS, "'  Aging_90to180 days Dashboard  Count = "+ Aging_90to180 + " | Total no of items from grid = "+ count1);
		}
		else
		{
			test.log(LogStatus.FAIL, "'  Aging_90to180 days Aging Count doesn't matches to number of items from grid.");
			test.log(LogStatus.FAIL, "'  Aging_90to180 days Dashboard Count = "+ Aging_90to180 + " | Total no of items from grid = "+ count1);
		}
		
		Thread.sleep(1000);
	
		driver.switchTo().parentFrame();
		ManagementLocator.ClosePopRisk(driver).click();		
		
			
		Thread.sleep(3000);
		ManagementLocator.ClickDashboard(driver).click();		
		Thread.sleep(3000);
		
		
	 }

	public static void AuditCommitteeClose( ExtentTest test ) throws InterruptedException
	 {
		Thread.sleep(1000);
		ManagementLocator.ARS().click();
		Thread.sleep(3000);

	WebDriverWait wait = new WebDriverWait( getDriver(),(60));
	Thread.sleep(3000);
	getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
	
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,2300)");	
		Thread.sleep(3000);
		
		int AuditCommittee_close = Integer.parseInt(ManagementLocator.AuditCommitteeClose().getText());	
		Thread.sleep(2000);
		ManagementLocator.AuditCommitteeClose().click();						
		Thread.sleep(3000);
		
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		ManagementLocator.ClickExport().click();		//Exporting (Downloading) file
		
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
		
		ManagementLocator.RiskView().click();		
		Thread.sleep(3000);
		ManagementLocator.RiskViewClose().click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = ManagementLocator.readTotalItems().getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = ManagementLocator.readTotalItems().getText();
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
		ManagementLocator.ClosePopRisk().click();		
		
			
		Thread.sleep(3000);
		ManagementLocator.ClickDashboard().click();		
		Thread.sleep(3000);
	 }
	public static void observationlist( ExtentTest test ) throws InterruptedException
	 {
		Thread.sleep(1000);
		ManagementLocator.ARS().click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		ManagementLocator.clickobservationlist().click();
		  Thread.sleep(3000);
		  ManagementLocator.clickunit().click();
		  Thread.sleep(3000);  
		  ManagementLocator.clickselectunit().click();
		  Thread.sleep(3000);
		  ManagementLocator.clickfinancialyear().click();
		  Thread.sleep(3000);
		  ManagementLocator.clickselectfinancialyear().click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List Audit Filters work successfully.");
		  ManagementLocator.clickviewbutton().click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List View Button work successfully.");
		  ManagementLocator.clickprocess1().click();
		  Thread.sleep(3000);
		  ManagementLocator.clickselectprocess1().click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List Audit Dashboard Filters work successfully.");
		  ManagementLocator.clickbackbutton().click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List Audit Back Button work successfully.");
		  ManagementLocator.clickauditstataus().click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List Audit Status Button work successfully.");
		  ManagementLocator.clickbackbutton1().click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List Audit Status Back Button work successfully.");
		  ManagementLocator.clickimplementation().click();
		  Thread.sleep(3000);
		  ManagementLocator.clickunit().click();
		  Thread.sleep(3000);  
		  ManagementLocator.clickselectunit1().click();
		  Thread.sleep(3000);
		  ManagementLocator.clickfinancialyear().click();
		  Thread.sleep(3000);
		  ManagementLocator.clickselectfinancialyear().click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List Implimentation Dashboard Filters work successfully.");
		  ManagementLocator.clickviewbutton1().click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List Implementation View Button work successfully.");
		  getDriver().switchTo().frame(ManagementLocator.clickframe1()); // i frame enter krne krne k liye
		  Thread.sleep(7000);
		  ManagementLocator.clickmanagementresponse().sendKeys("management Response done");
		  Thread.sleep(3000);
		  //ManagementLocator.clicksubmittohigherlevel().click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation submitted successfully to next level.");
		  getDriver().switchTo().parentFrame();
		  ManagementLocator.clickclosed1().click();
		  Thread.sleep(3000);
		 // ManagementLocator.clickimplementstatus().click();
		 // Thread.sleep(3000);
		
		  
	 }
	
	public static void MyReport( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
	{
		Thread.sleep(9000);
		
		ManagementLocator.ARS().click();
		Thread.sleep(3000);
	
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		Thread.sleep(2000);
		
		ManagementLocator.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(4000);
        
	//	Method1.MyReportFilter(,test,workbook);
	//	Thread.sleep(4000);
		
        ManagementLocator.FinalAudit().click();					                //Clicking on Dashboard count
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
		
		Thread.sleep(4000);
		ManagementLocator.AllFileDownloadButton5().click();
		
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
		ManagementLocator.MyReport().click();					                
        Thread.sleep(4000);
        
		ManagementLocator.OpenObservation().click();					                //Clicking on Dashboard count
        Thread.sleep(4000);
 
        File dirf = new File("C:\\Users\\ambujs\\Downloads");
		File[] dirContentsf = dirf.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(4000);
		ManagementLocator.OpenObservationExport().click();
		
	 	Thread.sleep(9000);
		File dird = new File("C:\\Users\\ambujs\\Downloads");
		File[] allFilesNewd = dird.listFiles();						//Counting number of files in directory after download
	  
       Thread.sleep(3000);
	   if (dirContentsf.length < allFilesNewd.length) {
			test.log(LogStatus.PASS,  "Open Observation - Report Downloaded Successfully");
		}
	   else
	   {
		 	test.log(LogStatus.FAIL, " Open Observation - Report Does Not Downloaded Successfully "   );

		}   
	   Thread.sleep(4000);

        
        
	}
	
	
	public static void MyReportObservationReportFilter( ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
		
		
       Thread.sleep(4000);
       
       ManagementLocator.ARS().click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait( getDriver(),(60));
		
		ManagementLocator.MyReport().click();					                //Clicking on Dashboard count
        Thread.sleep(3000);
        
        ManagementLocator.OpenObservation().click();					                //Clicking on Dashboard count
        Thread.sleep(5000);
                
        ManagementLocator.MROpenObservationCompany().click();
		 Thread.sleep(3000);
	     String CompanyText =ManagementLocator.MROpenObservationCompanyDD().getText();
	     Thread.sleep(2000);
	     ManagementLocator.MROpenObservationCompanyDD().click();
		 Thread.sleep(20000);
		 
		 ManagementLocator.FinancialYearMReport().click();
		 Thread.sleep(3000);
		 String FinancialyearText =ManagementLocator.FinancialYearMReportDD().getText();
		 Thread.sleep(2000);
		 ManagementLocator.FinancialYearMReportDD().click();
		 Thread.sleep(20000);
		 
		 ManagementLocator.SelectSchedulingType().click();
	     Thread.sleep(2000);
	     ManagementLocator.SelectSchedulingTypeDD().click();
		 Thread.sleep(20000);
		 
		 ManagementLocator.Period().click();
		 Thread.sleep(3000);
		 String PeriodText =ManagementLocator.PeriodDD().getText();
		 Thread.sleep(2000);
		 ManagementLocator.PeriodDD().click();
		 Thread.sleep(20000);
		
		 ManagementLocator.Status().click();
		 Thread.sleep(3000);
		 String StatusText =ManagementLocator.StatusDD().getText();
		 Thread.sleep(2000);
		 ManagementLocator.StatusDD().click();
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

			Thread.sleep(5000);

	}

}
