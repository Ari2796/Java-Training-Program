

class Node2 {
    int data;
    Node2 left, right;

    public Node2(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree_Without_Collection {
    Node2 root;

    Node2 insert(Node2 node2, int key) {
        if (node2 == null) {
            return new Node2(key);
        }

        if (node2.left == null) {
            node2.left = new Node2(key);
        } else if (node2.right == null) {
            node2.right = new Node2(key);
        } else {
            node2.left = insert(node2.left, key);
        }

        return node2;
    }

    void preorder(Node2 node2) {
        if (node2 == null)
            return;
        System.out.print(node2.data + " ");
        preorder(node2.left);
        preorder(node2.right);
    }

    void inorder(Node2 node2) {
        if (node2 == null)
            return;
        inorder(node2.left);
        System.out.print(node2.data + " ");
        inorder(node2.right);
    }

    void postorder(Node2 node2) {
        if (node2 == null)
            return;
        postorder(node2.left);
        postorder(node2.right);
        System.out.print(node2.data + " ");
    }

    int countNodes(Node2 node2) {
        if (node2 == null)
            return 0;
        return 1 + countNodes(node2.left) + countNodes(node2.right);
    }

    public static void main(String[] args) {
        BinaryTree_Without_Collection tree = new BinaryTree_Without_Collection();
        int[] arr = {1, 2, 3, 4, 5};
        for (int val : arr) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.println("Preorder traversal:");
        tree.preorder(tree.root);

        System.out.println("\nInorder traversal:");
        tree.inorder(tree.root);

        System.out.println("\nPostorder traversal:");
        tree.postorder(tree.root);

        int totalNodes = tree.countNodes(tree.root);
        System.out.println("\nTotal number of nodes: " + totalNodes);
    }
}
