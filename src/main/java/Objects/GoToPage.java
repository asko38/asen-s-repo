package Objects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Browser;

public class GoToPage {
	
	private static final String URL = "http://shop.pragmatic.bg";
	 
	public	static	void openPage() {
		Browser.driver.get(URL);
	
	}
	public	static	void checkPage() {
		GoToPage.openPage();
		WebElement	contactButt = Browser.driver.findElement(By.linkText("Contact Us"));
		Assert.assertTrue(contactButt.isDisplayed());
		WebElement returnButt = Browser.driver.findElement(By.linkText("Returns"));
		Assert.assertTrue(returnButt.isDisplayed());
		WebElement mapButt = Browser.driver.findElement(By.linkText("Site Map"));
		Assert.assertTrue(mapButt.isDisplayed());
		
		
	}
	public	static	void contactUs() {
		WebElement	contactButt = Browser.driver.findElement(By.linkText("Contact Us"));
		contactButt.click();
		WebElement nameField = Browser.driver.findElement(By.id("input-name"));
		Assert.assertTrue(nameField.isDisplayed());
		WebElement emailField = Browser.driver.findElement(By.id("input-email"));
		Assert.assertTrue(emailField.isDisplayed());
		WebElement enquiryField = Browser.driver.findElement(By.id("input-enquiry"));
		Assert.assertTrue(enquiryField.isDisplayed());
		
		
		
		
	}


}
