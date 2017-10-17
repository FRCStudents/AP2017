/*
 * Binary Logic
 */

class BinLogic {
    boolean input01;
    boolean input02;
    boolean output01;
    boolean output02;

    BinLogic(boolean i01, boolean i02){
      input01 = i01;
      input02 = i02;
    }

    BinLogic(){
      this(false, false);
    }

    public boolean AND(){
      return input01 && input02;
    }

    public boolean AND(boolean i01, boolean i02){
      return i01 && i02;
    }

    boolean OR(){
      return input01 || input02;
    }

    boolean OR(boolean i01, boolean i02){
      return i01 || i02;
    }

    boolean XOR(){
      if((input01 || input02) && !(input01 && input02)) return true;
      return false;
    }

    boolean XOR(boolean i01, boolean i02){
      if((i01 || i02) && !(i01 && i02)) return true;
      return false;
    }

    boolean NAND(){
      if(AND()) return false;
      return true;
    }

    boolean NAND(boolean i01, boolean i02){
      if(AND(i01, i02)) return false;
      return true;
    }

    boolean NOR(){
      if(OR()) return false;
      return true;
    }

    boolean NOR(boolean i01, boolean i02){
      if(OR(i01, i02)) return false;
      return true;
    }

    void printAND(){
      System.out.println("AND: (" + input01 + ", " + input02 + ") \t" + AND());
    }

    void printOR(){
      System.out.println("OR:  (" + input01 + ", " + input02 + ") \t" + OR());
    }

    void printXOR(){
      System.out.println("XOR: (" + input01 + ", " + input02 + ") \t" + XOR());
    }

    void printNOR(){
      System.out.println("NOR: (" + input01 + ", " + input02 + ") \t" + NOR());
    }

    void printNAND(){
      System.out.println("NAND: (" + input01 + ", " + input02 + ") \t" + NAND());
    }

    /*
     * and overloaded with parameters
     */
    void printAND(boolean i01, boolean i02){
      System.out.println("AND: (" + i01 + ", " + i02 + ") \t" + AND(i01, i02));
    }

    void printOR(boolean i01, boolean i02){
      System.out.println("OR:  (" + i01 + ", " + i02 + ") \t" + OR(i01, i02));
    }

    void printXOR(boolean i01, boolean i02){
      System.out.println("XOR: (" + i01 + ", " + i02 + ") \t" + XOR(i01, i02));
    }

    void printNOR(boolean i01, boolean i02){
      System.out.println("NOR: (" + i01 + ", " + i02 + ") \t" + NOR(i01, i02));
    }

    void printNAND(boolean i01, boolean i02){
      System.out.println("NAND: (" + i01 + ", " + i02 + ") \t" + NAND(i01, i02));
    }

}
