#  Automation Practice - Test Automation Framework

## 📌 Project Overview
This is a Selenium Test Automation Framework developed to test the **Automation Practice** web application. It covers key functionality, cart operations, and checkout functionality.

 ✅ Automated Test Cases:
** the provided scenarios in the task provided:

1. Assert that the **Thinking in HTML** book exists with correct title and price.
2. Click on **Add to Basket** for the selected book.
3. Click the **Shopping Cart** button.
4. Assert that the selected item appears in the cart with accurate details (title, quantity, price).
5. Click **Proceed to Checkout**.
6. Assert that the **Billing Details** form is displayed correctly.

----------------------------------------------------------------------------------------------------------------------------
## 🛠 Tech used in that framework:

- Language: Java  
- Build Tool: Maven  
- Testing Framework: TestNG  
- Automation Tool: Selenium WebDriver  
- Reporting: ExtentReports  
- Logging: Log4j2  
- Parallel Execution: TestNG XML configuration  
- Data Handling: JSON (for test data deserialization via Jackson)  
------------------------------------------------------------------------------------------------------------------------------------------------
## 🧩 Framework Structure
src:
    --main:
        --commons: common classes like actions, waits and other methods
        --data driven handling: class to handle data
        --page objects: pages that contains locators and methods to execute scenario
        --test: classes that contains test cases
        --utilities: contains classes to handle logs, reports and listeners

  -----------------------------------------------------------------------------------------------------
  How to set up:
  clone the repo :  git clone https://github.com/Abdelrazekewais/AutomationPracticeFramework.git
  open it in itellije or eclipse
  install dependecies
  ------------------------------------------------------------------------------------------------------
  How to run: 
  inside project, open testng.xml and run the file.
  if you need to run it in parallel, it's already set up in parallel mode, if not, just delete parallel attribute from the suite level.
