
public class FArrayListGo {
    public static void main(String argv[]){
        FArrayList aList = new FArrayList();
	aList.fillArray();
	aList.display();
	System.out.println("Delete 2nd and 3rd elements - that is - i and i+1");
	aList.killTwo(2);
        aList.display();
  	System.out.println("Notice: the ArrayList is now " + aList.getLength() + " Elements long.");
	aList.killTwoBack(6);
	aList.display();
  	}

}
