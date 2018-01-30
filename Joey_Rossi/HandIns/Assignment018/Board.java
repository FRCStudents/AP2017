import java.util.*;

class Board {
    private boolean empty;
    private char type;

    public Board(boolean e, char t) {
        empty = e;
        type = t;
    }

    public Board() {
        empty = true;
        type = 'x';
    }

    public String toString() {
        if (!empty) {
            return Character.toString(type);
        } else {
            return " ";
        }
    }

    public void setType(char t) {
        type = t;
        empty = false;
    }
}