JavaLocalVariablesExample

This project demonstrates the concept of local variables in Java, highlighting their scope within methods and code blocks. Local variables are only accessible within the block or method in which they are defined, making them essential for managing scope and memory efficiently.
Project Structure

    JavaLocalVariablesExample.java: Contains the main method, two example methods (calculateSum and printMessage), and a for loop to illustrate the scope of local variables.

Code Overview
Key Methods and Variables

    main Method
        Local Variable: outerVariable - an integer defined in main and only accessible within main.
        For Loop Local Variable: i - a loop counter variable, and loopMessage - a string defined within the loop and accessible only inside the loop.

    calculateSum(int num1, int num2)
        Local Variables:
            num1 and num2 - parameters passed to the method, only accessible within calculateSum.
            sum - a variable that stores the result of num1 + num2 and is only accessible within this method.

    printMessage(String message)
        Local Variables:
            message - a parameter passed to the method.
            prefix - a string variable that is concatenated with message to produce the final output, only accessible within printMessage.

Usage

Compile and run the program with the following commands:

    javac JavaLocalVariablesExample.java
    java JavaLocalVariablesExample

Expected output:

    Outer variable in main: 10
    Sum: 15
    Message: Hello, Java!
    Loop iteration 0
    Loop iteration 1
    Loop iteration 2

Key Concepts

    Local Variables: Variables declared within a method or block are only accessible within that scope.
    Method Scope: Variables like sum and prefix are not accessible outside their respective methods.
    Block Scope: Variables declared within loops or conditional blocks are limited to that specific block.

Author

This project serves as an educational example to explain the scope of local variables in Java methods and code blocks.
