package com.testinium.projeodev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class LoginPage extends IntroductionPage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	public void Test() throws InterruptedException {
	
	getlink("https://www.gittigidiyor.com/uye-girisi");
	
	driver.findElement(By.id("L-UserNameField")).sendKeys("denemecc964@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("L-PasswordField")).sendKeys("merhabadeneme56");
	driver.findElement(By.id("gg-login-enter")).click();
	Thread.sleep(6000);
	
	
	}
	
}

