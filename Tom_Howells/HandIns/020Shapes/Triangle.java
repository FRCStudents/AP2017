import java.util.*;

class Triangle extends Shape {
    public Triangle(int s1, int s2, int s3) {
        super();
        setSideLength(0, s1);
        setSideLength(1, s2);
        setSideLength(2, s3);
    }

    public String toString() {
        return "Triangle: " + sideLengths.get(0) + ", " + sideLengths.get(1) + ", " + sideLengths.get(2);
    }
}