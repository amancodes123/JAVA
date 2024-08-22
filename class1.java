class student
{
    int rollno;
    String name;
    int marks;
}

public class class1{

    public static void main(String[] args) {
        

        student s1 = new student();
        s1.rollno = 1;
        s1.name = "Aman";
        s1.marks = 56;

        student s2= new student();
        s2.rollno = 12;
        s2.name = "Harsh";
        s2.marks = 536;

        student s3 = new student();
        s3.rollno = 31;
        s3.name = "raj";
        s3.marks = 356;

        student students[] = new student[3];
         students[0] = s1;
         students[1] = s2;
         students[2] = s3;

    //      for(int i=0; i<students.length;i++)
    //      {
    //         System.out.println(students[i].name+" : "+students[i].rollno);
    //      }
    // }
    
    for(student stud: students)
    {
       System.out.println(stud.name+" : "+stud.rollno);
    }
}
}