package udemy_DSA.Trie;

public class Trie {
    private TrieNode root;

    public Trie(){
        root = new TrieNode();
        System.out.println("The trie node has been created");
    }

    public void insert(String word){
        TrieNode current = root;
        for(int i=0; i< word.length(); i++){
            char ch = word.charAt(i);
            TrieNode node = current.childern.get(ch);
            if(node == null){
                node = new TrieNode();
                current.childern.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;
        System.out.println("Successfully inserted " + word + " in Trie.");
    }

}
