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

  protected int getWeight(){
    return weight;
  }

  protected String getHabitat(){
    return habitat;
  }

  protected String getColor(){
    return color;
  }

  protected String getSpeech(){
    return speech;
  }

  protected int getSpeed(){
    return speed;
  }

  protected void setWeight(int w){
    weight = w;
  }

  protected void setHabitat(String h){
    habitat = h;
  }

  protected void setColor(String c){
    color = c;
  }

  protected void setSpeech(String s){
    speech = s;
 }

  public void speak(){
	System.out.println("This animal says... " + getSpeech());
  } 

  public void speak(String s){
	System.out.println("This animal says... " + s);
  }
}
