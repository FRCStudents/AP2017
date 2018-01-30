class SAGo {
    public static void main(String[] args) {
        StringAnalyzer a = new StringAnalyzer(args[0]);
        System.out.println(a.getOriginal());
        System.out.println(a.getNoSpaces());
        System.out.println(a.getIncreased());
    }
}