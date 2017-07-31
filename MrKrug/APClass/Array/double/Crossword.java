/********************************
 * crossword problem...
 ********************************/

class Square{
  public boolean isBlack;
  public int num;

  Square(boolean isBlack, int num){
      this.isBlack = isBlack;
      this.num = num;
  }
}

public class Crossword {

  private Square[][] puzzle;
  private boolean[][] blackSquares;
  /*************************************
   * constructor
   *************************************/
 public Crossword(boolean[][] blackSquares){
   int num = 0; int counter = 0;
   this.blackSquares = new boolean[blackSquares.length][blackSquares[0].length];
   for(int i=0; i < blackSquares.length; i++)
     for(int j=0; j < blackSquares[i].length; j++){
       this.blackSquares[i][j] = blackSquares[i][j];
     }

   puzzle = new Square[blackSquares.length][blackSquares[0].length];
   for(int i=0; i < blackSquares.length; i++)
     for(int j=0; j < blackSquares[i].length; j++){
         num = 0;
         if(!blackSquares[i][j] && toBeLabeled(i,j,blackSquares)){
           counter++;
           num = counter;
         }
         Square sq = new Square(blackSquares[i][j], num);
         puzzle[i][j] = sq;
     }
 }

 private boolean toBeLabeled(int r, int c, boolean[][] blackSquares){
  if((r == 0)||(c == 0)|| blackSquares[r][c-1] || blackSquares[r-1][c]){
      //System.out.print("TRUE:" + r + ":" + c);
      return true;
    }
  //System.out.print("FALSE:" + r + ":" + c);
  return false;
}

  public void display(){
    for(int i=0; i < blackSquares.length; i++){
      for(int j=0; j < blackSquares[i].length; j++){
          System.out.print("[" + puzzle[i][j].num + "]");
          if(puzzle[i][j].isBlack){
            System.out.print("B");
          } else {
            System.out.print("W");
          }
        }
      System.out.println("");
    }
  }
}
