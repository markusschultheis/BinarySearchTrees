public class TestBinaryTree {

    public static void main(String[] args){

        //Aufgabe 36.4-1
        /**
         *                (7)
         *               /  \
         *              /    \
         *             /      \
         *           (2)      (1)
         *          /   \    /   \
         *         (9) (6)  (4)  (8)
         *               \
         *               (5)
         */

        BinaryTreeNode a = new BinaryTreeNode(6,null, new BinaryTreeNode(5));
        BinaryTreeNode b = new BinaryTreeNode(2, new BinaryTreeNode(9), a);
        BinaryTreeNode c = new BinaryTreeNode(1, new BinaryTreeNode(4), new BinaryTreeNode(8));
        BinaryTreeNode d = new BinaryTreeNode(7, b, c);
        BinaryTree t = new BinaryTree(d);


        System.out.println(t.contains(5));

    }
}
