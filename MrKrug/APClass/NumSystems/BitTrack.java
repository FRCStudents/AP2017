/*
 * This is over the top for the AP Exam - but it's
 * good to know in terms of programmer skills.
 * 
 * This is a simple demonstration of how you can use
 * a short as an array of 8 bits - or yes/no switches
 */

class BitTrack {
	public static void main(String argv[]){
		short maskHold = 0;
		short ThirdSpot = 8;
		short FifthSpot = 32;

		/* assume we are only using two spots on our mask */

		System.out.println("Mask: " + maskHold);
                System.out.println("Mask changed: " + maskHold);
                if((maskHold & FifthSpot) > 0){
                        System.out.println("\tFifth Spot is turned on");
                        }
                if((maskHold & ThirdSpot) > 0){
                        System.out.println("\tThird Spot is turned on");
                        }

		maskHold = (short)(maskHold | ThirdSpot);
		System.out.println("Mask changed: " + maskHold);
		if((maskHold & FifthSpot) > 0){
			System.out.println("\tFifth Spot is turned on");
			}
		if((maskHold & ThirdSpot) > 0){
			System.out.println("\tThird Spot is turned on");
			}

		maskHold = (short)(maskHold | FifthSpot);
                System.out.println("Mask changed: " + maskHold);
                if((maskHold & FifthSpot) > 0){
                        System.out.println("\tFifth Spot is turned on");
                        }
                if((maskHold & ThirdSpot) > 0){
                        System.out.println("\tThird Spot is turned on");
                        }
	}

}		
