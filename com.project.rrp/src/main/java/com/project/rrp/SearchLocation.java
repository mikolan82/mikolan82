package com.project.rrp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchLocation {
	WebDriver driver;
	public SearchLocation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//*[@id=\"search_input\"]/input")
	private WebElement searchField;
	
	@FindBy(xpath = "//*[@id=\"search_input\"]/button/svg")
	private WebElement searchBtn;
	
	public void inputValue(String value) {
		searchField.sendKeys(value);
	}
	public void clickSearchBtn() {
		searchBtn.click();
	}
	
	

}

