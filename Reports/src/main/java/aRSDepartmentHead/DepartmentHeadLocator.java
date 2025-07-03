package aRSDepartmentHead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import login.BasePage;

public class DepartmentHeadLocator extends BasePage{
	
	
	
	private static WebElement ARS = null;
	private static WebElement ObservationCategory = null;
	private static WebElement Major = null;
	private static WebElement Moderate = null;
	private static WebElement Minor = null;
	private static WebElement GridCunt = null;
	private static WebElement ExportToExcel = null;
	private static WebElement ClosePage = null;
	private static WebElement ProcessInefficiency = null;
	private static WebElement Frame = null;
	private static WebElement lessthan90Days = null;
	private static WebElement MyDocument = null;
	private static WebElement ViewButton = null;
	private static WebElement PlannedCountAug23 = null;
	private static WebElement ActualCountAug23 = null;
	private static WebElement Export = null;

	private static WebElement processWiseObservationMajor = null;
	private static WebElement processWiseObservationModerate = null;
	private static WebElement processWiseObservationMinor = null;
	
	private static WebElement Company = null;
	private static WebElement CompanyDD = null;
	private static WebElement FinancialYear = null;
	private static WebElement FinancialYearDD = null;
	private static WebElement FinancialYear3 = null;

	

	private static WebElement SchedulingType = null;
	private static WebElement SchedulingTypeDD = null;
	private static WebElement Period = null;
	private static WebElement PeriodDD = null;
	private static WebElement MyReport = null;
	private static WebElement PeriodDD1 = null;

	
	
	private static WebElement ExicutiveSummary = null;
	private static WebElement DownloadButton = null;
	private static WebElement InternalAuditReport = null;	
	private static WebElement DownloadButton1 = null;
	private static WebElement FinalAudit = null;
	private static WebElement DraftReportChooseFile = null;
	private static WebElement UploadBtton1 = null;
	private static WebElement DownloadBtton1 = null;
	private static WebElement FinalDeliverableChooseFile = null;
	private static WebElement UploadButton2 = null;
	private static WebElement DownloadButton2 = null;
	private static WebElement AuditComiteeChooseFile = null;
	private static WebElement UploadButton3 = null;
	private static WebElement DownloadButton3 = null;
	private static WebElement FeedbackFormChooseFile = null;
	private static WebElement UploadButton4 = null;
	private static WebElement DownloadButton4 = null;
	private static WebElement AllFileDownloadButton5 = null;
	private static WebElement SuccessfullyReport = null;
	private static WebElement SchedulingDeviation = null;
	
	
	private static WebElement ExportToExcelButton = null;
	private static WebElement OpenObservation = null;
	private static WebElement Exportbutton = null;
	private static WebElement AuditStatus = null;
	private static WebElement AuditScheduling = null;
	private static WebElement AuditSchedulingExport = null;
	private static WebElement AuditComitee = null;
	private static WebElement AuditComiteeFromMonth = null;
	private static WebElement AuditComiteeFromMonthDD = null;	
	private static WebElement AuditComiteeToMonth = null;
	private static WebElement AuditComiteeToMonthDD = null;
	private static WebElement AuditComiteeExport = null;
	private static WebElement PreRequisiteLogReport = null;
	private static WebElement PreRequisiteLogReportExport = null;
	private static WebElement Company1 = null;
	private static WebElement Company1DD = null;
	private static WebElement SchedulingType1 = null;
	private static WebElement SchedulingType1DD = null;
	private static WebElement Period1 = null;
	private static WebElement Period1DD = null;
	private static WebElement Successfully = null;
	private static WebElement Exportbutton1 = null;
	private static WebElement Company2DD = null;

	private static WebElement FinancialYear1 = null;
	private static WebElement FinancialYear1DD = null;
	private static WebElement Successfully1 = null;
	private static WebElement ManagementResponceLogReport = null;
	private static WebElement SelectCompany = null;
	private static WebElement PastAuditReport = null;
	
