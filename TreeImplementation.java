package Tree;
import java.util.*;
public class TreeImplementation {
    
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    public Node buildTree(String[] arr) {
        if (arr.length == 0 || arr[0].isEmpty()) return null;

        Node root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            Node current = queue.poll();

            // Left child
            if (i < arr.length && !arr[i].isEmpty()) {
                current.left = new Node(Integer.parseInt(arr[i]));
                queue.add(current.left);
            }
            i++;

            // Right child
            if (i < arr.length && !arr[i].isEmpty()) {
                current.right = new Node(Integer.parseInt(arr[i]));
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    // Find min node by value
    public Node findMin(Node node) {
        if (node == null) return null;

        Node leftMin = findMin(node.left);
        Node rightMin = findMin(node.right);

        Node minNode = node;
        if (leftMin != null && leftMin.data < minNode.data) minNode = leftMin;
        if (rightMin != null && rightMin.data < minNode.data) minNode = rightMin;

        return minNode;
    }

    // Find max node by value
    public Node findMax(Node node) {
        if (node == null) return null;

        Node leftMax = findMax(node.left);
        Node rightMax = findMax(node.right);

        Node maxNode = node;
        if (leftMax != null && leftMax.data > maxNode.data) maxNode = leftMax;
        if (rightMax != null && rightMax.data > maxNode.data) maxNode = rightMax;

        return maxNode;
    }

    // Print children of a node
    public void printChildren(Node node) {
        String left = (node.left != null) ? String.valueOf(node.left.data) : "null";
        String right = (node.right != null) ? String.valueOf(node.right.data) : "null";
        System.out.println(left + " " + right);
    }

    // Test
    public static void main(String[] args) {
        TreeImplementation tree = new TreeImplementation();

        // Input array ("" means null)
        String[] arr = {"15","50","23","","34","51","2","4","5","6"};

        tree.root = tree.buildTree(arr);

        Node minNode = tree.findMin(tree.root);
        Node maxNode = tree.findMax(tree.root);

        System.out.print("Minimum node children : ");
        tree.printChildren(minNode);

        System.out.print("Maximum node children : ");
        tree.printChildren(maxNode);
    }
}
