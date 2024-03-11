# Automation Solutionz

This repository contains a Java-based automated test suite using Selenium WebDriver for testing the functionality of a web application. The test suite navigates to the website "https://www.zeuz.ai/" and performs various actions such as clicking on buttons, filling out forms, selecting options from dropdowns, and clicking checkboxes.

## Prerequisites

To run the automated tests, ensure you have the following prerequisites installed:

- Java Development Kit (JDK)
- Maven/ gradel
- Chrome WebDriver


## Test Scenario

### Visit the Page & Click Header Buttons

This test navigates to the webpage and clicks on header buttons.

#### Steps:

1. Navigate to the webpage "https://www.zeuz.ai/".
2. Click on the menu item with class name "menu-item-1384".
3. Click on the button with class name "ast-custom-button".
4. Enter first name "Etu Mahmuda" into the respective field.
5. Enter last name "Era" into the respective field.
6. Enter mobile number "" into the respective field.
7. Enter company website "ibos.io" into the respective field.
8. Select company size "1" from the dropdown.
9. Select role "Manual Tester" from the dropdown.
10. Enter email "" into the respective field.
11. Enter info "linked in" into the respective field.
12. Click on the checkbox with id "".
13. Click on the request button with class name "elementor-button-text".

## Additional Notes

- The test suite is written in Java using TestNG framework for test execution.
- The Chrome WebDriver is used for browser automation.
- Ensure proper internet connectivity during test execution as it requires accessing the web application.
- Verify the correctness of the web elements' locators (IDs, class names, etc.) in the test script before execution.

Feel free to modify and extend the test suite according to your specific testing needs.
