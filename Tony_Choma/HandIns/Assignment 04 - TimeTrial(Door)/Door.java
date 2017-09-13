class Door {
String color;
int weight = 6;
boolean opened;

String getColor(){
        return color;
}
void setColor(String newColor){
        color = newColor;
}

int getWeight(){
        return weight;
}
void setWeight(int newWeight){
        weight = newWeight;
}
public String toString(){
        return "this door is"+weight;
}
}
