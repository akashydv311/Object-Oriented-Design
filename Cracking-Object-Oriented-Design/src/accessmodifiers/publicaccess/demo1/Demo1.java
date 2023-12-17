package accessmodifiers.publicaccess.demo1;

public class Demo1 {
    public static int myage;

    public static int getMyage() {
        return myage;
    }

    public static void setMyage(int myage) {
        Demo1.myage = myage;
    }
}
