class Palindromerino{
String string;
int m;
public String setString(String s){
	string = s;
	return string;
}
public String palindromer(){
for (int i = 0; i < string.length(); i++){
	if (string.charAt(i) == string.charAt(string.length() - i-1)){
	m ++;
	}
	if (m == string.length()){
	return "Palindrome";
     }
     return "Not a palindrome";
	}
	return " ";
}
}