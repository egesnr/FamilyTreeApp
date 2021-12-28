import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Node {
    String name;
    String motherName;
    int age;
    //int depth;
    List<Node> subNode;
    String spouse;
    public Node(String name,String motherName,int age,String spouse){
        this.name = name;
        this.age = age;
        this.spouse = spouse;
        this.motherName = motherName;
    }


}
