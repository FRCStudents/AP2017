class APLine{
    private int a;
    private int b;
    private int c;

    public APLine(int aa, int bb, int cc){
        a = aa;
        b = bb;
        c = cc;
    }

    public double getSlope(){
        return (double) -a/b;
    }

    public boolean isOnLine(int x, int y){
        if(((a * x) + (b * y) + c) == 0){
            return true;
        } else {
            return false;
        }
    }
}
