public class Tree
{
    Node father;

    Tree() {
        father = new Node(JUtil.stringIn());
    }

    private void add()
    {
        father.childrens.add(new Node(JUtil.stringIn()));
    }
    
    private void print()
    {
        
    }
}

