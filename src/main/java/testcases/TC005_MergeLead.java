package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_MergeLead";
		testDescription="Merge 2 leads";
		testNodes="Leads";
		category="Smoke";
		authors="Bhuvi";
		browserName="chrome";
		dataSheetName="MergeLead";
		
	}	
	
	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String index,String fromleadId,String toLeadId) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLead()
		.clickFromLead()
		.switchToWindow(1)
		.enterLeadId(fromleadId)
		.clickMergeFindLeadbutton()
		.clickMergeLeadIdlink()
		.clickToLead()
		.enterLeadId(toLeadId)
		.clickMergeFindLeadbutton()
		.clickMergeLeadIdlink()
		.clickMergeLead();
		
		
		
		
		
	}
}
