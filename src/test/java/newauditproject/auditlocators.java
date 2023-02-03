package newauditproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class auditlocators {
	private static WebElement uName=null;
	private static WebElement pass=null;
	private static WebElement sumit=null;
	private static WebElement sequrity=null;
	private static WebElement question1=null;
	private static WebElement question2=null;
	private static WebElement btnvalidate=null;
	private static WebElement ars=null;
	private static WebElement Master=null;
	private static WebElement UserMaster=null;
	private static WebElement addnew=null;
	private static WebElement firstname=null;
	private static WebElement lastname=null;
	private static WebElement designation=null;
	private static WebElement contactno=null;
	private static WebElement email=null;
	private static WebElement department=null;
	private static WebElement choosedepartment=null;
	private static WebElement role=null;
	private static WebElement chooserole=null;
	private static WebElement savebtn=null;
	private static WebElement cancelbtn=null;
	private static WebElement search=null;
	private static WebElement search1=null;
	private static WebElement filter=null;
	private static WebElement editbtn=null;
	//private static WebElement firstname1=null;
	private static WebElement btncancel=null;
	private static WebElement btnsave=null;
	private static WebElement removebtn=null;
	private static WebElement passwordbtn=null;
	private static WebElement unitmaster=null;
	private static WebElement addnewbtn=null;
	private static WebElement name=null;
	private static WebElement unittype=null;
	private static WebElement chooseunittype=null;
	private static WebElement address=null;
	private static WebElement state=null;
	private static WebElement choosestate=null;
	private static WebElement city=null;
	private static WebElement choosecity=null;
	private static WebElement contact=null;
	private static WebElement emailid=null;
	private static WebElement status=null;
	private static WebElement choosestatus=null;
	private static WebElement savebuttn=null;
	private static WebElement cancelbuttn=null;
	private static WebElement updateunit=null;
	private static WebElement firstnameedit=null;
	private static WebElement savebutton=null;
	private static WebElement cancelbutton=null;
	private static WebElement firstnameenter=null;
	private static WebElement exporttoexcelbtn=null;
	private static WebElement subunit=null;
	private static WebElement addnewunit=null;
	private static WebElement name1=null;
	private static WebElement unit1=null;
	private static WebElement select1=null;
	private static WebElement address1=null;
	private static WebElement state1=null;
	private static WebElement selectstate1=null;
	private static WebElement city1=null;
	private static WebElement selectcity1=null;
	private static WebElement contactno1=null;
	private static WebElement email1=null;
	private static WebElement status1=null;
	private static WebElement selectstatus1=null;
	private static WebElement btnsave1=null;
	private static WebElement btncancel1=null;
	private static WebElement process=null;
	private static WebElement processadd=null;
	private static WebElement proname=null;
	private static WebElement prosave=null;
	private static WebElement procancel=null;
	private static WebElement proedit=null;
	private static WebElement pronamedit=null;
	private static WebElement procsave=null;
	private static WebElement procclose=null;
	private static WebElement subproce=null;
	private static WebElement subproceadd=null;
	private static WebElement subprocename=null;
	private static WebElement subprocesave=null;
	private static WebElement subprocecancel=null;
	private static WebElement subprocedit=null;
	private static WebElement subprocecname=null;
	private static WebElement procecnamedit=null;
	private static WebElement procecnamsave=null;
	private static WebElement procecnamcancel=null;
	private static WebElement addactivity=null;
	private static WebElement addnewactivity=null;
	private static WebElement nameactivity=null;
	private static WebElement saveactivitybtn=null;
	private static WebElement cancelactivitybtn=null;
	private static WebElement editactivity=null;
	private static WebElement editactivityname=null;
	private static WebElement editsaveactivity=null;
	private static WebElement editcancelactivity=null;
	private static WebElement deparmentmaster=null;
	private static WebElement deparmentadd=null;
	private static WebElement deparmentname=null;
	private static WebElement deparmentsave=null;
	private static WebElement deparmentcancel=null;
	private static WebElement deparmentedit=null;
	private static WebElement deparmenteditname=null;
	private static WebElement deparmenteditsave=null;
	private static WebElement deparmenteditcancel=null;
	private static WebElement observation=null;
	private static WebElement observationadd=null;
	private static WebElement observationname=null;
	private static WebElement observationsave=null;
	private static WebElement observationcancel=null;
	private static WebElement observationedit=null;
	private static WebElement observationeditname=null;
	private static WebElement observationeditsave=null;
	private static WebElement observationeditcancel=null;
	private static WebElement observationmessagedisplay=null;
	private static WebElement subobservation=null;
	private static WebElement subobservationadd=null;
	private static WebElement subobservationname=null;
	private static WebElement subobservationsave=null;
	private static WebElement subobservationcancel=null;
	private static WebElement subobservationedit=null;
	private static WebElement subobservationeditname=null;
	private static WebElement subobservationeditsave=null;
	private static WebElement subobservationeditcancel=null;
	private static WebElement subobservationbackbutton=null;
	private static WebElement riskcategory=null;
	private static WebElement riskcategoryadd=null;
	private static WebElement riskcategoryname=null;
	private static WebElement riskcategorysave=null;
	private static WebElement riskcategorymessagedis=null;
	private static WebElement riskcategorycancel=null;
	private static WebElement riskcategorysearchbox=null;
	private static WebElement riskcategoryedit=null;
	private static WebElement riskcategoryeditname=null;
	private static WebElement riskcategoryeditsave=null;
	private static WebElement riskcategoryeditcancel=null;
	private static WebElement riskcategoryfilter=null;
	private static WebElement riskcategorymessage=null;
	private static WebElement observationsubcategoryeditmessage=null;
	private static WebElement observationsubcategorymessage=null;
	public static WebElement setUname(WebDriver driver) {
		uName=driver.findElement(By.xpath("//*[@id='txtemail']"));
		return uName;
	}
	 
	public static WebElement setPass(WebDriver driver) {
		pass=driver.findElement(By.xpath("//*[@id='txtpass']"));
		return pass;
	}
	
	public static WebElement clicksumit(WebDriver driver) {
		sumit=driver.findElement(By.xpath("//*[@id='Submit']"));
		return sumit;
	}
	
	public static WebElement clicksequrity(WebDriver driver) {
		sequrity=driver.findElement(By.xpath("//*[@id='lnkSecurityQA']"));
		return sequrity;
	}
	
	public static WebElement setquestion1(WebDriver driver) {
		question1=driver.findElement(By.id("txtAnswer1"));
		return question1;
	}
	public static WebElement setquestion2(WebDriver driver) {
		question2=driver.findElement(By.xpath("//*[@id='txtAnswar2']"));
		return question2;
	}
	public static WebElement clickbtnvalidate(WebDriver driver) {
		btnvalidate=driver.findElement(By.xpath("//*[@id='btnValidateQuestions']"));
		return btnvalidate;
	}
	public static WebElement clickars(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='dvbtnAudit']/div[1]/img"));
		return ars;
	}
	
	public  static WebElement clickMaster(WebDriver driver) {
		
		Master=driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]"));
		return Master;
	}
	
