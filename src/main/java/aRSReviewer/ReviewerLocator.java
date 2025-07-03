package aRSReviewer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import login.BasePage;

public class ReviewerLocator extends BasePage{

	
	private static WebElement ARS = null;
	private static WebElement OAudit = null;
	private static WebElement OImplementation = null;
	private static WebElement CAudit = null;
	private static WebElement CImplementation = null;
	private static WebElement MyWorkspace = null;
	private static WebElement StartDate = null;
	private static WebElement StartDateDD = null;
	private static WebElement EndDate = null;
	private static WebElement EndDateDD = null;
	private static WebElement SaveAuditDateDetail = null;
	private static WebElement Successfully = null;
	private static WebElement ViewAuditDetails = null;
	private static WebElement NotDone = null;
	private static WebElement Submit = null;
	private static WebElement ChangeStatus = null;
	
	private static WebElement Frame2 = null;
	private static WebElement NextButton1 = null;
	private static WebElement ProcessWalkthrogh = null;
	private static WebElement ActualWorkdone = null;
	private static WebElement Population = null;
	private static WebElement Sample = null;
	private static WebElement Remarks = null;
	private static WebElement WorkingFileUpload = null;
	private static WebElement WorkingFileUploadButton = null;
	private static WebElement AnnexureFile = null;
	private static WebElement AnnexureFileUploadButton = null;	
	private static WebElement NextButton2 = null;
	private static WebElement NextButton3 = null;
	private static WebElement ObservationTitle = null;
	private static WebElement Observation = null;
	private static WebElement briefObservation = null;
	private static WebElement ObservationBackground = null;
	private static WebElement WorkingFile1 = null;
	private static WebElement WorkingFile1Uploadbutton = null;
	private static WebElement AnnexureTitle = null;	
	private static WebElement Table = null;
	private static WebElement TableWizard = null;
	private static WebElement OKTable = null;
	private static WebElement ImageUpload = null;
	private static WebElement ImageUploadButton = null;
	private static WebElement AudioVideoLink = null;
	private static WebElement AuditComitee = null;
	private static WebElement AuditComiteeDD = null;
	private static WebElement BusinessRisk = null;	
	private static WebElement RootCause = null;
	private static WebElement FinancialImpact = null;
	private static WebElement RiskRating = null;
	private static WebElement RiskRatingDD = null;	
	private static WebElement ObservationCatogary = null;
	private static WebElement ObservationCatogaryDD = null;
	private static WebElement ObservationSubCatogary = null;
	private static WebElement ObservationSubCatogaryDD = null;
	private static WebElement ReccomendationType = null;
	private static WebElement ReccomendationTypeDD = null;
	private static WebElement Reccomendation = null;
	private static WebElement ResponceDueDate = null;	
	private static WebElement ResponceDueDateDD = null;
	private static WebElement ManagementResponce = null;
	private static WebElement TimelineCalender = null;
	private static WebElement TimelineCalenderDD = null;
	private static WebElement PersonResponsible = null;
	private static WebElement PersonResponsibleDD = null;
	private static WebElement OwnerName = null;
	private static WebElement OwnerNameDD = null;
	private static WebElement SaveReccomendation = null;	
	private static WebElement Successfullyreccomendation = null;
	private static WebElement OK1 = null;
	private static WebElement SaveObservation = null;
	private static WebElement SuccessfullyObservation = null;
	private static WebElement OK2 = null;
	private static WebElement Company = null;
	private static WebElement CompanyDD = null;
	private static WebElement Grid2 = null;

	
	private static WebElement ShowReviewHistoryLogLink = null;
	private static WebElement ReviewRemark = null;
	private static WebElement File = null;
	private static WebElement UploadButton = null;
	private static WebElement SubmitButton = null;

	private static WebElement AddNew = null;
	private static WebElement Frame3 = null;
	private static WebElement AuditStep = null;
	private static WebElement AuditMethodology = null;
	private static WebElement SaveAudit = null;
	private static WebElement SuccessfullyAuditStep = null;
	private static WebElement ClosePage = null;
	private static WebElement BackButton = null;
	
	private static WebElement Closepage1 = null;
	private static WebElement OK = null;
	private static WebElement Successfully3 = null;

	private static WebElement mydocument=null;
	private static WebElement mydocumentfilter=null;
	private static WebElement mydocumentselectfilter=null;
	private static WebElement mydocumentdownload=null;
	private static WebElement myreport=null;
	private static WebElement myreportfilter=null;
	private static WebElement mydocumentfinancialyear=null;
	private static WebElement mydocumentselectfinancialyear=null;
	private static WebElement mydocumentclick1=null;
	private static WebElement mydocumentclick2=null;
	private static WebElement mydocumentclick3=null;
	private static WebElement mydocumentclick4=null;
	private static WebElement mydocumentclick5=null;
	private static WebElement mydocumentDeleted=null;
	private static WebElement mydocumentDeleteddownload=null;
	private static WebElement mydocumentFeedback=null;
	private static WebElement mydocumentFeedbackdownload=null;
	private static WebElement mydocumentFinaldeliverable=null;
	private static WebElement myFinaldeliverabledocumentdownload=null;
	private static WebElement mydocumentreview=null;
	private static WebElement myannexuredocumentdownload=null;
	private static WebElement mydocumentannexure=null;
	private static WebElement myreviewdocumentdownload=null;
	
	private static WebElement sendmail1=null;
	
	private static WebElement auditee=null;
	private static WebElement selectauditee=null;
	private static WebElement reportingmanager=null;
	private static WebElement timeline=null;
	private static WebElement selectreportingmanager=null;
	private static WebElement saveviewdata=null;
	private static WebElement data=null;
	
	private static WebElement addnewuser=null;
	private static WebElement firstname=null;
	private static WebElement contactno=null;
	private static WebElement Designation=null;
	private static WebElement Email=null;
	private static WebElement lastname=null;
	private static WebElement newusersave=null;
	private static WebElement newusersavemessage=null;
	private static WebElement frame1=null;
	private static WebElement newuserclose=null;
	
	
	private static WebElement exporttoexcel=null;
	private static WebElement draftexportexcel=null;
	private static WebElement selectprocess=null;
	private static WebElement draftobservation=null;
	private static WebElement process=null;
	private static WebElement ObservationList_CheckBox=null;
	private static WebElement ObservationList_Save=null;
	private static WebElement ObservationList_SaveMsg=null;
	private static WebElement removeobservation=null;
	private static WebElement backbtn=null;
	
	private static WebElement checkboox=null;
	private static WebElement ForceMail1 = null;
	private static WebElement ForceMail = null;
	private static WebElement InternalAuditMeeting = null;
	private static WebElement NewMailButton = null;
	
	private static WebElement WorkingFileDownload = null;
	private static WebElement DeleteWorkingFile = null;
	private static WebElement AnnexureFileDownload = null;
	private static WebElement AnnexureFileDelete = null;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static WebElement SelectProcess = null;
	private static WebElement CheckBox = null;
	private static WebElement SelectProcessDD = null;
	private static WebElement OKP = null;
	private static WebElement SelectSubProcess = null;
	private static WebElement SelectSubProcessDD = null;
	private static WebElement OKSP = null;
	private static WebElement SelectDocumentRequired = null;	
	private static WebElement SelectDocumentRequiredDD = null;
	private static WebElement OK3 = null;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static WebElement SelectProcess2 = null;	
	private static WebElement SelectProcess2DD = null;
	private static WebElement SelectSubProcess2 = null;
	private static WebElement SelectSubProcess2DD = null;
	private static WebElement ReminderCheckBox = null;
	private static WebElement EscalationCheckBox = null;
	private static WebElement SendMailA = null;
	private static WebElement ActDetail = null;

	


	
	
	private static WebElement ViewDataRequestDetails = null;
	private static WebElement Frame = null;
	private static WebElement Frame1 = null;
	private static WebElement AddRequestData = null;
	private static WebElement AddDocument = null;
	private static WebElement DocumentName = null;
	private static WebElement Save = null;
	private static WebElement Successfully1 = null;
	private static WebElement Addplus = null;
	private static WebElement Delete = null;
	
	private static WebElement openobservation=null;
	private static WebElement downloadopenobservation=null;
	private static WebElement more2=null;
	private static WebElement pastauditreport=null;
	private static WebElement addnewpastaudit=null;
	private static WebElement addnewunit=null;
	private static WebElement addnewselectunit=null;
	private static WebElement addnewsubunit=null;
	private static WebElement addnewselectsubunit=null;
	private static WebElement addnewfinancialyear=null;
	private static WebElement addnewselectfinancialyear=null;
	private static WebElement addnewauditbackground=null;
	private static WebElement addnewauditselectbackground=null;
	private static WebElement addnewaudituploadfile=null;
	private static WebElement addnewauditsave=null;
	private static WebElement addnewauditclose=null;
	private static WebElement pastauditview=null;
	private static WebElement viewpast=null;
	private static WebElement viewpastclose=null;
	private static WebElement pastauditedit=null;
	private static WebElement pastauditeditsave=null;
	private static WebElement pastauditeditclose=null;
	private static WebElement pastauditexcelexport=null;
	private static WebElement downloadpast=null;
	private static WebElement more3=null;
	private static WebElement more12=null;
	private static WebElement prerequsite=null;
	private static WebElement entity=null;
	private static WebElement selectentity=null;
	private static WebElement subentity=null;
	private static WebElement selectsubentity=null;
	private static WebElement year=null;
	private static WebElement selectyear=null;
	private static WebElement selectschedulingtype=null;
	private static WebElement schedulingtype=null;
	private static WebElement period=null;
	private static WebElement selectperiod=null;
	private static WebElement prerequsiteexcelexport=null;
	private static WebElement more22=null;
	private static WebElement more4=null;
	private static WebElement managementreport=null;
	private static WebElement managementselectunit=null;
	private static WebElement managementunit=null;
	private static WebElement managementselectfinancial=null;
	private static WebElement managementfinancial=null;
	private static WebElement managementselectsubunit=null;
	private static WebElement managementsubunit=null;
	private static WebElement managementschedulingtype=null;
	private static WebElement managementselectschedulingtype=null;
	private static WebElement selectmanagementperiodtype=null;
	private static WebElement selectmanagementexporttoexcel=null;
	private static WebElement managementperiodtype=null;
	private static WebElement more5=null;
	private static WebElement more55=null;
	private static WebElement draftreport=null;
	private static WebElement Auditscheduling=null;
	private static WebElement draftselectunit=null;
	private static WebElement draftunit=null;
	private static WebElement draftselectfinancial=null;
	private static WebElement draftsubunit=null;
	private static WebElement pastauditviewreport=null;
	private static WebElement selectopenobservation=null;
	private static WebElement addnewpastauditframe=null;
	private static WebElement pastauditviewframe=null;
	private static WebElement viewpastclose1=null;
	private static WebElement pastauditeditframe=null;
	private static WebElement draftfinancial=null;
	private static WebElement draftselectsubunit=null;
	private static WebElement draftperiodtype=null;
	private static WebElement draftselectschedulingtype=null;
	private static WebElement selectdraftperiodtype=null;
	private static WebElement draftschedulingtype=null;
	private static WebElement selectdraftexporttoexcel=null;
	private static WebElement viewremark=null;

