
class Yada {
  	String yadaString = "";
	int yadaNumber = 0;
	protected int bigYadaNumber = 0;
	public int sloppyNumber = 0;

	public Yada(){
		yadaString = "Yada";
		yadaNumber = 0;
	}

	public void calcProperYadaNumber(int x){
		yadaNumber = (x * 7) + 138;
	}

	public String toString(){
		return yadaString + " " + yadaNumber;
	}
}

 

