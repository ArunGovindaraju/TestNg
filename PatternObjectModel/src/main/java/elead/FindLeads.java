package elead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import clead.CreateLeads;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class FindLeads extends ProjectMethods {

	public FindLeads() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement elefirstName;
	
	public FindLeads typeelefirstName(String data) {
		
		type(elefirstName,data);
		return this;	
	
	}
	
	
		
		@FindBy(how=How.XPATH,using="(//button[@class='x-btn-text'])[7]")
		private WebElement eleflname;
		
		public FindLeads clickflname(){
			click(eleflname);
			
			return this;			
		}

		@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
		private WebElement elefname1;
		
		public Vieweleads clickfname1(){
			click(elefname1);
			
			return new Vieweleads();			
		}
	}

