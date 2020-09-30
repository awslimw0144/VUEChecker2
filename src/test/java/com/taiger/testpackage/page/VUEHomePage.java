package com.taiger.testpackage.page;

import com.viclim.utils.ConvertFromString;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.jsoup.nodes.Element;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("http://todomvc.com/examples/dojo/")
public class VUEHomePage extends PageObject {

    @FindBy(className = "new-todo")
    WebElement eSearchBox;

    @FindBy(className = "todo-list")
    WebElement eToDoList;

    @FindBy(className = "footer")
    WebElement eFooter;

    @FindBy(className = "clear-completed")
    WebElement eClearCompleted;

    public WebElement getFiltersOf(String sChoice){
        return this.eFooter.findElement(By.xpath(".//a[text()='"+sChoice));
    }

    public WebElement getSearchBox(){
        return this.eSearchBox;
    }

    public WebElement getTaskOf(String sTask){
        return eToDoList.findElement(By.xpath(".//label[text()='"+sTask+"']"));
    }

    public WebElement getCheckBoxOf(String sTask){
        return eToDoList.findElement(By.xpath(".//label[text()='"+sTask+"']//preceding-sibling::input"));
    }

    public WebElement getClearCompleted(){
        return this.eClearCompleted;
    }

    public WebElement getDestroyOf(String sTask){
        return this.eToDoList.findElement(By.xpath(".//label[text()='"+sTask+"']//following-sibling::button"));
    }

    public List<String> getListOfTodos(){
        return findAll(".//label[@data-dojo-type='dojox/mvc/Element']")
                .stream()
                .map(WebElementFacade::getTextContent)
                .collect(Collectors.toList());
    }
}
