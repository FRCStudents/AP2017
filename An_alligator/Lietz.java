class Lietz{
	public double DMScon(int D,int M, int S){
		return D+M/60+S/3600;
	}
	public static void main(String[] args){
		Lietz l = new Lietz();
		System.out.println(l.DMScon(9,30,45));
	}
}