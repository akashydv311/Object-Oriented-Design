package concept.inheritance;

interface A {
    public String compneyName = "Infosys";

    public String getCompneyName();
}

class Aimpliment {

}

class B {
    private String empName;
    private int empAge;

    public B(String empName, int empAge) {
        this.empName = empName;
        this.empAge = empAge;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

}

class C extends B implements A {
    private String currentCompneyName;

    public C(String empName, int empAge) {
        super(empName, empAge);
        this.currentCompneyName = getCompneyName();
    }

    public String getCompneyName() {
        return compneyName;
    }

    public String getCurrentCompneyName() {
        return this.currentCompneyName;
    }
}

public class Multipal {
    public static void main(String[] args) {

        // implimenting the multipal inheritance in java

        C child = new C("Terian", 19);

        System.out.println(
                "Current Comp Name-> " + child.getCurrentCompneyName() + "\n" +
                        "Employee Name -> " + child.getEmpName() + "\n" +
                        "Employee Age-> " + child.getEmpAge());
    }
}
