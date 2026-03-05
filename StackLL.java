import java.util.Scanner;
import java.util.Stack;
class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}

public class StackLL{

    Node top = null;

    void push(int val){
        Node newNode = new Node(val);

        newNode.next = top;
        top = newNode;
    }

    int pop(){
        if(top == null){
            System.out.println("Underflow");
            return -1;
        }

        int temp = top.data;
        top = top.next;
        return temp;
    }

    int peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    int isEmpty(){
        if(top == null){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args){

        StackLL stck = new StackLL();

        stck.push(5);
        stck.push(1);
        stck.push(9);

        System.out.println(stck.pop());
        System.out.println(stck.isEmpty());
        System.out.println(stck.peek());
    }
}