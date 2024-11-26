import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Tree {
    private final NaryNode root;

    public Tree() {
        this.root = new NaryNode(""); // Root node represents the starting point of the tree
    }

    public void insert(String word) {
        NaryNode current = root;
        for (char letter : word.toCharArray()) {
            String key = String.valueOf(letter);
            current.children.putIfAbsent(key, new NaryNode(key));
            current = current.children.get(key);
        }
        current.isEndOfWord = true; // Mark the end of the word
    }

    public boolean search(String word) {
        NaryNode current = root;
        for (char letter : word.toCharArray()) {
            String key = String.valueOf(letter);
            if (!current.children.containsKey(key)) {
                return false;
            }
            current = current.children.get(key);
        }
        return current.isEndOfWord;
    }

    public boolean delete(String word) {
        return deleteRecursive(root, word, 0);
    }

    private boolean deleteRecursive(NaryNode node, String word, int depth) {
        if (depth == word.length()) {
            if (!node.isEndOfWord) {
                System.out.println("Word does not exist in the tree.");
                return false;
            }
            node.isEndOfWord = false;
            return node.children.isEmpty();
        }

        String letter = String.valueOf(word.charAt(depth));
        if (!node.children.containsKey(letter)) {
            return false;
        }

        boolean shouldDeleteChild = deleteRecursive(node.children.get(letter), word, depth + 1);

        if (shouldDeleteChild) {
            node.children.remove(letter);
            return node.children.isEmpty() && !node.isEndOfWord;
        }
        return false;
    }

    public void printTree() {
        if (root.children.isEmpty()) {
            System.out.println("The tree is empty.");
            return;
        }
        printRecursive(root, 0);
    }

    private void printRecursive(NaryNode node, int level) {
        String prefix = node.isEndOfWord ? "*-> " : "-> ";
        if (!node.value.isEmpty()) { // Skip printing the root value (empty string)
            System.out.println("    ".repeat(level) + prefix + node.value);
        }
        for (NaryNode child : node.children.values()) {
            printRecursive(child, level + 1);
        }
    }
}
