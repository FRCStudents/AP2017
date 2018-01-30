public class Swimmer {
  private String name;
  private long height;
  private long weight;
  private int age;
  private String country;
  private int goldMedals;
  private int silverMedals;
  private int bronzeMedals;
  private long goldTime;
  private long silverTime;
  private long bronzeTime;

  public void setName(String newValue){ //Name
    this.name = newValue;
  }
  public String getName(){
    return name;
  }
  public void setHeight(long newValue){ // Height
    this.height = newValue;
  }
  public long getHeight(){
    return height;
  }
  public void setWeight(long newValue){ // Height
    this.weight = newValue;
  }
  public long getWeight(){
    return weight;
  }
  public void setAge(int newValue){ // Age
    this.age = newValue;
  }
  public int getAge(){
    return age;
  }
  public void setCountry(String newValue){ // Country
    this.country = newValue;
  }
  public String getCountry(){
    return country;
  }
  public void setGoldMedals(int newValue){ // goldMedals
    this.goldMedals = newValue;
  }
  public int getGoldMedals(){
    return goldMedals;
  }
  public void setSilverMedals(int newValue){ // silverMedals
    this.silverMedals = newValue;
  }
  public int getSilverMedals(){
    return silverMedals;
  }
  public void setBronzeMedals(int newValue){ // bronzeMedals
    this.bronzeMedals = newValue;
  }
  public int getBronzeMedals(){
    return bronzeMedals;
  }
  public void setGoldTime(long newValue){ // goldTime
    this.goldTime = newValue;
  }
  public long getGoldTime(){
    return goldTime;
  }
  public void setSilverTime(long newValue){ // silverTime
    this.silverTime = newValue;
  }
  public long getSilverTime(){
    return silverTime;
  }
  public void setBronzeTime(long newValue){ // bronzeTime
    this.bronzeTime = newValue;
  }
  public long getBronzeTime(){
    return bronzeTime;
  }
}
