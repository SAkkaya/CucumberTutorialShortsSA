package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    @FindBy(id = "prependedInput")
    private WebElement username;


    @FindBy(id = "prependedInput2")
    private WebElement password;


    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    public void login(String usernameInput, String passwordInput){

        username.sendKeys(usernameInput);
        password.sendKeys(passwordInput);

    }

}
