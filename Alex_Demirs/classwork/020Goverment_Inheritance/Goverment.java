public class Goverment{
	public String type = "gov";
	public int  numberOfType = 6;
	public int powerOfLeader = 0;
	public boolean isFacist = false;
	public int numberOfLeaders = 0;
	public int sizeOfGov = 0;

	public Goverment(){

	}

	public Goverment(String type, int numberOfType, int powerOfLeader, boolean isFacist, int numberOfLeaders, int sizeOfGov){

			this.type = type;
			this.numberOfType = numberOfType;
			this.powerOfLeader = powerOfLeader;
			this.isFacist = isFacist;
			this.numberOfLeaders = numberOfLeaders;
	}

	protected final String getType(){
		return this.type;
	}

	protected final void setType(String type){
		this.type = type;
	}


	protected final int getNumberOfType(){
		return this.numberOfType;
	}

	protected final void setNumberOfType(int numberOfType){
		this.numberOfType = numberOfType;
	}

	protected final int getPowerOfLeader(){
		return this.powerOfLeader;
	}

	protected final void setpowerOfLeader(int powerOfLeader){
		this.powerOfLeader = powerOfLeader;
	}

	protected final boolean getIsFacist(){
		return this.isFacist;
	}

	protected final void setIsFacist(boolean isFacist){
		this.isFacist = isFacist;
	}

	protected final int getNumberOfLeaders(){
		return this.numberOfLeaders;
	}

	protected final void setNumberOfLeaders(int numberOfLeaders){
		this.numberOfLeaders = numberOfLeaders;
	}

	protected final int getSizeOfGov(){
		return this.sizeOfGov;
	}

	protected final void setSizeOfGov(){
		this.sizeOfGov = sizeOfGov;
	}

			protected void identifyType(){
    				System.out.println(type + " is a goverment");

	}

			protected void identifyNumberOfType(){
    				System.out.println("There are " + getNumberOfType() + " " + type + " goverments in the world.");

	}

	protected void identifyPowerOfLeader(){
    				System.out.println("The leader in a " + type + " goverment has " + getPowerOfLeader() + " out of 10 power.");

	}





}