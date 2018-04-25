package bdd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class MyHome extends SeMethods {

	public MyHome() {		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeads;
	@And("click Leads")
	public MyLeads clickLeads() {

		click(eleLeads);
		return new MyLeads();	
	}

}