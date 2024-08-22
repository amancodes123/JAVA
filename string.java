public class string {
    public static void main(String[] args) {
        
        // String name = new String ("Aman");
        // String name1 = "Raj";

        // System.out.println(name);
        // System.out.println(name.charAt(3));
        // System.out.println("hello "+ name);
        // System.out.println(name.concat(" Bhivagde"));
        // System.out.println(name1);

        // String name = "naven";
        // name = name + " reddy";
        // System.out.println("hello "+ name);

        // String s1 = "Aman";
        // String s2 = "Aman";
        // System.out.println(s1 == s2);

        // Mutable string = change
        //String Buffer , String Builder -> Immutable string = unchange

        StringBuffer sb = new StringBuffer("Aman");
        // System.out.println(sb.capacity());      
        // System.out.println(sb.length());   
        sb.append(" Bhivgade");
        // sb.deleteCharAt(2);
        sb.insert(0, "Hello ");
        System.out.println(sb);

        //conversion of stringbuffer to string
        // String str = sb.toString();
        // System.out.println(str);
    }
} 