	private static WebElement AddNewPastAuditReport = null;
	private static WebElement Frame2 = null;
	private static WebElement Unit = null;
	private static WebElement MROpenObservationCompanyDD = null;
	private static WebElement FinancialYear2 = null;
	private static WebElement FinancialYearMReportDD = null;
	private static WebElement AuditBackground = null;
	private static WebElement AuditBackgroundDD = null;
	private static WebElement ReportGenerationDate = null;
	private static WebElement ReportGenerationDateDD = null;
	private static WebElement ReportIssueByTextBox = null;
	private static WebElement ReportTitleTextBox = null;
	private static WebElement RemarkTextBox = null;
	private static WebElement UploadFile = null;
	private static WebElement SavePastAudit = null;
	private static WebElement SuccessfullySave = null;
	private static WebElement Download = null;
	private static WebElement ViewButton2 = null;
	private static WebElement ClosePopup = null;
	private static WebElement ClosePopup1 = null;
	private static WebElement CloseButton1 = null;
	private static WebElement Update = null;
	private static WebElement ViewPastAuditReport = null;

	private static WebElement DownloadDocument = null;
	private static WebElement ViewDocument = null;
	private static WebElement Grid = null;
	private static WebElement Grid1 = null;

	

	private static WebElement Status = null;
	private static WebElement StatusDD = null;
	private static WebElement AuditBackground1 = null;
	private static WebElement AuditBackground1DD = null;

	private static WebElement SearchBox = null;
	private static WebElement buttonMinimize = null;
	private static WebElement dashboardExport = null;
	private static WebElement UnitGet = null;


	
	private static WebElement SelectUnit = null;
	private static WebElement SelectUnitDD = null;
	private static WebElement FinancialYeartracker = null;

	private static WebElement FinancialYeartrackerDD = null;
	private static WebElement SchedulingTypetracker = null;
	private static WebElement SchedulingTypetrackerDD = null;
	private static WebElement PeriodTracker = null;
	private static WebElement periodDD = null;
	private static WebElement ApplyFilter = null;

	
	private static WebElement OK = null;
	private static WebElement OK1 = null;
	private static WebElement OK2 = null;
	private static WebElement OK3 = null;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	


	
	
	
	public static WebElement ARS() {
		
		ARS=getDriver().findElement(By.xpath("//div[@id='dvbtnAudit']"));
		return ARS;
	}

	
	public static WebElement ObservationCategory() {
		
		ObservationCategory=getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-2 highcharts-drilldown-data-label'])[3]"));
		return ObservationCategory;
	}

	
	
	public static WebElement Major() {
		
		Major=getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[1]"));
		return Major;
	}

	
	public static WebElement Moderate() {
		
		Moderate=getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
		return Moderate;
	}

	
	public static WebElement Minor() {
		
		Minor=getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[3]"));
		return Minor;
	}

	
	public static WebElement GridCunt() {
		
		GridCunt=getDriver().findElement(By.xpath("//span[@class='k-pager-info k-label']"));
		return GridCunt;
	}

	
	public static WebElement ExportToExcel() {
		
		ExportToExcel=getDriver().findElement(By.xpath("//input[@id='lbtnExportExcel']"));
		return ExportToExcel;
	}


	public static WebElement ClosePage() {
		
		ClosePage=getDriver().findElement(By.xpath("(//button[@class='close'])[1]"));
		return ClosePage;
	}

	public static WebElement ProcessInefficiency() {
		
		ProcessInefficiency=getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[1]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Process Inefficiency']"));
		return ProcessInefficiency;
	}

	
	public static WebElement Frame() {
		
		Frame=getDriver().findElement(By.xpath("//div[@id='DivReports']//iframe[@id='showdetails']"));
		return Frame;
	}

	
	public static WebElement lessthan90Days() {
		
		lessthan90Days=getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-3 '])[1]"));
		return lessthan90Days;
	}


