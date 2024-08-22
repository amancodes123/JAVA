
// Polymorphism  -> 1.compile time  = overloading 
//                  2.Run time  = overridding

class A{
public void show(){
    System.out.println("in A Show");
}
}
class B extends A{
    public void show(){
        System.out.println("in B  Show");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
