package bddelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import clead.CreateLeads;
import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class FindLeads extends SeMethods {

	public FindLeads() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement elefirstName;
	@And("Enter first name as(.*)")
	
	public FindLeads typeelefirstName(String data) {
		
		type(elefirstName,data);
		return this;	
	
	}
	
	
		
		@FindBy(how=How.XPATH,using="(//button[@class='x-btn-text'])[7]")
		private WebElement eleflname;
		@And("click submitt button")
		
		public FindLeads clickflname(){
			click(eleflname);
			
			return this;			
		}

		@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
		private WebElement elefname1;
		@And("click first result")
		
		public Vieweleads clickfname1(){
			click(elefname1);
			
			return new Vieweleads();			
		}
	}

