public class SuffixSum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int suffix[]=new int[a.length];
        suffix[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]+a[i];
        }
        for(int i:suffix){
            System.out.print(i+" ");
        }

    }
}
