class Triangle{

    // attributes
    private int side1;
    private int side2;
    private int side3;

    // these are the constructors, which allows us to instantiate the objects with default values
    //
    // they have to have the same name as the class
    // the first one allows us to pass the starting side lengths to a new instance of Triangle
    // if we do not pass starting side lengths, the object will default to the second Triangle constructor and set the values equal to 5
    Triangle(int startingSide1, int startingSide2, int startingSide3){
        setSide1(startingSide1);
        setSide2(startingSide2);
        setSide3(startingSide3);
    }
    Triangle(){
        setSide1(5);
        setSide2(5);
        setSide3(5);
    }

    // getters and setters
    public void setSide1(int newSide1){
        side1 = newSide1;
    }
    public int getSide1(){
        return side1;
    }
    public void setSide2(int newSide2){
        side1 = newSide2;
    }
    public int getSide2(){
        return side2;
    }
    public void setSide3(int newSide3){
        side1 = newSide3;
    }
    public int getSide3(){
        return side3;
    }

    // other methods
    public int calculatePerimeter(){
        return side1 + side2 + side3;
    }
}
