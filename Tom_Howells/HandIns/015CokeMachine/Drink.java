import java.util.*;

class Drink {
    private String name;
    private double cost;
    private int num; //for amount in machine

    public Drink() {
        name = "";
        cost = 1.00;
        num = 0;
    }

    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }

    public void setCost(double c) {
        cost = c;
    }
    public double getCost() {
        return cost;
    }

    public void setNum(int n) {
        num = n;
    }
    public int getNum() {
        return num;
    }

    public String toString() {
        return name;
    }
}