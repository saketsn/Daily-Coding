package DSClass.src;

public class charCount {
    public static void main(String[] args) {
        String str = "geeks for geeks121";
        count(str);
    }

    public static void count(String str){
        int vowel =0,  consonant=0,  digit=0,  sc =0;
        if(str.length() == 0){
            System.out.println("Vowel = " + vowel);
            System.out.println("Consonant = " + consonant);
            System.out.println("Digit = " + digit);
            System.out.println("SC = "+ sc);
            return ;
        }
        String strL = str.toLowerCase();

        for(int i=0; i< strL.length(); i++){
            if(strL.charAt(i) >='0' && strL.charAt(i) <= '9'){
                digit++;
            }else if(strL.charAt(i) == 'a' || strL.charAt(i) == 'e' || strL.charAt(i) == 'i' || strL.charAt(i) == 'o' || strL.charAt(i) == 'u'){
                vowel++;
            }else if((strL.charAt(i) >= 'a' && strL.charAt(i) <= 'z') &&  (strL.charAt(i) != 'a' && strL.charAt(i) != 'e' && strL.charAt(i) != 'i' && strL.charAt(i) != 'o' && strL.charAt(i) != 'u')){
                consonant++;
            }else{
                sc++;
            }
        }

        System.out.println("Vowel = " + vowel);
        System.out.println("Consonant = " + consonant);
        System.out.println("Digit = " + digit);
        System.out.println("SC = "+ sc);
    }
}
