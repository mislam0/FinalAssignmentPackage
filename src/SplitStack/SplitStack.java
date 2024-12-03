package SplitStack;

import java.util.*;

public class SplitStack {
    public static void splitStack(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> negStack = new Stack<>();
        Stack<Integer> posStack = new Stack<>();
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int n = queue.remove();
            if (n < 0) {
                negStack.push(n);
            } else {
                posStack.push(n);
            }
        }
        while (!negStack.isEmpty()) {
            stack.push(negStack.pop());
        }
        while (!posStack.isEmpty()) {
            stack.push(posStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        int[] test1 = {5, -5, 67, -45, 67, 9, 0, -42, 56, -7};
        for (int i = 0; i < test1.length; i++) {
            stack1.push(test1[i]);
        }
        System.out.println("Test 1 Before: " + stack1);
        splitStack(stack1);
        System.out.println("Test 1 After: " + stack1);
        Stack<Integer> stack2 = new Stack<>();
        int[] test2 = {1, -2, -3, 4, -5, 6, -7, 8, 9};
        for (int i = 0; i < test2.length; i++) {
            stack2.push(test2[i]);
        }
        System.out.println("\nTest 2 Before: " + stack2);
        splitStack(stack2);
        System.out.println("Test 2 After: " + stack2);
    }
}