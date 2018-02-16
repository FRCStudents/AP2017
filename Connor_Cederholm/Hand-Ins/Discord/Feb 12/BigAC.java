public class BigAC{
	public int isOn;
	public int b;

	public void turnOnAC(){
		isOn = 10;
		System.out.println("WE BIG COOLIN'");
	}
	public void turnOffAC(){
		isOn = -10;
		System.out.println("Awwwww we done BIG coolin");
	}

	public String toString(){
		return "BIG: " + isOn;
	}

	public int getAC(){
		return isOn;
	}

	public void putInBox(){
		System.out.print("****** \n**" + isOn + "** \n******");
	}
}