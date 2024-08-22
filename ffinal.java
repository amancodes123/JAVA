
//final - variable, method , class

final class Calc
{
    public final  void show()
{
    System.out.println("in Calc Show");
}
public void add(int a, int b)
{
    System.out.println(a+b);
}
}

public class ffinal {
    public static void main(String[] args) {
        final int num = 8;
        System.out.println(num);

        Calc obj = new Calc();
        obj.show();
        obj.add(2, 5);
    }
}
