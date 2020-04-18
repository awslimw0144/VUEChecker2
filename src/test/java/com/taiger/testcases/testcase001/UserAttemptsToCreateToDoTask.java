package com.taiger.testcases.testcase001;

import com.taiger.testpackage.steps.NavigateToVUEWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

// Using lean-page objects and action classes
public class UserAttemptsToCreateToDoTask {

    // List the steps an actor will perform
    @Steps
    NavigateToVUEWeb navigateToVUEWeb;

//    @Steps
//    CreateTask createTask;


    @Given("{string} is on VUE_Home_Page")
    public void is_on_VUE_Home_Page(String actor) {
        navigateToVUEWeb.HomePage();
    }

    @When("{string} creates task")
    public void creates_task(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
    }

    @Then("{string} should see that the total count is {int}")
    public void should_see_that_the_total_count_is(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    }
}