	private static WebElement adddocumentname=null;
	private static WebElement adddocumentsave=null;
	private static WebElement adddocumentsavemessage=null;
	private static WebElement adddocumentclose=null;

	private static WebElement newmail=null;
	private static WebElement newmail1=null;
	private static WebElement sendmail=null;
	private static WebElement to=null;
	private static WebElement cross1=null;
	private static WebElement cross2=null;
	private static WebElement selectto=null;
	
	private static WebElement Close = null;
	private static WebElement TypeToSearchBox = null;
	private static WebElement ClickOperation = null;
	private static WebElement Close1 = null;
	
	private static WebElement TO = null;
	private static WebElement TODD = null;	
	private static WebElement Subject = null;
	private static WebElement FileUpload = null;
	private static WebElement UploadButton1 = null;
	private static WebElement SendMail = null;
	private static WebElement Summery = null;
	private static WebElement View = null;
	private static WebElement FileUpload1 = null;
	private static WebElement Download = null;

	private static WebElement MyDocument = null;
	private static WebElement WorkingDocument = null;
	private static WebElement DownloadButton = null;
	private static WebElement Succssesfully = null;	
	private static WebElement OpenAuditFilter = null;
	private static WebElement OpenAuditFilterDD = null;
	private static WebElement FinancialYear = null;
	private static WebElement FinancialYearDD = null;
	
	
	
	public static WebElement ARS() {
		
		ARS=getDriver().findElement(By.xpath("//div[@id='dvbtnAudit']"));
		return ARS;
	}

	
	public static WebElement OAudit() {
		
		OAudit=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divOpenAuditCount']"));
		return OAudit;
	}

	
	public static WebElement OImplementation() {
		
		OImplementation=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divOpenAuditIMPCount']"));
		return OImplementation;
	}

	
	
	public static WebElement CAudit() {
		
		CAudit=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divCloseAuditCount']"));
		return CAudit;
	}


	
	public static WebElement CImplementation() {
		
		CImplementation=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divCloseAuditIMPCount']"));
		return CImplementation;
	}
	
	
	
	public static WebElement StartDate() {
		
		StartDate=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdRiskActivityMatrix_txtStartDate_5']"));
		return StartDate;
	}

	
	public static WebElement StartDateDD() {
		
		StartDateDD=getDriver().findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]"));
		return StartDateDD;
	}

	
	public static WebElement EndDate() {
		
		EndDate=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdRiskActivityMatrix_txtEndDate_5']"));
		return EndDate;
	}

	
	public static WebElement EndDateDD() {
		
		EndDateDD=getDriver().findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[4]"));
		return EndDateDD;
	}

	
	
	public static WebElement SaveAuditDateDetail() {
		
		SaveAuditDateDetail=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lnkSave_5']/img"));
		return SaveAuditDateDetail;
	}

	
	public static WebElement MyWorkspace() {
		
		MyWorkspace=getDriver().findElement(By.xpath("//li[@id='leftworkspacemenu']"));
		return MyWorkspace;
	}

	
	
	public static WebElement Successfully() {
		
		Successfully=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return Successfully;
	}


	
	

	
	
	public static WebElement ViewDataRequestDetails() {
		
		ViewDataRequestDetails=getDriver().findElement(By.xpath("//*[@id=\"grd_csa\"]/div[2]/table/tbody/tr[1]/td[6]/a[2]/img"));
		//*[@id="grd_csa"]/div[2]/table/tbody/tr[1]/td[6]/a[2]/img
		//a[@class='k-button rec-data k-state-border-down']//img[@alt='View Data Request Details']
		return ViewDataRequestDetails;
	}

	
	public static WebElement Frame() {
		
		Frame=getDriver().findElement(By.xpath("//iframe[@id='IframePreRequisite']"));
		return Frame;
	}
	
	public static WebElement Frame1() {
		
		Frame1=getDriver().findElement(By.xpath("//iframe[@id='Preshowdetails']"));
		return Frame1;
	}


	public static WebElement AddRequestData() {
		
		AddRequestData=getDriver().findElement(By.xpath("//input[@id='btnAddPreRequisite']"));
		return AddRequestData;
	}


	public static WebElement AddDocument() {
		
		AddDocument=getDriver().findElement(By.xpath("//*[@id='grdProcessAudit_lnkAddChecklist_0']/img"));
		return AddDocument;
	}


	
	public static WebElement DocumentName() {
		
		DocumentName=getDriver().findElement(By.xpath("//input[@id='GrdAddChecklist_tbxDocumentName_0']"));
		return DocumentName;
	}


	public static WebElement Save() {
		
		Save=getDriver().findElement(By.xpath("//input[@id='btnAddChecklist']"));
		return Save;
	}

	
	public static WebElement Successfully1() {
		
		Successfully1=getDriver().findElement(By.xpath("//*[@id='ValidationSummary2']/ul/li"));
		return Successfully1;
	}

	
	public static WebElement Addplus() {
		
		Addplus=getDriver().findElement(By.xpath("//*[@id='GrdAddChecklist_lnkAddChk_0']/img"));
		return Addplus;
	}
	
	public static WebElement Delete() {
		
		Delete=getDriver().findElement(By.xpath("//*[@id='GrdAddChecklist_LinkButton2_0']/img"));
		return Delete;
	}

	
	public static WebElement ViewAuditDetails() {
		
		ViewAuditDetails=getDriver().findElement(By.xpath("//*[@id=\"grd_csa\"]/div[2]/table/tbody/tr[2]/td[6]/a[3]"));
		return ViewAuditDetails;
	}

	
	public static WebElement NotDone() {
		
		NotDone=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdAuditStatus_lblRiskNotDone_0']"));
		return NotDone;
	}
	
public static WebElement Submit() {
		
	Submit=getDriver().findElement(By.xpath("//*[@id=\"grd_csa\"]/div[2]/table/tbody/tr[1]/td[5]/a"));
		return Submit;
	}

	
	public static WebElement ChangeStatus() {
		
		ChangeStatus=getDriver().findElement(By.xpath("//*[@id=\"grd_csa\"]/div[2]/table/tbody/tr/td[7]/a/img"));
		//*[@id="grd_csa"]/div[2]/table/tbody/tr/td[7]/a/img
		return ChangeStatus;
	}

	public static WebElement Frame2() {
		
		Frame2=getDriver().findElement(By.xpath("//iframe[@id='showdetails']"));
		return Frame2;
	}

	
	public static WebElement NextButton1() {
		
		NextButton1=getDriver().findElement(By.xpath("//button[@id='btn1']"));
		return NextButton1;
	}

public static WebElement Mydocumentchange() {
		
		NextButton1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_2']"));
		return NextButton1;
	}

	
	public static WebElement ProcessWalkthrogh() {
		
		ProcessWalkthrogh=getDriver().findElement(By.xpath("//textarea[@id='txtWalkthrough']"));
		return ProcessWalkthrogh;
	}

	
	
	
	public static WebElement ActualWorkdone() {
		
		ActualWorkdone=getDriver().findElement(By.xpath("//textarea[@id='txtActualWorkDone']"));
		return ActualWorkdone;
	}

	

	public static WebElement Population() {
		
		Population=getDriver().findElement(By.xpath("//textarea[@id='txtpopulation']"));
		return Population;
	}

	
	public static WebElement Sample() {
		
		Sample=getDriver().findElement(By.xpath("//textarea[@id='txtSample']"));
		return Sample;
	}


	public static WebElement Remarks() {
		
		Remarks=getDriver().findElement(By.xpath("//textarea[@id='tbxRemarks']"));
		return Remarks;
	}

	
	public static WebElement WorkingFileUpload() {
		
		WorkingFileUpload=getDriver().findElement(By.xpath("//input[@id='WFUpload']"));
		return WorkingFileUpload;
	}

	
	
	public static WebElement WorkingFileUploadButton() {
		
		WorkingFileUploadButton=getDriver().findElement(By.xpath("//button[@id='btnWFUpload']"));
		return WorkingFileUploadButton;
	}


	public static WebElement AnnexureFile() {
		
		AnnexureFile=getDriver().findElement(By.xpath("//input[@id='AFUpload']"));
		return AnnexureFile;
	}


	public static WebElement AnnexureFileUploadButton() {
		
		AnnexureFileUploadButton=getDriver().findElement(By.xpath("//button[@id='btnAFUpload']"));
		return AnnexureFileUploadButton;
	}

	
	
	
	public static WebElement NextButton2() {
		
		NextButton2=getDriver().findElement(By.xpath("//button[@id='btn2']"));
		return NextButton2;
	}
	
