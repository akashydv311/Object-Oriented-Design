package exceptionexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester {
    public static void main(String[] args) throws IOException {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        try {
            System.out.print("enter 1st number: ");
            int num1 = Integer.parseInt(bf.readLine());

            System.out.print("enter 2nd number: ");
            int num2 = Integer.parseInt(bf.readLine());

            int result = num1 / num2;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Arthematice Exception @@@ devide by 0");
        } finally {
            bf.close();
            System.out.println("resourse closed!");
        }
        System.out.println("Thank You!");
    }
}
