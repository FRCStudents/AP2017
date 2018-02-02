public class Shayla2Driver{
	public static void main(String [] argv){
		Shayla2 a = new Shayla2();
		a.fillEm();

		for(int i = 0; i < a.shaylaArr1.length; i++){
        for(int j = 0; j < a.shaylaArr1.length+1 ; j++){
            System.out.print(a.shaylaArr1[i][j]);
        } System.out.println(" ");
    }
	}
}