public static WebElement NextButton3() {
		
		NextButton3=getDriver().findElement(By.xpath("//*[@id='btnNextObservation']"));
		//*[@id="btnNextObservation"]
		return NextButton3;
	}

	
	public static WebElement ObservationTitle() {
		
		ObservationTitle=getDriver().findElement(By.xpath("//input[@id='txtObservationTitle']"));
		return ObservationTitle;
	}

	
	public static WebElement Observation() {
		
		Observation=getDriver().findElement(By.xpath("//textarea[@id='txtObservation']"));
		return Observation;
	}

	
	
	
	public static WebElement briefObservation() {
		
		briefObservation=getDriver().findElement(By.xpath("//textarea[@id='tbxBriefObservation']"));
		return briefObservation;
	}


	
	public static WebElement ObservationBackground() {
		
		ObservationBackground=getDriver().findElement(By.xpath("//textarea[@id='tbxObjBackground']"));
		return ObservationBackground;
	}


	public static WebElement WorkingFile1() {
		
		WorkingFile1=getDriver().findElement(By.xpath("//input[@id='WFUploadObj']"));
		return WorkingFile1;
	}


	public static WebElement WorkingFile1Uploadbutton() {
		
		WorkingFile1Uploadbutton=getDriver().findElement(By.xpath("//button[@id='btnWFUploadObj']"));
		return WorkingFile1Uploadbutton;
	}

	
	public static WebElement AnnexureTitle() {
		
		AnnexureTitle=getDriver().findElement(By.xpath("//input[@id='txtAnnexueTitle']"));
		return AnnexureTitle;
	}


	public static WebElement Table() {
		
		Table=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[11]/div/table/tbody/tr[1]/td/ul/li[2]/a[1]/span[1]"));
		return Table;
	}
	
	
	public static WebElement TableWizard() {
		
		TableWizard=getDriver().findElement(By.xpath("/html/body/div[3]/div/div/a"));
		return TableWizard;
	}

	
	public static WebElement OKTable() {
		
		OKTable=getDriver().findElement(By.xpath("//button[@class='k-button k-primary k-dialog-ok']"));
		return OKTable;
	}


	public static WebElement ImageUpload() {
		
		ImageUpload=getDriver().findElement(By.xpath("//input[@id='ImageUpload']"));
		return ImageUpload;
	}

	
	public static WebElement ImageUploadButton() {
		
		ImageUploadButton=getDriver().findElement(By.xpath("//button[@id='btnImgUpload']"));
		return ImageUploadButton;
	}


	public static WebElement AudioVideoLink() {
		
		AudioVideoLink=getDriver().findElement(By.xpath("//textarea[@id='txtMultilineVideolink']"));
		return AudioVideoLink;
	}

	
	
	public static WebElement AuditComitee() {
		
		AuditComitee=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[15]/span"));
		return AuditComitee;
	}


	
	
	public static WebElement AuditComiteeDD() {
		
		AuditComiteeDD=getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[.='Yes']"));
		return AuditComiteeDD;
	}


	
	public static WebElement BusinessRisk() {
		
		BusinessRisk=getDriver().findElement(By.xpath("//textarea[@id='txtRisk']"));
		return BusinessRisk;
	}


	public static WebElement RootCause() {
		
		RootCause=getDriver().findElement(By.xpath("//textarea[@id='txtRootcost']"));
		return RootCause;
	}

	
	
	public static WebElement FinancialImpact() {
		
		FinancialImpact=getDriver().findElement(By.xpath("//input[@id='txtfinancialImpact']"));
		return FinancialImpact;
	}


	public static WebElement RiskRating() {
		
		RiskRating=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[19]/span"));
		return RiskRating;
	}


	public static WebElement RiskRatingDD() {
		
		RiskRatingDD=getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[.='High']"));
		return RiskRatingDD;
	}

	
	public static WebElement ObservationCatogary() {
		
		ObservationCatogary=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[20]/span"));
		return ObservationCatogary;
	}

	
	
	public static WebElement ObservationCatogaryDD() {
		
		ObservationCatogaryDD=getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[.='biology1']"));
		return ObservationCatogaryDD;
	}

	
	
	public static WebElement ObservationSubCatogary() {
		
		ObservationSubCatogary=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[21]/span"));
		return ObservationSubCatogary;
	}

	
	public static WebElement ObservationSubCatogaryDD() {
		
		ObservationSubCatogaryDD=getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[.='covert observation']"));
		return ObservationSubCatogaryDD;
	}

	
	public static WebElement ReccomendationType() {
		
		ReccomendationType=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[23]/fieldset/div[2]/div[1]/span"));
		return ReccomendationType;
	}


	public static WebElement ReccomendationTypeDD() {
		
		ReccomendationTypeDD=getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[.='Corrective']"));
		return ReccomendationTypeDD;
	}
	
	
	public static WebElement Reccomendation() {
		
		Reccomendation=getDriver().findElement(By.xpath("//textarea[@id='txtRecommendation']"));
		return Reccomendation;
	}

	
	public static WebElement ResponceDueDate() {
		
		ResponceDueDate=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[23]/fieldset/div[2]/div[3]/span/span/span"));
		//*[@id="tabstrip-3"]/div[23]/fieldset/div[2]/div[3]/span/span/span
		return ResponceDueDate;
	}

	
	public static WebElement ResponceDueDateDD() {
		
		ResponceDueDateDD=getDriver().findElement(By.xpath("//a[.='30']"));
		//*[@id="9026eafe-5900-4e88-beb2-22a63408ad16"]/table/tbody/tr[5]/td[4]/a
		return ResponceDueDateDD;
	}


	public static WebElement ManagementResponce() {
		
		ManagementResponce=getDriver().findElement(By.xpath("//textarea[@id='txtMgtResponse']"));
		return ManagementResponce;
	}

	
	public static WebElement TimelineCalender() {
		
		TimelineCalender=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[23]/fieldset/div[2]/div[5]/span/span/span"));
		return TimelineCalender;
	}

	
	
	public static WebElement TimelineCalenderDD() {
		
		TimelineCalenderDD=getDriver().findElement(By.xpath("//a[.='25']"));
		return TimelineCalenderDD;
	}


	public static WebElement PersonResponsible() {
		
		PersonResponsible=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[23]/fieldset/div[2]/div[6]/span"));
		return PersonResponsible;
	}

	
	
	public static WebElement PersonResponsibleDD() {
		//*[@id="ddlPersonresponsible_listbox"]/li[2]
		PersonResponsibleDD=getDriver().findElement(By.xpath("//*[@id='ddlPersonresponsible_listbox']/li[2]"));
		return PersonResponsibleDD;
	}


	
	public static WebElement OwnerName() {
		
		OwnerName=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[23]/fieldset/div[2]/div[7]/span"));
		return OwnerName;
	}


	public static WebElement OwnerNameDD() {
		
		OwnerNameDD=getDriver().findElement(By.xpath("//*[@id=\"ddlOwnerName_listbox\"]/li[6]"));
		//*[@id="ddlOwnerName_listbox"]/li[6]
		return OwnerNameDD;
	}

	
	public static WebElement SaveReccomendation() {
		
		SaveReccomendation=getDriver().findElement(By.xpath("//button[@id='saveRecommendation']"));
		return SaveReccomendation;
	}
	
	public static WebElement Successfullyreccomendation() {
		
		Successfullyreccomendation=getDriver().findElement(By.xpath("//div[@id='confirmbox']"));
		return Successfullyreccomendation;
	}

	
	public static WebElement OK1() {
		
		OK1=getDriver().findElement(By.xpath("//button[@class='k-button k-primary']"));
		return OK1;
	}

	public static WebElement SaveObservation() {
		
		SaveObservation=getDriver().findElement(By.xpath("//button[@id='btn3']"));
		return SaveObservation;
	}

	
	
	public static WebElement SuccessfullyObservation() {
		
		SuccessfullyObservation=getDriver().findElement(By.xpath("//*[@id='confirmbox']//p1"));
		return SuccessfullyObservation;
	}

	
	
	public static WebElement OK2() {
		
		OK2=getDriver().findElement(By.xpath("(//button[@class='k-button k-primary'])[2]"));
		return OK2;
	}

	
	public static WebElement Company() {
		
		Company=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
		return Company;
	}

	
	public static WebElement CompanyDD() {
		
		CompanyDD=getDriver().findElement(By.xpath("//li[.='Eicher tractor']"));
		return CompanyDD;
	}

	
	
	public static WebElement Grid2() {
		
		Grid2=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_DropDownListPageNo_chosen']"));
		return Grid2;
	}


	
	public static WebElement ShowReviewHistoryLogLink() {
		
		ShowReviewHistoryLogLink=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[25]/div[1]/a"));
		return ShowReviewHistoryLogLink;
	}
	//////////////////////////////
	public static WebElement clickreviewremark() {
		ARS=getDriver().findElement(By.xpath("//*[@id='txtRemark']"));
		//*[@id="txtRemark"]
		return ARS;
	}
	public static WebElement clickselectstatus() {
		ARS=getDriver().findElement(By.xpath("//*[@id='rdbtnStatus']/label[1]"));
		return ARS;
	}
	public static WebElement clicksubmitbtn01() {
		ARS=getDriver().findElement(By.xpath("//*[@id='btnSave']"));
		//*[@id="btnSave"]
		return ARS;
	}
	public static WebElement clicksubmitbtnok() {
		ARS=getDriver().findElement(By.xpath("/html/body/div[16]/div[3]/button"));
		//*[@id="btnSave"]
		return ARS;
	}

	
	///////////ambuj///////////////////
	public static WebElement ReviewRemark() {
		
		ReviewRemark=getDriver().findElement(By.xpath("//textarea[@id='txtRemark']"));
		return ReviewRemark;
	}

	
	public static WebElement File() {
		
		File=getDriver().findElement(By.xpath("//input[@id='RVUpload']"));
		return File;
	}

	
	public static WebElement UploadButton() {
		
		UploadButton=getDriver().findElement(By.xpath("//button[@id='btnRHUpload']"));
		return UploadButton;
	}

	
	public static WebElement SubmitButton() {
		
		SubmitButton=getDriver().findElement(By.xpath("//button[@id='btnSave']"));
		return SubmitButton;
	}


	
	public static WebElement ClosePage() {
		
		ClosePage=getDriver().findElement(By.xpath("//button[@class='close']"));
		return ClosePage;
	}

	
	
	public static WebElement BackButton() {
		
		BackButton=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnBack']"));
		return BackButton;
	}


	public static WebElement AddNew() {
		
		AddNew=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnAddChecklist']"));
		return AddNew;
	}

	
	
	public static WebElement Frame3() {
		
		Frame3=getDriver().findElement(By.xpath("//iframe[@id='showdetails']"));
		return Frame3;
	}

	
	
	public static WebElement AuditStep() {
		
		AuditStep=getDriver().findElement(By.xpath("//textarea[@id='txtATBD']"));
		return AuditStep;
	}


	public static WebElement AuditMethodology() {
		
		AuditMethodology=getDriver().findElement(By.xpath("//textarea[@id='txtAuditObjective']"));
		return AuditMethodology;
	}

	
	
	public static WebElement SaveAudit() {
		
		SaveAudit=getDriver().findElement(By.xpath("//input[@id='btnPopupSave']"));
		return SaveAudit;
	}


	public static WebElement SuccessfullyAuditStep() {
		
		SuccessfullyAuditStep=getDriver().findElement(By.xpath("//*[@id='ValidationSummary3']/ul/li"));
		return SuccessfullyAuditStep;
	}

	
	public static WebElement Closepage1() {
		
		Closepage1=getDriver().findElement(By.xpath("(//button[@class='close'])[1]"));
		return Closepage1;
	}

	
	public static WebElement OK() {
		
		OK=getDriver().findElement(By.xpath("(//div[@class='k-widget k-window k-dialog']//button[@class='k-button k-primary'])[1]"));
		return OK;
	}

	
	
	public static WebElement Successfully3() {
		
		Successfully3=getDriver().findElement(By.xpath("//*[@id='confirmbox']/p1/strong"));
		return Successfully3;
	}
	
	
	public static WebElement clickmydocument() {
		mydocument=getDriver().findElement(By.xpath("//*[@id='leftdocumentmenu']/a/span[1]"));
		return mydocument;
	}
	public static WebElement clickmydocumentfilter() {
		mydocumentfilter=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
		return mydocumentfilter;
	}
	public static WebElement clickmydocumentselectfilter() {
		mydocumentselectfilter=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[8]"));
		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[8]
		return mydocumentselectfilter;
	}
	public static WebElement clickmydocumentfinancialyear() {
		mydocumentfinancialyear=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/a"));
		//*[@id="ContentPlaceHolder1_ddlFinancialYear_chosen"]/a
		return mydocumentfinancialyear;
	}
	public static WebElement clickmydocumentselectfinancialyear() {
		mydocumentselectfinancialyear=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/div/ul/li[16]"));
		//*[@id="ContentPlaceHolder1_ddlFinancialYear_chosen"]/div/ul/li[16]
		return mydocumentselectfinancialyear;
	}
	public static WebElement clickmydocumentstatusfilter() {
		mydocumentfinancialyear=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlStatusDocument_chosen']"));
		//*[@id="ContentPlaceHolder1_ddlStatusDocument_chosen"]
		return mydocumentfinancialyear;
	}
	public static WebElement clickmydocumentselectstatus() {
		mydocumentselectfinancialyear=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlStatusDocument_chosen']/div/ul/li[2]"));
		//*[@id="ContentPlaceHolder1_ddlStatusDocument_chosen"]/div/ul/li[2]
		return mydocumentselectfinancialyear;
	}
	public static WebElement clickmydocumentstatus() {
		mydocumentdownload=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlStatusDocument_chosen']"));
		return mydocumentdownload;
	}
	public static WebElement clickmydocumentstatusselect() {
		mydocumentdownload=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlStatusDocument_chosen']/div/ul/li[2]"));
		//*[@id="ContentPlaceHolder1_ddlStatusDocument_chosen"]/div/ul/li[2]
		return mydocumentdownload;
	}
	
	public static WebElement clickmydocumentdownload() {
		mydocumentdownload=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
		//*[@id="ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0"]
		return mydocumentdownload;
	}
	public static WebElement clickmydocumentclick1() {
		mydocumentclick1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']"));
		return mydocumentclick1;
	}
	public static WebElement clickmydocumentreview() {
		mydocumentreview=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[2]"));
		//*[@id="ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0"]/option[2]
		//*[@id="ContentPlaceHolder1_ddlFinancialYear_chosen"]/div/ul/li[3]
		return mydocumentreview;
	}
	public static WebElement clickmyreviewdocumentdownload() {
		myreviewdocumentdownload=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
		return myreviewdocumentdownload;
	}
	public static WebElement clickmydocumentclick2() {
		mydocumentclick2=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']"));
		return mydocumentclick2;
	}
	public static WebElement clickmydocumentannexure() {
		mydocumentannexure=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[3]"));
		return mydocumentannexure;
	}
	public static WebElement clickmyannexuredocumentdownload() {
		myannexuredocumentdownload=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
		return myannexuredocumentdownload;
	}
	
	public static WebElement clickmydocumentclick3() {
		mydocumentclick3=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']"));
		return mydocumentclick3;
	}
	public static WebElement clickmydocumentFinaldeliverable() {
		mydocumentFinaldeliverable=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[5]"));
		return mydocumentFinaldeliverable;
	}
	public static WebElement clickmyFinaldeliverabledocumentdownload() {
		myFinaldeliverabledocumentdownload=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
		return myFinaldeliverabledocumentdownload;
	}
	
	public static WebElement clickmydocumentclick4() {
		mydocumentclick4=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']"));
		return mydocumentclick4;
	}
	public static WebElement clickmydocumentFeedback() {
		mydocumentFeedback=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[7]"));
		return mydocumentFeedback;
	}
	public static WebElement clickmydocumentFeedbackdownload() {
		mydocumentFeedbackdownload=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
		return mydocumentFeedbackdownload;
	}
	
	public static WebElement clickmydocumentclick5() {
		mydocumentclick5=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']"));
		return mydocumentclick5;
	}
	public static WebElement clickmydocumentDeleted() {
		mydocumentDeleted=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[6]"));
		//*[@id="ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0"]/option[6]
		return mydocumentDeleted;
	}
	public static WebElement clickmydocumentDeleteddownload() {
		mydocumentDeleteddownload=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
		return mydocumentDeleteddownload;
	}	

	public static WebElement clickmyreport() {
		myreport=getDriver().findElement(By.xpath("//*[@id='leftreportsmenu']/a"));
		return myreport;
	}
	public static WebElement clickmyreportfilter() {
		myreportfilter=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/a/span"));
		return myreportfilter;
	}
	public static WebElement clickmyreportselectfilter() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/div/ul/li[3]"));
		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[3]
		return myreport;
	}
	public static WebElement clickmyreportselectfinancial() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']"));
		return myreport;
	}
	public static WebElement clickmyreportselectfinancialyear() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/div/ul/li[16]"));
		//*[@id="ContentPlaceHolder1_ddlFinancialYear_chosen"]/div/ul/li[16]
		return myreport;
	}
	public static WebElement clickmore() {
		myreport=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/button"));
		return myreport;
	}
	
	public static WebElement clickauditstatus() {
		myreport=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[3]/a"));
		return myreport;
	}
	public static WebElement clickexportexcel() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnExportExcel']"));
		return myreport;
	}
	
	public static WebElement clickexportexcelopen() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		return myreport;
	}
	
	public static WebElement clickmore1() {
		myreport=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/button"));
		return myreport;
	}
	
	public static WebElement clickselectopenobservation() {
		myreport=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[1]/a/"));
		return myreport;
	
	}
	
	public static WebElement clickopenobservation() {
		myreport=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[2]/a"));
		return myreport;
	}
	
	public static WebElement clickdownloadopenobservation() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		return myreport;
	}
	public static WebElement clickmore2() {
		myreport=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/button"));
		
		return myreport;
	}
	public static WebElement clickmore22() {
		myreport=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[1]/a"));
		return myreport;
	}
	public static WebElement clickmore12() {
		myreport=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/button"));
		return myreport;
	}
	
	public static WebElement clickpastauditreport() {
		myreport=getDriver().findElement(By.xpath("//*[@id=\"rblRole1\"]/li[2]/div/ul/li[6]/a"));
		return myreport;
	}
	public static WebElement clickpastauditviewreport() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix_lblDownLoadfile_0']"));
		return myreport;
	}
	
	public static WebElement clickaddnewpastaudit() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddPromotor']"));
		return myreport;
	}
	public static WebElement clickaddnewpastauditframe() {
		myreport=getDriver().findElement(By.xpath("//*[@id='showdetails']"));
		return myreport; // i frame 
	}

	public static WebElement clickaddnewunit() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ddlLegalEntityPopPup_chosen']/a"));
		//*[@id="ddlLegalEntityPopPup_chosen"]/a
		return myreport;
	}
	public static WebElement clickaddnewselectunit() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ddlLegalEntityPopPup_chosen']/div/ul/li[2]"));
		return myreport;
	}
	public static WebElement clickaddnewsubunit() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ddlSubEntity1PopPup_chosen']/a"));
		//*[@id="ddlSubEntity1PopPup_chosen"]/a
		return myreport;
	}
	public static WebElement clickaddnewselectsubunit() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ddlSubEntity1PopPup_chosen']/div/ul/li[6]"));
		return myreport;
	}
	public static WebElement clickaddnewfinancialyear() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ddlFilterFinancialPopPup_chosen']/a"));
		//*[@id="ddlFilterFinancialPopPup_chosen"]/a
		return myreport;
	}
	public static WebElement clickaddnewselectfinancialyear() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ddlFilterFinancialPopPup_chosen']/div/ul/li[3]"));
		return myreport;
	}
	public static WebElement clickaddnewauditbackground() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ddlAuditBackground_chosen']/a"));
		return myreport;
	}
	public static WebElement clickaddnewauditselectbackground() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ddlAuditBackground_chosen']/div/ul/li"));
		return myreport;
	}
	public static WebElement clickaddnewaudituploadfile() {
		myreport=getDriver().findElement(By.xpath("//*[@id='FileUploadObservation']"));
		return myreport;
	}
	public static WebElement clickaddnewauditsave() {
		myreport=getDriver().findElement(By.xpath("//*[@id='btnSave']"));
		return myreport;
	}
	public static WebElement clickaddnewauditclose() {
		myreport=getDriver().findElement(By.xpath("//*[@id='btnCancel']"));
		return myreport;
	}
	
	public static WebElement clickpastauditview() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix_lblDownLoadfile_0']/img"));
		//*[@id="ContentPlaceHolder1_grdComplianceRoleMatrix_lblDownLoadfile_0"]/img
		return myreport;
	}
	public static WebElement clickpastauditviewframe() {
		myreport=getDriver().findElement(By.xpath("//*[@id='showdetails']"));
		return myreport;
	}
	
	public static WebElement clickdownloadpast() {
		myreport=getDriver().findElement(By.xpath("//*[@id='grdVersionDisplayDownload_lblDownLoadfile_0']"));
		//*[@id="grdVersionDisplayDownload_lblDownLoadfile_0"]
		return myreport;
	}
	public static WebElement clickviewpast() {
		myreport=getDriver().findElement(By.xpath("//*[@id='grdVersionDisplayDownload_LinkButton1_0']"));
		return myreport;
	}
	public static WebElement clickviewpastclose() {
		myreport=getDriver().findElement(By.xpath("//*[@id='DocumentPopUpREV']/div/div/div[1]/button"));
		return myreport;
	}
	public static WebElement clickviewpastclose1() {
		myreport=getDriver().findElement(By.xpath("//*[@id='divreports']/div/div/div[1]/button"));
		return myreport;
	}
	public static WebElement clickpastauditedit() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix_lblEditFile_0']"));
		return myreport;
	}
	public static WebElement clickpastauditeditframe() {
		myreport=getDriver().findElement(By.xpath("//*[@id='showdetails']"));
		return myreport;
	}
	public static WebElement clickpastauditeditsave() {
		myreport=getDriver().findElement(By.xpath("//*[@id='btnSave']"));
		//*[@id="btnSave"]
		return myreport;
	}
	public static WebElement clickpastauditeditclose() {
		myreport=getDriver().findElement(By.xpath("//*[@id='divreports']/div/div/div[1]/button"));
		//*[@id="btnCancel"]
		return myreport;
	}
	
	public static WebElement clickmore3() {
		myreport=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/button"));
		//*[@id="ContentPlaceHolder1_upComplianceTypeList"]/div/div/div/section/div[2]/li/div/button
		return myreport;
	}
	
	public static WebElement clickprerequsite() {
		myreport=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[4]/a"));
		return myreport;
	}
	public static WebElement clickentity() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
		//*("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
		return myreport;
	}
	public static WebElement clickselectentity() {
		myreport=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[5]"));
		return myreport;
	}
	public static WebElement clicksubentity() {
		subentity=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubEntity1_chosen']/a"));
	
		return subentity;
	}
	public static WebElement clickselectsubentity() {
		selectsubentity=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubEntity1_chosen']/div/ul/li[6]"));
		//*[@id="ContentPlaceHolder1_ddlSubEntity1_chosen"]/div/ul/li[6]
		return selectsubentity;
	}
	public static WebElement clickyear() {
		year=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']/a"));
		//*[@id="ContentPlaceHolder1_ddlFilterFinancial_chosen"]/a
		return year;
	}
	public static WebElement clickselectyear() {
		selectyear=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']/div/ul/li[1]"));
		//*[@id="ContentPlaceHolder1_ddlFilterFinancial_chosen"]/div/ul/li[1]
		return selectyear;
	}
	
	public static WebElement clickschedulingtype() {
		schedulingtype=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/a/span"));
		return schedulingtype;
	}
	public static WebElement clickselectschedulingtype() {
		selectschedulingtype=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/div/ul/li[2]"));
		//*[@id="ContentPlaceHolder1_ddlSchedulingType_chosen"]/div/ul/li[2]
		return selectschedulingtype;
	}
	public static WebElement clickperiod() {
		period=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/a/span"));
		return period;
	}
	public static WebElement clickselectperiod() {
		selectperiod=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/div/ul/li[2]"));
		return selectperiod;
	}
	public static WebElement clickprerequsiteexcelexport() {
		prerequsiteexcelexport=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		return prerequsiteexcelexport;
	}
	
	public static WebElement clickmore4() {
		myreport=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/button"));
		return myreport;
	}
	public static WebElement clickmanagementreport() {
		managementreport=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[5]/a"));
		//*[@id="rblRole1"]/li[2]/div/ul/li[5]/a
		return managementreport;
	}
	public static WebElement clickmanagementunit() {
		managementunit=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
		return managementunit;
	}
	public static WebElement clickmanagementselectunit() {
		managementselectunit=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[2]"));
		return managementselectunit;
	}
	public static WebElement clickmanagementsubunit() {
		managementsubunit=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubEntity1_chosen']/a"));
		return managementsubunit;
	}
	public static WebElement clickmanagementselectsubunit() {
		managementselectsubunit=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubEntity1_chosen']/div/ul/li[6]"));
		return managementselectsubunit;
	}
	public static WebElement clickmanagementfinancial() {
		managementfinancial=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']/a"));
		return managementfinancial;
	}
	public static WebElement clickmanagementselectfinancial() {
		managementselectfinancial=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']/div/ul/li[15]"));
		return managementselectfinancial;
	}
	public static WebElement clickmanagementschedulingtype() {
		managementschedulingtype=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/a"));
		return managementschedulingtype;
	}
	public static WebElement clickmanagementselectschedulingtype() {
		managementselectschedulingtype=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/div/ul/li[2]"));
		//*[@id="ContentPlaceHolder1_ddlSchedulingType_chosen"]/div/ul/li[2]
		return managementselectschedulingtype;
		
	}
	public static WebElement clickmanagementperiodtype() {
		managementperiodtype=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/a"));
		return managementperiodtype;
	}
	public static WebElement clickselectmanagementperiodtype() {
		selectmanagementperiodtype=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/div/ul/li[2]"));
		//*[@id="ContentPlaceHolder1_ddlPeriod_chosen"]/div/ul/li[2]
		return selectmanagementperiodtype;
	}
	public static WebElement clickselectmanagementexporttoexcel() {
		selectmanagementexporttoexcel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		return selectmanagementexporttoexcel;
	}
	public static WebElement clickmore5() {
		more5=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/button"));
		//*[@id="rblRole1"]/li[2]/div/button
		return more5;
	}
	
	public static WebElement clickmore51() {
		more5=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/button"));
		return more5;
	}
	
	public static WebElement clickDraftobservation() {
		Auditscheduling=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[2]/a"));
		return Auditscheduling;
	}
	
	public static WebElement clickdraftunit1() {
		draftunit=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[13]
		return draftunit;
	}
	public static WebElement clickdraftselectunit1() {
		draftselectunit=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[13]"));
		//*[@id="ContentPlaceHolder1_grdProcessAudits_lnkAuditDetails_0"]/img
		return draftselectunit;
	}
	
	public static WebElement clickdraftview() {
		draftselectunit=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits_lnkAuditDetails_0']/img"));
		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[13]
		return draftselectunit;
	}
	
	public static WebElement clickdraftexporttoexcel() {
		draftselectunit=getDriver().findElement(By.xpath("//*[@id='//*[@id='ContentPlaceHolder1_lblExport']"));
		//*[@id="ContentPlaceHolder1_lblExport"]
		return draftselectunit;
	}
	
	
	public static WebElement clickmore55() {
		more55=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/button"));
		return more55;
	}
	public static WebElement clickAuditscheduling() {
		Auditscheduling=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[4]/a"));
		//*[@id="rblRole1"]/li[2]/div/ul/li[4]/a
		return Auditscheduling;
	}
	public static WebElement clickdraftreport() {
		draftreport=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[2]/a"));
		return draftreport;
	}
	public static WebElement clickdraftunit() {
		draftunit=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
		return draftunit;
	}
	public static WebElement clickdraftselectunit() {
		draftselectunit=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[3]"));
		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[3]
		return draftselectunit;
	}
	public static WebElement clickdraftsubunit() {
		draftsubunit=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubEntity1_chosen']/a"));
		//*[@id="ContentPlaceHolder1_ddlFinancialYear_chosen"]/a
		return draftsubunit;
	}
	public static WebElement clickdraftselectsubunit() {
		draftselectsubunit=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubEntity1_chosen']/div/ul/li[6]"));
		return draftselectsubunit;
	}
	public static WebElement clickdraftfinancial() {
		draftfinancial=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/a"));
		return draftfinancial;
	}
	public static WebElement clickdraftselectfinancial() {
		draftselectfinancial=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']/div/ul/li[16]"));
		//*[@id="ContentPlaceHolder1_ddlFinancialYear_chosen"]/div/ul/li[16]
		return draftselectfinancial;
	}
	public static WebElement clickdraftschedulingtype() {
		draftschedulingtype=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/a"));
		return draftschedulingtype;
	}
	public static WebElement clickdraftselectschedulingtype() {
		draftselectschedulingtype=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/div/ul/li[2]"));
		return draftselectschedulingtype;
	}
	public static WebElement clickdraftperiodtype() {
		draftperiodtype=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/a"));
		return draftperiodtype;
	}
	public static WebElement clickselectdraftperiodtype() {
		selectdraftperiodtype=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/div/ul/li[2]"));
		return selectdraftperiodtype;
		//*[@id="ContentPlaceHolder1_ddlPeriod_chosen"]/div/ul/li[2]
	}
	public static WebElement clickselectdraftexporttoexcel() {
		selectdraftexporttoexcel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		//*[@id="ContentPlaceHolder1_lbtnExportExcel"]
		return selectdraftexporttoexcel;
	}
	
	public static WebElement clickcross1() {
		sendmail1=getDriver().findElement(By.xpath("//*[@id='divPreShowDialog']/div/div/div[1]/button"));
		return sendmail1;
	}
	public static WebElement clickcountrew2() {
		sendmail1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lblRiskCompleted_0']"));
		return sendmail1;
	}
	public static WebElement clickaudithistory() {
		sendmail1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_bntAuditHistory_0']"));
		return sendmail1;
		}
	public static WebElement clickaudithistoryclose() {
		sendmail1=getDriver().findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
		return sendmail1;
		}
	public static WebElement clickauditchangestatus() {
		sendmail1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_btnChangeStatus_0']"));
		return sendmail1;
		}
	public static WebElement clickframe() {
			sendmail1=getDriver().findElement(By.xpath("//*[@id='showdetails']"));
		return sendmail1;
		}
	public static WebElement clickdownloadfinal() {
		sendmail1=getDriver().findElement(By.xpath("//*[@id='rptIMPComplianceDocumnets_btnComplianceDocumnetsIMP_0']"));
		return sendmail1;
		}
	public static WebElement clickenterremark() {
		sendmail1=getDriver().findElement(By.xpath("//*[@id='txtIMPFinalStatusRemark']"));
		return sendmail1;
		}

	public static WebElement clickreviewhistory() {
		sendmail1=getDriver().findElement(By.xpath("//*[@id='btnReviewHistory']"));
		return sendmail1;
		}
	public static WebElement clickreviewremarkimp() {
		sendmail1=getDriver().findElement(By.xpath("//*[@id='txtIMPReviewRemark']"));
		return sendmail1;
		}
	public static WebElement clickselectstatus1() {
		sendmail1=getDriver().findElement(By.xpath("//*[@id='rdbtnStatusNEW_1']"));
		return sendmail1;
		}
	public static WebElement clickselectstatus22() {
		sendmail1=getDriver().findElement(By.xpath("//*[@id='rdbtnStatusNEW_0']"));
		return sendmail1;
		}
	public static WebElement clicksubmitbutton() {
		sendmail1=getDriver().findElement(By.xpath("//*[@id='btnIMPSave']"));
		return sendmail1;
		}
	public static WebElement clickclosepopup() {
		sendmail1=getDriver().findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
		//*[@id="divShowDialog"]/div/div/div[1]/button
		return sendmail1;
		}
	public static WebElement clickbackbuttonimp() {
		sendmail1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']"));
		return sendmail1;
		}
	
	public static WebElement clickauditee() {
		auditee=getDriver().findElement(By.xpath("//*[@id='ddlPerformerFilter_chosen']/a/span"));
		return auditee;
	}
	public static WebElement clickselectauditee() {
		selectauditee=getDriver().findElement(By.xpath("//*[@id='ddlPerformerFilter_chosen']/div/ul/li[5]"));
		return selectauditee;
	}
	public static WebElement clickreportingmanager() {
		reportingmanager=getDriver().findElement(By.xpath("//*[@id='ddlReviewerFilter_chosen']/a/span"));
		return reportingmanager;
	}
	public static WebElement clickselectreportingmanager() {
		selectreportingmanager=getDriver().findElement(By.xpath("//*[@id='ddlReviewerFilter_chosen']/div/ul/li[3]"));
		return selectreportingmanager;
	}
	public static WebElement clicktimeline() {
		timeline=getDriver().findElement(By.xpath("//*[@id='txtStartDateKickoff']"));
		return timeline;
	}
	public static WebElement clicksaveviewdata() {
		saveviewdata=getDriver().findElement(By.xpath("//*[@id='btnSave']"));
		return saveviewdata;
	}
	public static WebElement clickdata() {
		data=getDriver().findElement(By.xpath("//*[@id='ValidationSummary3']/ul/li"));
		return data;
	}
	public static WebElement clickaddnewuser() {
		addnewuser=getDriver().findElement(By.xpath("//*[@id='lnkAddNewUser']"));
		return addnewuser;
	}
	public static WebElement clickframe1() {
		frame1=getDriver().findElement(By.xpath("//*[@id='IUser']"));
		return frame1;
	}
	public static WebElement clickfirstname() {
		firstname=getDriver().findElement(By.xpath("//*[@id='tbxFirstName']"));
		return firstname;
	}
	public static WebElement clicklastname() {
		lastname=getDriver().findElement(By.xpath("//*[@id='tbxLastName']"));
		return lastname;
	}
	public static WebElement clickDesignation() {
		Designation=getDriver().findElement(By.xpath("//*[@id='tbxDesignation']"));
		return Designation;
	}
	public static WebElement clickEmail() {
		Email=getDriver().findElement(By.xpath("//*[@id='tbxEmail']"));
		return Email;
	}
	public static WebElement clickcontactno() {
		contactno=getDriver().findElement(By.xpath("//*[@id='tbxContactNo']"));
		return contactno;
	}
	public static WebElement clicknewusersave() {
		newusersave=getDriver().findElement(By.xpath("//*[@id='btnSave']"));
		return newusersave;
	}
	public static WebElement clicknewusersavemessage() {
		newusersavemessage=getDriver().findElement(By.xpath("//*[@id='ValidationSummary15']/ul/li"));
		return newusersavemessage;
	}
	public static WebElement clicknewuserclose() {
		newuserclose=getDriver().findElement(By.xpath("//*[@id='btnCancel']"));
		return newuserclose;
	}
	public static WebElement clickviewremark() {
		viewremark=getDriver().findElement(By.xpath("//*[@id='grdProcessAudit_LinkButton4_1']/img"));
		//*[@id="grdProcessAudit_LinkButton4_1"]/img
		return viewremark;
	}
	public static WebElement clickviewremarkclose() {
		viewremark=getDriver().findElement(By.xpath("//*[@id='btnCancel']"));
		return viewremark;
	}
	public static WebElement clickadddocument1() {
		adddocumentsave=getDriver().findElement(By.xpath("//*[@id='grdProcessAudit_LinkButton1_0']/img"));
		return adddocumentsave;
	}
	public static WebElement clickadddocumentname() {
		adddocumentname=getDriver().findElement(By.xpath("//*[@id='tbxCheckListName']"));
		return adddocumentname;
	}
	public static WebElement clickadddocumentsave() {
		adddocumentsave=getDriver().findElement(By.xpath("//*[@id='btnAddCheckList']"));
		return adddocumentsave;
	}
	
	public static WebElement clickexporttoexcel() {
		exporttoexcel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		//*[@id="ContentPlaceHolder1_lblExport"]
		return exporttoexcel;
	}
	public static WebElement clickexporttoexcelin() {
		exporttoexcel=getDriver().findElement(By.xpath("	//*[@id='ContentPlaceHolder1_lblExport']"));
		//*[@id="ContentPlaceHolder1_lblExport"]
		return exporttoexcel;
	}
	public static WebElement clickdraftobservation() {
		draftobservation=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtObservationList']"));
		return draftobservation;
	}
	public static WebElement clickprocess() {
		process=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']/a"));
		return process;
	}
	public static WebElement clickselectprocess() {
		selectprocess=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']/div/ul/li[1]"));
		return selectprocess;
	}
	static WebElement clickdraftexportexcel() {
		draftexportexcel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblExport']"));
		return draftexportexcel;
	}
	
	public static WebElement ObservationList_CheckBox() {
		ObservationList_CheckBox=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_CheckBox1_0']"));
		return ObservationList_CheckBox;
	}
	public static WebElement ObservationList_Save() {
		ObservationList_Save=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
		return ObservationList_Save;
	}
	public static WebElement ObservationList_SaveMsg() {
		ObservationList_SaveMsg=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return ObservationList_SaveMsg;
	}
	public static WebElement clickremoveobservation() {
		removeobservation=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_lnkAuditDetails_0']/img"));
		return removeobservation;
	}
	public static WebElement clickbackbtn() {
		backbtn=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']"));
		return backbtn;
	}
	public static WebElement clicknewmail11() {
		newmail1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkClosingMeeting']"));
		//*[@id="ContentPlaceHolder1_grdRiskActivityMatrix_lnkClosingMeeting_0"]
		//*[@id="ContentPlaceHolder1_grdRiskActivityMatrix_lnkClosingMeeting_0"]/img
		return newmail1;
	}
	
	public static WebElement clicknewmail113() {
		newmail1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lnkClosingMeeting_0']"));
		//*[@id="ContentPlaceHolder1_grdRiskActivityMatrix_lnkClosingMeeting_0"]
		//*[@id="ContentPlaceHolder1_grdRiskActivityMatrix_lnkClosingMeeting_0"]/img
		return newmail1;
	}
	public static WebElement clicknewmail12() {
		newmail1=getDriver().findElement(By.xpath("//*[@id='btnNewMail']"));
		return newmail1;
	}
	
	public static WebElement clickto2() {
		newmail1=getDriver().findElement(By.xpath("//*[@id='example']/div[2]/div/div"));
		return newmail1;
	}
	public static WebElement clickselectto2() {
		newmail1=getDriver().findElement(By.xpath("//*[@id='email_listbox']/li[7]"));
		//*[@id="email"]/option[7]
		return newmail1;
	}
	public static WebElement clicksendmail2() {
		newmail1=getDriver().findElement(By.xpath("//*[@id='example']/div[7]/button"));
		return newmail1;
	}
	public static WebElement clickcross3() {
		newmail1=getDriver().findElement(By.xpath("//*[@id='divPreShowDialog']/div/div/div[1]/button"));
		return newmail1;
	}
	
	public static WebElement clickcheckboox() {
		checkboox=getDriver().findElement(By.xpath("//*[@id=\"grd_csa\"]/div[2]/table/tbody/tr[1]/td[1]/input"));
		//*[@id="grd_csa"]/div[2]/table/tbody/tr[1]/td[1]/input
		return checkboox;
	}
	public static WebElement clickstatus() {
		checkboox=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_DropDownListPersonResponsible']"));
		return checkboox;
	}
	public static WebElement clickselectstatus2() {
		checkboox=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_DropDownListPersonResponsible']/option[2]"));
		return checkboox;
	}
	public static WebElement clicksave() {
		checkboox=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAllSavechk']"));
		return checkboox;
	}
	public static WebElement clicksavemessagess() {
		checkboox=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return checkboox;
	}
