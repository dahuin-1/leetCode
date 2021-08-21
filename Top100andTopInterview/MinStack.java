package Top100andTopInterview;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    List<List<Integer>> stack;

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(5);
        obj.push(6);
        obj.push(7);
        System.out.println(obj);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj);

    }
    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        //int stackSize = stack.size();
        List sublist = new ArrayList();
        //if(stack.isEmpty()) {
            sublist.add(val);
            stack.add(sublist);
      //  }else{
           // stack = new ArrayList<>(stack.size()+1);
           /* int stackSize = stack.size();
            System.out.println("stack size - 1 = " + stackSize);
            stack.add(stackSize + 1, stack.get(stackSize));*/
      //  }
       // System.out.println(stack);
    }


    public void pop() {
      // for(int i = stack.size()-1; i == 0; i--){
           stack.remove(stack.get(stack.size()-1));
     //  }
    }

    public int top() {
return 1;
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (List<Integer> list : stack) {
            if (min > list.get(0)) {
                min = list.get(0);
            }
            //System.out.println(min);
            //return min;
        }
        return min;
    }
}
