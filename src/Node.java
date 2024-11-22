import java.util.ArrayList;

public class Node 
{
    String value;
    ArrayList<Node> childrens;

    Node(String data)
    {
        value = data;
        childrens = new ArrayList<>();
    }


}
