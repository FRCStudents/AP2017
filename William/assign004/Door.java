public class Door{


	public Door(int h, int w, boolean  o, String c) {
		this.height=h;
		this.width=w;
		this.opened=o;
		this.color=c;
	}

	public Door() {

	}


	int height=4;

	int width=5;

	boolean opened=true;

	String color="green";

	public String toString() {
		return "height=" + this.height +
		  " width=" + this.width +
		  " opened=" + this.opened +
		  " color=" + this.color;
	}

	public void setOpened(boolean b){
		opened=b;
	}
	public boolean getOpened(){
		return opened;
	}
	public void setColor(String c){
		color=c;
	}
	public String getColor(){
		return color;		
	}

	public void setHeight(int h) {
		this.height=h;
	}
	public int getHeight() {
		return this.height;
	}
	public void setWidth(int w) {
		this.width=w;
	}
	public int getWidth() {
		return this.width;
	}


}