public class Constructor{
      public int x;
      public Constructor(int newX){
            setX(newX);
      }
      public Constructor(){
            this(17);
      }

      public int getX(){
            return x;
      }

      public void setX(int newX){
            x = newX;
      }

      public static void main(String[] args){
            Constructor c = new Constructor();
            c.setX(17);
            c.getX();
            System.out.println(c.x);
      }
}
