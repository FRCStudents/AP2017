import java.util.*;

class Square {
    private boolean empty;
    private char type;

    public Square(boolean e, char t) {
        empty = e;
        type = t;
    }

    public Square() {
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