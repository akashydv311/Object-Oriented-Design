package inputoutput;

public class Operators {
    public static void main(String[] args) {

        // Arthametic Oprators
        // + , -, *. / , % , ++ , --
        int ans1 = 10 + 10;
        int ans2 = 10 - 10;
        int ans3 = 10 * 10;
        int ans4 = 10 / 10;
        int ans5 = 10 % 10;

        // ++c per increment
        // c++ post increment
        // --c per decrement
        // c-- post decerement
        int ans6 = 10;
        int a1 = ans6++;
        int a2 = ans6--;
        int a3 = --ans6;
        int a4 = ++ans6;

        // Relactional Oprators
        // > , < , == , != , <= , >=
        int a = 10;
        int b = 20;
        boolean result1 = a > b;
        boolean result2 = a < b;
        boolean result3 = a == b;
        boolean result4 = a <= b;
        boolean result5 = a >= b;
        boolean result6 = a != b;

        // Logical Oprators
        // && , || , !
        boolean c1 = 23 > 45 && 89 < 76;
        boolean c2 = 56 > 89 || 89 < 999;
        boolean c3 = !(78 == 78);

        System.out.println("End...");

    }
}
