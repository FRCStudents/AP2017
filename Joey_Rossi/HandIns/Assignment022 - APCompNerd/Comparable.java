interface Comparable {
    public int getIntelligence();
    public void setIntelligence(int i);
    public int getSpeed();
    public void setSpeed(int s);
    public int getLaptopPerformance();
    public void setLaptopPerformance(int lp);
    public String getFirstName();
    public void setFirstName(String fn);
    public int compareTo(APComputerNERD nerd, boolean choice);
}