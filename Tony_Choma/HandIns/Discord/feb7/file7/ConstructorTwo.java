public class ConstructorTwo{
      public int x = 17;

      public ConstructorTwo(int newX){
            setX(newX);
      }
      public ConstructorTwo(){
            this(31);
      }

      public int getX(){
            return x;
      }

      public void setX(int newX){
            x = newX;
      }

      public static void main(String[] args){
            ConstructorTwo c = new ConstructorTwo();
            c.getX();
            System.out.println(c.x);
      }
}
