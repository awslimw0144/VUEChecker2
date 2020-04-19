package com.taiger.testcases.testcase001;

import com.taiger.testpackage.steps.CreateToDoItems;
import com.taiger.testpackage.steps.NavigateToVUEWeb;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

// Using lean-page objects and action classes
public class UserAttemptsToCreateToDoTask {

    // List the steps an actor will perform
    @Steps
    NavigateToVUEWeb navigateToVUEWeb;

    @Steps
    CreateToDoItems createToDoItems;

    @Given("{string} is on VUE_Home_Page")
    public void is_on_VUE_Home_Page(String sUserName) {
        navigateToVUEWeb.HomePage(sUserName);
    }

    @When("{string} attempts to write task item")
    public void attemptsToWriteTaskItem(String userName, DataTable dataTable) {
        List<Map<String,String>> lists = dataTable.asMaps();
        createToDoItems.onToDoTextBox(lists);
    }

    @Then("{string} should see that the total count is {int}")
    public void should_see_that_the_total_count_is(String string, Integer int1) {

    }
}
