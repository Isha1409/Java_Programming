public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        // Test cases
        System.out.println(divideNumbers(10, 2));  // Should print the result of the division
        System.out.println(divideNumbers(10, 0));  // Should handle division by zero
        System.out.println(divideNumbers(10, "a"));  // Should handle wrong input type
    }

    // Method to divide two numbers
    public static String divideNumbers(int a, Object b) {
        try {
            // Check if the second input is an integer
            if (!(b instanceof Integer)) {
                throw new IllegalArgumentException("Both inputs must be numbers!");
            }

            // Perform division
            int result = a / (Integer) b;
            return "The result is " + result;
        } catch (ArithmeticException e) {
            return "Error: Cannot divide by zero!";
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
