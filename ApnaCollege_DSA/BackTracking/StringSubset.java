package ApnaCollege_DSA.BackTracking;

public class StringSubset {
    public static void main(String[] args) {
        String str ="abc";
        findSubset(str, "", 0);
        System.out.println("Total subset count : "+ count(str, 0,""));
    }

    public static void findSubset(String str, String ans, int i){
        if(i == str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return ;
        }

        // yes
        findSubset(str, ans+str.charAt(i), i+1);

        // if no
        findSubset(str, ans, i+1);


    }

    public static int count(String str, int i, String ans){
        if(i== str.length()){
            return 1;
        }
        // if yes
        int countYes = count(str, i+1, ans+str.charAt(i));

        // if no
        int countNo = count(str, i+1, ans);

        return countYes+countNo;
    }
}
