package word_search_trie;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class TrieNode {
    public boolean isWord;
    public List<String> cands;
    Map<Character, TrieNode> children;
    public TrieNode() {
        isWord = false;
        children = new HashMap<Character, TrieNode>();
        cands = new LinkedList<String>();
    }
}

public class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i ++) {
            Map<Character, TrieNode> children = node.children;
            char c = word.charAt(i);
            if (!children.containsKey(c)) {
                children.put(c, new TrieNode());
            }
            children.get(c).cands.add(word);
            if (i == word.length() - 1) {
                children.get(c).isWord = true;
            }
            node = node.children.get(c);
        }
    }
    private TrieNode searchNode(String pre) {
        Map<Character, TrieNode> children = root.children;
        TrieNode node = root;
        for (int i = 0; i < pre.length(); i ++) {
            if (!children.containsKey(pre.charAt(i))) {
                return null;
            }
            node = children.get(pre.charAt(i));
            children = node.children;
        }
        return node;
    }

    public TrieNode getRoot() {
        return root;
    }
}
