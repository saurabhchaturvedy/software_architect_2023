package Last_Minute_Brush_Up_Problems;

public class TrieNode {

    TrieNode[]children;
    boolean isEndOfWord;
    char c;

    TrieNode(char c)
    {
        this.children = new TrieNode[26];
        this.isEndOfWord = false;
        this.c=c;
    }
}
