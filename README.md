# Calculator GUI
An advanced calculator with a GUI. Made in Java using IntelliJ. Git is being used for version control. Contributions are on the bottom of README.

## Week 7 - Self Grades
Contributor | Self Grade (Out of 5) | Reasoning (Code Snippets Labelled in Project)
----------- | --------------------- | ---------------------------------------------
Gautam Gupta | 5/5 | I documented all of the work work on the README, I worked on a placeholder text for the [converter UI](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/ConverterUI.java) so that the user knows what the enter into the text field, and I am working on developing a [free text calculator](https://github.com/Altoid0/CalculatorUI/blob/master/src/model/FreeTextModel.java). I also worked on maintaining a clean version control history on our team's repo. I also added the [log function](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/CalculatorUI.java#L437) to the [calculator](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/CalculatorUI.java).
Dhruv Kanetkar | 5/5 | Added main menu logic and object calling for the [converter]((https://github.com/Altoid0/CalculatorUI/blob/master/src/view/ConverterUI.java)) and [calculator](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/CalculatorUI.java). I also made the [drop down menu](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/MainMenu.java#L58) for the suite. For the [calculator](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/CalculatorUI.java), I added the logic for: [Multiply](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/CalculatorUI.java#L343), [Divide](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/CalculatorUI.java#L366), and [Modulus](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/CalculatorUI.java#L389). Changed the layout look for the calculator look by changing the color palette. 
Tanay Shah | 5/5 | I abstracted the [model component](https://github.com/Altoid0/CalculatorUI/blob/master/src/model/CalculatorModel.java) of the project from the [CalculatorUI](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/CalculatorUI.java) file and made it it's own file so that it could easily talk to the [control field](https://github.com/Altoid0/CalculatorUI/blob/master/src/control/MathCalc.java) and report to the [UI](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/CalculatorUI.java) in the form of an object. Worked with Dhruv S in figuring out how to make the [main menu bar](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/MainMenu.java). 
Dhruv Sengupta | 5/5 | I added the [GUI to converter](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/ConverterUI.java) and worked with everyone to center the [label text](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/ConverterUI.java#L62). Applied Tanay's business logic code and added it to the [button](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/ConverterUI.java#L91). Managed all the positions for the UI items in [all of the GUI's](https://github.com/Altoid0/CalculatorUI/tree/master/src/view). Worked with Tanay on the [main menu bar](https://github.com/Altoid0/CalculatorUI/blob/master/src/view/MainMenu.java#L48) by analyzing the code that was given to us to draw parallels between the projects and implement the parts that applied.  

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

