public class forester extends vehicle{

	forester(){
		super(4,2017,"Subaru","Forester","suv","awd","2.5X");
	}

	forester(String a){
		super(4,2017,"Subaru","Forester","suv","awd",a);
	}

	forester(int a,int b){
		super(4,a,"Subaru","Forester","suv","awd","default");
		super.setTrim(this.getCTrim(b));
	}

	String getCTrim(int a){
		switch (a){
			case 0:
			return "2.5X";
			case 1:
			return "2.5XS";
			case 2:
			return "2.5XT";

		}
		return "defualt";
	}
}