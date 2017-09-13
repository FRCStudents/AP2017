class Door{
	private String color;
	private int height;
	private int width;
	private boolean opened;

	public void setColor(String newColor){
		color = newColor;
	}
	public String getColor(){
		return color;
	}

	public void setHeight(int newHeight){
		height = newHeight;
	}
	public int getHeight(){
		return height;
	}

	public void setWidth(int newWidth){
		width = newWidth;
	}
	public int getWidth(){
		return width;
	}

	public void setOpened(boolean newOpened){
		opened = newOpened;
	}
	public boolean getOpened(){
		return opened;
	}

	public String toString(){
		return "I am a door";
	}
}