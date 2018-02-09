public class StringTwo{
      public int x = 17;

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

      public static void main(String[] args){
            StringTwo c = new StringTwo();
            c.getX();
            System.out.println(c.x);
      }
}
