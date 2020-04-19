package com.taiger.testpackage.steps;

import com.taiger.testpackage.page.VUEHomePage;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.Map;

public class CreateToDoItems {
    // Page Object
    VUEHomePage vueHomePage;

    @Step("User writes down to-do items")
    public void withThisTask(List<Map<String,String>> lToDoLists) {
        for(Map<String,String> mToDo : lToDoLists){
            String strTask = mToDo.get("To do List");
            vueHomePage.writeToDoTextBox(strTask);
        }
    }
}
