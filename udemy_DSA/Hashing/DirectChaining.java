package udemy_DSA.Hashing;

import java.util.LinkedList;

public class DirectChaining {

    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    DirectChaining(int size){
        hashTable = new LinkedList[size];
    }

    public int modASCIIHashFunction(String word, int M){
        char ch[] = word.toCharArray();
        int i, sum;
        for(sum =0, i=0; i<word.length(); i++){
            sum = sum + ch[i];
        }
        return sum % M;
    }

    public void insertHashTable(String word){
        int newIndex = modASCIIHashFunction(word, hashTable.length);

    }

}
