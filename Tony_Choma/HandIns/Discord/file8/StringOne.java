public class StringOne{
      public int x;
      public String i = "The number is " + x;
      public StringOne(int newX){
            setX(x);
      }
      public StringOne(){
            this(17);
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
            StringOne c = new StringOne(21);
            c.setX(17);
            System.out.println(c.getX());
            System.out.println(c.toString());
      }
}
