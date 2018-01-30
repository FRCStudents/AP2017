public class EYada extends Yada{

	String eYadaString;
	int eYadaNumber;
	
	public EYada(){
		this.yadaString = "Yada";
		this.yadaNumber = 0;
		this.eYadaString = "E--Yada";
		this.eYadaNumber = 7;
	}
	
	//question #4:
	@Override
	public void calcProperYadaNumber(int yn){
		yadaNumber = ((yn * 8) + 138);
	}
	
	//question #9:
	public void setBigYadaNumber(int b){
		bigYadaNumber = b;
	}
	
	public String toString(){
		return  yadaString + "\n" + eYadaString + "\n" + yadaNumber + "\n" + eYadaNumber; 
	}
}