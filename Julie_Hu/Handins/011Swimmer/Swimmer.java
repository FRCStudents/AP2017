class Swimmer {
  private String name;
  private int count_gold = 0;
  private int count_silver = 0;
  private int count_bronze = 0;

  public Swimmer (){
      setName("");
      count_gold = 0;
      count_silver = 0;
      count_bronze = 0;
  }

  public Swimmer (String n, int g, int s, int b){
    setName(n);
    count_gold = g;
    count_silver = s;
    count_bronze = b;
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