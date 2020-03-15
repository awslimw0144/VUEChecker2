Feature: User Taiger will be able to enter to-do item

  @gherkin
  Scenario: Send Key to Textbox
  Given "User_Taiger" is on VUE_Home_Page
  When "User_Taiger" creates task
    |Task                         |
    |I need to wake up at 6.30am  |
    And Hits Enter Key
  Then "User_Taiger" should see that the total count is 1
    And "User_Taiger" should see that there is only 1 item showed