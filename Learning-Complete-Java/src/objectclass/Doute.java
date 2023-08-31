package objectclass;

class Laptop {
    public String model;
    public int price;

    @Override
    public String toString() {
        return this.model + " " + this.price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Laptop other = (Laptop) obj;
        return this.price == other.price && this.model.equals(other.model);
    }
}

public class Doute {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.model = "swift-3";
        laptop1.price = 57000;

        Laptop laptop2 = new Laptop();
        laptop2.model = "swift-3";
        laptop2.price = 5700;

        boolean result = laptop1.equals(laptop2);

        System.out.println(result);
    }
}
