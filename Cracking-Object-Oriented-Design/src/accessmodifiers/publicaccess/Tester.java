package accessmodifiers.publicaccess;

import demo1.Demo1;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // want to access myage from demo1 package

        int myage = demo1.myage;
    }
}
