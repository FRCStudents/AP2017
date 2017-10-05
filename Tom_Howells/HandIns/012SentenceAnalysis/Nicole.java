// finds spaces in String s

class Nicole {
    private String s;

    public Nicole(String x){
        s = x;
    }

    public int findSpaces(){
        int spaces = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.substring(i).charAt(0) == ' '){
                spaces++;
            }
        }
        return spaces;
    }
}