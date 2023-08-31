package objectclass;

// By default every class is a child class of object class

class Laptop {
    public String model;
    public int price;

    // i can override the toString method
    @Override
    public String toString() {
        return this.model + " " + this.price;
    }

    // Here i want to override the Object class equals method
    @Override
    public boolean equals(Laptop other) {
        if (this.model.equals(other.model) && this.price == other.price) {
            return true;
        } else {
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.model = "swift-3";
        laptop1.price = 57000;

        Laptop laptop2 = new Laptop();
        laptop2.model = "swift-3";
        laptop2.price = 5700;

        // boolean result = lap == newlap;
        boolean result = laptop1.equals(laptop2);

        System.out.println(result);

    }
}
