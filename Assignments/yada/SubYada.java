
class SubYada extends Yada {
	String subYadaName = "";
	public SubYada(){
		super(7);
		subYadaName = getIth(3);
	}

	public void setIth(int i, String thing){
		yada[i] = "SUBYADA: " + thing;
	}
}
