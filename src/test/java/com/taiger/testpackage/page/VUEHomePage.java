package com.taiger.testpackage.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://todomvc.com/examples/dojo/")
public class VUEHomePage extends PageObject {

    @FindBy(className = "new-todo")
    private WebElement eSearchBox;

    public void writeToDoTextBox(String sToDoItem){
        eSearchBox.sendKeys(sToDoItem);
    }

}
