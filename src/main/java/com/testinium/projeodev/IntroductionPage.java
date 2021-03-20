package com.testinium.projeodev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntroductionPage {

	public WebDriver driver;
	//protected static WebDriverWait wait;

	public void setup() {
		SystemProperty();
		driver.get("https://www.gittigidiyor.com/");
		//wait = new WebDriverWait (driver,20);
		driver.manage().window().maximize();
		
	}
	
	public void SystemProperty() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\eclipse-workspace\\projeodev\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	public void getlink(String Url) {
		   driver.get(Url);
    }
	
	public void close() {
		//driver.close();
		driver.quit();
	}

	public IntroductionPage(WebDriver driver) {
		this.driver=driver;
		
	}

	public static void cutConnection() {
		// TODO Auto-generated method stub
		
	}
}
