package bddelead;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods  {

	@Before
	public void Login()  {

		startResult();
		startTestModule("Testname", "TestDescription");	
		test = startTestCase("start");
		test.assignCategory("test11");
		test.assignAuthor("Arun");
		startApp("chrome");	
	}

		@After
		public void Create() {
			endResult();
			closeAllBrowsers();

		}
	}
