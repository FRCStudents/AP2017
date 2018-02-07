import java.io.*;
public class Communism{

	private String comeradeList;

	public String getComeradeList(){
		return comeradeList;
	}

	public void newComerade(String j){
		comeradeList = comeradeList + j;
	}

	public void communeBuilder(comerade[] a){
		for (int i = 0; i < a.length(); i ++){
			newComerade("New Comerade:" + "\n Name: " + a[i].getName() +"\n Occupation: " + a[i].getOccupation() + "\n Age: " + a[i].getAge() + "\n Height: " + a[i].getHeight() +  "\n Speed:" + a[i].getSpeed() + "\n ShoeSize: " + a[i].getShoeSize() + "\n HatSize: " + a[i].getHatSize());
		}
	}

}
