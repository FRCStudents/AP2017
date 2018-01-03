class ShaylaDriver {
    public static void everyOther(){
        }

    public static void everyOther2(int x){
        }


    public static void main(String [] argv){
        Shayla s = new Shayla();
        s.setShaylaArr1(2, "Shayla");
        for(int i=0; i < 4; i++){
            System.out.println(s.getShaylaArr1(i));
        }
        s.setShaylaArr1(0,"My");
        s.setShaylaArr1(1,"Dog");
        s.setShaylaArr1(2,"Has");
        s.setShaylaArr1(3,"A Ukelele");
    }
}
