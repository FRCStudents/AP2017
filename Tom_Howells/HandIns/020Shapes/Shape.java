import java.util.*;

class Shape {
    protected int sides;
    protected ArrayList sideLengths = new ArrayList<Integer>();

    protected Shape() {
        this.sides = 3;
        this.sideLengths = new ArrayList<Integer>();
    }
    protected Shape(int s) {
        this.sides = s;
        this.sideLengths = new ArrayList<Integer>();
    }

    protected void setSides(int s) {
        this.sides = s;
        this.sideLengths = new ArrayList<Integer>();
    }

    protected void setSideLength(int side, int length) { //side zero relative
        try {
            this.sideLengths.set(side, length);
        }
        catch (Exception e) { // will only not work if array isn't long enough
            this.sideLengths.add(length);
        }
    }

    protected int getPerimeter() {
        int temp = 0;
        for (int i = 0; i < this.sideLengths.size(); i++) {
            temp += (int)this.sideLengths.get(i);
        }
        return temp;
    }
}