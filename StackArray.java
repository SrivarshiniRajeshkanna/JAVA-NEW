import java.util.Scanner;
import java.util.Stack;

class StackArray{
    int size;
    int[] stack;
    int top = -1;

    StackArray(){
        size = 100;
        stack = new int[size];
    }
    void push(int data){
        if(top == size - 1){
            System.out.println("Overflow");
            return;
        }
        stack[++top] = data;
    }
    int pop(){
        if(top == -1){
            System.out.println("Underflow");
            return -1;
        }
        return stack[top--];
    }
    int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    int isEmpty(){
        if(top == -1){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args){
        StackArray stck = new StackArray();
        stck.push(5);
        stck.push(1);
        stck.push(9);
        System.out.println(stck.pop());
        System.out.println(stck.isEmpty());
        System.out.println(stck.peek());
    }
}