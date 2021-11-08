
@vehicle @smoke_test
Feature: Create Vehicle

  As a user, I want to be able to create vehicles

  Scenario: Create a vehicle
    
    Given user is on the login page
    When user logs in with "storemanager85" and "UserUser123" credentials
    Then user navigates to "Fleet" and "Vehicles"
    And user click on create car button
    Then user enter vehicles information:
#Data Tables
      | Licence Plate | Driver | Location        | Model Year | Color |
      | test plates   | SDET   | Washington D.C. | 2020       | Black |
      | Java          | USer   | McLean, VA      | 2019       | Red   |





