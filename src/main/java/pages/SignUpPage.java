package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SignUpPage extends ProjectMethods{
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement eleContinue;
	
	public SignUpPage clickContinueButton()
	{
		click(eleContinue);
		return this;
	}
	

}
