package com.taiger.testcases.testcase001;

import com.taiger.task.NavigateToWebPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class UserAttemptsToCreateToDoTask {

    // Actor definition
    Actor actor = Actor.named("TaigerTester");

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} is on VUE_Home_Page")
    public void is_on_VUE_Home_Page(String string) {
        NavigateToWebPage.toVUEToDo();
    }

    @When("{string} creates task")
    public void createsTask(String arg0) {


    }

    @Then("{string} should see that the total count is {int}")
    public void shouldSeeThatTheTotalCountIs(String arg0, int arg1) {
    }
}
