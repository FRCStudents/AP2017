
public class Tree extends Plant{
	//trees grow so slowly!
	int previousSize;

	public Tree(){
		super.setSize(75);
	}

	@Override 
	public void setSize(int s){
		previousSize = plantSize;
		super.setSize(s);
	}
	
	public int determineGrowth(){
		return (plantSize - previousSize) * 10;
	}

	public String toString(){
		return "Tree: current size: " + plantSize + " previous size: " + previousSize + " growth: " + determineGrowth();
	}

	@Override
	public String getType(){
		return "Tree";
	}
}	
