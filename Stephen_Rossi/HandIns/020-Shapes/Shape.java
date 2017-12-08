public class Shape{
    protected int area = 0;
    protected int perimiter = 0;
    protected int numberOfSides = 0;
    protected String shapeName = "Shape";

    protected Shape(int h, int w, int n, String name){
        this.area = h;
        this.perimiter = w;
        this.numberOfSides = n;
        this.shapeName = name;
    }
    protected Shape(int n, String name){
        this.numberOfSides = n;
        this.shapeName = name;
    }

    protected int getArea(){
        return this.area;
    }

    protected int getPerim(){
        return this.perimiter;
    }

    protected int getNumOfSides(){
        return this.numberOfSides;
    }
}
