//static size stack
class StackIsEmpty extends Exception {
   
}
class StackIsFull extends Exception {
    
}
 class Stack1{
    //declaring private fields of stack.
    private int data[];
    private int top;
    
    //constructor for initializing stack 
    public Stack1(){
        data = new int[10];
        top = -1;
    }
    //constructor overloading.
    public Stack1(int capacity){
        data = new  int[capacity];
        top = -1;
    }
    
    //creating a fxn to determine whether our stack is empty or not.
    public boolean isEmpty(){
        return (top == -1);
    }
    
    //creating a fxn to return size of stack
    public int size(){
        return top+1;
    }
    
    //creating a fxn to view top of  stack.with Exception handling.
    public int top() throws StackIsEmpty{
        if(size() == 0){
            StackIsEmpty e = new  StackIsEmpty();
            throw e;
        }
        return data[top];
    }
    
    //creating push fxn to push element in Stack.
    public void push(int elem) throws StackIsFull{
        if(size() == data.length){
            StackIsFull e = new StackIsFull();
            throw e;
        }
        data[++top] = elem;
    }
    
    //creating a pop fxn to return top of stack element and move top downward.
    public int pop() throws StackIsEmpty{
        if(top == -1){
            StackIsEmpty e = new StackIsEmpty();
            throw e;
        }
        int temp = data[top];
        top--;
        return temp;
    }
}
class stackimp{
    public static void main(String[] args) throws StackIsEmpty , StackIsFull{
        Stack1 s  = new Stack1();
        for(int i = 5 ; i>0 ; i--){
            s.push(i);
        }
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.top()); 
        
    }
}







//Dynamic size Stack
class StackIsEmpty extends Exception {
   
}
class StackIsFull extends Exception {
    
}
 class Stack1{
    //declaring private fields of stack.
    private int data[];
    private int top;
    
    //constructor for initializing stack 
    public Stack1(){
        data = new int[10];
        top = -1;
    }
    //constructor overloading.
    public Stack1(int capacity){
        data = new  int[capacity];
        top = -1;
    }
    
    //creating a fxn to determine whether our stack is empty or not.
    public boolean isEmpty(){
        return (top == -1);
    }
    
    //creating a fxn to return size of stack
    public int size(){
        return top+1;
    }
    
    //creating a fxn to view top of  stack.with Exception handling.
    public int top() throws StackIsEmpty{
        if(size() == 0){
            StackIsEmpty e = new  StackIsEmpty();
            throw e;
        }
        return data[top];
    }
    
    //doubleCapacity fxn
    private void doubleCapacity(){
        int temp[] = data;
        data = new int[2*temp.length];
        for(int i = 0 ; i<=top ; i++){
            data[i] = temp[i];
        }
    } 
  
    //creating push fxn to push element in Stack.
    public void push(int elem){
        if(size() == data.length){
            doubleCapacity();
        }
        top++;
        data[top] = elem;
    }
    
    
    
    
    //creating a pop fxn to return top of stack element and move top downward.
    public int pop() throws StackIsEmpty{
        if(top == -1){
            StackIsEmpty e = new StackIsEmpty();
            throw e;
        }
        int temp = data[top];
        top--;
        return temp;
    }
}
class stackimp{
    public static void main(String[] args) throws StackIsEmpty , StackIsFull{
        Stack1 s  = new Stack1(5);
        for(int i = 20 ; i>0 ; i--){
            s.push(i);
        }
       while(!s.isEmpty()){
           System.out.println(s.pop());
       }
    }
}
