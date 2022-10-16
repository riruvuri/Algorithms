package medium11.prefix_trie;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> childNodeMap;
    boolean isLastWord;

    TrieNode(Map<Character, TrieNode> childNodeMap, boolean isLastWord) {
        this.childNodeMap = childNodeMap;
        this.isLastWord = isLastWord;
    }

    TrieNode() {
        this.childNodeMap = new HashMap<>();
        this.isLastWord = false;
    }
}

public class Trie {
    TrieNode root = null;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode currentNode = root;
        for (int i=0; i < word.length(); i++) {
            if (!currentNode.childNodeMap.containsKey(word.charAt(i))) {
                currentNode.childNodeMap.put(word.charAt(i), new TrieNode());
            }
            TrieNode childNode = currentNode.childNodeMap.get(word.charAt(i));
            if (i == word.length()-1) {
                currentNode.isLastWord = true;
            }
            currentNode = childNode;
        }

    }

    public boolean search(String word) {
        TrieNode currentNode = root;

        for (int i=0; i < word.length() && currentNode != null; i++) {
            if (!currentNode.childNodeMap.containsKey(word.charAt(i))) {
                return false;
            }
            if (i == word.length()-1 && !currentNode.isLastWord) {
                return false;
            }
            currentNode = currentNode.childNodeMap.get(word.charAt(i));

        }
        return true;
    }

    public boolean startsWith(String prefix) {
        TrieNode currentNode = root;

        for (int i=0; i < prefix.length() && currentNode != null; i++) {
            if (!currentNode.childNodeMap.containsKey(prefix.charAt(i))) {
                return false;
            }
            currentNode = currentNode.childNodeMap.get(prefix.charAt(i));

        }
        return true;
    }
}