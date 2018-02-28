import java.util.*;

class DoSort {

	int[] arr = new int[50000];
        ArrayList<Integer> alIn = new ArrayList<Integer>();
        ArrayList<Integer> alOut = new ArrayList<Integer>();

	public DoSort(){
		for(int i = 0; i < 50000; i++){
			arr[i] = (int)(Math.random() * 100); 
		}
	}

 	/*public void printIt(){
		System.out.println();
		for(int i = 0; i < 50000; i++){
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
	}
*/
	public void printOut(){
		System.out.println("------------ out ---------------\n");
		for(int i=0; i<50000; i++){
			System.out.print("[" + alOut.get(i) + "]");
		}
		System.out.println();
 	}

	private void copyIn(){
		for(int i=0; i<50000; i++){
			alIn.add(arr[i]);
		}
	}

	//*
  	//* @return -
	//* 4-position array of int
	//*	1) minimum value between begin and end
	//*	2) index to 1)
	//* 	3) maximum value between begin and end
	//*	4) index to 3)
	//*

	private int[] getMinMax(){
		int[] minMax = new int[4];
		minMax[0] = alIn.get(0); 
		minMax[2] = alIn.get(0);
 		for(int i=0; i < alIn.size(); i++){
			if( alIn.get(i) > minMax[2]){
				minMax[2] = alIn.get(i);
				minMax[3] = i;
			}
			if( alIn.get(i) < minMax[0]){
				minMax[0] = alIn.get(i);
				minMax[1] = i;
			}
		}

		return minMax;
	} 

	public void sort(){
		int begin = 0;
		int end = 1;  
		int[] minMax;

		copyIn();
		while(alIn.size() > 0){
			minMax = getMinMax();
			alOut.add(begin, minMax[0]);
			alOut.add(begin+1, minMax[2]);
			if(minMax[3] > minMax[1]){
				alIn.remove(minMax[3]);
				alIn.remove(minMax[1]);
			} else {
                                alIn.remove(minMax[1]);
                                alIn.remove(minMax[3]);
			}

			begin++;
		}	
	}	

}