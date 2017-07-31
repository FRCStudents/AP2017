
/******************
 * Supervillain
******************/

public class Villain {
  String name;
  String evilPower;
  int numEvilDeeds;
  int health;
  String weakness;

  public Villain(String name, String evilPower, int numEvilDeeds, int health, String weakness){
    this.name = name;
    this.evilPower = evilPower;
    this.numEvilDeeds = numEvilDeeds;
    this.health = health;
    this.weakness = weakness;
  }

  public Villain(){
    this.name = "SuperBadGuy";
    this.evilPower = "Sadness";
    this.numEvilDeeds = 10;
    this.health = 100;
    this.weakness = "Happiness";
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

  public String getEvilpower(){
    return evilPower;
  }

  public void setEvilpower(String evilPower){
    this.evilPower = evilPower;
  }

  public boolean living(){
    if (health > 0){
      return true;
    }
    return false;
  }
}
