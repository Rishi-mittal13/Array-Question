package Tree;

import java.util.*;
public class BinaryTree {
    public class Node {
        int data;
        Node left;
        Node right;
    }
    Node root;
    public BinaryTree(){
        root = createTree();
    }
    Scanner sc = new Scanner(System.in);
    private Node createTree(){
        int item=  sc.nextInt();
        Node n =  new Node();
        n.data =  item;
        boolean hasLeft =  sc.nextBoolean();
        if(hasLeft) n.left =  createTree();
        boolean hasRight =  sc.nextBoolean();
        if(hasRight) n.right =  createTree();
        return n;
    }
    public static void display(Node root){
        if(root==null)  return ;
        String s = "<--"+root.data+"-->";
        if(root.left!=null) s = root.left.data + s;
        else s= "."+s;
        if(root.right!=null) s = s+ root.right.data;
        else s = s + ".";
        System.out.println(s);
        display(root.left);
        display(root.right);
    }
    public int max() { return max(root); }
    private static int max(Node n){
        if(n==null)  return Integer.MIN_VALUE;
        int left =  max(n.left);
        int right =  max(n.right);
        return Math.max(n.data ,  Math.max(left ,  right));
    }
    public  boolean find(int item){ return find(root ,  item); }
    private static boolean find(Node n ,  int item){
        if(n==null)  return false;
        if(n.data == item) return true ;
        boolean a = find(n.left ,  item);
        boolean b = find(n.right ,  item);
        return (a||b);
    }

    //height of tree .

    public int ht(){return ht(root) ; }
    private int ht(Node n){
        if(n==null)  return 0; // if return -1 than height of single node is 0 .  if we return 0 than height
        // of single node is 1 .
        int lh = ht(n.left);
        int rh = ht(n.right);
        return Math.max(lh ,  rh)+1;
    }

    //traverse Techniques :- PreOrder ,  PostOrder ,  InOrder .

    //1). preorder traversal :- root , left , right .
    private void preorder(Node n){
        if(n==null)  return ;
        System.out.print(n.data + " ");
        preorder(n.left);
        preorder(n.right);
    }
    public void preorder(){
        preorder(root);
    }

    //2).  post order :-  left , right , root .

    private  void postorder(Node n){
        if(n==null)  return ;
        preorder(n.left);
        preorder(n.right);
        System.out.print(n.data + " ");
    }
    public void postorder(){
        postorder(root);
    }

    //3) . inorder traverse :-  left ,  root , right .
    private  void inorder(Node n){
        if(n==null)  return ;
        inorder(n.left);
        System.out.print(n.data + " ");
        inorder(n.right);
    }

    public void inorder(){
        inorder(root);
    }

    //4) . level order traversal : -
    private void levelord(Node n){
        Queue<Node> nq =  new LinkedList<>();
        nq.offer(n);
        while(!nq.isEmpty()){
            int len  = nq.size();
            for(int i = 0 ;  i<len ; i++){
                if(nq.peek().left!=null) nq.offer(nq.peek().left);
                if(nq.peek().right!=null) nq.offer(nq.peek().right);
                System.out.print(nq.poll().data + " ");
            }
        }
    }

    public void levelord(){
        levelord(root);
    }

    public static void main(String[] args) {
       
    }
}
