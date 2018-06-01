package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Captcha extends ProjectMethods{

	public Captcha() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(how=How.ID,using="recaptcha-anchor")
	private WebElement clickCheckBox;
	

	public Captcha clickNotARobot()
	{
		click(clickCheckBox);
		return this;
		
	}
	}


