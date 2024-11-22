import java.util.ArrayList;

public class Node 
{
    char value;
    ArrayList<Node> childrens;
    ArrayList<Node> parent;

    private Node(Node father,char value)
    {
        this.value = value;
        childrens = new ArrayList<>();
        parent = new ArrayList<>(); parent.add(father);
    }

    public static Node newNode(Node father,char input)
    {
        return new Node(father,input);
    }
    public void addChildren(char input)
    {
        this.childrens.add(newNode(this,input));
    }

}