public static WebElement Close() {
		
		Close=getDriver().findElement(By.xpath("//*[@id='divCheckListAddDocument']/div/div/div[1]/button"));
		return Close;
	}

	
	public static WebElement TypeToSearchBox() {
		
		TypeToSearchBox=getDriver().findElement(By.xpath("//input[@id='tbxTypeToSearch']"));
		return TypeToSearchBox;
	}


	
	public static WebElement ClickOperation() {
		
		ClickOperation=getDriver().findElement(By.xpath("//*[@id='DropDownListPageNo_chosen']"));
		return ClickOperation;
	}


	
	public static WebElement Close1() {
		
		Close1=getDriver().findElement(By.xpath("//*[@id='divAddPreRequisite']/div/div/div[1]/button"));
		return Close1;
	}

public static WebElement ActDetail() {
		
		ActDetail=getDriver().findElement(By.xpath("//*[@id='ActDetails']/div/div/div/div[1]/div/div"));
		return ActDetail;
	}

public static WebElement SelectProcess2() {
	
	SelectProcess2=getDriver().findElement(By.xpath("//*[@id='ddlProcess_chosen']"));
	return SelectProcess2;
}


public static WebElement SelectProcess2DD() {
	
	SelectProcess2DD=getDriver().findElement(By.xpath("//div[@id='ddlProcess_chosen']//li[.='Business to business']"));
	return SelectProcess2DD;
}


