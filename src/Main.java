public class Main {
    public static void main(String[] args) {

        FamilyTree ft = new FamilyTree();

        ft.addElement("Ege","Zeynep",21,null);
        ft.addElement("Selin","Zeynep",51,null);
        ft.addElement("Zeynep",null,31,null);
        ft.addElement("Cemre","Selin",3,null);
        ft.addElement("Halil","Selin",11,null);
        ft.buildTree(ft.root);
        ft.printTree(ft.root,0);
    }
}
