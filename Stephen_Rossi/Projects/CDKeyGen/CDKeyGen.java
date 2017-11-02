public class CDKeyGen {
  private final String characters = "abcdefghijklmkopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!#$%&";

  public String generate(){
    String placeholder = "";;
    for(int i = 0; i < 20; i++){
      int x = (int) Math.floor(Math.random() * characters.length());
      placeholder += characters.charAt(x);
    }
    return placeholder;
  }
}
