public class Door{

	int Width;
	int Height;
	String Color;
	boolean Opened;
	
	String getColor(){
		return Color;
	}
	void setColor(String New_Color){
		Color = New_Color;
	}

	
	int getHeight(){
		return Height;
	}
	void setHeight(int New_Height){
		Height = New_Height;
	}

	
	int getWidth(){
		return Width;
	}
	void setWidth(int New_Width){
		Width = New_Width;
	}


	

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