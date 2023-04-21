package com.trello.pageObjects;


import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

public class ListPage {
	
WebDriver driver;
WebDriver ldriver;

public ListPage(WebDriver rdriver){
	ldriver = rdriver;
	PageFactory.initElements(rdriver,this);
}
@FindBy(name="name")
WebElement listTitleOne;

@FindBy(xpath="//input[@value='Add list']")
WebElement addListBtnOne;

@FindBy(name="name")
WebElement listTitleTwo;

@FindBy(xpath="//input[@value='Add list']")
WebElement addListBtnTwo;

@FindBy(xpath="(//a[@class='open-card-composer js-open-card-composer'])[1]")
WebElement addCardOne;

@FindBy(xpath="//textarea[@class='list-card-composer-textarea js-card-title']")
WebElement cardTitleOne;

@FindBy(xpath="//input[@value='Add card']")
WebElement addCard1;

@FindBy(xpath="//div[@class='cc-controls-section']/child::a")
WebElement addCardCloseOne;

@FindBy(xpath="(//a[@class='open-card-composer js-open-card-composer'])[2]")
WebElement addCardTwo;

@FindBy(xpath="//textarea[@class='list-card-composer-textarea js-card-title']")
WebElement cardTitleTwo;

@FindBy(xpath="//input[@value='Add card']")
WebElement addCard2;

@FindBy(xpath="//div[@class='cc-controls-section']/child::a")
WebElement addCardCloseTwo;

@FindBy(xpath="(//div[@class='list-card-details js-card-details'])[2]")
WebElement dragCard;

@FindBy(xpath="(//div[@class='list-card-details js-card-details'])[1]")
WebElement dropCard;

public void enterListTitleOne(String titleOne) {
	listTitleOne.sendKeys(titleOne);
}
public void addListOne() {
	addListBtnOne.click();
}
public void enterListTitleTwo(String titleTwo) {
	listTitleTwo.sendKeys(titleTwo);	
}
public void addListTwo() {
	addListBtnTwo.click();
}

public void addCardTitleOne() {
	addCardOne.click();
}
public void enterCardTitleOne(String cardTitle1) {
	cardTitleOne.sendKeys(cardTitle1);
}

public void addCardListOne() {
	 addCard1.click();
}
public void addCardCloseOne() {
	 addCardCloseOne.click();
}

public void addCardTitleTwo() {
	addCardTwo.click();
}
public void enterCardTitleTwo(String cardTitle2) {
	listTitleTwo.sendKeys(cardTitle2);
}
public void addCardListTwo() {
	 addCard1.click();
}
public void addCardCloseTwo() {
	 addCardCloseOne.click();
}

public void dragAndDropCard() {
	Actions actions = new Actions(driver);
	actions.dragAndDrop(dragCard, dropCard);
	Rectangle rect = dragCard.getRect();
	System.out.println(rect.getX());
	System.out.println(rect.getY());
}
}
