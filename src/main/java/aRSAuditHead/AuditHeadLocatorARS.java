package aRSAuditHead;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import login.BasePage;

public class AuditHeadLocatorARS extends BasePage{
	
    private static WebElement ars = null;				//WebElement variable created for 'Categories' click
    private static WebElement ClickHighOpen = null;
    private static WebElement FinanceAccountsHigh = null;
    
    
 	private static List<WebElement> arsList = null;		

	
	private static WebElement ARS = null;
	private static WebElement Master = null;
	private static WebElement VerticalMaster = null;
	private static WebElement AddNewVM = null;
	private static WebElement VerticalName = null;
	private static WebElement SaveVM = null;
	private static WebElement CloseVM = null;
	private static WebElement SuccessfullyVM = null;
	private static WebElement EditVM = null;
	private static WebElement GridCount = null;	
	private static WebElement VerticalSelect = null;
	private static WebElement VerticalCompanySelect = null;
	private static WebElement LocationVerticalMapping = null;
	private static WebElement SelectCompanyVM = null;
	private static WebElement SelectCompanyDDVM = null;
	private static WebElement SelectVertical = null;
	private static WebElement SelectVerticalDD = null;
	private static WebElement OKVM = null;
	private static WebElement SaveLVM = null;
	private static WebElement SuccessfullyLVM = null;
	private static WebElement DownloadLVM = null;
	private static WebElement Frame = null;
	private static WebElement Grid1 = null;
	
	private static WebElement DepartmentMaster = null;
	private static WebElement AddNewDM = null;
	private static WebElement DepartmentName = null;
	private static WebElement SaveDM = null;
	private static WebElement SuccessfullyDM = null;
	private static WebElement CloseDM = null;
	private static WebElement EditDM = null;
	

	private static WebElement BusinessProcess = null;
	private static WebElement AddNewBP = null;
	private static WebElement NameBP = null;
	private static WebElement SaveBP = null;
	private static WebElement CloseBP = null;
	private static WebElement EditBP = null;
	private static WebElement SubProcessBP = null;
	private static WebElement SubProcessAddNewBP = null;
	private static WebElement SubProcessNameBP = null;
	private static WebElement BackSubProcessBP = null;
	private static WebElement SuccessfulBP = null;
	private static WebElement EditSubProcessBP = null;
	private static WebElement BusinessProcessPage = null;
	private static WebElement BusinessProcessSubActivity = null;
	
	private static WebElement BusinessActivity = null;
	private static WebElement BusinessActivityName = null;
	private static WebElement BusinessActivitySave = null;
	private static WebElement BusinessActivityClose = null;
	private static WebElement BusinessActivityEdit = null;
	private static WebElement BusinessActivitySuccessfully = null;
	
	
	
	private static WebElement Observations = null;
	private static WebElement AddNewOC = null;
	private static WebElement NameOC = null;
	private static WebElement SaveOC = null;
	private static WebElement CancelOC = null;
	private static WebElement SuccessfullOC = null;
	private static WebElement EditOC = null;
	private static WebElement SubCatogariesOC = null;
	private static WebElement SubCatogariesAddNewOC = null;
	private static WebElement SubCatogariesNameOC = null;
	private static WebElement SubCatogariesEditOC = null;

	private static WebElement RiskCatogary = null;
	private static WebElement AddNewRC = null;
	private static WebElement NameRC = null;
	private static WebElement RadioRC = null;
	private static WebElement Radio1RC = null;
	private static WebElement EditRC = null;
	private static WebElement RiskFilterText = null;

	private static WebElement Users = null;
	private static WebElement AddNewUsers = null;
	private static WebElement FirstNameU = null;
	private static WebElement LastNameU = null;
	private static WebElement DestinationU = null;
	private static WebElement EmailU = null;
	private static WebElement ContactNoU = null;
	private static WebElement DepartmentU = null;
	private static WebElement DepartmentCheckBoxU = null;
	private static WebElement AuditRoleU = null;
	private static WebElement RadioU = null;
	private static WebElement SaveU = null;
	private static WebElement CancelU = null;
	private static WebElement SuccessfullyU = null;
	private static WebElement EditU = null;
	private static WebElement DeleteU = null;
	private static WebElement ResetPasswordU = null;
	private static WebElement ExportToExcelU = null;
	
	private static WebElement UnitAssignment = null;
	private static WebElement AddNewUA = null;
	private static WebElement SelectCompanyUA = null;
	private static WebElement SelectCompanyUADD = null;
	private static WebElement OKUA = null;
	private static WebElement SelectUser = null;
	private static WebElement SelectProcessUA = null;
	private static WebElement SelectProcessUADD = null;
	private static WebElement SaveUA = null;
	private static WebElement Successfullymessage = null;

	
	private static WebElement AuditFirmNameAM = null;
	private static WebElement PartenerNameAM = null;
	private static WebElement PartenerContactNoAM = null;
	private static WebElement ManagerNameAM = null;
	private static WebElement ManagerContactNoAM = null;
	private static WebElement EditAM = null;

	private static WebElement SaveUA1 = null;
	private static WebElement SaveUA2 = null;
	private static WebElement CloseUA = null;
	private static WebElement CloseUA2 = null;
	private static WebElement ManagementTab = null;
	private static WebElement DepartmentTab = null;
	private static WebElement AuditorMaster = null;
	private static WebElement AddNewAM = null;
	private static WebElement SaveAM = null;
	private static WebElement SuccessfullyAM = null;
	private static WebElement CloseAM = null;
	private static WebElement CityMaster = null;
	private static WebElement AddNewCM = null;

	   
	    
	     
	   
	private static WebElement SuccessfullyUA = null;
	private static WebElement SuccessfullyUA1 = null;
	private static WebElement SuccessfullyUA2 = null;
	private static WebElement DeleteUA = null;
	private static WebElement EditUA = null;
	private static WebElement ReAssignUA = null;
	private static WebElement UserUA = null;
	private static WebElement NewUserAssignUA = null;
	private static WebElement NewUserAssignUADD = null;	
	private static WebElement Save1UA = null;
	private static WebElement Close1UA = null;
	private static WebElement OK3 = null;
	private static WebElement UsersUA = null;
	private static WebElement UsersDDUA = null;
	private static WebElement SelectUnitUA = null;
	private static WebElement SelectUnitDDUA = null;
	private static WebElement Ok = null;
	private static WebElement User3 = null;
	private static WebElement User3DD = null;
	
	
	private static WebElement ReportGeneration = null;
	private static WebElement ViewAuditDeatils = null;
	private static WebElement ViewAuditDeatils1 = null;
	private static WebElement DraftObservationListing = null;
	private static WebElement ViewAuditDetails = null;
	private static WebElement Frame1 = null;
	private static WebElement ObservationTab = null;

    
    
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
	private static WebElement CompanyDD1 = null;	
	private static WebElement ShowReviewHistoryLogLink = null;
	private static WebElement ReviewRemark = null;
	private static WebElement File = null;
	private static WebElement UploadButton = null;
	private static WebElement SubmitButton = null;

	
	
	private static WebElement Table1 = null;
	private static WebElement WorkingFileDownload = null;
	private static WebElement AuditComitee1 = null;
	private static WebElement ObservationRating = null;
	private static WebElement ObservationCatogary1 = null;
	private static WebElement ObservationSubCatogary1 = null;
	private static WebElement ReccomendationType1 = null;
	private static WebElement ResponceDueDate1 = null;	
	private static WebElement TimelineCalender1 = null;
	private static WebElement PersonResponsible1 = null;
	private static WebElement OwnerName1 = null;
	private static WebElement ClosePage = null;
	private static WebElement BackButton = null;

	private static WebElement DeleteWorkingFile = null;
	private static WebElement AnnexureFileDownload = null;
	private static WebElement ObservationWorkingFileDownload = null;	
	private static WebElement ObservationWorkingFileDelete = null;
	private static WebElement ViewImage = null;
	private static WebElement CloseImagePopUp = null;
	private static WebElement DeleteImage = null;
	private static WebElement Successfully3 = null;
	private static WebElement UserDD = null;
	private static WebElement GenerateReport = null;
	
	
	private static WebElement Unit = null;
	private static WebElement UnitDD = null;	
	private static WebElement OK = null;
	private static WebElement User = null;
	private static WebElement UserSDD = null;
	private static WebElement UserNewDD = null;
	private static WebElement Processs = null;
	private static WebElement ProcesssDD = null;
	private static WebElement OKProcess = null;

    
    
    
    
    
    
    
    
    
 

	
	private static WebElement AuditReporting = null;
	private static WebElement ImportExportUtility = null;
	private static WebElement RadioSubProcess = null;
	private static WebElement UploadButton1 = null;
	private static WebElement SuccessfullyIC = null;
	private static WebElement ChooseFile = null;

	
	
	private static WebElement AuditAssignment = null;
	private static WebElement AddNew = null;
	private static WebElement Company1 = null;
	private static WebElement Company1DD = null;
	private static WebElement Save = null;
	private static WebElement Successfully = null;
	private static WebElement Close = null;
	private static WebElement Comapny2 = null;
	private static WebElement Comapny2DD = null;
	private static WebElement Grid = null;

	private static WebElement ProcessOrder = null;
	private static WebElement ObservationNumber = null;
	private static WebElement FeedbackForm = null;
	private static WebElement Remark = null;
	private static WebElement Save1 = null;
	private static WebElement Draft = null;
	private static WebElement SelectProcess = null;
	private static WebElement SelectProcessDD = null;
	private static WebElement ObservationNumbered = null;
	private static WebElement ProcessOrder1 = null;
	private static WebElement ObservationNumber1 = null;
	private static WebElement ObservationNumbered1 = null;
	private static WebElement Successfullyp = null;

	private static WebElement PastObservation = null;
	private static WebElement ViewHistorical = null;
	private static WebElement Process = null;
	private static WebElement ProcessDD = null;
	private static WebElement ProcessOK = null;
	private static WebElement SubProcess = null;
	private static WebElement SubProcessDD = null;
	private static WebElement SubProcessok = null;
	private static WebElement SearchBox = null;
	private static WebElement SearchText = null;

	private static WebElement AuditStep = null;
	private static WebElement CloseButton = null;
	private static WebElement ObservationCount = null;
	private static WebElement View = null;
	private static WebElement Closebutton1 = null;

	private static WebElement SelectProcess1 = null;
	private static WebElement SelectProcessDD1 = null;

	
	private static WebElement User1 = null;
	private static WebElement User1DD = null;
	private static WebElement ok1 = null;
	private static WebElement save2 = null;
	private static WebElement close2 = null;
	private static WebElement Successfully2 = null;
	    
	    
	private static WebElement UnitD = null;
	private static WebElement UnitDDD = null;
	private static WebElement UnitDOK = null;
	private static WebElement UserD = null;
	private static WebElement UserDDD = null;
	private static WebElement UserDDDNew = null;
	private static WebElement Department = null;
	private static WebElement DepartmentDD = null;
	private static WebElement DepartmentOK = null;
 
	   
	private static WebElement Successfull = null;
	private static WebElement Master1 = null;
	private static WebElement Unit1 = null;
	private static WebElement addnew = null;
	private static WebElement Name = null;
	private static WebElement UnitType = null;
	private static WebElement Adress = null;
	private static WebElement State = null;
	private static WebElement City = null;
	private static WebElement ContactPerson = null;
	private static WebElement Email = null;
	private static WebElement save = null;
	private static WebElement ExportToExcel = null;
	private static WebElement Edit = null;
	private static WebElement Successfully1 = null;
	private static WebElement Close1 = null;
	private static WebElement SubUnit = null;

    
    
    
	private static WebElement AuditorsTeamMaster = null;
	private static WebElement AddNewATM = null;
	private static WebElement SelectAuditorATM = null;
	private static WebElement RadioATM = null;
	private static WebElement FirstNameATM = null;
	private static WebElement LastNameATM = null;
	private static WebElement EmailATM = null;
	private static WebElement ContactATM = null;
	private static WebElement EditATM = null;

	
	private static WebElement StateMaster = null;
	private static WebElement AddNewSM = null;
	private static WebElement NameSM = null;
	private static WebElement CountrySM = null;
	private static WebElement EditSM = null;
	
	
	private static WebElement CityNameCM = null;
	private static WebElement StateNameCM = null;
	private static WebElement EditCM = null;
	private static WebElement CitySearch = null;
	private static WebElement ActionClickForSearch = null;
	
	
    
	private static WebElement ProcessMaster = null;
	private static WebElement AddNewPM = null;
	private static WebElement NamePM = null;
	private static WebElement DescriptionPM = null;
	private static WebElement EditPM = null;
	private static WebElement DeletePM = null;

	
	private static WebElement mydocument=null;
	private static WebElement mydocumentcompany=null;
	private static WebElement mydocumentselectcompany=null;
	private static WebElement mydocumentdownload=null;
	private static WebElement mydocumentmessage=null;
	private static WebElement mydocumentclick1=null;
	private static WebElement mydocumentclick2=null;
	private static WebElement mydocumentclick3=null;
	private static WebElement mydocumentclick4=null;
	private static WebElement mydocumentclick5=null;
	private static WebElement mydocumentDeleted=null;
	private static WebElement mydocumentDeleteddownload=null;
	private static WebElement mydocumentFeedback=null;
	private static WebElement mydocumentreview=null;
	private static WebElement myannexuredocumentdownload=null;
	private static WebElement mydocumentannexure=null;
	private static WebElement myreviewdocumentdownload=null;
	private static WebElement mydocumentFeedbackdownload=null;
	private static WebElement mydocumentFinaldeliverable=null;
	private static WebElement myFinaldeliverabledocumentdownload=null;

	private static WebElement myreport=null;
	private static WebElement myreportexecutivereport=null;
	private static WebElement myreportcompany=null;
	private static WebElement myreportselectcompany=null;
	private static WebElement myreportexecutivedownload=null;
	private static WebElement myreportexecutivemessage=null;
	private static WebElement myreportinternalaudit=null;
	private static WebElement myreportinternalauditcompany=null;
	private static WebElement myreportinternalauditselectcompany=null;
	private static WebElement myreportinternalauditdownload=null;
	private static WebElement myreportinternalauditmessage=null;
	private static WebElement myreportopenobservation=null;
	private static WebElement myreportopenobservationcompany=null;
	private static WebElement myreportopenobservationselectcompany=null;
	private static WebElement myreportopenobservationexporttoexcel=null;
	private static WebElement myreportobservationsummary=null;
	private static WebElement myreportobservationcompany=null;
	private static WebElement myreportobservationselectcompany=null;
	private static WebElement myreportobservationok=null;
	private static WebElement myreportobservationexporttoexcel=null;
	private static WebElement myreportschedulingdeviation=null;
	private static WebElement myreportschedulingcompany=null;
	private static WebElement myreportschedulingselectcompany=null;
	private static WebElement myreportschedulingtype=null;
	private static WebElement myreportschedulingselecttype=null;
	private static WebElement myreportschedulingperiod=null;
	private static WebElement myreportschedulingselectperiod=null;
	private static WebElement myreportschedulingexporttoexcel=null;
	private static WebElement myreportmanagementresponse=null;
	private static WebElement myreportmanagementresponsecompany=null;
	private static WebElement myreportmanagementresponseselectcompany=null;
	private static WebElement myreportmanagementresponsefinancial=null;
	private static WebElement myreportmanagementresponseselectfinancial=null;
	private static WebElement myreportmanagementresponseselectscheduling=null;
	private static WebElement myreportmanagementresponseselectselectscheduling=null;
	private static WebElement myreportmanagementresponseperiod=null;
	private static WebElement myreportmanagementresponseselectperiod=null;
	private static WebElement myreportmanagementresponseexporttoexcel=null;
	private static WebElement myreportprerequisit=null;
	private static WebElement myreportprerequisitcompancy=null;
	private static WebElement myreportprerequisitselectcompancy=null;
	private static WebElement myreportprerequisitfinancial=null;
	private static WebElement myreportprerequisitselectfinancial=null;
	private static WebElement myreportmyreportprerequisitscheduling=null;
	private static WebElement myreportmyreportprerequisitselectscheduling=null;
	private static WebElement myreportmyreportprerequisitperiod=null;
	private static WebElement myreportmyreportprerequisitselectperiod=null;
	private static WebElement myreportmyreportprerequisitexporttoexcel=null;
	private static WebElement myreportauditscheduling=null;
	private static WebElement myreportauditschedulingcompancy=null;
	private static WebElement myreportauditschedulingselectcompancy=null;
	private static WebElement myreportauditschedulingexporttoexcel=null;
	private static WebElement myreportauditstatus=null;
	private static WebElement myreportauditstatuscompany=null;
	private static WebElement myreportauditstatusselectcompany=null;
	private static WebElement myreportauditstatusexporttoexcel=null;
	private static WebElement myreportpastaudit=null;
	private static WebElement myreportpastauditaddnew=null;
	private static WebElement myreportpastauditunit=null;
	private static WebElement myreportpastauditselectunit=null;
	private static WebElement myreportpastauditfinancial=null;
	private static WebElement myreportpastauditselectfinancial=null;
	private static WebElement myreportpastauditauditbackground=null;
	private static WebElement myreportpastauditselectauditbackground=null;
	private static WebElement myreportpastaudituploadfile=null;
	private static WebElement myreportpastauditsave=null;
	private static WebElement myreportpastauditclose=null;
	private static WebElement myreportpastauditview=null;
	private static WebElement myreportpastauditedit=null;
	private static WebElement myreportpastauditcancel=null;
	private static WebElement myreportfinalaudit=null;
	private static WebElement myreportfinalauditcompany=null;
	private static WebElement myreportfinalauditselectcompany=null;
	private static WebElement myreportfinalauditdownload=null;

	
	private static WebElement configuration=null;
	private static WebElement configurationprofilemaster=null;
	private static WebElement configurationprofilemasteraddnew=null;
	private static WebElement configurationprofilemasterprofilename=null;
	private static WebElement configurationprofilemasterlevel=null;
	private static WebElement configurationprofilemasterselectlevel=null;
	private static WebElement configurationprofilemastersave=null;
	private static WebElement configurationprofilemasterclose=null;
	private static WebElement configurationprofilemasteredit=null;
	private static WebElement configurationprofilemastercancel=null;
	private static WebElement configurationprofilemasterdeactivate=null;
	private static WebElement configurationprofile=null;
	private static WebElement configurationprofileclick=null;
	private static WebElement configurationprofileuser=null;
	private static WebElement configurationprofileselectuser=null;
	private static WebElement configurationprofilesave=null;
	private static WebElement configurationescalation=null;
	private static WebElement configurationescalationaddnew=null;
	private static WebElement configurationprofilename=null;
	private static WebElement configurationselectprofile=null;
	private static WebElement configurationadd=null;
	private static WebElement configurationnodays=null;
	private static WebElement configurationnosave=null;
	private static WebElement configurationnocancel=null;
	private static WebElement configurationnoview=null;
	private static WebElement configurationcross=null;
	private static WebElement configurationhod=null;
	private static WebElement configurationhodaddnew=null;
	private static WebElement configurationprocess=null;
	private static WebElement selectconfigurationprocess=null;
	private static WebElement ok=null;  
	private static WebElement hodprofile=null;
	private static WebElement hodselectprofile=null;
	private static WebElement hodtimeline=null;
	private static WebElement hodsave=null;
	private static WebElement hodcancel=null;
	private static WebElement configurationmessage=null;
	private static WebElement configurationeditmessage=null;
	private static WebElement configurationhodedit=null;
	private static WebElement configurationhodeditclose=null;
	private static WebElement configurationdelete=null;
	private static WebElement configurationdeletecancel=null;
	private static WebElement configurationdashboard=null;
	private static WebElement configurationdashboardselect=null;
	private static WebElement configurationdashboardselectprofile=null;
	private static WebElement configurationdashboardsave=null;

    
    
    
    
    

    
	 
	

	
	public static WebElement ARS() {
		
		ARS=getDriver().findElement(By.xpath("//div[@id='dvbtnAudit']"));
		return ARS;
	}

	
    public  static WebElement Master() {
		
		Master=getDriver().findElement(By.xpath("//a[.='Masters']"));
		return Master;
	}

    
    public static WebElement Grid1() {
		
    	Grid1=getDriver().findElement(By.xpath("//*[@id='DropDownListPageNo_chosen']/a"));
		return Grid1;
	}

    
    public static WebElement VerticalMaster()		//Method for searching Username input
	{
	 VerticalMaster = getDriver().findElement(By.xpath("//a[.='Vertical Master']"));
		return VerticalMaster;
	}
 

