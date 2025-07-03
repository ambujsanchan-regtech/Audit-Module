package aRSAuditee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import login.BasePage;

public class Locator extends BasePage{
	
	
	
	
	
	
	private static WebElement ARS = null;
	private static WebElement OpenAudit = null;
	private static WebElement CheckBox = null;
	private static WebElement SaveOpen = null;
	
	
	
	private static WebElement SubmitAudit = null;
	private static WebElement commentAudit = null;
	private static WebElement OpenAuditChangeStatus = null;
	private static WebElement OpenAuditChangeStatus1 = null;
	private static WebElement Frame = null;
	private static WebElement AuditCoverage = null;
	private static WebElement Next = null;
	private static WebElement ActualTestingWorkDoneTab = null;
	private static WebElement Next2 = null;
	
	
	private static WebElement ObservationsTab = null;
	private static WebElement ViewButton = null;
	private static WebElement ViewButton1 = null;
	private static WebElement ViewButton2 = null;
	private static WebElement DownloadButton = null;
	private static WebElement SaveObservation = null;
	private static WebElement CancelObservation = null;
	private static WebElement Submit = null;
	private static WebElement View3 = null;
	private static WebElement Download1 = null;
	private static WebElement Close = null;
	private static WebElement ClosePage = null;

	
	
	private static WebElement PlusIcon = null;
	private static WebElement FirstName = null;
	private static WebElement LastName = null;
	private static WebElement Designation = null;
	private static WebElement Email = null;
	private static WebElement ContactNo = null;
	private static WebElement Save = null;
	private static WebElement Cancel = null;
	private static WebElement Successfully = null;
	private static WebElement Frame1 = null;
	private static WebElement Successfull1 = null;

	private static WebElement Company = null;
	private static WebElement CompanyDD = null;
	private static WebElement Grid2 = null;
	private static WebElement Company2DD = null;

	private static WebElement Upcoming = null;
	private static WebElement Overdue = null;
	private static WebElement Submitted = null;
	private static WebElement Comments = null;
	private static WebElement Implemented = null;

	
	
	private static WebElement OAAudit = null;
	private static WebElement OAAuditImplementation = null;
	private static WebElement CAAuditAudit = null;
	private static WebElement CAAuditImplementation = null;
	private static WebElement PrerequisiteSummeryOpen = null;
	private static WebElement PrerequisiteSummerySubmitted = null;
	private static WebElement PrerequisiteSummerySubmittedDownloadButton = null;
	
	private static WebElement PrerequisiteSummeryRejected = null;
	private static WebElement Download = null;
	
	
	private static WebElement SelectAudit = null;
	private static WebElement SelectAuditDD = null;
	private static WebElement SelectProcess = null;
	private static WebElement SelectProcessDD = null;
	private static WebElement SelectSubProcess = null;
	private static WebElement SelectSubProcessDD = null;
	private static WebElement GridCount = null;

	private static WebElement SelectAuditDD1 = null;
	private static WebElement SelectProcessDD1 = null;
	private static WebElement SelectSubProcessDD1 = null;

	
	private static WebElement ViewAuditDetails = null;
	private static WebElement Remark = null;
	private static WebElement UploadDocument = null;
	private static WebElement SaveButton = null;
	private static WebElement CloseButton = null;
	
	
	private static WebElement managementResponce = null;
	private static WebElement TimeLine = null;
	private static WebElement MyWorkspace = null;
	private static WebElement SelectcompanyDD = null;
	private static WebElement SelectcompanyOverdueDD = null;

	
	
	
	private static WebElement OpenObservation = null;
	private static WebElement BackButton = null;
	private static WebElement SubmittedI = null;
	private static WebElement ReviewComment = null;
	private static WebElement Resubmitted = null;
	private static WebElement Review2 = null;
	private static WebElement Review3 = null;
	private static WebElement Closed = null;

	private static WebElement successfully = null;
	private static WebElement OK = null;
	private static WebElement ChooseFile = null;
	private static WebElement Upload = null;
	private static WebElement Successfully1 = null;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static WebElement ARS() {
		
		ARS=getDriver().findElement(By.xpath("//div[@id='dvbtnAudit']"));
		return ARS;
	}
	
	
	public static WebElement OpenAudit() {
		
		OpenAudit=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divOpenAuditCount']"));
		return OpenAudit;
	}
	
	
	public static WebElement CheckBox() {
		
		CheckBox=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdDrillDown_CheckBox1_0']"));
		return CheckBox;
	}

	
	public static WebElement SaveOpen() {
		
		SaveOpen=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnAllSavechk']"));
		return SaveOpen;
	}
	
	
	public static WebElement SubmitAudit() {
		
		SubmitAudit=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divSubmitAuditCount']"));
		return SubmitAudit;
	}

	
	
