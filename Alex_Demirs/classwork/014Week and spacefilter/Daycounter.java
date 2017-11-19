public class Daycounter{

	String[] Days={
		"Sunday",
		"Monday",
		"Tuesday",
		"Wensday",
		"Thursday",
		"Friday",
		"Saturday",
	};


public void CountForward(){
int x;
	for(x=0;x<6;x++){
		System.out.println(Days[x]);
	}
}
public void CountBackward(){
int x;
	for(x=6;x>-1;x--){
		System.out.println(Days[x]);
	}
}
}