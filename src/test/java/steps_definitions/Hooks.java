package steps_definitions;

import Base.main;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends main {
	@Before
	public void callBrowser() {
		initialization();
	}
	@After
	public void closeBrowser() {
		tearDown();
	}

}
