class Box{
	int Height;
	String Color;
	boolean Opened;

	int getHeight(){
		return Height;
	}
	void setheight(int nowHeight){
		Height = nowHeight;
	}
	String getColor(){
		return Color;
	}
	void setColor(String nowColor){
		Color = nowColor;
	}
	boolean getOpened(){
		return Opened;
	}
	void setOpened(boolean nowOpened){
		Opened = nowOpened;
	}
	public String toString (){
		return "ItsLit";
	}
}