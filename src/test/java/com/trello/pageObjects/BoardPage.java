package com.trello.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class BoardPage {
	WebDriver ldriver;
	//WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
	public BoardPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(xpath="//div[@class='rCD_pjrvLRI_B_']/button")
	WebElement addBtn;

	@FindBy(xpath="(//button[@class='yTThzZMDkelhke'])[1]/span[2]")
	WebElement createBoardBtn;
	
	@FindBy(xpath="//span[@class='bKPMIrxAJqgHwG']/parent::div/following-sibling::input")
	WebElement titleBox;
	
	@FindBy(xpath="//button[text()='Create']")
	WebElement createBtn;
	
	public void clickCreate() {
		addBtn.click();
	}
	
	public void createBoard() {
		createBoardBtn.click();
	
	}
	public void enterTitle(String title) {
		titleBox.sendKeys(title);
	}
	public void clickCreateList() {
		createBtn.click();
	}
}
