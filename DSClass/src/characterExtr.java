package DSClass.src;

public class characterExtr {
    public static void main(String[] args) {
        String str = "H_/*&e+-%ll*$$o";

        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) >= 'A' &&  str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                System.out.print(str.charAt(i));
            }

        }
        System.out.println();

        String str3 = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str3);
    }
}
