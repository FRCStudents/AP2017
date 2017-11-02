class StringAnalyzer {
    private String originalString = "";
    private String noSpaces = "";
    private String increased = "";
    final int OFFSET_AMOUNT = 2;

    private String alphabet = "abcdefghijklmnopqrstuvwxyzab"; // ab added at end so that i dont have to deal with dumb logic for increasing y and z

    public StringAnalyzer(String str) {
        // setting up base values
        originalString = str.toLowerCase();
        noSpaces = originalString.replaceAll("\\s+","");

        // increased
        String placeholder = "";
        for (int i = 0; i < originalString.length(); i++) {
            if (originalString.charAt(i) != ' ') {
                placeholder += alphabet.charAt(alphabet.indexOf(originalString.charAt(i)) + OFFSET_AMOUNT);
            } else {
                placeholder += originalString.charAt(i);
            }
        }
        increased = placeholder;
    }

    public String getOriginal() {
        return originalString;
    }
    public String getNoSpaces() {
        return noSpaces;
    }
    public String getIncreased() {
        return increased;
    }
}