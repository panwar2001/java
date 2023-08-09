import java.util.ArrayDeque;
public class Deque{
 public static void main(String args[]){
    ArrayDeque<Integer> dq=new ArrayDeque<>();
    dq.offer(23);
    dq.offerFirst(50);
    dq.offerLast(80);
    System.out.println(dq);
    System.out.println(dq.peek());
    System.out.println(dq.peekFirst());
    System.out.println(dq.peekLast());
    
    System.out.println(dq.poll());
    System.out.println(dq);
    System.out.println(dq.pollFirst());
    System.out.println(dq.pollLast());
 }   
}