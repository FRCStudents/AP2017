import java.util.*;

public class StringAnalyze{
  private String baseString = "This is a string!";
  String placeholderA;
  String placeholderB;
  private final String alphabet = "abcdefghijklmnopqrstuvwxyz";

  public void noSpaces(){
    placeholderA = "";
    for(int i = 0; i < baseString.length(); i++){
      if(baseString.charAt(i) != ' '){
        placeholderA += baseString.charAt(i);
      }
    }
  }
  public void changeLetters(){
    placeholderB = "";
    for(int i = 0; i < placeholderA.length(); i++){
      if(placeholderA.charAt(i) != '!') {
        int x = alphabet.indexOf(Character.toLowerCase(placeholderA.charAt(i)));
        if(i != 0){
          placeholderB += Character.toLowerCase(alphabet.charAt(x + 2));
        }else{
          placeholderB += Character.toUpperCase(alphabet.charAt(x + 2));
        }
      } else {
        placeholderB += placeholderA.charAt(i);
      }
    }
  }
}
