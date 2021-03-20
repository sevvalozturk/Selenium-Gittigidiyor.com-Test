package com.testinium.projeodev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main{

    public static void main(String[] args) throws InterruptedException {
        try {
        	
        	setup();
			new LoginPage(driver).Test();
            new Search(driver).Search();
            new Product(driver).ProductChoose();
            new Product(driver).ProductBasket();
            new Product(driver).ProductRemove();
            
            Thread.sleep(5000);
        }  finally {
            IntroductionPage.cutConnection();
        }
    }
    
	public static WebDriver driver;
    
    public static void setup() {
    
		SystemProperty();
		driver.get("https://www.gittigidiyor.com/");
		//wait = new WebDriverWait (driver,20);
		driver.manage().window().maximize();
		
	}
	public static void SystemProperty() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\eclipse-workspace\\projeodev\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
}
