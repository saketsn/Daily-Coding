package TCSQuestions.src;

public class Subseq {
    public static void main(String[] args) {
            subseq(" ", "abc");
    }

    static void subseq(String ansStr, String oriStr){
        if(oriStr.isEmpty()){
            System.out.println(ansStr);
            return;
        }

        char ch = oriStr.charAt(0);
        subseq(ansStr + ch, oriStr.substring(1));
        subseq(ansStr, oriStr.substring(1));



    }
}
