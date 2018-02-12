public class StringTwo{
      public int x = 17;
      public String i = "The number is " + x;
      public StringTwo(int newX){
            setX(newX);
      }
      public StringTwo(){
            this(31);
      }

      public int getX(){
            return x;
      }

      public void setX(int newX){
            x = newX;
      }
      public String toString(){
            return i;
      }
      public static void main(String[] args){
            StringTwo c = new StringTwo();
            c.getX();
            System.out.println(c.toString());
      }
}
