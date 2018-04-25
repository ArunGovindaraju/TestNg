package bddelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class MyeLeads extends SeMethods{
	
	public MyeLeads() {		
		PageFactory.initElements(driver,this);
	}	
		
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
private WebElement elefindleads;
	@And("click find leads")
	
	public FindLeads clickFindLeads() {
		click(elefindleads);
		return new FindLeads();		
	}
	
	}


