import java.util.ArrayList;

public class Tree
{
    ArrayList<Node> father;


    protected void initialize(String s)
    {
        father = new ArrayList<>(); father.add(Node.newNode(null,s.charAt(0)));
        for (int i = 1; i < s.length(); i++)
            father.childrens.add(new Node(s.charAt(i)));

    }

    protected void add(String s)
    {
        father.childrens.add(new Node(s));
    }
    
    protected void print()
    {
        StringBuilder tree = new StringBuilder();
        Node aux = father;
        while (true)
        {
            tree = new StringBuilder(String.format("%s %s", tree, aux.value));
        }
    }
}

