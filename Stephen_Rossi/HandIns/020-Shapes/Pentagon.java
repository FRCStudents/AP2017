class Pentagon extends Shape{
    protected int aLength = 0;
    protected int bLength = 0;
    protected int cLength = 0;
    protected int dLength = 0;
    protected int eLength = 0;

    protected Pentagon(int a, int b, int c, int d, int e){
        super(-5,(a+b+c+d+e),5,"Pentagon");
        this.aLength = a;
        this.bLength = b;
        this.cLength = c;
        this.dLength = d;
        this.eLength = e;
    }
    protected Pentagon(){
        super(5, "Pentagon");
    }

}
