
class Yada {
	String [] yada ;
	int maxYada = 0;

	public Yada(int maxYada){
		yada = new String[maxYada];
		this.maxYada = maxYada;
		initYada();
	}

	public Yada(){
		this(5);
	}

	private void initYada(){
		for(int i=0; i<maxYada; i++){
			if (i % 2 == 0){
				yada[i] = "This";
			} else {
				yada[i] = "That";
			}
		}
	}

	public String getIth(int i){
		return yada[i];
	}

	public void setIth(int i, String thing){
		yada[i] = thing;
	}

 	public void showYada(){
		for(int i=0; i<maxYada; i++){
			System.out.println("[" + i + "]" + yada[i]);
		}
	}

}

