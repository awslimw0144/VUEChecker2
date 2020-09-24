package com.taiger.testpackage.steps;

import com.taiger.testpackage.page.VUEHomePage;

public class UpdateToDoItem {
    // Page Objects
    VUEHomePage vueHomePage;
    public void ofThisTask(String oldTask,String newTask){
        vueHomePage.updateTaskWith(oldTask, newTask);
    }
}
