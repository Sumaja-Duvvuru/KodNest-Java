public class PrefixSum{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int prefix[]=new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<a.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        for(int i:prefix){
            System.out.print(i+" ");
        }
    }
}