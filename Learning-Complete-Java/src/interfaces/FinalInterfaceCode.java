package interfaces;

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Code -> compile -> run ");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code -> compile -> run : faster");
    }
}

public class FinalInterfaceCode {
    public static void main(String[] args) {

        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        laptop.code();
        desktop.code();
    }
}
