package udemy_DSA.Trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    Map<Character, TrieNode> childern;
    boolean endOfString;

    public TrieNode() {
        childern = new HashMap<>();
        endOfString = false;
    }
}
