public class tut9 {

    public static void main(String[] args) {

        Human obj = new Human();
        // obj.age = 11;
        // obj.name = "Aman";
        obj.setAge(20);
        obj.setName("Aman");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int n) {
        age = n;
    }

    public void setName(String a) {
        name = a;
    }

    public String getName() {
        return name;
    }
}
