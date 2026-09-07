import java.util.*;
public class Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4};
        int b[]=new int[a.length+1];
        int element=sc.nextInt();
        for(int i=0;i<a.length;i++){
                b[i]=a[i];
        }
        b[b.length-1]=element;
        for(int i:b){
            System.out.println(i+" ");
        }
    }
}