/**
 * @return null
 *         left => right => root
 * @implSpec used to Delete a tree from leaf to root
 */
public class PostOrder {

    private void traverseTree(Node root) {
        traverseTree((root.left));
        traverseTree(root.right);
        System.out.println(root.data);
    }
}
