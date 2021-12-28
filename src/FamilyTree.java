import java.util.*;

public class FamilyTree {
    Map<String, Node> Tree = new HashMap<>();

    Node root;

    void addElement(String name,String motherName,int age,String spouse){
       /* node1.name = name;
        node1.age = age;
        node1.spouse = spouse;
        node1.motherName = motherName; */
        Node node;
         node = new Node(name,motherName,age,spouse);
        if(node.motherName == null)
           root = node;
        Tree.put(node.name, node);
    }
    public List<Node> addSubNode(String name){
        List<Node> nodes = new ArrayList<Node>();
        for(Node n: Tree.values()){
            if(n.motherName == name){
                nodes.add(n);
            }
        }
        return nodes;
    }
     public void buildTree(Node root){
            Node node = root;
            List<Node> nodes = addSubNode(node.name);
            node.subNode = nodes;
            if(nodes.size()==0)
                return;
            for (Node n: nodes)
                buildTree(n);
     }

     public void printTree(Node root, int level){
        for(int i =0; i<level;i++)
            System.out.print("\t");
         System.out.println(root.name);
         List<Node> nodes = root.subNode;
         for(Node n: nodes)
             printTree(n,level+1);
     }

}
