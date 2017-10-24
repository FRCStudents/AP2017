class Egg {
	
	boolean Fertilized = false;
	String Color = "Brown";
	
//Fertilization
	boolean getFertilized() {
		return Fertilized;
	}
	
	void setFertilized(boolean new_Fertilized){
		Fertilized = new_Fertilized;
	}
	
//Color
	String getColor (){
		return Color;
	}
	
	void setColor(String New_Color){
		Color = New_Color;
	}
	
//String2String
    
	String toString;
   		 public String toString(){
   		 return"I found an egg";
   	}
	
}