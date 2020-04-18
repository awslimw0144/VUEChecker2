package com.taiger.testpackage.steps;

import com.taiger.testpackage.page.VUEHomePage;
import net.thucydides.core.annotations.Step;

public class CreateToDoItems {
    // Page Object
    VUEHomePage vueHomePage;

    @Step("User writes down to-do items")
    public void withThisTask(String strTask) {
        vueHomePage.writeDownToDoItem(strTask);
    }
}
