package accessmodifiers.protectedaccess.package2;

import accessmodifiers.protectedaccess.package1.*;

public class Male extends Human {

    public void maleDemo() {
        // simpley taking values
        String humanName = this.humanName; //
        System.out.println(humanName);

        this.humanName = "Narayan"; // public allow -> modification of data

        String personalThings = this.personalThings;
        System.out.println(personalThings);

        this.personalThings = "Nothing!"; // protected allow -> modification of data

        // ***********************************************************
        /*
         * Human h = new Human();
         * h.setPersonalThings("some things");
         * h.personalThings = "xyz";
         * 
         * However, direct access to a protected method through an object of its
         * class in a different package is not permitted by the language specification.
         * The idea behind this is to maintain encapsulation and prevent external
         * classes
         * from arbitrarily accessing and invoking protected methods.
         * 
         */
        // **********************************************************

        setPersonalThings("Nothing!!!!");

        Male m = new Male();
        m.setPersonalThings("some things");
        m.personalThings = "xyz";

    }
}
