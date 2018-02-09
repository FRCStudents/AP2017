//question 7
public class EYEYada extends Yada{
	
	public static void main(String[] argv){
		EYEYada a = new EYEYada();
		a.calcProperYadaNumber(18);
		System.out.println(a);
	}
	
	Yada[] alternateYada = new Yada[24];
	
	public EYEYada(){
		for (int x = 0; x < alternateYada.length; x++){
			if (x % 2 == 0){
				alternateYada[x] = new Yada();
			}else{
				alternateYada[x] = new EYada();
			}
			alternateYada[x].calcProperYadaNumber(x);
		}
		
	}
	
	public String toString(){
		String p = " ";
		for (int t = 0; t < alternateYada.length; t++){
			p +="\n" + alternateYada[t] + "\n";
		}
		return p;
	}

}