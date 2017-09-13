public class Door{
	String Color;
	boolean Opened;
	int Width;
	int Height;

	String getColor(){
			return Color;
	}
	void setColor(String New_Color){
			Color = New_Color;
	}
	boolean getOpened(){
		return Opened;
	}
	void setOpened(boolean New_Opened){
		Opened = New_Opened;
	}
	int getWidth(){
		return Width;
	}
	void setWidth(int New_Width){
		Width = New_Width;
	}
	int getHeight(){
		return Height;
	}
	void setHeight(int New_Height){
		Height = New_Height;
	}

}