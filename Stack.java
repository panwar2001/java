import java.util.Stack;
public class STACK{
    public static void main(String args[]){
       Stack<Integer> st=new Stack<>();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       System.out.println("stack is "+st);
       st.pop(); //pop top element 4 from the stack , after that top element will be  3
       System.out.println(st.peek()); //print top element of the stack
    }
}