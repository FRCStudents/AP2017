class AC{
	int AC0;
	int AC1;

	public void prt(int x){
		System.out.println(x);
	}

	public void prt(String x){
		System.out.println(x);
	}

	public void prt(int x,int y){
		if(y==1){
			System.out.println(x);
		}else{
			System.out.print(x);
		}
	}

	public void prt(String x,int y){
		if(y==1){
			System.out.println(x);
		}else{
			System.out.print(x);
		}
	}

	public void putInBox(){
		int width = (int)(Math.log10(AC0)+3);
		for(int x=0; x<3; x++){
			for(int y=0; y<width; y++){
				if(x==1 && y==0){
					prt("*",0);
					prt(AC0,0);
					prt("*",0);
					y=width;
				}else{
					prt("*",0);
				}
			}
			prt("");
		}
	}

	public void turnOnAC(){
	}

	public void turnOffAC(){
	}

	public int getAC(){
		return AC0;
	}
}
