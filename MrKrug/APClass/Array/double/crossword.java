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
 public Crossword(){
   int num = 0; int counter = 0;
   puzzle = new Square[blackSquares.length][blackSquares[0].length];
   for(int i=0; i < blackSquares.length; i++)
     for(int j=0; j < blackSquares[i].length; j++){
         num = 0;
         if(toBeLabeled(i,j,blackSquares)){
           counter++;
           num = counter;
         }
         Square sq = new Square(blackSquares[i][j].isBlack, num);
         puzzle.add(sq);
     }
 }

 private boolean toBeLabeled(int r, int c, boolean[][] blackSquares){
  if((r == 0)||(c == 0)|| blackSquares[r][c-1] || blackSquares[r-1][c])
      return true;
  return false;
  }
}
