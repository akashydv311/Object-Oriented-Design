package strings;

public class Main {
    public static void main(String[] args) {
        // Strings in java is a class dues: we can make obj or direct

        // String litrals
        String name = "Microsoft";
        // System.out.println(name);

        // String obj
        String compney = new String("Google");
        System.out.println(compney);
        // System.out.println(compney.hashCode());

        // We can print string with + by concating

        // String methods

        compney.charAt(3);
        String updateCompney = compney.concat(" India");
        System.out.println(compney + " " + updateCompney);

        System.out.println(updateCompney.substring(4, updateCompney.length()));

        String[] parts = updateCompney.split(" ");
        System.out.println(parts[0] + " " + parts[1]);

        questionSol("I am working in Google!");

    }

    public static void questionSol(String sentance) {
        // revers the string
        String[] strArr = sentance.split(" ");
        String finalStr = "";

        for (int i = strArr.length - 1; i >= 0; --i) {
            finalStr += strArr[i] + " ";
        }
        System.out.println(finalStr);
    }
}
