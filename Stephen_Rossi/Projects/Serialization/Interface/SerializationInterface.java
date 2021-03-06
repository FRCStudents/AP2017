import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

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
    sopl("+~  3. Show in HTML     ~+");
    sopl("+~  4. Delete Person    ~+");
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
      htmlize();
    } else if(x ==4){
      deletePerson();
    } else{
      parseError();
    }
  }

  public void createPerson(){
    Scanner sc = new Scanner(System.in);
    sop("\nWhat is the persons name? \n      >>> ");
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
  Scanner sc = new Scanner(System.in);
  System.out.print("What is the person's name? \n         >>");
  String name = sc.next();
	Person p = ser.deSerializePerson("/People/" + name);
  System.out.println(p);
  }

  public void deletePerson(){
    sopl("Delete not updated");
  }

  public void parseError(){
    sopl("error");
  }

  public void htmlize(){
    PrintWriter writer = new PrintWriter("people.html", "UTF-8");
    writer.println("<HTML>");
    writer.println("  <head>");
    writer.println("    <title> People! </title>");
    writer.println("    <link rel='stylesheet' type='text/css' href='style.css'>");
    writer.println("  </head>");
    writer.println("  <body>");
    writer.println("    <table>");
    writer.println("      <tr>");
    writer.println("       <th> Name </th>");
    writer.println("       <th> Age </th>");
    writer.println("       <th> Country </th>");
    writer.println("       <th> Sub-Region </th>");
    writer.println("       <th> Description </th>");
    writer.println("      <tr>");
    writer.close();)
    System.out.println(new File("Documents/Github").list().length);

  }
}
