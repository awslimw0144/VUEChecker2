package com.taiger.testpackage.steps;

import com.taiger.testpackage.page.VUEHomePage;
import net.thucydides.core.annotations.Step;

public class NavigateToVUEWeb {

    // Page Object
    VUEHomePage vueHomePage;

    @Step("Navigate to VUE home page")
    public void HomePage() {
        vueHomePage.open();
    }
}
