
/******************
 * Superhero
******************/

public class Superhero {
  String name;
  String superPower;
  int numLivesSaved;
  int health;
  String weakness;

  public Superhero(String name, String superPower, int numLivesSaved, int health, String weakness){
    this.name = name;
    this.superPower = superPower;
    this.numLivesSaved = numLivesSaved;
    this.health = health;
    this.weakness = weakness;
  }

  public Superhero(){
    this.name = "SuperGoodGuy";
    this.superPower = "Happiness";
    this.numLivesSaved = 10;
    this.health = 100;
    this.weakness = "Sadness";
  }

  public void reduceHealth(int a){
    if (health > 0){
      health-=a;
    }
  }

  public void heal(int a){
    if (health < 100){
      health += a;
    }
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }
  
  public boolean living(){
    if (health > 0){
      return true;
    }
    return false;
  }

  public String getSuperpower(){
    return superPower;
  }

  public void setSuperpower(String superPower){
    this.superPower = superPower;
  }

}
