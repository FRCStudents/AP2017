public class problemSeven{

public static int fromSeven;

public problemSeven(int s){
fromSeven = s;
}

public problemSeven(){
fromSeven = 17;
}

public static void showIt(){
System.out.println("boom here it is: " + fromSeven);
}

public static void main(String[] args){
problemSeven a = new problemSeven();
a.showIt();
 }

}