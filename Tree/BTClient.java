package Tree;
public class BTClient {
    public static void main(String[] args) {
        BinaryTree  bt =  new BinaryTree();
        //10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
        bt.display(bt.root);
        System.out.println("\n max element in tree :- " + bt.max());
        System.out.println("\n"+bt.find(20));
        System.out.println("\n maximum height of tree :- " + bt.ht());
        System.out.print("\n preorder traversal :- " );
        bt.preorder();
        System.out.print("\n postorder traversal :- " );
        bt.postorder();
        System.out.print("\n inorder traversal :- " );
        bt.inorder();
        System.out.print("\n level order traversal :- " );
        bt.levelord();
    }
}
