# BNP_ShoppingBasket
Calculate discounted price of Shopping basket


## Project Run
1. Pull the code from below repo
   https://github.com/PravMavrick/DevelopementBooks.git into IDE
2. Reload/update project with Maven And run the application.
3. Please use PostMan or any API client application for testing the application.

## Project description
1. Application is using H2 in memory database.
   H2 database access link
   http://localhost:8080/h2-console
2. Application has below endpoints
   1. Create all books -  http://localhost:8080/api/createAllBooks
      POST call with below Json body --> 
      [ {
      "bookName": "Clean Code (Robert Martin, 2008)",
      "bookPrice": 50.0
      },
      {
      "bookName": "The Clean Coder (Robert Martin, 2011)",
      "bookPrice": 50.0
      },
      {
      "bookName": "Clean Architecture (Robert Martin, 2017)",
      "bookPrice": 50.0
      },
      {
      "bookName": "Test Driven Development by Example (Kent Beck, 2003)",
      "bookPrice": 50.0
      },
      {
      "bookName": "Working Effectively With Legacy Code (Michael C. Feathers, 2004)",
      "bookPrice": 50.0
      }
      ]
   2. Create all discount rules - http://localhost:8080/api/createDiscountRules
      POST call with below Json Body --> [
      {
      "discDescription": "One book no discount",
      "discPercentage": 0.0
      },
      {
      "discDescription": "Two different books",
      "discPercentage": 5.0
      },
      {
      "discDescription": "Three different books",
      "discPercentage": 10.0
      },
      {
      "discDescription": "Four different books",
      "discPercentage": 20.0
      },
      {
      "discDescription": "Five different books",
      "discPercentage": 25.0
      }
      ]
   3. Get Shopping basket price for given books - http://localhost:8080/api/getPrice
      POST call with below Json Body -->
      [
      {
      "bookName": "Clean Code (Robert Martin, 2008)",
      "bookQuantity": 2
      },
      {
      "bookName": "The Clean Coder (Robert Martin, 2011)",
      "bookQuantity": 2
      },
      {
      "bookName": "Clean Architecture (Robert Martin, 2017)",
      "bookQuantity": 2
      },
      {
      "bookName": "Test Driven Development by Example (Kent Beck, 2003)",
      "bookQuantity": 1
      },
      {
      "bookName": "Working Effectively With Legacy Code (Michael C. Feathers, 2004)",
      "bookQuantity": 1
      }
      ]
