public class LittleAC extends FileTwo{
	public int isOn;
	public int b;

	public void turnOnAC(){
		isOn = 1;
		System.out.println("WE COOLIN'");
	}
	public void turnOffAC(){
		isOn = -1;
		System.out.println("Awwwww we done coolin");
	}

	public String toString(){
		return "small: " + isOn;
	}

	public int getAC(){
		return isOn;
	}

	public void putInBox(){
		System.out.print("****** \n**" +isOn + "** \n******");
	}
}