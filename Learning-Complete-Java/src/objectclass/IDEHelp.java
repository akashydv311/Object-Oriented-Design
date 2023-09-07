package objectclass;

class Laptopt {
    public String model;
    public int price;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptopt other = (Laptopt) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // // Here i want to override the Object class equals method
    // @Override
    // public boolean equals(Object obj) {
    // Laptop other = (Laptop) obj;
    // return this.model.equals(other.model) && this.price == other.price;
    // }

}

public class IDEHelp {
    public static void main(String[] args) {
        Laptopt laptop3 = new Laptopt();
        laptop3.model = "swift-3";
        laptop3.price = 57000;

        Laptopt laptop4 = new Laptopt();
        laptop4.model = "swift-3";
        laptop4.price = 57000;

        // boolean result = lap == newlap;
        boolean result = laptop3.equals(laptop4);

        System.out.println(result);
    }
}
