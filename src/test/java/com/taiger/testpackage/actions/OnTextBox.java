package com.taiger.testpackage.actions;

import com.taiger.testpackage.page.VUEHomePage;
import org.openqa.selenium.Keys;

public class OnTextBox {
    VUEHomePage vueHomePage;

    public void writeWith(String sToDoItem){
        this.vueHomePage.getSearchBox().sendKeys(sToDoItem);

    }

    public void andHitEnter(){
        this.vueHomePage.getSearchBox().sendKeys(Keys.ENTER);
    }
}
