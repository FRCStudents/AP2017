public class MeanMessage extends Message{

public MeanMessage(){
this.message = "You do not look good today";
}

protected void sayThing(){
System.out.println(message);
}

}
