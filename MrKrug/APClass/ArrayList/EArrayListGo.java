
public class EArrayListGo {
    public static void main(String argv[]){
        EArrayList aList = new EArrayList();
        aList.addElt(87);
        aList.addElt(23);
        aList.addElt(109);
	aList.display();
	System.out.println("Notice: the ArrayList is now " + aList.getLength() + " Elements long.");
        aList.changeElt(99, 1);
	aList.addElt(613);
        aList.display();
  	System.out.println("Notice: the ArrayList is now " + aList.getLength() + " Elements long.");
  	}

}
