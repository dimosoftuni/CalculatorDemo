public class Calculator {

    // Add method ot DIMO lokalno
    public double add(double a, double b) {
        return a + b;
    }

    // Subtract method
    public double subtract(double a, double b) {
        return a - b;
    }

    // Promqna direktno na servera
    public double multiply(double a, double b, double c) {
        return a * b * c;
    }

    // Divide method with check for zero promqna ot Gosho
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        return a / b;
    }
}
