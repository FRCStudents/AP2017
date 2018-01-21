
class SObjGo {
	public static void main(String[] argv){
		System.out.println("Create so");
		SObj so = new SObj();
		System.out.println("so: " + so.getStaticInt());
		System.out.println("Create so2");
		SObj so2 = new SObj();
		System.out.println("so2: " + so2.getStaticInt());
		System.out.println("Calling upStaticInt on so2 two times");
		so2.upStaticInt();
		so2.upStaticInt();
		System.out.println("so after the 2 calls: " + so.getStaticInt());
		System.out.println("so: " + so.getStaticInt());
		System.out.println("Create so3");
		SObj so3 = new SObj();
		System.out.println("so: " + so.getStaticInt());
		System.out.println("so2: " + so2.getStaticInt());
		System.out.println("so3: " + so3.getStaticInt());
	}
}
