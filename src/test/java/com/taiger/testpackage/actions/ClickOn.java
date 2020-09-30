package com.taiger.testpackage.actions;

import com.taiger.testpackage.page.VUEHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ClickOn {
    VUEHomePage vueHomePage;

    public void deleteButton(String sToDelete){
        WebElement destroy = vueHomePage.getDestroyOf(sToDelete);


        String onClickScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('click',"
                + "true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject)"
                + "{ arguments[0].fireEvent('onclick');}";

        ((JavascriptExecutor) getDriver()).executeScript(onClickScript, destroy);
    }

    public void checkTaskOf(String sToDelete) {
        this.vueHomePage.getCheckBoxOf(sToDelete).click();
    }

    public void clearCompleted(){
        this.vueHomePage.getClearCompleted().click();
    }
}
