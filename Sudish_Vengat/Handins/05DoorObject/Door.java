public class Door {
	String color = "white";
	int width = 15;
	int height = 30;
	Boolean Opened = true;
	String current_color = "white";
	String getCurrent_Color () {
		return current_color;
	}
	void setCurrentColor(String newColor) {
	current_color = newColor; 
	}
	int current_width = 15;
	int getCurrentWidth () {
		return current_width;
	}
	void setCurrentWidth(int newWidth) {
	current_width = newWidth;
	}
	Boolean getOpened() {
		return Opened;
	}
	void setOpened(Boolean newOpened) {
	opened = newOpened;
	}
	int current_height = 30;
	int getCurrentHeight () {
		return current_height;
	}
	void setCurrentHeight(int newHeight) {
	current_height = newHeight;
	}
}