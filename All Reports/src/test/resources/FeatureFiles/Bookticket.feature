Feature: To validate a Bookmyshow Applications
Scenario: To Book a Movie ticket in Bookmyshow Application

When User is in a Bookmyshow application
And User have to enter a movie name and select a date
When User have to select theatre and select screen
And User have to select a seat and book a ticket
Then User is in a Payment Method
