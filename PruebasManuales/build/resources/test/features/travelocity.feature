Feature: enter page travelocity
  I as a user, need enter to page travelocity and make a reservation for a flight or hotel or car or a package

  
  Scenario: Register new user
    Given that user enter to page
    When He enter data for register new user
    Then He User to be registered


  Scenario: make reserve to fly
    Given that user enter to page
    When He enter data for reserve to fly
    Then He User can see the reserve


  Scenario: make reserve to fly and hotel
    Given that user enter to page
    When He enter data for reserve to fly and hotel
    Then He User can see the reserve


  Scenario: search cruises
    Given that user enter to page
    When He enter data for search a cruises
    Then He User can see the list a cruises


  Scenario: reserve cruises
    Given that user enter to page
    When He enter data for reserve a cruises
    Then He User can see the reserve a cruises


  Scenario: Search Vacation Rentals
    Given that user enter to page
    When He enter data for search Search Vacation Rentals
    Then He User can see the reserve a Search Vacation Rentals


  Scenario: add property a travelocity
    Given that user enter to page
    When He enter data for property is add a travelocity
    Then He User can see the property was add a travelocity


  Scenario: Search a packages with hotel,card and flight
    Given that user enter to page
    When He enter data for packages
    Then He User can see the list of the options


  Scenario: make a reserve for packages with hotel,card and flight
    Given that user enter to page
    When He enter data for packages for reserve
    Then He User can see reserve successful


  Scenario: Search list of trips for me
    Given that user enter to page
    When He enter data for list of trips for me
    Then He User can see list of trips


  Scenario: Search list of travel deals
    Given that user enter to page
    When He enter data for list of travel deals
    Then He User can see list of deals