/***********************************
 * CrosswordGo
 ***********************************/

public class CrosswordGo{
  public static void main(String argv[]){
      boolean[][] bs = {{false, true, false},
                        {true, false, false},
                        {false, true, true}};

      Crossword c = new Crossword(bs);
      c.display();
    }
}
