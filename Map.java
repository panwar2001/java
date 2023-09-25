import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
public class MAP{
    public static void main(String args[]){
       Map<String,Integer> numbers=new HashMap<>();
        // Map<String,Integer> numbers=new TreeMap<>(); //Binary search tree(keys are in sorted order)
        
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        System.out.println(numbers);
        if(!numbers.containsKey("Four")){
            numbers.put("Four",4);
        }
        numbers.putIfAbsent("Five",5);
        System.out.println(numbers);

        System.out.println(numbers.containsKey("Three"));
        System.out.println(numbers.containsValue(3));
        System.out.println(numbers.isEmpty());
        numbers.remove("Two");
        System.out.println(numbers);
        System.out.println(numbers.get("One"));
        
    }
}