import java.util.*;
public class Kennel{
	private ArrayList petList;

	public void allSpeak(){
		for (int i = 0; i < petList.size(); i++){
			System.out.println(petList.get(i).getName() + petList.get(i).speak());
		}
	}
}