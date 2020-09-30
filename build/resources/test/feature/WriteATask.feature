Feature: Manages To-Do Items

  Background:
  In order to remember the things John want to do
  As a todoMVC user
  John want to manage his todo list

  @Gherkin @AddingItem
  Scenario Outline: User adds items
    Given "John" is on the home page
     When "John" attempts to add his "<LIST OF TO DO ITEMS>"
     Then he should be see that the lists "<CHECKING LIST OF TO DO ITEMS>" exists
    Examples:
      | Context  | LIST OF TO DO ITEMS                     | CHECKING LIST OF TO DO ITEMS            |
      | Test 001 | 7.00am : Wake up; 7.30am : Breakfast    | 7.00am : Wake up; 7.30am : Breakfast    |
      | Test 002 | 7.00pm : Feed Cat; 7.30pm: Play Game    | 7.00pm : Feed Cat; 7.30pm: Play Game    |

  @Gherkin @RemovingItem @UncompletedTask
  Scenario Outline: User deletes item that is uncompleted
    Given "John" is on the home page
#    And "John" has added his "<LIST OF TO DO ITEMS>"
    When "John" attempts to delete his uncompleted task "<ITEMS TO DELETE>"
    Then he should be see that the lists "<LIST OF TO DO ITEMS>" does not have "<ITEMS TO DELETE>"
    Examples:
      | Context  | LIST OF TO DO ITEMS                     | ITEMS TO DELETE   |
      | Test 001 | 7.00am : Wake up; 7.30am : Breakfast    | 7.00am : Wake up  |
      | Test 002 | 7.00pm : Feed Cat; 7.30pm: Play Game    | 7.30pm: Play Game |

  @Gherkin @RemovingItem @CompletedTask
  Scenario Outline: User deletes item that is completed
    Given "John" is on the home page
      And "John" has added his "<LIST OF TO DO ITEMS>"
     When "John" attempts to delete his completed task "<ITEMS TO DELETE>"
     Then he should be see that the lists "<LIST OF TO DO ITEMS>" does not have "<ITEMS TO DELETE>"
     Examples:
      | Context  | LIST OF TO DO ITEMS                     | ITEMS TO DELETE   |
      | Test 001 | 7.00am : Wake up; 7.30am : Breakfast    | 7.00am : Wake up  |
      | Test 002 | 7.00pm : Feed Cat; 7.30pm: Play Game    | 7.30pm: Play Game |