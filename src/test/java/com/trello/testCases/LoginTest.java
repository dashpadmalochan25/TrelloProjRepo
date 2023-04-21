package com.trello.testCases;

import com.trello.pageObjects.BaseClass;
import org.testng.annotations.*;
import com.trello.pageObjects.*;

public class LoginTest extends BaseClass{
	
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.get(baseURL);
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(5000);
		lp.setUserName(username);
		Thread.sleep(5000);
		lp.next();
		Thread.sleep(5000);
		lp.setUserPwd(password);
		Thread.sleep(5000);
		lp.clickSubmit();
		Thread.sleep(30000);
		
		BoardPage bp = new BoardPage(driver);
		bp.clickCreate();
		Thread.sleep(4000);
		bp.createBoard();
		Thread.sleep(4000);
		bp.enterTitle("Automation");
		Thread.sleep(5000);
		bp.clickCreateList();
		Thread.sleep(10000);
		
		ListPage lpg = new ListPage(driver);
		lpg.enterListTitleOne("List A");
		lpg.addListOne();
		lpg.enterListTitleTwo("List B");
		lpg.addListTwo();
		
		lpg.addCardTitleOne();
		lpg.enterCardTitleOne("Card 1");
		lpg.addCardListOne();
		lpg.addCardCloseOne();
		Thread.sleep(3000);
		lpg.addCardTitleTwo();
		Thread.sleep(5000);
		lpg.enterCardTitleTwo("Card 2");
		lpg.addCardListTwo();
		lpg.addCardCloseTwo();
		Thread.sleep(5000);
		lpg.dragAndDropCard();
		
		
		
		
		
		
	}
}
