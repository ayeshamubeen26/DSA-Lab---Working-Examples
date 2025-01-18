class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    // Post-Order Traversal (Left, Right, Root)
    void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }
    void preOrder() {
        preOrderTraversal(root);
    }
    void inOrder() {
        inOrderTraversal(root);
    }
    void postOrder() {
        postOrderTraversal(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Pre-Order Traversal:");
        tree.preOrder();
        System.out.println();

        System.out.println("In-Order Traversal:");
        tree.inOrder();
        System.out.println();

        System.out.println("Post-Order Traversal:");
        tree.postOrder();
    }
}
