package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{

	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFName;

	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleLeadId;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Email')]")
	private WebElement eleEmailtab;
	
	@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	private WebElement eleEmailId;
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elePhonetab;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Phone')]")
	private WebElement elePhone;
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
	private WebElement eleLeadName;
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadbutton;	
	
	@FindBy(how=How.XPATH,using="//div[contains(@class,'partyId')]/a[@class='linktext']") 
	private WebElement eleGetLeadId;

	public FindLeadsPage enterFName(String data) {
		type(eleFName,data);
		return this;
	}
	
	public FindLeadsPage enterLeadId(String data) {
		type(eleLeadId,data);
		return this;
	}
	
	public FindLeadsPage clickEmailtab() {
		click(eleEmailtab);
		return this;
	}
	
	public FindLeadsPage enterEmail(String data) {
		type(eleEmailId,data);
		return this;
	}
	
	public FindLeadsPage clickPhonetab() {
		click(elePhonetab);
		return this;
	}
	
	public FindLeadsPage enterPhone(String data) {
		type(elePhone,data);
		return this;
	}

	public FindLeadsPage clickFindLeadbutton() {
		click(eleFindLeadbutton);
		return this;		
	}
	
	public FindLeadsPage getLeadId() {
		getText(eleGetLeadId);
		return this;		
	}
	
		public ViewLeadPage clickLeadName() {
			click(eleLeadName);
			return new ViewLeadPage();
		}


	public ViewLeadPage clickLeadId() {
		click(eleLeadId);
		return new ViewLeadPage();		
	}
	
	

	

}
