package strings;

public class ImmutableString {

    // Mutable means -> changable
    // Immutable means -> Not chnagable

    // By default Strings are immutable in java
    public static void main(String[] args) {

        String name1 = "Microsoft";
        String newName1 = name1 + " .Net"; // name1.concat(" .Net");
        System.out.println(name1.hashCode() + " " + newName1.hashCode());

        String compney1 = new String("Google");
        String newCompney1 = compney1 + " java"; // compney1.concat(" java");
        System.out.println(compney1.hashCode() + " " + newCompney1.hashCode());
    }
}
