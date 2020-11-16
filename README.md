# Calculator GUI
An advanced calculator with a GUI. Made in Java using IntelliJ. Git is being used for version control. Contributions are on the bottom of README.

## Project Credits
Contributor | GitHub Link | Journal Links
----------- | ----------- | -------------
Gautam Gupta | [@batman084](https://github.com/batman084) | [Gautam & Dhruv K Journal](https://docs.google.com/document/d/1osVup_6HvE5lw1XQpkgtVvuoJ3UzDAUcrKXfVWIOTCY/edit?usp=sharing)
Tanay Shah | [@Altoid0](https://github.com/Altoid0) | [Tanay & Dhruv S Journal](https://docs.google.com/document/d/1NovjIb66AfVZmsY1ekfZDwx8gZQbw61LDGB21bSS2QE/edit?usp=sharing)
Dhruv Kanetkar | [@DhruvK0](https://github.com/DhruvK0) | [Gautam & Dhruv K Journal](https://docs.google.com/document/d/1osVup_6HvE5lw1XQpkgtVvuoJ3UzDAUcrKXfVWIOTCY/edit?usp=sharing)
Dhruv Sengupta | [@DaHippoBear](https://github.com/DaHippoBear) | [Tanay & Dhruv S Journal](https://docs.google.com/document/d/1NovjIb66AfVZmsY1ekfZDwx8gZQbw61LDGB21bSS2QE/edit?usp=sharing)

## Week 10 - Pair Share Mastery
Contributor | Journal Link
----------- | ---------------------------------------------
Dhruv S & Tanay  | [Tanay & Dhruv S Journal](https://docs.google.com/document/d/1NovjIb66AfVZmsY1ekfZDwx8gZQbw61LDGB21bSS2QE/edit?usp=sharing)
Dhruv K & Gautam |  [Gautam & Dhruv K Journal](https://docs.google.com/document/d/1osVup_6HvE5lw1XQpkgtVvuoJ3UzDAUcrKXfVWIOTCY/edit?usp=sharing) 
  

## How to run our code?
Prerequisites: 
- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- IntelliJ

You will need to pull out code down and view it in IntelliJ. Follow this document for instructions on how to run out code: [Code Instructions](https://docs.google.com/document/d/1yZMZCIHzIUx_sKJ-uUAaJKMJXkuuMoprFAGDZGbFyNE/edit?usp=sharing)

## Calculator Functions
![](https://github.com/Altoid0/CalculatorUI/blob/master/assets/HierarchyFlowchart_V3.png)
We have created multiple sub-projects in our CalculatorUI: 
- Scientific Calculator   
A basic scientific calculator with basic math, log, exponents, and modulus operators  
- Derivative Calculator   
A calculator that calculates the derivative using power rule    
- Physics Converter   
A physics converter that uses the kinematic equations and solves for the missing variable   
- Converter  
A converter for cryptography, units, and temperature  
- Free Text Calculator  
A free text calculator totally in the terminal. Has all the same functions as the GUI calculator  

### Scientific Calculator
Function Name | Description | How it is done
------------- | ----------- | --------------
Basic Math Operation (Addition/Subtraction/Multiplication/Division) | Additions, Subtraction, Multiplication, or Division of the numbers that the user selects | The user clicks on buttons on the GUI for the numbers and also selects an operator button on the GUI. The operator happens on the arguments and the answer is displayed on the text-field on the top.
Log | Base 10 logarithm of an argument | The user clicks on a number button followed by the log button to indicate that the user wants to take a base 10 logarithm of the number the user clicks on.
Exponents | Raise a base to the power | The user selects the base number first and then the exponent button (the upward arrow) and then selects the power the user wants to raise the base to. 
Modulus | Get the remainder when dividing two numbers | The user selects the numerator of the fraction and then the modulus operator, followed by the denominator of the fraction. The modulus function will return the remainder of the fraction. 
Trig (sin, cos, tan) | Get a trig function of an argument | The user selects a number to be inputted into one of the three trig functions (sin, cos, tan). The trig function math is all in degrees.
Square Root | Get the square root of an argument | The user selects a number to be inputted into a square root and the output is displayed on the text field.  

#### Calculator Demo
![](https://github.com/Altoid0/CalculatorUI/blob/master/assets/CalculatorDemo.gif)  

### Converter
Function Name | Description | How it is done
------------- | ----------- | --------------
Celsius to Fahrenheit | Converting the celsius degrees that the user inputs to fahrenheit | The user enters a celsius temperature in the text field on the top of the screen and then clicks convert. The result label on the bottom then changes to display that fahrenheit temperature calculated from the equation ((Celsius x 9/5) + 32)  
Feet to Inches | Converting the feet input to inches | The user enter a feet value into the text field on the top of the screen and then clicks convert. The result label on the bottom then changes to display the inches calculated from the equation (ft * 12)
Hex to Decimal | Converts hex input to decimal output | The user enters in a hex value and then selects convert. A pre-made java function converts hex to binary and and puts the result in the text field
Decimal to Hex | Converts decimal input to hex output | The user enters in a decimal value and then selects convert. A pre-made java function converts decimal to hex and and puts the result in the text field
Inches to Centimeters | Converts inches input to centimeter output | The user enters in a inches value and then selects convert. The result label on the bottom then changes to display  the centimeters from the equation (in * 2.54)
Centimeters to Inches | Converts centimeters input to inches output | The user enters in a centimeter value and then selects convert. The result label on the bottom then changes to display the inches from the equation (cm/2.54)


#### Temperature Converter Demo
![](https://github.com/Altoid0/CalculatorUI/blob/master/assets/ConverterDemo.gif)  

### Derivative Calculator
Function Name | Description | How it is done
------------- | ----------- | --------------
Derivative Calculator | Calculate a simple derivative using power rule | The user enters in the coefficient and the power to be used. The coefficient is multiplied by the power and one is subtracted from the power. 

#### Derivative Demo
![](https://github.com/Altoid0/CalculatorUI/blob/master/assets/DerivativeCalc.gif)   

### Physics Converter
Function Name | Description | How it is done
------------- | ----------- | --------------
Kinematic Equation Solver | Solve for a physics variable from the Big 4 Kinematic equations based on what variable the user wants to solve for | The user selects what variable they want to solve for and then enter in all the variables except for the one variable that is missing from each equation. Based on what variable is missing, the code chooses to use an equation. The answer is then shown in the Answer field. 

#### Physics Demo
![](https://github.com/Altoid0/CalculatorUI/blob/master/assets/PhysicsDemo.gif)   

## Code in Progress
These are all the sub-projects that we are working on currently:  
- All of the work for this week is finished and we are all caught up for next week!

## Future Features to Add
Throughout the course of his project, we want to add more and more features to make the best calculator possible.  
Here is a list of all the new features we want to add:    
1. Encoding Converter (Enhance MVC)  
    Goal: Complete Week 10  
    Assignment: Tanay  
2. Beat Maker (Music)  
    Goal: Complete Week 10  
    Assignment: Dhruv S  
