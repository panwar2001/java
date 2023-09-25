import java.util.Arrays;
public class Array{
    public static void main(String args[]){
        Integer nums[]={1,2,3,4,5,6,7,9};
        int index=Arrays.binarySearch(nums,9);
        System.out.println(index);        
        Arrays.sort(nums,(a,b)->a-b);
        for(int i:nums){
                System.out.print(i+" ");
        } 
        Arrays.fill(nums,0);
        for(int i:nums){
                System.out.print(i+" ");
        }

    }
}