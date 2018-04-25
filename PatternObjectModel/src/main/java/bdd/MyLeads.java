package bdd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class MyLeads extends SeMethods{
	
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	@And("click create Leads")
	
	public CreateLeads clickCreateLead() {
		
		click(eleCreateLead);
		return new CreateLeads();		
	}
			
		
	}
	
	


