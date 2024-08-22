

class Mobile{
    String brand;
    int price;
     static String  name;

     static{
        name = "Phone"; 
        System.out.println("in static block");
     }

     public Mobile()
     {
        brand = "";
        price = 200;
        System.out.println("in constructor");
     }

    public void show(){
        System.out.println(brand +" : "+ price + " :  "+ name);
    }

     public static void show1(Mobile obj){
        System.out.println(obj.brand +" : "+ obj.price + " :  "+ name);
     }
}


public class sstatic {
    
    public static void main(String[] args)// throws ClassNotFoundException 
     {

       // Class.forName("Mobile");
        
        Mobile obj1 = new Mobile();
        obj1.brand= "Apple";
        obj1.price = 13000;
        Mobile.name = "SmartPhone";
      

        // Mobile obj2 = new Mobile();
        // obj2.brand= "Samsung";
        // obj2.price = 23000;
        // Mobile.name = "SmartPhone";

        // Mobile.name = "phone"; 

        // obj1.show();  
        // obj2.show();
        Mobile.show1(obj1); 
    }
}