	public static WebElement commentAudit() {
		
		commentAudit=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divReviewCommentCount']"));
		return commentAudit;
	}

	
	
	
	public static WebElement OpenAuditChangeStatus() {
		
		OpenAuditChangeStatus=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdDrillDown_btnChangeStatus_2']/img"));
		return OpenAuditChangeStatus;
	}


	public static WebElement OpenAuditChangeStatus1() {
		
		OpenAuditChangeStatus1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdDrillDown_btnChangeStatus_2']/img"));
		return OpenAuditChangeStatus1;
	}

	
	
	public static WebElement Frame() {
		
		Frame=getDriver().findElement(By.xpath("//iframe[@id='showdetails']"));
		return Frame;
	}

	
	public static WebElement AuditCoverage() {
		
		AuditCoverage=getDriver().findElement(By.xpath("//div[@id='tabstrip']//ul//li[@id='FirstTab']"));
		return AuditCoverage;
	}

	
	public static WebElement Next() {
		
		Next=getDriver().findElement(By.xpath("//button[@id='btn1']"));
		return Next;
	}

	
	public static WebElement ActualTestingWorkDoneTab() {
		
		ActualTestingWorkDoneTab=getDriver().findElement(By.xpath("//div[@id='tabstrip']//ul//li[@id='SecondTab']"));
		return ActualTestingWorkDoneTab;
	}


	
	public static WebElement Next2() {
		
		Next2=getDriver().findElement(By.xpath("//button[@id='btn2']"));
		return Next2;
	}

	
	public static WebElement ObservationsTab() {
		
		ObservationsTab=getDriver().findElement(By.xpath("//div[@id='tabstrip']//ul//li[@id='ThirdTab']"));
		return ObservationsTab;
	}

	
	
	
	public static WebElement ViewButton() {
		
		ViewButton=getDriver().findElement(By.xpath("(//a[@class='k-button k-button-icontext obs-show k-grid-view'])[1]"));
		return ViewButton;
	}

	
	public static WebElement ViewButton1() {
		
		ViewButton1=getDriver().findElement(By.xpath("//*[@id='AuditRecomendationGrid']/div[2]/table/tbody/tr/td[2]/a"));
		return ViewButton1;
	}

	
	public static WebElement ViewButton2() {
		
		ViewButton2=getDriver().findElement(By.xpath("(//a[@role='button'])[11]"));
		return ViewButton2;
	}

	
	
	public static WebElement DownloadButton() {
		
		DownloadButton=getDriver().findElement(By.xpath("(//a[@role='button'])[12]"));
		return DownloadButton;
	}

	
	public static WebElement SaveObservation() {
		
		SaveObservation=getDriver().findElement(By.xpath("//button[@id='saveRecommendation']"));
		return SaveObservation;
	}


	public static WebElement CancelObservation() {
		
		CancelObservation=getDriver().findElement(By.xpath("//button[@id='cancelRecommendation']"));
		return CancelObservation;
	}

	
	public static WebElement Submit() {
		
		Submit=getDriver().findElement(By.xpath("//button[@id='btnSave']"));
		return Submit;
	}

	
	public static WebElement View3() {
		
		View3=getDriver().findElement(By.xpath("(//a[@role='button'])[13]"));
		return View3;
	}


	public static WebElement Download1() {
		
		Download1=getDriver().findElement(By.xpath("(//a[@role='button'])[14]"));
		return Download1;
	}


	
	public static WebElement Close() {
		
		Close=getDriver().findElement(By.xpath("//*[@id='divViewDocument']/div/div/div[1]/button"));
		return Close;
	}


	public static WebElement ClosePage() {
		
		ClosePage=getDriver().findElement(By.xpath("(//button[@class='close'])[1]"));
		return ClosePage;
	}

	
	public static WebElement PlusIcon() {
		
		PlusIcon=getDriver().findElement(By.xpath("//a[@id='btnAddUser']"));
		return PlusIcon;
	}
	
	
	
	public static WebElement FirstName() {
		
		FirstName=getDriver().findElement(By.xpath("//input[@id='tbxFirstName']"));
		return FirstName;
	}
	
	public static WebElement LastName() {
		
		LastName=getDriver().findElement(By.xpath("//input[@id='tbxLastName']"));
		return LastName;
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
		
		ContactNo=getDriver().findElement(By.xpath("//input[@id='tbxContactNo']"));
		return ContactNo;
	}

	
	
	public static WebElement Save() {
		
		Save=getDriver().findElement(By.xpath("//input[@id='btnSave']"));
		return Save;
	}


