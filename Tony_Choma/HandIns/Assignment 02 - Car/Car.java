public class Car {
//Attributes
int wheels = 0;
int windows;
int doors;
String drive = "0";
int currentSpeed;
//"n","s","e","w"
String currentDirection = "n";
//Direction
String getCurrentDirection(){
        return currentDirection;
}
void setCurrentDirection(String newDirection){
        currentDirection = newDirection;
}
//Speed
int getCurrentSpeed(){
        return currentSpeed;
}
void setCurrentSpeed(int newSpeed){
        currentSpeed = newSpeed;
}
public String toString(){
        return "go go go";
}

}
