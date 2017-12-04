public class Monkey{
	
int legs;
double weight;
double speed;
String sound;


public Monkey(int l, double w, double s, String v) {
        legs = l;
        weight = w;
        speed = s;
        sound = v; 
    }
    public Monkey() {
        legs = 2;
        weight = 1.72365;
        speed = 55;
        sound = "Ooo-Ooo-Ahh-Ahh"; 
    }



int getLegs(){
	return legs;
}
void setLegs(int NewLegs){
	legs = NewLegs;

}


double getWeight(){
	return weight;
}

void setWeight(double NewWeight){
	weight = NewWeight;

}


double getSpeed(){
	return speed;
}
void setSpeed(double NewSpeed){
	speed = NewSpeed;

}


String getSound(){
	return sound;
}

void setSound(String newSound){
	sound = newSound;

}

public String toString(){
return "Monkey!";
	}

}