	public static WebElement MyDocument() {
		
		MyDocument=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[3]"));
		return MyDocument;
	}

	
	public static WebElement ViewButton() {
		
		ViewButton=getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
		return ViewButton;
	}

	
	public static WebElement PlannedCountAug23() {
		
		PlannedCountAug23=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditTrackerSummary']/tbody/tr[2]/td[6]"));
		return PlannedCountAug23;
	}

	
	
	public static WebElement ActualCountAug23() {
		
		ActualCountAug23=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditTrackerSummary']/tbody/tr[3]/td[6]"));
		return ActualCountAug23;
	}


	public static WebElement Export() {
		
		Export=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnExport']"));
		return Export;
	}


	public static WebElement processWiseObservationMajor() {
		
		processWiseObservationMajor=getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 '])[1]"));
		return processWiseObservationMajor;
	}


	
	public static WebElement processWiseObservationModerate() {
		
		processWiseObservationModerate=getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 '])[1]"));
		return processWiseObservationModerate;
	}

	
	public static WebElement processWiseObservationMinor() {
		
		processWiseObservationMinor=getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-2 '])[1]"));
		return processWiseObservationMinor;
	}

	
	
	public static WebElement Company() {
		
		Company=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
		return Company;
	}
		
	
	public static WebElement CompanyDD() {
		
		CompanyDD=getDriver().findElement(By.xpath("//li[.='agartala']"));
		return CompanyDD;
	}

	
	public static WebElement FinancialYear() {
		
		FinancialYear=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']"));
		return FinancialYear;
	}

	public static WebElement FinancialYear3() {
		
		FinancialYear3=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']"));
		return FinancialYear3;
	}

	
	
	public static WebElement FinancialYearDD() {
		
		FinancialYearDD=getDriver().findElement(By.xpath("//li[.='2023-2024']"));
		return FinancialYearDD;
	}

	
	public static WebElement SchedulingType() {
		
		SchedulingType=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']"));
		return SchedulingType;
	}

	
	public static WebElement SchedulingTypeDD() {
		
		SchedulingTypeDD=getDriver().findElement(By.xpath("//li[.='Annually']"));
		return SchedulingTypeDD;
	}


	public static WebElement Period() {
		
		Period=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']"));
		return Period;
	}

	
	public static WebElement PeriodDD() {
		
		PeriodDD=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/div/ul/li[2]"));
		return PeriodDD;
	}

	
	public static WebElement PeriodDD1() {
		
		PeriodDD1=getDriver().findElement(By.xpath("//li[.='Annually']"));
		return PeriodDD1;
	}