	public static WebElement Cancel() {
		
		Cancel=getDriver().findElement(By.xpath("//input[@id='btnCancel']"));
		return Cancel;
	}

	
	
	public static WebElement Successfully() {
		
		Successfully=getDriver().findElement(By.xpath("//*[@id='ValidationSummary15']/ul/li"));
		return Successfully;
	}

	
	public static WebElement Frame1() {
		
		Frame1=getDriver().findElement(By.xpath("//iframe[@id='IUser']"));
		return Frame1;
	}

	
	public static WebElement Successfull1() {
		
		Successfull1=getDriver().findElement(By.xpath("//*[@id='ValidationSummary15']/ul"));
		return Successfull1;
	}

	
	
	public static WebElement Company() {
		
		Company=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
		return Company;
	}

	
	public static WebElement CompanyDD() {
		
		CompanyDD=getDriver().findElement(By.xpath("//li[.='Reliance Communication']"));
		return CompanyDD;
	}

	
	
	public static WebElement Grid2() {
		
		Grid2=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_DropDownListPageNo_chosen']"));
		return Grid2;
	}


	
	public static WebElement Company2DD() {
		
		Company2DD=getDriver().findElement(By.xpath("//li[.='Hinduja Group']"));
		return Company2DD;
	}

	//li[.='Hinduja Group']

	public static WebElement Upcoming() {
		
		Upcoming=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divUpcomingCount']"));
		return Upcoming;
	}

	

	public static WebElement Overdue() {
		
		Overdue=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divOverdueCount']"));
		return Overdue;
	}

	
	
	public static WebElement Submitted() {
		
		Submitted=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divSubmitAuditIMPCount']"));
		return Submitted;
	}

	
	
	
	public static WebElement Comments() {
		
		Comments=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divReviewCommentIMPCount']"));
		return Comments;
	}


	
	public static WebElement Implemented() {
		
		Implemented=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divCloseAuditIMPCount']"));
		return Implemented;
	}


	
	public static WebElement OAAudit() {
		
		OAAudit=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divAuditOpenProcess']"));
		return OAAudit;
	}

	
	public static WebElement OAAuditImplementation() {
		
		OAAuditImplementation=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divAuditOpenImplementation']"));
		return OAAuditImplementation;
	}

	
	
	public static WebElement CAAuditAudit() {
		
		CAAuditAudit=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divAuditClosedProcess']"));
		return CAAuditAudit;
	}

	
	public static WebElement CAAuditImplementation() {
		
		CAAuditImplementation=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divAuditClosedImplementation']"));
		return CAAuditImplementation;
	}


	public static WebElement PrerequisiteSummeryOpen() {
		
		PrerequisiteSummeryOpen=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divPreRequisiteOpenAuditCount']"));
		return PrerequisiteSummeryOpen;
	}

	
	public static WebElement PrerequisiteSummerySubmitted() {
		
		PrerequisiteSummerySubmitted=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divPreRequisiteSubmittedAuditCount']"));
		return PrerequisiteSummerySubmitted;
	}

	
	public static WebElement PrerequisiteSummerySubmittedDownloadButton() {
		
		PrerequisiteSummerySubmittedDownloadButton=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lblDocumentDownLoadDraftFile_0']"));
		return PrerequisiteSummerySubmittedDownloadButton;
	}

	
	
	
	public static WebElement PrerequisiteSummeryRejected() {
		
		PrerequisiteSummeryRejected=getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_divPreRequisiteRejectedCount']"));
		return PrerequisiteSummeryRejected;
	}

	
	
	public static WebElement Download() {
		
		Download=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lblDocumentDownLoadDraftFile_11']"));
		return Download;
	}


	public static WebElement SelectAudit() {
		
		SelectAudit=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
		return SelectAudit;
	}

	
	public static WebElement SelectAuditDD() {
		
		SelectAuditDD=getDriver().findElement(By.xpath("//li[.='Jodhpur Depot_2023-2024_Apr-Sep']"));
		return SelectAuditDD;
	}

	
	public static WebElement SelectAuditDD1() {
		
		SelectAuditDD1=getDriver().findElement(By.xpath("//li[.='Hinduja Group_2023-2024_Jul-Sep']"));
		return SelectAuditDD1;
	}

	
	
	public static WebElement SelectProcess() {
		
		SelectProcess=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']"));
		return SelectProcess;
	}

	
	
	
	public static WebElement SelectProcessDD() {
		
		SelectProcessDD=getDriver().findElement(By.xpath("//li[.='Inventory']"));
		return SelectProcessDD;
	}