 public static WebElement AddNewVM()		//Method for searching Username input
	{
	 AddNewVM = getDriver().findElement(By.id("ContentPlaceHolder1_btnAddPromotor"));
		return AddNewVM;
	}

 
 public static WebElement VerticalName()		//Method for searching Username input
	{
	 VerticalName = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtFName']"));
		return VerticalName;
	}

 
 public static WebElement SaveVM()		//Method for searching Username input
	{
	 SaveVM = getDriver().findElement(By.id("ContentPlaceHolder1_btnSave"));
		return SaveVM;
	}
 
 
 public static WebElement CloseVM()		//Method for searching Username input
	{
	 CloseVM = getDriver().findElement(By.id("ContentPlaceHolder1_btnCancel"));
		return CloseVM;
	}
 
 
 public static WebElement SuccessfullyVM()		//Method for searching Username input
	{
	 SuccessfullyVM = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return SuccessfullyVM;
	}

 
 public static WebElement EditVM()		//Method for searching Username input
	{
	 EditVM = getDriver().findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_grdAuditor_LinkButton1_0\"]/img"));
		return EditVM;
	}
 
 
 public static WebElement LocationVerticalMapping()		//Method for searching Username input
	{
	 LocationVerticalMapping = getDriver().findElement(By.id("ContentPlaceHolder1_LinkButton3"));
		return LocationVerticalMapping;
	}
 
 

 public static WebElement SelectCompanyVM()		//Method for searching Username input
	{
	 SelectCompanyVM = getDriver().findElement(By.xpath("//*[@id='ddlLegalEntity_chosen']"));
		return SelectCompanyVM;
	}

 public static WebElement SelectCompanyDDVM()		//Method for searching Username input
	{
	 SelectCompanyDDVM = getDriver().findElement(By.xpath("//li[.='Berger Paints']"));
		return SelectCompanyDDVM;
	}
 

 
 public static WebElement SelectVertical()		//Method for searching Username input
	{
	 SelectVertical = getDriver().findElement(By.id("caption"));
		return SelectVertical;
	}
 
 public static WebElement SelectVerticalDD()		//Method for searching Username input
	{
	 SelectVerticalDD = getDriver().findElement(By.xpath("//input[@id='ddlVerticalBranch_0']"));
		return SelectVerticalDD;
	}
 
 
 public static WebElement OKVM()		//Method for searching Username input
	{
	 OKVM = getDriver().findElement(By.xpath("//*[@id=\"buttons\"]/input[1]"));
		return OKVM;
	}


 public static WebElement SaveLVM()		//Method for searching Username input
	{
	 SaveLVM = getDriver().findElement(By.xpath("//input[@id='btnSave']"));
		return SaveLVM;
	}

 
 public static WebElement SuccessfullyLVM()		//Method for searching Username input
	{
	 SuccessfullyLVM = getDriver().findElement(By.xpath("//div[@id='ValidationSummary1']"));
		return SuccessfullyLVM;
	}

 
 
 public static WebElement DownloadLVM()		//Method for searching Username input
	{
	 DownloadLVM = getDriver().findElement(By.xpath("//input[@id='btnUploadFile1']"));
		return DownloadLVM;
	}

 public static WebElement Frame()		//Method for searching Username input
	{
		Frame = getDriver().findElement(By.xpath("//iframe[@id='showdetails']"));
		return Frame;
		
		
	}

 public static WebElement GridCount()		//Method for searching Username input
	{
	 GridCount = getDriver().findElement(By.xpath("//*[@id='grdRiskActivityMatrix']/tbody/tr[49]/td[1]"));
		return GridCount;
	}

 
 public static WebElement VerticalSelect()		//Method for searching Username input
	{
	 VerticalSelect = getDriver().findElement(By.xpath("//label[.='E-Mailing drafts']"));
		return VerticalSelect;
	}

 
 public static WebElement VerticalCompanySelect()		//Method for searching Username input
	{
	 VerticalCompanySelect = getDriver().findElement(By.xpath("//li[.='AMT']"));
		return VerticalCompanySelect;
	}

 //////////////////////////////////////////////
 
 public static WebElement BusinessProcess()		//Method for searching Username input
	{
  	 BusinessProcess = getDriver().findElement(By.xpath("//a[.='Business Process']"));
		return BusinessProcess;
		
		
	}
	
   
   public static WebElement AddNewBP()		//Method for searching Username input
 	{
  	 AddNewBP = getDriver().findElement(By.id("ContentPlaceHolder1_btnAddProcess"));
 		return AddNewBP;
 		
 		
 	}
	
   public static WebElement NameBP()		//Method for searching Username input
  	{
  	 NameBP = getDriver().findElement(By.id("ContentPlaceHolder1_tbxName"));
  		return NameBP;
  		
  		
  	}
 	
   public static WebElement SaveBP()		//Method for searching Username input
	{
  	 SaveBP = getDriver().findElement(By.id("ContentPlaceHolder1_btnSave"));
		return SaveBP;
		
		
	}
   
   
   public static WebElement CloseBP()		//Method for searching Username input
	{
  	 CloseBP = getDriver().findElement(By.id("ContentPlaceHolder1_btnCancel"));
		return CloseBP;
		
		
	}
   
   
   public static WebElement EditBP()		//Method for searching Username input
 	{
  	 EditBP = getDriver().findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_grdProcessList_lbtEdit_0\"]/img"));
 		return EditBP;
 		
 		
 	}
 
   
   public static WebElement SubProcessBP()		//Method for searching Username input
  	{
  	 SubProcessBP = getDriver().findElement(By.xpath("//a[.='sub-process']"));
  		return SubProcessBP;
  		
  		
  	}

   

   
   public static WebElement SubProcessAddNewBP()		//Method for searching Username input
	{
  	 SubProcessAddNewBP = getDriver().findElement(By.id("ContentPlaceHolder1_btnAddSubEvent"));
		return SubProcessAddNewBP;
		
		
	}

   
   public static WebElement SubProcessNameBP()		//Method for searching Username input
 	{
  	 SubProcessNameBP = getDriver().findElement(By.xpath("//textarea[@id='ContentPlaceHolder1_tbxName']"));
 		return SubProcessNameBP;
 		
 		
 	}
   
   
   public static WebElement BackSubProcessBP()		//Method for searching Username input
  	{
  	 BackSubProcessBP = getDriver().findElement(By.id("ContentPlaceHolder1_lnkBackToProcess"));
  		return BackSubProcessBP;
  		
  	}
    
   public static WebElement SuccessfulBP()		//Method for searching Username input
	{
  	 SuccessfulBP = getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_ValidationSummary1']"));
		return SuccessfulBP;
		
		
	}
 
 
   public static WebElement EditSubProcessBP()		//Method for searching Username input
	{
  	 EditSubProcessBP = getDriver().findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_grdSubProcessList_LinkButton1_0\"]/img"));
		return EditSubProcessBP;
		
		
	}
   
   
   public static WebElement BusinessProcessPage()		//Method for searching Username input
 	{
   	 BusinessProcessPage = getDriver().findElement(By.xpath("//h1[@id='pagetype']"));
 		return BusinessProcessPage;
 			
 	}
  
   
    public static WebElement BusinessProcessSubActivity()		//Method for searching Username input
  	{
   	 BusinessProcessSubActivity = getDriver().findElement(By.xpath("//a[.='sub-activity']"));
  		return BusinessProcessSubActivity;
  			
  	}
   
    
    
    public static WebElement BusinessActivity()		//Method for searching Username input
	{
  	  BusinessActivity = getDriver().findElement(By.id("ContentPlaceHolder1_btnAddSubEvent"));
		return BusinessActivity;
			
	}
 

    public static WebElement BusinessActivityName()		//Method for searching Username input
	{
  	  BusinessActivityName = getDriver().findElement(By.xpath("//textarea[@id='ContentPlaceHolder1_tbxName']"));
		return BusinessActivityName;
			
	}
 
    public static WebElement BusinessActivitySave()		//Method for searching Username input
  	{
  	  BusinessActivitySave = getDriver().findElement(By.id("ContentPlaceHolder1_btnSave"));
  		return BusinessActivitySave;
  			
  	}
    
  
    public static WebElement BusinessActivityClose()		//Method for searching Username input
	{
  	  BusinessActivityClose = getDriver().findElement(By.id("ContentPlaceHolder1_btnCancel"));
		return BusinessActivityClose;
			
	}

    
    public static WebElement BusinessActivityEdit()		//Method for searching Username input
  	{
  	  BusinessActivityEdit = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdActivityList_LinkButton1_0']/img"));
  		return BusinessActivityEdit;
  			
  	}
 
   
    
    public static WebElement BusinessActivitySuccessfully()		//Method for searching Username input
	{
  	  BusinessActivitySuccessfully = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return BusinessActivitySuccessfully;
			
	}


  ////////////////////////////////////////
    
    
    public static WebElement UnitAssignment()		//Method for searching Username input
   	{
   	 UnitAssignment = getDriver().findElement(By.xpath("//a[.='Unit Assignment']"));
   		return UnitAssignment;
   			
   	}
    
    
    
    public static WebElement AddNewUA()		//Method for searching Username input
	{
   	 AddNewUA = getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnAddComplianceType']"));
		return AddNewUA;
			
	}

    

    public static WebElement SaveUA()		//Method for searching Username input
   	{
   	 SaveUA = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnAuditHeadSave']"));
   		return SaveUA;
   			
   	}
     
    public static WebElement SaveUA1()		//Method for searching Username input
   	{
    	SaveUA1 = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnManagementSaveEdit']"));
   		return SaveUA1;
   			
   	}
  
    
    public static WebElement SaveUA2()		//Method for searching Username input
   	{
    	SaveUA2 = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnDepartmentHeadSaveEdit']"));
   		return SaveUA2;
   			
   	}

    
  

    public static WebElement SuccessfullyUA()		//Method for searching Username input
  	{
    	 SuccessfullyUA = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_AuditHeadValidationSummary']/ul/li"));
  		return SuccessfullyUA;
  			
  	}
 
   
    public static WebElement SuccessfullyUA1()		//Method for searching Username input
   	{
    	SuccessfullyUA1 = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ManagementValidationSummaryEdit']/ul/li"));
   		return SuccessfullyUA1;
   			
   	}
  
 
    public static WebElement SuccessfullyUA2()		//Method for searching Username input
   	{
    	SuccessfullyUA2 = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_DepartmentHeadValidationSummaryEdit']/ul/li"));
   		return SuccessfullyUA2;
   			
   	}
  
  
	
    public static WebElement CloseUA()		//Method for searching Username input
 	{
    	 CloseUA = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnClose']"));
 		return CloseUA;
 			
 	}
    
    public static WebElement CloseUA2()		//Method for searching Username input
 	{
    	CloseUA2 = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnCloseDepartmentHead']"));
 		return CloseUA2;
 			
 	}
    
   
    
  
    
    public static WebElement ManagementTab()		//Method for searching Username input
 	{
    	ManagementTab = getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnTabManagementEdit']"));
 		return ManagementTab;
 			
 	}
    
    
    public static WebElement DepartmentTab()		//Method for searching Username input
 	{
    	DepartmentTab = getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnTabDepartmentHeadEdit']"));
 		return DepartmentTab;
 			
 	}
  
    
 ///////////////////////
    
    public static WebElement AuditorMaster()		//Method for searching Username input
	{
   	 AuditorMaster = getDriver().findElement(By.xpath("//a[.='Auditor Master']"));
		return AuditorMaster;
			
	}
 
   
    public static WebElement AddNewAM()		//Method for searching Username input
 	{
   	 AddNewAM = getDriver().findElement(By.id("ContentPlaceHolder1_btnAddPromotor"));
 		return AddNewAM;
 			
 	}

    
    public static WebElement SaveAM()		//Method for searching Username input
 	{
   	 SaveAM = getDriver().findElement(By.id("ContentPlaceHolder1_btnSave"));
 		return SaveAM;
 			
 	}
    

    public static WebElement SuccessfullyAM()		//Method for searching Username input
	{
	 SuccessfullyAM = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return SuccessfullyAM;
			
	}

    
    public static WebElement CloseAM()		//Method for searching Username input
  	{
   	 CloseAM = getDriver().findElement(By.id("ContentPlaceHolder1_btnCancel"));
  		return CloseAM;
  			
  	}
     
  
    
    public static WebElement CityMaster()		//Method for searching Username input
  	{
    	 CityMaster = getDriver().findElement(By.xpath("//a[.='City Master']"));
  		return CityMaster;
  			
  	}
  
   
     public static WebElement AddNewCM()		//Method for searching Username input
  	{
    	 AddNewCM = getDriver().findElement(By.id("ContentPlaceHolder1_btnAddPromotor"));
  		return AddNewCM;
  			
  	}
    
    
     public static WebElement ReportGeneration()		//Method for searching Username input
  	{
    	 ReportGeneration = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul//li[.='Report Generation']"));
  		return ReportGeneration;
  			
  	}
     
     
     
     public static WebElement ViewAuditDeatils()		//Method for searching Username input
  	{
    	 ViewAuditDeatils = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_lnkAuditDetails_0']/img"));
  		return ViewAuditDeatils;
  			
  	}
  
    
     public static WebElement ViewAuditDeatils1()		//Method for searching Username input
  	{
    	 ViewAuditDeatils1 = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_lnkAuditDetails_1']/img"));
  		return ViewAuditDeatils1;
  			
  	}

     public static WebElement DraftObservationListing()		//Method for searching Username input
   	{
    	 DraftObservationListing = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_lbtObservationList']"));
   		return DraftObservationListing;
   			
   	}
   

   
     
     public static WebElement ViewAuditDetails()		//Method for searching Username input
   	{
    	 ViewAuditDetails = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_lnkViewAudit_0']/img"));
   		return ViewAuditDetails;
   			
   	}
 
     
   
     public static WebElement Frame1()		//Method for searching Username input
   	{
    	 Frame1 = getDriver().findElement(By.xpath("//iframe[@id='showdetails']"));
   		return Frame1;
   			
   	}
 
  
     public static WebElement ObservationTab()		//Method for searching Username input
   	{
    	 ObservationTab = getDriver().findElement(By.xpath("//li[@id='ThirdTab']"));
   		return ObservationTab;
   			
   	}
   
     
   
	public static WebElement NextButton1() {
		
		NextButton1=getDriver().findElement(By.xpath("//button[@id='btn1']"));
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
		
		Table=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[12]/div/table/tbody/tr[1]/td/ul/li[2]/a[1]/span[1]"));
		return Table;
	}
	
	
	public static WebElement Table1() {
		
		Table1=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[12]/div/table/tbody/tr[1]/td/ul/li[2]/a[1]/span[1]"));
		return Table1;
	}

	
	public static WebElement WorkingFileDownload() {
		
		WorkingFileDownload=getDriver().findElement(By.xpath("(//a[@role='button'])[1]"));
		return WorkingFileDownload;
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
		
		AuditComitee=getDriver().findElement(By.xpath(" //*[@id='tabstrip-3']/div[16]/span/span/span[1]"));
		return AuditComitee;
	}

	
	public static WebElement AuditComitee1() {
		
		AuditComitee1=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[16]/span"));
		return AuditComitee1;
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
		
		RiskRating=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[20]/span/span/span[1]"));
		return RiskRating;
	}


	public static WebElement ObservationRating() {
		
		ObservationRating=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[20]/span"));
		return ObservationRating;
	}


	
	
	public static WebElement RiskRatingDD() {
		
		RiskRatingDD=getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[.='High']"));
		return RiskRatingDD;
	}

	
	public static WebElement ObservationCatogary() {
		
		ObservationCatogary=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[21]/span/span/span[1]"));
		return ObservationCatogary;
	}

	public static WebElement ObservationCatogary1() {
		
		ObservationCatogary1=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[21]/span"));
		return ObservationCatogary1;
	}

	
	
	public static WebElement ObservationCatogaryDD() {
		
		ObservationCatogaryDD=getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[.='Financial Impact']"));
		return ObservationCatogaryDD;
	}

	
	
	public static WebElement ObservationSubCatogary() {
		
		ObservationSubCatogary=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[22]/span/span/span[1]"));
		return ObservationSubCatogary;
	}

	
	public static WebElement ObservationSubCatogary1() {
		
		ObservationSubCatogary1=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[22]/span"));
		return ObservationSubCatogary1;
	}
	

	
	public static WebElement ObservationSubCatogaryDD() {
		
		ObservationSubCatogaryDD=getDriver().findElement(By.xpath("//div[@class='k-animation-container']//ul//li[.='CN Awarded even after RMA']"));
		return ObservationSubCatogaryDD;
	}

	
	public static WebElement ReccomendationType() {
		
		ReccomendationType=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[24]/fieldset/div[2]/div[1]/span/span/span[1]"));
		return ReccomendationType;
	}

	
	public static WebElement ReccomendationType1() {
		
		ReccomendationType1=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[24]/fieldset/div[2]/div[1]/span"));
		return ReccomendationType1;
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
		return ResponceDueDate;
	}

	
	public static WebElement ResponceDueDate1() {
		
		ResponceDueDate1=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[24]/fieldset/div[2]/div[3]/span/span/span"));
		return ResponceDueDate1;
	}


	
	public static WebElement ResponceDueDateDD() {
		
		ResponceDueDateDD=getDriver().findElement(By.xpath("//a[.='28']"));
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

	
	public static WebElement TimelineCalender1() {
		
		TimelineCalender1=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[24]/fieldset/div[2]/div[5]/span/span/span"));
		return TimelineCalender1;
	}


	
	public static WebElement TimelineCalenderDD() {
		
		TimelineCalenderDD=getDriver().findElement(By.xpath("//a[.='28']"));
		return TimelineCalenderDD;
	}


	public static WebElement PersonResponsible() {
		
		PersonResponsible=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[23]/fieldset/div[2]/div[6]/span"));
		return PersonResponsible;
	}

	
	
	public static WebElement PersonResponsible1() {
		
		PersonResponsible1=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[24]/fieldset/div[2]/div[6]/span"));
		return PersonResponsible1;
	}

	

	
	public static WebElement PersonResponsibleDD() {
		
		PersonResponsibleDD=getDriver().findElement(By.xpath("//div[@class='k-animation-container']//li[.='Auditee  User']"));
		return PersonResponsibleDD;
	}


	
	public static WebElement OwnerName() {
		
		OwnerName=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[23]/fieldset/div[2]/div[7]/span"));
		return OwnerName;
	}


	public static WebElement OwnerName1() {
		
		OwnerName1=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[24]/fieldset/div[2]/div[7]/span"));
		return OwnerName1;
	}


	
	public static WebElement OwnerNameDD() {
		
		OwnerNameDD=getDriver().findElement(By.xpath("(//div[@class='k-animation-container']//div//ul//li[.='Auditee User'])[2]"));
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

	
	public static WebElement CompanyDD1() {
		
		CompanyDD1=getDriver().findElement(By.xpath("//li[.='Hinduja Group']"));
		return CompanyDD1;
	}

	
	
	public static WebElement Grid2() {
		
		Grid2=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_DropDownListPageNo_chosen']"));
		return Grid2;
	}

	
	public static WebElement ShowReviewHistoryLogLink() {
		
		ShowReviewHistoryLogLink=getDriver().findElement(By.xpath("//*[@id='tabstrip-3']/div[25]/div[1]/a"));
		return ShowReviewHistoryLogLink;
	}

	
	
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


 
	public static WebElement DeleteWorkingFile() {
		
		DeleteWorkingFile=getDriver().findElement(By.xpath("(//a[@role='button'])[2]"));
		return DeleteWorkingFile;
	}
		
	public static WebElement AnnexureFileDownload() {
		
		AnnexureFileDownload=getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-download k-grid-download']"));
		return AnnexureFileDownload;
	}

     
     
	public static WebElement ObservationWorkingFileDownload() {
		
		ObservationWorkingFileDownload=getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-download k-grid-download']"));
		return ObservationWorkingFileDownload;
	}

     
	public static WebElement ObservationWorkingFileDelete() {
		
		ObservationWorkingFileDelete=getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-delete k-grid-delete']"));
		return ObservationWorkingFileDelete;
	}

	
	public static WebElement ViewImage() {
		
		ViewImage=getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-view k-grid-view']"));
		return ViewImage;
	}

	
	public static WebElement CloseImagePopUp() {
		
		CloseImagePopUp=getDriver().findElement(By.xpath("//*[@id='divViewDocument']/div/div/div[2]/div/div/div/a[.='X']"));
		return CloseImagePopUp;
	}


	
	public static WebElement DeleteImage() {
		
		DeleteImage=getDriver().findElement(By.xpath("//a[@class='k-button k-button-icontext ob-delete k-grid-delete']"));
		return DeleteImage;
	}

	

	
	public static WebElement AuditReporting() {
		
		AuditReporting=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a[.='Audit Reporting']"));
		return AuditReporting;
	}

	
    public static WebElement ImportExportUtility()		//Method for searching Username input
	{
   	 ImportExportUtility = getDriver().findElement(By.xpath("//a[.='Import / Export Utility']"));
		return ImportExportUtility;
			
	}

	
    public static WebElement RadioSubProcess()		//Method for searching Username input
	{
   	 RadioSubProcess = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_rdoSubProcess']"));
		return RadioSubProcess;
			
	}
   
  
    public static WebElement UploadButton1()		//Method for searching Username input
  	{
    	UploadButton1 = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnUploadFile']"));
  		return UploadButton1;
  			
  	}

    
    
    public static WebElement SuccessfullyIC()		//Method for searching Username input
	{
	 SuccessfullyIC = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return SuccessfullyIC;
			
	}


    public static WebElement ChooseFile()		//Method for searching Username input
 	{
   	 ChooseFile = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_MasterFileUpload']"));
 		return ChooseFile;
 			
 	}

    
    public static WebElement AuditAssignment()		//Method for searching Username input
 	{
    	AuditAssignment = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[.='Audit Assignment']"));
 		return AuditAssignment;
 			
 	}
 
 
    public static WebElement AddNew()		//Method for searching Username input
 	{
    	AddNew = getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnAddAuditAssignment']"));
 		return AddNew;
 			
 	}
  
  
  
    public static WebElement Company1()		//Method for searching Username input
 	{
    	Company1 = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPopPup_chosen']"));
 		return Company1;
 			
 	}
  
 
    public static WebElement Company1DD()		//Method for searching Username input
 	{
    	Company1DD = getDriver().findElement(By.xpath("//li[.='IFC Testing']"));
 		return Company1DD;
 			
 	}
  
    public static WebElement Save()		//Method for searching Username input
 	{
    	Save = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnSave']"));
 		return Save;
 			
 	}
 
  
    public static WebElement Successfully()		//Method for searching Username input
 	{
    	Successfully = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
 		return Successfully;
 			
 	}
 
    
    public static WebElement Close()		//Method for searching Username input
 	{
    	Close = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnCancel']"));
 		return Close;
 			
 	}
 
    
    
    public static WebElement Comapny2()		//Method for searching Username input
 	{
    	Comapny2 = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
 		return Comapny2;
 			
 	}
 
   
    public static WebElement Comapny2DD()		//Method for searching Username input
 	{
    	Comapny2DD = getDriver().findElement(By.xpath("//li[.='IFC Test Live']"));
 		return Comapny2DD;
 			
 	}
 
    
    public static WebElement Grid()		//Method for searching Username input
  	{
    	Grid = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_DropDownListPageNo_chosen']"));
  		return Grid;
  			
  	}
  
 
    
    public static WebElement ProcessOrder()		//Method for searching Username input
  	{
    	ProcessOrder = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_GridObservationDetails_txtProcessSequence_0']"));
  		return ProcessOrder;
  			
  	}
  
 
    public static WebElement ObservationNumber()		//Method for searching Username input
  	{
    	ObservationNumber = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_GridObservationDetails_txtObservationNumber_0']"));
  		return ObservationNumber;
  			
  	}
  
  
    public static WebElement FeedbackForm()		//Method for searching Username input
  	{
    	FeedbackForm = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_FeedbackFileUpload']"));
  		return FeedbackForm;
  			
  	}
 
    
    public static WebElement Remark()		//Method for searching Username input
   	{
    	Remark = getDriver().findElement(By.xpath("//textarea[@id='ContentPlaceHolder1_txtRemark']"));
   		return Remark;
   			
   	}
  
    
    public static WebElement Save1()		//Method for searching Username input
   	{
    	Save1 = getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnObservation']"));
   		return Save1;
   			
   	}
  
   
    public static WebElement Draft()		//Method for searching Username input
   	{
    	Draft = getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnDraft']"));
   		return Draft;
   			
   	}
  
  
    public static WebElement SelectProcess1()		//Method for searching Username input
   	{
    	SelectProcess1 = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridObservationDetails_ddlProcess_0_chosen']"));
   		return SelectProcess1;
   			
   	}
 
    
    public static WebElement SelectProcessDD1()		//Method for searching Username input
   	{
    	SelectProcessDD1 = getDriver().findElement(By.xpath("//li[.='Final ']"));
   		return SelectProcessDD1;
   			
   	}

    
    public static WebElement ObservationNumbered()		//Method for searching Username input
   	{
    	ObservationNumbered = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_GridObservationDetails_txtObservationNumber_1']"));
   		return ObservationNumbered;
   			
   	}

  
    public static WebElement ProcessOrder1()		//Method for searching Username input
   	{
    	ProcessOrder1 = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_GridObservationDetails_txtProcessSequence_2']"));
   		return ProcessOrder1;
   			
   	}


    public static WebElement ObservationNumber1()		//Method for searching Username input
   	{
    	ObservationNumber1 = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_GridObservationDetails_txtObservationNumber_2']"));
   		return ObservationNumber1;
   			
   	}

  
    public static WebElement ObservationNumbered1()		//Method for searching Username input
   	{
    	ObservationNumbered1 = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_GridObservationDetails_txtObservationNumber_3']"));
   		return ObservationNumbered1;
   			
   	}
   
    
    
    public static WebElement Successfullyp()		//Method for searching Username input
   	{
    	Successfullyp = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary3']/ul/li"));
   		return Successfullyp;
   			
   	}
   
 
    public static WebElement PastObservation()		//Method for searching Username input
   	{
    	PastObservation = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[8]"));
   		return PastObservation;
   			
   	}
   
    
    public static WebElement ViewHistorical()		//Method for searching Username input
   	{
    	ViewHistorical = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:37']/li[2]/a"));
   		return ViewHistorical;
   			
   	}
   

  
    
    public static WebElement Process()		//Method for searching Username input
   	{
    	Process = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']"));
   		return Process;
   			
   	}

    
    public static WebElement ProcessDD()		//Method for searching Username input
   	{
    	ProcessDD = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess']/label[1]"));
   		return ProcessDD;
   			
   	}

  
    public static WebElement ProcessOK()		//Method for searching Username input
   	{
    	ProcessOK = getDriver().findElement(By.xpath("//*[@id='buttons']/input[1]"));
   		return ProcessOK;
   			
   	}

  
    public static WebElement SubProcess()		//Method for searching Username input
   	{
    	SubProcess = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubProcess_sl']"));
   		return SubProcess;
   			
   	}

    
    public static WebElement SubProcessDD()		//Method for searching Username input
   	{
    	SubProcessDD = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubProcess']/label[1]"));
   		return SubProcessDD;
   			
   	}

    public static WebElement SubProcessok()		//Method for searching Username input
   	{
    	SubProcessok = getDriver().findElement(By.xpath("(//*[@id='buttons']/input[1])[2]"));
   		return SubProcessok;
   			
   	}

    
    public static WebElement SearchBox()		//Method for searching Username input
   	{
    	SearchBox = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtAuditStepFilter']"));
   		return SearchBox;
   			
   	}

  
    public static WebElement SearchText()		//Method for searching Username input
   	{
    	SearchText = getDriver().findElement(By.xpath("//span[@id='ContentPlaceHolder1_grdViewObservations_lblSubProcess_0' and .='CNR2']"));
   		return SearchText;
   			
   	}

  
    public static WebElement AuditStep()		//Method for searching Username input
   	{
    	AuditStep = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdViewObservations_LinkButton1_0']/img"));
   		return AuditStep;
   			
   	}

  
    public static WebElement CloseButton()		//Method for searching Username input
   	{
    	CloseButton = getDriver().findElement(By.xpath("//button[@id='btnClose']"));
   		return CloseButton;
   			
   	}

  
    public static WebElement ObservationCount()		//Method for searching Username input
   	{
    	ObservationCount = getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdViewObservations_lnkObservationCount_0']"));
   		return ObservationCount;
   			
   	}

    
    public static WebElement Frame2()		//Method for searching Username input
   	{
    	Frame2 = getDriver().findElement(By.xpath("//iframe[@id='DetObsshowdetails']"));
   		return Frame2;
   			
   	}

 
    public static WebElement View()		//Method for searching Username input
   	{
    	View = getDriver().findElement(By.xpath("//*[@id='grdDetailedObs_LinkButton1_0']/img"));
   		return View;
   			
   	}

    
    public static WebElement Closebutton1()		//Method for searching Username input
   	{
    	Closebutton1 = getDriver().findElement(By.xpath("//div[@id='upViewobservation']//*[@id='btnClose']"));
   		return Closebutton1;
   			
   	}

    public static WebElement EditUA()		//Method for searching Username input
  	{
    	 EditUA = getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnAddComplianceTypeEdit']"));
  		return EditUA;
  			
  	}
    
  
     public static WebElement ReAssignUA()		//Method for searching Username input
   	{
    	 ReAssignUA = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnReAssign']"));
   		return ReAssignUA;
   			
   	}
     
   
     public static WebElement UserUA()		//Method for searching Username input
   	{
    	 UserUA = getDriver().findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlUser']/option[3]"));
   		return UserUA;
   			
   	}
    
   
     public static WebElement NewUserAssignUADD()		//Method for searching Username input
    	{
    	 NewUserAssignUADD = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdReassign_ddlGridReAssignUser_0_chosen']/div/ul/li[2]"));
    		return NewUserAssignUADD;
    			
    	}
     
     
     
     public static WebElement NewUserAssignUA()		//Method for searching Username input
 	{
 	 NewUserAssignUA = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdReassign_ddlGridReAssignUser_0_chosen']/a"));
 		return NewUserAssignUA;
 			
 	}
  
  
     
     
    
     
   
     public static WebElement Save1UA()		//Method for searching Username input
 	{
    	 Save1UA = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnReassignEvent']"));
 		return Save1UA;
 			
 	}
 
  
   
    
   
     public static WebElement Close1UA()		//Method for searching Username input
   	{
    	 Close1UA = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnReassignClose']"));
   		return Close1UA;
   			
   	}
    
     
     
     public static WebElement DeleteUA()		//Method for searching Username input
    	{
    	 DeleteUA = getDriver().findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_grdAssignEntities_lbtDelete_0\"]/img"));
    		return DeleteUA;
    			
    	}
    
   
     public static WebElement OK3()		//Method for searching Username input
 	{
    	 OK3 = getDriver().findElement(By.xpath("(//*[@id=\"buttons\"]/input[1])[6]"));
 		return OK3;
 			
 	}
 

     public static WebElement UsersUA()		//Method for searching Username input
  	{
    	 UsersUA = getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_ddlAuditHeadUsers_chosen']"));
  		return UsersUA;
  			
  	}
     
     
     public static WebElement UsersDDUA()		//Method for searching Username input
   	{
    	 UsersDDUA = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditHeadUsers_chosen']/div/ul/li[2]"));
   		return UsersDDUA;
   			
   	}
     
   
   
     
     public static WebElement SelectUnitUA()		//Method for searching Username input
   	{
    	 SelectUnitUA = getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_ddlLegalEntityAuditHeadPopPupEdit_sl']"));
   		return SelectUnitUA;
   			
   	}
    
     
     public static WebElement SelectUnitDDUA()		//Method for searching Username input
    	{
    	 SelectUnitDDUA = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_ddlLegalEntityAuditHeadPopPupEdit_11']"));
    		return SelectUnitDDUA;
    			
    	}
     
     
   
     public static WebElement Ok()		//Method for searching Username input
 	{
    	 Ok = getDriver().findElement(By.xpath("(//*[@id='buttons']/input[1])[19]"));
 		return Ok;
 			
 	}

     
     public static WebElement User1()		//Method for searching Username input
  	{
    	 User1 = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditHeadUsersEdit_chosen']"));
  		return User1;
  			
  	}
 
     
     public static WebElement User1DD()		//Method for searching Username input
   	{
    	 User1DD = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditHeadUsersEdit_chosen']/div/ul/li[2]"));
   		return User1DD;
   			
   	}
   
    
     public static WebElement SelectProcess()		//Method for searching Username input
    	{
    	 SelectProcess = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessAuditHeadEdit_sl']"));
    		return SelectProcess;
    			
    	}
    
     
     public static WebElement SelectProcessDD()		//Method for searching Username input
 	{
    	 SelectProcessDD = getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_ddlProcessAuditHeadEdit_dv']/div/span/input[@name='ContentPlaceHolder1_ddlProcessAuditHeadEdit_sll']"));
 		return SelectProcessDD;
 			
 	}

   
     public static WebElement ok1()		//Method for searching Username input
  	{
    	 ok1 = getDriver().findElement(By.xpath("(//*[@id='buttons']/input[1])[24]"));
  		return ok1;
  			
  	}

     
     public static WebElement save2()		//Method for searching Username input
   	{
    	 save2 = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnAuditHeadSaveEdit']"));
   		return save2;
   			
   	}

     
     public static WebElement close2()		//Method for searching Username input
   	{
    	 close2 = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnCloseEdit']"));
   		return close2;
   			
   	}

     
     public static WebElement Successfully2()		//Method for searching Username input
   	{
    	 Successfully2 = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_AuditHeadValidationSummaryEdit']/ul/li"));
   		return Successfully2;
   			
   	}
 
     
     public static WebElement User3()		//Method for searching Username input
    	{
    	 User3 = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlUser_chosen']/a"));
    		return User3;
    			
    	}
  
     
     public static WebElement User3DD()		//Method for searching Username input
 	{
    	 User3DD = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlUser_chosen']/div/ul/li[2]"));
 		return User3DD;
 			
 	}

     
     
     public static WebElement Successfully3()		//Method for searching Username input
  	{
    	 Successfully3 = getDriver().findElement(By.xpath("//*[@id='confirmbox']/p1/strong"));
  		return Successfully3;
  			
  	}
 
     
     public static WebElement UserDD()		//Method for searching Username input
  	{
    	 UserDD = getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_ddlAuditHeadUsersEdit_chosen']/div/ul/li[.='Select User']"));
  		return UserDD;
  			
  	}
 

     public static WebElement GenerateReport()		//Method for searching Username input
   	{
    	 GenerateReport = getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_btnGenrateReport']"));
   		return GenerateReport;
   			
   	}
  
   
   
     public static WebElement Unit()		//Method for searching Username input
   	{
    	 Unit = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityManagementPopPupEdit_sl']"));
   		return Unit;
   			
   	}

   
     public static WebElement UnitDD()		//Method for searching Username input
   	{
    	 UnitDD = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_ddlLegalEntityManagementPopPupEdit_2']"));
   		return UnitDD;
   			
   	}

     
     public static WebElement OK()		//Method for searching Username input
   	{
    	 OK = getDriver().findElement(By.xpath("(//*[@id='buttons']/input[1])[19]"));
   		return OK;
   			
   	}

     
   
     public static WebElement User()		//Method for searching Username input
   	{
    	 User = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlManagementUsersEdit_chosen']"));
   		return User;
   			
   	}
 
     
     public static WebElement UserSDD()		//Method for searching Username input
    	{
    	 UserSDD = getDriver().findElement(By.xpath("//li[.='QA Plantcfo']"));
    		return UserSDD;
    			
    	}
  
     public static WebElement UserNewDD()		//Method for searching Username input
    	{
    	 UserNewDD = getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_ddlManagementUsersEdit_chosen']/div/ul/li[.='Select User']"));
    		return UserNewDD;
    			
    	}

   
     
     public static WebElement Processs()		//Method for searching Username input
   	{
    	 Processs = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessManagementEdit_sl']"));
   		return Processs;
   			
   	}
 
     public static WebElement ProcesssDD()		//Method for searching Username input
   	{
    	 ProcesssDD = getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_ddlProcessManagementEdit_dv']/div/span/input[@name='ContentPlaceHolder1_ddlProcessManagementEdit_sll']"));
   		return ProcesssDD;
   			
   	}
 
   
     public static WebElement OKProcess()		//Method for searching Username input
   	{
    	 OKProcess = getDriver().findElement(By.xpath("(//*[@id='buttons']/input[1])[24]"));
   		return OKProcess;
   			
   	}
 

   
     
     public static WebElement UnitD()		//Method for searching Username input
    	{
    	 UnitD = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityDepartmentHeadPopPupEdit_sl']"));
    		return UnitD;
    			
    	}
  

     
     public static WebElement UnitDDD()		//Method for searching Username input
 	{
    	 UnitDDD = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityDepartmentHeadPopPupEdit_2']"));
 		return UnitDDD;
 			
 	}

     
     public static WebElement UnitDOK()		//Method for searching Username input
 	{
    	 UnitDOK = getDriver().findElement(By.xpath("(//*[@id='buttons']/input[1])[19]"));
 		return UnitDOK;
 			
 	}

    
     public static WebElement UserD()		//Method for searching Username input
 	{
    	 UserD = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartmentHeadUsersEdit_chosen']"));
 		return UserD;
 			
 	}


     public static WebElement UserDDD()		//Method for searching Username input
  	{
    	 UserDDD = getDriver().findElement(By.xpath("//li[.='Teamlease regtech']"));
  		return UserDDD;
  			
  	}


     public static WebElement UserDDDNew()		//Method for searching Username input
  	{
    	 UserDDDNew = getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_ddlDepartmentHeadUsersEdit_chosen']/div/ul/li[.='Select User']"));
  		return UserDDDNew;
  			
  	}

     
     public static WebElement Department()		//Method for searching Username input
  	{
    	 Department = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartmentEdit_sl']"));
  		return Department;
  			
  	}

   
   
     public static WebElement DepartmentDD()		//Method for searching Username input
  	{
    	 DepartmentDD = getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_ddlDepartmentEdit_dv']/div/span/input[@name='ContentPlaceHolder1_ddlDepartmentEdit_sll']"));
  		return DepartmentDD;
  			
  	}

   
     public static WebElement DepartmentOK()		//Method for searching Username input
  	{
    	 DepartmentOK = getDriver().findElement(By.xpath("(//*[@id='buttons']/input[1])[24]"));
  		return DepartmentOK;
  			
  	}
  
