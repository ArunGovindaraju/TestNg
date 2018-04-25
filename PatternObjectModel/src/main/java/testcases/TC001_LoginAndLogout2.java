package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import elead.HomePage;
import elead.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LoginAndLogout2 extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_LoginAndLogout2";
		testDescription="login to LeafTaps And Logout1";
		testNodes="Leads";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String elefirstName, String editedname) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		//new HomePage()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.typeelefirstName(elefirstName)
		.clickflname()
		.clickfname1()
		.clickedit()
		.typef1n(editedname)
		.clickupdte();
	}

}
