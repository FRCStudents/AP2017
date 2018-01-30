
/***************************
 * the story
 ***************************/

public class Story{
  final int BOARD_SIZE = 12;
  final int DEATHLY_HURT = 13;

  char[][] Board = new char[BOARD_SIZE][BOARD_SIZE];

  Position LastSHPos = new Position();
  Position LastVilPos = new Position(BOARD_SIZE - 1, BOARD_SIZE - 1);

  Position SHPos = new Position();
  Position VilPos = new Position(BOARD_SIZE - 1, BOARD_SIZE - 1);

  public Story(){
    initBoard();
  }

  private boolean placeEmpty(int x, int y){
    if(!onBoard(x,y)) return false;
    if(!Board[x][y] == ' ') return false;
    return true;
  }

  private boolean adjacentOccupied(Postion oldPos){
      if(!placeEmpty(oldPos.getX() + 1, oldPos.getY())) return true;
      if(!placeEmpty(oldPos.getX() - 1, oldPos.getY())) return true;
      if(!placeEmpty(oldPos.getX(), oldPos.getY() + 1)) return true;
      if(!placeEmpty(oldPos.getX(), oldPos.getY() - 1)) return true;
      return false;
  }

  private boolean onBoard(int x, int y){
    if((x < BOARD_SIZE) && (x >= 0) && (y < BOARD_SIZE) && (y >= 0))
      return true;
    return false;
  }

  public boolean wackOther(Postion oldPos, int health){
      if(health < DEATHLY_HURT) return false;
      if(adjacentOccupied(oldPos)){
        return true;
      }
      return false;
  }

  /*
   * this could be randomized or something...
   */
  public Position moveNext(Positon oldPos, int distance){
      Position newPos;
      if(distance == 0) return oldPos;
        if(placeEmpty(oldPos.getX(), oldPos.getY() + distance) && onBoard(oldPos.getX(), oldPos.getY() + distance))
          newPos = new Position(oldPos.getX(), oldPos.getY() + distance);
        else {
          if(placeEmpty(oldPos.getX() + distance, oldPos.getY()) && onBoard(oldPos.getX() + distance, oldPos.getY()))
            newPos = new Position(oldPos.getX() + distance, oldPos.getY());
        } else {
          if(placeEmpty(oldPos.getX() - distance, oldPos.getY()) && onBoard(oldPos.getX() - distance, oldPos.getY()))
            newPos = new Position(oldPos.getX() - distance, oldPos.getY());
        } else {
          if(placeEmpty(oldPos.getX(), oldPos.getY() - distance) && onBoard(oldPos.getX(), oldPos.getY() - distance))
            newPos = new Position(oldPos.getX(), oldPos.getY() - distance);
        } else {
          newPos = new Position(oldPos.getX(), oldPos.getY());
        }

      return newPos;
  }

  private void initBoard(){
    for(int i=0; i < 12; i++){
      for(int j=0; j < 12; j++){
        Board[i][j] = ' ';
      }
    }
  }

  private void clearSquare(int x, int y){
      Board[x][y] = ' ';
  }

  private void loadSquare(int x, int y, char symbol){
      Board[x][y] = symbol;
  }

  private static void send(String s){
    System.out.println(s);
  }

  private static String alive(boolean b){
    if(b){
      return "Alive";
    }
    return "Quite Dead";
  }

  public static void main(String args[]){
      Villain v = new Villain();
      Superhero s = new Superhero();

      send("There was a guy called, " + v.getName());
      send("and " + v.getName() + " was not nice. \nHe hated " + s.getName());
      send("\tNow everyone knows that " + s.getName() + " was a Super Dude with ");
      send("the super power of " + s.getSuperpower() + " and a very good heath. He was healthy.");
      send("Actually, " + s.getName() + " was " + alive(s.living()) + " and " + v.getName() + " was " + alive(v.living()));
      while(s.living() && v.living()){
        send(s.getName() + " wacked " + v.getName() + " but " + v.getName() + " was " + alive(v.living()));
        v.reduceHealth(2);
        send("But " + v.getName() + " wacked him back... and he was " + alive(s.living()));
        s.reduceHealth(1);
      }
        send("Now, " + s.getName() + " is " + alive(s.living()) + " " + v.getName() + " is " + alive(v.living()) );
  }

  public void printBoard(){
    System.out.println();
    for(int i=0; i < BOARD_SIZE; i++){
      for(int j=0; j < BOARD_SIZE; j++){
        System.out.print("[" + Board[i][j] + "]");
      }
      System.out.println();
    }
  }
}
