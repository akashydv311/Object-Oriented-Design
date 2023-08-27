package accessmodifers;

class Test {
    int data;

    public void showData() {
        System.out.println(this.data);
    }
}

// default access modifers props and methds access within the packages
public class DefaultExample {
    public static void main(String[] args) {

        Test t = new Test();
        t.data = 10;
        t.showData();

    }
}
