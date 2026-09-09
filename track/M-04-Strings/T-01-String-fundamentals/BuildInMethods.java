
public class BuildInMethods {

    public static void main(String[] args) {
        String str = "Kodnest Technologies";
        System.out.println(str);//Kodnest Technologies
        System.out.println(str.toLowerCase());//kodnest technologies
        System.out.println(str.toUpperCase());//KODNEST TECHNOLOGIES
        System.out.println(str.length());//19
        System.out.println(str.charAt(3));//n
        System.out.println(str.contains("Kodnest"));//true
        System.out.println(str.contains("KodNest"));//false
        System.out.println(str.startsWith("Kod"));//true
        System.out.println(str.startsWith("nest"));//false
        System.out.println(str.endsWith("ies"));//true
        System.out.println(str.endsWith("nes"));//false
        System.out.println(str.indexOf('K'));//0
        System.out.println(str.indexOf('n'));//2
        System.out.println(str.indexOf('z'));//-1
        System.out.println(str.lastIndexOf('n'));//13
        System.out.println(str.substring(5));//st Technologies
        System.out.println(str.substring(5, 10));//st Te
        System.out.println(str.replace('e', 'a'));//Kodnast Tachnologias
        String s1 = "";
        System.out.println(s1.isEmpty());//false
        System.out.println(s1.isBlank());//false
        String s2 = " ";
        System.out.println(s2.isEmpty());//false
        System.out.println(s2.isBlank());
        String s3 = "   java  ";
        System.out.println(s3.trim());

    }
}
