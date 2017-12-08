class Triangle extends Shape{
    protected int aLength = 0;
    protected int bLength = 0;
    protected int cLength = 0;

    protected Triangle(int a, int b, int c){
        super(-5,(a+b+c),3,"Triangle");
        this.aLength = a;
        this.bLength = b;
        this.cLength = c;
    }
    protected Triangle(){
        super(3, "Triangle");
    }

}
