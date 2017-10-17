
class Position {
  private int x;
  private int y;

  public Position(int x, int y){
    setX(x);
    setY(y);
  }

  public Position(){
    this(0,0);
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }

  public void setX(int x){
    this.x = x;
  }

  public void setY(int y){
    this.y = y;
  }
}
