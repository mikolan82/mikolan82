package com.project.rrp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
	public static void setup() {
		WebDriver driver = new ChromeDriver(); 
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.autogorod.by/");
		
		
	}

}
