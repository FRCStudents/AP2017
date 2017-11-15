class Car{
	int wheels=4;
	String drive="2";
	int current_speed=30;

//directions "n", "s", "e","w"
//method attribute
String current_direction="n";

String getcurrent_direction(){
	return current_direction; 
}


void setcurrent_direction(String new_direction){
	current_direction = new_direction;
}

int getcurrent_speed() {
	return current_speed;
}

void setcurrent_speed(int new_speed){
	current_speed = new_speed;
}




}
