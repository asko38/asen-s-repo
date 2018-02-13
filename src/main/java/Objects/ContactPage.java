package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Browser;

public class ContactPage {
	
	public	static	void fillUpData() {
		
		WebElement nameField = Browser.driver.findElement(By.id("input-name"));
	
		nameField.sendKeys("Asen Vasilev");
		WebElement emailField = Browser.driver.findElement(By.id("input-email"));
		
		emailField.sendKeys("a.vasilev@testpragma.bg");
		WebElement enquiryField = Browser.driver.findElement(By.id("input-enquiry"));
		
		enquiryField.sendKeys("Bloody test is done!!!");
		WebElement submitButt = Browser.driver.findElement(By.cssSelector("input.btn.btn-primary"));
		submitButt.click();
		WebElement continueButt = Browser.driver.findElement(By.linkText("Continue"));
		continueButt.click();
		
	}
	

}
