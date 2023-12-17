package accessmodifiers.protectedaccess.package1;

public class Human {
    public String humanName;
    private int humanAge;
    protected String personalThings;

    public Human() {

    }

    public Human(String humanName, int humanAge, String personalThings) {
        this.humanName = humanName;
        this.humanAge = humanAge;
        this.personalThings = personalThings;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public int getHumanAge() {
        return humanAge;
    }

    public void setHumanAge(int humanAge) {
        this.humanAge = humanAge;
    }

    protected String getPersonalThings() {
        return personalThings;
    }

    protected void setPersonalThings(String personalThings) {
        this.personalThings = personalThings;
    }

}

class TestProtected {

    public void test() {

        Human h1 = new Human();

        h1.humanName = "jon";
        h1.personalThings = "Nothing";

    }
}
