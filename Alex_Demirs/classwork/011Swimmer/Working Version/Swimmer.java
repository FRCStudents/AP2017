class Swimmer {
  private String name;
  private int goldCount = 0;
  private int silverCount = 0;
  private int bronzeCount = 0;

  public Swimmer (){
      setName("");
      goldCount = 0;
      silverCount = 0;
      bronzeCount = 0;
  }

  public Swimmer (String n, int g, int s, int b){
    setName(n);
    goldCount = g;
    silverCount = s;
    bronzeCount = b;
  }

  public void setName(String n){
    name = n;
  }

  public String getName(){
    return name;
  }

  public String toString(){
    return "Name: " + name;
  }
}