class Door {
  String color;
  int width;
  boolean opened;
  int height;

  public void setColor(String newColor){
    color = newColor;
  }
  public void setOpened(boolean newStatus){
    opened = newStatus;
  }
  public void setHeight(int newHeight){
    height = newHeight;
  }
  public void setWidth(int newWidth) {
    width = newWidth;
  }
  public int getWidth(){
    return width;
  }
  public int getHeight(){
    return height;
  }
  public boolean getOpened(){
    return opened;
  }
  public String getColor(){
    return color;
  }
  public String toString(){
    return "WOW IM A DOOR!";
  }
}
