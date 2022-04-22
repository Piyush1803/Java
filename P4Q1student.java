public class P4Q1student
{
    int roll_no;
    String name;
    public static void main (String[]args)
    {   
        P4Q1student s= new P4Q1student();
        s.name = "John";
        s.roll_no = 2;
        System.out.print("student name:" + s.name +"\n"+"student roll number:" + s.roll_no );
    }
}