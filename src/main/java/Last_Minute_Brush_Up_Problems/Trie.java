package Last_Minute_Brush_Up_Problems;

public class Trie {

    TrieNode root;

    Trie() {
        root = new TrieNode(' ');
    }


    public void insert(String word) {

        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            TrieNode temp = current.children[index];
            if (temp == null) {
                temp = new TrieNode(c);
                current.children[index] = temp;
            }

            current = temp;
        }

        current.isEndOfWord = true;
    }

    public boolean search(String word) {

        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            TrieNode temp = current.children[index];
            if (temp == null) {
                return false;
            }

            current = temp;
        }

        return current.isEndOfWord;
    }

    public boolean startsWith(String word) {

        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            TrieNode temp = current.children[index];
            if (temp == null) {
                return false;
            }

            current = temp;
        }

        return true;
    }


    public static void main(String[] args) {

        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("catapult");
        trie.insert("fan");
        trie.insert("cab");

        System.out.println("cab exists in trie ? " + trie.search("cak"));
        System.out.println("starts with ? " + trie.startsWith("caf"));
    }
}
