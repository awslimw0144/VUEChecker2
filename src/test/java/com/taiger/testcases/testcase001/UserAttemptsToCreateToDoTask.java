package com.taiger.testcases.testcase001;

import com.taiger.testpackage.question.VerifyListExists;
import com.taiger.testpackage.steps.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


// Using lean-page objects and action classes
public class UserAttemptsToCreateToDoTask {

    // List the steps an actor will perform
    @Steps
    NavigateToVUEWeb navigateToVUEWeb;
    @Steps
    CreateToDoItems createToDoItems;
    @Steps
    RemoveToDoItem removeToDoItem;
    @Steps
    UpdateToDoItem updateToDoItem;

    // Questions
    @Steps
    VerifyListExists verifyListExists;
    @Steps
    CheckFromVUECreatedList checkFromVUECreatedList;


    @Given("{string} is on the home page")
    public void isOnTheHomePage(String sUserName) {
        navigateToVUEWeb.HomePage(sUserName);
    }

    @When("{string} attempts to add his {string}")
    public void attemptsToAddHis(String sUserName, String listOfToDos) {
        createToDoItems.withThis(listOfToDos);
    }

    @Then("he should be see that the lists {string} exists")
    public void heShouldBeSeeThatTheListsExists(String listOfToDos) {
        for (String sToDo : verifyListExists.fromVUECreatedLists()) {
            assertThat("The strings matches", listOfToDos, containsString(sToDo));
        }
    }

    @And("{string} has added his {string}")
    public void hasAddedHis(String sUsername, String listOfToDos) {
        createToDoItems.withThis(listOfToDos);
    }

    @When("{string} attempts to delete his uncompleted task {string}")
    public void attemptsToDeleteHis(String arg0, String itemToDelete) {
        removeToDoItem.ofUncompletedTask(itemToDelete);
    }

    @Then("he should be see that the lists {string} does not have {string}")
    public void heShouldBeSeeThatTheListsDoesNotHave(String s_ToDos, String itemToDelete) {
        checkFromVUECreatedList.itemDoesNotExist(itemToDelete);
    }

    @When("{string} attempts to delete his completed task {string}")
    public void attemptsToDeleteHisCompletedTask(String actor, String itemToDelete) {
        removeToDoItem.ofThisCompletedTask(itemToDelete);
    }

    @Then("he should be see that the lists {string} have {string}")
    public void heShouldBeSeeThatTheListsHave(String old, String itemToUpdate) {
    }

    @When("{string} attempts to update his {string} to {string}")
    public void attemptsToUpdateHisTo(String actor, String oldTask, String newTask) {
        updateToDoItem.ofThisTask(oldTask, newTask);
    }

    @And("he should be see that the lists {string} now have {string}")
    public void heShouldBeSeeThatTheListsNowHave(String arg0, String newTask) {
        checkFromVUECreatedList.itemDoesExist(newTask);
    }
}
