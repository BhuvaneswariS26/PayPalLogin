package upromisePackage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wdMethods.ProjectMethods;

public class SignupPage extends ProjectMethods {

		//creating constructor
		public SignupPage() {
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(how=How.ID,using="firstName")
		private WebElement eleFirstName;
		
		public SignupPage enterFirstName(String data) {
			type(eleFirstName, data);
			return this;
		}		
		
		@FindBy(how=How.ID,using="lastName")
		private WebElement eleLastName;
		
		public SignupPage enterLastName(String data) {
			type(eleLastName, data);
			return this;
		}		
		
		@FindBy(how=How.ID,using="email")
		private WebElement eleEmail;
		
		public SignupPage enterEmail(String data) {
			type(eleEmail, data);
			return this;
		}
				
		@FindBy(how=How.XPATH,using="//input[@value='Become a Member']")
		private WebElement eleSubmit;
		
		public CreateLogin clickSubmit() {
		click(eleSubmit);
			return new CreateLogin();		
		}
	

}
