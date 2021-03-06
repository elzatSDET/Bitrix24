package com.cybertek.Btrix24.utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    //we don't want to access these variables outside
    private static final Logger logger = LogManager.getLogger();


    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(css = "[class='pagetitle-item']")
    protected WebElement pageSubTitle;

    @FindBy(css = "#user-name")
    protected WebElement userMenuName;

    @FindBy(css = ".user-name")
    protected WebElement usersFullName;

    @FindBy(xpath = "//span[@class='menu-popup-item-text' and contains(text(), 'Log out')]")
    protected WebElement logout;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    /**
     * @return page name, for example: Dashboard
     */
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }


    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
            logger.info("Loader mask gone...");
        } catch (Exception e) {
            logger.error("Loader mask doesn't present.");
            logger.error(e);
        }
    }

    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param tab
     * @param module
     *///span[@class='menu-item-link-text' and contains(text(),'Activity Stream')]
    //span[@class='feed-add-post-form-link feed-add-post-form-link-active']/span[contains(text(),'Task')]
    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[@class='menu-item-link-text' and contains(text(),'" + tab + "')]";
        String moduleLocator = "//span[@class='feed-add-post-form-link']/span[contains(text(),'"+ module +"')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            logger.error("Failed to click on :: "+tab);
             logger.error(e);
            BrowserUtils.clickWithWait(By.xpath(tabLocator), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
            logger.error("Failed to click on :: "+module);
            logger.error(e);
            BrowserUtils.waitForStaleElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)),  Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
        }
    }

    public String getUserMenuName(){
        waitUntilLoaderScreenDisappear();
        return userMenuName.getText();

    }

    public String getPageTitle(){
        waitUntilLoaderScreenDisappear();
        return Driver.getDriver().getTitle();
    }

    public String getUsersFullName(){
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(usersFullName, Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
        return usersFullName.getText();
    }

    public void logout(){
        BrowserUtils.waitForStaleElement(usersFullName);
        usersFullName.click();
        logout.click();
    }
}
