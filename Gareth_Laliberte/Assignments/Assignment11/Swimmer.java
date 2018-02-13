class Swimmer {
  private String name;
  private int goldMedals = 0;
  private int silverMedals = 0;
  private int bronzeMedals = 0;

  public Swimmer (){
      setName("");
      goldMedals = 0;
      silverMedals = 0;
      bronzeMedals = 0;
  }

  public Swimmer (String n, int g, int s, int b){
    setName(n);
    goldMedals = g;
    silverMedals = s;
    bronzeMedals = b;
  }

//getters and setters
  public void setName(String n){
    name = n;
  }

  public String getName(){
    return name;
  }

  public String toString(){
    return "Swimmer's Name: " + name;
  }
}
