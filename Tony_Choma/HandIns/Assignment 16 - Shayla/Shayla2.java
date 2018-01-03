class Shayla2 {
    String[][] shaylaArr1 = new String[4][5];
    int[][] shaylaArr2 = new int[4][5];

    public Shayla2(){
        initShaylaArr1("Thing");
        initShaylaArr2(0);
    }

    private void initShaylaArr1(String s){
        for(int i=0; i < shaylaArr1.length; i++){
            for(int j=0; j < shaylaArr1[i].length; j++){
                shaylaArr1[i][j] = s;
            }
        }
    }

    private void initShaylaArr2(int n){
        for(int i=0; i < shaylaArr2.length; i++){
            for(int j=0; j < shaylaArr2[i].length; j++){
                shaylaArr2[i][j] = n;
            }
        }
    }

    // this function is WRONG!
    public void setShaylaArr1(int i, String s){
        //shaylaArr1[i] = s;
    }

    // this function is WRONG!
    public String getShaylaArr1(int i){
        //return shaylaArr1[i];
    }

    public void showShaylaArr1(){
         for(int i = 0;i < shaylaArr1.length; i++){
                 for(int j = 0; j < shaylaArr1.length; j++){
                         System.out.println(shaylaArr1[i][j] + " | ");
                 }
         }
    }

    public void showShaylaArr2(){
        for (int i = 0; i < shaylaArr2.length; i++) {
                for (int j = 0; j < shaylaArr2.length; j++) {
                        System.out.println(shaylaArr2[i][j] + " | ");
                }

        }
    }
}
