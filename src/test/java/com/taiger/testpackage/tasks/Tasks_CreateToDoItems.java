package com.taiger.testpackage.tasks;

import com.taiger.testpackage.actions.OnTextBox;
import com.viclim.utils.ConvertFromString;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class Tasks_CreateToDoItems {
    // Actions
    @Steps
    OnTextBox onTextBox;

    public void withThis(String s_ToDo_Raw){
        List<String> list_ToDos = ConvertFromString.toListOfStrings(s_ToDo_Raw,"; ");
        list_ToDos.forEach((s_ToDo)->{
            onTextBox.writeWith(s_ToDo);
            onTextBox.andHitEnter();
        });
    }
}