public static WebElement SelectSubProcess2() {
	
	SelectSubProcess2=getDriver().findElement(By.xpath("//*[@id='ddlSubProcess_chosen']"));
	return SelectSubProcess2;
}

	
public static WebElement SelectSubProcess2DD() {
	
	SelectSubProcess2DD=getDriver().findElement(By.xpath("//li[.='businesstonewo']"));
	return SelectSubProcess2DD;
}




public static WebElement ReminderCheckBox() {
	
	ReminderCheckBox=getDriver().findElement(By.xpath("//input[@id='grdRiskActivityMatrix_rechild_0']"));
	return ReminderCheckBox;
}


public static WebElement EscalationCheckBox() {
	
	EscalationCheckBox=getDriver().findElement(By.xpath("//input[@id='grdRiskActivityMatrix_eschild_0']"));
	return EscalationCheckBox;
}


public static WebElement SendMailA() {
	
	SendMailA=getDriver().findElement(By.xpath("//input[@id='btnReminderEscalation']"));
	return SendMailA;
}

public static WebElement SelectProcess() {
	
	SelectProcess=getDriver().findElement(By.xpath("//*[@id='ddlProcess_sl']"));
	return SelectProcess;
}
	


public static WebElement CheckBox() {
	
	CheckBox=getDriver().findElement(By.xpath("//*[@id='ddlProcess_0']"));
	return CheckBox;
}

