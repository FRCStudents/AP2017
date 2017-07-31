import bball.SubModel;
import bball.BBooks;

import java.util.*;
/******************************************
 * playing with inheritence
 * checking an arrayList made up of both
 * parent and children Objects
 ******************************************/
class tryStuff {
  SubModel sub;
  BBooks b;
  ArrayList<SubModel> al = new ArrayList<SubModel>();

  public tryStuff(){
    SubModel temp = new SubModel();
    sub = new SubModel();
    al.add(sub);
    sub.setType("SubModel");
    b = new BBooks();
    al.add(b);
  }
  public SubModel getSub(){
    return sub;
  }
  public ArrayList<SubModel> getAL(){
    return al;
  }
}

class tryIt {
  public static void main (String[] args){
      tryStuff tS = new tryStuff();
      System.out.println("Successful\n" + tS.getSub().getType());
      ArrayList<SubModel> al = tS.getAL();
      System.out.println("Printing list");
      for(int i=0; i < al.size(); i++){
        System.out.println(al.get(i).getType());
      }
    }
}
