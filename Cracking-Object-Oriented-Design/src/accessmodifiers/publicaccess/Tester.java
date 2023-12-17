package accessmodifiers.publicaccess;

import accessmodifiers.publicaccess.demo1.*;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // want to access myage from demo1 package

        int myage = Demo1.myage;
        System.out.println(myage);
    }
}
