public class Cow{
	int weight;
	int numberoflegs;
	int speed;
	String sound;


int getweight(){
	return weight;
}
void setweight(int new_weight){
	new_weight=1400;    //unit is in pounds
	weight=new_weight;
}


int getnumberoflegs(){
	return numberoflegs;
}
void setnumberoflegs(int new_numberoflegs){
	new_numberoflegs = 4;
	numberoflegs=new_numberoflegs;
}

int getspeed(){
	return speed;
}
void setspeed(int new_speed){
	new_speed = 8; //unit is in miles per hour
	speed=new_speed;
}
String getsound(){
	return sound;
}
void setsound(String new_sound){
	new_sound = "MOO!";
	sound=new_sound;
}
public String toString(){
return "COW!";
}
}




//Attributes to include
//	weight  //comment the unit
//	speed (m/s)
//	number or legs
//	sound

