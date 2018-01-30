class Product {
    private String type;
    private String color;
    private double price;
    private int num;

    public Product (String t, String c, double p, int n) {
        type = t;
        color = c;
        price = p;
        num = n;
    }

    public Product() {
        type = "Coffeecup";
        color = "White";
        price = 1.25;
        num = 3;
    }

    public String getType() {
        return type;
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

    public String toString() {
        return color + " " + type;
    }
}