public  static WebElement clickUserMaster(WebDriver driver) {
		
		UserMaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[7]/a"));
		return UserMaster;
	}

public  static WebElement clickaddnew(WebDriver driver) {
	
	addnew=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddUser']"));
	return addnew;
}

public  static WebElement setfirstname(WebDriver driver) {
	
	firstname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxFirstName']"));
	return firstname;
}

public  static WebElement setlastname(WebDriver driver) {
	
	lastname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxLastName']"));
	return lastname;
}

public  static WebElement setdesignation(WebDriver driver) {
	
	designation=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxDesignation']"));
	return designation;
}


public  static WebElement setemail(WebDriver driver) {
	
	email=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxEmail']"));
	return email;
}

public  static WebElement setcontactno(WebDriver driver) {
	
	contactno=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxContactNo']"));
	return contactno;
}

public  static WebElement clickdepartment(WebDriver driver) {
	
	department=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']"));
	return department;
}

public  static WebElement clickchoosedepartment(WebDriver driver) {
	
	choosedepartment=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']/option[3]"));
	return choosedepartment;
}
	
public  static WebElement clickrole(WebDriver driver) {
	
	role=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']"));
	return role;
}

public  static WebElement clickchooserole(WebDriver driver) {
	
	chooserole=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']/option[2]"));
	return chooserole;
}

