package newauditproject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class auditmetod {

	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;
	public static WebDriver driver=null;
	public static Row row=null;
	public static Cell cell=null;
	public static void Login() throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver","D://eclipse-workspace//Audit//chromedriver_win32//chromedriver.exe"); 
		  
		  driver=new ChromeDriver();       //Created new Chrome driver instance.
		  Thread.sleep(3000);
		
		  driver.manage().window().maximize();
		  fis = new FileInputStream("C://Users//ambuj//Desktop//automation//auditexcelsheet.xlsx");
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			Row row0 = sheet.getRow(0);				//Selected 0th index row (First row)
			Cell c1 = row0.getCell(1);					//Selected cell (0 row,1 column)
			String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
			 driver.get(URL);
			 Row row1 = sheet.getRow(1);		        //Selected 1st index row (Second row)
				c1 = row1.getCell(1);					//Selected cell (1 row,1 column)
		    String uname = c1.getStringCellValue();	
			auditlocators.setUname(driver).sendKeys(uname);
			Row row2 = sheet.getRow(2);		               //Selected 2nd index row (Third row)
	        c1 = row2.getCell(1);		                      //Selected cell (2 row,1 column)
		    String password = c1.getStringCellValue();
		    auditlocators.setPass(driver).sendKeys(password);
		    auditlocators.clicksumit(driver).click();
		    auditlocators.clicksequrity(driver).click();
		    Thread.sleep(5000);
		    
		   // auditlocators.setquestion1(driver).sendKeys("123");
		    auditlocators.setquestion1(driver).sendKeys("123");
		    Thread.sleep(3000);
		    auditlocators.setquestion2(driver).sendKeys("123");
			  Thread.sleep(3000);
			  auditlocators.clickbtnvalidate(driver).click();
			  Thread.sleep(3000);
			  auditlocators.clickars(driver).click();
			  
	}
	
	
	public static void Master()throws InterruptedException {
		
		auditlocators.clickMaster(driver).click();
		 Thread.sleep(3000);
		 
			auditlocators.clickUserMaster(driver).click();
			 Thread.sleep(3000);
			 
			 auditlocators.clickaddnew(driver).click();
			 Thread.sleep(5000);
			 
			 
			 Row row4=sheet.getRow(4);
			 Cell c1=row4.getCell(1);
			  String firstName = c1.getStringCellValue();	
				auditlocators.setfirstname(driver).sendKeys(firstName);
				 Thread.sleep(2000);
				 
				 Row row5=sheet.getRow(5);
				 c1=row5.getCell(1);
				 String lastName = c1.getStringCellValue();	
				 auditlocators.setlastname(driver).sendKeys(lastName);
				 
				 Row row6=sheet.getRow(6);
				 c1=row6.getCell(1);
				 String desigNation = c1.getStringCellValue();	
				 auditlocators.setdesignation(driver).sendKeys(desigNation);
				 
				 Row row7 = sheet.getRow(7);		               
			     c1 = row7.getCell(1);	
			     String emailId = c1.getStringCellValue();	
			     auditlocators.setemail(driver).sendKeys(emailId);
				 
				 
				 Row row8 = sheet.getRow(8);		               
			     c1 = row8.getCell(1);
			     int contactNo= (int)c1.getNumericCellValue();
			     auditlocators.setcontactno(driver).sendKeys( contactNo+"");
			     Thread.sleep(3000);
			     
			     auditlocators.clickdepartment(driver).click();
				 Thread.sleep(3000);
				 
				 auditlocators.clickchoosedepartment(driver).click();
				 Thread.sleep(3000);
				
				 
				 auditlocators.clickrole(driver).click();
				 Thread.sleep(3000);
				 
				 auditlocators.clickchooserole(driver).click();
				 Thread.sleep(3000);
				 
				 JavascriptExecutor js=(JavascriptExecutor) driver ;
					js.executeScript("window.scroll(0,500)");
					Thread.sleep(3000);
					
					 auditlocators.clicksavebtn(driver).click();
					 Thread.sleep(3000);
					 
					 auditlocators.clickcancelbtn(driver).click();
					 Thread.sleep(3000);
					 
					 auditlocators.clicksearch(driver).sendKeys("nancy",Keys.ENTER);
					
					 //auditlocators.setfilter(driver).sendKeys("nancy",Keys.ENTER);
					    Thread.sleep(3000);
					    
					    //auditlocators.setfirstname1(driver).sendKeys("samar");
					   // Thread.sleep(3000);
					    
					    
					    auditlocators.clickeditbtn(driver).click();
						 Thread.sleep(3000);
						 //firstname.clear();
						 
						 auditlocators.clickbtnsave(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickbtncancel(driver).click();
						 Thread.sleep(3000);
						 
						  auditlocators.clickremovebtn(driver).click();
						  Thread.sleep(3000);
							// auditlocators.clickremovebtn(driver).alert().accept();
							 driver.switchTo().alert().accept();

							 Thread.sleep(3000);

							 auditlocators.clickpasswordbtn(driver).click();
							 Thread.sleep(3000);
							 driver.switchTo().alert().accept();
							 Thread.sleep(3000);
	}

							
	
public static void unitMaster()throws InterruptedException {
	
	auditlocators.clickMaster(driver).click();
	 Thread.sleep(3000);
	 
		auditlocators.clickunitmaster(driver).click();
		 Thread.sleep(3000);
		 
		 auditlocators.clickaddnewbtn(driver).click();
		 Thread.sleep(5000);
		 
		 Row row10=sheet.getRow(10);
		 Cell c1=row10.getCell(1);
		  String Name = c1.getStringCellValue();	
			auditlocators.setname(driver).sendKeys(Name);
			 Thread.sleep(2000);
			 
			  auditlocators.clickunittype(driver).click();
				 Thread.sleep(3000);
				 
				 auditlocators.clickchooseunittype(driver).click();
				 Thread.sleep(3000);
				 
				 Row row11=sheet.getRow(11);
				 c1=row11.getCell(1);
				  String Address = c1.getStringCellValue();	
					auditlocators.setnaddress(driver).sendKeys(Address);
					 Thread.sleep(2000);
					 
					 auditlocators.clickstate(driver).click();
					 Thread.sleep(3000);
					 
					 auditlocators.clickchoosestate(driver).click();
					 Thread.sleep(3000);
					 
					 auditlocators.clickcity(driver).click();
					 Thread.sleep(3000);
					 
					 auditlocators.clickchoosecity(driver).click();
					 Thread.sleep(3000);
					 
					 Row row12=sheet.getRow(12);
					 c1=row12.getCell(1);
					  String contactperson = c1.getStringCellValue();	
						auditlocators.setcontact(driver).sendKeys(contactperson);
						 Thread.sleep(2000);
						 
						 Row row13=sheet.getRow(13);
						 c1=row13.getCell(1);
						  String emailid = c1.getStringCellValue();	
							auditlocators.setemailid(driver).sendKeys(emailid);
							 Thread.sleep(2000);
						 
						 auditlocators.clickstatus(driver).click();
						 Thread.sleep(3000);
						 auditlocators.clickchoosestatus(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clicksavebuttn(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickcancelbuttn(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickcupdateunit(driver).click();
						 Thread.sleep(3000);
						 //auditlocators.clickfirstnameedit(driver).click();
						
						 auditlocators.clickfirstnameedit(driver).clear();
						 Thread.sleep(3000);
						 Row row14=sheet.getRow(14);
						  c1=row14.getCell(1);
						  String firstNameenter = c1.getStringCellValue();	
							auditlocators.clickfirstnameenter(driver).sendKeys(firstNameenter);
							 Thread.sleep(2000);
						 JavascriptExecutor js=(JavascriptExecutor) driver ;
					 		js.executeScript("window.scroll(0,500)");
					 		Thread.sleep(3000);
					 		
						 
						 auditlocators.clicksavebutton(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickcancelbutton(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickexporttoexcelbtn(driver).click();
						 Thread.sleep(3000);
						 auditlocators.clicksearch(driver).sendKeys("manan",Keys.ENTER);
						 auditlocators.clicksubunit(driver).click();
						 Thread.sleep(3000);
						 auditlocators.clickaddnewunit(driver).click();
						 Thread.sleep(3000);
						 Row row16=sheet.getRow(16);
						 c1=row16.getCell(1);
						  String name1 = c1.getStringCellValue();	
							auditlocators.setname(driver).sendKeys(name1);
							 Thread.sleep(2000);
						 
						 auditlocators.clickunit1(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickselect1(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickaddress1(driver).click();
						 Thread.sleep(3000);
						 Row row17=sheet.getRow(17);
						 c1=row17.getCell(1);
						  String address1 = c1.getStringCellValue();	
							auditlocators.clickaddress1(driver).sendKeys(address1);
							 Thread.sleep(2000);
						 
						 auditlocators.clickstate1(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickselectstate1(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickcity1(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickselectcity1(driver).click();
						 Thread.sleep(3000);
						 	 
							auditlocators.clickcontactno1(driver).click();
							 Thread.sleep(3000);
							 Row row18=sheet.getRow(18);
							 c1=row18.getCell(1);
							  String contactno = c1.getStringCellValue();	
								auditlocators.clickcontactno1(driver).sendKeys(contactno);
								 Thread.sleep(2000);
							 
								 auditlocators.clickemail1(driver).click();
								 Thread.sleep(3000);
								 Row row19=sheet.getRow(19);
								 c1=row19.getCell(1);
								  String email1 = c1.getStringCellValue();	
									auditlocators.clickemail1(driver).sendKeys(email1);
									 Thread.sleep(2000);
									 
									 auditlocators.clickstatus1(driver).click();
									 Thread.sleep(3000);
									 auditlocators.clickselectstatus1(driver).click();
									 Thread.sleep(3000);
									 auditlocators.clickbtnsave1(driver).click();
									 Thread.sleep(3000);
									 auditlocators.clickbtncancel1(driver).click();
									 Thread.sleep(3000);
									 auditlocators.clickfilter(driver).click();
									 Thread.sleep(3000);
									 auditlocators.clickfilter(driver).clear();
									 Thread.sleep(3000);
									
									
}
public static void business()throws InterruptedException {
	auditlocators.clickMaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickprocess(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickprocessadd(driver).click();
	 Thread.sleep(3000);
	 
	 auditlocators.clickproname(driver).click();
	 Thread.sleep(3000);
	 Row row21=sheet.getRow(21);
	 Cell c1=row21.getCell(1);
	  String proname = c1.getStringCellValue();	
		auditlocators.clickproname(driver).sendKeys(proname);
		 Thread.sleep(2000);
		 auditlocators.clickprosave(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clickprocancel(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clickproedit(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clickpronamedit(driver).clear();
		 Thread.sleep(3000);
		 Row row22=sheet.getRow(22);
		  c1=row22.getCell(1);
		  String pronamedit = c1.getStringCellValue();	
			auditlocators.clickpronamedit(driver).sendKeys(pronamedit);
			 Thread.sleep(2000);
			 auditlocators.clickprocsave(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clickprocclose(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicksubproce(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicksubproceadd(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicksubprocename(driver).click();
			 Thread.sleep(3000);
			 Row row23=sheet.getRow(23);
			  c1=row23.getCell(1);
			  String subprocename = c1.getStringCellValue();	
				auditlocators.clicksubprocename(driver).sendKeys(subprocename);
				 Thread.sleep(2000);
			 auditlocators.clicksubprocesave(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicksubprocecancel(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicksubprocedit(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicksubprocecname(driver).clear();
			 Thread.sleep(3000);
			 Row row24=sheet.getRow(24);
			  c1=row24.getCell(1);
			  String subprocecname = c1.getStringCellValue();	
				auditlocators.clicksubprocecname(driver).sendKeys(subprocecname);
				 Thread.sleep(2000);
			 auditlocators.clickprocecnamsave(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clickprocecnamcancel(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clickaddactivity(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clickaddnewactivity(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicknameactivity(driver).click();
			 Thread.sleep(3000);
			 Row row25=sheet.getRow(25);
			  c1=row25.getCell(1);
			  String nameactivity = c1.getStringCellValue();	
				auditlocators.clicknameactivity(driver).sendKeys(nameactivity);
				 Thread.sleep(2000);
				 auditlocators.clicksaveactivitybtn(driver).click();
				 Thread.sleep(3000);
				 auditlocators.clickcancelactivitybtn(driver).click();
				 Thread.sleep(3000);
				 auditlocators.clickeditactivity(driver).click();
				 Thread.sleep(3000);
				 auditlocators.clickeditactivityname(driver).clear();
				 Thread.sleep(3000);
				 Row row26=sheet.getRow(26);
				  c1=row26.getCell(1);
				  String editactivityname = c1.getStringCellValue();	
					auditlocators.clickeditactivityname(driver).sendKeys(editactivityname);
					 Thread.sleep(2000);
					 auditlocators.clickeditsaveactivity(driver).click();
					 Thread.sleep(3000);
					 auditlocators.clickeditcancelactivity(driver).click();
					 Thread.sleep(3000);
}
public static void department()throws InterruptedException {
	 auditlocators.clickMaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickdeparmentmaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickdeparmentadd(driver).click();
	 Thread.sleep(3000);
	 	auditlocators.clickdeparmentname(driver).click();
		 Thread.sleep(2000);
		 Row row27=sheet.getRow(27);
		  Cell c1=row27.getCell(1);
		  String deparmentname = c1.getStringCellValue();
		  auditlocators.clickdeparmentname(driver).sendKeys(deparmentname);
			 Thread.sleep(2000);
		 auditlocators.clickdeparmentsave(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clickdeparmentcancel(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clickdeparmentedit(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clickdeparmenteditname(driver).clear();
		 Thread.sleep(3000);
		 Row row28=sheet.getRow(28);
		  c1=row28.getCell(1);
		  String deparmenteditname = c1.getStringCellValue();	
			auditlocators.clickdeparmenteditname(driver).sendKeys(deparmenteditname);
			 Thread.sleep(2000);
			 auditlocators.clickdeparmenteditsave(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clickdeparmenteditcancel(driver).click();
			 Thread.sleep(3000);
}
public static void observation(ExtentTest test)throws InterruptedException {
	 auditlocators.clickMaster(driver).click();
	 Thread.sleep(3000);
	// auditlocators.clickobservation(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickobservation(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickobservationadd(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickobservationname(driver).click();
	 Thread.sleep(2000);
	 Row row30=sheet.getRow(30)				;
	 Cell c1=row30.getCell(1);
	  String observationname = c1.getStringCellValue();	
	  auditlocators.clickobservationname(driver).sendKeys(observationname);
		 Thread.sleep(2000);
		 auditlocators.clickobservationsave(driver).click();
		 Thread.sleep(3000);
		 String messg=auditlocators.clickobservationsubcategorymessage(driver).getText();
			if(messg.equalsIgnoreCase("Observation Category Save Successfully.")) 
			{
				test.log(LogStatus.PASS, "Observation Category Save Successfully.");
			}
			else
			{
				test.log(LogStatus.FAIL, "Observation category already exist");
			}
		 auditlocators.clickobservationcancel(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clickobservationedit(driver).click();
		 Thread.sleep(5000);
		 auditlocators.clickobservationeditname(driver).clear();
		 Thread.sleep(4000);
		 Row row31=sheet.getRow(31);
		  c1=row31.getCell(1);
		  String observationeditname = c1.getStringCellValue();	
			auditlocators.clickobservationeditname(driver).sendKeys(observationeditname);
			 Thread.sleep(5000);
			 auditlocators.clickobservationeditsave(driver).click();
			 Thread.sleep(3000);
			 String msg=	 auditlocators.clickobservationsubcategoryeditmessage(driver).getText();
			if(msg.equalsIgnoreCase("Observation Category Updated Successfully.")) 
			{
				test.log(LogStatus.PASS, "Observation category created Succesfully");
			}
			else
			{
				test.log(LogStatus.FAIL, "Observation category already exist");
			}
			 Thread.sleep(3000);
			 auditlocators.clickobservationeditcancel(driver).click();
			 Thread.sleep(5000);
			 
			auditlocators.clicksubobservation1(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicksubobservationadd(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicksubobservationname(driver).click();
			 Thread.sleep(2000);
			 Row row32=sheet.getRow(32);
			  c1=row32.getCell(1);
			  String subobservationname = c1.getStringCellValue();	
			  auditlocators.clicksubobservationname(driver).sendKeys(subobservationname);
				 Thread.sleep(2000);
				 auditlocators.clicksubobservationsave(driver).click();
				 Thread.sleep(3000);
				 auditlocators.clickobservationcancel(driver).click();
				 Thread.sleep(3000); 
				 auditlocators.clicksubobservationedit(driver).click();
				 Thread.sleep(5000);
				 auditlocators.clicksubobservationeditname(driver).clear();
				 Thread.sleep(3000);
				 Row row33=sheet.getRow(33);
				  c1=row33.getCell(1);
				  String subobservationeditname = c1.getStringCellValue();	
					auditlocators.clicksubobservationeditname(driver).sendKeys(subobservationeditname);
					 Thread.sleep(2000);
					 auditlocators.clicksubobservationeditsave(driver).click();
					 Thread.sleep(3000);
				String mesg=auditlocators.clickobservationmessagedisplay(driver).getText();
					if(mesg.equalsIgnoreCase("Observation Sub-Category Updated Successfully.")) 
					{
						test.log(LogStatus.PASS, "Observation category ureated Successfully");
					}
					else
					{
						test.log(LogStatus.FAIL, "Observation category already exist");
					}
					 Thread.sleep(3000);
					 auditlocators.clicksubobservationeditcancel(driver).click();
					 Thread.sleep(3000);
					 auditlocators.clicksubobservationbackbutton(driver).click();
					 Thread.sleep(3000);
					 
}

public static void riskcategory(ExtentTest test)throws InterruptedException {
	 auditlocators.clickMaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickriskcategory(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickriskcategoryadd(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickriskcategoryname(driver).click();
	 Thread.sleep(3000);
	 Row row35=sheet.getRow(35);
	 Cell c1=row35.getCell(1);
	  String riskcategoryname = c1.getStringCellValue();	
	  auditlocators.clickriskcategoryname(driver).sendKeys(riskcategoryname);
		 Thread.sleep(2000);
		 auditlocators.clickriskcategorysave(driver).click();
		 Thread.sleep(3000);
		 String msg=	 auditlocators.clickriskcategorymessage(driver).getText();
			if(msg.equalsIgnoreCase("Risk Category Successfully Add")) 
			{
				test.log(LogStatus.PASS, "Risk Category Update Successfully");
			}
			else
			{
				test.log(LogStatus.FAIL, "Category name already exists.");
			}
			 Thread.sleep(3000);
		 auditlocators.clickriskcategorycancel(driver).click();
		 Thread.sleep(3000); 
		 auditlocators.clickriskcategorysearchbox(driver).sendKeys("major",Keys.ENTER);
		 Thread.sleep(3000); 
		 auditlocators.clickriskcategoryedit(driver).click();
		 Thread.sleep(3000); 
		 auditlocators.clickriskcategoryeditname(driver).clear();
		 Thread.sleep(3000);
		 Row row36=sheet.getRow(36);
		  c1=row36.getCell(1);
		  String riskcategoryeditname = c1.getStringCellValue();	
			auditlocators.clickriskcategoryeditname(driver).sendKeys(riskcategoryeditname);
			 Thread.sleep(2000);
			 auditlocators.clickriskcategoryeditsave(driver).click();
			 Thread.sleep(3000);
			 String mesge=	 auditlocators.clickriskcategorymessage(driver).getText();
				if(msg.equalsIgnoreCase("Risk Category Update Successfully")) 
				{
					test.log(LogStatus.PASS, "Risk Category Update Successfully");
				}
				else
				{
					test.log(LogStatus.FAIL, "Category name already exists.");
				}
				 Thread.sleep(3000);
			// test.log(LogStatus.PASS, "Risk category created Succesfully");
			 auditlocators.clickriskcategoryeditcancel(driver).click();
			 Thread.sleep(3000); 
			 auditlocators.clickriskcategoryfilter(driver).clear();
			 Thread.sleep(3000);
}
}