// -----------------------------------------------------------------------------  
     
     
	public static WebElement Successfull() {
		
		Successfull=getDriver().findElement(By.xpath("//*[@id='vsLogin']/ul/li"));
		return Successfull;
	}

	
	
    public  static WebElement Master1() {
		
    	Master1=getDriver().findElement(By.xpath("//a[.='Masters']"));
		return Master1;
	}
	
	
	
     public  static WebElement Unit1() {
		
    	 Unit1=getDriver().findElement(By.xpath("//a[.='Unit']"));
		return Unit1;
	}
	
	
     public static WebElement addnew() {
    	 
    	 addnew=getDriver().findElement(By.id("ContentPlaceHolder1_btnAddCustomerBranch"));
 		return addnew;
 	}
	
     
     
     
     public static WebElement Name()		//Method for searching Username input
 	{
    	 Name = getDriver().findElement(By.id("ContentPlaceHolder1_tbxName"));
 		return Name;
 	}
 	
     
     
     public static WebElement UnitType()		//Method for searching Username input
  	{
    	 UnitType = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlType']"));
  		return UnitType;
  	}
     
     
     public static WebElement Adress()		//Method for searching Username input
  	{
    	 Adress = getDriver().findElement(By.id("ContentPlaceHolder1_tbxAddressLine1"));
  		return Adress;
  	}
     
     
    
     public static WebElement State()		//Method for searching Username input
   	{
    	 State = getDriver().findElement(By.id("ContentPlaceHolder1_ddlState"));
   		return State;
   	}
      
     
     public static WebElement City()		//Method for searching Username input
    	{
    	 City = getDriver().findElement(By.id("ContentPlaceHolder1_ddlCity"));
    		return City;
    	}
     
     
 
     public static WebElement ContactPerson()		//Method for searching Username input
 	{
    	 ContactPerson = getDriver().findElement(By.id("ContentPlaceHolder1_tbxContactPerson"));
 		return ContactPerson;
 	}
  
     
     
     public static WebElement Email()		//Method for searching Username input
  	{
    	 Email = getDriver().findElement(By.id("ContentPlaceHolder1_tbxEmail"));
  		return Email;
  	}
     
     
     
     public static WebElement save()		//Method for searching Username input
   	{
    	 save = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnSave']"));
   		return save;
   	}
      
     
     
     public static WebElement ExportToExcel()		//Method for searching Username input
    	{
    	 ExportToExcel = getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_lnkExportCustomerBranchlist']"));
    		return ExportToExcel;
    	}
   
     
     public static WebElement Edit()		//Method for searching Username input
 	{
    	 Edit = getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_grdCustomerBranch_LinkButton1_0']"));
 		return Edit;
 	}
     
     
     public static WebElement Successfully1()		//Method for searching Username input
  	{
    	 Successfully1 = getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_valcustomerbranch']"));
  		return Successfully1;
  	}
     
     
   
     public static WebElement Close1()		//Method for searching Username input
   	{
    	 Close1 = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnCancel']"));
   		return Close1;
   	}
   
     
     public static WebElement SubUnit()		//Method for searching Username input
 	{
    	 SubUnit = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdCustomerBranch']/tbody/tr[2]/td[9]/a"));
 		return SubUnit;
 	}
 
   //---------------------------------------------------
     
     public static WebElement DepartmentMaster()		//Method for searching Username input
  	{
     	 DepartmentMaster = getDriver().findElement(By.xpath("//a[.='Department Master']"));
  		return DepartmentMaster;
  	}
   
   
      public static WebElement AddNewDM()		//Method for searching Username input
   	{
     	 AddNewDM = getDriver().findElement(By.id("ContentPlaceHolder1_btnAddPromotor"));
   		return AddNewDM;
   	}
      
      
      public static WebElement DepartmentName()		//Method for searching Username input
    	{
     	 DepartmentName = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtFName']"));
    		return DepartmentName;
    	}
       
      public static WebElement SaveDM()		//Method for searching Username input
     	{
     	 SaveDM = getDriver().findElement(By.id("ContentPlaceHolder1_btnSave"));
     		return SaveDM;
     	}
      
      
      public static WebElement SuccessfullyDM()		//Method for searching Username input
  	{
     	 SuccessfullyDM = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
  		return SuccessfullyDM;
  	}
      
      
      
      public static WebElement CloseDM()		//Method for searching Username input
   	{
     	 CloseDM = getDriver().findElement(By.id("ContentPlaceHolder1_btnCancel"));
   		return CloseDM;
   	}
      
      
      public static WebElement EditDM()		//Method for searching Username input
    	{
     	 EditDM = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor_LinkButton1_0']/img"));
    		return EditDM;
    	}

     //-----------------------------------------------------------------
     
      public static WebElement Observations()		//Method for searching Username input
     	{
    	  Observations = getDriver().findElement(By.xpath("//a[.='Observation Category']"));
     		return Observations;
     			
     	}
       

      public static WebElement AddNewOC()		//Method for searching Username input
  	{
  	 AddNewOC = getDriver().findElement(By.id("ContentPlaceHolder1_btnAddPromotor"));
  		return AddNewOC;
  			
  	}
    
   
   public static WebElement NameOC()		//Method for searching Username input
  	{
  	 NameOC = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtFName']"));
  		return NameOC;
  			
  	}
   
   public static WebElement SaveOC()		//Method for searching Username input
	{
  	 SaveOC = getDriver().findElement(By.id("ContentPlaceHolder1_btnSave"));
		return SaveOC;
			
	}
 
   public static WebElement CancelOC()		//Method for searching Username input
	{
  	 CancelOC = getDriver().findElement(By.id("ContentPlaceHolder1_btnCancel"));
		return CancelOC;
			
	}
  
   
   public static WebElement SuccessfullOC()		//Method for searching Username input
 	{
  	 SuccessfullOC = getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_ValidationSummary1']"));
 		return SuccessfullOC;
 			
 	}
   
   
   
   public static WebElement EditOC()		//Method for searching Username input
  	{
  	 EditOC = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor_LinkButton1_0']/img"));
  		return EditOC;
  			
  	}
    
   
   public static WebElement SubCatogariesOC()		//Method for searching Username input
	{
  	 SubCatogariesOC = getDriver().findElement(By.id("ContentPlaceHolder1_grdAuditor_lnkCategory_0"));
		return SubCatogariesOC;
			
	}
 
  
   
   public static WebElement SubCatogariesAddNewOC()		//Method for searching Username input
	{
  	 SubCatogariesAddNewOC = getDriver().findElement(By.id("ContentPlaceHolder1_btnSubcategory"));
		return SubCatogariesAddNewOC;
			
	}
  
   
   public static WebElement SubCatogariesNameOC()		//Method for searching Username input
 	{
  	 SubCatogariesNameOC = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_tbxName']"));
 		return SubCatogariesNameOC;
 			
 	}
   
  
   public static WebElement SubCatogariesEditOC()		//Method for searching Username input
	{
  	 SubCatogariesEditOC = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_lbtEdit_0']/img"));
		return SubCatogariesEditOC;
			
	}

   //--------------------------------------------------------------------------------------------------------------
   
   public static WebElement RiskCatogary()		//Method for searching Username input
	{
  	 RiskCatogary = getDriver().findElement(By.xpath("//a[.='Risk Category']"));
		return RiskCatogary;
			
	}
 
   
   public static WebElement AddNewRC()		//Method for searching Username input
 	{
  	 AddNewRC = getDriver().findElement(By.id("ContentPlaceHolder1_btnAddProcess"));
 		return AddNewRC;
 			
 	}
   
 
   public static WebElement NameRC()		//Method for searching Username input
  	{
  	 NameRC = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_tbxName']"));
  		return NameRC;
  			
  	}
 
   
   public static WebElement RadioRC()		//Method for searching Username input
	{
  	 RadioRC = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_rdRiskProcess_0']"));
		return RadioRC;
			
	}

   public static WebElement Radio1RC()		//Method for searching Username input
	{
  	 Radio1RC = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_rdRiskProcess_1']"));
		return Radio1RC;
			
	}
   
 
 
   public static WebElement EditRC()		//Method for searching Username input
	{
  	 EditRC = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskcategoryList_lbtEdit_0']/img"));
		return EditRC;
			
	}
   
   
   public static WebElement RiskFilterText()		//Method for searching Username input
 	{
  	 RiskFilterText = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskcategoryList']/tbody/tr[2]/td[2]"));
 		return RiskFilterText;
 			
 	}
   
 //--------------------------------------------------------------------
   
   public static WebElement Users()		//Method for searching Username input
  	{
   	 Users = getDriver().findElement(By.xpath("//a[.='Users']"));
  		return Users;
  			
  	}
  
    
    public static WebElement AddNewUsers()		//Method for searching Username input
   	{
   	 AddNewUsers = getDriver().findElement(By.id("ContentPlaceHolder1_btnAddUser"));
   		return AddNewUsers;
   			
   	}
    
    
    public static WebElement FirstNameU()		//Method for searching Username input
	{
   	 FirstNameU = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_udcInputForm_tbxFirstName']"));
		return FirstNameU;
			
	}
  
    public static WebElement LastNameU()		//Method for searching Username input
 	{
   	 LastNameU = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_udcInputForm_tbxLastName']"));
 		return LastNameU;
 			
 	}
  
 
    public static WebElement DestinationU()		//Method for searching Username input
  	{
   	 DestinationU = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_udcInputForm_tbxDesignation']"));
  		return DestinationU;
  			
  	}
   
  
    public static WebElement EmailU()		//Method for searching Username input
   	{
   	 EmailU = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_udcInputForm_tbxEmail']"));
   		return EmailU;
   			
   	}
    
  
    public static WebElement ContactNoU()		//Method for searching Username input
	{
   	 ContactNoU = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_udcInputForm_tbxContactNo']"));
		return ContactNoU;
			
	}
 

    public static WebElement DepartmentU()		//Method for searching Username input
 	{
   	 DepartmentU = getDriver().findElement(By.xpath("//select[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']"));
 		return DepartmentU;
 			
 	}
  
  
    public static WebElement DepartmentCheckBoxU()		//Method for searching Username input
  	{
   	 DepartmentCheckBoxU = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_udcInputForm_chkHead']"));
  		return DepartmentCheckBoxU;
  			
  	}
   
  
    public static WebElement AuditRoleU()		//Method for searching Username input
   	{
   	 AuditRoleU = getDriver().findElement(By.xpath("//select[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']"));
   		return AuditRoleU;
   			
   	}
    
    
    public static WebElement RadioU()		//Method for searching Username input
	{
   	 RadioU = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_udcInputForm_rblAuditRole_0']"));
		return RadioU;
			
	}
 
 
    
  
    
  
  
    public static WebElement SaveU()		//Method for searching Username input
	{
   	 SaveU = getDriver().findElement(By.id("ContentPlaceHolder1_udcInputForm_btnSave"));
		return SaveU;
			
	}
 
   
    public static WebElement CancelU()		//Method for searching Username input
 	{
   	 CancelU = getDriver().findElement(By.id("ContentPlaceHolder1_udcInputForm_btnCancel"));
 		return CancelU;
 			
 	}
  
    
    public static WebElement SuccessfullyU()		//Method for searching Username input
  	{
   	 SuccessfullyU = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ValidationSummary15']/ul/li"));
  		return SuccessfullyU;
  			
  	}
   
     
    public static WebElement EditU()		//Method for searching Username input
   	{
   	 EditU = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdUser_lbtnEdit_2']/img"));
   		return EditU;
   			
   	}
     
    
    public static WebElement DeleteU()		//Method for searching Username input
	{
   	 DeleteU = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdUser_lbtnDelete_2']/img"));
		return DeleteU;
			
	}
  
 
    public static WebElement ResetPasswordU()		//Method for searching Username input
 	{
   	 ResetPasswordU = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdUser_lbtnReset_2']/img"));
 		return ResetPasswordU;
 			
 	}
   
  
    
    public static WebElement ExportToExcelU()		//Method for searching Username input
  	{
   	 ExportToExcelU = getDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_lnkExportUserlist']"));
  		return ExportToExcelU;
  			
  	}
    
   //------------------------------------------------------------------------------------------------------
    
    public static WebElement SelectCompanyUA()		//Method for searching Username input
   	{
   	 SelectCompanyUA = getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_ddlLegalEntityAuditHeadPopPup_sl']"));
   		return SelectCompanyUA;
   			
   	}
    
    
    
    public static WebElement SelectCompanyUADD()		//Method for searching Username input
	{
   	 SelectCompanyUADD = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_ddlLegalEntityAuditHeadPopPup_11']"));
		return SelectCompanyUADD;
			
	}
 
  
    
    
   
    public static WebElement OKUA()		//Method for searching Username input
 	{
   	 OKUA = getDriver().findElement(By.xpath("//*[@id='buttons']/input[1]"));
 		return OKUA;
 			
 	}
  
    
    
    public static WebElement SelectUser()		//Method for searching Username input
 	{
   	 SelectUser = getDriver().findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlAuditHeadUsers']/option[5]"));
 		return SelectUser;
 			
 	}
  
    
    
    public static WebElement SelectProcessUA()		//Method for searching Username input
  	{
   	 SelectProcessUA = getDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_ddlProcessAuditHead_sl']"));
  		return SelectProcessUA;
  			
  	}
   
    
  
    public static WebElement SelectProcessUADD()		//Method for searching Username input
  	{
   	 SelectProcessUADD = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_ddlProcessAuditHead_2']"));
  		return SelectProcessUADD;
  			
  	}
  
 
    public static WebElement Successfullymessage()		//Method for searching Username input
  	{
    	Successfullymessage = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_VSReassignSummary']/ul/li"));
  		return Successfullymessage;
  			
  	}

