package week7.task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

class Animal {
}

class Bird extends Animal {
}

public class Task2 {
    public static void main(String[] args) {
        // Test NullPointerException
        try {
            String test = null;
            test.equals("Quang BKL");
        } catch (NullPointerException e) {
            System.out.println("Error: NullPointerException.");
        }

        // Test ArrayIndexOfBoundException
        try {
            int[] tests = {1, 2, 3, 4, 5};
            int index = tests[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: ArrayIndexOutOfBoundsException.");
        }

        // Test ArithmeticException
        try {
            int test = 2 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: ArithmeticException.");
        }

        // Test ClassCastException
        try {
            Animal animal = new Animal();
            Bird bird = (Bird) animal;
        } catch (ClassCastException e) {
            System.out.println("Error: ClassCastException.");
        }

        // Test FileNotFoundException
        try {
            InputStream inputStream = new FileInputStream("src.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: FileNotFoundException.");
        }

        // Test IOException.
        try {
            InputStream inputStream = new FileInputStream("src/week7/task2/test.txt");
            inputStream.close();
            inputStream.read();
        } catch (FileNotFoundException e) {
            System.out.println("Error: FileNotFoundException.");
        } catch (IOException e) {
            System.out.println("Error: IOException.");
        }
    }
}
