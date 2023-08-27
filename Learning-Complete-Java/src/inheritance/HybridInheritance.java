package inheritance;

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

interface Color {
    void setColor(String color);
}

class ColoredCircle extends Circle implements Color {
    private String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        ColoredCircle coloredCircle = new ColoredCircle();
        coloredCircle.setColor("Red");
        coloredCircle.draw();
        coloredCircle.displayInfo();
    }
}
