package Udemy.Trees.BinarySearchTree;


public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public void insert(int value) {
        //to handle duplicate values, not allow them
        if (value == data) {
            return;
        }

        if (value < data) { //checking to see if we go down to the left
            if (leftChild == null) { //if the node doesn't have a left subtree
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value); //call again to go down another level
            }
        } else { //then go down right subtree
            if (rightChild == null) { //same as before but right subtree
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }

    }

    public void transverseInOrder() {
        if (leftChild != null) {
            leftChild.transverseInOrder();
        }
        System.out.print(data + ", ");
        if (rightChild != null) {
            rightChild.transverseInOrder();
        }
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
