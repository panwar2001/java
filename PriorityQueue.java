import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQ{
    public static void main(String args[]){
        Queue<Integer>pq=new PriorityQueue<>();  //By default priority queue is a min heap
        pq.offer(44); //push element to the priority queue
        pq.offer(12);
        pq.offer(60);
        pq.offer(100);
        System.out.println(pq); 
        System.out.println(pq.peek()); //print the top element of the queue
        System.out.println(pq.poll()); //remove the top element of the queue
        System.out.println(pq); //remove the top element of the queue        
    }
}