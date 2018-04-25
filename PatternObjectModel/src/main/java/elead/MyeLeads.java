package elead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class MyeLeads extends ProjectMethods{
	
	public MyeLeads() {		
		PageFactory.initElements(driver,this);
	}	
		
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
private WebElement elefindleads;
	
	public FindLeads clickFindLeads() {
		click(elefindleads);
		return new FindLeads();		
	}
	
	}


