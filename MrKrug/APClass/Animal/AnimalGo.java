
public class AnimalGo{
     static Animal[] animalList = new Animal[4];
     public static void display(){
        for(int i=0; i<animalList.length; i++){
		System.out.println(animalList[i]);
	}
     }

     public static void talkingStuff(){
	for(int i=0; i<animalList.length; i++){
		System.out.println(animalList[i].getSpeech());
	}
     }

     public static void main(String [] argv){
     	animalList[0] = new Tiger();
	animalList[1] = new Lion();
	animalList[2] = new Dog();
        animalList[3] = new Mouse();
        display();
   	talkingStuff();
     }
}
