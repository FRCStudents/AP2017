import java.util.*;

class Pentagon extends Shape {
    public Pentagon(int s1, int s2, int s3, int s4, int s5) {
        super();
        setSideLength(0, s1);
        setSideLength(1, s2);
        setSideLength(2, s3);
        setSideLength(3, s4);
        setSideLength(4, s5);
    }

    public String toString() {
        return "Pentagon: " + sideLengths.get(0) + ", " + sideLengths.get(1) + ", " + sideLengths.get(2) + ", " + sideLengths.get(3) + ", " + sideLengths.get(4);
    }
}