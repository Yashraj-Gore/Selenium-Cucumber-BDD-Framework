#Author: yashraj.gore@gmail.com
#Feature: Online purchase from shopping website
Feature: Online purchase from shopping website

Background: 
Given user is on the shopping website

  Scenario: Verify if user is able to checkout an item from the store
    When searches for the "tshirt"
    And choose to buy the third item
    And moves to checkout from mini cart
    And enter personal details on checkout page
    And select the same delivery address
    And select payment method
    Then make the payment
