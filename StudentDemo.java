class Student
{
    int rno;
    String name;
    Student(int num,String sname) {
        rno=num;
        name=sname;
    }

void display()
    {
        System.out.println(rno+"\t"+name);
    }
}
class StudentDemo
{
    public static void main(String[] args) {
        Student S1= new Student(1,"karthik");
        S1.display();
    }
}