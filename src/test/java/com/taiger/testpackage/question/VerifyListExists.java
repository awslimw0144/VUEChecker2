package com.taiger.testpackage.question;

import com.taiger.testpackage.page.VUEHomePage;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class VerifyListExists {
    VUEHomePage vueHomePage;

    public List<String> fromVUECreatedLists(){
        return vueHomePage.getListOfTodos();
    }
}
