public class Door {
	
	String Color = "white";
	Boolean Opened = true;
	int Wide = 7;
	int Height = 9;


	String getCurrentColor(){
		return Color;
	}

	void setCurrentColor(String newColor){
		Color = newColor;
	}

	Boolean getCurrentOpened(){
		return Opened;
	}

	void setCurrentOpened(Boolean newOpened){
		Opened = newOpened;
	}

	int getCurrentWide(){
		return Wide;
	}

	void setCurrentWide(int newWide){
		Wide = newWide;
	}

	int getCurrentHeight(){
		return Height;
	}

	void setCurrentHeight(int newHeight){
		Height = newHeight;
	}
}