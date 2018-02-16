public class bepis{


	public void dios(int y){
		if(y%6==0){
			System.out.println("ha 6 divisiehroi aduahfde");
		}else{
			System.out.println("bummer and a half");
		}
	}

	public void bepsi(String t){
		System.out.println("This is the \"string\", you know:"+t);
	}

	public String printeThingey(){
		return "Yo, Dudele!";
	}
	public char stc(String x){
		return x.charAt(0);
	}


	public boolean dat_boii(String x){
		char y = x.charAt(0);
		char[] vowels = new char[]{stc("a"),stc("e"),stc("i"),stc("o"),stc("u")};
		for(int i=0; i<vowels.length; i++){
			if(vowels[i]==y){
				return true;
			}
		}
		return false;
	}


	public void oiu(String x){
		if(dat_boii(x)){
			System.out.println("whew");
		}else{
			System.out.println("drag");
		}
	}

	public static void main(String[] args)throws InterruptedException{
		bepis x= new bepis();
		System.out.println(x.printeThingey());
		x.dios(6);
		x.bepsi("dioasjfias");
		x.oiu("awe");
	}
}	