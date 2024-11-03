public class Main {

    public static void main(String[] args) {
        int outerVariable = 10; // This is a local variable in main method
        System.out.println("Outer variable in main: " + outerVariable);

        // Calling methods to demonstrate local variables
        calculateSum(5, 10);
        printMessage("Hello, Java!");

        // Local variable inside a for loop
        for (int i = 0; i < 3; i++) {
            String loopMessage = "Loop iteration " + i;
            System.out.println(loopMessage);
        }
        // loopMessage variable is not accessible here, only valid inside the for loop
    }

    // Method to calculate sum of two numbers and print it
    public static void calculateSum(int num1, int num2) {
        int sum = num1 + num2; // sum is a local variable in calculateSum method
        System.out.println("Sum: " + sum);
    }

    // Method to print a message
    public static void printMessage(String message) {
        String prefix = "Message: "; // prefix is a local variable in printMessage method
        System.out.println(prefix + message);
    }
}