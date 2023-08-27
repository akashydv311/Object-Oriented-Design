package inheritance;

class Calculator extends Object {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }
}

class AdvanceCalculator extends Calculator {

    public int multi(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        if (num1 > num2)
            return num1 / num2;
        else
            return num2 / num1;
    }

    public double power(int num1, int num2) {
        return Math.pow(num1, num2);
    }
}

class MyCalculator {

    public int mod(int num1, int num2) {
        if (num1 > num2)
            return num1 % num2;
        else
            return num2 % num1;
    }

}

public class MultilevelInheritance {
    public static void main(String[] args) {

        // Multilevel Inheritance
        MyCalculator cal = new MyCalculator();

        int mod = cal.mod(23, 2);
        System.out.println(mod);
    }
}
