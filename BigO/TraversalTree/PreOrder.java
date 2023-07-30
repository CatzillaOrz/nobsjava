/**
 * @return
 * @apiNote used to Coyp of a tree
 *          root -> left => rigth
 * @traverse
 */
public class PreOrder {
    private void traverseTree(Node root) {
        System.out.println(root.data);
        traverseTree(root.left);
        traverseTree(root.right);
    }

}
