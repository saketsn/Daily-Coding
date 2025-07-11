package TCSQuestions.src;

public class RemoveA {

    // Recursive function to remove all 'a' characters
    static void skip(String ansArr, String inputArr) {
        if (inputArr.isEmpty()) {
            System.out.println("Result after removing 'a': " + ansArr);
            return;
        }

        char ch = inputArr.charAt(0);

        if (ch == 'a') {
            // Skip the character 'a'
            skip(ansArr, inputArr.substring(1));
        } else {
            // Include the current character and process the rest
            skip(ansArr + ch, inputArr.substring(1));
        }
    }

    // Main method
    public static void main(String[] args) {
        String original = "baccad";
        System.out.println("Original string: " + original);
        skip("", original);  // Start with empty answer string
    }
}
