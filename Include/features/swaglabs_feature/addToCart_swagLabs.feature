@akbar-testing @swag-cart
Feature: Cart Product Swag Labs

  Scenario Outline: User can add products to the cart
  	Given User on Swag Labs page
  	When User input Standard User username
  	And User input correct password
  	And User click Login button
    And User click <item> Add to Cart
    And User click cart icon
    Then User successfully add <item> to the cart

    Examples: 
      | item  				|
      | Backpack 			|
      | Bike Light 		|
      | Bolt T-Shirt 	|
      | Fleece Jacket |
      | Onesie 				|
      | Red T-Shirt 	|