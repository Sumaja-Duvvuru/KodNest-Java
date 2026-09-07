public class swaping {
    public static void main(String[] args) {//two-pointer with temp
        int a[]={10,20,30,40,50};
        int left=0;
        int right=a.length-1;
        while(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        for(int i:a){
            System.out.println(i+" ");
        }
        
    }
    
}