public static WebElement clicksavebtn(WebDriver driver) {
	savebtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_btnSave']"));
	return savebtn;
}

public static WebElement clickcancelbtn(WebDriver driver) {
	cancelbtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_btnCancel']"));
	return cancelbtn;
}

public static WebElement clicksearch1(WebDriver driver) {
	search1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilter']"));
	return search1;
}
	
public static WebElement clickeditbtn(WebDriver driver) {
	editbtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdUser_lbtnEdit_0']/img"));
	return editbtn;
}

//public  static WebElement setfirstname1(WebDriver driver) {
	
//	firstname1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxFirstName']"));

	//firstname1.clear();
	
	//return firstname1;
//}

public static WebElement clickbtnsave(WebDriver driver) {
	btnsave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_btnSave']"));
	return btnsave;
}

public static WebElement clickbtncancel(WebDriver driver) {
	btncancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_btnCancel']"));
	return btncancel;
}

public static WebElement clickremovebtn(WebDriver driver) {
	removebtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdUser_lbtnDelete_0']/img"));
	return removebtn;
}

public static WebElement clickpasswordbtn(WebDriver driver) {
	passwordbtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdUser_lbtnReset_0']/img"));
	return passwordbtn;
}

public  static WebElement clickunitmaster(WebDriver driver) {
	
	unitmaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[1]/a"));
	return unitmaster;
}
public  static WebElement clickaddnewbtn(WebDriver driver) {
	
	addnewbtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddCustomerBranch']"));
	return addnewbtn;
}

public  static WebElement setname(WebDriver driver) {
 name=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxName']"));
	return name;
}
public  static WebElement clickunittype(WebDriver driver) {
	
	unittype=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlType']"));
	return unittype;

}
public  static WebElement clickchooseunittype(WebDriver driver) {
	
	chooseunittype=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlType\"]/option[3]"));
	return chooseunittype;

}
public  static WebElement setnaddress(WebDriver driver) {
	 address=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxAddressLine1']"));
		return address;
	}

public  static WebElement clickstate(WebDriver driver) {
	
	state=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlState']"));
	return state;

}
public  static WebElement clickchoosestate(WebDriver driver) {
	
	choosestate=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlState\"]/option[7]"));
	return choosestate;

}

public  static WebElement clickcity(WebDriver driver) {
	
	city=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCity']"));
	return city;

}
public  static WebElement clickchoosecity(WebDriver driver) {
	
	choosecity=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCity']/option[5]"));
	return choosecity;

}
public  static WebElement setcontact(WebDriver driver) {
	
	contact=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxContactPerson']"));
	return contact;

}

public  static WebElement setemailid(WebDriver driver) {
	
	emailid=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxEmail']"));
	return emailid;

}
public  static WebElement clickstatus(WebDriver driver) {
	
	status=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCustomerStatus']"));
	return status;



}
public  static WebElement clickchoosestatus(WebDriver driver) {
	
	choosestatus=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCustomerStatus']/option[2]"));
	return choosestatus;



}
public  static WebElement clicksavebuttn(WebDriver driver) {
	
	savebuttn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return savebuttn;



}
public  static WebElement clickcancelbuttn(WebDriver driver) {
	
	cancelbuttn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return cancelbuttn;

}



public  static WebElement clickcupdateunit(WebDriver driver) {
	
	updateunit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdCustomerBranch_LinkButton1_0']/img"));
	return updateunit;



}
public  static WebElement clickfirstnameedit(WebDriver driver) {
	
	firstnameedit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxName']"));
	return firstnameedit;
}
public  static WebElement clickfirstnameenter(WebDriver driver) {
	
	firstnameenter=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxName']"));
	return firstnameenter;
}

public static WebElement clicksavebutton(WebDriver driver) {
	savebutton=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return savebutton;
}

