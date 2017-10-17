public class Book{

	int PageNumber;
	String Title;
	String Color;
	boolean Finished;
	boolean HardCover;

	int getPageNumber(){
		return PageNumber;
	}
	void setPageNumber(int New_PageNumber){
		PageNumber = New_PageNumber;
	}
	String getTitle(){
		return Title;
	}
	void setTitle(String New_Title){
		Title = New_Title;
	}
	String getColor(){
		return Color;
	}
	void setColor(String New_Color){
		Color = New_Color;
	}
	boolean getFinished(){
		return Finished;
	}
	void setFinished(boolean New_Finished){
		Finished = New_Finished;
	}
	boolean getHardCover(){
		return HardCover;
	}
	void setHardCover(boolean New_Hardcover){
		HardCover = New_Hardcover;
	}
	public String toString(){
		return "You finished the Book!";
	}

}