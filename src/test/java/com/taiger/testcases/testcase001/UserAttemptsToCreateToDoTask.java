package com.taiger.testcases.testcase001;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class UserAttemptsToCreateToDoTask {

    @Given("{string} is on VUE_Home_Page")
    public void is_on_VUE_Home_Page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("{string} creates task")
    public void creates_task(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
        throw new cucumber.api.PendingException();
    }

    @Then("{string} should see that the total count is {int}")
    public void should_see_that_the_total_count_is(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
