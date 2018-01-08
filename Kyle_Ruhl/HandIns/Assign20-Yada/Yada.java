public class Yada{

	protected String yadaString;
	protected int yadaNumber;
	/*question #8: */ protected int bigYadaNumber; 
	/*question #10: */ protected int sloppyNumber;
	
	public Yada(){
		this.yadaString = "Yada";
		this.yadaNumber = 0;
	}
	
	//question 3
	public void calcProperYadaNumber(int yn){
		yadaNumber = ((yn * 7) + 183);
	}
	
	//question 11:
	public void SetSloppyNumberInDriver(int c){
		sloppyNumber = c;
	}
	
	
	public String toString(){
		return yadaNumber + "\n" + yadaString;
	}
}