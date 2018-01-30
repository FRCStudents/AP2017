import java.util.*;

class GoShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Triangle(5, 2, 4);
        shapes[1] = new Rectangle(7, 3, 5, 1);
        shapes[2] = new Pentagon(7, 7, 7, 7, 7);

        System.out.println(shapes[0] + " |" + shapes[0].getPerimeter() + "|");
        System.out.println(shapes[1] + " |" + shapes[1].getPerimeter() + "|");
        System.out.println(shapes[2] + " |" + shapes[2].getPerimeter() + "|");
    }
}