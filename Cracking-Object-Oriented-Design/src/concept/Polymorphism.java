package concept;

class ICC {
    public void paymentLevel() {
        System.out.println("ICC not paying any money to the playes");
    }
}

class BCCI extends ICC {
    @Override
    public void paymentLevel() {
        System.out.println("BCCI paying to indian crickters");
    }
}

class PCB extends ICC {
    @Override
    public void paymentLevel() {
        System.out.println("PCB paying to pakistan crickters");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // polymorphism

        PCB pak = new PCB();
        BCCI ind = new BCCI();

        pak.paymentLevel();
        ind.paymentLevel();

    }
}
