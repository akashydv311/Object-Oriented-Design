package accessmodifers;

import methodoverloding.*;

class Example1 {

    protected void showConfig() {
        System.out.println("Configraction is done!");
    }

    void accessData() {
        System.out.println("Data is accessed!");
    }
}

public class ProtectedExample extends ExampleFileAccess {
    public static void main(String[] args) {

        Example1 ex = new Example1();

        ex.accessData();
        ex.showConfig();

        ExampleFileAccess protObj = new ExampleFileAccess();
        // protObj.age = 10;
        // protObj.showMsg();
        // protObj.showData();
        // protObj.showDataExample();
        // protObj.showConfig();
        // protObj.accessData();
    }
}
