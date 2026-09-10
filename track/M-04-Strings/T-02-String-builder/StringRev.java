
public class StringRev {

    public static void main(String[] args) {
        String sb = "Java";
        char arr[] = sb.toCharArray();
        char newCharArray[] = new char[arr.length];
        int j = newCharArray.length - 1;
        for (int i = 0; i < arr.length; i++) {
            newCharArray[j] = arr[i];
            j--;
        }
        String revStr = new String(newCharArray);
        System.out.println(revStr);
    }
}
