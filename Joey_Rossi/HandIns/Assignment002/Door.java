class Door {

	int width;
	int height;
	String style;
	String color;
	boolean opened;


	String getcurrent_color(){
		return color;
	}
	boolean getcurrent_doorstatus(){
		return opened;
	}
	int getwidth(){
		return width;
	}
	int getheight(){
		return height;
	}
	String getstyle(){
		return style;
	}
	void setCurrentColor(String newColor){
		color = newColor;
	}
	
	void setCurrentDoorStatus(boolean closed){
		opened = closed;
	}
	void setCurrentStyle(String newStyle){
		style = newStyle;
	}
	void setCurrentHeight(int newHeight){
		height = newHeight;
	}
	void setCurrentWidth(int newWidth){
		width = newWidth;
	}
	public String toString(){
		return "Yo whaddup I'm a door";
	}

}