public class Calculator {

    // Add method
    public int add(int a, int b int c) {
        return a + b + c;
    }

    // Subtract method
    public double subtract(double a, double b) {
        return a - b;
    }

    // Promqna direktno na servera
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divide method with check for zero promqna ot Gosho
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        return a / b;
    }
}
