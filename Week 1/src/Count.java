public class Count {
    public String word;
    public char key;

    Count(String w, char k) {
        word = w;
        key = k;
    }

    public void countElement() {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (key == word.charAt(i)) {
                count++;
            }
        }
        System.out.println("There is " + count + " " + key + " " + "in " + word);
    }
}
