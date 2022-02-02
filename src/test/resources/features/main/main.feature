Feature: Main Page of Aliexpress

    Scenario: See the second ad from the second results page when searching for Iphone
        Given I am in the Aliexpress page
        When I search for "Iphone"
        And I navigate to the second page
        Then should present the second ad