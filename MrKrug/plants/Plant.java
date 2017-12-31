
public abstract class Plant implements IPlant{
	protected int plantSize;
	protected int leafCount;
	protected int stuntFactor;
	
	public  void setSize(int s){
		if(s > MAX_SIZE){
			plantSize = MAX_SIZE;
			return;
		}
		plantSize = s;
	}

	public int getSize(){
		return plantSize;
	}

	public void setStuntFactor(int s){
		stuntFactor = s;
	}

//
// these next three functions are very important for this
// entire project - they always have to be like they are
// here - never can they be overridden!
//
	public final void raiseStunt(){
		stuntFactor++;
	}

	public final void lowerStunt(){
		stuntFactor--;
	}

	public final void growPlant(){
		setSize(getSize() + stuntFactor);
	}

	public abstract int determineGrowth();

	public int getLeafCount(){
		return leafCount;
	}

	public void setLeafCount(int lc){
		leafCount = lc * stuntFactor;
	}
	
	public String getType(){
		return "Plant";
	}
}	