public static WebElement clickcancelbutton(WebDriver driver) {
	cancelbutton=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return cancelbutton;
}

public  static WebElement clickexporttoexcelbtn(WebDriver driver) {
	
	exporttoexcelbtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkExportCustomerBranchlist']"));
	return exporttoexcelbtn;

}

public static WebElement clicksearch(WebDriver driver) {
	search=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilter']"));
	return search;
}

public static WebElement clicksubunit(WebDriver driver) {
	subunit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdCustomerBranch']/tbody/tr[2]/td[8]/a"));
	return subunit;
}
public static WebElement clickaddnewunit(WebDriver driver) {
	addnewunit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddCustomerBranch']"));
	return addnewunit;
}

public static WebElement clickname1(WebDriver driver) {
	name1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxName']"));
	return name1;
}
public static WebElement clickunit1(WebDriver driver) {
	unit1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlType']"));
	return unit1;
}
public static WebElement clickselect1(WebDriver driver) {
	select1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlType']/option[3]"));
	return select1;
}
public static WebElement clickaddress1(WebDriver driver) {
	address1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxAddressLine1']"));
	return address1;
}
public static WebElement clickstate1(WebDriver driver) {
	state1=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ddlState\']"));
	return state1;
}
public static WebElement clickselectstate1(WebDriver driver) {
	selectstate1=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ddlState\']/option[4]"));
	return selectstate1;
}
public static WebElement clickcity1(WebDriver driver) {
	city1=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlCity\"]"));
	return city1;
}
public static WebElement clickselectcity1(WebDriver driver) {
	selectcity1=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ddlCity\']/option[4]"));
	return selectcity1;
}

public static WebElement clickcontactno1(WebDriver driver) {
	contactno1=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxContactPerson\']"));
	return contactno1;
}
public static WebElement clickemail1(WebDriver driver) {
	email1=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxEmail\']"));
	return email1;
}

public static WebElement clickstatus1(WebDriver driver) {
	status1=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ddlCustomerStatus\']"));
	return status1;
}

public static WebElement clickselectstatus1(WebDriver driver) {
	selectstatus1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCustomerStatus']/option[2]"));
	return selectstatus1;
}
public static WebElement clickbtnsave1(WebDriver driver) {
	btnsave1=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return btnsave1;
}

public static WebElement clickbtncancel1(WebDriver driver) {
	btncancel1=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return btncancel1;
}
public static WebElement clickfilter(WebDriver driver) {
	filter=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxFilter\']"));
	return filter;
}

public static WebElement clickprocess(WebDriver driver) {
	process=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[4]/a"));
	//UserMaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[7]/a"));
	return process;
}
public static WebElement clickprocessadd(WebDriver driver) {
	processadd=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnAddProcess\']"));
	return processadd;
}
public static WebElement clickproname(WebDriver driver) {
	proname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return proname;
}
public static WebElement clickprosave(WebDriver driver) {
	prosave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return prosave;
}
public static WebElement clickprocancel(WebDriver driver) {
	procancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return procancel;
}
public static WebElement clickproedit(WebDriver driver) {
	proedit=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdProcessList_lbtEdit_2\']/img"));
	return proedit;
	

}

