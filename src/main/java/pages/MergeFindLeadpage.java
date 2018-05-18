package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeFindLeadpage extends ProjectMethods{
	public MergeFindLeadpage() {
		PageFactory.initElements(driver, this);
	}
	//for merge-Find lead page
	@FindBy(how=How.NAME,using="Id")
	private WebElement eleId;

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']") 
	private WebElement eleMergeFindLeadbutton;		


	@FindBy(how=How.XPATH,using="//a[@class='linktext'][1]")
	private WebElement eleMergeLeadId;
	
	
	//for merge-find lead page
		public MergeFindLeadpage enterLeadId(String data) {
			type(eleId,data);
			return this;		
		}

		public MergeFindLeadpage clickMergeFindLeadbutton() {
			click(eleMergeFindLeadbutton);
			return this;		
		}

		public MergeLeadsPage clickMergeLeadIdlink() {
			click(eleMergeLeadId);
			return new MergeLeadsPage();		
		}

		public void switchToWindow(String index) {
			
		}
}
