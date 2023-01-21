@greenKart
Feature: Verify Green kart item shpment
Scenario: Successfully add 2 items to cart and shipped to united states
Given go to Green Kart home page
And user verify the page title
When user capture all items from the page
And print sorted prices in decending order
And add second plus third item into cart
Then user go to cart page
And user verify total price
And user go to next page to select country "United states"
And user verify successfully shipped items