public static WebElement clickpronamedit(WebDriver driver) {
	pronamedit=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return pronamedit;
}
public static WebElement clickprocsave(WebDriver driver) {
	procsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return procsave;
}
public static WebElement clickprocclose(WebDriver driver) {
	procclose=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return procclose;
}
public static WebElement clicksubproce(WebDriver driver) {
	subproce=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdProcessList_LinkButton1_2\']"));
	return subproce;
}
public static WebElement clicksubproceadd(WebDriver driver) {
	subproceadd=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnAddSubEvent\']"));
	return subproceadd;
}
public static WebElement clicksubprocename(WebDriver driver) {
	subprocename=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return subprocename;
}
public static WebElement clicksubprocesave(WebDriver driver) {
	subprocesave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return subprocesave;
}
public static WebElement clicksubprocecancel(WebDriver driver) {
	subprocecancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return subprocecancel;
}
public static WebElement clicksubprocedit(WebDriver driver) {
	subprocedit=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdSubProcessList_LinkButton1_0\']/img"));
	return subprocedit;
}
public static WebElement clicksubprocecname(WebDriver driver) {
	subprocecname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return subprocecname;
}
public static WebElement clickprocecnamsave(WebDriver driver) {
	procecnamsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return procecnamsave;
}
public static WebElement clickprocecnamcancel(WebDriver driver) {
	procecnamcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return procecnamcancel;
}
public static WebElement clickaddactivity(WebDriver driver) {
	addactivity=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdSubProcessList\']/tbody/tr[2]/td[4]/a"));
	return addactivity;
}
public static WebElement clickaddnewactivity(WebDriver driver) {
	addnewactivity=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnAddSubEvent\']"));
	return addnewactivity;
}
public static WebElement clicknameactivity(WebDriver driver) {
	nameactivity=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return nameactivity;
}
public static WebElement clicksaveactivitybtn(WebDriver driver) {
	saveactivitybtn=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return saveactivitybtn;
}
public static WebElement clickcancelactivitybtn(WebDriver driver) {
	cancelactivitybtn=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return cancelactivitybtn;
}
public static WebElement clickeditactivity(WebDriver driver) {
	editactivity=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdActivityList_LinkButton1_0\']/img"));
	return editactivity;
}
public static WebElement clickeditactivityname(WebDriver driver) {
	editactivityname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return editactivityname;
}
public static WebElement clickeditsaveactivity(WebDriver driver) {
	editsaveactivity=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return editsaveactivity;
}
public static WebElement clickeditcancelactivity(WebDriver driver) {
	editcancelactivity=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return editcancelactivity;
}
public static WebElement clickdeparmentmaster(WebDriver driver) {
	deparmentmaster=driver.findElement(By.xpath("//*[@id=\'CMPMenuBar:submenu:5\']/li[2]/a"));
	return deparmentmaster;
}
public static WebElement clickdeparmentadd(WebDriver driver) {
	deparmentadd=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnAddPromotor\']"));
	return deparmentadd;
}
public static WebElement clickdeparmentname(WebDriver driver) {
	deparmentname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_txtFName\']"));
	return deparmentname;
}
public static WebElement clickdeparmentsave(WebDriver driver) {
	deparmentsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return deparmentsave;
}
public static WebElement clickdeparmentcancel(WebDriver driver) {
	deparmentcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return deparmentcancel;
}
public static WebElement clickdeparmentedit(WebDriver driver) {
	deparmentedit=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdAuditor_LinkButton1_0\']/img"));
	return deparmentedit;
}
public static WebElement clickdeparmenteditname(WebDriver driver) {
	deparmenteditname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_txtFName\']"));
	return deparmenteditname;
}
public static WebElement clickdeparmenteditsave(WebDriver driver) {
	deparmenteditsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return deparmenteditsave;
}
public static WebElement clickdeparmenteditcancel(WebDriver driver) {
	deparmenteditcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return deparmenteditcancel;
}
public static WebElement clickobservation(WebDriver driver) {
	observation=driver.findElement(By.xpath("//*[@id=\'CMPMenuBar:submenu:5\']/li[5]/a"));
	//UserMaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[7]/a"));
	return observation;
}
public static WebElement clickobservationadd(WebDriver driver) {
	observationadd=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnAddPromotor\']"));
	return observationadd;
}
public static WebElement clickobservationname(WebDriver driver) {
	observationname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_txtFName\']"));
	return observationname;
}
public static WebElement clickobservationsave(WebDriver driver) {
	observationsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return observationsave;
}
public static WebElement clickobservationcancel(WebDriver driver) {
	observationcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return observationcancel;
}
public static WebElement clickobservationedit(WebDriver driver) {
	observationedit=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdAuditor_LinkButton1_2\']/img"));
	//proedit=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdProcessList_lbtEdit_2\']/img"));
	return observationedit;
}
public static WebElement clickobservationeditname(WebDriver driver) {
	observationeditname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFName']"));
	return observationeditname;
}
public static WebElement clickobservationeditsave(WebDriver driver) {
	observationeditsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return observationeditsave;
}
public static WebElement clickobservationmessagedisplay(WebDriver driver) {
	observationmessagedisplay=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ValidationSummary1\']/ul/li"));
	return observationmessagedisplay;
}
public static WebElement clickobservationeditcancel(WebDriver driver) {
	observationeditcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return observationeditcancel;
}
public static WebElement clicksubobservation1(WebDriver driver) {
	subobservation=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdAuditor_lnkCategory_3\']"));
	return subobservation;
}
public static WebElement clicksubobservationadd(WebDriver driver) {
	subobservationadd=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSubcategory\']"));
	return subobservationadd;
}
public static WebElement clicksubobservationname(WebDriver driver) {
	subobservationname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return subobservationname;
}
public static WebElement clicksubobservationsave(WebDriver driver) {
	subobservationsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return subobservationsave;
}
public static WebElement clickobservationsubcategorymessage(WebDriver driver) {
	observationsubcategorymessage=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ValidationSummary1\']/ul/li"));
	return observationsubcategorymessage;
}
public static WebElement clicksubsubobservationcancel(WebDriver driver) {
	subobservationcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return subobservationcancel;
}
public static WebElement clicksubobservationedit(WebDriver driver) {
	subobservationedit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_lbtEdit_0']/img"));
	return subobservationedit;
}
public static WebElement clicksubobservationeditname(WebDriver driver) {
	subobservationeditname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return subobservationeditname;
}
public static WebElement clicksubobservationeditsave(WebDriver driver) {
	subobservationeditsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return subobservationeditsave;
}
public static WebElement clickobservationsubcategoryeditmessage(WebDriver driver) {
	 observationsubcategoryeditmessage=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ValidationSummary1\']/ul/li"));
	return  observationsubcategoryeditmessage;
}
public static WebElement clicksubobservationeditcancel(WebDriver driver) {
	subobservationeditcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return subobservationeditcancel;
}
public static WebElement clicksubobservationbackbutton(WebDriver driver) {
	subobservationbackbutton=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_lnkBackToProcess\']"));
	return subobservationbackbutton;
}
public static WebElement clickriskcategory(WebDriver driver) {
	riskcategory=driver.findElement(By.xpath("//*[@id=\'CMPMenuBar:submenu:5\']/li[6]/a"));
	//UserMaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[7]/a"));
	return riskcategory;
}
public static WebElement clickriskcategoryadd(WebDriver driver) {
	riskcategoryadd=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnAddProcess\']"));
	return riskcategoryadd;
}
public static WebElement clickriskcategoryname(WebDriver driver) {
	riskcategoryname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return riskcategoryname;
}
public static WebElement clickriskcategorysave(WebDriver driver) {
	riskcategorysave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return riskcategorysave;
}
public static WebElement clickriskcategorymessagedis(WebDriver driver) {
	riskcategorymessagedis=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ValidationSummary1\']/ul/li"));
	return riskcategorymessagedis;
}
public static WebElement clickriskcategorycancel(WebDriver driver) {
	riskcategorycancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return riskcategorycancel;
}
public static WebElement clickriskcategorysearchbox(WebDriver driver) {
	riskcategorysearchbox=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxFilter\']"));
	return riskcategorysearchbox;
}
public static WebElement clickriskcategoryedit(WebDriver driver) {
	riskcategoryedit=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdRiskcategoryList_lbtEdit_0\']/img"));
	return riskcategoryedit;
}
public static WebElement clickriskcategoryeditname(WebDriver driver) {
	riskcategoryeditname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return riskcategoryeditname;
}
public static WebElement clickriskcategoryeditsave(WebDriver driver) {
	riskcategoryeditsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return riskcategoryeditsave;
}
public static WebElement clickriskcategorymessage(WebDriver driver) {
	riskcategorymessage=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ValidationSummary1\']/ul/li"));
	return riskcategorymessage;
}
public static WebElement clickriskcategoryeditcancel(WebDriver driver) {
	riskcategoryeditcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return riskcategoryeditcancel;
}
public static WebElement clickriskcategoryfilter(WebDriver driver) {
	riskcategoryfilter=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxFilter\']"));
	return riskcategoryfilter;
}
}




