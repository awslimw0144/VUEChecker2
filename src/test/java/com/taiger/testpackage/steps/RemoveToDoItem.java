package com.taiger.testpackage.steps;

import com.taiger.testpackage.page.VUEHomePage;

public class RemoveToDoItem {
    // Page Object
    VUEHomePage vueHomePage;
    public void ofUncompletedTask(String itemToDelete){
        vueHomePage.deleteUnfinishedTask(itemToDelete);
    }
    public void ofThisCompletedTask(String itemToDelete){
        vueHomePage.removeCompletedTask(itemToDelete);
    }
}
