import java.util.Scanner;  // Import Scanner

class TestArithmetic {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter first number");
        int x1 = console.nextInt();
        System.out.println("Enter second number");
        int x2 = console.nextInt();
        System.out.println("Enter third number");
        int x3 = console.nextInt();
        Arithmetic ar = new Arithmetic();

        int answer1 = ar.sum(x1, x2);
        int answer2 = ar.sum(x1, x2, x3);
        int answer3 = ar.subtract(x1, x2);  // Corrected method name
        double answer4 = ar.divide(x1, x2);
        int answer5 = ar.modulus(x2, x3);   // Corrected method name
        int answer6 = ar.multiply(x2, x3);
        int answer7 = ar.largest(x1, x2, x3);
        boolean evenNumber1 = ar.isEvenNumber(x2);
        boolean evenNumber2 = ar.isEvenNumber(x3);

        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);
        System.out.println("x3=" + x3);

        System.out.println("Sum of x1 and x2 is " + answer1);
        System.out.println("Sum of x1, x2, x3 is " + answer2);
        System.out.println("Subtraction of x1 and x2 is " + answer3);
        System.out.println("Division of x1 and x2 is " + answer4);
        System.out.println("Modulus division of x2 and x3 is " + answer5);
        System.out.println("Multiplication of x2 and x3 is " + answer6);
        System.out.println("Largest value among x1, x2 and x3 is " + answer7);

        if (evenNumber1)
            System.out.println("x2 is an even number");
        else
            System.out.println("x2 is an odd number");

        if (evenNumber2)
            System.out.println("x3 is an even number");
        else
            System.out.println("x3 is an odd number");

        console.close(); // Close Scanner to avoid resource leak
    }
}



class Arithmetic {
    
    // Method to find the sum of two numbers
    public int sum(int a, int b) {
        return a + b;
    }
    
    // Method to find the sum of three numbers
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }
    
    // Method to divide two numbers (returns NaN if divisor is zero)
    public double divide(int a, int b) {
        if (b == 0) {
            return Double.NaN; // Return NaN instead of throwing an exception
        }
        return (double) a / b;
    }
    
    // Method to find the modulus (remainder) of two numbers
    public int modulus(int a, int b) {
        return a % b;
    }
    
    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Method to find the largest among three numbers
    public int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    
    // Method to check if a number is even
    public boolean isEvenNumber(int a) {
        return a % 2 == 0;
    }
}
