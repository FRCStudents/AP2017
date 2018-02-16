public class VeryBigAC extends BigAC{
	public int isOn;
	public int b;

	public void turnOnAC(){
		isOn = 100;
		System.out.println("WE REAL BIG COOLIN'");
	}
	public void turnOffAC(){
		isOn = -100;
		System.out.println("Awwwww we done REAL BIG coolin");
	}

	public String toString(){
		return "VERY BIG: " + isOn;
	}

	public int getAC(){
		return isOn;
	}

	public void putInBox(){
		System.out.print("****** \n**" +isOn + "** \n******");
	}
}