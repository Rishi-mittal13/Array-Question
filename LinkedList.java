import java.util.Scanner;
//1). creating a node class
class Node<T>{
    T data;
    Node next;
    Node(T data){
        this.data = data;
        next = null;
    }
}

class LinkList {
//2).creating a fxn to print all node in LL.
    public static void printLL(Node<Integer> n){
        Node<Integer> head = n;
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("Null\n");
    }
    
//3). creating a fxn to take input of LL.
    public static Node<Integer> 
    takeInput(){
        Node<Integer> head = null , tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while(data != -1){
            Node<Integer> newnode = new 
            Node<Integer>(data);
            if(head == null){
            head = newnode;
            tail = newnode;}
            else{
                tail.next = newnode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }
    
//4).creating a fxn to give length of LL.
    public static int getLen(Node<Integer> head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
 
//5).creating a fxn to give middle element of LL.
    public static int middlePoint(Node<Integer> head) {
        int len = getLen(head);
        len = (len-1)/2;
        while(len != 0){
            head = head.next;
            len--;
        }
        return (int)head.data;
        
    }
    
    
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printLL(head);
        System.out.println("length = " + getLen(head));
        System.out.println("middle element = "+ middlePoint(head));  
    }
}
