
# Bench Slenium Assignment

# Synopsis

It is an Assignment which automates an website naming GreenKart where we are checking different scenarios like Search Functionality,Add to Cart feature, Registration Feature,Login Feature and Flight-Booking Feature available on website.

# Acknowledgement

I am deeply indebted to my respected Mentor "Ajay Verma", "Kirti Paliwal" for the guidance.

I am grateful for their indomitable contribution and guidance without which the completion of this project would have been impossible.

# Pre-requisites

* Any Browser

* website link for automation

* Eclipse IDE

# Framework

We use standard Framework provided by our mentors that allows us to write test cases using Java programming language. It helps us to write simple and scalable test cases for website. Eclipse is mainly used for writing tests for Website. It helps to write tests from simple unit tests to complex functional tests.

# Maintaining Modularity

For Maintaining Modularity we use Paje Object Model for each java class so that we can run each test case independently or accunulatively as per requirement using tags.

# One go Execution

For proper automation it is necessary to run all the test cases with Test Runner file as well as command prompt.

# Cross Browser Testing 

I also enhance the Functionality of cross browser. For that purpose we use a class where we are writing code for different browser like Chrome,Edge,Firefox etc.
Although Our default browser will be Chrome.

# Test cases

I Create ten test cases for each feature and all the test cases will run sequentially.
In each test cases we are hitting the home page first and then performing actions using proper implicit waits whereever required.
Hence we use standard Framework to make our test cases more organised and use java concepts and its DRY principle.

# Negative Test cases 
For the better understanding I also implement one negative scenario where our test case will be failed.
In that scenario we are not providing correct xpath for locating element. 

# Config Property File

* We are using config property file where we are putting all the capabilities and all the resusable elements used during the entire project.

# Logger Implementation

* We are using log4j class where we are defining logger Implementation.

* We are also using log4j property file where we are defining all the properties related to logger.

# Extent Report 

* We are using a class for creating Extent report using ITestListener interface.
I am providing implementing logic only for required method. I provided logic implementation method for OnTestSucces and OnTest Failure 

# Screenshots

We are also implementing for the Screenshots on failure of test cases
where it will capture the screenshot with the same name of testcase in the format of png.





