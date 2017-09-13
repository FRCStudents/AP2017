class Door {
  int width;
  int height;
  String color;
  boolean opened;

  public int getWidth(){
  return width;
  }

  public int geentHeight(){
  return width;
  }

  public void setWidth(int w){
  width = w;
  }

  public void setHeight(int h){
    height = h;
  }

  public void setColor(String c){
    color =  c;
  }

  public String getColor(){

    return color;
  }

  public void setOpened(boolean o){
    opened = o;
  }

  public boolean getOpened(){
    return opened;
  }

  public String toString(){
    return "This is the Door: " + height + ":" + width;
  }

}
