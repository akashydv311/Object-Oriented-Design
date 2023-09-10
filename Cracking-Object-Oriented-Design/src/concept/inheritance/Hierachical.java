package concept.inheritance;

class Father {
    private String fatherName;

    public Father(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

}

class Son extends Father {
    private String sonName;

    public Son(String fatherName, String sonName) {
        super(fatherName);
        this.sonName = sonName;
    }

    public String getSonName() {
        return sonName;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }

}

class Daughter extends Father {
    private String daughterName;

    public Daughter(String fatherName, String daughterName) {
        super(fatherName);
        this.daughterName = daughterName;
    }

    public String getDaughterName() {
        return daughterName;
    }

    public void setDaughterName(String daughterName) {
        this.daughterName = daughterName;
    }

}

public class Hierachical {
    public static void main(String[] args) {

        /*
         * ...father
         * .....|
         * _____|_____
         * | .........|
         * Son Daughter
         */

        Son son = new Son("Acer", "swift-3");

        Daughter dau = new Daughter("Dell", "XP");

        System.out.println(
                "Son Father Name -> " + son.getFatherName() + "\n" +
                        "Son Name -> " + son.getSonName() + "\n" +
                        "Daughter Father Name -> " + dau.getFatherName() + "\n" +
                        "Daughter Name -> " + dau.getDaughterName());
    }
}
