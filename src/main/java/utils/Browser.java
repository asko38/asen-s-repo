package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public	static	WebDriver  driver;
	
	public	static	void		startBrowser() {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/asenvasilev/chromedriver");
		driver = new ChromeDriver();
	}
	
	public static void stopBrowser() {
		driver.close();
	}

}
