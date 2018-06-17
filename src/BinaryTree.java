public class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTree(BinaryTreeNode root){
        this.root = root;
    }

    private void printPreorder() {
        //starte an der Wurzel
        printPreorder(root);
    }

    public void printPreorder(BinaryTreeNode tn){
        //Basisfall: leerer Teilbaum
        if (tn == null) {
            return;
        }

        //Gehe zum aktuellen Knoten
        System.out.println(tn.getEntry() + " ");
        //Gehe zum linken Kind Knoten
        System.out.println(tn.getLeftChild());
        //Gehe zum rechten Kind Knoten
        System.out.println(tn.getRightChild());
    }

    private void printPostorder() {
        //Basisfall Starte bei linkem Childknoten
        printInorder(root);
    }
    public void printPostorder(BinaryTreeNode tn){
        //Basisfall: leerer Teilbaum
        if (tn == null) {
            return;
        }
        //Gehe zum linken Kind Knoten
        System.out.println(tn.getLeftChild());
        //Gehe zum rechten Kind Knoten
        System.out.println(tn.getRightChild());
        //Gehe zum aktuellen Knoten
        System.out.println(tn.getEntry() + " ");

    }

    private void printInorder() {
        //Basisfall Starte bei linkem Childknoten
        printInorder(root);
    }
    public void printInorder(BinaryTreeNode tn){
        //Basisfall: leerer Teilbaum
        if (tn == null) {
            return;
        }
        System.out.println(tn.getLeftChild());
        //Gehe zum rechten Kind Knoten
        //Gehe zum aktuellen Knoten
        System.out.println(tn.getEntry() + " ");
        //Gehe zum linken Kind Knoten
        System.out.println(tn.getRightChild());
    }

    public boolean contains(int x){
        return contains(root, x);
    }

    private boolean contains(BinaryTreeNode tn, int x){
        //Basisfall 1: leerer Unterbaum
        if (tn == null) {
            return false;
        }

        //suche in Preorder
        //Vergleiche mit aktuellem Wert
        if (tn.getEntry() == x) {
            //Basisfall 2: Wert x gefunden
            return true;
        }

        //Suche im linken und rechten Kinderknoten
        return contains(tn.getLeftChild(), x) || contains(tn.getRightChild(), x);

    }


}
