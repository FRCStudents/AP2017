class Door{
	String color;
	boolean opened;
	int width;
	int height;

	String getcolor(){
		return color;
	}
	void setcolor(String nowcolor){
		color = nowcolor;
	}
	boolean getopened(){
		return opened;
	}
	void setopened(boolean nowopened){
		opened = nowopened;
	}
	int getwidth (){
		return  width;
	}
	void setwidth(int nowwidth){
		width = nowwidth;
	}
	int getheight(){
		return  height;
	}
	void setheight(int nowheight){
		height = nowheight;
	}
	public String toString(){
		return "LookADoor";
	}
	

}