public class StringOperations {
    private String str;
    public StringOperations(String str) {
        this.str = str.toLowerCase();
    }

    public int countVowels(){
        int count = 0;
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1)
                count++;
        }
        return count;
    }

    public int countConsonants() {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1)
                count++;
        }
        return count;
    }


}
