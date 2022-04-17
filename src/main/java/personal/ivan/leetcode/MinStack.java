package personal.ivan.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MinStack {
    //static ArrayList<Integer> lst = new ArrayList<>();
    //static int size;
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public MinStack() {
        //lst = new ArrayList<>();
        //size=0;
        st = new Stack<>();
        minStack= new Stack<>();
    }

    public void push(int val) {
        /*lst.add(val);
        size+=1;*/
        st.push(val);
        if(minStack.isEmpty())
        {
            minStack.push(val);
        }
        else
        {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {
        /*lst.remove(size-1);
        size-=1;*/
        st.pop();
        minStack.pop();
    }

    public int top() {
        //return lst.get(size-1);
        return st.peek();
    }

    public int getMin() {
        //return Collections.min(lst);
        return minStack.peek();
    }
}