//--------------------------------------------------------------------------------------------------------
    
    public static WebElement AuditFirmNameAM()		//Method for searching Username input
  	{
   	 AuditFirmNameAM = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtFName']"));
  		return AuditFirmNameAM;
  			
  	}
     
    
    public static WebElement PartenerNameAM()		//Method for searching Username input
  	{
   	 PartenerNameAM = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtPName']"));
  		return PartenerNameAM;
  			
  	}
    
  
    public static WebElement PartenerContactNoAM()		//Method for searching Username input
   	{
   	 PartenerContactNoAM = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtPContactNo']"));
   		return PartenerContactNoAM;
   			
   	}
     
    
    
    public static WebElement ManagerNameAM()		//Method for searching Username input
   	{
   	 ManagerNameAM = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtAName']"));
   		return ManagerNameAM;
   			
   	}
     
   
    public static WebElement ManagerContactNoAM()		//Method for searching Username input
	{
   	 ManagerContactNoAM = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtAContactNo']"));
		return ManagerContactNoAM;
			
	}
   
      
     
   
    public static WebElement EditAM()		//Method for searching Username input
	{
   	 EditAM = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor_LinkButton1_0']/img"));
		return EditAM;
			
	}

  //---------------------------------------------------------------------------
    
    public static WebElement AuditorsTeamMaster()		//Method for searching Username input
 	{
   	 AuditorsTeamMaster = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[10]"));
 		return AuditorsTeamMaster;
 			
 	}
  
  
    public static WebElement AddNewATM()		//Method for searching Username input
  	{
   	 AddNewATM = getDriver().findElement(By.id("ContentPlaceHolder1_btnAddPromotor"));
  		return AddNewATM;
  			
  	}
    
    
    public static WebElement SelectAuditorATM()		//Method for searching Username input
   	{
   	 SelectAuditorATM = getDriver().findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlAuditor']"));
   		return SelectAuditorATM;
   			
   	}
    
  
    
    public static WebElement RadioATM()		//Method for searching Username input
	{
   	 RadioATM = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_rblAuditRole_0']"));
		return RadioATM;
			
	}
 

    
    public static WebElement FirstNameATM()		//Method for searching Username input
	{
   	 FirstNameATM = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtFName']"));
		return FirstNameATM;
			
	}
 

    public static WebElement LastNameATM()		//Method for searching Username input
 	{
   	 LastNameATM = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtLName']"));
 		return LastNameATM;
 			
 	}
   
  
    
    public static WebElement EmailATM()		//Method for searching Username input
  	{
   	 EmailATM = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtEmail']"));
  		return EmailATM;
  			
  	}
    
  
    public static WebElement ContactATM()		//Method for searching Username input
   	{
   	 ContactATM = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtContactNo']"));
   		return ContactATM;
   			
   	}
    
    
    public static WebElement EditATM()		//Method for searching Username input
	{
   	 EditATM = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor_LinkButton1_1']/img"));
		return EditATM;
			
	}
 
   //--------------------------------------------------------------------------------------------------------
    
    public static WebElement StateMaster()		//Method for searching Username input
 	{
   	 StateMaster = getDriver().findElement(By.xpath("//a[.='State Master']"));
 		return StateMaster;
 			
 	}
  
    
    
    public static WebElement AddNewSM()		//Method for searching Username input
  	{
   	 AddNewSM = getDriver().findElement(By.id("ContentPlaceHolder1_btnAddPromotor"));
  		return AddNewSM;
  			
  	}
   
  
    
    public static WebElement NameSM()		//Method for searching Username input
   	{
   	 NameSM = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtFName']"));
   		return NameSM;
   			
   	}
   
  
    public static WebElement CountrySM()		//Method for searching Username input
	{
   	 CountrySM = getDriver().findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlCountry']/option[2]"));
		return CountrySM;
			
	}

    
    public static WebElement EditSM()		//Method for searching Username input
	{
   	 EditSM = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor_LinkButton1_0']/img"));
		return EditSM;
			
	}

    //--------------------------------------------------------------     
     
     public static WebElement CityNameCM()		//Method for searching Username input
   	{
    	 CityNameCM = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtFName']"));
   		return CityNameCM;
   			
   	}
      
     
     public static WebElement StateNameCM()		//Method for searching Username input
    	{
    	 StateNameCM = getDriver().findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlState']/option[20]"));
    		return StateNameCM;
    			
    	}
      
   
     public static WebElement EditCM()		//Method for searching Username input
 	{
    	 EditCM = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor_LinkButton1_0']/img"));
 		return EditCM;
 			
 	}
     
       
     
     public static WebElement CitySearch()		//Method for searching Username input
   	{
    	 CitySearch = getDriver().findElement(By.id("ContentPlaceHolder1_tbxSearchCity"));
   		return CitySearch;
   			
   	}
      
     
     
  
    /////////////////////////////////////////////////////////
     
     public static WebElement ProcessMaster()		//Method for searching Username input
  	{
    	 ProcessMaster = getDriver().findElement(By.xpath("//a[.='Process Rating']"));
  		return ProcessMaster;
  			
  	}
     
     
     public static WebElement AddNewPM()		//Method for searching Username input
   	{
    	 AddNewPM = getDriver().findElement(By.id("ContentPlaceHolder1_btnAddPromotor"));
   		return AddNewPM;
   			
   	}
     
     
     public static WebElement NamePM()		//Method for searching Username input
    	{
    	 NamePM = getDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtFName']"));
    		return NamePM;
    			
    	}
     
   
     
     public static WebElement DescriptionPM()		//Method for searching Username input
 	{
    	 DescriptionPM = getDriver().findElement(By.xpath("//textarea[@id='ContentPlaceHolder1_txtDescription']"));
 		return DescriptionPM;
 			
 	}
  

     public static WebElement EditPM()		//Method for searching Username input
  	{
    	 EditPM = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor_LinkButton1_0']/img"));
  		return EditPM;
  			
  	}
   

     public static WebElement DeletePM()		//Method for searching Username input
   	{
    	 DeletePM = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor_LinkButton2_0']/img"));
   		return DeletePM;
   			
   	}
    

    //---------------------------------------------------------------------------------------------------------------------
    
    
  	

 	public static WebElement clickARS()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='dvbtnAudit']"));
 		return ars;
 	}
 	
 	public static WebElement clickMaster()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]/a"));
 		return ars;
 	}
 	
 	public static WebElement UnitAssignment1()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[8]/a"));
 		return ars;
 	}
 	
 	public static WebElement AddNew1()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddComplianceType']"));
 		return ars;
 	}
 	
 	public static WebElement SelectCompany()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityAuditHeadPopPup_sl']"));
 		return ars;
 	}
 	
 	public static WebElement Ahemdabad()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityAuditHeadPopPup_0']"));
 		return ars;
 	}
 	
 	public static WebElement Ok11()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='buttons']/input[1]"));
 		return ars;
 	}
 	
 	public static WebElement SelectUser11()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditHeadUsers_chosen']/a/span"));
 		return ars;
 	}
 	
 	public static WebElement RichaShah()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditHeadUsers_chosen']/div/ul/li[2]"));
 		return ars;
 	}
 	
 	public static WebElement SelectProcess2()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessAuditHead_sl']"));
 		return ars;
 	}
 	
 	public static WebElement ActionProcess()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessAuditHead_1']"));
 		return ars;
 	}
 	
 	public static WebElement ProcessOk()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("(//*[@id='buttons']/input[1])[6]"));
 		return ars;
 	}
 	
 	public static WebElement Save11()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAuditHeadSave']"));
 		return ars;
 	}
 	
 	public static WebElement Savemsg()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_AuditHeadValidationSummary']/ul/li"));
 		return ars;
 	}
 	
 	public static WebElement close()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnClose']"));
 		return ars;
 	}
 	
 	public static WebElement Management()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnTabManagement']"));
 		return ars;
 	}
 	
 	public static WebElement SelectUnit()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityManagementPopPup_sl']"));
 		return ars;
 	}
 	
 	
 	public static WebElement AhemdabadMgmt()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityManagementPopPup_0']"));
 		return ars;
 	}
 	
 	public static WebElement User11()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlManagementUsers_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement PlantHead()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlManagementUsers_chosen']/div/ul/li[2]"));
 		return ars;
 	}
 	
 	public static WebElement SelectProcessMgmt()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessManagement_sl']"));
 		return ars;
 	}
 	
 	public static WebElement ActionProcessMgmt()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessManagement_1']"));
 		return ars;
 	}

 	public static WebElement SaveMgmt()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnManagementSave']"));
 		return ars;
 	}

 	public static WebElement SaveMgmtMsg()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ManagementValidationSummary']/ul/li"));
 		return ars;
 	}
 	
 	public static WebElement CloseMgmt()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseManagement']"));
 		return ars;
 	}
 	
 	public static WebElement DepartmentHead()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnTabDepartmentHead']"));
 		return ars;
 	}

 	
 	public static WebElement SelectUnitDpt()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityDepartmentHeadPopPup_sl']"));
 		return ars;
 	}
 	
 	public static WebElement AhemdabadDept()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityDepartmentHeadPopPup_0']"));
 		return ars;
 	}

 	public static WebElement SelectUserDpt()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartmentHeadUsers_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement Departmenthead()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartmentHeadUsers_chosen']/div/ul/li[2]"));
 		return ars;
 	}
 	
 	public static WebElement SelectDepartment()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartment_sl']"));
 		return ars;
 	}
 	
 	public static WebElement AdminDpt()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartment_0']"));
 		return ars;
 	}
 	
 	
 	public static WebElement SaveDpt()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDepartmentHeadSave']"));
 		return ars;
 	}
 	
 	public static WebElement SaveDptMsg()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_DepartmentHeadValidationSummary']/ul/li"));
 		return ars;
 	}
 	
 	public static WebElement CloseDpt()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDepartmentHead']"));
 		return ars;
 	}
 	
 	public static WebElement EditUnitAssignment()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddComplianceTypeEdit']"));
 		return ars;
 	}
 	
 	public static WebElement SelectUnitEdit()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityAuditHeadPopPupEdit_sl']"));
 		return ars;
 	}
 	
 	public static WebElement Ahemdabad1()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityAuditHeadPopPupEdit_0']"));
 		return ars;
 	}
 	
 	public static WebElement Ok1()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("(//*[@id='buttons']/input[1])[19]"));
 		return ars;
 	}

 	public static WebElement SelectUser1()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditHeadUsersEdit_chosen']/a"));
 		return ars;
 	}

 	public static WebElement RichaShah1()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditHeadUsersEdit_chosen']/div/ul/li[2]"));
 		return ars;
 	}

 	public static WebElement SelectProcess11()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessAuditHeadEdit_sl']"));
 		return ars;
 	}
 	
 	public static WebElement AgroServiceDivision()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessAuditHeadEdit_1']"));
 		return ars;
 	}
 	
 	public static WebElement Ok2()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("(//*[@id='buttons']/input[1])[24]"));
 		return ars;
 	}

 	public static WebElement SaveEdit()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAuditHeadSaveEdit']"));
 		return ars;
 	}
 	
 	public static WebElement SaveEditMsg()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_AuditHeadValidationSummaryEdit']/ul/li"));
 		return ars;
 	}
 	
 	public static WebElement Editclose()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseEdit']"));
 		return ars;
 	}
 	
 	public static WebElement ManagementEdit()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnTabManagementEdit']"));
 		return ars;
 	}
 	
 	public static WebElement SelectUnitEditM()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityManagementPopPupEdit_sl']"));
 		return ars;
 	}
 	
 	public static WebElement AhemdabadEditM()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityManagementPopPupEdit_0']"));
 		return ars;
 	}

 	public static WebElement SelectUser1M()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlManagementUsersEdit_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement PlantHead1M()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlManagementUsersEdit_chosen']/div/ul/li[2]"));
 		return ars;
 	}
 	
 	public static WebElement SelectProcess1M()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessManagementEdit_sl']"));
 		return ars;
 	}
 	
 	public static WebElement ActionProcessM()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessManagementEdit_1']"));
 		return ars;
 	}
 	
 	public static WebElement SaveME()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnManagementSaveEdit']"));
 		return ars;
 	}

 	public static WebElement SaveMEMsg()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ManagementValidationSummaryEdit']/ul/li"));
 		return ars;
 	}

 	public static WebElement SelectSubUnit()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubEntity1ManagementPopPupEdit_sl']"));
 		return ars;
 	}
 	
 	public static WebElement gujrat()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubEntity1ManagementPopPupEdit_0']"));
 		return ars;
 	}
 	
 	public static WebElement OkSubunit()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("(//*[@id='buttons']/input[1])[20]"));
 		return ars;
 	}

 	public static WebElement CloseEditM()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseManagementEdit']"));
 		return ars;
 	}
 	
 	public static WebElement DepartmentHeadEdit()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnTabDepartmentHeadEdit']"));
 		return ars;
 	}
 	
 	public static WebElement SelectUnitDept()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityDepartmentHeadPopPupEdit_sl']"));
 		return ars;
 	}
 	
 	public static WebElement AhemdabadEditDept()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityDepartmentHeadPopPupEdit_0']"));
 		return ars;
 	}
 	
 	public static WebElement SelectUser1Dpt()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartmentHeadUsersEdit_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement DepartmentheadDpt()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartmentHeadUsersEdit_chosen']/div/ul/li[2]"));
 		return ars;
 	}
 	
 	public static WebElement SelectDepartmentedit()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartmentEdit_sl']"));
 		return ars;
 	}
 	
 	public static WebElement Adminedit()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartmentEdit_0']"));
 		return ars;
 	}
 	
 	public static WebElement DptSave()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDepartmentHeadSaveEdit']"));
 		return ars;
 	}
 	
 	public static WebElement DptSaveMsg()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_DepartmentHeadValidationSummaryEdit']/ul/li"));
 		return ars;
 	}
 	
 	public static WebElement DptClose()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDepartmentHeadEdit']"));
 		return ars;
 	}
 	
 	public static WebElement ReAssign()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnReAssign']"));
 		return ars;
 	}
 	
 	public static WebElement ReAssignUser()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlUser_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement ReAsRichaShahr()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlUser_chosen']/div/ul/li[2]"));
 		return ars;
 	}
 	
 	public static WebElement NewUser()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdReassign_ddlGridReAssignUser_0_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement NewUserRS()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdReassign_ddlGridReAssignUser_0_chosen']/div/ul/li[2]"));
 		return ars;
 	}
 	
 	public static WebElement NewUserSave()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnReassignEvent']"));
 		return ars;
 	}
 	
 	public static WebElement ReAssignClose()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnReassignClose']"));
 		return ars;
 	}
 	
 	public static WebElement NewUserSaveMsg()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_VSReassignSummary']/ul/li"));
 		return ars;
 	}
 	
 	public static WebElement DeleteProcess()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAssignEntities_lbtDelete_0']/img"));
 		return ars;
 	}
 	
 	public static WebElement AuditReporting1()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"));
 		return ars;
 	}
 	
 	public static WebElement ImportExportUtility1()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[1]/a"));
 		return ars;
 	}
 	
 	public static WebElement RiskControlMatrix()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_rdoRCMUpload']"));
 		return ars;
 	}
 	
 	public static WebElement SelectApplicableLocation()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilterLocation']"));
 		return ars;
 	}
 	
 	public static WebElement LocationExpand()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_tvFilterLocationn0']"));
 		return ars;
 	}	
 	
 	public static WebElement India()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_tvFilterLocationn5CheckBox']"));
 		return ars;
 	}	
 	
 	public static WebElement Vertical()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='caption']"));
 		//*[@id="caption"]
 		return ars;
 	}	
 	
 	public static WebElement Vertical1()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlVerticalBranch_sl']"));
 		return ars;
 	}	
 	
 	public static WebElement NA()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlVerticalBranch_5']"));
 		//*[@id="ContentPlaceHolder1_ddlVerticalBranch_5"]
 		return ars;
 	}	
 	
 	public static WebElement ChooseFile1()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_MasterFileUpload']"));
 		return ars;
 	}	
 	
 	public static WebElement Upload()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnUploadFile']"));
 		return ars;
 	}	
 	
 	public static WebElement SubProcess1()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_rdoSubProcess']"));
 		return ars;
 	}	
 	
 	
 	public static WebElement UpdateRiskControlMatrix()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_rdoRCMUpdate']"));
 		return ars;
 	}	
 	
 	public static WebElement ExportUtility()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_Tab2']"));
 		return ars;
 	}	
 	
 	public static WebElement Company11()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
 		return ars;
 	}	
 	
 	public static WebElement EnterText()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/div/input"));
 		return ars;
 	}	
 	
 	public static WebElement IndiaCompany()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[59]"));
 		return ars;
 	}	
 	
 	public static WebElement Export()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
 		return ars;
 	}	
 	
 	public static WebElement AuditScheduling()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[4]/a"));
 		return ars;
 	}	
 	
 	public static WebElement ASAddNew()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddCompliance']"));
 		return ars;
 	}	
 	
 	public static WebElement ASSaveMsg()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ctl02']/ul/li"));
 		return ars;
 	}	
 	
 	public static WebElement CompanyAS()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPop_chosen']/a"));
 		return ars;
 	}	
 	
 	public static WebElement IndiaAS()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPop_chosen']/div/ul/li[59]"));
 		return ars;
 	}	
 	
 	public static WebElement SelectProcessAS()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessList_sl']"));
 		return ars;
 	}	
 	
 	public static WebElement BankingCheckbox()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessList_0']"));
 		return ars;
 	}	
 	
 	public static WebElement OK11()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("(//*[@id='buttons']/input[1])[2]"));
 		return ars;
 	}	
 	
 	public static WebElement FinancialYear()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/a"));
 		return ars;
 	}	
 	
 	public static WebElement SelectFinancialYear()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/div/ul/li[16]"));
 		return ars;
 	}	
 	
 	public static WebElement SchedulingType()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/a"));
 		return ars;
 	}	
 	
 	public static WebElement STAnnually()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/div/ul/li[2]"));
 		return ars;
 	}	
 	
 	public static WebElement StartDate()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtStartDatePop']"));
 		return ars;
 	}	
 	
 	public static WebElement EndDate()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtEndDatePop']"));
 		return ars;
 	}	
 	
 	public static WebElement SelectBank()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAnnually_chkAnnualy1_1']"));
 		return ars;
 	}	
 	
 	public static WebElement SaveBtn()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
 		return ars;
 	}	
 	
 	public static WebElement CloseBtn()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
 		return ars;
 	}	
 	
 	public static WebElement DisplayScheduleInformation()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_LinkButton3_0']/img"));
 		return ars;
 	}	
 	
 	public static WebElement DisplayScheduleInformationSave()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSaveSchedule']"));
 		return ars;
 	}	
 	
 	public static WebElement DSSaveMsg()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
 		return ars;
 	}	
 	
 	public static WebElement DSClose()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_Button2']"));
 		return ars;
 	}
 	
 	public static WebElement EditScheduleInformation()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_LinkButton1_0']/img"));
 		return ars;
 	}
 	
 	public static WebElement Frequency()		//Method for closing Message Popup
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditSchedulingEDIT_chkAnnualy1_1']"));
 		return ars;
 	}
 	
 	public static WebElement EditSave()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnEDITSave']"));
 		return ars;
 	}
 	
 	public static WebElement EditSaveMsg()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary3']/ul/li"));
 		return ars;
 	}
 	
 	public static WebElement DeleteSchedulingDetails()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_LinkButton2_0']/img"));
 		return ars;
 	}
 	
 	public static WebElement AuditKickoff()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[5]/a"));
 		return ars;
 	}
 	
 	public static WebElement ReAssignAK()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnReAssign']"));
 		return ars;
 	}
 	
 	public static WebElement UserAK()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlUser_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement DhammapalPerformer()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlUser_chosen']/div/ul/li[27]"));
 		return ars;
 	}
 	
 	public static WebElement CompanyAK()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPopup_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement IndiaAK()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPopup_chosen']/div/ul/li[59]"));
 		return ars;
 	}
 	
 	public static WebElement NewUserAK()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdReassign_ddlGridReAssignUser_0_chosen']/a"));
 		//*[@id="ContentPlaceHolder1_ddlREAssignUser_chosen"]/a
 		return ars;
 	}
 	
 	public static WebElement ambujperformer2()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdReassign_ddlGridReAssignUser_0_chosen']/div/ul/li[3]"));
 		return ars;
 	}
 	
 	public static WebElement SaveAk()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnReassignEvent']"));
 		return ars;
 	}
 	
 	public static WebElement SaveAkMsg()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_VSReassignSummary']/ul/li"));
 		return ars;
 	}
 	
 	public static WebElement Close11()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='divReAssign']/div/div/div[1]/button"));
 		return ars;
 	}
 	
 	public static WebElement Implementation()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_rbtEventReAssignment_1']"));
 		return ars;
 	}
 	
 	public static WebElement ViewProcessWiseDetails()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudit_LinkButton3_0']/img"));
 		return ars;
 	}
 	
 	public static WebElement Performer()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcess_ddlPerformerImplemetationHeader_sl']"));
 		return ars;
 	}
 	
 	public static WebElement PerformerCheckBox()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcess_ddlPerformerImplemetationHeader_1']"));
 		return ars;
 	}
 	
 	public static WebElement PerformerOk()		
 	{
 		ars = getDriver().findElement(By.xpath("(//*[@id='buttons']/input[1])[2]"));
 		return ars;
 	}
 	
 	public static WebElement SelectReviwer()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcess_ddlReviewerImplemetationHeader']"));
 		return ars;
 	}
 	
 	public static WebElement SelectReviwerA()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcess_ddlReviewerImplemetationHeader']/option[4]"));
 		return ars;
 	}
 	
 	public static WebElement SaveVp()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
 		return ars;
 	}
 	
 	public static WebElement SaveVpMSg()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
 		return ars;
 	}
 	
 	public static WebElement AuditAssignmentSampleExcelFile()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnDownloadSampleFormat']"));
 		return ars;
 	}
 	
 	public static WebElement ChooseFileVP()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_fileUploadKickOff']"));
 		return ars;
 	}
 	
 	public static WebElement UploadVp()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnUploadDocument']"));
 		return ars;
 	}
 	
 	public static WebElement Back()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']"));
 		return ars;
 	}
 	
 	public static WebElement UploadMsg()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
 		return ars;
 	}
 	
 	public static WebElement AdditionalRiskCreation()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[2]/a"));
 		return ars;
 	}
 	
 	public static WebElement ARAddNew()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddNew']"));
 		return ars;
 	}
 	
 	public static WebElement CompanyAr()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPop_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement IndiaAR()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPop_chosen']/div/ul/li[30]"));
 		return ars;
 	}
 	
 	public static WebElement SelectProcessAR()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessPopup_sl']"));
 		return ars;
 	}
 	
 	public static WebElement ActionProcessAR()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessPopup_2']"));
 		//*[@id="ContentPlaceHolder1_ddlProcessPopup_1"]
 		return ars;
 	}
 	
 	public static WebElement OkAR()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='buttons']/input[1]"));
 		//*[@id="buttons"]/input[1]
 		return ars;
 	}
 	
 	public static WebElement SelectSubProcess()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubProcessPopup_sl']"));
 		//*[@id="caption"]
 		return ars;
 	}
 	
 	public static WebElement SubAction()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubProcessPopup_0']"));
 		
 		return ars;
 	}
 	
 	public static WebElement OkSubAction()		
 	{
 		ars = getDriver().findElement(By.xpath("(//*[@id='buttons']/input[1])[2]"));
 		return ars;
 	}
 	
 	public static WebElement SelectPersonResponsible()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditee_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement ambujperformer2AR()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditee_chosen']/div/ul/li[3]"));
 		return ars;
 	}
 	
 	public static WebElement SelectRCMType()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlRCMType_chosen']"));
 		return ars;
 	}
 	
 	public static WebElement Both()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlRCMType_chosen']/div/ul/li[2]"));
 		return ars;
 	}
 	
 	public static WebElement ObjectiveRef()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxControlNo']"));
 		return ars;
 	}
 	
 	public static WebElement Risk()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxRisk']"));
 		return ars;
 	}
 	
 	public static WebElement ControlObjective()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxConrolObj']"));
 		return ars;
 	}
 	
 	public static WebElement ControlDescription()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxControlDesc']"));
 		return ars;
 	}
 	
 	public static WebElement AuditMethodology()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxAuditObjective']"));
 		return ars;
 	}
 	
 	public static WebElement AuditSteps()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxAuditSteps']"));
 		return ars;
 	}
 	
 	public static WebElement SaveAR()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
 		return ars;
 	}
 	
 	public static WebElement SelectKeyType()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlKeyControl_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement SelectKeyTypeYes()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlKeyControl_chosen']/div/ul/li[2]"));
 		return ars;
 	}
 	
 	public static WebElement SaveMsg()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ctl04']/ul/li"));
 		return ars;
 	}
 	
 	public static WebElement CloseBtnAR()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_Button1']"));
 		return ars;
 	}
 	
 	public static WebElement ExportAR()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
 		return ars;
 	}
 	
 	public static WebElement CompanyAR()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement IndiaARF()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[3]"));
 		return ars;
 	}

 	public static WebElement Process1()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement ActionProcessARF()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']/div/ul/li[2]"));
 		return ars;
 	}
 	
 	public static WebElement Search()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFilter']"));
 		return ars;
 	}
 	
 	public static WebElement AuditStepFilter()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lblActivityToBeDone_0']"));
 		return ars;
 	}
 	
 	public static WebElement AddNewRiskDetails()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_LinkButton2_0']/img"));
 		return ars;
 	}
 	
 	public static WebElement AuditStep1()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtATBD']"));
 		return ars;
 	}
 	
 	public static WebElement SaveANR()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnPopupSave']"));
 		return ars;
 	}
 	
 	public static WebElement SaveANRMsg()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary3']/ul/li"));
 		return ars;
 	}
 	
 	public static WebElement CloseANR()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
 		return ars;
 	}
 	
 	public static WebElement EditRiskDetails()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_LinkButton1_0']/img"));
 		return ars;
 	}
 	
 	public static WebElement DeActivate()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDeActivate']"));
 		return ars;
 	}
 	
 	public static WebElement ireland()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[3]"));
 		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[3]
 		return ars;
 	}
 	
 	public static WebElement SelectAuditStep()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditStepList_sl']"));
 		return ars;
 	}
 	
 	public static WebElement SelectAuditStepChckBox()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditStepList_0']"));
 		return ars;
 	}
 	
 	public static WebElement ClickShow()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnShow']"));
 		return ars;
 	}
 	
 	public static WebElement CheckBox()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditStepList_chkRow_0']"));
 		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[3]
 		return ars;
 	}
 	
 	public static WebElement SaveDeactivate()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
 		return ars;
 	}
 	
 	public static WebElement SaveDeactivateMSG()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
 		return ars;
 	}
 	
 	
 	public static WebElement ClickDashboard()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[2]"));
 		return ars;
 	}
 	
 	public static WebElement SpecialAuditScheduling()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[6]/a"));
 		return ars;
 	}
 	
 	public static WebElement ADDNew()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddCompliance']"));
 		return ars;
 	}
 	
 	public static WebElement india()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPop_chosen']/div/ul/li[59]"));
 		return ars;
 	}
 	
 	public static WebElement FinancialYearSA()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement FY20232024()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/div/ul/li[16]"));
 		return ars;
 	}
 	
 	public static WebElement VerticalSA()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlVertical_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement NASA()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlVertical_chosen']/div/ul/li[2]"));
 		return ars;
 	}
 	
 	
 	public static WebElement StartDateSA()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtStartDatePop']"));
 		return ars;
 	}
 	
 	public static WebElement EndDateSa()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtEndDatePop']"));
 		return ars;
 	}
 	
 	public static WebElement ProcessName()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAnnually_txtNewProcess_0']"));
 		return ars;
 	}
 	
 	public static WebElement SaveSA()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
 		return ars;
 	}
 	
 	public static WebElement SaveSAMsg()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
 		return ars;
 	}
 	
 	public static WebElement CloseSa()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
 		return ars;
 	}
 	
 	public static WebElement AuditDocuments()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[7]/a"));
 		return ars;
 	}
 	
 	public static WebElement AddNewDA()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddPromotor']"));
 		return ars;//*[@id="ddlLegalEntityPopPup_chosen"]/a
 	}
 	
 	public static WebElement CompanyAD()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ddlLegalEntityPopPup_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement indiaAD()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ddlLegalEntityPopPup_chosen']/div/ul/li[30]"));
 		return ars;
 	}
 	
 	public static WebElement FinanacialYear()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ddlFilterFinancialPopPup_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement FY()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ddlFilterFinancialPopPup_chosen']/div/ul/li[16]"));
 		return ars;
 	}
 	
 	public static WebElement ChooseFileAD()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='FileUploadObservation']"));
 		return ars;
 	}
 	
 	public static WebElement SaveAD()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='btnSave']"));
 		return ars;
 	}
 	
 	public static WebElement ClosePop()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='divreports']/div/div/div[1]/button"));
 		return ars;
 	}
 	
 	public static WebElement View1()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix_lblDownLoadfile_0']"));
 		return ars;
 	}
 	
 	public static WebElement ClickDownload()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdVersionDownload_lblDownLoadfile_0']"));
 		return ars;
 	}
 	
 	public static WebElement ViewClose()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='divVersionDialog']/div/div/div[1]/button"));
 		return ars;
 	}
 	
 	public static WebElement  SpecialAuditStep()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_upCompliancesList']/div/div/div/section/div[8]/div[1]/u/a"));
 		return ars;
 	}
 	
 	public static WebElement  Choosefile()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_fuSpecialAuditSteps_3']"));
 		return ars;
 	}
 	
 	public static WebElement  upload()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_btnAuditStepsSave_3']"));
 		return ars;
 	}
 	
 	public static WebElement  uploadMsg()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary2']/ul/li"));
 		return ars;
 	}
 	
 	public static WebElement ReportGeneration1()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[7]/a"));
 		return ars;
 	}
 	
 	public static WebElement allahabad()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[53]"));
 		//*[@id="ContentPlaceHolder1_grdAuditScheduling_lnkAuditDetails_16"]/img
 		return ars;
 	}
 	
 	public static WebElement FinancialYearRG()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancialYear_chosen']/a"));
 		return ars;
 	}
 	
 	public static WebElement RG20232024()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancialYear_chosen']/div/ul/li[15]"));
 		return ars;
 	}
 	
 	public static WebElement RG20222023()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancialYear_chosen']/div/ul/li[15]"));
 		return ars;
 	}
 	
 	public static WebElement FinancialYearText()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling']/tbody/tr[2]/td[5]/div/span"));
 		return ars;
 	}
 	
 	public static WebElement ExportRG()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnExcelExport']"));
 		return ars;
 	}
 	
 	public static WebElement ViewAuditStatus()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_lnkAuditStatus_0']/img"));
 		return ars;
 	}
 	
 	public static WebElement ViewAuditStatusClose()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
 		return ars;
 	}
 	
 	public static WebElement ViewAuditDetails11()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_lnkAuditDetails_11']/img"));
 		//*[@id="ContentPlaceHolder1_grdAuditScheduling_lnkAuditDetails_11"]/img
 		return ars;
 	}
 	
 	public static WebElement ChooseFileRG()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_FeedbackFileUpload']"));
 		return ars;
 	}
 	
 	public static WebElement Remarks1()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtRemark']"));
 		return ars;
 	}
 	
 	public static WebElement SaveVAD()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnObservation']"));
 		return ars;
 	}
 	
 	public static WebElement SaveVADMsg()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary3']/ul/li"));
 		return ars;//Record Save Successfully.
 	}
 	
 	public static WebElement Draft1()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDraft']"));
 		return ars;
 	}
 	
 	public static WebElement GenerateReport1()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnGenrateReport']"));
 		return ars;
 	}
 	
 	public static WebElement DraftObservationListing11()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtObservationList']"));
 		return ars;
 	}
 	
 	public static WebElement Observation11()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_tbxObservation_0']"));
 		return ars;
 	}
 	
 	public static WebElement ObservationList_CheckBox()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_CheckBox1_0']"));
 		return ars;
 	}
 	
 	public static WebElement ObservationList_Save()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
 		return ars;
 	}
 	
 	public static WebElement ObservationList_SaveMsg()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
 		return ars;
 	}
 	
 	public static WebElement ObservationList_Export()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblExport']"));
 		return ars;
 	}
 	
 	public static WebElement ViewAuditDetail()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_lnkViewAudit_0']/img"));
 		return ars;//*[@id="ContentPlaceHolder1_grdObservationList_lnkViewAudit_0"]/img
 	}
 	
 	public static WebElement ViewAuditDetailclose()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
 		return ars;
 	}
 	
 	public static WebElement Delete()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_lnkAuditDetails_0']/img"));
 		return ars;
 	}
 	
 	public static WebElement BackDOR()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']"));
 		return ars;
 	}
 	
 	
 	public static WebElement PastObservations()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[8]/a"));
 		return ars;
 	}
 	
 	public static WebElement UploadHistoricalObservations()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:37']/li[1]/a"));
 		return ars;
 	}
 	
 	public static WebElement FormatHistoricalObservation()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_performerdocuments']/div[1]/div[4]/div[3]/u/a"));
 		return ars;
 	}
 	
 	public static WebElement fileUploadHO()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_fileUploadRCM']"));
 		return ars;
 	}
 	
 	public static WebElement UploadHO()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnUploadRCM']"));
 		return ars;
 	}
 	
 	public static WebElement UploadHOMsg()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li/ol/li"));
 		return ars;
 	}
 	
 	public static WebElement ClickDwonload()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdUploadedHistrory_lnkAuditDetails_0']/img"));
 		return ars;
 	}
 	
 	public static WebElement ViewHistoricalObservations()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:37']/li[2]/a"));
 		return ars;
 	}
 	
 	public static WebElement AuditStepText()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdViewObservations_lblAuditStep_0']"));
 		return ars;
 	}
 	
 	public static WebElement ViewAuditt()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdViewObservations']/tbody/tr[2]/td[4]/div/div[2]"));
 		return ars;
 	}
 	
 	public static WebElement ViewAuditText()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblviewAuditStep']"));
 		return ars;
 	}
 	
 	public static WebElement ViewAuditclose()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='btnClose']"));
 		return ars;
 	}
 	
 	
 	public static WebElement ObservationCount1()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdViewObservations_lnkObservationCount_0']"));
 		return ars;
 	}
 	
 	
 	public static WebElement ObservationViewAuditStep()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='LinkButton1']/img"));
 		return ars;
 	}
 	
 	public static WebElement ObservationViewAuditStepT()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='lblviewAuditStep']"));
 		return ars;
 	}
 	
 	public static WebElement ObservationCloseAuditStep()		
 	{
 		ars = getDriver().findElement(By.xpath("(//*[@id='btnClose'])[2]"));
 		return ars;
 	}
 	
 	public static WebElement DetailedObservationView()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='grdDetailedObs_LinkButton1_0']/img"));
 		return ars;
 	}
 	
 	public static WebElement DetailedObservationViewText()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='lblObservation']"));
 		return ars;
 	}
 	
 	public static WebElement DetailedObservationViewClose()		
 	{
 		ars = getDriver().findElement(By.xpath("(//*[@id='btnClose'])"));
 		return ars;
 	}
 	
 	public static WebElement DetailedObservationClose()		
 	{
 		ars = getDriver().findElement(By.xpath("//*[@id='divPREDOCShowDialog']/div/div/div[1]/button"));
 		return ars;
 	}
 	
 	public static WebElement ClickHighOpen()		
 	{
 		ClickHighOpen = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"));
 		return ClickHighOpen;
 	}

 	public static WebElement FinanceAccountsHigh()		
 	{
 		FinanceAccountsHigh = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
 				return FinanceAccountsHigh;                                          
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
 				//*[@id="DivReports"]/div/div/div[1]/button
 				//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']
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
 	
 	public static WebElement Closed()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label'])[4]"));
 				//*[@id="highcharts-0"]/svg/g[9]/g[1]/text
 				return ars;
 	}
 	
 
 	
 	public static WebElement ProcessInefficiencyClose()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[1]"));
 				//*[@id="highcharts-0"]/svg/g[9]/g[1]/text
 				return ars;
 	}

 	
 	
 	public static WebElement ProcessInefficiencyOpen()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[1]"));
 				//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label'][4]
 				return ars;
 	}
 	
	public static WebElement Open()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label'])[4]"));
 				return ars;
 	}
	public static WebElement Category()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-axis-labels highcharts-xaxis-labels '])[2]//*[name()='text' and @class='highcharts-drilldown-axis-label']//*[name()='tspan' and .='Communication through chat']"));
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
 				ars = getDriver().findElement(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody/tr[1]/td[9]/a"));
 				//*[@id="ObservationDetailsGrid"]/div[2]/table/tbody/tr[1]/td[8]/a
 				return ars;
 	}
 	
 	public static WebElement CategoryView1()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody/tr[1]/td[8]/a"));
 				//*[@id="ObservationDetailsGrid"]/div[2]/table/tbody/tr[1]/td[8]/a
 				return ars;
 	}
 	public static WebElement ProcessLow ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label']"));
 				return ars;
 	}
 	
 	
 	public static WebElement ProcessLowOpen()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[1]"));
 				return ars;
 	}

 	
 	public static WebElement ProcessMedium ()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label'])[5]"));
 				return ars;
 	}
 	
 	
 	public static WebElement ProcessMediumOpen()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[1]"));
 				return ars;
 	}

 	
 	
 	
 	public static WebElement ProcessHighOpen()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[1]"));
 				return ars;
 	}

 	
 	
 	
 	public static WebElement ProcessHigh ()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label'])[11]"));
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
 	
 	public static WebElement Click90to180days ()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[15]"));
 				return ars;
 	}
 	public static WebElement Click180to365days ()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[7]"));
 				return ars;
 	}
 	public static WebElement Click1Year ()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[1]"));
 				return ars;
 	}
 	public static WebElement Click0to90days ()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[18]"));
 				return ars;
 	}
 	public static WebElement ClickNotDue ()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[24]"));
 				return ars;
 	}
 	
 	public static WebElement AuditCommitteeOpen ()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 '])[2]"));
 				return ars;
 	}
 	
 	public static WebElement AuditCommitteeClose ()		
 	{
 				ars = getDriver().findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 '])[1]"));
 				return ars;
 	}
 	
 	public static WebElement AuditTrackerPlanned ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditTrackerSummary']/tbody/tr[2]/td[2]"));
 				return ars;
 	}
 	
 	public static WebElement AuditStatusView ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_newLinkButton3']/img"));
 				
 				return ars;
 	}
 	
 	
 	public static WebElement AuditTrackerActual ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditTrackerSummary']/tbody/tr[3]/td[2]"));
 				return ars;
 	}
 	
 	public static WebElement AuditStatusExport ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
 				return ars;
 	}
 	
 	public static WebElement DraftClosure ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDraftClosure']"));
 				return ars;
 	}
 	
 	public static WebElement DraftObservationListing1 ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtObservationList']"));
 				//*[@id="ContentPlaceHolder1_lbtObservationList"]
 				return ars;
 	}
 	
 	public static WebElement ExportToExcel1()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblExport']"));
 				return ars;
 	}
 	
 	public static WebElement Observation1 ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_tbxObservation_0]"));
 				return ars;
 	}
 	
 	public static WebElement OpenAudit ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_divOpenAMCount']"));
 				return ars;
 	}
 	
 	public static WebElement financialyear ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']"));
 				return ars;
 	}
 	
 	public static WebElement financialyearselect ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/div/ul/li[1]"));
 				return ars;
 	}
 	
 	
 	
 	
 	public static WebElement ViewAuditDetails1 ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits_lnkAuditDetails_0']/img"));
 				//*[@id="ContentPlaceHolder1_grdProcessAudits_lnkAuditDetails_0"]/img
 				return ars;
 	}
 	
 	public static WebElement ViewAuditDetails2 ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits_lnkAuditDetails_2']"));
 				//*[@id="ContentPlaceHolder1_grdProcessAudits_lnkAuditDetails_0"]/img
 				return ars;
 	}
 	
 	public static WebElement ExporttoExcel ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
 				return ars;
 	}
 	
 	public static WebElement ImplementationOpenAudit ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_divOpenAMIMPCount']"));
 				return ars;
 	}
 	
 	public static WebElement ClosedAudits ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_divCloseAMCount']"));
 				return ars;
 	}
 	
 	public static WebElement ClickArrow ()		
 	{
 				ars = getDriver().findElement(By.xpath("//*[local-name()='svg']//*[name()='g' and @class='highcharts-button right3']"));
 				//*[@id="highcharts-0"]/svg/g[2]/rect
 				return ars;
 	}
 	
  //---------------------------------------------------------------------------------------------
 	
 	
 	public  static WebElement clickmydocument() {
 		mydocument=getDriver().findElement(By.xpath("//*[@id=\"CMPMenuBar\"]/ul/li[10]/a"));
 		return mydocument;  
 	}
 	public  static WebElement clickmydocumentcompany() {
 		mydocumentcompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
 		return mydocumentcompany;  
 	}
 	public  static WebElement clickmydocumentselectcompany() {
 		mydocumentselectcompany=getDriver().findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlLegalEntity_chosen\"]/a/span"));
 		return mydocumentselectcompany;  
 	}
 	public  static WebElement clickmydocumentdownload() {
 		mydocumentdownload=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
 		return mydocumentdownload;  
 		//*[@id="ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0"]
 	}
 	public  static WebElement clickmydocumentmessage() {
 		mydocumentmessage=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
 		return mydocumentmessage;  
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

  //-----------------------------------------------------------------------------------
 	
 	public  static WebElement clickmyreport() {
 		myreport=getDriver().findElement(By.xpath("//*[@id=\"CMPMenuBar\"]/ul/li[11]/a"));
 		return myreport;  
 	}
 	public  static WebElement clickmyreportexecutivereport() {
 		myreportexecutivereport=getDriver().findElement(By.xpath("//*[@id=\"CMPMenuBar:submenu:42\"]/li[3]/a"));
 		//*[@id="CMPMenuBar:submenu:42"]/li[3]/a
 		return myreportexecutivereport;  
 	}
 	public  static WebElement clickmyreportcompany() {
 		myreportcompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
 		return myreportcompany;  
 	}
 	public  static WebElement clickmyreportselectcompany() {
 		myreportselectcompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a/span"));
 		return myreportselectcompany;  
 	}
 	public  static WebElement clickmyreportexecutivedownload() {
 		myreportexecutivedownload=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits_lnkAuditDetails_0']/img"));
 		return myreportexecutivedownload;  
 	}
 	/*public  static WebElement clickmyreportexecutivemessage() {
 		myreportexecutivemessage=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
 		return myreportexecutivemessage;  
 	}*/
 	public  static WebElement clickmyreportinternalaudit() {
 		myreportinternalaudit=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[2]/a"));
 		return myreportinternalaudit;  
 	}
 	public  static WebElement clickmyreportinternalauditcompany() {
 		myreportinternalauditcompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
 		return myreportinternalauditcompany;  
 	}
 	public  static WebElement clickmyreportinternalauditselectcompany() {
 		myreportinternalauditselectcompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[16]"));
 		return myreportinternalauditselectcompany;  
 	}
 	public  static WebElement clickmyreportinternalauditdownload() {
 		myreportinternalauditdownload=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits_lnkAuditDetails_0']/img"));
 		return myreportinternalauditdownload;  
 		
 	}
 	public  static WebElement clickmyreportinternalauditmessage() {
 		myreportinternalauditmessage=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
 		return myreportinternalauditmessage;  
 		
 	}
 	public  static WebElement clickmyreportopenobservation() {
 		myreportopenobservation=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[6]/a"));
 		return myreportopenobservation;  
 		
 	}
 	public  static WebElement clickmyreportopenobservationcompany() {
 		myreportopenobservationcompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
 		return myreportopenobservationcompany;  
 	}
 	public  static WebElement clickmyreportopenobservationselectcompany() {
 		myreportopenobservationselectcompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[5]"));
 		return myreportopenobservationselectcompany;  
 	}
 	public  static WebElement clickmyreportopenobservationexporttoexcel() {
 		myreportopenobservationexporttoexcel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
 		return myreportopenobservationexporttoexcel;  //*[@id="ContentPlaceHolder1_lbtnExportExcel"]
 	}
 	public  static WebElement clickmyreportobservationsummary() {
 		myreportobservationsummary=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:42']/li[2]/a"));
 		return myreportobservationsummary;  
 	}
 	public  static WebElement clickmyreportobservationcompany() {
 		myreportobservationcompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityMultiSelect_sl']"));
 		return myreportobservationcompany;  
 	}
 	public  static WebElement clickmyreportobservationselectcompany() {
 		myreportobservationselectcompany=getDriver().findElement(By.xpath("//*[@id='checks']/span[1]/label"));
 		return myreportobservationselectcompany;  
 	}
 	public  static WebElement clickmyreportobservationok() {
 		myreportobservationok=getDriver().findElement(By.xpath("//*[@id='buttons']/input[1]"));
 		return myreportobservationok;  
 	}
 	public  static WebElement clickmyreportobservationexporttoexcel() {
 		myreportobservationexporttoexcel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_Button1']"));
 		return myreportobservationexporttoexcel;  
 	}
 	public  static WebElement clickmyreportschedulingdeviation() {
 		myreportschedulingdeviation=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[5]/a"));
 		return myreportschedulingdeviation;  
 	}
 	public  static WebElement clickmyreportschedulingcompany() {
 		myreportschedulingcompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
 		return myreportschedulingcompany;  
 	}
 	public  static WebElement clickmyreportschedulingselectcompany() {
 		myreportschedulingselectcompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[14]"));
 		return myreportschedulingselectcompany;  
 	}
 	public  static WebElement clickmyreportschedulingtype() {
 		myreportschedulingtype=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/a"));
 		return myreportschedulingtype;  
 	}
 	public  static WebElement clickmyreportschedulingselecttype() {
 		myreportschedulingselecttype=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/div/ul/li[2]"));
 		return myreportschedulingselecttype;  
 	}
 	public  static WebElement clickmyreportschedulingperiod() {
 		myreportschedulingperiod=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/a"));
 		return myreportschedulingperiod;  
 	}
 	public  static WebElement clickmyreportschedulingselectperiod() {
 		myreportschedulingselectperiod=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/div/ul/li[2]"));
 		return myreportschedulingselectperiod;  
 	}
 	public  static WebElement clickmyreportschedulingexporttoexcel() {
 		myreportschedulingexporttoexcel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
 		return myreportschedulingexporttoexcel;  
 	}

 	public  static WebElement clickmyreportmanagementresponse() {
 		myreportmanagementresponse=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[10]/a"));
 		return myreportmanagementresponse;  
 	}
 	public  static WebElement clickmyreportmanagementresponsecompany() {
 		myreportmanagementresponsecompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
 		return myreportmanagementresponsecompany;  
 	}
 	public  static WebElement clickmyreportmanagementresponseselectcompany() {
 		myreportmanagementresponseselectcompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[4]"));
 		return myreportmanagementresponseselectcompany;  
 	}
 	public  static WebElement clickmyreportmanagementresponsefinancial() {
 		myreportmanagementresponsefinancial=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']/a"));
 		return myreportmanagementresponsefinancial;  
 	}
 	public  static WebElement clickmyreportmanagementresponseselectfinancial() {
 		myreportmanagementresponseselectfinancial=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']/div/ul/li[2]"));
 		return myreportmanagementresponseselectfinancial;  
 	}
 	public  static WebElement clickmyreportmanagementresponseselectscheduling() {
 		myreportmanagementresponseselectscheduling=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/a"));
 		return myreportmanagementresponseselectscheduling;  
 	}
 	public  static WebElement clickmyreportmanagementresponseselectselectscheduling() {
 		myreportmanagementresponseselectselectscheduling=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen]/div/ul/li[2]"));
 		return myreportmanagementresponseselectselectscheduling;  
 	}
 	public  static WebElement clickmyreportmanagementresponseperiod() {
 		myreportmanagementresponseperiod=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/a"));
 		return myreportmanagementresponseperiod;  
 	}
 	public  static WebElement clickmyreportmanagementresponseselectperiod() {
 		myreportmanagementresponseselectperiod=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/div/ul/li[2]"));
 		return myreportmanagementresponseselectperiod;  
 	}
 	public  static WebElement clickmyreportmanagementresponseexporttoexcel() {
 		myreportmanagementresponseexporttoexcel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
 		return myreportmanagementresponseexporttoexcel;  
 	}
 	public  static WebElement clickmyreportprerequisit() {
 		myreportprerequisit=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[9]/a"));
 		return myreportprerequisit;  
 	}
 	public  static WebElement clickmyreportprerequisitcompancy() {
 		myreportprerequisitcompancy=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
 		return myreportprerequisitcompancy;  
 	}
 	public  static WebElement clickmyreportprerequisitselectcompancy() {
 		myreportprerequisitselectcompancy=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[7]"));
 		return myreportprerequisitselectcompancy;  
 	}
 	public  static WebElement clickmyreportprerequisitfinancial() {
 		myreportprerequisitfinancial=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen]/a"));
 		return myreportprerequisitfinancial;  
 	}
 	public  static WebElement clickmyreportprerequisitselectfinancial() {
 		myreportprerequisitselectfinancial=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']/div/ul/li[14]"));
 		return myreportprerequisitselectfinancial;  
 	}
 	public  static WebElement clickmyreportprerequisitscheduling() {
 		myreportmyreportprerequisitscheduling=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/a"));
 		return myreportmyreportprerequisitscheduling;  
 	}
 	public  static WebElement clickmyreportmyreportprerequisitselectscheduling() {
 		myreportmyreportprerequisitselectscheduling=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/div/ul/li[2]"));
 		return myreportmyreportprerequisitselectscheduling;  
 	}
 	public  static WebElement clickmyreportmyreportprerequisitperiod() {
 		myreportmyreportprerequisitperiod=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/a"));
 		return myreportmyreportprerequisitperiod;  
 	}
 	public  static WebElement clickmyreportmyreportprerequisitselectperiod() {
 		myreportmyreportprerequisitselectperiod=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/div/ul/li[2]"));
 		return myreportmyreportprerequisitselectperiod;  
 	}
 	public  static WebElement clickmyreportmyreportprerequisitexporttoexcel() {
 		myreportmyreportprerequisitexporttoexcel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
 		return myreportmyreportprerequisitexporttoexcel;  
 	}
 	public  static WebElement clickmyreportauditscheduling() {
 		myreportauditscheduling=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[8]/a"));
 		return myreportauditscheduling;  
 	}
 	public  static WebElement clickmyreportauditschedulingcompancy() {
 		myreportauditschedulingcompancy=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
 		return myreportauditschedulingcompancy;  
 	}
 	public  static WebElement clickmyreportauditschedulingselectcompancy() {
 		myreportauditschedulingselectcompancy=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[16]"));
 		return myreportauditschedulingselectcompancy;  
 	}
 	public  static WebElement clickmyreportauditschedulingexporttoexcel() {
 		myreportauditschedulingexporttoexcel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
 		return myreportauditschedulingexporttoexcel;  
 	}
 	public  static WebElement clickmyreportauditstatus() {
 		myreportauditstatus=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[7]/a"));
 		return myreportauditstatus;  
 	}
 	public  static WebElement clickmyreportauditstatuscompany() {
 		myreportauditstatuscompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
 		return myreportauditstatuscompany;  
 	}
 	public  static WebElement clickmyreportauditstatusselectcompany() {
 		myreportauditstatusselectcompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
 		return myreportauditstatusselectcompany;  
 	}
 	public  static WebElement clickmyreportauditstatusexporttoexcel() {
 		myreportauditstatusexporttoexcel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnExportExcel']"));
 		return myreportauditstatusexporttoexcel;  
 	}
 	public  static WebElement clickmyreportpastaudit() {
 		myreportpastaudit=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[11]/a"));
 		return myreportpastaudit;  
 	}
 	public  static WebElement clickmyreportpastauditaddnew() {
 		myreportpastauditaddnew=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddPromotor']"));
 		return myreportpastauditaddnew;  
 	}
 	public  static WebElement clickmyreportpastauditunit() {
 		myreportpastauditunit=getDriver().findElement(By.xpath("//*[@id='ddlLegalEntityPopPup_chosen']/a"));
 		return myreportpastauditunit;  
 	}
 	public  static WebElement clickmyreportpastauditselectunit() {
 		myreportpastauditselectunit=getDriver().findElement(By.xpath("//*[@id='ddlLegalEntityPopPup_chosen']/div/ul/li[7]"));
 		return myreportpastauditselectunit;  
 	}
 	public  static WebElement clickmyreportpastauditfinancial() {
 		myreportpastauditfinancial=getDriver().findElement(By.xpath("//*[@id='ddlFilterFinancialPopPup_chosen']/a"));
 		return myreportpastauditfinancial;  
 	}
 	public  static WebElement clickmyreportpastauditselectfinancial() {
 		myreportpastauditselectfinancial=getDriver().findElement(By.xpath("//*[@id='ddlFilterFinancialPopPup_chosen']/div/ul/li[2]"));
 		return myreportpastauditselectfinancial;  
 	}
 	public  static WebElement clickmyreportpastauditauditbackground() {
 		myreportpastauditauditbackground=getDriver().findElement(By.xpath("//*[@id='ddlAuditBackground_chosen']/a"));
 		return myreportpastauditauditbackground;  
 	}
 	public  static WebElement clickmyreportpastauditselectauditbackground() {
 		myreportpastauditselectauditbackground=getDriver().findElement(By.xpath("//*[@id='ddlAuditBackground_chosen']/a/span"));
 		return myreportpastauditselectauditbackground;  
 	}
 	public  static WebElement clickmyreportpastaudituploadfile() {
 		myreportpastaudituploadfile=getDriver().findElement(By.xpath("//*[@id='FileUploadObservation']"));
 		return myreportpastaudituploadfile;  
 	}
 	public  static WebElement clickmyreportpastauditsave() {
 		myreportpastauditsave=getDriver().findElement(By.xpath("//*[@id='btnSave']"));
 		return myreportpastauditsave;  
 	}
 	public  static WebElement clickmyreportpastauditclose() {
 		myreportpastauditclose=getDriver().findElement(By.xpath("//*[@id='btnCancel']"));
 		return myreportpastauditclose;  
 	}
 	public  static WebElement clickmyreportpastauditview() {
 		myreportpastauditview=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix_lblDownLoadfile_0']/img"));
 		return myreportpastauditview;  
 	}
 	public  static WebElement clickmyreportpastauditedit() {
 		myreportpastauditedit=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix_lblEditFile_0']/img"));
 		return myreportpastauditedit;  
 	}
 	public  static WebElement clickmyreportpastauditcancel() {
 		myreportpastauditcancel=getDriver().findElement(By.xpath("//*[@id='btnCancel']"));
 		return myreportpastauditcancel;  
 	}
 	public  static WebElement clickmyreportfinalaudit() {
 		myreportfinalaudit=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:42']/li[5]/a"));
 		//*[@id="CMPMenuBar:submenu:42"]/li[5]/a
 		return myreportfinalaudit;  
 	}
 	public  static WebElement clickmyreportfinalauditcompany() {
 		myreportfinalauditcompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
 		return myreportfinalauditcompany;  
 	}
 	public  static WebElement clickmyreportfinalauditselectcompany() {
 		myreportfinalauditselectcompany=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[28]"));
 		return myreportfinalauditselectcompany;  
 	}
 	public  static WebElement clickmyreportfinalauditdownload() {
 		myreportfinalauditdownload=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfileActionAll_0']"));
 		return myreportfinalauditdownload;  
 	}

 //------------------------Configuration-----------------------
 	
 	public  static WebElement clickconfiguration() {
 		configuration=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[5]/a"));
 		return configuration;  
 	}
 	public  static WebElement clickconfigurationprofilemaster() {
 		configurationprofilemaster=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:20']/li[1]/a"));
 		return configurationprofilemaster;  
 	}
 	public  static WebElement clickconfigurationprofilemasteraddnew() {
 		configurationprofilemasteraddnew=getDriver().findElement(By.xpath("//*[@id=\"btnAddNew\"]"));
 		return configurationprofilemasteraddnew;  
 	}
 	public  static WebElement clickconfigurationprofilemasterprofilename() {
 		configurationprofilemasterprofilename=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPName']"));
 		return configurationprofilemasterprofilename;  
 	}
 	public  static WebElement clickconfigurationprofilemasterlevel() {
 		configurationprofilemasterlevel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLevel']"));
 		return configurationprofilemasterlevel;  
 	}
 	public  static WebElement clickconfigurationprofilemasterselectlevel() {
 		configurationprofilemasterselectlevel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLevel']/option[2]"));
 		return configurationprofilemasterselectlevel;  
 	}
 	public  static WebElement clickconfigurationprocess() {
 		configurationprocess=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlMutiselect_sl']"));
 		return configurationprocess;  
 	}
 	public  static WebElement clickselectconfigurationprocess() {
 		selectconfigurationprocess=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlMutiselect']/label[1]"));
 		return selectconfigurationprocess;  
 	}
 	public  static WebElement clickok() {
 		ok=getDriver().findElement(By.xpath("//*[@id='buttons']/input[1]"));
 		return ok;  
 	}
 	public  static WebElement clickconfigurationprofilemastersave() {
 		configurationprofilemastersave=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
 		//*[@id="ContentPlaceHolder1_btnSave"]
 		return configurationprofilemastersave;  
 	}
 	public  static WebElement clickconfigurationprofilemasterclose() {
 		configurationprofilemasterclose=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDeptPopUp']"));
 		//*[@id="ContentPlaceHolder1_btnCloseDeptPopUp"]
 		
 		return configurationprofilemasterclose;  
 	}
 	public  static WebElement clickconfigurationprofilemasteredit() {
 		configurationprofilemasteredit=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProfile_lnkEditProfile_0']/img"));
 		return configurationprofilemasteredit;  
 	}
 	public  static WebElement clickconfigurationprofilemastercancel() {
 		configurationprofilemastercancel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDeptPopUp']"));
 		return configurationprofilemastercancel;  
 	}
 	public  static WebElement clickconfigurationprofilemasterdeactivate() {
 		configurationprofilemasterdeactivate=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProfile_lnkDeactivateProfile_0']/img"));
 		return configurationprofilemasterdeactivate;  
 	}
 	public  static WebElement clickconfigurationprofile() {
 		configurationprofile=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:20']/li[2]/a"));
 		return configurationprofile;  
 	}
 	public  static WebElement clickconfigurationprofileclick() {
 		configurationprofileclick=getDriver().findElement(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[3]/td[1]/a"));
 		return configurationprofileclick;  
 	}
 	public  static WebElement clickconfigurationprofileuser() {
 		configurationprofileuser=getDriver().findElement(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[4]/td[2]/div/table/tbody/tr[1]/td[3]/span/span"));
 		return configurationprofileuser;  
 	}
 	public  static WebElement clickconfigurationprofileselectuser() {
 		configurationprofileselectuser=getDriver().findElement(By.xpath("(//div[@class='k-animation-container']//ul/li[.='QA Plantcfo'])[1]"));
 		return configurationprofileselectuser;  
 	}
 	public  static WebElement clickconfigurationprofilesave() {
 		configurationprofilesave=getDriver().findElement(By.xpath("//*[@id='btnsave']"));
 		return configurationprofilesave;  
 	}
 	public  static WebElement clickconfigurationescalation() {
 		configurationescalation=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:20']/li[3]/a"));
 		return configurationescalation;  
 	}
 	public  static WebElement clickconfigurationescalationaddnew() {
 		configurationescalationaddnew=getDriver().findElement(By.xpath("//*[@id='btnAddNew']"));
 		return configurationescalationaddnew;  
 	}
 	public  static WebElement clickconfigurationprofilename() {
 		configurationprofilename=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlprofile']"));
 		return configurationprofilename;  
 	}
 	public  static WebElement clickconfigurationselectprofile() {
 		configurationselectprofile=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlprofile']/option[2]"));
 		return configurationselectprofile;  
 	}
 	public  static WebElement clickconfigurationadd() {
 		configurationadd=getDriver().findElement(By.xpath("//*[@id='btnadd']"));
 		return configurationadd;  
 	}
 	public  static WebElement clickconfigurationnodays() {
 		configurationnodays=getDriver().findElement(By.xpath("//*[@id='txtdays']")); 
 		return configurationnodays;  
 	}
 	public  static WebElement clickconfigurationsave() {
 		configurationnosave=getDriver().findElement(By.xpath("//*[@id='btnsave']")); 
 		return configurationnosave;  
 	}
 	public  static WebElement clickconfigurationnocancel() {
 		configurationnocancel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDeptPopUp']")); 
 		return configurationnocancel;  
 	}
 	public  static WebElement clickconfigurationnoview() {
 		configurationnoview=getDriver().findElement(By.xpath("//*[@id='grd_data_request']/div[2]/table/tbody/tr[2]/td[4]/a")); 
 		return configurationnoview;  
 	}
 	public  static WebElement clickconfigurationcross() {
 		configurationcross=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDeptPopUp']")); 
 		return configurationcross;  
 	}
 	public  static WebElement clickconfigurationhod() {
 		configurationhod=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:20']/li[4]/a")); 
 		return configurationhod;  
 	}
 	public  static WebElement clickconfigurationhodaddnew() {
 		configurationhodaddnew=getDriver().findElement(By.xpath("//*[@id='btnAddNew']")); 
 		return configurationhodaddnew;  
 	}

    
 	public  static WebElement clickhodprofile() {
 		hodprofile=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddl_profile']")); 
 		return hodprofile;  
 	}
 	public  static WebElement clickhodselectprofile() {
 		hodselectprofile=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddl_profile']/option[2]")); 
 		return hodselectprofile;  
 	}
 	public  static WebElement clickhodtimeline() {
 		hodtimeline=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_txttimeline']")); 
 		return hodtimeline;  
 	}
 	public  static WebElement clickhodsave() {
 		hodsave=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']")); 
 		return hodsave;  
 	}
 	public  static WebElement clickhodcancel() {
 		hodcancel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDeptPopUp']")); 
 		return hodcancel;  
 	}
 	public  static WebElement clickconfigurationmessage() {
 		configurationmessage=getDriver().findElement(By.xpath("//*[@id='confirmbox']/p1/strong")); 
 		return configurationmessage;  
 	}
 	public  static WebElement clickconfigurationeditmessage() {
 		configurationeditmessage=getDriver().findElement(By.xpath("//div[@class='k-widget k-window k-dialog']//button[@class='k-button k-primary']")); 
 		return configurationeditmessage;  
 	}
 	public  static WebElement clickconfigurationhodedit() {
 		configurationhodedit=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_gridView_lnkEditProfile_0']/img")); 
 		return configurationhodedit;  
 	}
 	public  static WebElement clickconfigurationhodeditclose() {
 		configurationhodeditclose=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDeptPopUp']")); 
 		return configurationhodeditclose;  
 	}
 	public  static WebElement clickconfigurationdelete() {
 		configurationdelete=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_gridView_ButtonDelete_0']/img")); 
 		return configurationdelete;  
 	}
 	public  static WebElement clickconfigurationdeletecancel() {
 		configurationdeletecancel=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_gridView_ButtonDelete_0']/img")); 
 		return configurationdeletecancel;    //cancel button pr click krna hai
 	}
 	public  static WebElement clickconfigurationdashboard() {
 		configurationdashboard=getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:20']/li[5]/a")); 
 		return configurationdashboard;   
 	}
 	public  static WebElement clickconfigurationdashboardselect() {
 		configurationdashboardselect=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProfile_ddlDashboardView_0']")); 
 		return configurationdashboardselect;   
 	}
 	public  static WebElement clickconfigurationdashboardselectprofile() {
 		configurationdashboardselectprofile=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProfile_ddlDashboardView_0']/option[1]")); 
 		return configurationdashboardselectprofile;   
 	}
 	public  static WebElement clickconfigurationdashboardsave() {
 		configurationdashboardsave=getDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']")); 
 		return configurationdashboardsave;   
 	}

    
    
    
    
    
    
    
    
    
 
}
