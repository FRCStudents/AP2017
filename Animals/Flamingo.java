public class Flamingo{
int legs;
double weight;
double speed;
String sound;
String units;

//getters and setters for legs
int getLegs(){
	return legs;
}
void setLegs(int NewLegs){
	NewLegs = 2;
	legs = NewLegs;
	//System.out.println(NewLegs);
}

//getters and setters for weight
double getWeight(){
	return weight;
}

void setWeight(double NewWeight){
	NewWeight = 4.4;
	weight = NewWeight;
	//System.out.println(NewWeight);
}

//getters and setters for speed
double getSpeed(){
	return speed;
}
void setSpeed(double NewSpeed){
	NewSpeed = 16.5; //meters per second
	speed = NewSpeed;
	//System.out.println(NewSpeed);
}

//getters and setters for sound
String getSound(){
	return sound;
}

void setSound(String newSound){
	newSound = "OO-OO-EEE-EEE--Tooky tooky!";
	sound = newSound;
	//System.out.println(newSound);
}
//getters and setters for units

String getUnits(){
	return units;
}

void setUnits(String newUnits){
	newUnits = "pounds";
	units = newUnits;
}

public String toString(){
return "FLAMINGO!";
	}

}
