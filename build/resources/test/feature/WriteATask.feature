Feature: Create Task List

  @gherkin
  Scenario: Send Key to Textbox
    Given "User_Taiger" is on VUE_Home_Page
    When "User_Taiger" attempts to write task item
      |Task Description |
      |"Wake up at 7.00am"|
    Then "User_Taiger" should see that the total count is 1