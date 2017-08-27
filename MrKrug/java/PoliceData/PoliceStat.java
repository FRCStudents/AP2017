package csvReader;

class PoliceStat {
  private String id;
  private String name;
  private String date;
  private String manner_of_death;
  private String armed;
  private String age;
  private String gender;
  private String race;
  private String city;
  private String state;
  private String signs_of_mental_illness;
  private String threat_level;
  private String flee;
  private String body_camera;

  public PoliceStat(String [] lineFromFile){
    if(lineFromFile.length < 14){
      System.out.println("Bad input for PoliceStat object");
      return;
    }
    id = lineFromFile[0];
    name = lineFromFile[1];
    date = lineFromFile[2];
    manner_of_death = lineFromFile[3];
    armed = lineFromFile[4];
    age = lineFromFile[5];
    gender = lineFromFile[6];
    race = lineFromFile[7];
    city = lineFromFile[8];
    state = lineFromFile[9];
    signs_of_mental_illness = lineFromFile[10];
    threat_level = lineFromFile[11];
    flee = lineFromFile[12];
    body_camera = lineFromFile[13];
  }

  public String toString(){
    return "Police Statistic: " + this.name;
  }

  public boolean isArmed(){
      if(getArmed().equals("gun") || getArmed().equals("knife")){
        return true;
      }
      return false;
  }

  public String getId(){ return id;}
  public String getName(){ return name;}
  public String getDate(){ return date;}
  public String getManner_of_death(){ return manner_of_death;}
  public String getArmed(){ return armed;}
  public String getAge(){ return age;}
  public String getGender(){ return gender;}
  public String getRace(){ return race;}
  public String getCity(){ return city;}
  public String getState(){ return state;}
  public String getSigns_of_mental_illness(){ return signs_of_mental_illness;}
  public String getThreatLevel(){ return threat_level;}
  public String getFlee(){ return flee;}
  public String getBodyCamera(){ return body_camera;}
}
