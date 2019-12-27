package ifs;

public class Text {

    private char[] letters = new char[40];
    private int index = 0;

    public void add(char letter) {
        if (index == letters.length) {
            char newLetters[] = new char[letters.length * 2];
            for (int i = 0; i < letters.length; i++) {
                newLetters[i] = letters[i];
            }

            letters = newLetters;
        }

        letters[index++] = letter;
    }

    public char get(int index) {
        checkIndex(index);
        return letters[index];
    }

    public void remove(int position) {
        checkIndex(position);
        for (int i = position; i < index; i++) {
            letters[i] = letters[i + 1];
            // todo: fix if some error occurs
        }
        index--;
    }

    public void set(char letter, int position) {
        checkIndex(position);
        letters[position] = letter;
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public int indexOf(char ch) {
        for (int i = 0; i < index; i++) {
            if (ch == letters[i]) {
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(char ch) {
        for (int i = index - 1; i >= 0; i--) {
            if (ch == letters[i]) {
                return i;
            }
        }

        return -1;
    }

    public boolean contentEquals(Text text) {
        if (index != text.index) {
            return false;
        }

        for (int i = 0; i < index; i++) {
            if (letters[i] != text.letters[i]) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < index; i++) {
            str += letters[i];
        }
        return str;
    }

    private void checkIndex(int position) {
        if (position < 0 || position >= this.index) {
            System.err.println("Incorrect index: " + position);
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        Text t = new Text();
        System.out.println(t.isEmpty());

        t.add('a');
        t.add('p');
        t.add('p');
        t.add('l');
        t.add('e');

        System.out.println(t);
        System.out.println(t.get(2));
        System.out.println(t.size());

        System.out.println(t.isEmpty());

        t.remove(0);
        t.add('x');

        String s;

        System.out.println(t);

        Text t2 = new Text();
        t2.add('x');

        System.out.println(t.contentEquals(t2));

    }
}
