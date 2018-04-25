package bdd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.SeMethods;

public class CreateLeads extends SeMethods {

	public CreateLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="(//input[@name='companyName'])[2]")
	private WebElement elecompanyname;
	@And("Enter Company name as (.*)")
	
	public CreateLeads typecompanyname(String data) {
		
		type(elecompanyname,data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement elefirstName;
	@And("Enter first name as (.*)")
	public CreateLeads typefirstName(String data) {
		
		type(elefirstName,data);
		return this;		
	}

	@FindBy(how=How.XPATH,using="(//input[@name='lastName'])[3]")
	private WebElement elelastName;
	@And("Enter last name as (.*)")
	public CreateLeads typelastName(String data) {
		
		type(elelastName,data);
		return this;		
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement elesubmitt;
	@Then("Click Submitt button")
	
	public ViewLeads clicksubmitt() {
		
		click(elesubmitt);
		return new ViewLeads();		
	}
}