public static WebElement SelectProcessDD() {
	
	SelectProcessDD=getDriver().findElement(By.xpath("//*[@id='ddlProcess']/label"));
	return SelectProcessDD;
}

public static WebElement OKP() {
	
	OKP=getDriver().findElement(By.xpath("//*[@id='buttons']/input[1]"));
	return OKP;
}


public static WebElement SelectSubProcess() {
	
	SelectSubProcess=getDriver().findElement(By.xpath("//*[@id='ddlSubProcess_sl']"));
	return SelectSubProcess;
}


public static WebElement SelectSubProcessDD() {
	
	SelectSubProcessDD=getDriver().findElement(By.xpath("//*[@id='ddlSubProcess']/label"));
	return SelectSubProcessDD;
}


public static WebElement OKSP() {
	
	OKSP=getDriver().findElement(By.xpath("(//div[@id='buttons']/input[1])[2]"));
	return OKSP;
}


public static WebElement SelectDocumentRequired() {
	
	SelectDocumentRequired=getDriver().findElement(By.xpath("//*[@id='ddlDocRequire_sl']"));
	return SelectDocumentRequired;
}


public static WebElement SelectDocumentRequiredDD() {
	
	SelectDocumentRequiredDD=getDriver().findElement(By.xpath("//*[@id='ddlDocRequire']/label[1]"));
	return SelectDocumentRequiredDD;
}

public static WebElement OK3() {
	
	OK3=getDriver().findElement(By.xpath("(//div[@id='buttons']/input[1])[3]"));
	return OK3;
}

public static WebElement ForceMail1() {
	
	ForceMail1=getDriver().findElement(By.xpath("//label[contains(text(),'Audit Name')]/following-sibling::button"));
	return ForceMail1;
}

public static WebElement ForceMail() {
	
	ForceMail=getDriver().findElement(By.xpath("//*[@id='lnkClosingMeeting']/img"));
	return ForceMail;
}

public static WebElement TO() {
	
	TO=getDriver().findElement(By.xpath("//*[@id='example']/div[2]/div/div"));
	return TO;
}



public static WebElement TODD() {
	
	TODD=getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[.='ambujsachan98@gmail.com']"));
	return TODD;
}


public static WebElement Subject() {
	
	Subject=getDriver().findElement(By.xpath("//input[@id='txtSubject']"));
	return Subject;
}


public static WebElement FileUpload() {
	
	FileUpload=getDriver().findElement(By.xpath("//input[@id='AFUpload']"));
	return FileUpload;
}


public static WebElement UploadButton1() {
	
	UploadButton1=getDriver().findElement(By.xpath("//button[@id='btnAFUpload']"));
	return UploadButton1;
}


public static WebElement SendMail() {
	
	SendMail=getDriver().findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
	return SendMail;
}



public static WebElement Summery() {
	
	Summery=getDriver().findElement(By.xpath("//li[@id='liMailDetail']"));
	return Summery;
}



public static WebElement View() {
	
	View=getDriver().findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-view k-grid-view'])[1]"));
	return View;
}


public static WebElement FileUpload1() {
	
	FileUpload1=getDriver().findElement(By.xpath("(//input[@id='fuUpload'])[1]"));
	return FileUpload1;
}


public static WebElement Download() {
	
	Download=getDriver().findElement(By.xpath("//*[@id='AuditMailLogGrid']/div[2]/table/tbody/tr[1]/td[6]/a"));
	return Download;
}

public static WebElement InternalAuditMeeting() {
	
	InternalAuditMeeting=getDriver().findElement(By.xpath("//*[@id=\"grd_csa\"]/div[2]/table/tbody/tr[1]/td[6]/a[4]/img"));
	//*[@id="grd_csa"]/div[2]/table/tbody/tr[1]/td[6]/a[4]/img
	return InternalAuditMeeting;
}

public static WebElement NewMailButton() {
	
	NewMailButton=getDriver().findElement(By.xpath("//button[@id='btnNewMail']"));
	return NewMailButton;
}

public static WebElement Timeline() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='txtStartDateKickoff']"));
	return ARS;
}

public static WebElement TimelineDD() {
	
	ARS=getDriver().findElement(By.xpath("//a[.='30']"));
	return ARS;
}

public static WebElement AddDocumentAndRemark() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='grdProcessAudit_LinkButton1_0']/img"));
	//*[@id="grdProcessAudit_LinkButton1_0"]/img
	return ARS;
}

