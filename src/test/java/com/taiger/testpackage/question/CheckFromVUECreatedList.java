package com.taiger.testpackage.question;

import com.taiger.testpackage.page.VUEHomePage;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;

public class CheckFromVUECreatedList {

    VUEHomePage vueHomePage;

    public void itemDoesExist(String item){
        String itemActual = String.join("; ", vueHomePage.getListOfTodos());
        Arrays.asList(item.split(Pattern.quote("; "))).forEach((sTaskExpected)->{
            assertThat("Item Does exist",itemActual,containsString(sTaskExpected));
        });
    }

    public void itemDoesNotExist(String itemToDelete){
        vueHomePage.getListOfTodos().forEach((s_ToDo)->{
            assertThat("Item Does not exist",itemToDelete,not(containsString(s_ToDo)));
        });
    }
}
