package week7.task2;

import java.io.FileNotFoundException;
import java.io.IOException;

class Animal {
}

class Bird extends Animal {
}

public class Task2 {
    public static void main(String[] args) {
        TestException testException = new TestException();

        // Test NullPointerException
        try {
            testException.testNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Error: NullPointerException.");
        }

        // Test ArrayIndexOfBoundException
        try {
            testException.testArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: ArrayIndexOutOfBoundsException.");
        }

        // Test ArithmeticException
        try {
            testException.testArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Error: ArithmeticException.");
        }

        // Test ClassCastException
        try {
            testException.testClassCastException();
        } catch (ClassCastException e) {
            System.out.println("Error: ClassCastException.");
        }

        // Test FileNotFoundException
        try {
            testException.testFileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println("Error: FileNotFoundException.");
        }

        // Test IOException.
        try {
            testException.testIOException();
        } catch (IOException e) {
            System.out.println("Error: IOException.");
        }
    }
}
