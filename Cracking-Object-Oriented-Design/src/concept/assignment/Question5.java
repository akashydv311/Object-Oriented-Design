package concept.assignment;

// cohishion?   
/*
 * Cohesion is a fundamental concept in software engineering and design 
 * that describes how closely the responsibilities and tasks of the elements within a module 
 * or component are related to each other. It is a measure of the strength of the relationship 
 * between the members (functions, methods, or variables) of a module or class. 
 * High cohesion is generally considered a desirable characteristic in software design because 
 * it leads to more maintainable, understandable, and reusable code.
 */

class CohesionExample {

    // Example of high cohesion (Functional Cohesion)
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.err.println("Division by zero!");
            return 0;
        }
    }

    // Example of low cohesion
    public void performMathOperation(int a, int b, String operation) {
        if (operation.equals("add")) {
            System.out.println("Result: " + add(a, b));
        } else if (operation.equals("subtract")) {
            System.out.println("Result: " + subtract(a, b));
        } else if (operation.equals("multiply")) {
            System.out.println("Result: " + multiply(a, b));
        } else if (operation.equals("divide")) {
            System.out.println("Result: " + divide(a, b));
        } else {
            System.err.println("Invalid operation");
        }
    }
}

public class Question5 {
    public static void main(String[] args) {

        CohesionExample example = new CohesionExample();

        // High cohesion: Performing individual math operations
        int resultAdd = example.add(5, 3);
        int resultSubtract = example.subtract(10, 2);
        int resultMultiply = example.multiply(4, 6);
        int resultDivide = example.divide(8, 2);

        System.out.println("Addition result: " + resultAdd);
        System.out.println("Subtraction result: " + resultSubtract);
        System.out.println("Multiplication result: " + resultMultiply);
        System.out.println("Division result: " + resultDivide);

        // Low cohesion: Using a generic method to perform math operations
        example.performMathOperation(7, 4, "add");
    }
}

// Conclusion:
// in general, loose coupling and high cohesion are considered best practices in
// software development