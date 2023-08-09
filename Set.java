import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Objects;
public class SET{
    public static void main(String args[]){
       Set<Integer> set=new HashSet<>(); //O(1)
    //     Set<Integer> set=new LinkedHashSet<>();//order of elements is same as they were inserted
    //      Set<Integer> set=new TreeSet<>();//O(logn) operation 
        
        set.add(6);
        set.add(6);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(5);
        set.add(3);
        System.out.println(set);
        set.remove(100);//To remove an element from the set
        System.out.println(set.contains(5));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        Stud();        
    }
    public static void Stud(){
      System.out.println("Student set demonstration");      
      Set<Student>set=new HashSet<>(); 
      set.add(new Student("ayush",23));
      set.add(new Student("ayush",22));
      set.add(new Student("ayush",23));
      set.add(new Student("ayush",22));
      set.add(new Student("ayush",24));
      System.out.println(set);

      Student s1=new Student("panwar2001",25);
      Student s2=new Student("panwar2001",25);
      System.out.println(s1==s2);
      System.out.println(s1.equals(s2));
    }
}
 class Student{
    String name;
    int rollNo;
    public Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    @Override
    public String toString(){
        return "Student{name="+name+",rollNo="+rollNo+"}";
    }
    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(o==null || getClass()!=o.getClass())return false;
        Student student=(Student) o;
        return rollNo==student.rollNo ;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name+rollNo);
    }
}
