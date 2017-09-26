public class Door{

	int Width;
	int Height;
	String Color;
	boolean Opened;
	
//Color
	
	String getColor(){
		return Color;
	}
	void setColor(String New_Color){
		Color = New_Color;
	}

//Height
	
	int getHeight(){
		return Height;
	}
	void setHeight(int New_Height){
		Height = New_Height;
	}

//Width
	
	int getWidth(){
		return Width;
	}
	void setWidth(int New_Width){
		Width = New_Width;
	}

//Opened
	

	boolean getOpened(){
		return Opened;
	}
	void setOpened(boolean New_Opened){
		Opened = New_Opened;
	}
  String toString;
	public String toString(){
	return"This Door Does Not Close";
	}


	}

