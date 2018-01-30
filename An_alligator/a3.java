public class a3 extends vehicle{
	a3(){
		super(4,2017,"Audi","A3","hatchback","fwd","default");
	}

	a3(String a){
		super(4,2017,"Audi","A3","suv","awd",a);
	}

	a3(int a,int b){
		super(4,a,"Audi","A3","suv","awd","default");
		super.setTrim(this.getCTrim(b));
	}

	String getCTrim(int a){
		switch (a){
			case 0:
			return "2.0T";
			case 1:
			return "3.2 S Line";
		}
		return "defualt";
	}
}