	public static WebElement SelectProcessDD1() {
		
		SelectProcessDD1=getDriver().findElement(By.xpath("//li[.='Confirmation of Balance']"));
		return SelectProcessDD1;
	}

	
	public static WebElement SelectSubProcess() {
		
		SelectSubProcess=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubProcess_chosen']"));
		return SelectSubProcess;
	}


	public static WebElement SelectSubProcessDD() {
		
		SelectSubProcessDD=getDriver().findElement(By.xpath("//li[.='Damage']"));
		return SelectSubProcessDD;
	}

	
	public static WebElement SelectSubProcessDD1() {
		
		SelectSubProcessDD1=getDriver().findElement(By.xpath("//li[.='COB status of Card Dealers']"));
		return SelectSubProcessDD1;
	}

	
	
	
	public static WebElement GridCount() {
		
		GridCount=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_DropDownListPageNo_chosen']"));
		return GridCount;
	}

	
	
	public static WebElement ViewAuditDetails() {
		
		ViewAuditDetails=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lnkAuditDetails_0']/img"));
		return ViewAuditDetails;
	}

	
	
	public static WebElement Remark() {
		
		Remark=getDriver().findElement(By.xpath("//textarea[@id='ContentPlaceHolder1_txtRemark']"));
		return Remark;
	}


	
	public static WebElement UploadDocument() {
		
		UploadDocument=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_fileUploadDocument']"));
		return UploadDocument;
	}


	
	public static WebElement SaveButton() {
		
		SaveButton=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnSave']"));
		return SaveButton;
	}


	
	public static WebElement CloseButton() {
		
		CloseButton=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnCancel']"));
		return CloseButton;
	}


	public static WebElement managementResponce() {
		
		managementResponce=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdDrillDown_tbxMgmtResponse_0']"));
		return managementResponce;
	}

	
	public static WebElement TimeLine() {
		
		TimeLine=getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_grdDrillDown_tbxTimeLine_0']"));
		return TimeLine;
	}

	
	
	
	public static WebElement MyWorkspace() {
		
		MyWorkspace=getDriver().findElement(By.xpath("//li[@id='leftworkspacemenu']"));
		return MyWorkspace;
	}


	
	
	public static WebElement SelectcompanyDD() {
		
		SelectcompanyDD=getDriver().findElement(By.xpath("//li[.='Eicher tractor']"));
		return SelectcompanyDD;
	}

	
	
	public static WebElement SelectcompanyOverdueDD() {
		
		SelectcompanyOverdueDD=getDriver().findElement(By.xpath("//li[.='Hinduja Group']"));
		return SelectcompanyOverdueDD;
	}


	
	public static WebElement OpenObservation() {
		
		OpenObservation=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdImplementationAudits_lblRiskNotDone_0']"));
		return OpenObservation;
	}

	
	public static WebElement BackButton() {
		
		BackButton=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnBack']"));
		return BackButton;
	}

	
	public static WebElement SubmittedI() {
		
		SubmittedI=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdImplementationAudits_lblAuditeeReview_0']"));
		return SubmittedI;
	}


	public static WebElement ReviewComment() {
		
		ReviewComment=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdImplementationAudits_lblAuditeeSubmit_0']"));
		return ReviewComment;
	}

	
	public static WebElement Resubmitted() {
		
		Resubmitted=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdImplementationAudits_lblAuditeeReviewComment_0']"));
		return Resubmitted;
	}

	
	public static WebElement Review2() {
		
		Review2=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdImplementationAudits_lblRiskCompleted_0']"));
		return Review2;
	}

	
	public static WebElement Review3() {
		
		Review3=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdImplementationAudits_lblFinalReview_0']"));
		return Review3;
	}

	
	public static WebElement Closed() {
		
		Closed=getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdImplementationAudits_lblRiskClosed_0']"));
		return Closed;
	}

	
	
	public static WebElement successfully() {
		
		successfully=getDriver().findElement(By.xpath("//*[@id='confirmbox']/p1/strong"));
		return successfully;
	}

	
	public static WebElement OK() {
		
		OK=getDriver().findElement(By.xpath("//div[@class='k-widget k-window k-dialog']//button[@class='k-button k-primary']"));
		return OK;
	}


	public static WebElement ChooseFile() {
		
		ChooseFile=getDriver().findElement(By.xpath("//input[@id='RVUpload']"));
		return ChooseFile;
	}

	
	public static WebElement Upload() {
		
		Upload=getDriver().findElement(By.xpath("//button[@id='btnRHUpload']"));
		return Upload;
	}

	
	
	
	
	public static WebElement Successfully1() {
		
		Successfully1=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return Successfully1;
	}

	
	
	
	
	
	
	
	
	
	
	

}
