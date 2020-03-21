package com.taiger.task;

import com.taiger.page.WebPageVUEHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateToWebPage implements Task {

    WebPageVUEHome webPageVUEHome;

    @Step("Open The Browser")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(webPageVUEHome)
        );
    }
    public static NavigateToWebPage toVUEToDo(){
        return Tasks.instrumented(NavigateToWebPage.class);
    }
}
