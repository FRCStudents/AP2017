class Egg {
boolean fertilized;
String currentColor = "Peach";

String getCurrentColor(){
        return currentColor;
}
void setCurrentColor(String newColor){
        currentColor = newColor;
}

boolean getFertilized(){
        return fertilized;
}
void setFertilized(boolean newFertilized){
        fertilized = newFertilized;
}
public String toString(){
        return currentColor;
}
}