public static WebElement ChooseFile() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='fileUploadDocument']"));
	return ARS;
}


public static WebElement Save5() {
	
	//ARS=getDriver().findElement(By.xpath("//input[@id='btnSaveRemarkDoc']"));
	ARS=getDriver().findElement(By.xpath("//*[@id='btnAddCheckList']"));
	
	
	return ARS;
}



public static WebElement Successfully5() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ValidationSummary1']/ul"));
	return ARS;
}

public static WebElement CloseButton5() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='btnCancel']"));
	return ARS;
}


public static WebElement Deletefile() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='rptComplianceDocumnets_lbtLinkDocbutton_0']/img"));
	return ARS;
}

public static WebElement Successfully4() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ValidationSummary2']/ul/li"));
	return ARS;
}

public static WebElement Plus() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='grdProcessAudit_LinkButton1_0']/img"));
	return ARS;
}

public static WebElement DocumentName1() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='tbxCheckListName']"));
	return ARS;
}

public static WebElement Save3() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='btnAddCheckList']"));
	return ARS;
}

public static WebElement Successfull() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ValidationSummary1']/ul/li"));
	return ARS;
}

public static WebElement MyDocument() {
	
	MyDocument=getDriver().findElement(By.xpath("//li[@id='leftdocumentmenu']"));
	return MyDocument;
}

public static WebElement WorkingDocument() {
	
	WorkingDocument=getDriver().findElement(By.xpath("//select[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[1]"));
	return WorkingDocument;
}


public static WebElement DownloadButton() {
	
	DownloadButton=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
	//*[@id="ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0"]
	return DownloadButton;
}


public static WebElement Succssesfully() {
	
	Succssesfully=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return Succssesfully;
}



public static WebElement OpenAuditFilter() {
	
	OpenAuditFilter=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlStatusDocument_chosen']"));
	return OpenAuditFilter;
}


public static WebElement OpenAuditFilterDD() {
	
	OpenAuditFilterDD=getDriver().findElement(By.xpath("//li[.='Open Audit']"));
	return OpenAuditFilterDD;
}


public static WebElement FinancialYear() {
	
	FinancialYear=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']"));
	return FinancialYear;
}


public static WebElement FinancialYearDD() {
	
	FinancialYearDD=getDriver().findElement(By.xpath("//li[.='2023-2024']"));
	return FinancialYearDD;
}

public static WebElement ImageviewButton() {
	
	FinancialYearDD=getDriver().findElement(By.xpath("//*[@id='UploadImagegrid']/div[2]/table/tbody/tr[1]/td[3]/a[1]"));
	//*[@id="UploadImagegrid"]/div[2]/table/tbody/tr[1]/td[3]/a[1]
	return FinancialYearDD;
}

public static WebElement ImageviewButtonclose() {
	
	FinancialYearDD=getDriver().findElement(By.xpath("//*[@id='divViewDocument']/div/div/div[2]/div/div/div/a"));
	//*[@id="divViewDocument"]/div/div/div[2]/div/div/div/a
	return FinancialYearDD;
}

public static WebElement ImagedeleteButton() {
	
	FinancialYearDD=getDriver().findElement(By.xpath("//*[@id='UploadImagegrid']/div[2]/table/tbody/tr[1]/td[3]/a[2]"));
	//*[@id="UploadImagegrid"]/div[2]/table/tbody/tr[1]/td[3]/a[2]
	return FinancialYearDD;
}

public static WebElement WorkingFiledownloadButton() {
	
	WorkingFileDownload=getDriver().findElement(By.xpath("//*[@id='WorkinFile1grid']/div[2]/table/tbody/tr[1]/td[3]/a[1]"));
	//*[@id="WorkinFile1grid"]/div[2]/table/tbody/tr[1]/td[3]/a[1]
	return WorkingFileDownload;
}

public static WebElement WorkingFileDownloadnew() {
	
	WorkingFileDownload=getDriver().findElement(By.xpath("//*[@id='WorkinFile1grid']/div[2]/table/tbody/tr[1]/td[3]/a[1]"));
	//*[@id="WorkinFile1grid"]/div[2]/table/tbody/tr[1]/td[3]/a[1]
	return WorkingFileDownload;
}

public static WebElement Workingdownloadbutton1() {
	
	WorkingFileDownload=getDriver().findElement(By.xpath("//*[@id='WorkingFileTwoFilegrid']/div[2]/table/tbody/tr/td[3]/a[1]"));
	//*[@id="WorkinFile1grid"]/div[2]/table/tbody/tr[1]/td[3]/a[1]
	return WorkingFileDownload;
}

public static WebElement DeleteWorkingFile() {
	
	DeleteWorkingFile=getDriver().findElement(By.xpath("//*[@id='WorkinFile1grid']/div[2]/table/tbody/tr[1]/td[3]/a[2]"));
	return DeleteWorkingFile;
}

public static WebElement DeleteWorkingFile1() {
	
	DeleteWorkingFile=getDriver().findElement(By.xpath("//*[@id='WorkinFile1grid']/div[2]/table/tbody/tr/td[3]/a[2]"));
	return DeleteWorkingFile;
}

public static WebElement AnnexureFileDownload() {
	
	AnnexureFileDownload=getDriver().findElement(By.xpath("//*[@id='AnnexureFilegrid']/div[2]/table/tbody/tr[1]/td[3]/a[1]"));
	return AnnexureFileDownload;
}


public static WebElement Addobservation() {
	
	AnnexureFileDelete=getDriver().findElement(By.xpath("//*[@id='btnAddObservation']"));
	return AnnexureFileDelete;
}

public static WebElement AnnexureFileDelete() {
	
	AnnexureFileDelete=getDriver().findElement(By.xpath("//*[@id='AnnexureFilegrid']/div[2]/table/tbody/tr[1]/td[3]/a[2]"));
	return AnnexureFileDelete;
}

public static WebElement ObservationWorkingFileDownload() {
	
	AnnexureFileDelete=getDriver().findElement(By.xpath("//*[@id='WorkingFileTwoFilegrid']/div[2]/table/tbody/tr[1]/td[3]/a[1]"));
	return AnnexureFileDelete;
}

public static WebElement ObservationWorkingFileDelete() {
	
	AnnexureFileDelete=getDriver().findElement(By.xpath("//*[@id='WorkingFileTwoFilegrid']/div[2]/table/tbody/tr[1]/td[3]/a[2]"));
	return AnnexureFileDelete;
}


public static WebElement SelectProcess1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ddlProcess1_chosen']"));
	return ARS;
}


public static WebElement SelectProcess1DD() {
	
	ARS=getDriver().findElement(By.xpath("(//li[.='Business to business'])[1]"));
	return ARS;
}


public static WebElement SelectSubProcess1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ddlSubProcess1_chosen']"));
	return ARS;
}


public static WebElement SelectSubProcess1DD() {
	
	ARS=getDriver().findElement(By.xpath("//li[.='businesstonewo']"));
	return ARS;
}


public static WebElement Audtee() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ddlPerformerFilter_chosen']"));
	return ARS;
}



public static WebElement AudteeDD() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ddlPerformerFilter_chosen']/div/ul/li[4]"));
	return ARS;
}


public static WebElement ReportingManager1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ddlReviewerFilter_chosen']"));
	return ARS;
}


public static WebElement ReportingManager1DD() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ddlReviewerFilter_chosen']/div/ul/li[4]"));
	return ARS;
}

public static WebElement Save7() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='btnSave']"));
	return ARS;
}



public static WebElement Successfully7() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ValidationSummary3']/ul/li"));
	return ARS;
}



public static WebElement ExportToExcel() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_lbtnExportExcel']"));
	return ARS;
}



public static WebElement NewMail() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_lnkClosingMeeting']"));
	return ARS;
}

/*
public static WebElement NewMail1() {
	
	NewMail1=getDriver().findElement(By.xpath("//button[@id='btnNewMail']"));
	return NewMail1;
}

*/


public static WebElement NewMailButton1() {
	
	ARS=getDriver().findElement(By.xpath("//form/div[9]/div/div/div[2]/div/div/div[1]/div/button[@id='btnNewMail']"));
	return ARS;
}



public static WebElement DraftObservationListing() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_lbtObservationList']"));
	return ARS;
}


public static WebElement DraftExportToExcel() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_lblExport']"));
	return ARS;
}


public static WebElement EyeIcon() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_lnkViewAudit_0']/img"));
	return ARS;
}


public static WebElement Export() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_lblExport']"));
	return ARS;
}


public static WebElement Back() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnBack']"));
	return ARS;
}


public static WebElement DeleteDraft() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_lnkAuditDetails_0']/img"));
	return ARS;
}



public static WebElement BackButton1() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnBack']"));
	return ARS;
}


public static WebElement AddUserPlusIcon() {
	
	ARS=getDriver().findElement(By.xpath("//img[@id='lnkAddNewUser']"));
	return ARS;
}



public static WebElement Frame4() {
	
	ARS=getDriver().findElement(By.xpath("//iframe[@id='IUser']"));
	return ARS;
}


public static WebElement FirstName() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='tbxFirstName']"));
	return ARS;
}


public static WebElement LastName() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='tbxLastName']"));
	return ARS;
}


public static WebElement Designation() {
	
	Designation=getDriver().findElement(By.xpath("//input[@id='tbxDesignation']"));
	return Designation;
}


public static WebElement Email() {
	
	Email=getDriver().findElement(By.xpath("//input[@id='tbxEmail']"));
	return Email;
}


public static WebElement ContactNo() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='tbxContactNo']"));
	return ARS;
}


public static WebElement Save2() {
	
	ARS=getDriver().findElement(By.xpath("//div[@id='upUsers']//input[@id='btnSave' and @class='btn btn-primary']"));
	return ARS;
}


public static WebElement SuccessfullyUser() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ValidationSummary15']/ul/li"));
	return ARS;
}


public static WebElement SuccessfullyUser1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ValidationSummary15']/ul"));
	return ARS;
}



public static WebElement CloseButton() {
	
	ARS=getDriver().findElement(By.xpath("//div[@id='upUsers']//input[@id='btnCancel']"));
	return ARS;
}




public static WebElement CloseP() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='divCheckListAdd']/div/div/div[1]/button"));
	return ARS;
}


public static WebElement AuditDD() {
	
	ARS=getDriver().findElement(By.xpath("//select[@id='grdProcessAudit_ddlPerformer_0']/option[2]"));
	return ARS;
}




public static WebElement ReportingManager() {
	
	ARS=getDriver().findElement(By.xpath("//select[@id='grdProcessAudit_ddlReviewer_0']/option[2]"));
	return ARS;
}









public static WebElement ViewImage() {
	
	ARS=getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-view k-grid-view']"));
	return ARS;
}


public static WebElement CloseImagePopUp() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='divViewDocument']/div/div/div[2]/div/div/div/a[.='X']"));
	return ARS;
}



public static WebElement DeleteImage() {
	
	ARS=getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-delete k-grid-delete']"));
	return ARS;
}


public static WebElement ViewFile() {
	
	ARS=getDriver().findElement(By.xpath("(//a[@role='button'])[13]"));
	return ARS;
}


