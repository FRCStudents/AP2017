class Problem5 {
	public static void firstMethod(){
		if(secondMethod("ExDe")){
			System.out.println("Whew");
		} else {
			System.out.println("drag");
		}
	}
	public static boolean secondMethod(String str){
		char[] vowels = {'a','e','i','o','u','y','A','E','I','O','U','Y'};
		for(int i = 0; i < vowels.length; i++){
			if(str.charAt(0) == vowels[i]){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] argv){
		firstMethod();
	}
}