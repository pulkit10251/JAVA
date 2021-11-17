package HEAP;

import java.util.HashMap;

public class Trie {
    private class TrieNode {
        char data;
        HashMap<Character, TrieNode> children;
        boolean IsTerminal;

        TrieNode(char data, boolean IsTerminal) {
            this.data = data;
            this.IsTerminal = IsTerminal;
            this.children = new HashMap<>();
        }
    }

        private int numWords;
        private TrieNode root;

        Trie(){
            this.root = new TrieNode('\0', false);
            this.numWords = 0;
        }

        public int numWords() {
            return this.numWords;
        }

    public void addWord(String word) {
        this.addWord(this.root, word);
    }

    private void addWord(TrieNode parent, String word) {
        if (word.length() == 0) {
            if (parent.IsTerminal) {

            } else {
                parent.IsTerminal = true;
                this.numWords++;
            }
            return;
        }
        char cc = word.charAt(0);
        String ros = word.substring(1);
        TrieNode child = parent.children.get(cc);
        if (child == null) {
            child = new TrieNode(cc, false);
            parent.children.put(cc, child);
        }
        this.addWord(child, ros);
    }
}
