package animesh.javacodes;

import java.util.Scanner;

class Stack {

    final int[] stack;
    int top;

    Stack(int size) {
        top = -1;
        stack = new int[size];
    }

    void push(int item) {
        if(top == stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = item;
        }
    }

    int pop() {
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else{
            return stack[top--];
        }
    }

    void display() {
        for(int i = stack.length-1; i > 0; i--) {
            System.out.println(stack[i]);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Stack Implementation");
        System.out.println("Enter Size of Stack : ");
        size = sc.nextInt();
        Stack stack1 = new Stack(size);
        System.out.println("Pushing Elements into Stack");
        for(int i = 0; i < size; i++) {
            stack1.push(i);
        }
        System.out.println("Stack After Push");
        stack1.display();
        System.out.println("Popping Elements from Stack");
        for(int i = 0; i < size; i++) {
            System.out.println("Element Popped : " + stack1.pop());
        }
        sc.close();
    }
}
