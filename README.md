# Calculator GUI
An advanced calculator with a GUI. Made in Java using IntelliJ. Git is being used for version control. Contributions are on the bottom of README.

## Week 7 - Self Grades
Contributor | Self Grade (Out of 5) | Reasoning (Code Snippets Labelled in Project)
----------- | --------------------- | ---------------------------------------------
Gautam Gupta | 5/5 | I documented all of the work work on the README, I worked on a placeholder text for the converter UI so that the user knows what the enter into the text field, and I am working on developing a free text calculator. I also worked on maintaining a clean version control history on our team's repo. I also added the log function to the calculator.
Dhruv Kanetkar | 5/5 | Added main menu logic and object calling for oth the converter and calculator. I also made the drop down menu for the suite. For the calculator, I added the logic for: Multiply, Divide, and Modulus. Changed the layout look for the calculator look by changing the color palette. 
Tanay Shah | 5/5 | I abstracted the model component of the project from the CalculatorUI file and made it it's own file so that it could easily talk to the control field and report to the UI in the form of an object. Worked with Dhruv S in figuring out how to make the main menu bar. 
Dhruv Sengupta | 5/5 | I added the GUI to converter and worked with everyone to center the label text. Applied Tanay's business logic code and added it to the button. Managed all the positions for the UI items in all of the GUI's. Worked with Tanay on the main menu bar by analyzing the code that was given to us to draw parallels between the projects and implement the parts that applied. 

## How to run our code?
Prerequisites: 
- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- IntelliJ

You will need to pull out code down and view it in IntelliJ. Follow this document for instructions on how to run out code: [Code Instructions](https://docs.google.com/document/d/1yZMZCIHzIUx_sKJ-uUAaJKMJXkuuMoprFAGDZGbFyNE/edit?usp=sharing)


## Calculator Functions
We have created two main sub-projects in our CalculatorUI: 
- Scientific Calculator  
A basic scientific calculator with basic math, log, exponents, and modulus operators
- Temperature Converter  
A temperature converter that converts celsius to fahrenheit

### Scientific Calculator
Function Name | Description | How it is done
------------- | ----------- | --------------
Basic Math Operation (Addition/Subtraction/Multiplication/Division) | Additions, Subtraction, Multiplication, or Division of the numbers that the user selects | The user clicks on buttons on the GUI for the numbers and also selects an operator button on the GUI. The operator happens on the arguments and the answer is displayed on the text-field on the top.
Log | Base 10 logarithm of an argument | The user clicks on a number button followed by the log button to indicate that the user wants to take a base 10 logarithm of the number the user clicks on.
Exponents | Raise a base to the power | The user selects the base number first and then the exponent button (the upward arrow) and then selects the power the user wants to raise the base to. 
Modulus | Get the remainder when dividing two numbers | The user selects the numerator of the fraction and then the modulus operator, followed by the denominator of the fraction. The modulus function will return the remainder of the fraction. 

### Temperature Converter
Function Name | Description | How it is done
------------- | ----------- | --------------
Celsius to Fahrenheit | Converting the celsius degrees that the user inputs to fahrenheit | The user enters a celsius temperature in the text field on the top of the screen and then clicks convert. The fahrenheit label on the bottom then changes to display that fahrenheit temperature calculated from the equation ((Celsius x 9/5) + 32)

## Future Features to Add
Throughout the course of his project, we want to add more and more features to make the best calculator possible.  
Here is a list of all the new features we want to add: 
1. Square Roots  
    Goal: Complete in Week 8  
    Assignment: Dhruv S
2. Trig (sin, cos, & tan)  
    Goal: Complete in Week 8  
    Assignment: Gautam
3. Encoding Converter (Binary & Hex)  
    Goal: Complete in Week 9  
    Assignment: Tanay
4. Physics Converter (Kinematic Equation Solver)  
    Goal: Complete in Week 9  
    Assignment: Dhruv K
5. Free Text Calculator (Typed in functions)
    Goal: Complete in Week 10
    Assignment: Gautam

## Project Credits
Contributor | GitHub Link
----------- | -----------
Gautam Gupta | [@batman084](https://github.com/batman084)  
Tanay Shah | [@Altoid0](https://github.com/Altoid0)  
Dhruv Kanetkar | [@DhruvK0](https://github.com/DhruvK0)  
Dhruv Sengupta | [@DaHippoBear](https://github.com/DaHippoBear)  

