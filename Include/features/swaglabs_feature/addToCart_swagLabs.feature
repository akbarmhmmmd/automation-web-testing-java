@akbar-testing @swag-cart
Feature: Cart Product Swag Labs

  Background:
  	Given User on Swag Labs page
  	When User input Standard User username
  	And User input correct password
  	And User click Login button

  Scenario Outline: User can add products to the cart
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
	@swag-sort
  Scenario Outline: User can sort products
    And User select <sort> sort icon
    Then User success sort products by <sort>
    
    Examples:
    | sort 								|
    | A to Z 							|
    | Z to A 							|
    | Price low to high 	|
    | Price high to low 	|
