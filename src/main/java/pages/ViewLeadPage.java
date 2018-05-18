package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLeadPage extends FindLeadsPage {
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how=How.XPATH,using="(//div[@class='frameSectionExtra']//a[3])")
	private WebElement eleEditbutton;
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyFirstName;
	
	@FindBy(how=How.XPATH,using="//a[@class='subMenuButtonDangerous']")
	private WebElement eleDelete;
	
	public EditLeadPage clickEditbutton() {
		click(eleEditbutton);
		return new EditLeadPage();
	}
	
	public ViewLeadPage verifyFirstName(String data) {
		verifyExactText(eleVerifyFirstName, data);
		return this;
	}
	
	public MyLeadPage clickDelete() {
		click(eleDelete);
		return new MyLeadPage();
	}
	
	

	
}
