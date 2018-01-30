
public class AnimalGo{
     static Animal[] animalList = new Animal[4];
     public static void displayRecursive(int i){
        if (i < 0) return;
        System.out.println(animalList[i]);
        displayRecursive(i - 1);
     }

     public static void displayRecursive2(int i){
        if (i < 0) return;
	displayRecursive2(i - 1);
        System.out.println(animalList[i]);
     }

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
//	display();
        displayRecursive(animalList.length - 1);
	displayRecursive2(animalList.length - 1);
   	talkingStuff();
     }
}
