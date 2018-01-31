interface Comparable {

	//Intelligence
    public int getIntelligence();
    
    public void setIntelligence(int i);

    //Speed
    public int getSpeed();
    
    public void setSpeed(int s);
    
    //LaptopPerformance
    public int getLaptopPerformance();
    
    public void setLaptopPerformance(int l);
    
    //FirstName
    public String getFirstName();
    
    public void setFirstName(String f);
    
    //CompareTo
    public int compareTo(APComputerNerd nerd, boolean choice);
}