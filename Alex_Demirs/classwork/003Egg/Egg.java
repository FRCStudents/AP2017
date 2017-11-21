class Egg {
	
	boolean Fertilized = false;
	String Color = "Brown";
	

	boolean getFertilized() {
		return Fertilized;
	}
	
	void setFertilized(boolean new_Fertilized){
		Fertilized = new_Fertilized;
	}

	String getColor (){
		return Color;
	}
	
	void setColor(String New_Color){
		Color = New_Color;
	}
	

    
	String toString;
   		 public String toString(){
   		 return"This is a Brown Egg";
   	}
	
}