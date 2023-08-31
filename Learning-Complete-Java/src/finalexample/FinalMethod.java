package finalexample;

// if i don't want to override my method from any other class then it should be final method

class Info {
    public final void password() {
        System.out.println("Password ");
    }

    public void username() {
        System.out.println("Username");
    }
}

class UseInfo extends Info {

    @Override
    public void username() {
        super.password();
        System.out.println("UseInfo- Username");
    }

    // public void password() {
    // System.out.println("UseInfo - password");
    // }
    // this is not possible because password method is final method in info class
}

public class FinalMethod {
    public static void main(String[] args) {
        UseInfo useinfo = new UseInfo();
        useinfo.password();
        useinfo.username();
    }
}