public static WebElement DownloadFile() {
	
	ARS=getDriver().findElement(By.xpath("(//a[@role='button'])[14]"));
	return ARS;
}





public static WebElement MyReport() {
	
	ARS=getDriver().findElement(By.xpath("//li[@id='leftreportsmenu']"));
	return ARS;
}



public static WebElement DraftReportChooseFile() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_DraftFileUpload_0']"));
	return ARS;
}


public static WebElement UploadBtton1() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_UploadDraft_0']"));
	return ARS;
}


public static WebElement DownloadBtton1() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadDraftFile_0']"));
	return ARS;
}


public static WebElement FinalDeliverableChooseFile() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_FinalveriablesFileUpload_0']"));
	return ARS;
}


public static WebElement UploadButton2() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_UploadFinalveriables_0']"));
	return ARS;
}


public static WebElement DownloadButton2() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile1_0']"));
	return ARS;
}


public static WebElement AuditComiteeChooseFile() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_AuditcommitteeFileUpload_0']"));
	return ARS;
}


public static WebElement UploadButton3() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_UploadAuditcommittee_0']"));
	return ARS;
}



public static WebElement DownloadButton3() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
	return ARS;
}


public static WebElement FeedbackFormChooseFile() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_FeedbackFileUpload_0']"));
	return ARS;
}


public static WebElement UploadButton4() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_UploadFeedback_0']"));
	return ARS;
}


public static WebElement DownloadButton4() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblFeedbackDownLoadfile1_0']"));
	return ARS;
}


public static WebElement AllFileDownloadButton5() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfileActionAll_0']"));
	return ARS;
}


public static WebElement SuccessfullyReport() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return ARS;
}


public static WebElement MoreReport() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div//button"));
	return ARS;
}


public static WebElement MoreReportOpenObservationReport() {
	
	ARS=getDriver().findElement(By.xpath("(//*[@id='rblRole1']/li[2]/div/ul/li[.='Open Observation-Excel'])[1]"));
	return ARS;
}


public static WebElement MROpenObservationReportExportReport() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_lbtnExportExcel']"));
	return ARS;
}



public static WebElement MROpenObservationCompany() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
	return ARS;
}



public static WebElement MROpenObservationCompanyDD() {
	
	ARS=getDriver().findElement(By.xpath("//li[.='Eicher tractor']"));
	return ARS;
}


public static WebElement FinancialYearMReport() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']"));
	return ARS;
}


public static WebElement FinancialYearMReportDD() {
	
	ARS=getDriver().findElement(By.xpath("//li[.='2023-2024']"));
	return ARS;
}



public static WebElement SelectSchedulingType() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']"));
	return ARS;
}


public static WebElement SelectSchedulingTypeDD() {
	
	ARS=getDriver().findElement(By.xpath("//li[.='Half Yearly']"));
	return ARS;
}


public static WebElement Status() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlStatusList_chosen']"));
	return ARS;
}


public static WebElement StatusDD() {
	
	ARS=getDriver().findElement(By.xpath("//li[.='Open']"));
	return ARS;
}



public static WebElement Period() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']"));
	return ARS;
}


public static WebElement PeriodDD() {
	
	ARS=getDriver().findElement(By.xpath("//li[.='Apr-Sep']"));
	return ARS;
}


public static WebElement AuditScheduling() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[2]"));
	return ARS;
}


public static WebElement AuditSchedulingExportToExcelButton() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_lbtnExportExcel']"));
	return ARS;
}



public static WebElement AuditStatus() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[3]"));
	return ARS;
}


public static WebElement AuditStatusExportToExcelButton() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnExportExcel']"));
	return ARS;
}


public static WebElement NotDoneTab() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnNotDone']"));
	return ARS;
}



public static WebElement SubmittedTab() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnSubmitted']"));
	return ARS;
}



public static WebElement TeamReviewTab() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnTeamReview']"));
	return ARS;
}


public static WebElement AuditeeReviewTab() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnAuditee']"));
	return ARS;
}


public static WebElement FinalReviewTab() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnFinalReview']"));
	return ARS;
}


public static WebElement ClosedTab() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnClosed']"));
	return ARS;
}



public static WebElement CheckBox2() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdObservationList_CheckBox1_0']"));
	return ARS;
}

public static WebElement Save4() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnSave']"));
	return ARS;
}


public static WebElement SuccessfullyObservation1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return ARS;
}




public static WebElement WorkingDocument1() {
	
	ARS=getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-download k-grid-download']"));
	return ARS;
}


public static WebElement AnnexureDocument1() {
	
	ARS=getDriver().findElement(By.xpath("(//a[@class='k-button k-button-icontext ob-download k-grid-download'])[5]"));
	return ARS;
}



public static WebElement View2() {
	
	ARS=getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext obs-show k-grid-view']"));
	return ARS;
}



public static WebElement Close4() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='divPreShowDialog']/div/div/div[1]/button[.='×']"));
	return ARS;
}



public static WebElement GridPage() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_DropDownListPageNo_chosen']"));
	return ARS;
}



public static WebElement GridPageDD() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_DropDownListPageNo_chosen']/div/ul/li[2]"));
	return ARS;
}

public static WebElement PreRequisiteLogReport() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[4]"));
	return ARS;
}


public static WebElement FinancialYearp() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']"));
	return ARS;
}


public static WebElement SchedulingTypeP() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']"));
	return ARS;
}



public static WebElement SchedulingTypePDD() {
	
	ARS=getDriver().findElement(By.xpath("//li[.='Half Yearly']"));
	return ARS;
}



public static WebElement Periodp() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']"));
	return ARS;
}


public static WebElement PeriodpDD() {
	
	ARS=getDriver().findElement(By.xpath("//li[.='Apr-Sep']"));
	return ARS;
}



public static WebElement ExportToExcelButton() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_lbtnExportExcel']"));
	return ARS;
}



public static WebElement ManagementResponcelogreport() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[5]"));
	return ARS;
}


public static WebElement PastAuditReports() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[6]"));
	return ARS;
}





public static WebElement AddNewPastAuditReport() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnAddPromotor']"));
	return ARS;
}



public static WebElement ReportIssueByTextBox() {
	
	ARS=getDriver().findElement(By.xpath("//textarea[@id='tbxIssueBy']"));
	return ARS;
}


public static WebElement ReportTitleTextBox() {
	
	ARS=getDriver().findElement(By.xpath("//textarea[@id='tbxTitle']"));
	return ARS;
}



public static WebElement RemarkTextBox() {
	
	ARS=getDriver().findElement(By.xpath("//textarea[@id='tbxRemark']"));
	return ARS;
}


public static WebElement UploadFile() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='FileUploadObservation']"));
	return ARS;
}


public static WebElement SavePastAudit() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='btnSave']"));
	return ARS;
}

public static WebElement Unit() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ddlLegalEntityPopPup_chosen']"));
	return ARS;
}


public static WebElement FinancialYear2() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ddlFilterFinancialPopPup_chosen']"));
	return ARS;
}



public static WebElement AuditBackground() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ddlAuditBackground_chosen']"));
	return ARS;
}


public static WebElement AuditBackgroundDD() {
	
	ARS=getDriver().findElement(By.xpath("//li[.='auditee']"));
	return ARS;
}



public static WebElement ReportGenerationDate() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='tbxReportDate']"));
	return ARS;
}

	
public static WebElement ReportGenerationDateDD() {
	
	ARS=getDriver().findElement(By.xpath("//a[.='18']"));
	return ARS;
}


public static WebElement SuccessfullySave() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ValidationSummary2']/ul/li"));
	return ARS;
}


public static WebElement CloseButton1() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='btnCancel']"));
	return ARS;
}


public static WebElement DownloadButton1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='grdVersionDisplayDownload_lblDownLoadfile_0']/img"));
	return ARS;
}


public static WebElement ViewButton() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='grdVersionDisplayDownload_LinkButton1_0']/img"));
	return ARS;
}


public static WebElement ClosePopup() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='DocumentPopUpREV']/div/div/div[1]/button"));
	return ARS;
}


public static WebElement ClosePopup1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='DocumentPopUpREV']/div/div/div[1]/button"));
	return ARS;
}



public static WebElement ViewPastAuditReport() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix_lblDownLoadfile_0']/img"));
	return ARS;
}


public static WebElement Update() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix_lblEditFile_0']/img"));
	return ARS;
}


public static WebElement FinancialYearPastAudit() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']"));
	return ARS;
}


public static WebElement AuditBackground1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditBackground_chosen']"));
	return ARS;
}



public static WebElement SearchBox() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_tbxFilter']"));
	return ARS;
}


public static WebElement DraftObservation() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[2]/a"));
	return ARS;
}


public static WebElement ViewIcon() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits_lnkAuditDetails_0']/img"));
	return ARS;
}


public static WebElement UnitD() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
	return ARS;
}



public static WebElement FinancialYearD() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']"));
	return ARS;
}


public static WebElement ObservationWord() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[3]/a"));
	return ARS;
}


public static WebElement ExportObservationWord() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnExportDoc']"));
	return ARS;
}



public static WebElement Submitted() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdAuditStatus_lblRiskCompleted_0']"));
	return ARS;
}



public static WebElement BackButtonS() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnBack']"));
	return ARS;
}




public static WebElement ViewRemarkAndDocument() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='grdProcessAudit_LinkButton4_1']/img"));
	return ARS;
}



public static WebElement DownloadLink() {
	
	ARS=getDriver().findElement(By.xpath("//a[@id='lnkUploadedDocument']"));
	return ARS;
}



public static WebElement CloseButtonv() {
	
	ARS=getDriver().findElement(By.xpath("//input[@id='btnCancel']"));
	return ARS;
}



public static WebElement SelectProcess4() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']"));
	return ARS;
}


public static WebElement SelectProcess4DD() {
	
	ARS=getDriver().findElement(By.xpath("//li[.='Contract and Report']"));
	return ARS;
}


public static WebElement SelectSubProcess4() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubProcess_chosen']"));
	return ARS;
}



public static WebElement SelectSubProcess4DD() {
	
	ARS=getDriver().findElement(By.xpath("//li[.='ARS Audit Two']"));
	return ARS;
}


public static WebElement Table1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[12]/div/table/tbody/tr[1]/td/ul/li[2]/a[1]/span[1]"));
	return ARS;
}


public static WebElement AuditComitee1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[16]/span"));
	return ARS;
}

public static WebElement ObservationRating() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[20]/span"));
	return ARS;
}


public static WebElement ObservationCatogary1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[21]/span"));
	return ARS;
}

public static WebElement ObservationSubCatogary1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[22]/span"));
	return ARS;
}

public static WebElement ReccomendationType1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[24]/fieldset/div[2]/div[1]/span"));
	return ARS;
}

public static WebElement ResponceDueDate1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[24]/fieldset/div[2]/div[3]/span/span/span"));
	return ARS;
}


public static WebElement TimelineCalender1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[24]/fieldset/div[2]/div[5]/span/span/span"));
	return ARS;
}

public static WebElement PersonResponsible1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[24]/fieldset/div[2]/div[6]/span"));
	return ARS;
}


public static WebElement OwnerName1() {
	
	ARS=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[24]/fieldset/div[2]/div[7]/span"));
	return ARS;
}

























}
