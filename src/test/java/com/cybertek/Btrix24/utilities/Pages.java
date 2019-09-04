package com.cybertek.Btrix24.utilities;


import com.cybertek.Btrix24.pages.Activity_Stream.Task;
import com.cybertek.Btrix24.pages.dashboards.DashboardPage;
import com.cybertek.Btrix24.pages.login_navigation.LoginPage;

public class Pages {
    private LoginPage loginPage;

    private DashboardPage dashboardPage;
    private Task task;

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }
    public Task task() {
        if (task == null) {
            task = new Task();
        }
        return task;
    }
    public DashboardPage dashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage();
        }
        return dashboardPage;
    }

}