public class Stack {
    int stack[] = new int[168];
    int top = 0;
    public void push(int data){
        stack[top]= data;
        top++;

    }
}
