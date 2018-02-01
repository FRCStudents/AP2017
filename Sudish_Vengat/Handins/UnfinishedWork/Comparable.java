public interface Comparable {

	//FirstName
	public String getFirstName();

    public void setFirstName(String f);
    
	//Intelligence
	public int getIntelligence();
    
    public void setIntelligence(int i);
    
    //Speed
    public int getSpeed();
    
    public void setSpeed(int s);
    
    //LaptopPerformance
    public int getLaptopPerformance();
    
    public void setLaptopPerformance(int l);
    
    //CompareTo
    public int compareTo(APComputerNerd nerd, boolean choice);

}