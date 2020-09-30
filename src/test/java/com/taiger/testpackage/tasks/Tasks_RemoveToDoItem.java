package com.taiger.testpackage.tasks;

import com.taiger.testpackage.actions.ClickOn;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class Tasks_RemoveToDoItem {
    // Actions
    @Steps
    ClickOn clickOn;

    public void ofUncompletedTask(String itemToDelete){
        clickOn.deleteButton(itemToDelete);
    }
    public void ofThisCompletedTask(String itemToDelete){
        clickOn.checkTaskOf(itemToDelete);
        clickOn.clearCompleted();
    }
    public void ofTheseCompletedTasks(List<String> itemsToDelete){
        itemsToDelete.forEach((itemToDelete)->{
            clickOn.checkTaskOf(itemToDelete);
        });
        clickOn.clearCompleted();
    }
}
