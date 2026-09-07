import java.util.*;
public class ArrayElementRemove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={10,20,30,40,50};
        int b[]=new int[a.length-1];
        int index=sc.nextInt();
        for(int i=0;i<index;i++){
            b[i]=a[i];
        }
        b[index]=a[index+1];
        for(int i=index+1;i<a.length;i++){
            b[i-1]=a[i];
        }
        for(int i:b){
            System.out.println(i+" ");
        }
    }
}
