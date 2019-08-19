package com.cybertek.Btrix24.pages.Activity_Stream;

import com.cybertek.Btrix24.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Message extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Message')]")
    public WebElement messageBtn;

    @FindBy(css = "[class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement  linkBtn;


    @FindBy(css = "[id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement textBox;

    @FindBy(css = "[id='linkidPostFormLHE_blogPostForm-href']")
    public  WebElement linkBox;

    @FindBy(css = "[id='undefined']")
    public WebElement saveButton;

    @FindBy(css = "[id='blog-submit-button-save']")
    public WebElement sendBtn;


    public  void clickMessage(){
        messageBtn.click();
    }

    public void clickLink(){
        linkBtn.click();
    }

    public  void InputText(String value){
        textBox.clear();
        textBox.sendKeys(value);
    }

    public void InputLink (String value){
        linkBox.clear();
        linkBox.sendKeys(value);
    }

    public void clickSave(){
        saveButton.click();
    }

    public void clickSend(){
        sendBtn.click();

    }

}
