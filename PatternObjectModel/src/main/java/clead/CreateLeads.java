package clead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLeads extends LoginPage {

	public CreateLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="(//input[@name='companyName'])[2]")
	private WebElement elecompanyname;
	
	public CreateLeads typecompanyname(String data) {
		
		type(elecompanyname,data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement elefirstName;
	
	public CreateLeads typefirstName(String data) {
		
		type(elefirstName,data);
		return this;		
	}

	@FindBy(how=How.XPATH,using="(//input[@name='lastName'])[3]")
	private WebElement elelastName;
	
	public CreateLeads typelastName(String data) {
		
		type(elelastName,data);
		return this;		
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement elesubmitt;
	
	public ViewLeads clicksubmitt() {
		
		click(elesubmitt);
		return new ViewLeads();		
	}
}
