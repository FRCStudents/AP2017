import java.util.Scanner;

public class SerializationInterface{

  Serialization ser = new Serialization();
  public void sopl(String x){
    System.out.println(x);
  }

  public void sop(String x){
    System.out.print(x);
  }

  public void dispMenu(){
    sopl("+~~~~~~~~~~~~~~~~~~~~~~~~+");
    sopl("+~  1. Create Person    ~+");
    sopl("+~   2. Read Person     ~+");
    sopl("+~  3. Delete Person    ~+");
    sopl("+~~~~~~~~~~~~~~~~~~~~~~~~+");

    sop(" > What would you like to do? \n      >>> ");
    Scanner sc =new Scanner(System.in);
    parseMenu(sc.nextInt());
  }

  public void parseMenu(int x){
    if(x == 1){
      createPerson();
    } else if(x == 2){
      readPerson();
    } else if(x ==3){
      deletePerson();
    } else{
      parseError();
    }
  }

  public void createPerson(){
    sop("\nWhat is the persons name? \n      >>> ");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    sop("\nWhat is " + name+ "'s Age? \n      >>> ");
    int age = sc.nextInt();
    sop("\nWhat is " + name+ "'s current nation of residence? \n      >>> ");
    String country = sc.next();
    sop("\nWhat is " + name+ "'s State inside of "+ country +"? \n      >>> ");
    String state = sc.next();
    sop("\nWhat info or description would you like to give " + name+ "? \n      >>> ");
    String info = sc.next();
    Person placeH = new Person(name,age,country,state,info);
    ser.SerializePerson(placeH);

  }

  public void readPerson(){
    sopl("read");
  }

  public void deletePerson(){
    sopl("Delete");
  }

  public void parseError(){
    sopl("error");
  }
}
