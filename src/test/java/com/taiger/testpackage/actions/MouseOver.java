package com.taiger.testpackage.actions;

import com.taiger.testpackage.page.VUEHomePage;
import org.openqa.selenium.JavascriptExecutor;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class MouseOver {
    VUEHomePage vueHomePage;

    public void onTaskOf(String sToDelete){
        String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj."
                + "initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} "
                + "else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
        ((JavascriptExecutor) getDriver()).executeScript(mouseOverScript, vueHomePage.getTaskOf(sToDelete));
    }
}
