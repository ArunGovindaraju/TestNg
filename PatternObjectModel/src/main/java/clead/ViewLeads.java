package clead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLeads extends CreateLeads {

	public ViewLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindleads;
	
	public ViewLeads clickFindLeads()  {
		
		click(eleFindleads);
		return this;	

}
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	
	public ViewLeads typeFirstName(String data)  {
		
		type(eleFirstName,data);
		return this;	

}
	@FindBy(how=How.XPATH,using="(//button[@class='x-btn-text'])[7]")
	private WebElement elefindleads;
	
	public ViewLeads clickfindleads () {
		
		click(elefindleads);
		return this;	

}

}
