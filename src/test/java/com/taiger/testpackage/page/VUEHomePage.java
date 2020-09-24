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


    public void writeToDoTextBox(String sToDoItem){
        eSearchBox.sendKeys(sToDoItem);
        eSearchBox.sendKeys(Keys.ENTER);
    }

    public void deleteUnfinishedTask(String sToDelete){
        WebElement item = eToDoList.findElement(By.xpath(".//label[text()='"+sToDelete+"']//preceding-sibling::input"));
        WebElement destroy = eToDoList.findElement(By.xpath(".//label[text()='"+sToDelete+"']//following-sibling::button"));

        String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj."
                + "initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} "
                + "else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
        String onClickScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('click',"
                + "true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject)"
                + "{ arguments[0].fireEvent('onclick');}";
        ((JavascriptExecutor) getDriver()).executeScript(mouseOverScript, item);
        ((JavascriptExecutor) getDriver()).executeScript(onClickScript, destroy);
    }

    public void updateTaskWith(String oldTask, String newTask){
        WebElement item = eToDoList.findElement(By.xpath(".//label[text()='"+oldTask+"']"));
        String onDblClickScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('dblclick',"
                + "true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject)"
                + "{ arguments[0].fireEvent('ondblclick');}";
        ((JavascriptExecutor) getDriver()).executeScript(onDblClickScript, item);
    }

    public void removeCompletedTask(String sToDelete) {
        eToDoList.findElement(By.xpath(".//label[text()='"+sToDelete+"']//preceding-sibling::input")).click();
        eClearCompleted.click();
    }

    public List<String> getListOfTodos(){
        return findAll(".//label[@data-dojo-type='dojox/mvc/Element']")
                .stream()
                .map(WebElementFacade::getTextContent)
                .collect(Collectors.toList());
    }
}
