package com.testinium.projeodev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search extends IntroductionPage {
	
	public Search(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void Search() throws InterruptedException {
	
		getlink("https://www.gittigidiyor.com/haftanin-kesifleri");
		try {
		driver.findElement(By.id("search_word")).sendKeys("Bilgisayar");
		
		driver.findElement(By.id("header-search-find-link")).click();
		System.out.println("Aranılan kelimenin sayfası açıldı");
		
		}catch(Exception hata) {
			
			System.out.println("Hata");
		}
		Thread.sleep(5000);
	}
	
	
}
