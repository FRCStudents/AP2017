
/*
 * BinLogicDriver.java
 */

class BinLogicDriver {

  public static void run(){
    boolean i1, i2;
    BinLogic bl;
    i1 = true; i2 = true;

    bl = new BinLogic(i1, i2);

    for(int i=0; i < 2; i++){
      for(int j=0; j<2; j++){
        System.out.println("*********************");
        if(i < 1) i1 = false;
        else      i1 = true;
        if(j < 1) i2 = false;
        else      i2 = true;
        bl.printAND(i1, i2);
        bl.printNAND(i1, i2);
        bl.printOR(i1, i2);
        bl.printNOR(i1, i2);
        bl.printXOR(i1, i2);
      }
    }
  }

  public static void play(){
    boolean i1, i2;
    BinLogic bl;
    i1 = true; i2 = true;

    bl = new BinLogic(i1, i2);
    bl.printAND(bl.AND(i1, i2), bl.OR(i1,i2));
  }

  public static void main(String [] argv){
    run();
    System.out.println("=============================");
    play();
  }
}
