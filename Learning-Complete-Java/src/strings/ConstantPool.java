package strings;

public class ConstantPool {
    public static void main(String[] args) {
        // String constant | Litral
        String name1 = "Microsoft";
        String name2 = "Microsoft";

        System.out.println(name1.hashCode() + " " + name2.hashCode());

        String compney1 = new String("Google");
        String compney2 = new String("Google");

        System.out.println(name1.hashCode() + " " + name2.hashCode());

        // Note :- If the string is same then it's store in string pool area

    }
}
