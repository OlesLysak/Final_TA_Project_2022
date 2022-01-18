Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

   Scenario: Checks the name of the headline article
     Given User open home page
     When User click on the '<news>'
     Then Verify headline title

   Scenario: Check secondary article title
     Given User open home page
     When User click on the '<news>'
     Then Verify secondary article title

   Scenario: Check text of the Category headline article
     Given User open home page
     When User click on the '{news}'
     And User stores the text Category
     And User enter this text in the search button
     Then Verify name of the first title article

   Scenario: Check user can submit a question to BBC
     Given User open home page
     When User click on the '<news>'
     And User click on the '{coronavirus}'
     And User click on the '{your coronavirus stories}'
     And User click on the '{your questions}'
     And User enter question
     And User enter name
     And User enter email
     And User enter phone number
     And User enter location
     And User enter age
     And User click on the '<accept>'
     And User click on the '<submit>'
     Then negative test

  Scenario: Check user can submit a question to BBC
    Given User open home page
    When User click on the '<news>'
    And User click on the '{coronavirus}'
    And User click on the '{your coronavirus stories}'
    And User click on the '{your questions}'
    And User enter question
    And User enter name
    And User enter email
    And User enter phone number
    And User enter location
    And User enter age
    And User click on the '<accept>'
    And User click on the '<submit>'
    Then

  Scenario: Check user can submit a question to BBC
    Given User open home page
    When User click on the '<news>'
    And User click on the '{coronavirus}'
    And User click on the '{your coronavirus stories}'
    And User click on the '{your questions}'
    And User enter question
    And User enter name
    And User enter email
    And User enter phone number
    And User enter location
    And User enter age
    And User click on the '<accept>'
    And User click on the '<submit>'
    Then




