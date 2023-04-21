package com.trello.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
public class LoginPage {
	
WebDriver ldriver;

public LoginPage(WebDriver rdriver){
	ldriver = rdriver;
	PageFactory.initElements(rdriver,this);
}
@FindBy(name="user")
WebElement userName;

@FindBy(id="login")
WebElement continueBtn;

@FindBy(name="password")
WebElement userPwd;

@FindBy(xpath="//button[@id='login-submit']")
WebElement LoginBtn;

public void setUserName(String uName) {
	userName.sendKeys(uName);
}

public void next() {
	continueBtn.click();
}

public void setUserPwd(String uPwd) {
	userPwd.sendKeys(uPwd);
}
public void clickSubmit() {
	LoginBtn.click();
}

}
