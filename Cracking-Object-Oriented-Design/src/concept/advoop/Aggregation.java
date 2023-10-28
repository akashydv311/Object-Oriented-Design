package concept.advoop;

// Aggregation -> HAS A Relaction
class Bat {
    private int price;

    public Bat(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}

class Ball {
    private int price;

    public Ball(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}

class CricketKit {
    private int tex;
    private Ball ball;
    private Bat bat;

    public CricketKit(int tex, Ball ball, Bat bat) {
        this.tex = tex;
        this.ball = ball;
        this.bat = bat;
    }

    public int getTotalKitFare() {
        return ball.getPrice() + bat.getPrice() + getTex();
    }

    public int getTex() {
        return tex;
    }

    public void setTex(int tex) {
        this.tex = tex;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Bat getBat() {
        return bat;
    }

    public void setBat(Bat bat) {
        this.bat = bat;
    }

}

public class Aggregation {
    public static void main(String[] args) {

        Ball bal = new Ball(400);

        Bat bat = new Bat(2500);

        CricketKit kit = new CricketKit(35, bal, bat);

        int totalefare = kit.getTotalKitFare();

        System.out.println(totalefare);

        // System.out.println(kit.getBall().getPrice());
    }
}
