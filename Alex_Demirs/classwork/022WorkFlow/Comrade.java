import java.util.*;

public class Comrade{

String name;
String age;
String occupation;
String height;
String speed;
String shoeSize;
String hatSize;

//set+get
String getName(){
    return name;
}
String getAge(){
    return age;
}
String getOccupation(){
    return occupation;
}
String getHeight(){
    return height;
}
String getSpeed(){
    return speed;
}
String getShoeSize(){
    return shoeSize;
}
String getHatSize(){
    return hatSize;
}
public void setName(String n){
    name = n;
}
public void setAge(String a){
    age = a;
}
public void setOccupation(String o){
    occupation = o;
}
public void setHeight(String h){
    height = h;
}
public void setSpeed(String s){
    speed = s;
}
public void setShoeSize(String ss){
    shoeSize = ss;
}
public void setHatSize(String hs){
    hatSize = hs;
}


//asking for the info
public void comradeAsker(){
//name asker
Scanner nimput = new Scanner(System.in); 
System.out.println("What is your name comrade?");
String nImput = nimput.nextLine();
setName(nImput);

//age
Scanner aimput = new Scanner(System.in); 
System.out.println("What is your age comrade?");
String aImput = aimput.nextLine();
setAge(aImput);



Scanner oimput = new Scanner(System.in); 
System.out.println("What is your occupation comrade?");
String oImput = oimput.nextLine();
setName(oImput);


Scanner himput = new Scanner(System.in); 
System.out.println("What is your height comrade?");
String hImput = himput.nextLine();
setHeight(hImput);



Scanner simput = new Scanner(System.in); 
System.out.println("What is your speed comrade?");
String sImput = simput.nextLine();
setSpeed(sImput);


Scanner shimput = new Scanner(System.in);
System.out.println("What is your shoesize comrade?");
String shImput = shimput.nextLine();
setShoeSize(shImput);


Scanner haimput = new Scanner(System.in); 
System.out.println("What is your hatsize comrade?");
String haImput = haimput.nextLine();
setHatSize(haImput);
}
}