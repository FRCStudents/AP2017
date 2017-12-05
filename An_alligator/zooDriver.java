public class zooDriver{
	public static void main(String[] args){

		zoo[] zoo=new zoo[4];

		snake snake=new snake("green",true);

		System.out.println(snake.color);

		zoo[0]=snake;
		System.out.println(zoo[0].color);

	}
}