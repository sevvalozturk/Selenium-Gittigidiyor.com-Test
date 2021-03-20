package com.testinium.projeodev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;
import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.*;

public class App{
	


public static void main(String [] args) {
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\eclipse-workspace\\projeodev\\drivers\\geckodriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.gittigidiyor.com/");
}
}
