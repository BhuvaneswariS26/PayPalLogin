package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Bhuvi";
		browserName="chrome";
		dataSheetName="TC004_EditLead";
		
	}	
	
	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String editFname,String forename) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.enterFName(editFname)
		.clickFindLeadbutton()
		.clickLeadId()
		.clickEditbutton()
		.enterForeName(forename)
		.clickSubmitButton()
		.verifyFirstName(forename);
		
		
		
		
		
	}
}
