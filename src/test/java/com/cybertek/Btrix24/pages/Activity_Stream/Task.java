package com.cybertek.Btrix24.pages.Activity_Stream;

import com.cybertek.Btrix24.utilities.BasePage;
import com.cybertek.Btrix24.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task extends BasePage {

    @FindBy(xpath = " //span[@class='feed-add-post-form-link']/span[contains(text(),'Task')]")
    public WebElement taskBtn;

    @FindBy(css = "[name='ACTION[0][ARGUMENTS][data][TITLE]']")
    public WebElement tagsName;

    @FindBy(css = "//span[ @class='task-options-destination-wrap date']")
    public  WebElement deadLineBox;

    @FindBy(css = "[data-date='1566345600000']")
    public WebElement chooseDate;

     @FindBy(xpath = "//span[@class='bx-calendar-button-text' and contains(text(),'Select')]")
     public WebElement selectBtn;

     @FindBy(css = "[id='blog-submit-button-save']")
     public WebElement sendBtn;


    @FindBy(css = "[class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement  linkBtn;


    @FindBy(css = "[id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement textBox;

    @FindBy(css = "[id='linkidPostFormLHE_blogPostForm-href']")
    public  WebElement linkBox;

    @FindBy(css = "[id='undefined']")
    public WebElement saveButton;


    public void clickTask(){
        taskBtn.click();
     }

     public void InputTaskName(String value) {
         tagsName.sendKeys(value);
     }

     public void clickDeadLineBox(){
         deadLineBox.click();
     }

     public void clickDate(){
         chooseDate.click();
     }

     public void clickSelect(){
         selectBtn.click();
     }

     public void clickSend1(){
         sendBtn.click();
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
