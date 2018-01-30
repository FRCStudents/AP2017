public class ArrListGo {
    public static void main(String argv[]){
        ArrList aList = new ArrList();
        aList.changeElt(87,0);
        aList.changeElt(23,1);
        aList.changeElt(109,2);
        aList.changeElt(99,3);
        aList.display();
    System.out.println("Notice the length: " + aList.getLength());
    aList.addElt(613);
    aList.display();
    System.out.println("Notice the length: " + aList.getLength());
        }

}
