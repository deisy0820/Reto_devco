#Author: deisy mosquera

Feature: enter page travelocity
  I as a user, need enter to page travelocity and make a reservation for a flight or hotel or car or a package

  Background: Precondition
    Given that user enter to page

  Scenario: search a hotel
    When  He enter data for search a hotel
    Then  he should see the options of the different hotels
