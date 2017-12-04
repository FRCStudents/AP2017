//Gareth Laliberte

class treeFrog {
        
        //Attrutes
        int numberLegs;
        int weight; 
        String habitat;
        String color;
        String speech;
}
  public Froggo(){
    this(4, 0.5, "Rainforest", "Green", "Croak");
  }

  public Froggo(int l, int w, String h, String c, String s, int sp){
    units = "Pounds";
    setNumberLegs(l);
    setWeight(w);
    setHabitat(h);
    setColor(c);
    setSpeech(s);
  }

  public String toString(){
    return "This animal is found in [" + getHabitat() + "] - and weighs: [" + getWeight() +" pounds! ]";
  }

  int getWeight(){
    return weight;
  }

  String getHabitat(){
    return habitat;
  }

  String getColor(){
    return color;
  }

  String getSpeech(){
    return speech;
  }

  int getSpeed(){
    return speed;
  }

  void setWeight(int w){
    weight = w;
  }

  void setHabitat(String h){
    habitat = h;
  }

  void setColor(String c){
    color = c;
  }

  void setSpeech(String s){
    speech = s;
 }

  public void speak(){
	System.out.println("This animal says... " + getSpeech());
  } 

  public void speak(String s){
	System.out.println("This animal says... " + s);
  }
}
