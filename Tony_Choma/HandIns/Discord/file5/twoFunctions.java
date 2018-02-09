public class twoFunctions{
      String[] vowels = {"e", "i", "o", "u", "a", "A", "E", "O", "U", "I"};
      boolean check;
      public void printString(){
            if(check == true){
                  System.out.println("Whew");
            }else{
                  System.out.println("drag");
            }
      }

      public boolean checkVowel(String s){
            for(int i; i < vowels.length; i++){
                  if(vowels[0].equals(s.charAt(0))){
                        return check = true;
                  }else{
                        return check = false;
                  }
            }
      }

      public static void main(String[] args){
            twoFunctions tF = new twoFunctions();
            //tF.checkVowel("Hello");
            //tF.printString();
            tF.checkVowel("epples");
            tF.printString();
      }
}
