class Coffeecup {
    private double price;
    private int num;
    private String color;

    public Coffeecup (String c, double p, int n) {
        color = c;
        price = p;
        num = n;
    }

    public Coffeecup() {
        color = "White";
        price = 1.25;
        num = 3;
    }

    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
    public int getNum() {
        return num;
    }
}