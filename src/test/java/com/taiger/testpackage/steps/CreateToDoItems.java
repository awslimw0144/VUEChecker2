package com.taiger.testpackage.steps;

import com.taiger.testpackage.page.VUEHomePage;
import com.viclim.utils.ConvertFromString;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.Map;

public class CreateToDoItems {
    // Page Object
    VUEHomePage vueHomePage;

    public void withThis(String s_ToDo_Raw){
        List<String> list_ToDos = ConvertFromString.toListOfStrings(s_ToDo_Raw,"; ");
        list_ToDos.forEach((s_ToDo)->{
            vueHomePage.writeToDoTextBox(s_ToDo);
        });
    }
}
