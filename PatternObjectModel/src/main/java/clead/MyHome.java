package clead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyHome extends LoginPage {

	public MyHome() {		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeads;

	public MyLeads clickLeads() {

		click(eleLeads);
		return new MyLeads();	
	}

}