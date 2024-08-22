class class_object {
    int a = 12;
    String name ="Aman";
    public static void main(String[] args) {
    // declare the variable
    //create the object
    int num = 9; // primitive
    class_object obj1 = new class_object(); // reference
    class_object obj2 = new class_object();
    System.out.println(obj1.name);
    System.out.println(obj1.a);
        
    obj2.name= "Navin";
    System.out.println(obj2.name);
    System.out.println(obj2.a);
}
    
}