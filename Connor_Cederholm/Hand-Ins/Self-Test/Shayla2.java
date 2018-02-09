public class Shayla2{
	public String[][] shaylaArr1 = new String[4][5];
	int m;
	public void fillEm(){
    	for(int i =0; i < shaylaArr1.length +1; i++){
      	 if(i == 0) shaylaArr1[0][i] = "My";
       	 if(i ==1) shaylaArr1[0][i] = "Dog";
         if(i ==2) shaylaArr1[0][i] = "Has";
       	 if(i ==3) shaylaArr1[0][i] = "A";
       	 if(i ==4) shaylaArr1[0][i] = "Ukelele";
    }
    	for (int j = 1; j < shaylaArr1.length; j++){
       	 for(int k = 0; k < shaylaArr1.length; k++){
            m = k + j;
      	 	if(m > 4) m = m - 4;
            shaylaArr1[j][k] = shaylaArr1[0][m];
                
       		 }
    	}
	}
}