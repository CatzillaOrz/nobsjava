/**
 * @param null
 *
 *             left -> root -> right
 *             when use in the context of a binary search tree
 *
 *
 */
public class InOrder {
    private void traverseTree(Node root) {
        traverseTree((root.left));
        System.out.println(root.data);
        traverseTree(root.right);
    }
}
