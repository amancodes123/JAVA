class Calc{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }

    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}
class AdvCalc extends Calc
{
    public int multi(int n1,int n2)
    {
          return n1*n2;
    }
    public int div(int n1,int n2)
    {
          return n1/n2;
    }
}
class VeryAdvCalc extends AdvCalc
{

    public double power(int n1 , int n2){
        return Math.pow(n1, n2);
    }
}


public class inheritance {
 public static void main(String[] args) {
    Calc obj = new Calc();
    int r1 = obj.add(4,7);
    int r2 = obj.sub(7,3);

    System.out.println(r1 + " "+ r2);
    AdvCalc ob = new AdvCalc();
    System.out.println(ob.add(2,3));
    System.out.println(ob.sub(12,3));
    System.out.println(ob.multi(2,3));
    System.out.println(ob.div(2,3));

    VeryAdvCalc ob1 = new VeryAdvCalc();
    System.out.println(ob1.power(2,3));
 }   
}
