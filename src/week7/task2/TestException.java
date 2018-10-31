package week7.task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestException {
    public void testNullPointerException() throws NullPointerException {
        String test = null;
        test.equals("Quang BKL");
    }

    public void testArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
        int[] tests = {1, 2, 3, 4, 5};
        int index = tests[10];
    }

    public void testArithmeticException() throws ArithmeticException {
        int test = 2 / 0;
    }

    public void testClassCastException() throws ClassCastException {
        Animal animal = new Animal();
        Bird bird = (Bird) animal;
    }

    public void testFileNotFoundException() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("src.txt");
    }

    public void testIOException() throws IOException {
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream("src/week7/task2/test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: FileNotFoundException.");
        }

        inputStream.close();
        inputStream.read();
    }
}