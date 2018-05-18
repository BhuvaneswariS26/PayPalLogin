package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{

	public MergeLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//img[@src='/images/fieldlookup.gif']")
	private WebElement eleFromLead;
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleToLead;
	
	@FindBy(how=How.XPATH,using="//a[text()='Merge']")
	private WebElement eleMergeLead;
	
		public FindLeadsPage clickFromLead() {
		click(eleFromLead);
		return new FindLeadsPage();		
	}
	public FindLeadsPage clickToLead() {
		click(eleToLead);
		return new FindLeadsPage();		
	}
	
	public MergeLeadsPage clickMergeLead() {
		click(eleMergeLead);
		return this;		
	}
	
	public MergeFindLeadpage switchToWindow(String index) {
		return new MergeFindLeadpage();
	}
}
