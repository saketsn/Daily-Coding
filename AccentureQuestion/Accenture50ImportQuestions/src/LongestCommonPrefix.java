/*
Within a collection of strings, your task is to employ Binary Search to identify the longest
common prefix. Devise a solution that efficiently determines the shared prefix among the given
strings, utilizing the principles of Binary Search.
Example:
Input: strings = ["flower", "flow", "flight"]
Output: Longest Common Prefix: 'fl'
 */
package AccentureQuestion.Accenture50ImportQuestions.src;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: '" + longestCommonPrefix(words) + "'");
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        // Step 1: Find the minimum string length
        int minLen = Integer.MAX_VALUE;
        for (String s : strs) {
            minLen = Math.min(minLen, s.length());
        }

        int low = 1, high = minLen;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isCommonPrefix(strs, mid))
                low = mid + 1; // Try for a longer prefix
            else
                high = mid - 1; // Try for a shorter prefix
        }

        // The longest prefix length will be (low + high) / 2
        int prefixLen = (low + high) / 2;
        return strs[0].substring(0, prefixLen);
    }

    // Helper function to check if all strings share a common prefix of length 'len'
    private static boolean isCommonPrefix(String[] strs, int len) {
        String prefix = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(prefix))
                return false;
        }
        return true;
    }
}
