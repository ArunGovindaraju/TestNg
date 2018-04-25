package elead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class HomePage extends ProjectMethods{
	
	public HomePage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	
	public LoginPage clickLogOut() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogOut);
		return new LoginPage();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement eleCRMSFAlink;
	
	public MyHome clickCRMSFA() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleCRMSFAlink);
		return new MyHome();		
	}

		
	


	

}
