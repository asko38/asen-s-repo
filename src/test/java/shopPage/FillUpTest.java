package shopPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Objects.ContactPage;
import Objects.GoToPage;
import utils.Browser;

public class FillUpTest {
	
	@Before
	public void setUp() {
		Browser.startBrowser();
			
		
		}
	
	@Test
	public void goToPage() {
		GoToPage.openPage();
		GoToPage.checkPage();
		GoToPage.contactUs();
		ContactPage.fillUpData();
	}
	
	@After
	public void closeBrowser() {
		Browser.driver.quit();
}

}
