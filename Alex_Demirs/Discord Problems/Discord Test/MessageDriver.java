public class MessageDriver{

public static void main (String [] rgv){

NiceMessage n = new NiceMessage();
n.setMessage("have a nice day");
n.readMessage();
MeanMessage m = new MeanMessage();
m.setMessage("U r bad");
m.readMessage();
AbusiveMessage a = new AbusiveMessage();
a.setMessage("U r really bad");
a.readMessage();


}



}