package Palin;

public class Palin{
  private String palin;

  public Palin(String p){
      this.palin = p;
  }

  public String getString(){
	return palin;
  }
 
  public boolean isPalin(){
	int j=palin.length() - 1;	
	for(int i=0; i < (palin.length())/2; i++){
		System.out.print("[" + palin.charAt(i) + "][" + palin.charAt(j) + "]");
		if(! (palin.charAt(i) == palin.charAt(j)) ){
			return false;
		}
	j--;
	}
	return true;
  }

	
  public boolean isPalinR(String s, int a, int b){
	if(a > b) return true;
	if(s.charAt(a + 1) == s.charAt(b - 1)){
		return isPalinR(s, a + 1, b -1);
	} 
	return false;  
  }
}
