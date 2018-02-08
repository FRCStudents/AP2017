public class twoFunctions{
      String[] vowels = {"e" , "i", "o", "u", "a", "A", "E", "O", "U", "I"};
      boolean check;

      public void printString(){
            if(check == true){
                  System.out.println("Whew");
            }else{
                  System.out.println("drag");
            }
      }

      public void checkVowel(String s){
            for(int i = 0; i < 1; i++){
                  for(int x = 0; x < vowels.length - 1; x++){
                        if(vowels[x].equals(s.charAt(i))){
                              check = true;
                        }else{
                              check = false;
                        }
                  }
            }
      }

      public static void main(String[] args){
            twoFunctions tF = new twoFunctions();
            tF.checkVowel("Hello");
            tF.printString();
            tF.checkVowel("Apples");
            tF.printString();
      }
}
