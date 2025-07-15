package TCSQuestions;

public class CharFrequency {
    public static void main(String[] args) {
        String input = "hello world";
        int[] freq = new int[256];

        for(int i=0; i< input.length(); i++){
            char ch = input.charAt(i);
            if(ch !=' '){
                freq[ch]++;
            }
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }
    }
}
