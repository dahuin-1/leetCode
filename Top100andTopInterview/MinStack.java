package Top100andTopInterview;

import java.util.ArrayList;

public class MinStack {

    ArrayList<Integer> stack;

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(5);
        obj.push(6);
        obj.push(7);
    }
    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        //int stackSize = stack.size();
        if(stack.isEmpty()) {
            stack.add(val);
        }else{
           // stack = new ArrayList<>(stack.size()+1);
            int stackSize = stack.size();
            System.out.println("stack size - 1 = " + stackSize);
            stack.size() = stackSize + 1;
            stack.add(0,val);
            stack.
        }
        System.out.println(stack);
    }



    public void pop() {

    }

    public int top() {
return 1;
    }

    public int getMin() {
return 0;
    }
}
