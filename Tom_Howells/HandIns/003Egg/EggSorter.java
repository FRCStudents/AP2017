class EggSorter{
	public static void main(String[] args){
		Egg egg1 = new Egg();
		Egg egg2 = new Egg();

		egg1.setFertilized(true);
		egg1.setColor("brown");

		egg2.setFertilized(false);
		egg2.setColor("white");

		System.out.println(egg1);
		System.out.println(egg2);
	}
}