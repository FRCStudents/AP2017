import java.util.*;

class Rectangle extends Shape {
    public Rectangle(int s1, int s2, int s3, int s4) {
        super();
        setSideLength(0, s1);
        setSideLength(1, s2);
        setSideLength(2, s3);
        setSideLength(3, s4);
    }

    public String toString() {
        return "Rectangle: " + sideLengths.get(0) + ", " + sideLengths.get(1) + ", " + sideLengths.get(2) + ", " + sideLengths.get(3);
    }
}