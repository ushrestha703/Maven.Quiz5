package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {

    private Stack<SomeType> stack;

    public MyStack() {
        //throw new UnsupportedOperationException("Method not yet implemented");
        stack = new Stack<>();
    }

    public Boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(SomeType i) {
        stack.push(i);
    }

    public SomeType peek() {
        //throw new UnsupportedOperationException("Method not yet implemented");
        if (isEmpty()) {
            return null;
        } else {
            return stack.peek();
        }
    }

    public SomeType pop() {
        return stack.pop();
    }

    @Override
    public Iterator iterator() {
        return stack.iterator();
    }
}
