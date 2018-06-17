public class BinarySearchTree {

    private BinaryTreeNode root;

     public void add(int x){
        //wenn der Baum leer ist wird das erste Element als wurzel gespeichert
        //Basisfall
        if (root == null){
            root = new BinaryTreeNode(x);
        } else {
            add(root, x);
        }
    }

    private void add(BinaryTreeNode tn, int x){
        //Der einzufügende Wert wird mit der Wurzel verglichen un dann
        // entschieden ob links oder rechts in einem freien Platz gespeichert wird
        if (x < tn.getEntry()) {
            if (tn.getLeftChild() == null){
                tn.setLeftChild(new BinaryTreeNode(x));
            } else {
                add(tn.getLeftChild(), x);
            }
        } else {
            if (tn.getRightChild() == null){
                tn.setRightChild(new BinaryTreeNode(x));
            } else {
                add(tn.getRightChild(), x);
            }
        }

    }

    public boolean contains(int x){
        return contains(root, x);
    }

    private boolean contains(BinaryTreeNode tn, int x){
        //Basisfall 1
        if (tn == null){
            return false;
        }

        //Basisfall 2
        if (tn.getEntry() == x){
            return true;
        }

        if (x < tn.getEntry()){
            return contains(tn.getLeftChild(), x);
        } else {
            return contains(tn.getRightChild(), x);
        }

    }
    public void printInorder(){
        printInorder(root);
    }

    private void printInorder(BinaryTreeNode tn){
        //Basisfall
        if (tn == null){
            return;
        }

        printInorder(tn.getLeftChild());
        System.out.println(tn.getEntry() + " ");
        printInorder(tn.getRightChild());
    }







}
