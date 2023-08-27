package strings;

/*
StringBuffer: StringBuffer is mutable, meaning you can modify its content after creation. It's designed to be thread-safe by providing synchronized methods, which makes it suitable for multi-threaded environments where multiple threads might access and modify the same instance concurrently.

StringBuilder: StringBuilder is also mutable, but unlike StringBuffer, it's not thread-safe. It doesn't provide synchronized methods, which makes it more efficient in single-threaded scenarios, but it's not recommended for use in multi-threaded applications.


In Short

* StringBuffer is Thread Safe and StringBuilder is not
* StringBuffer is for Multi Thread apps and StringBuilder is for Single
 */

public class MutableString {

    // We can make String mutable in java by using StringNuilder/Buffer classes
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("google");
        // System.out.println(sb.capacity());
        StringBuffer newStr = sb.append(" java");

        System.out.println(sb.hashCode() + " " + newStr.hashCode());

        sb.deleteCharAt(0);

        System.out.println(sb);
        System.out.println(newStr);

        System.out.println(sb.hashCode() + " " + newStr.hashCode());

        // methods of string buffer

        StringBuffer sb1 = new StringBuffer("Java");
        sb1.setLength(30);
        System.out.println(sb1.length());
        System.out.println(sb1.charAt(22));

        // Convert String buffer or StringBuilder into string

        String h1 = sb.toString();
        sb1.toString();

        System.out.println(sb.getClass());
        System.out.println(sb1.getClass());

        System.out.println(String.class);
        System.out.println(String.class);

        System.out.println(h1.getClass());

        // String Builder

        StringBuilder sbx = new StringBuilder("Amazon");

        System.out.println(sbx.capacity());
        System.out.println(sbx.getClass());
        System.out.println(sbx);

        System.out.println("End..");

    }
}
