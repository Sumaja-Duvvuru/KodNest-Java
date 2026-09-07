import java.util.*;
public class ArrayRotation2 {//clock-Wise
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int temp=a[a.length-1];
        for(int i=a.length-1;i>0;i--){
           a[i]=a[i-1]; 
        }
        a[0]=temp;
        for(int i:a){
            System.out.println(i+" ");
        }
    }
}
