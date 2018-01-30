package Palin;

public class PalinGo{
  public static void main(String args[]){
 	Palin p = new Palin("raceecar");
	if(p.isPalinR(p.getString(), 0, p.getString().length()-1)){
		System.out.println("Yup! It's a palindrome!");
	}
	else {
		System.out.println("nope");
	} 
  }
}
