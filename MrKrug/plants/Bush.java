
public class Bush extends Plant{
	//bushes may grow like wildfire...!
	int previousSize;

	public Bush(){
		super.setSize(20);
	}

	@Override 
	public void setSize(int s){
		previousSize = plantSize;
		super.setSize(s);
	}
	
	public int determineGrowth(){
		return (plantSize - previousSize) / 10;
	}

	public String toString(){
		return "\t\tBush: current size: " + plantSize + " previous size: " + previousSize + " growth: " + determineGrowth();
	}

	@Override
	public String getType(){
		return "Bush";
	} 
}	
