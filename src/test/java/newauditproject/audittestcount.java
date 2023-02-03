package newauditproject;
import java.io.IOException;
import java.lang.module.ModuleDescriptor.Exports;

import javax.naming.ldap.ExtendedRequest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class audittestcount {
	public static ExtentReports extent;
	public static ExtentTest test;
	
		public static WebDriver driver =null;

		@BeforeTest
		
		void Login1() throws InterruptedException, IOException {
			extent=new com.relevantcodes.extentreports.ExtentReports("C://Users//ambuj//eclipse-workspace//Arsproduct//Report//Auditresult.html",true);
			test=extent.startTest("login succesfully");
			
			auditmetod.Login();
			test.log(LogStatus.PASS, "Login Successfully");
			extent.endTest(test);
			extent.flush();
			
		}
		
		
		/*@Test(priority=1)
		void master() throws InterruptedException {
		test=extent.startTest("user created successfully");	
		auditmetod.Master();
			extent.endTest(test);
			extent.flush();
		}
	@Test(priority=2)
	void unitMaster() throws InterruptedException {
	
		auditmetod.unitMaster();
	test.log(LogStatus.PASS, "unit created Successfully");
		extent.endTest(test);
		extent.flush();
	
	}
	@Test(priority=3)
	void business() throws InterruptedException {
		auditmetod.business();
		test.log(LogStatus.PASS, "Process created Successfully");
		extent.endTest(test);
		extent.flush();
	
	}
	
	@Test(priority=4) 
	void department() throws InterruptedException {
	test=extent.startTest("Master-department");
		auditmetod.department();
		extent.endTest(test);
		extent.flush();
	
	}*/

		@Test(priority=6)
		void observation() throws InterruptedException {
		test=extent.startTest("Master-observation category");
			auditmetod.observation(test);
			extent.endTest(test);
			extent.flush();
		
		}	
	
		@Test(priority=5)
		void riskcategory() throws InterruptedException {
			test=extent.startTest("Master-risk category");
			auditmetod.riskcategory(test);
			extent.endTest(test);
			extent.flush();
		
}
}


