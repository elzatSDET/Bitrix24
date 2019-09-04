package com.cybertek.Btrix24.pages.login_navigation;
import org.apache.logging.log4j.Logger;
import com.cybertek.Btrix24.utilities.ExcelUtil;
import com.cybertek.Btrix24.utilities.Pages;
import com.cybertek.Btrix24.utilities.TestBase;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Arrays;


public class DDTLoginTest extends TestBase {


    @Test(dataProvider = "credentials_info")
    public void loginTestWithDataProvider( String Username, String Password) {
        Pages page = new Pages();
        extentLogger = report.createTest("Data Driver Testing with excel");
        if(Password.equalsIgnoreCase("UserUser")){
            page.loginPage().login(Username, Password);
            String actualFullName = page.dashboardPage().getUsersFullName();
            page.dashboardPage().logout();
            extentLogger.pass("Login as "+Username+" successful");
        }else{
            throw new SkipException("Test ignored");
        }

//        page.loginPage().login(Username, Password);
//        page.dashboardPage().logout();

    }


    @DataProvider(name = "credentials_info")
    public Object[][] credentials() {
        ExcelUtil qa2 = new ExcelUtil("src/test/resources/Brit24.xlsx", "Sheet 1");
        return qa2.getDataArray();
    }
}