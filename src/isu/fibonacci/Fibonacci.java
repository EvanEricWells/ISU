package isu.fibonacci;

import TerminalIO.*;

public class Fibonacci {

    public static void main(String args[]) {
        KeyboardReader read = new KeyboardReader();
        int result;
        int value;
        System.out.print("Please Enter a number between 1 and 15: ");
        value = read.readInt();
        while (true) {
            if (value >= 1 && value <= 15) {
                result = fibonacci(value);
                break;
            } else {
                System.out.println("Incorrect Number must be between 1 and 15");
            }
            value = read.readInt();
        }
        System.out.println("The number is: " + result);

    }

    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
