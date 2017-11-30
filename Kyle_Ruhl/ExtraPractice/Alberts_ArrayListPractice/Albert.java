import java.util.*;

public class Albert{

public int[] arrayStructure;

public Albert(){
	arrayStructure = new int[10];
	}

public Albert(int size){
	arrayStructure = new int[size];
	}

public void set(int spot, int val){
	arrayStructure[spot] = val;
	}

public int get(int spot){
	return arrayStructure[spot];
	}

public void remove(int spot){
	int[] newArray = new int[arrayStructure.length -1];
	int counter = 0;
	for (int i = 0; i < arrayStructure.length; i++){
		if (i != spot){
			newArray[counter] = arrayStructure[i];
			counter ++;
			}
		}
		arrayStructure = new int[newArray.length];
		for (int i = 0; i < newArray.length; i++){
			arrayStructure[i] = newArray[i];
			}
	}			 
}
