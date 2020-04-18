package com.taiger.testpackage.steps;

import com.taiger.testpackage.page.VUEHomePage;
import net.thucydides.core.annotations.Step;

public class NavigateToVUEWeb {
    String sUserName;
    VUEHomePage vueHomePage;

    @Step("{sUserName} Navigate to VUE home page")
    public void HomePage(String sUserName) {
        this.sUserName = sUserName;
        vueHomePage.open();
    }
}
