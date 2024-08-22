class calc {

    public int add(int n1 , int n2)
    {
        int result = n1+n2;
        return result;
    }
    public int add(int n1 , int n2,int n3)
    {
        int result = n1+n2+n3;
        return result;
    }
    
}

public class demo {
    public static void main(String[] args) {
        
        calc obj1 = new calc();
        int result = obj1.add(4,5);
        System.out.println(result);
        int resl = obj1.add(4,5,2);
        System.out.println(resl);
    }
    
}
