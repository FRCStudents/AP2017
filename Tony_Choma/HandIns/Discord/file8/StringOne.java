public class StringOne{
      public int x;
      public StringOne(int newX){
            setX(newX);
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
            return x;
      }
      public static void main(String[] args){
            StringOne c = new StringOne();
            System.out.println(toString());
      }
}
