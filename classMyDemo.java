class Student
{
    int rno;
    String name;
    Student(int rno,String name)
    {
        this.rno=rno;
        this.name=name;
    }
    void display()
    {
        System.out.println(rno + "\t" + name);
    }
    void show()
    {
         display();
    }
}

class MyDemo
    {
        public static void main(String[] args) 
        {
            Student S1 = new Student(1,"Naveen");
            S1.show();
            Student S2 = new Student (2,"kNaveen");
            S2.show();
        }
    }