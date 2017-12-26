
class EYEYada {
	Yada[] yadaArr = new Yada[7];
	public EYEYada(){
		for(int i=0; i < 7; i++){
			if(i % 2 == 0){
				yadaArr[i] = new Yada();
				yadaArr[i].calcProperYadaNumber(i);
			} else {
				yadaArr[i] = new EYada();
				yadaArr[i].calcProperYadaNumber(i);
			}
		}
	}

	public String toString(){
		String s = "";
		for(int i=0; i < 7; i++){
			s += "\n" + yadaArr[i];
		}
	   return s;
	}
}
