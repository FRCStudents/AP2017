
public class Chain {
	AC[] Chain = new AC[5];

	public Chain(){
		Chain[0] = new LittleAC();
		Chain[1] = new BigAC();
		Chain[2] = new VeryBigAC();
		Chain[3] = new LittleAC();
		Chain[4] = new VeryBigAC();
	}

	public void turnOnMembers(){
		for(int i=0; i < 5; i++){
			Chain[i].turnOnAC();
		}
	}

	public void showChain(){
		System.out.println("\n********************************\n");
		for(int i=0; i < 5; i++){
			Chain[i].putInBox();
		}
	}
}
