
public interface IPlant {
	final int MAX_SIZE = 200;
	final int MIN_SIZE = 2;
	public void setSize(int s);
	public int getSize();
	public int determineGrowth();
	public int getLeafCount();
	public void setLeafCount(int lc);
        public void raiseStunt();
        public void lowerStunt();
        public void growPlant();
	public String getType();
}	
