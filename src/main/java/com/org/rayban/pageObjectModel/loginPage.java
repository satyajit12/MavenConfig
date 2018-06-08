package com.org.rayban.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
	
	
@FindBy(xpath="//a[text()='Sign in']")
private WebElement signInButton;
	
@FindBy(xpath="//input[@id='login_field']")
private WebElement userNameTextBox;

@FindBy(xpath="//input[@id='password']")
private WebElement passWordTextBox;

@FindBy(xpath="//input[@value='Sign in']")
private WebElement loginButton;

@FindBy(xpath="//h2[text()='Learn Git and GitHub without any code!']")
private WebElement validateTextForLogin;

@FindBy(xpath="//span[@class='dropdown-caret']")
private WebElement dropdownForSignout;

@FindBy(xpath="//li[form[button[contains(text(),'Sign out')]]]")
private WebElement signOutButton;

public WebElement getSignInButton() {
	return signInButton;
}

public WebElement getUserNameTextBox() {
	return userNameTextBox;
}

public WebElement getPassWordTextBox() {
	return passWordTextBox;
}

public WebElement getLoginButton() {
	return loginButton;
}

public WebElement getValidateTextForLogin() {
	return validateTextForLogin;
}

public WebElement getDropdownForSignout() {
	return dropdownForSignout;
}

public WebElement getSignOutButton() {
	return signOutButton;
}






}
