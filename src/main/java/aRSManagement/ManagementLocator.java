package aRSManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import login.BasePage;

public class ManagementLocator extends BasePage{
	
	
	
private static WebElement ars = null;
private static WebElement ARS = null;


public static WebElement ARS() {
	
	ARS=getDriver().findElement(By.xpath("//div[@id='dvbtnAudit']"));
	return ARS;
}

	
	public static WebElement clickARS()		//Method for closing Message Popup
	{
		ars = getDriver().findElement(By.xpath("//*[@id='dvbtnAudit']"));
		return ars;
	}
	public static WebElement ClickHighOpen()		
	{
		ars = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"));
		return ars;
	}

	public static WebElement FinanceAccountsHigh()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
				return ars;                                          
	}
					
	public static WebElement ClickExport()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='lbtnExportExcel']"));
				return ars;
	}
			
	public static WebElement RiskView()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody/tr[1]/td[8]/a"));
				return ars;                      
	}
			
	public static WebElement RiskViewClose()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
				return ars;
	}
			
	public static WebElement readTotalItems()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ObservationDetailsGrid']/div[3]/span"));
				return ars;
	}
			
	public static WebElement SelectPeriod()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ddlPeriodMultiSelect_sl']"));
				return ars;
	}
	public static WebElement Aging90to180days (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[8]"));
						return ars;
	}
	
	public static WebElement PeriodAnnually()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ddlPeriodMultiSelect_0']"));
				return ars;
	}
	
	public static WebElement ApplyFilter()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='btnFilter']"));
				return ars;
	}
	
	public static WebElement ClosePopRisk()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='DivReports']/div/div/div[1]/button"));
				return ars;
	}
	
	public static WebElement ClickBack()		
	{
				ars = getDriver().findElement(By.xpath("//*[@class='highcharts-button highcharts-drillup-button highcharts-button-normal']"));
				return ars;
	}
	
	public static WebElement ClickBack1()		
	{
				ars = getDriver().findElement(By.linkText("< Back"));
				return ars;
	}
	
	public static WebElement ClickHighClose()		
	{
				ars = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"));
				return ars;
	}
	public static WebElement ClickDashboard()		
	{
		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[2]"));
		return ars;
	}
	public static WebElement ClickMediumOpen()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label'])[2]"));
				return ars;
	}
	
	public static WebElement ClickMediumClose()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label'])[2]"));
				return ars;
	}
	public static WebElement ClickLowOpen()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label'])[3]"));
				return ars;
	}
	
	public static WebElement ClickLowClose()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label'])[3]"));
				return ars;
	}
	public static WebElement ProcessInefficiencyClose()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label'])[6]"));
				return ars;
	}
	
	public static WebElement ProcessInefficiencyOpen()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label'])[6]"));
				return ars;
	}
	
	public static WebElement readHigh()		
	{
				ars = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined ']"));
				return ars;
	}
	
	public static WebElement readMedium()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
				return ars;
	}
	
	public static WebElement readLow()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[3]"));
				return ars;
	}
	
	public static WebElement CategoryView()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody/tr/td[9]/a"));
				//*[@id="ObservationDetailsGrid"]/div[2]/table/tbody/tr/td[9]/a
				return ars;
	}
	public static WebElement ProcessLow ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label']"));
				return ars;
	}
	
	public static WebElement ProcessMedium ()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label'])[10]"));
				return ars;
	}
	
	public static WebElement ProcessHigh ()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label'])[13]"));
				return ars;
	}
	public static WebElement ProcessOpen ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined ']"));
				return ars;
	}
	
	public static WebElement ProcessClose ()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
				return ars;
	}
	public static WebElement btnminimize ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='DivFilters']/div/div/div/div[1]/div/a[1]/i"));
				return ars;
	}
	
	public static WebElement SelectFinancialYear1 ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYearMultiSelect_sl']"));
				return ars;
	}
	
	public static WebElement SelectAll ()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@id='checks']/span[1]/input)[6]"));
				return ars;
	}
	
	public static WebElement SelectAllOk ()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@id='buttons']/input[1])[6]"));
				return ars;
	}
	
	public static WebElement ApplyFilters ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnFilter']"));
				return ars;
	}
	
	public static WebElement RightArrow ()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class=' highcharts-button-box'])[6]"));
				return ars;
	}
	
	public static WebElement Categoryname ()		
	{
				ars = getDriver().findElement(By.cssSelector("#highcharts-0 > svg > g.highcharts-axis-labels.highcharts-xaxis-labels > text:nth-child(23) > tspan"));
				
				return ars;
	}
	public static WebElement Click90days (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
				return ars;
	}
	
	public static WebElement ClosePopRisk(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='DivReports']/div/div/div[1]/button"));
				return ars;
	}
	
	public static WebElement ClickDashboard(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[1]"));
		return ars;
	}
	
	public static WebElement ClickNotDue ()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[7]"));;
				return ars;
	}
	public static WebElement AuditCommitteeOpen ()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 '])[2]"));
				return ars;
	}
	public static WebElement AuditCommitteeClose ()		
	{
				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 '])[2]"));
				return ars;
	}
	public static WebElement AuditTrackerPlanned ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditTrackerSummary']/tbody/tr[2]/td[2]"));
				return ars;
	}
	public static WebElement clickobservationlist ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[3]/a"));
				return ars;
				
	}
	public static WebElement clickunit ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
				//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/a
				return ars;			
	}
	public static WebElement clickselectunit ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[11]"));
				//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[11]
				return ars;			
	}
	public static WebElement clickfinancialyear ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']"));
				return ars;			
	}
	public static WebElement clickselectfinancialyear ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/div/ul/li[15]"));
				return ars;			
	}
	public static WebElement clickviewbutton ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lnkviewAudit_0']/img"));
				return ars;			
	}
	public static WebElement clickprocess1 ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']"));
				return ars;			
	}
	public static WebElement clickselectprocess1 ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']/div/ul/li[2]"));
				return ars;			
	}
	public static WebElement clickbackbutton ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']"));
				return ars;			
	}
	public static WebElement clickbackbutton1 ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']"));
				return ars;			
	}
	public static WebElement clickauditstataus ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lnkAuditStatus_0']"));
				//*[@id="ContentPlaceHolder1_grdRiskActivityMatrix_lnkAuditStatus_0"]/img
				return ars;			
	}
	public static WebElement clickimplementation ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkImplementation']"));
				return ars;			
	}
	public static WebElement clickviewbutton1 ()		
	{
		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdImplementationAudit_btnChangeStatus_0']"));
		//*[@id="ContentPlaceHolder1_grdImplementationAudit_btnChangeStatus_0"]
				return ars;			
	}
	public static WebElement clickframe1() {
		ars=getDriver().findElement(By.xpath("//*[@id='showdetails']"));
		//*[@id="showdetails"]
		return ars;
	}
	public static WebElement clickselectunit1 ()		
	{
				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[39]"));
				//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[39]
				return ars;
	}
	public static WebElement clickmanagementresponse ()		
	{
		ars = getDriver().findElement(By.xpath("//*[@id='txtIMPNewManagementResponse']"));
				return ars;			
	}
	public static WebElement clicksubmittohigherlevel ()		
	{
		ars = getDriver().findElement(By.xpath("//*[@id='btnSubmitToHigher']"));
				return ars;			
	}
	public static WebElement clickclosed1 ()		
	{
		ars = getDriver().findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
		//*[@id="divShowDialog"]/div/div/div[1]/button
				return ars;			
	}
	public static WebElement clickimplementstatus ()		
	{
		ars = getDriver().findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
				return ars;			
	}

	
	public static WebElement FinalAudit()		
	{
		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[1]"));
				return ars;			
	}

	
	public static WebElement MyReport() {
		
		ars=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]"));
		return ars;
	}

	
	
	public static WebElement AllFileDownloadButton5() {
		
		ars=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_aa7a_0']/a"));
		return ars;
	}

	
	public static WebElement OpenObservation() {
		
		ars=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[2]"));
		return ars;
	}

	
	public static WebElement OpenObservationExport() {
		
		ars=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		return ars;
	}

	
	public static WebElement MROpenObservationCompany() {
		
		ars=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
		return ars;
	}

	
	
	public static WebElement MROpenObservationCompanyDD() {
		
		ars=getDriver().findElement(By.xpath("//li[.='ABCD']"));
		return ars;
	}


	public static WebElement FinancialYearMReport() {
		
		ars=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']"));
		return ars;
	}


	public static WebElement FinancialYearMReportDD() {
		
		ars=getDriver().findElement(By.xpath("//li[.='2029-2030']"));
		return ars;
	}

	
	
	public static WebElement SelectSchedulingType() {
		
		ars=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']"));
		return ars;
	}

	
	public static WebElement SelectSchedulingTypeDD() {
		
		ars=getDriver().findElement(By.xpath("//li[.='Half Yearly']"));
		return ars;
	}

	
	public static WebElement Status() {
		
		ars=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlStatusList_chosen']"));
		return ars;
	}

	
	public static WebElement StatusDD() {
		
		ars=getDriver().findElement(By.xpath("//li[.='Open']"));
		return ars;
	}


	
	public static WebElement Period() {
		
		ars=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']"));
		return ars;
	}


	public static WebElement PeriodDD() {
		
		ars=getDriver().findElement(By.xpath("//li[.='Oct-Mar']"));
		return ars;
	}


	
	
}
