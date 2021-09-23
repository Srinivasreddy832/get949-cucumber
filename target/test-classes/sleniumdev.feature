Feature: Downlode page
 Scenario: verification of downlode page link
       Given User is on the home page of selenium
       When user clicks on downlode link
       Then title should be "Downloads | Selenium"