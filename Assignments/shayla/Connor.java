//Question 12:
class Connor {
static int m;
static String[][] shaylaArr1 = new String[4][5];

public static void fillEm(){
        for(int i =0; i < shaylaArr1.length; i++){
           if(i == 0) shaylaArr1[0][i] = "My";
            if(i ==1) shaylaArr1[0][i] = "Dog";
         if(i ==2) shaylaArr1[0][i] = "Has";
            if(i ==3) shaylaArr1[0][i] = "A";
            if(i ==4) shaylaArr1[0][i] = "Ukelele";
    }
        for (int j = 1; j < shaylaArr1.length; j++){
            for(int k = 0; k < shaylaArr1.length; k++){
            	m = k + j;
                if(m > shaylaArr1.length) {
			m = m - shaylaArr1.length;
		}
            shaylaArr1[j][k] = shaylaArr1[0][m];
            }
        }
    }

public static void main(String[] argv){
	fillEm();
	for(int i=0; i<4; i++){
		for(int j=0; j<5; j++){
			System.out.print(shaylaArr1[i][j]);
		}
	System.out.println();
	}
   }
}
