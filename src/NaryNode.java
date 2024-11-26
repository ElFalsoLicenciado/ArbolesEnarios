import java.util.HashMap;
import java.util.Map;

class NaryNode {
    String value;
    Map<String, NaryNode> children;
    boolean isEndOfWord;

    public NaryNode(String value) {
        this.value = value;
        this.children = new HashMap<>();
        this.isEndOfWord = false;
    }
}