package Algorithm.easy;

class ReverseString {
    public String reverseWords(String s){
        String[] words = s.split(" ");
        for(String word: words){
            word = reverseWord(word);
            System.out.printf(word+" ");
        }

        return String.join(" ",words);
    }

    private String reverseWord(String s) {

        char[] letters = s.toCharArray();
        s="";
        for(int i=letters.length-1;i>=0;i--){
            s=s+letters[i];
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(5);
    }

}
