public class APComputerNerd implements Comparable{
	int intelligence; //9-10
	int speed; //4-18
	int laptopPerformance; //0-10
	String firstName;
	
	public int getIntelligence(){
		return intelligence;
	}

	public void setIntelligence(int k){
		intelligence = k;
	}

	private void swap(int i, int j){
		int hold = i;
		i = j;
		j = hold;
	}

	public int compareTo(Object o){
		APComputerNerd a = (APComputerNerd)o;
        int i = a.getIntelligence();
        int j = this.getIntelligence();
		if (i > j) return 1;
		if (j > i) return -1;
		return 0;
	}

	public void sortByInt(APComputerNerd[] arr1){
		APComputerNerd [] arr2 = new APComputerNerd [arr1.length];
		for (int j = 0; j < arr1.length; j ++){
			if(arr1[j].getIntelligence() < arr1[j+1].getIntelligence()) {
				arr2[j] = arr1[i];
			}else {
				
						
			} 
		}
		for (int m = 0; m < arr1.length; m ++){
			arr1[m] = arr2[m];
		}
	}


}