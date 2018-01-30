class Rectangle extends Shape{
    protected int aLength = 0;
    protected int bLength = 0;
    protected int cLength = 0;
    protected int dLength = 0;

    protected Rectangle(int a, int b, int c, int d){
        super((a*b),(a+b+c+d),4,"Rectangle");
        this.aLength = a;
        this.bLength = b;
        this.cLength = c;
        this.dLength = d;
    }
    protected Rectangle(){
        super(4, "Rectangle");
    }

}
