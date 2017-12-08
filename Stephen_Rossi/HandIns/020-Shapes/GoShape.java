public class GoShape{
  public static void main(String[] args){
    Shape[] shapes = new Shape[3];

    shapes[0] = new Triangle(3,3,3);
    shapes[1] = new Rectangle(2,4,2,4);
    shapes[2] = new Pentagon(2,2,2,2,2);

    for(int i = 0; i < shapes.length; i++){
      System.out.println(
        shapes[i].shapeName
        + "'s perimiter is: "
        + shapes[i].perimiter
      );
    }

  }
}
