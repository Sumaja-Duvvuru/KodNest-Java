public class ArrayRotation1 {
    public static void main(String[] args) {
        int a[]={12,23,34,45};
        int value=a[0];
        for(int i=1;i<a.length;i++){
                a[i-1]=a[i];
        }
        a[a.length-1]=value;
        for(int i:a){
            System.out.println(i+" ");
        }    
    }
    
}
