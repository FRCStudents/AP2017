public class Palindromerino{
String string;
public String setString(String s){
	string = s;
	return string;
}
public String palindromer(){
for (int i = 0; i <= string.length(); i++){
	if (string.charAt(i) == string.charAt(string.length() - i)){
	return "Palindrome, BABY";
	}
}
	return "no, idiot";
	
}
}