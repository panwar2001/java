import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;
public class Collection{
    public static void main(String args[]){
        List<Student> list=new ArrayList<>();
        list.add(new Student("Ayush",34));
        list.add(new Student("panwar",24));
        list.add(new Student("panwar2001",44));
        System.out.println(list);
        Collections.sort(list,(a,b)->a.rollNo-b.rollNo);
        System.out.println(list);
    }
}
public class Student{
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
