
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
		System.out.println("------------------------------");
		System.out.println("NOTICE: Some of these methods and attributes are");
		System.out.println("being accessed via the class name - not the instance name!"); 
			
		System.out.println("-- set direct: ");
		SObj.pubStatInt = 3;
		System.out.println("Direct access: " + so3.pubStatInt);
		SObj.incPubStatInt();
		System.out.println("Even more direct: " + SObj.pubStatInt);
		System.out.println("And Very direct: " + SObj.getPubStatInt());
		System.out.println("By the way, we have " + SObj.SObjCount + " SObj objects!");
	}
}