	public static WebElement MyReport() {
		
		MyReport=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]"));
		return MyReport;
	}

	
	public static WebElement ExicutiveSummary() {
		
		ExicutiveSummary=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[1]"));
		return ExicutiveSummary;
	}

	

	
	public static WebElement DownloadButton() {
		
		DownloadButton=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits_lnkAuditDetails_0']/img"));
		return DownloadButton;
	}

	
	public static WebElement InternalAuditReport() {
		
		InternalAuditReport=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[2]/a"));
		return InternalAuditReport;
	}

	
	public static WebElement DownloadButton1() {
		
		DownloadButton1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits_lnkAuditDetails_0']/img"));
		return DownloadButton1;
	}

	
	public static WebElement FinalAudit() {
		
		FinalAudit=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[3]/a"));
		return FinalAudit;
	}


	public static WebElement DraftReportChooseFile() {
		
		DraftReportChooseFile=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_DraftFileUpload_0']"));
		return DraftReportChooseFile;
	}

	
	public static WebElement UploadBtton1() {
		
		UploadBtton1=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_UploadDraft_0']"));
		return UploadBtton1;
	}


	public static WebElement DownloadBtton1() {
		
		DownloadBtton1=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadDraftFile_0']"));
		return DownloadBtton1;
	}

	
	public static WebElement FinalDeliverableChooseFile() {
		
		FinalDeliverableChooseFile=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_FinalveriablesFileUpload_0']"));
		return FinalDeliverableChooseFile;
	}

	
	public static WebElement UploadButton2() {
		
		UploadButton2=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_UploadFinalveriables_0']"));
		return UploadButton2;
	}

	
	public static WebElement DownloadButton2() {
		
		DownloadButton2=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile1_0']"));
		return DownloadButton2;
	}


	
	public static WebElement AuditComiteeChooseFile() {
		
		AuditComiteeChooseFile=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_AuditcommitteeFileUpload_0']"));
		return AuditComiteeChooseFile;
	}

	
	public static WebElement UploadButton3() {
		
		UploadButton3=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_UploadAuditcommittee_0']"));
		return UploadButton3;
	}

	
	
	public static WebElement DownloadButton3() {
		
		DownloadButton3=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
		return DownloadButton3;
	}

	
	public static WebElement FeedbackFormChooseFile() {
		
		FeedbackFormChooseFile=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_FeedbackFileUpload_0']"));
		return FeedbackFormChooseFile;
	}

	
	public static WebElement UploadButton4() {
		
		UploadButton4=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_UploadFeedback_0']"));
		return UploadButton4;
	}


	public static WebElement DownloadButton4() {
		
		DownloadButton4=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblFeedbackDownLoadfile1_0']"));
		return DownloadButton4;
	}

	
	public static WebElement AllFileDownloadButton5() {
		
		AllFileDownloadButton5=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfileActionAll_0']"));
		return AllFileDownloadButton5;
	}


	
	public static WebElement SuccessfullyReport() {
		
		SuccessfullyReport=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return SuccessfullyReport;
	}

	
	public static WebElement SchedulingDeviation() {
		
		SchedulingDeviation=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[4]"));
		return SchedulingDeviation;
	}

	
	public static WebElement ExportToExcelButton() {
		
		ExportToExcelButton=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		return ExportToExcelButton;
	}

	
	public static WebElement OpenObservation() {
		
		OpenObservation=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[5]"));
		return OpenObservation;
	}


	public static WebElement Exportbutton() {
		
		Exportbutton=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		return Exportbutton;
	}

	
	public static WebElement AuditStatus() {
		
		AuditStatus=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[6]"));
		return AuditStatus;
	}

	
	public static WebElement AuditScheduling() {
		
		AuditScheduling=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[7]"));
		return AuditScheduling;
	}

	public static WebElement AuditSchedulingExport() {
		
		AuditSchedulingExport=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		return AuditSchedulingExport;
	}

	
	public static WebElement AuditComitee() {
		
		AuditComitee=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[8]"));
		return AuditComitee;
	}

	
	public static WebElement AuditComiteeFromMonth() {
		
		AuditComiteeFromMonth=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtfromMonthDate']"));
		return AuditComiteeFromMonth;
	}

	
	public static WebElement AuditComiteeFromMonthDD() {
		
		AuditComiteeFromMonthDD=getDriver().findElement(By.xpath("//a[.='20']"));
		return AuditComiteeFromMonthDD;
	}

	
	public static WebElement AuditComiteeToMonth() {
		
		AuditComiteeToMonth=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txttoMonthDate']"));
		return AuditComiteeToMonth;
	}

	
	public static WebElement AuditComiteeToMonthDD() {
		
		AuditComiteeToMonthDD=getDriver().findElement(By.xpath("//a[.='21']"));
		return AuditComiteeToMonthDD;
	}

	public static WebElement AuditComiteeExport() {
		
		AuditComiteeExport=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_lbtnExportExcelTest']"));
		return AuditComiteeExport;
	}

	
	public static WebElement PreRequisiteLogReport() {
		
		PreRequisiteLogReport=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[9]"));
		return PreRequisiteLogReport;
	}

	
	public static WebElement PreRequisiteLogReportExport() {
		
		PreRequisiteLogReportExport=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		return PreRequisiteLogReportExport;
	}

	public static WebElement Company1() {
		
		Company1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
		return Company1;
	}

	public static WebElement Company1DD() {
		
		Company1DD=getDriver().findElement(By.xpath("//li[.='lucknow']"));
		return Company1DD;
	}


	
	public static WebElement SchedulingType1() {
		
		SchedulingType1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']"));
		return SchedulingType1;
	}

	
	public static WebElement SchedulingType1DD() {
		
		SchedulingType1DD=getDriver().findElement(By.xpath("//li[.='Monthly']"));
		return SchedulingType1DD;
	}

	
	public static WebElement Period1() {
		
		Period1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']"));
		return Period1;
	}

	
	public static WebElement Period1DD() {
		
		Period1DD=getDriver().findElement(By.xpath("//li[.='Apr']"));
		return Period1DD;
	}


	public static WebElement Successfully() {
		
		Successfully=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return Successfully;
	}


	public static WebElement Exportbutton1() {
		
		Exportbutton1=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnExportExcel']"));
		return Exportbutton1;
	}


	public static WebElement Company2DD() {
		
		Company2DD=getDriver().findElement(By.xpath("//li[.='Chakan']"));
		return Company2DD;
	}


	public static WebElement FinancialYear1() {
		
		FinancialYear1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']"));
		return FinancialYear1;
	}

	
	public static WebElement FinancialYear1DD() {
		
		FinancialYear1DD=getDriver().findElement(By.xpath("//li[.='2023-2024']"));
		return FinancialYear1DD;
	}

	public static WebElement Successfully1() {
		
		Successfully1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul"));
		return Successfully1;
	}

	
	public static WebElement ManagementResponceLogReport() {
		
		ManagementResponceLogReport=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[10]"));
		return ManagementResponceLogReport;
	}

	
	public static WebElement SelectCompany() {
		
		SelectCompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
		return SelectCompany;
	}

	
	public static WebElement PastAuditReport() {
		
		PastAuditReport=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[11]"));
		return PastAuditReport;
	}

	
	public static WebElement AddNewPastAuditReport() {
		
		AddNewPastAuditReport=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnAddPromotor']"));
		return AddNewPastAuditReport;
	}


	
	public static WebElement Frame2() {
		
		Frame2=getDriver().findElement(By.xpath("//iframe[@id='showdetails']"));
		return Frame2;
	}

	
	public static WebElement Unit() {
		
		Unit=getDriver().findElement(By.xpath("//*[@id='ddlLegalEntityPopPup_chosen']"));
		return Unit;
	}

	
	public static WebElement MROpenObservationCompanyDD() {
		
		MROpenObservationCompanyDD=getDriver().findElement(By.xpath("//li[.='Chakan']"));
		return MROpenObservationCompanyDD;
	}

	
	public static WebElement FinancialYear2() {
		
		FinancialYear2=getDriver().findElement(By.xpath("//*[@id='ddlFilterFinancialPopPup_chosen']"));
		return FinancialYear2;
	}


	public static WebElement FinancialYearMReportDD() {
		
		FinancialYearMReportDD=getDriver().findElement(By.xpath("//li[.='2023-2024']"));
		return FinancialYearMReportDD;
	}


	public static WebElement AuditBackground() {
		
		AuditBackground=getDriver().findElement(By.xpath("//*[@id='ddlAuditBackground_chosen']"));
		return AuditBackground;
	}

	
	public static WebElement AuditBackgroundDD() {
		
		AuditBackgroundDD=getDriver().findElement(By.xpath("//li[.='sach']"));
		return AuditBackgroundDD;
	}

	
	public static WebElement ReportGenerationDate() {
		
		ReportGenerationDate=getDriver().findElement(By.xpath("//input[@id='tbxReportDate']"));
		return ReportGenerationDate;
	}

		
	public static WebElement ReportGenerationDateDD() {
		
		ReportGenerationDateDD=getDriver().findElement(By.xpath("//a[.='18']"));
		return ReportGenerationDateDD;
	}

	
	public static WebElement ReportIssueByTextBox() {
		
		ReportIssueByTextBox=getDriver().findElement(By.xpath("//textarea[@id='tbxIssueBy']"));
		return ReportIssueByTextBox;
	}


	
	public static WebElement ReportTitleTextBox() {
		
		ReportTitleTextBox=getDriver().findElement(By.xpath("//textarea[@id='tbxTitle']"));
		return ReportTitleTextBox;
	}

	
	
	public static WebElement RemarkTextBox() {
		
		RemarkTextBox=getDriver().findElement(By.xpath("//textarea[@id='tbxRemark']"));
		return RemarkTextBox;
	}

	
	public static WebElement UploadFile() {
		
		UploadFile=getDriver().findElement(By.xpath("//input[@id='FileUploadObservation']"));
		return UploadFile;
	}

	
	public static WebElement SavePastAudit() {
		
		SavePastAudit=getDriver().findElement(By.xpath("//input[@id='btnSave']"));
		return SavePastAudit;
	}

	
	public static WebElement SuccessfullySave() {
		
		SuccessfullySave=getDriver().findElement(By.xpath("//*[@id='ValidationSummary2']/ul/li"));
		return SuccessfullySave;
	}


	public static WebElement Download() {
		
		Download=getDriver().findElement(By.xpath("//*[@id='grdVersionDisplayDownload_lblDownLoadfile_0']/img"));
		return Download;
	}

	
	public static WebElement ViewButton2() {
		
		ViewButton2=getDriver().findElement(By.xpath("//*[@id='grdVersionDisplayDownload_LinkButton1_0']/img"));
		return ViewButton2;
	}

	
	public static WebElement ClosePopup() {
		
		ClosePopup=getDriver().findElement(By.xpath("//*[@id='DocumentPopUpREV']/div/div/div[1]/button"));
		return ClosePopup;
	}

	public static WebElement ClosePopup1() {
		
		ClosePopup1=getDriver().findElement(By.xpath("//*[@id='DocumentPopUpREV']/div/div/div[1]/button"));
		return ClosePopup1;
	}

	
	public static WebElement CloseButton1() {
		
		CloseButton1=getDriver().findElement(By.xpath("//input[@id='btnCancel']"));
		return CloseButton1;
	}

	
	public static WebElement Update() {
		
		Update=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix_lblEditFile_0']/img"));
		return Update;
	}

	
	public static WebElement ViewPastAuditReport() {
		
		ViewPastAuditReport=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix_lblDownLoadfile_0']/img"));
		return ViewPastAuditReport;
	}

	
	public static WebElement DownloadDocument() {
		
		DownloadDocument=getDriver().findElement(By.xpath("//*[@id='grdVersionDisplayDownload_lblDownLoadfile_0']/img"));
		return DownloadDocument;
	}

	public static WebElement ViewDocument() {
		
		ViewDocument=getDriver().findElement(By.xpath("//*[@id='grdVersionDisplayDownload_LinkButton1_0']/img"));
		return ViewDocument;
	}


	public static WebElement Grid() {
		
		Grid=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_DropDownListPageNo_chosen']"));
		return Grid;
	}

	
	public static WebElement Grid1() {
		
		Grid1=getDriver().findElement(By.xpath("//*[@id='DropDownListPageNo_chosen']"));
		return Grid1;
	}


	
	
	public static WebElement Status() {
		
		Status=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlStatusList_chosen']"));
		return Status;
	}

	
	public static WebElement StatusDD() {
		
		StatusDD=getDriver().findElement(By.xpath("//li[.='Open']"));
		return StatusDD;
	}

	
	public static WebElement AuditBackground1() {
		
		AuditBackground1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditBackground_chosen']"));
		return AuditBackground1;
	}

	
	public static WebElement AuditBackground1DD() {
		
		AuditBackground1DD=getDriver().findElement(By.xpath("//li[.='sach']"));
		return AuditBackground1DD;
	}


	public static WebElement SearchBox() {
		
		SearchBox=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_tbxFilter']"));
		return SearchBox;
	}

	
	public static WebElement buttonMinimize() {
		
		buttonMinimize=getDriver().findElement(By.xpath("//a[@class='btn-minimize']/i[@class='fa fa-chevron-down']"));
		return buttonMinimize;
	}

	
	public static WebElement dashboardExport() {
		
		dashboardExport=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnExport']"));
		return dashboardExport;
	}
	

	public static WebElement UnitGet() {
		
		UnitGet=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix']/tbody/tr[2]/td[2]/span"));
		return UnitGet;
	}

	
	public static WebElement SelectUnit() {
		
		SelectUnit=getDriver().findElement(By.xpath("//*[@id='ddlLegalEntityMultiSelect_sl']"));
		return SelectUnit;
	}

	
	public static WebElement SelectUnitDD() {
		
		SelectUnitDD=getDriver().findElement(By.xpath("//div[@id='ddlLegalEntityMultiSelect_dv']//label[.='WHD-Greater Noida-Uttar Pradesh']"));
		return SelectUnitDD;
	}

	
	public static WebElement FinancialYeartracker() {
		
		FinancialYeartracker=getDriver().findElement(By.xpath("//div[@id='ddlFinancialYearMultiSelect_sl']"));
		return FinancialYeartracker;
	}


	
	public static WebElement FinancialYeartrackerDD() {
		
		FinancialYeartrackerDD=getDriver().findElement(By.xpath("//div[@id='ddlFinancialYearMultiSelect_dv']//label[.='2023-2024']"));
		return FinancialYeartrackerDD;
	}

	
	public static WebElement SchedulingTypetracker() {
		
		SchedulingTypetracker=getDriver().findElement(By.xpath("//*[@id='ddlSchedulingTypeMultiSelect_sl']"));
		return SchedulingTypetracker;
	}


	public static WebElement SchedulingTypetrackerDD() {
		
		SchedulingTypetrackerDD=getDriver().findElement(By.xpath("//input[@id='ddlSchedulingTypeMultiSelect_0']"));
		return SchedulingTypetrackerDD;
	}

	
	public static WebElement PeriodTracker() {
		
		PeriodTracker=getDriver().findElement(By.xpath("//*[@id='ddlPeriodMultiSelect_sl']"));
		return PeriodTracker;
	}

	
	
	public static WebElement periodDD() {
		
		periodDD=getDriver().findElement(By.xpath("//div[@id='ddlPeriodMultiSelect_dv']//label[.='Oct-Mar']"));
		return periodDD;
	}

	public static WebElement ApplyFilter() {
		
		ApplyFilter=getDriver().findElement(By.xpath("//input[@id='btnFilter']"));
		return ApplyFilter;
	}

	
	public static WebElement OK() {
		
		OK=getDriver().findElement(By.xpath("(//div[@id='ddlLegalEntityMultiSelect_dv']//div[@id='buttons']/input[@type='button'])[1]"));
		return OK;
	}

	
	public static WebElement OK1() {
		
		OK1=getDriver().findElement(By.xpath("(//div[@id='ddlFinancialYearMultiSelect_dv']//div[@id='buttons']/input[@type='button'])[1]"));
		return OK1;
	}

	
	public static WebElement OK2() {
		
		OK2=getDriver().findElement(By.xpath("(//div[@id='ddlSchedulingTypeMultiSelect_dv']//div[@id='buttons']/input[@type='button'])[1]"));
		return OK2;
	}

	
	public static WebElement OK3() {
		
		OK3=getDriver().findElement(By.xpath("(//div[@id='ddlPeriodMultiSelect_dv']//div[@id='buttons']/input[@type='button'])[1]"));
		return OK3;
	}


	
}
