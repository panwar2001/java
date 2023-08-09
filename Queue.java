//front(deletion) & rear(addition)

import java.util.Queue;
import java.util.LinkedList;
public class QUEUE{
    public static void main(String args[]){
      Queue<Integer> que=new LinkedList<>();
      que.offer(12); //insert into the queue
      que.offer(14);
      que.offer(15);
      System.out.println(que);
      System.out.println(que.poll()); //removes the element from the queue
      System.out.println(que);   
      System.out.println(que.peek());// get the front element of queue
      System.out.println(que);
    }
}