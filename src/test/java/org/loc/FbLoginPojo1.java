package org.loc;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo1 extends org.base.BaseClass {

	// 1.Non para const
	public FbLoginPojo1() {

		PageFactory.initElements(driver, this);
	}

	// 2.Private WebElements
	@CacheLookup
	@FindBys({

			@FindBy(id = "email"), 
			@FindBy(xpath = "//input[@type='text']")

	})
	private WebElement txtEmail;

	@FindAll({

			@FindBy(name = "Pass"), 
			@FindBy(xpath = "//input[@placeholder='Password']") 
			
	})
	private WebElement txtPwd;

	@FindBy(xpath = "//button[@type='submit']")
	private List<WebElement> btnLogin;

	// 3.Getters to access private WebElements in another class
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPwd() {
		return txtPwd;
	}

	public List<WebElement> getBtnLogin() {
		return btnLogin;
	}
}
