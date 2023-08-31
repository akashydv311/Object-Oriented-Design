package accessmodifers;

import requiredfiles.Mammal;

public class Main {
    public static void main(String[] args) {

        /*
         * Public -> accessible from anyware ( project level)
         * Protected ->
         */

        // Protected example
        Mammal dog = new Mammal("Dog");
        dog.move();
        // dog.movePro();
        // dog.eat();

    }
}
