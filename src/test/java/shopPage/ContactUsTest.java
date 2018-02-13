package shopPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Objects.GoToPage;
import utils.Browser;

public class ContactUsTest {

	
	
	@Before
	public void setUp() {
		Browser.startBrowser();
			
		
		}
		@Test
		public void goToPage() {
			GoToPage.openPage();
			GoToPage.checkPage();
			GoToPage.contactUs();
			

}
		@After
		public void closeBrowser() {
			Browser.driver.quit();
	
}
}
