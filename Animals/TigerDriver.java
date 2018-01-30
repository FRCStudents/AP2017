
class TigerDriver {
	static Tiger[] tArr = new Tiger[2];
	static Animal[] aArr = new Animal[2];

	public static void main(String[] argv){
		Tiger t = new Tiger();
		t.setSpeed(111);
		t.setHabitat("Dark Woods");
		aArr[0] = t;

		Tiger t2 = new Tiger();
		t2.setSpeed(46);
		t2.setWeight(512);
		t2.setHabitat("Light Woods");
		aArr[1] = t2;

		for(int i=0; i<2; i++){
			System.out.println(aArr[i]);
		}
	}
}
