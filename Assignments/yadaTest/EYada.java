
class EYada extends Yada {
	String eYadaString = "";
	int eYadaNumber = 0;

	public EYada(){
		super();
		eYadaString = "E--Yada";
		eYadaNumber = 7;
	}

	@Override
        public void calcProperYadaNumber(int x){
                yadaNumber = (x * 8) + 138;
        }

	public void setBigYadaNumber(int x){
		bigYadaNumber = x;
	}

	public String toString(){
		return yadaString + "[" + eYadaString + "]" + " " + yadaNumber + "[" + eYadaNumber + "]";
	}
}

