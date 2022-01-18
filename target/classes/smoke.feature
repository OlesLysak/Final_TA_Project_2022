Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

   Scenario: Check main news
     Given User open home page
     When User click on the '<News>'
     Then News page id opened

   Scenario: Check up-to-date news
     Given User open home page
     When User click News
     Then User

