import java.util.Scanner;
import java.io.*;
//import java.io.PrintWriter;
//import java.io.File;
//import java.io.IOException;

public class SerializationInterface{

  Serialization ser = new Serialization();
  public void sopl(String x){
    System.out.println(x);
  }

  public void sop(String x){
    System.out.print(x);
  }

  public void dispMenu() throws IOException{
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

  public void parseMenu(int x) throws IOException{
    if(x == 1){
      createPerson();
    } else if(x == 2){
      readPerson();
    } else if(x ==3){
      htmlize();
    } else if(x ==4){
      deletePerson();
    } else{
      parseError(x);
    }
  }

  public void continueQ() throws IOException{
    System.out.println("\n\n");
    Scanner sc = new Scanner(System.in);
    System.out.print("Would you like to continue in this program? (y/n) \n          >>");
    char answ = sc.next().charAt(0);
    if(answ == 'y'){
      System.out.println("\n\n\n");
      dispMenu();
    }else if (answ == 'n') {
      System.exit(0);
    } else {
      System.out.println("Error, please try again \n \n");
      continueQ();
    }
  }

  public void createPerson() throws IOException{
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
    continueQ();
  }

  public void readPerson() throws IOException{
    Scanner sc = new Scanner(System.in);
    System.out.print("What is the person's name? \n         >>");
    String name = sc.next();
    Person p = ser.deSerializePerson(name);
    System.out.println(p);
    continueQ();
  }

  public void deletePerson() throws IOException{
    Scanner sc = new Scanner(System.in);
    System.out.print("What is the name of the person contained in the file? \n         >>");
    String name = sc.next();
    String path = "./People/"+name+".ser";
    File file = new File(path);    
    file.delete();
    continueQ();
  }

  public void parseError(int x) throws IOException{
    sopl("Error, please chose an available option and try again");
    parseMenu(x);

  }

  public void htmlize() throws IOException{
    File file = null;
    Serialization ser = new Serialization();
    try {
      file = new File ("people.html");
      PrintWriter writer = new PrintWriter("people.html");
      String[] files = new File("./023- WorkFlow/People/").list();
      int len = files.length;
      writer.println("<HTML>");
      writer.println("  <head>");
      writer.println("   <link rel='shortcut icon' type='image/png' href='/favicon.png'>");
      writer.println("    <title> People! </title>");
      writer.println("    <link rel='stylesheet' type='text/css' href='style.css'>");
      writer.println("  </head>");
      writer.println("  <body>");
      writer.println("    <table>");
      writer.println("       <tr>");
      writer.println("         <th> Name </th>");
      writer.println("         <th> Age </th>");
      writer.println("         <th> Country </th>");
      writer.println("         <th> Sub-Region </th>");
      writer.println("         <th> Description </th>");
      writer.println("       </tr>");
      for(int i = 0; i < len; i++){
        Person temp = ser.deSerializePerson(files[i]);
        writer.println("       </tr>");
        writer.println("         <td> " + temp.getName() + " </td>");
        writer.println("         <td> " + temp.getAge() + " </td>");
        writer.println("         <td> " + temp.getCountry() + " </td>");
        writer.println("         <td> " + temp.getState() + " </td>");
        writer.println("         <td> " + temp.getInfo() + " </td>");
        writer.println("       </tr>");
      }
      writer.println("    </table>");
      writer.println("  </body>");
      writer.println("</HTML>");
      writer.close();
    } catch(IOException ex) {
      System.out.println("There is an IOException that was caught here!");
    }
    continueQ();
  }
}
