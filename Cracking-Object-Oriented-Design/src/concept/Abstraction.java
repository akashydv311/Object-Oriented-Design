package concept;

/*
 In object-oriented programming, abstraction is one of three central principles (along with encapsulation and inheritance). Through the process of abstraction, a programmer hides all but the relevant data about an object in order to reduce complexity and increase efficiency. 
 */

// inheritance
class ParentTester2 {
    private String compneyName;
    private String compneyType;

    public String getCompneyName() {
        return compneyName;
    }

    public ParentTester2(String compneyName, String compneyType) {
        this.compneyName = compneyName;
        this.compneyType = compneyType;
    }

    public void setCompneyName(String compneyName) {
        this.compneyName = compneyName;
    }

    public String getCompneyType() {
        return compneyType;
    }

    public void setCompneyType(String compneyType) {
        this.compneyType = compneyType;
    }

}

// encapsulation
class Tester2 extends ParentTester2 {
    private String empNo;
    private int salary;

    public Tester2(String compneyName, String compneyType, String empNo, int salary) {
        super(compneyName, compneyType);
        this.empNo = empNo;
        this.salary = salary;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

public class Abstraction {
    public static void main(String[] args) {

        // create object of child class and access all the complex fectures
        Tester2 t2 = new Tester2("Infosys", "Service", "xyz0123", 1_0);

        System.out.println(
                "Compney name -> " + t2.getCompneyName() + "\n" +
                        "Compney Type -> " + t2.getCompneyType() + "\n" +
                        "Employee ID -> " + t2.getEmpNo() + "\n" +
                        "Employee Salary -> " + t2.getSalary());
    }
}
