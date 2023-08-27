package inheritance;

class Calculator {

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

public class SingleInheritance {
    public static void main(String[] args) {

        // single inheritance
        AdvanceCalculator advcal = new AdvanceCalculator();

        int div = advcal.div(23, 45);
        int add = advcal.add(23, 67);
        double power = advcal.power(56, 3);

        System.out.println(div + " " + add + " " + power);
    }
}
