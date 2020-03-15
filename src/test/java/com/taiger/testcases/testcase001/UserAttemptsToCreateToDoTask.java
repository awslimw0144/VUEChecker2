package com.taiger.testcases.testcase001;

import com.taiger.task.NavigateToWebPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
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

    @Given("^\"([^\"]*)\" is on VUE_Home_Page$")
    public void givenUserIsOnHomePage(){
        theActorCalled(actor.toString()).wasAbleTo(
                NavigateToWebPage.toVUEToDo()
        );
    }
}
