class Person implements java.io.Serializable{
  protected String name;
  protected int age;
  protected String country;
  protected String state;
  protected String info;

  public Person(String name,int age,String country,String state,String info){
    this.name = name;
    this.age = age;
    this.country = country;
    this.state = state;
    this.info = info;
  }

  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public String getCountry(){
    return country;
  }
  public String getState(){
    return state;
  }
  public String getInfo(){
    return info;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public void setCountry(String country){
    this.country = country;
  }
  public void setState(String state){
    this.state = state;
  }
  public void setInfo(String info){
    this.info = info;
  }

  public String toString(){
    return "--------------\n  Name: " + getName() + "\n  Age: " + getAge() + "\n  Country: " + getCountry() + "\n  State: "+ getState() + "\n  Info: " + getInfo() + "\n--------------";
  }
}
