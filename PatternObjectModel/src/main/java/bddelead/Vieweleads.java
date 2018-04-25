package bddelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class Vieweleads extends SeMethods {

	public Vieweleads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//a[text()='Edit']" )	
	private WebElement eleedit;
	@And("click Edit button")
	
	public Vieweleads clickedit() {
		click(eleedit);
		return this;		
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='updateLeadForm_firstName']")
	private WebElement elef1n;
	@And("Edit first name as (.*)")
	
	public Vieweleads typef1n(String data) {
		type(elef1n, data);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH, using="(//input[@name='submitButton'])[1]")
	private WebElement eleupte;
	@And("Click Submitt button")
	
	public Vieweleads clickupdte() {
		click(eleupte);
		return this;		
	}
}
