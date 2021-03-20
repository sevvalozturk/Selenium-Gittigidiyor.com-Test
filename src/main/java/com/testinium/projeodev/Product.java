package com.testinium.projeodev;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product extends IntroductionPage {
	
	
public void ProductChoose() {	

    //Sayfadan bu ürün seçilir.
     driver.findElement(By.xpath(".//*[@id='item-info-block-661921383']")).click();
}
	
public void ProductBasket() throws InterruptedException {
	
	WebElement product = driver.findElement(By.id("add-to-basket"));
	((RemoteWebDriver) driver).executeScript("arguments[0].scrollIntoView()", product);
	product.click();
	Thread.sleep(6000);
}

public void ProductRemove() throws InterruptedException {
	   driver.findElement(By.className("basket-title")).click();
	   Thread.sleep(6000);
	   driver.findElement(By.className("btn-update-item")).click();
	   
}
 public Product(WebDriver driver) {
			super(driver);
		
		}
}
