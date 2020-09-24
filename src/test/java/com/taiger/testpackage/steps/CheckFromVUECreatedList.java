package com.taiger.testpackage.steps;

import com.taiger.testpackage.page.VUEHomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;

public class CheckFromVUECreatedList {

    VUEHomePage vueHomePage;

    public void itemDoesExist(String item){
        vueHomePage.getListOfTodos().forEach((s_ToDo)->{
            assertThat("Item Does not exist",item,containsString(s_ToDo));
        });
    }

    public void itemDoesNotExist(String itemToDelete){
        vueHomePage.getListOfTodos().forEach((s_ToDo)->{
            assertThat("Item Does not exist",itemToDelete,not(containsString(s_ToDo)));
        });
    }
}
