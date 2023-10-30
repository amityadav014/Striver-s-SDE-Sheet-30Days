//probem link : https://leetcode.com/problems/implement-stack-using-queues/description/

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

  private Queue<Integer> queue1;
  private Queue<Integer> queue2;
  private int topElement;

  public MyStack() {
    queue1 = new LinkedList<>();
    queue2 = new LinkedList<>();
  }

  public void push(int x) {
    queue1.add(x);
    topElement = x;
  }

  public int pop() {
    while (queue1.size() > 1) {
      topElement = queue1.remove();
      queue2.add(topElement);
    }
    int popValue = queue1.remove();
    Queue<Integer> temp = queue1;
    queue1 = queue2;
    queue2 = temp;
    return popValue;
  }

  public int top() {
    return topElement;
  }

  public boolean empty() {
    return queue1.isEmpty();
  }
}

// Example usage
public class Main {
  public static void main(String[] args) {
    MyStack stack = new MyStack();
    stack.push(1);
    stack.push(2);
    System.out.println(stack.top()); // Output: 2
    System.out.println(stack.pop()); // Output: 2
    System.out.println(stack.empty()); // Output: false
  }
}
