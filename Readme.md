# Swagger Pet Store API Automation

This project automates API testing for the Swagger Pet Store using Java with RestAssured and Cucumber. 

Link:  https://petstore.swagger.io/

### Test Cases

1. Add a New Pet to the Store - Specify Tags and Status
2. Create at Least 4 Pets with Different Tags & Status
3. Store the ID of the New Pet in a JSON File
4. Update an Existing Pet
5. Find Pets by Status
6. Find Pets by Tags

### Prerequisites

Before running the tests, ensure you have the following installed:

* Java Development Kit (JDK)
* IntelliJ IDEA or any Java IDE of your choice
* Maven
* RestAssured
* TestNG
* Cucumber

### How to Run the Project

1. Clone or download the project from the repository.
2. Open the project in IntelliJ IDEA or your preferred IDE.
3. Ensure that the required dependencies are resolved by Maven.
4. Open the feature files located in the src/test/resources/features directory.
5. Right-click on the feature file and select "Run" to execute the Cucumber scenarios.

#### Test Data

The test data for creating pets with different tags and statuses can be defined in the feature files using Gherkin syntax. Ensure to provide valid input data for each scenario.

#### JSON File for Storing Pet IDs

After adding a new pet to the store, the ID of the pet will be stored in a JSON file. You can customize the file path and name in the test implementation.

### Further Development Plans
1. Enhance Test Coverage
   Expand test coverage by adding more scenarios to cover additional API endpoints and functionalities of the Swagger Pet Store.

2. Implement Test Data Management
   Integrate a data management solution to efficiently handle test data for various scenarios, including data generation, manipulation, and cleanup.

3. Continuous Integration
   Set up a continuous integration pipeline to automate test execution and reporting. Integrate with popular CI/CD platforms like Jenkins, or GitLab CI.

### Configuration

- Ensure the Swagger Pet Store API is accessible and responsive for testing.
- Update the base URL and other configurations as needed in the test implementation files.